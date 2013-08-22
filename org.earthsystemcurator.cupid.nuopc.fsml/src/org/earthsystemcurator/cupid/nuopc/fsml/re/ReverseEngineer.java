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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
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
		
		for (EStructuralFeature sf : modelElemClass.getEStructuralFeatures()) {
			
			System.out.println("Stuctural feature: " + sf.getName());
			System.out.println("\tType = " + sf.getEType());
			System.out.println("\tCurrent val = " + modelElem.eGet(sf));
			//System.out.println("\tGeneric type = " + sf.getEGenericType());
					
			EAnnotation anot = sf.getEAnnotation("http://www.earthsystemcog.org/projects/nuopc");
			if (anot == null) {
				continue;  //no code queries, cannot proceed
			}
			
			String sfQuery = anot.getDetails().get("query");
			if (sfQuery == null || sfQuery.trim().equals("")) {
				continue;
			}
			
			//System.out.println("\tquery = " + sfQuery);
			
			//just handles one parameter for now
			String[] sfQuerySplit = sfQuery.split("\\s*:\\s*");
			String methodName = sfQuerySplit[0].trim();
			String params = null;
			if (sfQuerySplit.length==2)
				params = sfQuerySplit[1].trim();
			
			//String[] params = null;
			//if (sfQuerySplit.length == 2) {
			//	params = sfQuerySplit[1].split(",");
			//	for (int i=0; i<params.length; i++) {
			//		params[i] = params[i].trim();
			//	}
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
								
								//recursive call
								newModelElem = reverseContext(newContextNode, newModelElem);
								
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
							}
							
						}
						
						//m.eSet(sf, myName);
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					}
					
					break;  //from for loop
				}
				
				
			}
		}
		
		
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
