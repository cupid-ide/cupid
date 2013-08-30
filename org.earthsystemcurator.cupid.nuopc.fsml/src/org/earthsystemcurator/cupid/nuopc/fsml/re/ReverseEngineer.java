package org.earthsystemcurator.cupid.nuopc.fsml.re;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeQuery;
import org.earthsystemcurator.cupid.nuopc.fsml.util.Regex;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.IASTNode;

@SuppressWarnings("restriction")
public class ReverseEngineer {

	
	public NUOPCModel reverse(IFortranAST ast) {
		//bootstrap process
		NUOPCModel m =  NUOPCFactory.eINSTANCE.createNUOPCModel();

		ASTModuleNode contextNode = ast.getRoot().findFirst(ASTModuleNode.class);
		return reverseContext(contextNode, m);
	}
	
	public <ModelElem extends EObject> ModelElem reverseContext(IASTNode contextNode, ModelElem modelElem) {
					
			
		EClass modelElemClass = modelElem.eClass();
		//EAnnotation ann = modelClass.getEAnnotation("http://www.earthsystemcog.org/projects/nuopc");
		//String query = ann.getDetails().get("query");
		//System.out.println("query = " + query);		
		
		//currently does NOT traverse inherited structural features
		for (EStructuralFeature sf : modelElemClass.getEStructuralFeatures()) {
			
			System.out.println("Stuctural feature: " + sf.getName());
			
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
					//by default, first parameter keyword determines code query
					methodName = (String) keywordMap.keySet().toArray()[0];
				}
				
				//System.out.println("Query map:");
				//for (String k : queryMap.keySet().toArray(arg0)) {
					//if (methodName == null) methodName = k;
					//System.out.println("\t " + k + " --> " + queryMap.get(k));
				//}
								
				for (Method method : CodeQuery.class.getMethods()) {
					
					if (method.getName().equals(methodName)) {
						System.out.println("\tFound matching method: " + method);
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
							
							System.out.println("\tInvocation returned: " + result);
							
							//if (sf.getEType().getName().equals("EString") ||
							//	sf.getEType().getName().equals("EBoolean")) {
							if (method.getReturnType() == String.class ||
								method.getReturnType().isPrimitive()) {
								modelElem.eSet(sf, result);
							}
							else if (method.getReturnType() == Set.class) {
								//assume it is an EClass
								Set<IASTNode> resultSet = (Set<IASTNode>) result;
								
								for (IASTNode newContextNode : resultSet) {
									
									EObject newModelElem = NUOPCFactory.eINSTANCE.create((EClass) sf.getEType());
									EObject newModelElemRet = null;
									
									// set up parent relationship (may be removed later)									
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
									
									/*
									if (newModelElem != null) {
	
										//multi-valued?
										if (sf.isMany()) {
											EList el = (EList) modelElem.eGet(sf);
											el.add(newModelElem);
										}
										else {
											modelElem.eSet(sf, newModelElem);
											break; // take first one that is not null
										}
											
									}
									*/
								}
								
							}
							
						} catch (IllegalArgumentException e) {
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							e.printStackTrace();
						}
						
						break;  //from for loop
					}
				} // end for
							
				
			} // end if that checks for query string
			
			//at this point we have set the value of the structural feature
			//if is essential, but not present or false, the parent is no good
			String anotEssential = anot.getDetails().get("essential");
			if (anotEssential != null && anotEssential.trim().equalsIgnoreCase("true")) {
				System.out.println("\tEssential feature found: " + sf);
				if (modelElem.eGet(sf) == null || !(Boolean) modelElem.eGet(sf)) {
					System.out.println("\tEssential feature failed: " + sf);
					return null;
				}
		
			}
			
		} // end for structural features
		
		
		return modelElem;
	}
	

}
