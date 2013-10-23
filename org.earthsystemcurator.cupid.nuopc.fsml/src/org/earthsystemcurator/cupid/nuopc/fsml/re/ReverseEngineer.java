package org.earthsystemcurator.cupid.nuopc.fsml.re;


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

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeQuery;
import org.earthsystemcurator.cupid.nuopc.fsml.util.EcoreUtils;
import org.earthsystemcurator.cupid.nuopc.fsml.util.Regex;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;

@SuppressWarnings("restriction")
public class ReverseEngineer {

	/**
	 * Mapping from a model element to one of:
	 *  - a PhotranVPG (for top level)
	 *  - an IFortranAST (for file level elements, e.g., modules and programs)
	 *  - an IASTNode (for deeper elements)
	 *  
	 */
	private Map<Object, Object> mappings = new IdentityHashMap<Object, Object>();
	
	private NUOPCApplication app = null;
	
	//private Map<IFile, IFortranAST> fileMap = new HashMap<IFile, IFortranAST>();
	
	public NUOPCApplication getLastModel() {
		return app;
	}
	
	public Map<Object, Object> getMappings() {
		return mappings;
	}
	
	//public Map<IFile, IFortranAST> getFileToASTMapping() {
	//	return fileMap;
	//}
	
	public NUOPCApplication reverse(IProject project, PhotranVPG vpg) {
		
		mappings.clear();
		NUOPCApplication a = NUOPCFactory.eINSTANCE.createNUOPCApplication();
		a.setName(project.getName());
		
				
		Set<IFortranAST> asts = new HashSet<IFortranAST>();		
		for (String mod : vpg.listAllModules()) {
			//TODO: fix this - need a way to configure user files and framework files
			if (!mod.toLowerCase().startsWith("nuopc")) {
				List<IFile> fl = vpg.findFilesThatExportModule(mod);
				for (IFile f : fl) {					
					//System.out.println("Module: " + mod + " (" + f.getFullPath() + ")");
					if (f.getProject().equals(project)) {
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
		
		
		a = reverse(asts, a);
		
		//System.out.println("\n=============\nReverse mappings:");
		//for (Entry<Object, Object> e : mappings.entrySet()) {
		//	System.out.println(e.getKey() + " ===> " + e.getValue().getClass());
		//}
		
		//save for later
		this.app = a;
		return a;
		
	}
	
	
	/**
	 * Attempt to map modelElem to an IASTNode or an IFortranAST or a PhotranVPG
	 * 
	 * @param fortranElem an instance of IASTNode or IFortranAST or Set<IFortranAST>
	 * @param modelElem the element we are attempting to map
	 * @return modelElem if successful, otherwise null
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected <ModelElem extends EObject> ModelElem reverse(Object fortranElem, ModelElem modelElem) {
		
		System.out.println("Reverse: " + fortranElem.getClass().getSimpleName() + "\t==>\t" + modelElem.eClass().getName());
			
		EClass modelElemClass = modelElem.eClass();
			
		//this is required so that we can conditionally add mappings
		//that succeeded at the end of the method when no recursive
		//call is required (this only occurs at leaves of metamodel tree)
		Map<Object, Object> mappingsToAdd = new IdentityHashMap<Object, Object>();
		
		//currently does NOT traverse inherited structural features
		for (EStructuralFeature sf : modelElemClass.getEStructuralFeatures()) {
			
			//System.out.println("Stuctural feature: " + sf.getName());
			
			//System.out.println("\tType = " + sf.getEType());
			//System.out.println("\tCurrent val = " + modelElem.eGet(sf));
			//System.out.println("\tGeneric type = " + sf.getEGenericType());							
			
			Map<String, Object> keywordMap = Regex.getMappingFromAnnotation(sf);
						
			if (keywordMap != null && keywordMap.size() > 0) {	
				
				//by convention, first parameter keyword determines code query
				String methodName = (String) keywordMap.keySet().toArray()[0];
				
				//check for metavariables that can be populated
										
				for (Entry<String, Object> entry : keywordMap.entrySet()) {
					if (entry.getValue() instanceof String) {
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
								
											
				//find method that implements code query
				Method method = null;
				for (Method m : CodeQuery.class.getMethods()) {
					if (m.getName().equalsIgnoreCase(methodName)) {
						Class c = m.getParameterTypes()[0];
						if (c.isInstance(fortranElem)) {
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
					Object result = method.invoke(null, fortranElem, keywordMap);
												
					//if (sf.getEType().getName().equals("EString") ||
					//	sf.getEType().getName().equals("EBoolean")) {
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
								newModelElemRet = reverse(newFortranElem, newModelElem);
								
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
					
				} catch (IllegalArgumentException e) {
					e.printStackTrace();					
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
						EObject newModelElemRet = reverse(fortranElem, newModelElem);
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
			//String anotEssential = anot.getDetails().get("essential");
			if (Regex.getIsEssentialFromAnnotation(sf)) {	
				if (modelElem.eGet(sf) == null) {
					System.out.println("\tEssential feature failed: " + sf);
					return null;
				}
				else if (sf.getEType().equals(EcoreFactory.eINSTANCE.getEcorePackage().getEBoolean()) &&
						! (Boolean) modelElem.eGet(sf)) {
					System.out.println("\tEssential feature failed: " + sf);
					return null;
				}		
			}
			
		} // end for structural features
		
		mappings.put(modelElem, fortranElem);
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
