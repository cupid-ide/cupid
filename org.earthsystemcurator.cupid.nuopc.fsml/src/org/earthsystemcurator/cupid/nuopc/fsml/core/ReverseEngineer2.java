package org.earthsystemcurator.cupid.nuopc.fsml.core;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.earthsystemcurator.CupidToEcore;
import org.earthsystemcurator.FSM;
import org.earthsystemcurator.cupid.nuopc.fsml.properties.CupidPropertyPage;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeQuery2;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeTransformation;
import org.earthsystemcurator.cupidLanguage.ConceptDef;
import org.earthsystemcurator.cupidLanguage.CupidLanguageFactory;
import org.earthsystemcurator.cupidLanguage.IDOrWildcard;
import org.earthsystemcurator.cupidLanguage.ImplicitContextMapping;
import org.earthsystemcurator.cupidLanguage.Language;
import org.earthsystemcurator.cupidLanguage.Mapping;
import org.earthsystemcurator.cupidLanguage.PathExpr;
import org.earthsystemcurator.cupidLanguage.SubconceptOrAttribute;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;

@SuppressWarnings("restriction")
public class ReverseEngineer2 {
	 
	
	@SuppressWarnings("unchecked")
	public static FSM reverseEngineer(Language lang, IProject project, PhotranVPG vpg) {
		
		ConceptDef topConcept = null;
		for (ConceptDef cd : lang.getConceptDef()) {
			if (cd.isTop()) {
				topConcept = cd;
				break;
			}
		}
		
		if (topConcept == null) {
			throw new RuntimeException("Language " + lang.getName() + " does not define a top level concept.");
		}
		
		//EPackage should already be registered
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(lang.getUri()); 
		EFactory eFactory = ePackage.getEFactoryInstance();
		EClass topClass = (EClass) ePackage.getEClassifier(topConcept.getName());
		EObject root = eFactory.create(topClass);
		
		
		FSM fsm = new FSM(lang, root, project, CodeTransformation.class);
		
		//a bit of a hack here for the root name
		EStructuralFeature sfName = topClass.getEStructuralFeature("name");
		if (sfName != null) {
			root.eSet(sfName, project.getName());
		}
				
		Set<IFortranAST> asts = new HashSet<IFortranAST>();	
				
		try {
			String fileList = project.getPersistentProperty(CupidPropertyPage.NUOPC_FILES_QN);
			if (fileList != null && fileList.length() > 1) {
				for (String path : fileList.split("\n")) {		
					IFile f = (IFile) project.findMember(path.trim());
					System.out.println("Adding Fortran file: " + path.trim());
					if (f != null) {
						IFortranAST ast = vpg.acquireTransientAST(f);						
						if (ast == null) {
							System.out.println("Warning:  AST not found for file: " + f.getFullPath());
						}
						else {
							asts.add(ast);
						}
					}
					else {
						System.out.println("File not found in project: " + path);
					}
				}
			}
			else {
				for (IResource r : project.members()) {
					//TODO: deal with folders - recursive method
					if (r instanceof IFile) {
						//System.out.println("Full path: " + r.getFullPath());
						//TODO: deal with these file extensions
						if (r.getProjectRelativePath().getFileExtension() != null &&
							(r.getProjectRelativePath().getFileExtension().equalsIgnoreCase("f") ||
							r.getProjectRelativePath().getFileExtension().equalsIgnoreCase("f90"))) {
							System.out.println("Adding Fortran file: " + r);
							IFortranAST ast = vpg.acquireTransientAST((IFile) r);						
							if (ast == null) {
								System.out.println("Warning:  AST not found for file: " + r.getName());
							}
							else {
								asts.add(ast);
							}
						}
					
					}
				}
			}
		} 
		catch (CoreException e1) {
			e1.printStackTrace();
			return fsm;
		}
		
		root = reverse(fsm, asts, topConcept, root, fsm.getMappings(), eFactory);
	
		return fsm;
		
	}
		
	
	
	
	private static Method findREMethod(String methodName, Object context, EObject mapping) {
		for (Method m : CodeQuery2.class.getMethods()) {
			if (m.getName().equalsIgnoreCase(methodName) && m.getParameterTypes().length >= 2) {
				Class contextClass = m.getParameterTypes()[0];
				Class mappingClass = m.getParameterTypes()[1];
				if (contextClass.isInstance(context) &&
					mappingClass.isInstance(mapping)) {
					return m;
				}
			}
		}
		return null;
	}
	
	
	@SuppressWarnings("unchecked")
	private static EObject reverse(FSM fsm, Object fortranElem, ConceptDef conceptDef, EObject modelElem, Map<Object,Object> mappings, EFactory factory) {
		
		//assume a successful mapping (required for looking up mappings during recursive calls)
		//mapping will be removed later if it fails
		mappings.put(modelElem, fortranElem);	
				
		//if (conceptDef == null) {
			//no concept definition, so the mapping survives
		//	return modelElem;
	//	}
		
		
		Map<Object, Object> mappingsToAdd = new IdentityHashMap<Object, Object>();
								
		for (SubconceptOrAttribute subconcept : conceptDef.getChild()) {
		
			//if (subconcept.getName().equalsIgnoreCase("implementsInitP1")) {
			//	System.out.println("implementsInitP1");
			//}
			
			//find structural feature
			EStructuralFeature structuralFeature = modelElem.eClass().getEStructuralFeature(subconcept.getName());
			ConceptDef subconceptDef = null;
			Mapping explicitContextMapping;
			Object fortranContextElem = null;
			
			if (subconcept.isAttrib()) {
				explicitContextMapping = subconcept.getAttribMapping();
			}
			else {
				if (subconcept.isReference()) {
					subconceptDef = subconcept.getRef();
				}
				else {
					subconceptDef = subconcept.getDef();
				}
				explicitContextMapping = subconceptDef.getMapping();
			}
			
			//explicitContextMapping = subconceptDef.getMapping();
			
			if (explicitContextMapping != null) {
			
				explicitContextMapping.setMapping((ImplicitContextMapping) fsm.replacePathExprWithValues(explicitContextMapping.getMapping(), modelElem));
			
				if (explicitContextMapping.getContext() != null) {
					//explicit context
					EObject contextElement = (EObject) fsm.getValueFromModel(explicitContextMapping.getContext(), modelElem, (EObject) null);
					//if (contextElement == null) {
					//	throw new RuntimeException("No element for path expression: " + explicitContextMapping.getContext());
					//}
					fortranContextElem = mappings.get(contextElement);
					//if (fortranContextElem == null) {
					//	throw new RuntimeException("No Fortran context for element: " + contextElement);
					//}
				}
				else {
					fortranContextElem = fortranElem;  //implicit
				}
				
				String methodName = explicitContextMapping.getMapping().eClass().getName();
				
				if (fortranContextElem != null) {
					//if there is no context element, then we cannot execute the query
					//if it is an essential subconcept, then this mapping will fail below
					
					//find method that implements code query
					Method method = findREMethod(methodName, fortranContextElem, explicitContextMapping.getMapping());
					if (method == null) {
						System.out.println("Method not found: " + methodName + " : " + fortranContextElem.getClass().getName() + ", " + explicitContextMapping.getMapping().getClass().getName() );
						continue;
					}
				
					Object result = null;
					try {
						result = method.invoke(null, fortranContextElem, explicitContextMapping.getMapping());
					} catch (IllegalAccessException e) {
						throw new RuntimeException(e);
					} catch (InvocationTargetException e) {
						throw new RuntimeException(e);
					}	
													
					if (method.getReturnType() == String.class ||
						method.getReturnType().isPrimitive()) {
						modelElem.eSet(structuralFeature, result);
					}
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
					else if (method.getReturnType() == Set.class ||
							 method.getReturnType() == Map.class) {
												
						//do we have a set of primitives?
						if (subconcept.isAttrib()) {
							Set<String> resultSet;
							if (result instanceof Map) {
								resultSet = (Set<String>) ((Map) result).keySet();
								//TODO: ignoring PathExprs for now
							}
							else {
								resultSet = (Set<String>) result;
							}
							for (String res : resultSet) {
								if (structuralFeature.isMany()) {
									EList el = (EList) modelElem.eGet(structuralFeature);
									el.add(res);
								}
								else {
									modelElem.eSet(structuralFeature, res);
									break;  //just take first one
								}
							}
						}
						//result is a set of objects - either IASTNodes or IFortranASTs
						else {
							
							Set<Object> resultSet = null;
							if (result instanceof Map) {
								resultSet = ((Map) result).keySet();
							}
							else {
								resultSet = (Set<Object>) result;
							}
							
							for (Object newFortranElem : resultSet) {
								
								EObject newModelElem = factory.create((EClass) structuralFeature.getEType());
								
								//set binding in model
								if (result instanceof Map) {
									Map<PathExpr, String> bindings = ((Map<?, Map<PathExpr, String>>) result).get(newFortranElem);
									if (bindings != null) {
										for (Entry<PathExpr, String> binding : bindings.entrySet()) {
											fsm.setValueInModel(binding.getKey(), newModelElem, binding.getValue());
											//if (!featureSet) {
											//	System.out.println("Feature not set: " + binding.getKey());
											//}
										}
									}
								}
								
								// set up parent relationship for references (may be removed later)									
								if (structuralFeature.isMany()) {
									EList el = (EList) modelElem.eGet(structuralFeature);
									el.add(newModelElem);
								}
								else {
									modelElem.eSet(structuralFeature, newModelElem);
								}
																
								//recursive call
								EObject newModelElemRet = reverse(fsm, newFortranElem, subconceptDef, newModelElem, mappings, factory);
								
								// if NULL returned, then mapping failed, so remove element from parent
								if (newModelElemRet == null) {
									if (structuralFeature.isMany()) {
										EList el = (EList) modelElem.eGet(structuralFeature);
										el.remove(newModelElem);
									}
									else {
										//TODO: consider replacing with previous value?
										modelElem.eUnset(structuralFeature);
									}
								}
								else if (!structuralFeature.isMany()) {
									if (resultSet.size() > 1) {
										System.out.println("Warning: Some matching elements ignored because subconcept is singular: " + subconcept.getName());
									}
									break; // take first one that is not null
								}									
							
							}
								
						} // end check for primitives vs. objects in results
						
			}				
				}
			}
			else if (!subconcept.isAttrib()) {
				//this means there is no mapping defined - if it is an EReference (non-attribute), then we create 
				//the target and its children determine whether the mapping holds
				//in other words, this is just an extra layer of abstraction defined by the user
						
				EObject newModelElem = factory.create((EClass) structuralFeature.getEType());
				if (structuralFeature.isMany()) {
					EList el = (EList) modelElem.eGet(structuralFeature);
					el.add(newModelElem);
				}
				else {
					modelElem.eSet(structuralFeature, newModelElem);
				}
				EObject newModelElemRet = reverse(fsm, fortranElem, subconceptDef, newModelElem, mappings, factory);
				if (newModelElemRet == null) {
					if (structuralFeature.isMany()) {
						EList el = (EList) modelElem.eGet(structuralFeature);
						el.remove(newModelElem);
					}
					else {
						//consider replacing with previous value
						modelElem.eUnset(structuralFeature);
					}
				}
			}
			
			//at this point we have set the value of the structural feature
			//if is essential, but not present or false, the parent is no good
			
			if (subconcept.isEssential()) {	
				boolean fail = false;
				
				if (modelElem.eGet(structuralFeature) == null) {					
					fail = true;
				}
				else if (structuralFeature.getEType().equals(EcoreFactory.eINSTANCE.getEcorePackage().getEBoolean()) &&
						! (Boolean) modelElem.eGet(structuralFeature)) {
					fail = true;
				}
				
				if (fail) {
					System.out.println("Essential feature failed:");
					System.out.println("\tSubconcept: " + subconcept.getName());
					System.out.println("\tModel Element: " + modelElem);
					//System.out.println("\tFortran Element: " + fortranContextElem);
					mappings.remove(modelElem);
					//an essential feature failed, so no need to process 
					//any more structural features
					return null;
				}
				
			}
			
			
		} // end for structural features
		
		mappings.putAll(mappingsToAdd);

		return modelElem;
		
	}
	
	
}
