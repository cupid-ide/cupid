package org.earthsystemcurator.cupid.nuopc.fsml.re;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeQuery;
import org.earthsystemcurator.cupid.nuopc.fsml.util.Regex;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;

@SuppressWarnings("restriction")
public class ReverseEngineer {

	private Map<EObject, IASTNode> mappings = new HashMap<EObject, IASTNode>();
	private Map<IFile, IFortranAST> fileMap = new HashMap<IFile, IFortranAST>();
	
	public Map<EObject, IASTNode> getMappings() {
		return mappings;
	}
	
	public Map<IFile, IFortranAST> getFileToASTMapping() {
		return fileMap;
	}
	
	public NUOPCApplication reverse(PhotranVPG vpg) {
		
		mappings.clear();
		NUOPCApplication a = NUOPCFactory.eINSTANCE.createNUOPCApplication();
		
		for (String mod : vpg.listAllModules()) {
			List<IFile> fl = vpg.findFilesThatExportModule(mod);
			for (IFile f : fl) {			
				//cycle through all files for now...
				System.out.println("Module: " + mod + " (" + f.getFullPath() + ")");
				IFortranAST ast = vpg.acquireTransientAST(f);
				a = reverseContext(ast.getRoot(), a);
				//mappings.put(a, ast.getRoot());
				
				//TODO: optimize to only include updated files
				fileMap.put(f, ast);
			}
		}
		
		//System.out.println("\n=============\nReverse mappings:");
		//for (Entry<EObject, IASTNode> e : mappings.entrySet()) {
		//	System.out.println(e.getKey() + " ===> " + e.getValue().getClass());
		//}
		
		return a;
	}
	
	/*
	public NUOPCModel reverse(IFortranAST ast) {
		//bootstrap process
		NUOPCModel m =  NUOPCFactory.eINSTANCE.createNUOPCModel();

		ASTModuleNode contextNode = ast.getRoot().findFirst(ASTModuleNode.class);
		return reverseContext(contextNode, m);
	}
	*/
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected <ModelElem extends EObject> ModelElem reverseContext(IASTNode contextNode, ModelElem modelElem) {
					
			
		EClass modelElemClass = modelElem.eClass();
		//EAnnotation ann = modelClass.getEAnnotation("http://www.earthsystemcog.org/projects/nuopc");
		//String query = ann.getDetails().get("query");
		//System.out.println("query = " + query);		
		
		//currently does NOT traverse inherited structural features
		for (EStructuralFeature sf : modelElemClass.getEStructuralFeatures()) {
			
			//System.out.println("Stuctural feature: " + sf.getName());
			
			//System.out.println("\tType = " + sf.getEType());
			//System.out.println("\tCurrent val = " + modelElem.eGet(sf));
			//System.out.println("\tGeneric type = " + sf.getEGenericType());
					
			EAnnotation anot = sf.getEAnnotation("http://www.earthsystemcog.org/projects/nuopc");
			if (anot == null) {
				continue;  //no code queries, cannot proceed
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
						
			String sfMapping = anot.getDetails().get("mapping");
			
			if (sfMapping != null) {
				
				//just handles one parameter for now
				
				//String[] sfQuerySplit = sfQuery.split("\\s*:\\s*");
				//String methodName = sfQuerySplit[0].trim();
				//String params = null;
				//if (sfQuerySplit.length==2)
				//	params = sfQuerySplit[1].trim();
				
				Map<String, Object> keywordMap = Regex.parseMappingExpression(sfMapping);
				String methodName = null;
				if (keywordMap.size() > 0) {
					//by convention, first parameter keyword determines code query
					methodName = (String) keywordMap.keySet().toArray()[0];
					
					//check for metavariables that can be populated
					for (Entry<String, Object> entry : keywordMap.entrySet()) {
						if (entry.getValue() instanceof String) {
							String val = (String) entry.getValue();
							if (val.startsWith("#")) {
								//replace metavariable with value from model
								System.out.println("Metavariable: " + val);
								EStructuralFeature metasf = modelElem.eClass().getEStructuralFeature(val.substring(1));
								Object metaval = modelElem.eGet(metasf);
								if (metaval != null) {
									System.out.println("\tMetavariable value = " + metaval);
									entry.setValue(metaval);
								}
							}
						}
					}				
				}
				
				//System.out.println("Query map:");
				//for (String k : queryMap.keySet().toArray(arg0)) {
					//if (methodName == null) methodName = k;
					//System.out.println("\t " + k + " --> " + queryMap.get(k));
				//}
				
				//TODO: change to direct search
				for (Method method : CodeQuery.class.getMethods()) {
					
					if (method.getName().equals(methodName)) {
						//System.out.println("\tFound matching method: " + method);
						//System.out.println("\t\tReturn type: " + method.getReturnType());
						//System.out.println("\t\tGeneric return type: " + method.getGenericReturnType());
						
						//try {
							//System.out.println("\t\tGeneric return type parameter 0: " + ((ParameterizedType) method.getGenericReturnType()).getActualTypeArguments()[0]);
						//} catch (Exception e) {}
						
						try {
							
							Object result;
							if (method.getParameterTypes().length == 2) {
								result = method.invoke(null, contextNode, keywordMap);
							}
							else {
								result = method.invoke(null, contextNode);
							}
														
							//if (sf.getEType().getName().equals("EString") ||
							//	sf.getEType().getName().equals("EBoolean")) {
							if (method.getReturnType() == String.class ||
								method.getReturnType().isPrimitive()) {
								modelElem.eSet(sf, result);
							}
							else if (method.getReturnType() == Set.class) {
														
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
								//result is a set of objects
								else {
									
									Set<IASTNode> resultSet = (Set<IASTNode>) result;
									
									for (IASTNode newContextNode : resultSet) {
										
										EObject newModelElem = NUOPCFactory.eINSTANCE.create((EClass) sf.getEType());
										EObject newModelElemRet = null;
										
										// set up parent relationship for references (may be removed later)									
										if (sf.isMany()) {
											EList el = (EList) modelElem.eGet(sf);
											el.add(newModelElem);
										}
										else {
											modelElem.eSet(sf, newModelElem);
										}
																		
										//recursive call
										newModelElemRet = reverseContext(newContextNode, newModelElem);
										
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
						
						break;  //from for loop because we found method
					}
				} // end for
							
				
			} // end if that checks for query string
			
			//at this point we have set the value of the structural feature
			//if is essential, but not present or false, the parent is no good
			String anotEssential = anot.getDetails().get("essential");
			if (anotEssential != null && anotEssential.trim().equalsIgnoreCase("true")) {	
				if (modelElem.eGet(sf) == null) {
					//System.out.println("\tEssential feature failed: " + sf);
					return null;
				}
				else if (sf.getEType().equals(EcoreFactory.eINSTANCE.getEcorePackage().getEBoolean()) &&
						! (Boolean) modelElem.eGet(sf)) {
					//System.out.println("\tEssential feature failed: " + sf);
					return null;
				}		
			}
			
		} // end for structural features
		
		mappings.put(modelElem, contextNode);
		return modelElem;
	}
	

}
