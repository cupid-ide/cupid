package org.earthsystemcurator.cupid.nuopc.fsml.core;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;

import org.earthsystemcurator.CupidLanguageStandaloneSetup;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory;
import org.earthsystemcurator.cupid.nuopc.fsml.properties.CupidPropertyPage;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeQuery;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeQuery2;
import org.earthsystemcurator.cupid.nuopc.fsml.util.EcoreUtils;
import org.earthsystemcurator.cupid.nuopc.fsml.util.Regex;
import org.earthsystemcurator.cupidLanguage.Call;
import org.earthsystemcurator.cupidLanguage.CupidLanguageFactory;
import org.earthsystemcurator.cupidLanguage.IDOrPathExpr;
import org.earthsystemcurator.cupidLanguage.IDOrWildcard;
import org.earthsystemcurator.cupidLanguage.ImplicitContextMapping;
import org.earthsystemcurator.cupidLanguage.Mapping;
import org.earthsystemcurator.cupidLanguage.PathExpr;
import org.eclipse.cdt.core.model.ITranslationUnit;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class ReverseEngineer {

	//private Map<Object, Object> mappings = new IdentityHashMap<Object, Object>();
	
	//private NUOPCApplication app = null;
	
	//private Map<IFile, IFortranAST> fileMap = new HashMap<IFile, IFortranAST>();
	
	//public NUOPCApplication getLastModel() {
	//	return app;
	//}
	
	//public Map<Object, Object> getMappings() {
	//	return mappings;
	//}
	
		
	@SuppressWarnings("unchecked")
	public static FSM reverseEngineer(EPackage ePackage, EClass eClass, IProject project, PhotranVPG vpg) {
			
		EFactory eFactory = ePackage.getEFactoryInstance();
		EObject root = eFactory.create(eClass);
		
		FSM fsm = new FSM(root, project);
		
		//a bit of a hack here for the root name
		EStructuralFeature sfName = eClass.getEStructuralFeature("name");
		if (sfName != null) {
			root.eSet(sfName, project.getName());
		}
		
				
		//Set<String> filesToConsider = new HashSet<String>();
		
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
		
			
		/*
		try {
			for (IResource r : project.members()) {
				//TODO: deal with folders - recursive method
				if (r instanceof IFile) {
					System.out.println("Full path: " + r.getFullPath());
					if (filesToConsider.size() == 0 || filesToConsider.contains(r.getFullPath().toString())) {
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
		} catch (CoreException e) {
			
			e.printStackTrace();
		}
		*/
		
		/*
		for (String mod : vpg.listAllModules()) {
			//TODO: fix this - need a way to configure user files and framework files
			if (!mod.toLowerCase().startsWith("nuopc")) {
				List<IFile> fl = vpg.findFilesThatExportModule(mod);
				for (IFile f : fl) {					
					//System.out.println("Module: " + mod + " (" + f.getName() + ") " + f.getProject().getName());
					if (filesToConsider.contains(f.getName()) && f.getProject().equals(project)) {
						System.out.println("Adding Fortran file: " + f);
						IFortranAST ast = vpg.acquireTransientAST(f);						
						if (ast == null) {
							System.out.println("Warning:  AST not found for file: " + f.getName());
						}
						else {
							asts.add(ast);
						}
					}
				}
			}
		}
		*/
		
		root = reverse(asts, root, fsm.getMappings());
		
		//System.out.println("\n=============\nReverse mappings:");
		//for (Entry<Object, Object> e : mappings.entrySet()) {
		//	System.out.println(e.getKey() + " ===> " + e.getValue().getClass());
		//}
		
		return fsm;
		
	}
	
	//private static XtextResourceSet xtextResourceSet = null;
	//private static Resource xTextResource = null;
	private static Injector injector = new CupidLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	
	public static Mapping parseMappingNew(String mappingNew) {
		
		//TODO: efficiency
		if (injector == null) {
			injector = new CupidLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();	
		}
		
		XtextResourceSet xtextResourceSet = injector.getInstance(XtextResourceSet.class);
		xtextResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource xTextResource = xtextResourceSet.createResource(URI.createURI("dummy:/dummy.cupid"));
		
		InputStream in = new ByteArrayInputStream(mappingNew.getBytes());
		try {
			xTextResource.load(in, xtextResourceSet.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Mappings mappings = (Mappings) xTextResource.getContents().get(0);
		
		//return mappings.getMappings().get(0);
		return null;
	}
	
	
	
	/**
	 * Looks for instances of PathExpr in the mappingElement tree and, when possible,
	 * replaces them with values from the context
	 * 
	 * @param mappingElement
	 * @param context
	 */
	public static <T extends EObject> T replacePathExprWithValues(T mappingElement, EObject context, boolean isParent) {
		if (mappingElement == null) {
			return null;
		}
		else if (mappingElement instanceof PathExpr) {
			String replaceVal = EcoreUtils.eGetSFValue((PathExpr) mappingElement, context, isParent, null);
			if (replaceVal != null) {
				IDOrWildcard replaceValObj = CupidLanguageFactory.eINSTANCE.createIDOrWildcard();
				replaceValObj.setId(replaceVal);
				return (T) replaceValObj;
			}			
		}
		else {
			for (EReference ref : mappingElement.eClass().getEReferences()) {
				if (!ref.isMany()) {
					mappingElement.eSet(ref, replacePathExprWithValues((EObject) mappingElement.eGet(ref), context, isParent));
				}
				else {
					EList refList = (EList) mappingElement.eGet(ref);
					for (int i = 0; i < refList.size(); i++) {
						refList.set(i, replacePathExprWithValues((EObject) refList.get(i), context, isParent));
					}
				}
			}
		}
		return mappingElement;		
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
	
	/**
	 * Attempt to map modelElem to an IASTNode or an IFortranAST or a PhotranVPG
	 * 
	 * @param fortranElem an instance of IASTNode or IFortranAST or Set<IFortranAST>
	 * @param modelElem the element we are attempting to map
	 * @return modelElem if successful, otherwise null
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static <ModelElem extends EObject> ModelElem reverse(Object fortranElem, ModelElem modelElem, Map<Object,Object> mappings) {
		
		EClass modelElemClass = modelElem.eClass();
			
		//this is required so that we can conditionally add mappings
		//that succeeded at the end of the method when no recursive
		//call is required (this only occurs at leaves of metamodel tree)
		Map<Object, Object> mappingsToAdd = new IdentityHashMap<Object, Object>();
		
		//assume a successful mapping (required for looking up
		//mappings during recursive calls)
		//mapping will be removed later if it fails
		mappings.put(modelElem, fortranElem);	
		
						
		for (EStructuralFeature sf : modelElemClass.getEAllStructuralFeatures()) {
			
			Map<String, Object> keywordMap = Regex.getMappingFromAnnotation(sf);
			
			/////NEW MAPPING PARSER HERE
						
			EAnnotation ann = sf.getEAnnotation("http://www.earthsystemcog.org/projects/nuopc");
			if (ann != null && ann.getDetails().get("mappingNew") != null) {
				String mappingNew = ann.getDetails().get("mappingNew");
				//if (mappingNew != null) {
				Mapping mapping = parseMappingNew(mappingNew);
				Object fortranContextElem;
				
				if (mapping.getContext() != null) {
					//explicit context
					EObject contextElement = EcoreUtils.eGetSFValue(mapping.getContext(), modelElem, true, null);
					fortranContextElem = mappings.get(contextElement);
					if (fortranContextElem == null) {
						throw new RuntimeException("No Fortran context for element: " + contextElement);
					}
				}
				else {
					fortranContextElem = fortranElem;  //implicit
				}
				
				ImplicitContextMapping icMapping = mapping.getMapping();
				icMapping = replacePathExprWithValues(icMapping, modelElem, true);
				
				String methodName = icMapping.eClass().getName().toLowerCase();
				
				//find method that implements code query
				Method method = findREMethod(methodName, fortranContextElem, icMapping);
				if (method == null) {
					System.out.println("Method not found: " + methodName);
					continue;
				}
				
				
				try {
					
					Object result = method.invoke(null, fortranContextElem, icMapping);
												
					if (method.getReturnType() == String.class ||
						method.getReturnType().isPrimitive()) {
						modelElem.eSet(sf, result);
					}
					else if (method.getReturnType() == Token.class) {
						if (result != null) {
							//String constructor required because of IdentityHashMap
							String text = new String(((Token)result).getText());
							modelElem.eSet(sf, text);
							mappingsToAdd.put(text, result);
						}
						else {
							//what should we do here?
							modelElem.eSet(sf, null);
						}
					}
					else if (method.getReturnType() == Set.class ||
							 method.getReturnType() == Map.class) {
												
						//do we have a set of primitives?
						if (sf.getEType().equals(EcoreFactory.eINSTANCE.getEcorePackage().getEString())) {
							Set<String> resultSet;
							if (result instanceof Map) {
								resultSet = (Set<String>) ((Map) result).keySet();
								//TODO: ignoring PathExprs for now
							}
							else {
								resultSet = (Set<String>) result;
							}
							for (String res : resultSet) {
								if (sf.isMany()) {
									EList el = (EList) modelElem.eGet(sf);
									el.add(res);
								}
								else {
									modelElem.eSet(sf, res);
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
								
								EObject newModelElem = NUOPCFactory.eINSTANCE.create((EClass) sf.getEType());
								
								//set binding in model
								if (result instanceof Map) {
									Map<PathExpr, String> bindings = ((Map<?, Map<PathExpr, String>>) result).get(newFortranElem);
									for (Entry<PathExpr, String> binding : bindings.entrySet()) {
										boolean featureSet = EcoreUtils.eSetSFValue(binding.getKey(), newModelElem, binding.getValue());
										if (!featureSet) {
											System.out.println("Feature not set: " + binding.getKey());
										}
									}
								}
								
								// set up parent relationship for references (may be removed later)									
								if (sf.isMany()) {
									EList el = (EList) modelElem.eGet(sf);
									el.add(newModelElem);
								}
								else {
									modelElem.eSet(sf, newModelElem);
								}
																
								//recursive call
								EObject newModelElemRet = reverse(newFortranElem, newModelElem, mappings);
								
								// if NULL returned, then mapping failed, so remove element from parent
								if (newModelElemRet == null) {
									if (sf.isMany()) {
										EList el = (EList) modelElem.eGet(sf);
										el.remove(newModelElem);
									}
									else {
										//TODO: consider replacing with previous value?
										modelElem.eUnset(sf);
									}
								}
								else if (!sf.isMany()) {
									break; // take first one that is not null
								}									
							
							}
								
						} // end check for primitives vs. objects in results
						
					}
					
				} catch (IllegalAccessException e) {
					throw new RuntimeException(e);
				} catch (InvocationTargetException e) {
					throw new RuntimeException(e);
				}						
				
			}
			
			
			
			
			
			
			
			
			////END OF NEW MAPPING PARSER
			
			
						
			else if (keywordMap != null && keywordMap.size() > 0) {	
				
				String methodName = Regex.getMappingTypeFromAnnotation(sf);
				
				//populate metavariables						
				for (Entry<String, Object> entry : keywordMap.entrySet()) {
					//TODO: should we handle different metavariable types here?
					// or just strings?
					if (!entry.getKey().equals("_context") && entry.getValue() instanceof String) {
						String val = (String) entry.getValue();
						
						Matcher match = CodeQuery.P_METAVAR.matcher(val);
						while (match.find()) {
							//already at parent, so remove one leading ../
					
							String metavar = match.group().substring(1);
							if (metavar.startsWith("../")) { 
								metavar = metavar.substring(3);
								
								//TODO: decide what to do about NULL_VALUE below
								String replaceVal = EcoreUtils.eGetSFValue(metavar, modelElem, null);
								if (replaceVal != null) {
									System.out.println("Replacing metavariable: " + match.group() + " with val: " + replaceVal);
									entry.setValue(val.replaceAll(match.group(), replaceVal));
								}
								
							}
						}
					}
				}
				
				Object fortranContextElem;
				
				if (keywordMap.containsKey("_context")) {
					//explicit context provided
					String contextPath = (String) keywordMap.get("_context");
					if (!contextPath.startsWith("#..")) {
						//error
						System.out.println("Explicit context path must contain parent node");
						return null;
					}
					
					if (contextPath.startsWith("#../")) {
						contextPath = contextPath.substring(4);
					}
					else if (contextPath.startsWith("#..")) {
						contextPath = contextPath.substring(3);
					}
					
					EObject explicitContextElem;
					if (contextPath.equals("")) {
						explicitContextElem = modelElem;
					}
					else {
						explicitContextElem = EcoreUtils.eGetSFValue(contextPath, modelElem, null);
					}
					
					fortranContextElem = mappings.get(explicitContextElem);
					if (fortranContextElem == null) {
						System.out.println("MAPPED fortran element not found: " + explicitContextElem);
						return null;
					}
				}
				else {
					//implicit context
					fortranContextElem = fortranElem;
				}
				
				
				//find method that implements code query
				Method method = null;
				for (Method m : CodeQuery.class.getMethods()) {
					if (m.getName().equalsIgnoreCase(methodName)) {
						Class contextClass = m.getParameterTypes()[0];
						Class paramClass = m.getParameterTypes()[1];						
						if (contextClass.isInstance(fortranContextElem) &&
							paramClass.isInstance(keywordMap)) {
							method = m;
							break;
						}
					}
				}
				
				if (method == null) {
					System.out.println("Method not found: " + methodName);
					continue;
				}
												
				try {
					//System.out.println("Calling method: " + methodName + " with first param: " + fortranElem.getClass());							
					
					Object result = method.invoke(null, fortranContextElem, keywordMap);
												
					if (method.getReturnType() == String.class ||
						method.getReturnType().isPrimitive()) {
						modelElem.eSet(sf, result);
					}
					else if (method.getReturnType() == Token.class) {
						if (result != null) {
							//String constructor required because of IdentityHashMap
							String text = new String(((Token)result).getText());
							modelElem.eSet(sf, text);
							mappingsToAdd.put(text, result);
						}
						else {
							//what should we do here?
							modelElem.eSet(sf, null);
						}
					}
					else if (method.getReturnType() == Set.class ||
							 method.getReturnType() == Map.class) {
												
						//do we have a set of primitives?
						if (sf.getEType().equals(EcoreFactory.eINSTANCE.getEcorePackage().getEString())) {
							Set<String> resultSet = (Set<String>) result;
							for (String res : resultSet) {
								if (sf.isMany()) {
									EList el = (EList) modelElem.eGet(sf);
									el.add(res);
								}
								else {
									modelElem.eSet(sf, res);
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
								
								EObject newModelElem = NUOPCFactory.eINSTANCE.create((EClass) sf.getEType());
								EObject newModelElemRet = null;
								
								//TODO: work on precedence between metavariables and explicit sub-mappings
								//populate attributes based on metavariables
								if (result instanceof Map) {
									Map<String,String> metavariableMap = (Map<String,String>) ((Map) result).get(newFortranElem);
									for (Entry<String,String> mve : metavariableMap.entrySet()) {
										String attribName = mve.getKey().substring(1);
										EStructuralFeature attribSF = newModelElem.eClass().getEStructuralFeature(attribName);
										if (attribSF != null) {
											//System.out.println("Metavariable - setting feature: " + attribName + " to " + mve.getValue());
											newModelElem.eSet(attribSF, mve.getValue());
										}
										else {
											//System.out.println("Metavariable - feature not found: " + attribName);
										}
									}
								}
								
								// set up parent relationship for references (may be removed later)									
								if (sf.isMany()) {
									EList el = (EList) modelElem.eGet(sf);
									el.add(newModelElem);
								}
								else {
									modelElem.eSet(sf, newModelElem);
								}
																
								//recursive call
								newModelElemRet = reverse(newFortranElem, newModelElem, mappings);
								
								// if NULL returned, then remove model element from parent
								if (newModelElemRet == null) {
									if (sf.isMany()) {
										EList el = (EList) modelElem.eGet(sf);
										el.remove(newModelElem);
									}
									else {
										//consider replacing with previous value
										modelElem.eUnset(sf);
									}
								}
								else if (!sf.isMany()) {
									break; // take first one that is not null
								}									
							
							}
								
						} // end check for primitives vs. objects in results
						
					}
					
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}						
						
				
			} // end if that checks for query string
			else {
				//this means there is no mapping defined - if it is an EReference, then we create 
				//the target and its children determine whether the mapping holds
				//in other words, this is just an extra layer of abstraction defined by the user
				
				if (sf instanceof EReference) {
					if (((EReference) sf).isContainment()) {
						EObject newModelElem = NUOPCFactory.eINSTANCE.create((EClass) sf.getEType());
						if (sf.isMany()) {
							EList el = (EList) modelElem.eGet(sf);
							el.add(newModelElem);
						}
						else {
							modelElem.eSet(sf, newModelElem);
						}
						EObject newModelElemRet = reverse(fortranElem, newModelElem, mappings);
						if (newModelElemRet == null) {
							if (sf.isMany()) {
								EList el = (EList) modelElem.eGet(sf);
								el.remove(newModelElem);
							}
							else {
								//consider replacing with previous value
								modelElem.eUnset(sf);
							}
						}
					}
				}
				
			}
			
			//at this point we have set the value of the structural feature
			//if is essential, but not present or false, the parent is no good
			
			if (Regex.getIsEssentialFromAnnotation(sf)) {	
				boolean fail = false;
				
				if (modelElem.eGet(sf) == null) {					
					fail = true;
				}
				else if (sf.getEType().equals(EcoreFactory.eINSTANCE.getEcorePackage().getEBoolean()) &&
						! (Boolean) modelElem.eGet(sf)) {
					fail = true;
				}
				
				if (fail) {
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
	
	
	
	
	
	
	/*********** OCL **************/
	/*
	String oclQuery = anot.getDetails().get("ocl");
	if (oclQuery != null) {
		
		System.out.println("Evaluating OCL expression: " + oclQuery);
		
		//boolean valid;
		OCLExpression<EClassifier> oclexp = null;

		try {
		    // create an OCL instance for Ecore
		    OCL<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, Constraint, EClass, EObject> ocl;
		    ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		    
		    // create an OCL helper object
		    OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		    
		    // set the OCL context classifier
		    //helper.setContext(EXTLibraryPackage.Literals.WRITER);
		    helper.setContext(modelElemClass);
		    
		    oclexp = helper.createQuery(oclQuery);
		    
		    Query<EClassifier, EClass, EObject> eval = ocl.createQuery(oclexp);
		    Object result = eval.evaluate(modelElem);
		    System.out.println("\tOCL result: " + result);
		    
		    modelElem.eSet(sf, result);
		    
		} catch (ParserException e) {
		    e.printStackTrace();
		}
		
		
		
		
	}
	*/
	
	
	/*********** OCL **************/

}
