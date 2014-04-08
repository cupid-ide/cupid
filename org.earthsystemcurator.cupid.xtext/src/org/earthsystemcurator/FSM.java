package org.earthsystemcurator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.earthsystemcurator.cupidLanguage.Annotation;
import org.earthsystemcurator.cupidLanguage.ConceptDef;
import org.earthsystemcurator.cupidLanguage.CupidLanguageFactory;
import org.earthsystemcurator.cupidLanguage.Expr;
import org.earthsystemcurator.cupidLanguage.ImplicitContextMapping;
import org.earthsystemcurator.cupidLanguage.Language;
import org.earthsystemcurator.cupidLanguage.Mapping;
import org.earthsystemcurator.cupidLanguage.PathExpr;
import org.earthsystemcurator.cupidLanguage.PathExprTerm;
import org.earthsystemcurator.cupidLanguage.SubconceptOrAttribute;
import org.earthsystemcurator.generator.CupidLanguageGenerator;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.IASTNode;

@SuppressWarnings("restriction")
public class FSM<RootType extends EObject> {

	protected RootType root;
	protected EPackage pack;
	protected EFactory factory;
	protected IProject project;
	protected Language language;
	protected Class<?> transformationClass;
	protected Class<?> queryClass;
	
	protected CupidLanguageGenerator generator;
	protected Map<SubconceptOrAttribute, EStructuralFeature> cache;
	
	/**
	 * Mapping from a model element to one of:
	 *  - a Set<IFortranAST> (for top level)
	 *  - an IFortranAST (for file level elements, e.g., modules and programs)
	 *  - an IASTNode (for deeper elements)
	 *  
	 */	
	//private Map<Object, Object> mappings;	
	
