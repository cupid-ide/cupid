package org.earthsystemcurator.cupid.nuopc.fsml.re;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeQuery;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.analysis.types.DerivedType;
import org.eclipse.photran.internal.core.analysis.types.Type;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTIntConstNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineArgNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTVisitor;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.parser.IASTVisitor;

@SuppressWarnings("restriction")
public class ReverseEngineer {

	
	public Model reverse(IFortranAST ast) {
		//bootstrap process
		Model m =  NUOPCFactory.eINSTANCE.createModel();

		ASTModuleNode contextNode = ast.getRoot().findFirst(ASTModuleNode.class);
		return reverseContext(contextNode, m);
	}
	
	public <ModelElem extends EObject> ModelElem reverseContext(IASTNode contextNode, ModelElem modelElem) {
					
			
		EClass modelElemClass = modelElem.eClass();
		//EAnnotation ann = modelClass.getEAnnotation("http://www.earthsystemcog.org/projects/nuopc");
		//String query = ann.getDetails().get("query");
		//System.out.println("query = " + query);		
		
		//current does NOT traverse inherited structural features
		for (EStructuralFeature sf : modelElemClass.getEStructuralFeatures()) {
			
			System.out.println("Stuctural feature: " + sf.getName());
			System.out.println("\tType = " + sf.getEType());
			System.out.println("\tCurrent val = " + modelElem.eGet(sf));
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
			
			
			String sfQuery = anot.getDetails().get("query");
			//if (sfQuery == null || sfQuery.trim().equals("")) {
			//	continue;
			//}
			
			//System.out.println("\tquery = " + sfQuery);
			
			
			
			//String[] params = null;
			//if (sfQuerySplit.length == 2) {
			//	params = sfQuerySplit[1].split(",");
			//	for (int i=0; i<params.length; i++) {
			//		params[i] = params[i].trim();
			//	}
			//}
						
			if (sfQuery != null) {
				
				//just handles one parameter for now
				String[] sfQuerySplit = sfQuery.split("\\s*:\\s*");
				String methodName = sfQuerySplit[0].trim();
				String params = null;
				if (sfQuerySplit.length==2)
					params = sfQuerySplit[1].trim();
				
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
							if (params != null) {
								result = method.invoke(null, contextNode, params);
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
	
	public Model reverse2 (IFortranAST ast) {
		
		final Model m =  NUOPCFactory.eINSTANCE.createModel();
		
		IASTVisitor revisit = new ASTVisitor() {
						
//			@Override
//			public void visitASTNode(IASTNode node) {
//				System.out.println("Visited a node: " + node);
//			}
			
			@Override
			public void visitASTModuleNode(ASTModuleNode node) {
				System.out.println("Start ==> Visited a module node: " + node.getName());
				m.setName(node.getName());
				super.visitASTModuleNode(node);
				
				// sort candidates
				List<ModelDefinesSetServices> l = new ArrayList<ModelDefinesSetServices>(m.getDefinesSetServices());
				//Collections.list(m.getDefinesSetServices());
				//Collections.sort(l);
				//Collections.reverse(l);
				m.getDefinesSetServices().clear();
				m.getDefinesSetServices().addAll(l);
				
				System.out.println("End ==> Visited a module node: " + node.getName());
			}
			
			@Override
			public void visitASTSubroutineSubprogramNode(ASTSubroutineSubprogramNode node) {
				//System.out.println("Start ==> Visited a subroutine subprogram node: " + node.getName());		
				
				ModelDefinesSetServices mdss = NUOPCFactory.eINSTANCE.createModelDefinesSetServices();
				mdss.setName(node.getName());
				m.getDefinesSetServices().add(mdss);
				
				mdss.setParameters(false);		
				if (CodeQuery.matchesParamTypes(node, new DerivedType("ESMF_GridComp"), Type.INTEGER)) {
					mdss.setParameters(true);
				}
				
				mdss.setCallsGenericSetServices(false);		
				if (CodeQuery.calls(node, "routine_SetServices")) {
					mdss.setCallsGenericSetServices(true);					
				}
								
				mdss.setCallsSetEntryPointPhase1(false);
				mdss.setCallsSetEntryPointPhase2(false);
				
				Set<ASTCallStmtNode> calls = CodeQuery.getCallStatement(node, "ESMF_GridCompSetEntryPoint");		
				for (ASTCallStmtNode csn : calls) {
					for (ASTSubroutineArgNode san : csn.getArgList()) {												
						if (san.getName() != null && san.getName().getText().equalsIgnoreCase("phase")) {
							if (san.getExpr() != null && san.getExpr() instanceof ASTIntConstNode) {								
							
								if (((ASTIntConstNode) san.getExpr()).getIntConst().getText().equals("1")) {
									mdss.setCallsSetEntryPointPhase1(true);
								}
								else if (((ASTIntConstNode) san.getExpr()).getIntConst().getText().equals("2")) {
									mdss.setCallsSetEntryPointPhase2(true);
								}
															
							}							
						}						
					}
				}
				
				//super.visitASTSubroutineSubprogramNode(node);
				//System.out.println("End ==> Visited a subroutine subprogram node: " + node.getName());	
			}					
			
		};
		
		ast.accept(revisit);
		
		return m;
		
	}
	
}