	public FSM(Language language, IProject project, Class<?> queryClass, Class<?> transformations) {
		this.language = language;
		//this.root = root;
		//this.pack = root.eClass().getEPackage();
		//this.factory = this.pack.getEFactoryInstance();
		
		this.pack = EPackage.Registry.INSTANCE.getEPackage(language.getUri()); 
		if (this.pack == null) {
			throw new RuntimeException("No EPackage registered for language with URI: " + language.getUri());
		}
		
		this.factory = pack.getEFactoryInstance();
		
		//this.mappings = new IdentityHashMap<Object, Object>();
		this.project = project;
		this.transformationClass = transformations;
		this.queryClass = queryClass;
		this.cache = new HashMap<SubconceptOrAttribute, EStructuralFeature>();
		this.generator = new CupidLanguageGenerator();  //just used for "toClassName" methods
		
		//set project for code transformations, a bit of a hack
		try {
			Method m = transformationClass.getMethod("setProject", IProject.class);
			m.invoke(null, project);
		} catch (NoSuchMethodException | SecurityException e) {
			//e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}
	
	public RootType getRoot() {
		return root;
	}
	
	//public Map<Object, Object> getMappings() {
	//	return mappings;
	//}
	
	public Object getMapsTo(EObject modelElem) {
		if (modelElem==null) {
			return null;
		}
			
		EStructuralFeature esf = modelElem.eClass().getEStructuralFeature("mapsTo");
		return modelElem.eGet(esf);
		//return mappings.get(modelElem);
	}
	
	public void setMapsTo(EObject modelElem, Object value) {
		EStructuralFeature esf = modelElem.eClass().getEStructuralFeature("mapsTo");
		modelElem.eSet(esf, value);
	}
		
	public List<Diagnostic> getDiagnostics() {
		
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(root);		
		
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			if (diagnostic.getChildren().size() > 0) {
				return diagnostic.getChildren();
			}
			else {
				ArrayList<Diagnostic> al = new ArrayList<Diagnostic>();
				al.add(diagnostic);
				return al;
			}			
		}
	
		return new ArrayList<Diagnostic>();
	}
	
	private Method findTransformationMethod(String methodName, Object context, EObject mapping) {
		for (Method m : transformationClass.getMethods()) {
			if (m.getName().equalsIgnoreCase(methodName)) {
				Class<?> contextClass = m.getParameterTypes()[0];
				Class<?> mappingClass = m.getParameterTypes()[1];
				if (contextClass.isInstance(context) &&
					mappingClass.isInstance(mapping)) {
					return m;
				}
			}
		}
		return null;
	}
	
	protected void setDefaultValues(EObject o, ConceptDef conceptDef) {
		
		for (SubconceptOrAttribute soa : conceptDef.getChild()) {
			if (soa.isAttrib()) {
				String defaultVal = getAnnotationValue(soa, "default");
				if (defaultVal != null) {
					setOrAdd(o, soa, defaultVal);
				}
			}
		}
		
	}
	
	public EObject forwardAdd(EObject context, SubconceptOrAttribute soa, boolean recursive) {
		
		if (soa.isAttrib()) {
			throw new RuntimeException("forwardAdd should only be called with non-attribute subconcepts");
		}
		if (soa.isMustBeNull()) {
			throw new RuntimeException("forwardAdd should not be called with a subconcept that must be null");
		}
		
		//create new element and add to the model
		EClass type = getEClass(soa);
		EObject newElem = factory.create(type);
		
		//set default values of attributes
		setDefaultValues(newElem, getDefinition(soa));
		
		//add to context element
		setOrAdd(context, soa, newElem);
		
		Mapping mapping = getMappingQuery(soa);
		
		if (mapping != null) {	
		
			mapping.setMapping((ImplicitContextMapping) replacePathExprWithValues(mapping.getMapping(), newElem, false));
			Object explicitContextFortranElement = null;
			EObject contextElement = null;
			
			if (mapping.getContext() != null) {
				//explicit context
				try {
					contextElement = getValueFromModel(mapping.getContext(), newElem, true);
				} catch (PathExprNotFoundException e) {
					e.printStackTrace();
					//will fail below
				}
				explicitContextFortranElement = getMapsTo(contextElement); 						
			}
			else {
				contextElement = context;
				explicitContextFortranElement = getMapsTo(context);
			}
			
			if (explicitContextFortranElement == null) {
				throw new RuntimeException("Could not find context Fortran element");
			}
			
			Object newFortranElem = executeMappingTransformation(contextElement, mapping.getMapping(), explicitContextFortranElement, getDefinition(soa).getAnnotation());	
				
			if (newFortranElem == null) {
				throw new RuntimeException("AST element returned from transformation is NULL");
			}
			
					
			setMapsTo(newElem, newFortranElem);
		
		}
		
		else {
			//no mapping defined
			setMapsTo(newElem, getMapsTo(context));		
		}
		
			
		//recursively add child elements
		if (recursive) {
			for (SubconceptOrAttribute soaChild : getDefinition(soa).getChild()) {
				if (soaChild.isAttrib()) {
					forwardAddAttribute(newElem, soaChild);				
				}
				else if (!soaChild.isMustBeNull()){
					forwardAdd(newElem, soaChild, recursive);		
				}
			}
		}
		
		return newElem;
		
	}
	
	/**
	 * Adds a new structural feature element to the FSM and updates the associated AST.
	 * A new EObject is created and the new Fortran constructs are added to the AST
	 * according to the mapping of the subconcept.
	 * 
	 * This method does not write out the modified AST, so no change will 
	 * be visible in the editor after this method completes.
	 * 
	 * @param context
	 * @param eref
	 * @param recursive
	 * @return the EObject created
	 */
	/*
	@SuppressWarnings("unchecked")
	public EObject forwardAdd_OLD(EObject context, EReference eref, boolean recursive) {
		
		//create new element and add to the model
		EClass type = (EClass) eref.getEType();
		EObject newElem = factory.create(type);
				
		if (eref.isMany()) {
			@SuppressWarnings("rawtypes")
			EList sf = (EList) context.eGet(eref);
			sf.add(newElem);
		}
		else {
			context.eSet(eref, newElem);
		}
		
		//NEW MAPPING
		
		EAnnotation ann = eref.getEAnnotation("http://www.earthsystemcog.org/projects/nuopc");
		if (ann != null && ann.getDetails().get("mappingNew") != null) {
			String mappingNew = ann.getDetails().get("mappingNew");
			
			Mapping mapping = null; //ReverseEngineer.parseMappingNew(mappingNew);
			Object fortranContextElem;
			
			if (mapping.getContext() != null) {
				//explicit context
				EObject contextElement = null;
				try {
					contextElement = getValueFromModel(mapping.getContext(), context, true);
				} catch (PathExprNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fortranContextElem = getMapsTo(contextElement); //getMappings().get(contextElement);
				if (fortranContextElem == null) {
					throw new RuntimeException("No Fortran context for element: " + contextElement);
				}
			}
			else {
				fortranContextElem = getMapsTo(context); //getMappings().get(context);  //implicit
			}
			
			ImplicitContextMapping icMapping = mapping.getMapping();
			icMapping = null; //ReverseEngineer.replacePathExprWithValues(icMapping, newElem, false);
			
			String methodName = icMapping.eClass().getName().toLowerCase();
			
			//find method that implements code query
			Method method = findFEMethod(methodName, fortranContextElem, icMapping);
			if (method == null) {
				System.out.println("Method not found: " + methodName);
				return null;
			}
			
			Object newFortranElem = null;
			try {
				newFortranElem = method.invoke(null, fortranContextElem, icMapping);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				//most likely a syntax error - TODO: deal with this gracefully
				e.printStackTrace();
			}				
			
			if (newFortranElem == null) {
				System.out.println("Warning: returned Fortran elements is null");
			}
			
			//add to mappings
			//getMappings().put(newElem, newFortranElem);
			setMapsTo(newElem, newFortranElem);
		}
			
		//recursively add child elements
		if (recursive) {
			
			//handle EAttributes
			for (EAttribute childAtt : type.getEAttributes()) {
				//if (Regex.getIsEssentialFromAnnotation(childAtt) || 
				//				Regex.getMappingTypeFromAnnotation(childRef) == null) {
					forwardAdd(newElem, childAtt);				
				//}
			}
			
			//handle EReferences
			for (EReference childRef : type.getEReferences()) {
				if (childRef.isContainment()) {// && TODO: fixme
						//(Regex.getIsEssentialFromAnnotation(childRef) || 
							//	Regex.getMappingTypeFromAnnotation(childRef) == null)) {
					forwardAdd(newElem, childRef, recursive);				
				}
			}
		}
		
		return newElem;
		
	}
	*/
	
	/**
	 * Updates the associated AST based on the value of the EAttribute.
	 * 
	 * This method does not write out the modified AST, so no change will 
	 * be visible in the editor after this method completes.
	 * 
	 * @param context the EObject containing the attribute
	 * @param eatt the EAttribute used to update the AST
	 * @return the value of the EAttribute
	 * 
	 */
		
	public Object forwardAddAttribute(EObject context, SubconceptOrAttribute soa) {

		if (!soa.isAttrib()) {
			throw new RuntimeException("forwardAddAttribute requires an attribute subconcept");
		}
		
		Mapping mapping = getMappingQuery(soa);
		
		if (mapping != null) {
			mapping.setMapping((ImplicitContextMapping) replacePathExprWithValues(mapping.getMapping(), context, true));
			Object explicitContextFortranElement = null;
			EObject contextElement = null;
			
			if (mapping.getContext() != null) {
				//explicit context
				
				try {
					contextElement = getValueFromModel(mapping.getContext(), context, true);
				} catch (PathExprNotFoundException e) {
					e.printStackTrace();
					//will fail below
				}
				explicitContextFortranElement = getMapsTo(contextElement); 						
			}
			else {
				contextElement = context;
				explicitContextFortranElement = getMapsTo(context);
			}
			
			if (explicitContextFortranElement == null) {
				throw new RuntimeException("Could not find context Fortran element");
			}
				
			//EObject newElem = (EObject) context.eGet(eatt);
		
			//get current value, which may have been set by a default
			String curValue = (String) getValue(context, soa);
			
			List<Annotation> anots = null;
			if (getDefinition(soa)!=null) {
				anots = getDefinition(soa).getAnnotation();
			}
			//try {
			Object newFortranElem = executeMappingTransformation(contextElement, mapping.getMapping(), explicitContextFortranElement, anots, curValue);	
			//}
			//catch (NullPointerException npe) {
			//	System.out.println("blag");	
			//}
			
			//if (newFortranElem == null) {
			//	throw new RuntimeException("Transformation of attribute returned NULL AST element");
			//}
			
			//if (newFortranElem != null) {
				//for now, assume return is new context element, but will not be true in general
				//setMapsTo(context, newFortranElem);
			//}
		
		}	
		else {
			//method may be null if there is no Fortran mapping for the element
			//in this case the new model element maps to the context fortran element
			//getMappings().put(newElem, contextFortranElem);
			//setMapsTo(newElem, contextFortranElem);
		}
		
		return context;

	}
	
	
	/**
	 * Reverse engineer a FSM from the top level of an application.  Currently,
	 * this is defined as the forest of ASTs that make up the program files.
	 * 
	 * @param contextFortranElement the set of ASTs to which to map the FSM
	 */
	@SuppressWarnings({ "restriction", "unchecked" })
	public void reverse(Set<IFortranAST> contextFortranElement) {
		//mappings.clear();
		
		//bootstrap by mapping the root element to the set of ASTs
		//this is implicit for behavior for the top concept of a FSM
		root = (RootType) factory.create(getEClass(getTopConceptDef()));
		setMapsTo(root, contextFortranElement);
		//mappings.put(root, contextFortranElement);
		
		root = reverse(root, contextFortranElement, getTopConceptDef());
	}
	
	//protected void reverse(EObject contextModelElement, ConceptDef conceptDef) {
	
	//}
	
	
	@SuppressWarnings({ "restriction", "unchecked" })
	protected <T extends EObject> T reverse(T modelElement, Object contextFortranElement, ConceptDef conceptDef) {
		
		//assume a successful mapping (required for looking up mappings during recursive calls)
		//mapping will be removed later if it fails
		//mappings.put(modelElement, contextFortranElement);	
		setMapsTo(modelElement, contextFortranElement);
		
		Map<Object, Object> mappingsToAdd = new IdentityHashMap<Object, Object>();
								
		for (SubconceptOrAttribute subconcept : conceptDef.getChild()) {
		
			//alternate
			//modelElement = reverse(modelElement, contextFortranElement, subconcept);
			//then check whether it is essential and not populated
			
			if (subconcept.getName().equalsIgnoreCase("registered1")) {
				System.out.println("registered1");
			}
			
			//find structural feature
			EStructuralFeature structuralFeature = getEStructuralFeature(subconcept);
			//ConceptDef subconceptDef = null;
			Mapping explicitContextMapping = getMappingQuery(subconcept);
			Object explicitContextFortranElement = null;
						
			if (explicitContextMapping != null) {
			
				explicitContextMapping.setMapping((ImplicitContextMapping) replacePathExprWithValues(explicitContextMapping.getMapping(), modelElement, true));
			
				if (explicitContextMapping.getContext() != null) {
					//explicit context - need to navigate elsewhere in the tree
					EObject contextElement = null;
					try {
						contextElement = getValueFromModel(explicitContextMapping.getContext(), modelElement, true);
					} catch (PathExprNotFoundException e) {
						System.out.println(e.getMessage());
						//ignore, will fail below
					}
					explicitContextFortranElement = getMapsTo(contextElement); //mappings.get(contextElement);
				}
				else {
					explicitContextFortranElement = contextFortranElement;  //implicit
				}
				
				//String methodName = explicitContextMapping.getMapping().eClass().getName();
				
				if (explicitContextFortranElement != null) {
					//if there is no context element, then we cannot execute the query
					//if it is an essential subconcept, then this mapping will fail below
					
					Object result = executeMappingQuery(explicitContextMapping.getMapping(), explicitContextFortranElement);
													
					if (result instanceof String) {
						modelElement.eSet(structuralFeature, result);
					}
					else if (result instanceof Token) {
						//if (result != null) {
							//String constructor required because of IdentityHashMap
							String text = new String(((Token)result).getText());
							modelElement.eSet(structuralFeature, text);
							mappingsToAdd.put(text, result);
						//}
						//else {
							//what should we do here?
						//	modelElement.eSet(structuralFeature, null);
						//}
					}
					else if (result instanceof Map) {
												
						//do we have a set of primitives?
						if (subconcept.isAttrib()) {
							Set<String> resultSet = ((Map<String,?>) result).keySet();
							//TODO: ignoring PathExprs for now
							for (String res : resultSet) {
								if (structuralFeature.isMany()) {
									EList<String> el = (EList<String>) modelElement.eGet(structuralFeature);
									el.add(res);
								}
								else {
									modelElement.eSet(structuralFeature, res);
									break;  //just take first one
								}
							}
						}
						//result is a set of objects - either IASTNodes or IFortranASTs
						else {
																								
							Map<Object, Map<PathExpr, String>> resultMap = (Map<Object, Map<PathExpr, String>>) result;
														
							//check position and remove if necessary
							EObject afterMe = null;
							EObject beforeMe = null;
							int afterMeOffset = -1;
							int beforeMeOffset = -1;
							
							if (explicitContextMapping.getAfter() != null) {												
								try {
									afterMe = getValueFromModel(explicitContextMapping.getAfter(), modelElement, true);
								} catch (PathExprNotFoundException e1) {
									//will be handled below
								}								
								if (afterMe == null) {
									resultMap.clear();
								}
								else {
									IASTNode afterMeNode = (IASTNode) getMapsTo(afterMe);
									Token afterMeToken = afterMeNode.findLastToken();
									afterMeOffset = afterMeToken.getFileOffset() + afterMeToken.getLength() + 1;
								}
							}
							
							if (explicitContextMapping.getBefore() != null) {												
								try {
									beforeMe = getValueFromModel(explicitContextMapping.getBefore(), modelElement, true);
								} catch (PathExprNotFoundException e1) {
									//will be handled below
								}								
								if (beforeMe == null) {
									resultMap.clear();
								}
								else {
									IASTNode beforeMeNode = (IASTNode) getMapsTo(beforeMe);
									Token beforeMeToken = beforeMeNode.findFirstToken();
									beforeMeOffset = beforeMeToken.getFileOffset();
								}
							}	
							
							if (afterMeOffset > -1 || beforeMeOffset > -1) {
								Set<Object> toRemove = new HashSet<Object>();
								if (afterMeOffset > -1) {
									for (Entry<Object, Map<PathExpr, String>> resultItem : resultMap.entrySet()) {								
										IASTNode resultNode = (IASTNode) resultItem.getKey();
										Token resultToken = resultNode.findFirstToken();																										
										if (!resultToken.isOnOrAfterFileOffset(afterMeOffset)) {
											toRemove.add(resultItem.getKey());
										}								
									}						
								}
								if (beforeMeOffset > -1) {
									for (Entry<Object, Map<PathExpr, String>> resultItem : resultMap.entrySet()) {								
										IASTNode resultNode = (IASTNode) resultItem.getKey();
										Token resultToken = resultNode.findFirstToken();																										
										if (resultToken.isOnOrAfterFileOffset(beforeMeOffset)) {
											toRemove.add(resultItem.getKey());
										}								
									}						
								}
								for (Object r : toRemove) {
									resultMap.remove(r);
								}
							}
							
							
							
							for (Entry<Object, Map<PathExpr, String>> resultItem : resultMap.entrySet()) {
								
								EObject newModelElem = factory.create((EClass) structuralFeature.getEType());
								
								// set up parent relationship for references (may be removed later)									
								setOrAdd(modelElement, subconcept, newModelElem);
															
								//set bindings in model that satisfy query								
								Map<PathExpr, String> bindings = resultItem.getValue();
								if (bindings != null) {
									for (Entry<PathExpr, String> binding : bindings.entrySet()) {
										try {
											setValueInModel(binding.getKey(), newModelElem, binding.getValue());
										} catch (PathExprNotFoundException e) {
											e.printStackTrace();
											return null;
										}
										catch (ElementAlreadyBoundException e) {
											e.printStackTrace();
											return null;
										}									
									}
								}
								
														
								//recursive call
								EObject newModelElemRet = reverse(newModelElem, resultItem.getKey(), getDefinition(subconcept));
								
								// if NULL returned, then mapping failed, so revert to previous state
								// this involves:
								// - undoing the bindings we set above
								// - removing the newly created element from its parent
								if (newModelElemRet == null) {
									
									//undo the bindings first
									if (bindings != null) {
										for (Entry<PathExpr, String> binding : bindings.entrySet()) {
											try {
												unsetValueInModel(binding.getKey(), newModelElem);
											} catch (PathExprNotFoundException e) {
												e.printStackTrace();
												return null;
											}
										}
									}
									
									//remove new element from the model
									unsetOrRemove(modelElement, subconcept, newModelElem);
										
								}
									
								
								else if (!structuralFeature.isMany()) {
									if (resultMap.size() > 1) {
										System.out.println("Warning: Some matching elements ignored because subconcept is singular: " + subconcept.getName());
										//for (Object ignoredElement : resultMap.entrySet()) {
										//	if (!ignoredElement.equals(resultItem.getKey())) {
										//		System.out.println("\tIgnored element: " + ignoredElement);
										//	}
										//}
									}
									break; // take first one that is not null
								}									
							
							} //end for loop of matched fortran elements
								
						} // end check for primitives vs. objects in results
						
					} //end check for return type of set or map	
					
				} //end check for existence of fortran context element
				
			} // end check for whether a mapping is defined

			else if (!subconcept.isAttrib()) {
				
				//TODO: needs another look
				
				if (isMany(subconcept)) {
					//cartesian product
					modelElement = reverse(modelElement, contextFortranElement, subconcept);
				}
				else {
				
					EObject newModelElem = factory.create((EClass) structuralFeature.getEType());
					setOrAdd(modelElement, subconcept, newModelElem);
										
					EObject newModelElemRet = reverse(newModelElem, contextFortranElement, getDefinition(subconcept));
								
					if (newModelElemRet == null) {
						//remove new element from the model
						unsetOrRemove(modelElement, subconcept, newModelElem);
					}
				
				}
				
			}
			
			//at this point we have set the value of the structural feature
			//if is essential, but not present or false, the parent is no good
			
			boolean fail = false;
			if (subconcept.isEssential()) {					
				if (modelElement.eGet(structuralFeature) == null) {					
					fail = true;
				}
				else if (isMany(subconcept) && ((EList) modelElement.eGet(structuralFeature)).isEmpty()) {
					fail = true;
				}
				else if (structuralFeature.getEType().equals(EcoreFactory.eINSTANCE.getEcorePackage().getEBoolean()) &&
						! (Boolean) modelElement.eGet(structuralFeature)) {
					fail = true;
				}
			}
			else if (subconcept.isMustBeNull()) {
				if (modelElement.eGet(structuralFeature) != null) {
					fail = true;
				}
				else if (isMany(subconcept) && !((EList) modelElement.eGet(structuralFeature)).isEmpty()) {
					fail = true;
				}
			}
			
			if (fail) {
				//System.out.println("Essential feature failed:");
				//System.out.println("\tSubconcept: " + subconcept.getName());
				//System.out.println("\tModel Element: " + modelElement);
				//System.out.println("\tFortran Element: " + fortranContextElem);
				//mappings.remove(modelElement);
				//an essential feature failed, so no need to process 
				//any more structural features
				return null;
			}
			
		} // end for structural features
		
		//mappings.putAll(mappingsToAdd);

		return modelElement;
		
	}
	
	//adds matching elements as children of parentElement at feature soa
	//there may be multiple
	protected <T extends EObject> T reverse(T parentElement, Object contextFortranElement, SubconceptOrAttribute soa) {
		//return reverse(parentElement, contextFortranElement, soa, 0, new HashMap<SubconceptOrAttribute, EObject>());
		return reverse(parentElement, contextFortranElement, soa, 0, null);
	}
	
	protected <T extends EObject> T reverse(T parentElement, 
			Object contextFortranElement, 
			SubconceptOrAttribute parentSOA, 
			int soaIndex, 
			EObject candidate) {
		
		ConceptDef conceptDef = getDefinition(parentSOA);
		if (soaIndex >= conceptDef.getChild().size()) {
			
			//candidate is complete if we get this far
		
			setOrAdd(parentElement, parentSOA, EcoreUtil.copy(candidate));  
			
			//optimize --> if parentSOA is single valued, we can break out here (throwable)
			return parentElement;
		}
		else {
			SubconceptOrAttribute soa = conceptDef.getChild().get(soaIndex);
			//if (soa.getName().equals("registered1")) {
			//	System.out.println();
			//}
			
			if (soaIndex == 0) {
				//first time through 
				candidate = factory.create(getEClass(parentSOA));
				
				//temporarily add candidate to parent for metavariable refs, will be removed later
				setOrAdd(parentElement, parentSOA, candidate);  
			}
			
			if (soa.isAttrib()) {
				//skip attributes because they should not have a mapping
				parentElement = reverse(parentElement, contextFortranElement, parentSOA, soaIndex+1, candidate);
			}
			else {
				Mapping query = getMappingQuery(soa);  
				if (query != null) {
					
					//populate metavariables with values
					//temporarily attach to parent for metavariable resolution
					//setOrAdd(parentElement, parentSOA, candidate);
					
					query.setMapping((ImplicitContextMapping) replacePathExprWithValues(query.getMapping(), candidate, true));
					Object explicitContextFortranElement = null;
					if (query.getContext() != null) {
						//explicit context
						EObject contextElement = null;
						try {
							contextElement = getValueFromModel(query.getContext(), candidate, true);
						} catch (PathExprNotFoundException e) {
							e.printStackTrace();
							//will fail below
						}
						explicitContextFortranElement = getMapsTo(contextElement); //mappings.get(contextElement);						
					}
					else {
						explicitContextFortranElement = contextFortranElement;  //implicit
					}
					
					if (explicitContextFortranElement == null) {
						throw new RuntimeException("Could not find context Fortran element");
					}
					
					//remove to restrict variable resolution
					//unsetOrRemove(parentElement, parentSOA, candidate);
					
					Object result = executeMappingQuery(query.getMapping(), explicitContextFortranElement);
					if (result instanceof Map) {
						Map<Object, Map<PathExpr, String>> resultMap = (Map<Object, Map<PathExpr, String>>) result;
						
						//check position and remove if necessary
						EObject afterMe = null;
						EObject beforeMe = null;
						int afterMeOffset = -1;
						int beforeMeOffset = -1;
						
						if (query.getAfter() != null) {												
							try {
								afterMe = getValueFromModel(query.getAfter(), candidate, true);
							} catch (PathExprNotFoundException e1) {
								//will be handled below
							}								
							if (afterMe == null) {
								resultMap.clear();
							}
							else {
								IASTNode afterMeNode = (IASTNode) getMapsTo(afterMe);
								Token afterMeToken = afterMeNode.findLastToken();
								afterMeOffset = afterMeToken.getFileOffset() + afterMeToken.getLength() + 1;
							}
						}
						
						if (query.getBefore() != null) {												
							try {
								beforeMe = getValueFromModel(query.getBefore(), candidate, true);
							} catch (PathExprNotFoundException e1) {
								//will be handled below
							}								
							if (beforeMe == null) {
								resultMap.clear();
							}
							else {
								IASTNode beforeMeNode = (IASTNode) getMapsTo(beforeMe);
								Token beforeMeToken = beforeMeNode.findFirstToken();
								beforeMeOffset = beforeMeToken.getFileOffset();
							}
						}	
						
						if (afterMeOffset > -1 || beforeMeOffset > -1) {
							Set<Object> toRemove = new HashSet<Object>();
							if (afterMeOffset > -1) {
								for (Entry<Object, Map<PathExpr, String>> resultItem : resultMap.entrySet()) {								
									IASTNode resultNode = (IASTNode) resultItem.getKey();
									Token resultToken = resultNode.findFirstToken();																										
									if (!resultToken.isOnOrAfterFileOffset(afterMeOffset)) {
										toRemove.add(resultItem.getKey());
									}								
								}						
							}
							if (beforeMeOffset > -1) {
								for (Entry<Object, Map<PathExpr, String>> resultItem : resultMap.entrySet()) {								
									IASTNode resultNode = (IASTNode) resultItem.getKey();
									Token resultToken = resultNode.findFirstToken();																										
									if (resultToken.isOnOrAfterFileOffset(beforeMeOffset)) {
										toRemove.add(resultItem.getKey());
									}								
								}						
							}
							for (Object r : toRemove) {
								resultMap.remove(r);
							}
						}
						
						if (resultMap.size() > 0) {
							boolean firstTime = true;
							for (Entry<Object, Map<PathExpr, String>> resultItem : resultMap.entrySet()) {
								
								EObject newChild = factory.create(getEClass(soa));
								if (isMany(soa)) {
									throw new RuntimeException("The concept " + soa.getName() + " must be single valued in this context.");
								}
								setOrAdd(candidate, soa, newChild); 
														
								Map<PathExpr, String> bindings = resultItem.getValue();
								if (bindings != null) {

									for (Entry<PathExpr, String> binding : bindings.entrySet()) {
										try {
											//first time around, do not allow re-binding previously bound variables
											if (firstTime) {
												setValueInModel(binding.getKey(), newChild, binding.getValue(), false);
											}
											else {
												//second time allow it, because we will rebind the values from the next result
												setValueInModel(binding.getKey(), newChild, binding.getValue(), true);
											}
										} catch (PathExprNotFoundException e) {
											e.printStackTrace();
											return parentElement;
										}
										catch (ElementAlreadyBoundException e) {
											e.printStackTrace();
											//this should not happen because we allow resetting above
											return null;
										}
									}
																											
								}
								
								
								EObject newChildResult = reverse(newChild, resultItem.getKey(), getDefinition(soa));
								if (newChildResult == null) {
									
									//first undo bindings
									for (Entry<PathExpr, String> binding : bindings.entrySet()) {
										try {
											unsetValueInModel(binding.getKey(), newChild);
										} catch (PathExprNotFoundException e) {
											e.printStackTrace();
											return parentElement;
										}
									}
									
									//remove newChild from candidate
									unsetOrRemove(candidate, soa, newChild);																
									
								}
								
								if (newChildResult != null && soa.isMustBeNull()) {
									return parentElement; //found a match, but it must be null
								}
								else if (newChildResult != null || !soa.isEssential()) {  //optimization
									parentElement = reverse(parentElement, contextFortranElement, parentSOA, soaIndex+1, candidate);
									//this call adds all candidates (if any) that match with this particular result (newChild)
								}
								
								
								firstTime = false;
								
								//if (removed != null) {
								//	setOrAdd(parentElement, parentSOA, removed);  //replace with previous value, which may be a matching element
								//}
								
							}
							
							
							
						}
						else if (soa.isEssential()) {
							return parentElement;  //unmodified
						}
						else {
							parentElement = reverse(parentElement, contextFortranElement, parentSOA, soaIndex+1, candidate);
						}
					} //end if result instance of map
					else {
						throw new RuntimeException("Expected result of type Map but type is: " + result.getClass().getName());
					}
				}
				else {
					//nested composite - what to do here?   maybe this is disallowed
					throw new RuntimeException("Nested concept without mapping definition not allowed");
				}
			}
			
			if (soaIndex == 0) {
				//remove
				unsetOrRemove(parentElement, parentSOA, candidate);
			}
			
		}
		
		return parentElement;	
		
	}
	
	
	
	private Method findQueryMethod(String methodName, Object context, EObject mapping) {
		for (Method m : queryClass.getMethods()) {
			if (m.getName().equalsIgnoreCase(methodName) && m.getParameterTypes().length >= 2) {
				Class<?> contextClass = m.getParameterTypes()[0];
				Class<?> mappingClass = m.getParameterTypes()[1];
				if (contextClass.isInstance(context) &&
					mappingClass.isInstance(mapping)) {
					return m;
				}
			}
		}
		return null;
	}
	
	
	/*
	private Method findQueryMethod(String methodName, Object context, EObject mapping) {
		for (Method m : queryClass.getMethods()) {
			if (m.getName().equalsIgnoreCase(methodName)) {
				return m;
			}
		}
		return null;
	}
	*/
	
	protected Object executeMappingQuery(ImplicitContextMapping query, Object fortranContextElement) {		
		String queryMethodName = query.eClass().getName();
		if (fortranContextElement != null) {		
			Method method = findQueryMethod(queryMethodName, fortranContextElement, query);
			if (method == null) {
				throw new RuntimeException("Query method not found: " + queryMethodName + " : " + fortranContextElement.getClass().getName() + ", " + query.getClass().getName() );
			}
			try {
				return method.invoke(null, fortranContextElement, query);
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			} catch (InvocationTargetException e) {
				throw new RuntimeException(e);
			}		
		}	
		return null;
	}
	
	protected Object executeMappingTransformation(EObject context, ImplicitContextMapping mapping, Object fortranContextElement, List<Annotation> anots) {
		return executeMappingTransformation(context, mapping, fortranContextElement, anots, null);
	}	
		
	protected Object executeMappingTransformation(EObject context, ImplicitContextMapping mapping, Object fortranContextElement, List<Annotation> anots, String value) {
		String queryMethodName = mapping.eClass().getName();
		if (fortranContextElement != null) {
			Method method = findTransformationMethod(queryMethodName, fortranContextElement, mapping);
			if (method == null) {
				//return null;
				throw new RuntimeException("Transformation method not found: " + queryMethodName + " : " + fortranContextElement.getClass().getName() + ", " + mapping.getClass().getName() );
			}
			try {
				if (method.getParameterTypes().length==5) {
					return method.invoke(null, fortranContextElement, mapping, value, anots, context);
				}
				if (method.getParameterTypes().length==4) {
					return method.invoke(null, fortranContextElement, mapping, value, anots);
				}
				else if (method.getParameterTypes().length==3) {
					return method.invoke(null, fortranContextElement, mapping, anots);
				}
				else {
					return method.invoke(null, fortranContextElement, mapping);
				}
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			} catch (InvocationTargetException e) {
				throw new RuntimeException(e);
			}
		}
		return null;
	}
	
	
	
	/*
	protected class Match {
		public Object match;	//the root of the matching subtree
		public Object mappedTo;  //the fortran element
		//public Map<EObject, Object> mapping;	//maps elements to their fortran constructs
		public Map<PathExpr, String> bindings;	//bindings required for the maps when match is put into context
		
		
		public Match(String match) {
			this(match, null);
		}
		
		
		public Match(String match, Map<PathExpr, String> bindings) {
			this.match = match;
			this.bindings = bindings;
		}
		
		public Match(EObject match, Object mappedTo, Map<PathExpr, String> bindings) {
			this.match = match;
			this.bindings = bindings;
		}
		
		
	}
	*/
	
	
	/*
	@SuppressWarnings("unchecked")
	protected Set<Match> findMatches(final EObject parent, 
									 final SubconceptOrAttribute soa, 
									 final Map<EObject, Object> mappings) {
		
		Set<Match> result = new HashSet<Match>();
		Mapping query = getMappingQuery(soa);		
			
		if (query != null) {
			
			//replace metavariables with their values, if available
			query.setMapping(replacePathExprWithValues(query.getMapping(), parent, true));
			
			Object fortranContextElement;
			if (query.getContext() != null) {
				//explicit context - need to navigate elsewhere in the tree
				EObject contextElement = null;
				try {
					contextElement = getValueFromModel(query.getContext(), parent, true);
				} catch (PathExprNotFoundException e) {
					e.printStackTrace();
				}
				fortranContextElement = mappings.get(contextElement);
			}
			else {
				//implicit context - use parent's fortran element as context
				fortranContextElement = mappings.get(parent);
			}
			
			Object queryResult = executeMappingQuery(query.getMapping(), fortranContextElement);
				
			if (queryResult instanceof String) {
				result.add(new Match((String) queryResult));
				//result.put(queryResult, null);
			}
			
			/*
			else if (method.getReturnType() == Token.class) {
				if (result != null) {
					//String constructor required because of IdentityHashMap
					String text = new String(((Token)result).getText());
					modelElem.eSet(structuralFeature, text);
					mappingsToAdd.put(text, result);
				}
				else {
					//what should we do here?
					modelElem.eSet(structuralFeature, null);
				}
			}
			
			if (queryResult instanceof Map) {
											
				//do we have a set of primitives?
				if (soa.isAttrib()) {
					for (Entry<String, Map<PathExpr, String>> resultItem : ((Map<String, Map<PathExpr, String>>) queryResult).entrySet()) {
						result.add(new Match(resultItem.getKey(), resultItem.getValue()));
					}
				}

				else {
											
					for (Entry<Object, Map<PathExpr, String>> resultItem : 
							((Map<Object, Map<PathExpr, String>>) queryResult).entrySet()) {
												
						EObject newChildElement = factory.create(getEClass(soa));
							
						// set up parent relationship for references (may be removed later)									
						setOrAdd(parent, soa, newChildElement);
						
						//set binding in model
						Map<PathExpr, String> undoBindings = null;
						Map<PathExpr, String> bindings = resultItem.getValue();
						if (bindings != null) {
							undoBindings = new HashMap<PathExpr, String>();
							for (Entry<PathExpr, String> binding : bindings.entrySet()) {
								//update tree with new value from binding
								String oldValue = null;
								try {
									oldValue = setValueInModel(binding.getKey(), newChildElement, binding.getValue());
								} catch (PathExprNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								undoBindings.put(binding.getKey(), oldValue);
							}
						}						
													
						//attempt to populate the element
						//newChildElement = populate(newChildElement, getDefinition(soa), resultItem.getKey());
						
						Set<Match> submatches = findMatches(parent, getDefinition(soa), resultItem.getKey());
						//submatches is a set of matches, m_i:
						//  m_i.match = instance of getEClass(getDefinition(soa))
						//  m_i.mapsTo = reference to fortran element
						//  m_i.bindings = bindings for the match
						
						//for each submatch: result.add(submatch)				
						
							
						//restore state
						unsetOrRemove(parent, soa, newChildElement);								
						if (undoBindings != null) {
							for (Entry<PathExpr, String> binding : undoBindings.entrySet()) {
								try {
									setValueInModel(binding.getKey(), newChildElement, binding.getValue());
								} catch (PathExprNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}	
														
						if (newChildElement != null) {							
							result.add(new Match(newChildElement, resultItem.getKey(), bindings));
						}
						
							
					}
				}
			}
			else {
				throw new RuntimeException("Query returned unexpected result type: " + queryResult);
			}
			
		}
				
		// else
		// 		--no mapping defined
		//		Map<EObject, Map<EObject, Object>> subMatches = findMatches(parent, conceptDef)   
		//		for each (subMatch : subMatches)
		//			parent.eSet(soa, subMatch.getKey()) -- add to list (if it's a list)
		//			result.put(subMatch.getKey, subMatch.getValue)
		//
		// return result
		
		else {
			
			//Map<Object, Map<EObject, Object>> submatches = findMatches(parent, getDefinition(soa));
			//for (Entry<Object, Map<EObject, Object>> submatch : submatches.entrySet()) {
				
			//}
			
		}
		
		return null;
	}
	
	protected Set<Match> findMatches(final EObject parent, final ConceptDef conceptDef, final Object fortranContext) {
		return findMatches(parent, conceptDef, 0, fortranContext, new HashSet<Match>());
	}	
		
	protected Set<Match> findMatches(final EObject parent, 
									final ConceptDef conceptDef, 
									final int soaIndex, 
									final Object fortranContext, 
									final Set<Match> result) {
			
		if (soaIndex > conceptDef.getChild().size()) {
			//we have a match
			EObject match = factory.create(getEClass(conceptDef));
			result.add(new Match(match, fortranContext, null));
			return result;
		}
		
		else {
			SubconceptOrAttribute soa = conceptDef.getChild().get(soaIndex);
			Set<Match> submatches = findMatches(null, soa, null);
		}
		
		
		//if (soaIndex too big)
		//	--this indicates success
		//	create newModelElem of type getEClass(conceptDef)	
		//  resultToReturn.put(newChildObject, currentMappings)
		//
		//else
		//
		//	soa = conceptDef.getChildren.get(soaIndex)
		//	Map<EObject, Map<EObject, Object> matches = findMatches(parent, soa)
		//			-- returned keys are of type getEClass(definition(soa))
		//			-- returned values are mappings from grandchild elements to fortran elements
		//
		//	if (no matches and essential)
		//		return empty map
		// 	else if (there are matches)
		//		for (match : matches)
		//			Map<EObject, Map<EObject, Object>> resultOfRest = findMatches(parent, conceptDef, soaIndex+1)
		//			resultToReturn.putAll(resultOfRest)
		//	
		
		return null;
	}
	
	protected EObject populate(final EObject self, final ConceptDef conceptDef, final Object fortranContext) {
		return populate(self, conceptDef, 0, fortranContext);
	}
	*/
	
	/**
	 * Attempt to populate (assign values to structural features) an EObject (self) using
	 * a list of subconcepts which correspond to self's structural features.
	 * 
	 * The parameter soaIndex is an index into soaList and represents the current feature 
	 * being populated.
	 * 	  
	 * If self could be populated, it is returned with its feature values set.
	 * 
	 * If self could not be populated (because at least one essential feature failed to 
	 * match), null is returned.
	 * 
	 * @param self the EObject to populate
	 * @param conceptDef the definition to use to populate self
	 * @param soaIndex index into soaList
	 * @param fortranContext the previously established fortran context element that self maps to
	 * @return
	 */
	/*
	protected EObject populate(final EObject self, 
							   final ConceptDef conceptDef, 
							   final int soaIndex, 
							   final Object fortranContext) {
		
		/*
		//if (soaIndex > soaList.size()-1)
		//  we made it to end, so return mappings
		
		//TODO: check is soaList is null?
		if (soaIndex > conceptDef.getChild().size() - 1) {
			return fortranContext;
		}
		
		//else
			//soa = soaList.get(soaIndex)
			//Map<EObject, Map<EObject,Object>> matches = findMatches(self, soa)
			//if (no matches and essential)
			//   return null - indicates that self cannot be populated
			//else if (there are matches)
		    //	for (match : matches)
			//		self.eSet(soa, match) -- setOrAdd
			//		Map<EObject, Object> resultOfRest = populate(self, soaList, soaIndex+1)
			//		if (resultOfRest != null)
			//			-- this means that this combination matched
			//			mappings.addAll(resultOfRest)
			//		else
			//			self.eUnset(soa, null) -- unsetOrRemove
			//			--no matches, but not essential, so just iterate
		
		else {
			
			SubconceptOrAttribute soa = conceptDef.get(soaIndex);
			
			//find matches for current feature
			Map<Object, Map<EObject, Object>> matches = findMatches(self, soa, fortranContext);
			if (matches.size() == 0 && soa.isEssential()) {
				//an essential feature failed to match, so return null
				return null;
			}
			else if (matches.size() > 0) {
				for (Entry<Object, Map<EObject, Object>> match : matches.entrySet()) {
					
					setOrAdd(self, soa, match.getKey());
					fortranContext.putAll(match.getValue());
					Map<EObject, Object> resultOfRest = populate(self, conceptDef, soaIndex + 1, fortranContext);
					
					if (resultOfRest != null) {
						//population of all next sibling features succeeded, so keep this match
						if (!isMany(soa)) {
							//only room for one match, so break
							System.out.println("populate - Ignored some potential matches");
							break;
						}
					}
					else {
						//population of next sibling features failed, so remove this match
						unsetOrRemove(self, soa, match.getKey());
						removeAll(match.getValue().keySet(), fortranContext);
					}
					
				}
			}
 		}
		
		return fortranContext;
		
		return null;
	}
	*/
	
	/**
	 * Returns a copy of the mapping query that can be manipulated without
	 * changing the original.
	 * 
	 * @param soa
	 * @return
	 */
	protected Mapping getMappingQuery(SubconceptOrAttribute soa) {
		Mapping m = null;
		if (soa.isAttrib()) {
			m = soa.getAttribMapping();
		}
		else if (soa.isReference()) {
			m = soa.getRef().getMapping();
		}
		else {
			m = soa.getDef().getMapping();
		}
		if (m!=null) return EcoreUtil.copy(m);
		else return null;
	}
	
	
	public boolean isMany(SubconceptOrAttribute soa) {
		if (soa.getCardinality() == null) return false;
		else return soa.getCardinality().isOneOrMore() || soa.getCardinality().isZeroOrMore();
	}
	
	protected <K> void removeAll(Set<K> keys, Map<K,?> map) {
		for (K key : keys) {
			map.remove(key);
		}
	}
	
	/**
	 * Sets or adds an object at a structural feature.  If an object is removed
	 * in the process, it is returned.
	 * 
	 * @param o
	 * @param soa
	 * @param value
	 * @return
	 */
	protected Object setOrAdd(EObject o, SubconceptOrAttribute soa, Object value) {
		EStructuralFeature esf = getEStructuralFeature(soa);
		if (esf.isMany()) {
			EList el = (EList) o.eGet(esf);
			el.add(value);
			return null;
		}
		else {
			Object oldValue = o.eGet(esf);
			o.eSet(esf, value);
			return oldValue;
		}
	}
	
	protected void unsetOrRemove(EObject o, SubconceptOrAttribute soa, Object value) {
		EStructuralFeature esf = getEStructuralFeature(soa);
		if (esf.isMany()) {
			EList el = (EList) o.eGet(esf);
			el.remove(value);
		}
		else {
			if (o.eGet(esf)==value) {
				o.eUnset(esf);
			}
		}
	}
	
	public Object getValue(EObject o, SubconceptOrAttribute soa) {
		EStructuralFeature esf = getEStructuralFeature(soa);
		return o.eGet(esf);
	}
	
	//protected void reverse(Object fortranContextElement, ConceptDef conceptDef) {
		
		// Map<SubconceptOrAttribute, Map<Object, Object>> childMappings
		// EClass newClass = getEClass(conceptDef)
		
		// for (Entry e : childMappings):
		// 		EObject newModelElement = factory.create(newClass)
		//		for (soa : e.get				
		
		//return null;
	//}
	
	//protected Map<Object, Object> reverse(EObject contextModelElement, List<SubconceptOrAttribute> soaList, int soaIndex) {
		
	//if (soaIndex > soaList.size()-1)
		//return contextModelElement

	//else
		//	soa = soaList.get(soaIndex)
	
	
	public EAttribute getNameEAttribute(ConceptDef cd) {
		for (SubconceptOrAttribute soa: cd.getChild()) {
			if (soa.isAttrib() && hasAnnotation(soa, "name")) {
				return (EAttribute) getEStructuralFeature(soa);
			}
		}
		return null;
	}
	
	public EStructuralFeature getEStructuralFeature(SubconceptOrAttribute soa) {	
		if (cache.containsKey(soa)) {
			return cache.get(soa);
		}
		else {			
			//find the EClass of the parent conceptDef
			ConceptDef parentConceptDef = (ConceptDef) soa.eContainer();
			String parentEClassName = generator.toClassName(parentConceptDef);
			EClass parentEClass = (EClass) pack.getEClassifier(parentEClassName);
			
			//find the structural feature
			EStructuralFeature sf = parentEClass.getEStructuralFeature(soa.getName());
			cache.put(soa, sf);
			return sf;
		}	
	}
	
	public EClass getEClass(ConceptDef cd) {
		String eclassName = generator.toClassName(cd);
		EClass result = (EClass) pack.getEClassifier(eclassName);
		return result;
	}
	
	public EClass getEClass(SubconceptOrAttribute soa) {
		return getEClass(getDefinition(soa));
	}
	
	public ConceptDef getDefinition(SubconceptOrAttribute soa) {
		if (soa.isAttrib()) return null;
		else if (soa.isReference()) return soa.getRef();
		else return soa.getDef();
	}
	
	public ConceptDef getTopConceptDef() {
		for (ConceptDef cd : language.getConceptDef()) {
			if (cd.isTop()) return cd;
		}
		return null;
	}
	
	public ConceptDef getConceptDef(EObject obj) {
		return getConceptDef(obj.eClass());
	}
	
	public ConceptDef getConceptDef(EClass eclass) {
		String eclassName = eclass.getName();
		if (!eclassName.contains("__")) {
			for (ConceptDef cd : language.getConceptDef()) {
				if (cd.getName().equalsIgnoreCase(eclassName)) {
					return cd;
				}
			}
			return null;
		}
		else {
			String[] segments = eclassName.split("__");
			ConceptDef cur = null;
			for (ConceptDef cd : language.getConceptDef()) {
				if (cd.getName().equalsIgnoreCase(segments[0])) {
					cur = cd;
					break;
				}
			}
			if (cur==null) return null;
			for (int i = 1; i<segments.length; i++) {
				boolean found = false;
				for (SubconceptOrAttribute soa : cur.getChild()) {
					if (!soa.isAttrib() && !soa.isReference()) {
						if (soa.getDef()==null) {
							System.out.println("Should not happen");
						}
						if (soa.getDef().isNamed() && soa.getDef().getName().equalsIgnoreCase(segments[i])) {
							cur = soa.getDef();
							found = true;
							break;
						}
						else if (!soa.getDef().isNamed() && soa.getName().equalsIgnoreCase(segments[i])) {
							cur = soa.getDef();
							found = true;
							break;
						}
					}
				}
				if (!found) return null;
			}
			return cur;
		}
	}
	
	public String getAnnotationValue(EObject obj, String key) {
		return getAnnotationValue(getConceptDef(obj), key);
	}
	
	public String getAnnotationValue(ConceptDef cd, String key) {
		if (!key.startsWith("@")) key = "@" + key;
		for (Annotation a : cd.getAnnotation()) {
			if (a.getKey().equalsIgnoreCase(key)) {
				return a.getValue();
			}
		}
		return null;
	}
	
	public String getAnnotationValue(SubconceptOrAttribute soa, String key) {
		if (!key.startsWith("@")) key = "@" + key;
		for (Annotation a : soa.getAnnotation()) {
			if (a.getKey().equalsIgnoreCase(key)) {
				return a.getValue();
			}
		}
		return null;
	}
	
	public boolean hasAnnotation(SubconceptOrAttribute soa, String key) {
		if (!key.startsWith("@")) key = "@" + key;
		for (Annotation a : soa.getAnnotation()) {
			if (a.getKey().equalsIgnoreCase(key)) {
				return true;
			}
		}
		return false;
	}

	public static List<PathExprTerm> linearizePathExpr(PathExpr pathExpr) {
		return linearizePathExpr(pathExpr, new ArrayList<PathExprTerm>());
	}
	
	private static List<PathExprTerm> linearizePathExpr(PathExpr pathExpr, List<PathExprTerm> segments) {
		
		if (pathExpr instanceof PathExprTerm) {
			PathExprTerm pet = CupidLanguageFactory.eINSTANCE.createPathExprTerm();
			pet.setRef(((PathExprTerm) pathExpr).getRef());
			//copy required for containment references because they are removed from source container....
			pet.setAxis(EcoreUtil.copy(((PathExprTerm) pathExpr).getAxis()));
			segments.add(pet);
		}
		else {
			linearizePathExpr(pathExpr.getHead(), segments);
			PathExprTerm pet = CupidLanguageFactory.eINSTANCE.createPathExprTerm();
			pet.setRef(pathExpr.getTail());
			segments.add(pet);
		}
		
		return segments;
		
	}
	
	
	@SuppressWarnings("unchecked")
	public <T> T getValueFromModel(PathExpr pathExpr, EObject modelElem, boolean isParent) throws PathExprNotFoundException {
		
		List<PathExprTerm> segments = linearizePathExpr(pathExpr);
		PathExprTerm firstSegment = segments.get(0);
		PathExprTerm lastSegment = segments.get(segments.size()-1);	
		
		//cannot axis direct children from parent
		//this is the point in the reverse engineering algorithm when we have not yet created the child nodes
		if (isParent && (firstSegment.getAxis() == null || !firstSegment.getAxis().isAncestor())) {
			//return defaultVal;
			throw new PathExprNotFoundException(pathExpr);
		}
		
		EObject context = modelElem;
		
		for (PathExprTerm pet : segments) {
			EStructuralFeature esf = getEStructuralFeature(pet.getRef());
			//todo: deal with multi-valued features
			if (pet.getAxis()!= null && pet.getAxis().isAncestor()) {
				
				//work up the class hierarchy
				if (!isParent) {
					context = context.eContainer();
				}
				
				while (context != null && !context.eClass().getEStructuralFeatures().contains(esf)) {
					context = context.eContainer();
				}
				
				if (context==null) {
					//System.out.println("getValueFromModel: Value of pathExpr not found.  Ancestor not found: " + pet.getRef().getName());
					//return defaultVal;
					throw new PathExprNotFoundException(pathExpr);
				}
				else if (pet.equals(lastSegment)) {
					return (T) context.eGet(esf);
				}
				else {
					//set the context and iterate to next segment
					context = (EObject) context.eGet(esf);
				}
				
			}
			else if (pet == lastSegment) {
				if (context == null) {
					throw new PathExprNotFoundException(pathExpr);
				}
				if (context.eClass().getEStructuralFeatures().contains(esf)) {
					return (T) context.eGet(esf);
				}
				else {
					//System.out.println("getValueFromModel: Value of pathExpr not found.  Feature not found: " + pet.getRef().getName());
					//throw new RuntimeException("Invalid PathExpr.  Feature not found: " + pet.getRef().getName());
					throw new PathExprNotFoundException(pathExpr);
				}
			}
			else {
				//not last segment
				//child
				context = (EObject) context.eGet(esf);  //assumes single value
			}
		}
		
		//throw new RuntimeException("getValueFromModel returned before finding element specified in PathExpr");
		throw new PathExprNotFoundException(pathExpr);
	}
	
	
	public void unsetValueInModel(PathExpr pathExpr, EObject modelElem) 
			throws PathExprNotFoundException {
		
		List<PathExprTerm> segments = linearizePathExpr(pathExpr);
		PathExprTerm lastSegment = segments.get(segments.size()-1);					
		
		EObject context = modelElem;
		
		for (PathExprTerm pet : segments) {
			EStructuralFeature esf = getEStructuralFeature(pet.getRef());
			if (pet.getAxis()!= null && pet.getAxis().isAncestor()) {
				
				//start with first ancestor
				context = context.eContainer();
				
				while (context != null && !context.eClass().getEStructuralFeatures().contains(esf)) {
					context = context.eContainer();
				}
				
				if (context==null) {
					throw new PathExprNotFoundException(pathExpr);
				}
				else if (pet.equals(lastSegment)) {
					context.eUnset(esf); 
					return;
				}
				else {
					//set the context and iterate to next segment
					context = (EObject) context.eGet(esf);
				}
				
			}
			else if (pet == lastSegment) {
				if (context == null) {
					throw new PathExprNotFoundException(pathExpr);
				}
				if (context.eClass().getEStructuralFeatures().contains(esf)) {
					context.eUnset(esf); 
					return;
				}
				else {
					//System.out.println("getValueFromModel: Value of pathExpr not found.  Feature not found: " + pet.getRef().getName());
					//throw new RuntimeException("setValueInModel: Invalid PathExpr.  Feature not found: " + pet.getRef().getName());
					throw new PathExprNotFoundException(pathExpr);
				}
			}
			else {
				//not last segment
				//child
				context = (EObject) context.eGet(esf);  //assumes single value
			}
		}
		
		throw new PathExprNotFoundException(pathExpr);
		
		//throw new RuntimeException("setValueInModel returned before setting element specified in PathExpr");
		
		
	}
	
	public void setValueInModel(PathExpr pathExpr, EObject modelElem, String value) 
			throws PathExprNotFoundException, ElementAlreadyBoundException {
		setValueInModel(pathExpr, modelElem, value, false);
	}
	
	public void setValueInModel(PathExpr pathExpr, EObject modelElem, String value, boolean allowReset) 
			throws PathExprNotFoundException, ElementAlreadyBoundException {
		
		List<PathExprTerm> segments = linearizePathExpr(pathExpr);
		//PathExprTerm firstSegment = segments.get(0);
		PathExprTerm lastSegment = segments.get(segments.size()-1);					
		
		EObject context = modelElem;
		
		for (PathExprTerm pet : segments) {
			EStructuralFeature esf = getEStructuralFeature(pet.getRef());
			if (pet.getAxis()!= null && pet.getAxis().isAncestor()) {
				
				//start with first ancestor
				context = context.eContainer();
				
				while (context != null && !context.eClass().getEStructuralFeatures().contains(esf)) {
					context = context.eContainer();
				}
				
				if (context==null) {
					throw new PathExprNotFoundException(pathExpr);
				}
				else if (pet.equals(lastSegment)) {
					String oldValue = (String) context.eGet(esf);
					if (!allowReset && oldValue != null) {
						throw new ElementAlreadyBoundException(pathExpr);
					}
					else {
						context.eSet(esf, value); //assumes single valued structural feature
						return;
					}
					//return oldValue; 
				}
				else {
					//set the context and iterate to next segment
					context = (EObject) context.eGet(esf);
				}
				
			}
			else if (pet == lastSegment) {
				if (context == null) {
					throw new PathExprNotFoundException(pathExpr);
				}
				if (context.eClass().getEStructuralFeatures().contains(esf)) {
					String oldValue = (String) context.eGet(esf);
					if (!allowReset && oldValue != null) {
						throw new ElementAlreadyBoundException(pathExpr);
					}
					else {
						context.eSet(esf, value); //assumes single valued structural feature
						return;
					}
				}
				else {
					//System.out.println("getValueFromModel: Value of pathExpr not found.  Feature not found: " + pet.getRef().getName());
					//throw new RuntimeException("setValueInModel: Invalid PathExpr.  Feature not found: " + pet.getRef().getName());
					throw new PathExprNotFoundException(pathExpr);
				}
			}
			else {
				//not last segment
				//child
				context = (EObject) context.eGet(esf);  //assumes single value
			}
		}
		
		throw new PathExprNotFoundException(pathExpr);
		
		//throw new RuntimeException("setValueInModel returned before setting element specified in PathExpr");
		
	}
	
	
	/*
	@SuppressWarnings("unchecked")
	public <T> T getValueFromModel_OLD(PathExpr pathExpr, EObject modelElem, T defaultVal) {
		
		//for now, just get last segment as direct pointer 
		//(we have not implemented any tree walking directives)
		SubconceptOrAttribute lastSegment = getLastSegment(pathExpr);
		EStructuralFeature lastSegmentSF = getEStructuralFeature(lastSegment);
		EClass lastSegmentEClass = lastSegmentSF.getEContainingClass();
		
		//move up the tree and find the nearest object with matching EClass
		EObject cur = modelElem;
		while (cur != null && !cur.eClass().equals(lastSegmentEClass)) {
			cur = cur.eContainer();
		}
		if (cur == null) {
			//failed
			//if (lastSegmentSF.getName().equals("gcompSetServices")) {
			//	System.out.println("here");
			//}
			System.out.println("getValueFromModel: Value of pathExpr not found: " + pathExpr);
			return defaultVal;
		}
		else {
			return (T) cur.eGet(lastSegmentSF);
		}
	}
	
	public void setValueInModel_OLD(PathExpr pathExpr, EObject modelElem, String value) {
		
		//TODO: MOST OF THIS COPIED FROM ABOVE, abstract it out
		
		//for now, just get last segment as direct pointer 
		//(we have not implemented any tree walking directives)
		SubconceptOrAttribute lastSegment = getLastSegment(pathExpr);
		EStructuralFeature lastSegmentSF = getEStructuralFeature(lastSegment);
		EClass lastSegmentEClass = lastSegmentSF.getEContainingClass();
		
		//move up the tree and find the nearest object with matching EClass
		EObject cur = modelElem;
		while (cur != null && !cur.eClass().equals(lastSegmentEClass)) {
			cur = cur.eContainer();
		}
		if (cur == null) {
			//we failed
			System.out.println("setValueInModel: Value of pathExpr not found: " + pathExpr);
		}
		else {
			cur.eSet(lastSegmentSF, value);
		}
	}
	*/
	
	public SubconceptOrAttribute getLastSegment(PathExpr pathExpr) {
		if (pathExpr.getTail() != null) {
			return pathExpr.getTail();
		}
		else if (pathExpr instanceof PathExprTerm) {
			return ((PathExprTerm) pathExpr).getRef();
		}
		else {
			System.out.println("null last segment");
			return null;
		}
		//if (pathExpr instanceof PathExprTerm) {
		//	return (PathExprTerm) pathExpr;
		//}
		//else {
		//	return getLastSegment(pathExpr.getHead());
		//}
	}
	
	
	/**
	 * Looks for instances of PathExpr in the mappingElement tree and, when possible,
	 * replaces them with values from the context
	 * 
	 * @param mappingElement
	 * @param context
	 */
	@SuppressWarnings("unchecked")
	public <T extends EObject> T replacePathExprWithValues(T mappingElement, EObject context, boolean isParent) {
		if (mappingElement == null) {
			return null;
		}
		else if (mappingElement instanceof Expr && ((Expr)mappingElement).getPathExpr() != null) {
			try {
				Object replaceVal = getValueFromModel(((Expr) mappingElement).getPathExpr(), context, isParent);
				if (replaceVal != null) {
					if (!(replaceVal instanceof String)) {
						throw new RuntimeException("Expecting value of type String from model.  Object returned is: " + replaceVal);
					}
					
					Expr replaceValObj = CupidLanguageFactory.eINSTANCE.createExpr();
					replaceValObj.setExpr(CupidLanguageFactory.eINSTANCE.createLocalExpression());
					replaceValObj.getExpr().setId((String) replaceVal);
					
					return (T) replaceValObj;
				}
			} catch (PathExprNotFoundException e) {
				//do not replace
			}
				
		}
		else {
			for (EReference ref : mappingElement.eClass().getEReferences()) {
				if (!ref.isMany()) {
					mappingElement.eSet(ref, replacePathExprWithValues((EObject) mappingElement.eGet(ref), context, isParent));
				}
				else {
					@SuppressWarnings("rawtypes")
					EList refList = (EList) mappingElement.eGet(ref);
					for (int i = 0; i < refList.size(); i++) {
						refList.set(i, replacePathExprWithValues((EObject) refList.get(i), context, isParent));
					}
				}
			}
		}
		
		return mappingElement;		
	}
	
	@SuppressWarnings("restriction")
	public IFortranAST getASTForElement(EObject eobj) {
		
		while (eobj != null) {			
			if (getMapsTo(eobj) instanceof IFortranAST) {
				return (IFortranAST) getMapsTo(eobj);
			}
			eobj =  eobj.eContainer();
		}
		return null;
		
	}
	
	
}
