package org.earthsystemcurator.cupid.nuopc.fsml.mapping;

import java.util.Set;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeExtraction;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeQuery;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.analysis.types.DerivedType;
import org.eclipse.photran.internal.core.analysis.types.Type;
import org.eclipse.photran.internal.core.lexer.Terminal;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTIntConstNode;
import org.eclipse.photran.internal.core.parser.ASTListNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineArgNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineNameNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineParNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineStmtNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTTypeDeclarationStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.ISpecificationPartConstruct;
import org.eclipse.photran.internal.core.reindenter.Reindenter;
import org.eclipse.photran.internal.core.reindenter.Reindenter.Strategy;


@SuppressWarnings("restriction")
public class ModelDefinesSetServicesToSubroutineMapping extends Mapping<ModelImplementsSetServices, ASTSubroutineSubprogramNode> {

	protected ModelDefinesSetServicesToSubroutineMapping(
			ModelImplementsSetServices m, ASTSubroutineSubprogramNode a, IFortranAST ast) {
		super(m, a, ast);
	}

	@Override
	public ModelImplementsSetServices reverse() {
		
		if (astElem != null) {
			if (modelElem == null) {
				modelElem = NUOPCFactory.eINSTANCE.createModelImplementsSetServices();
			}
			
			reverseName();
			reverseParameters();
			reverseCallsGenericSetServices();
			reverseCallsSetEntryPointPhase1();
			reverseCallsSetEntryPointPhase2();
		}
		
		return modelElem;
		
		//candidate nodes
		/*
		Set<ASTSubroutineSubprogramNode> setByParams = CodeQuery.findSubroutineByParamTypes(astElem, new DerivedType("ESMF_GridComp"), Type.INTEGER);
		for (ASTSubroutineSubprogramNode ssn : setByParams) {
			System.out.println("has correct parameters: " + ssn.getName());
		}
		
		Set<ASTSubroutineSubprogramNode> setByCall1 = CodeQuery.findSubroutineWithCall(astElem, "ESMF_GridCompSetEntryPoint");
		for (ASTSubroutineSubprogramNode ssn : setByCall1) {
			System.out.println("calls ESMF_GridCompSetEntryPoint: " + ssn.getName());
		}
		
		Set<ASTSubroutineSubprogramNode> setByCall2 = CodeQuery.findSubroutineWithCall(astElem, "routine_SetServices");
		for (ASTSubroutineSubprogramNode ssn : setByCall2) {
			System.out.println("calls routine_SetServices: " + ssn.getName());
		}
				
		Set<ASTSubroutineSubprogramNode> intersect = Sets.intersection(setByParams, Sets.intersection(setByCall1, setByCall2));
		for (ASTSubroutineSubprogramNode ssn : intersect) {
			System.out.println("intersection: " + ssn.getName());
		}
		
		if (intersect.size() == 1) {
			
			if (modelElem == null)
				modelElem = NUOPCFactory.eINSTANCE.createModelDefinesSetServices();
			
			modelElem.setCallsGenericSetServices(true);
			modelElem.setName(intersect.toArray(new ASTSubroutineSubprogramNode[1])[0].getName());
			
		}
		else if (intersect.size() == 0) {
			//no exact matches -- find candidates
			//intersect = Sets.
		}
		*/
		
		
	}

	protected void reverseName() {
		if (astElem != null) {
			modelElem.setName(astElem.getName());
		}
		else {
			modelElem.setName(null);
		}
		//return modelElem.getName();		
	}
	
	protected boolean reverseParameters() {
		if (CodeQuery.matchesParamTypes(astElem, new DerivedType("ESMF_GridComp"), Type.INTEGER)) {
			//modelElem.setParameters(true);
			return true;
		}
		else {
			//modelElem.setParameters(false);
			return false;
		}
	}
	
	protected boolean reverseCallsGenericSetServices() {
		//if (CodeQuery.calls(astElem, "routine_SetServices")) {
		//	modelElem.setCallsGenericSetServices(true);
		//	return true;
		//}
		//else {
		//	modelElem.setCallsGenericSetServices(false);
		//	return false;
		//}
		return false;
	}
	
	protected boolean reverseCallsSetEntryPointPhase1() {
				
		modelElem.setCallsSetEntryPointPhase1(false);
		
		Set<ASTCallStmtNode> calls = CodeQuery.getCallStatement(astElem, "ESMF_GridCompSetEntryPoint");		
		outer: for (ASTCallStmtNode csn : calls) {
			for (ASTSubroutineArgNode san : csn.getArgList()) {
				
				System.out.println("Arg name = " + san.getName());
				System.out.println("Arg label = " + san.getLabel());
				System.out.println("Expr = " + san.getExpr());
				
				if (san.getName() != null && san.getName().getText().equalsIgnoreCase("phase")) {
					if (san.getExpr() != null && 
							san.getExpr() instanceof ASTIntConstNode && 
							((ASTIntConstNode) san.getExpr()).getIntConst().getText().equals("1")) {
						
						modelElem.setCallsSetEntryPointPhase1(true);
						break outer;
					}
					
				}
				
			}
		}
		
		return modelElem.isCallsSetEntryPointPhase1();
		
	}
	
	protected boolean reverseCallsSetEntryPointPhase2() {
		
		modelElem.setCallsSetEntryPointPhase2(false);
		
		Set<ASTCallStmtNode> calls = CodeQuery.getCallStatement(astElem, "ESMF_GridCompSetEntryPoint");		
		outer: for (ASTCallStmtNode csn : calls) {
			for (ASTSubroutineArgNode san : csn.getArgList()) {
				
				System.out.println("Arg name = " + san.getName());
				System.out.println("Arg label = " + san.getLabel());
				System.out.println("Expr = " + san.getExpr());
				
				if (san.getName() != null && san.getName().getText().equalsIgnoreCase("phase")) {
					if (san.getExpr() != null && 
							san.getExpr() instanceof ASTIntConstNode && 
							((ASTIntConstNode) san.getExpr()).getIntConst().getText().equals("2")) {
						
						modelElem.setCallsSetEntryPointPhase2(true);
						break outer;
					}
					
				}
				
			}
		}
		
		return modelElem.isCallsSetEntryPointPhase2();
		
	}
	
	/*
	protected boolean reverseCallsSetEntryPoint(ASTSubroutineSubprogramNode ast, String phase) {
		
		Set<ASTCallStmtNode> calls = CodeQuery.getCallStatement(ast, "ESMF_GridCompSetEntryPoint");		
		for (ASTCallStmtNode csn : calls) {
			for (ASTSubroutineArgNode san : csn.getArgList()) {
				
				if (san.getName() != null && san.getName().getText().equalsIgnoreCase("phase")) {
					if (san.getExpr() != null && 
							san.getExpr() instanceof ASTIntConstNode && 
							((ASTIntConstNode) san.getExpr()).getIntConst().getText().equals(phase)) {
						
						return true;
						
					}
					
				}
				
			}
		}
		return false;
	}
	*/
	
	@Override
	protected int score() {
		 return (modelElem.isCallsGenericSetServices() ? 1 : 0) +
				(modelElem.isCallsSetEntryPointPhase1() ? 1 : 0) +
				(modelElem.isCallsSetEntryPointPhase2() ? 1 : 0);
	}
	
	@Override
	protected boolean certain() {
		return modelElem.isCallsGenericSetServices();
	}
	
	public String toString() {
		return "ModelDefinesSetServicesToSubroutineMapping: " + astElem.getName() + " <==> " + modelElem;
	}
	
	/*
	ssns = CodeQuery.findSubroutineByParamTypes(astElem, 
				new DerivedType("ESMF_GridComp"), 
				new DerivedType("ESMF_State"), 
				new DerivedType("ESMF_State"), 
				new DerivedType("ESMF_Clock"),
				Type.INTEGER);
	*/
	
	
	@Override
	public ASTSubroutineSubprogramNode forward() {
		
		if (modelElem != null) {
			if (astElem == null) {
				//System.out.println("Parsing new AST node for SetServices");
				astElem = (ASTSubroutineSubprogramNode) CodeExtraction.parseLiteralProgramUnit(
								//"module dummy\n " +
								//"contains \n" + 
								"\n\nsubroutine SetServices(gcomp, rc)\n" + 
								"	type(ESMF_GridComp)  :: gcomp\n" + 
								"   integer, intent(out) :: rc\n" +
								"end subroutine\n");
								//"end module\n");
			}
			//System.out.println("astElem = " + astElem);
			forwardName();
			forwardParameters();
			forwardCallsSetEntryPointPhase2();
			forwardCallsSetEntryPointPhase1();
			forwardCallsGenericSetServices();
			
		}
		
		return astElem;
	}
	
	protected void forwardName() {
		
		if (astElem == null)
			astElem = new ASTSubroutineSubprogramNode();
		
		if (astElem.getSubroutineStmt() == null)
			astElem.setSubroutineStmt(new ASTSubroutineStmtNode());
		
		if (astElem.getSubroutineStmt().getSubroutineName() == null)
			astElem.getSubroutineStmt().setSubroutineName(new ASTSubroutineNameNode());
		
		if (astElem.getSubroutineStmt().getSubroutineName().getSubroutineName() == null) {
			astElem.getSubroutineStmt().getSubroutineName().setSubroutineName(new Token(Terminal.T_IDENT, modelElem.getName()));
		}	
		else {
			astElem.getSubroutineStmt().getSubroutineName().getSubroutineName().setText(modelElem.getName());
		}
				
	}
	
	protected void forwardParameters() {
		
		if (true) {
			
			//ensure parameters are correct, if not change them
			
			if (!CodeQuery.matchesParamTypes(astElem, new DerivedType("ESMF_GridComp"), Type.INTEGER)) {
				
				IASTListNode<ASTSubroutineParNode> pars;
				//pars = astElem.getSubroutineStmt().getSubroutinePars();
				pars = new ASTListNode<ASTSubroutineParNode>();
				astElem.getSubroutineStmt().setSubroutinePars(pars);
				
				pars.add(0, new ASTSubroutineParNode());
				pars.get(0).setVariableName(new Token(Terminal.T_IDENT, "", "gcomp", ", "));
				
				pars.add(1, new ASTSubroutineParNode());
				pars.get(1).setVariableName(new Token(Terminal.T_IDENT, "rc"));
				
				ASTTypeDeclarationStmtNode td;
				td = (ASTTypeDeclarationStmtNode) CodeExtraction.parseLiteralStatement("type(ESMF_GridComp) :: gcomp");
				astElem.getBody().add(0, td);
				
				td = (ASTTypeDeclarationStmtNode) CodeExtraction.parseLiteralStatement("integer :: rc");
				astElem.getBody().add(1, td);
				
				Reindenter.reindent(astElem, ast, Reindenter.Strategy.REINDENT_EACH_LINE);
				
			}
			
			
		}
		
	}
	
	protected void forwardCallsGenericSetServices() {
		
		if (modelElem.isCallsGenericSetServices()) {
			
			/* do we need to check this -- or will it only be called when forwarding is necessary? */
			if (true) {
				
				//retrieve parameter names
				String param1 = "gcomp";
				String param2 = "rc";
				IASTListNode<ASTSubroutineParNode> pars = astElem.getSubroutineStmt().getSubroutinePars();
				if (pars != null &&	pars.size() == 2) {
					param1 = pars.get(0).getVariableName().getText();
					param2 = pars.get(1).getVariableName().getText();
				}
				
				IASTListNode<IBodyConstruct> stmts = 
						 CodeExtraction.parseLiteralStatementSequence("\n\ncall routine_SetServices(" + param1 + ", rc=" + param2 + ") \n" + 
													 "if (ESMF_LogFoundError(rcToCheck=" + param2 + ", msg=ESMF_LOGERR_PASSTHRU, &\n" + 
													 "    line=__LINE__, &\n" +
													 "    file=__FILE__)) &\n" +
													 "    return");		
				
				ISpecificationPartConstruct spc = astElem.findLast(ISpecificationPartConstruct.class);
				System.out.print("spc = " + spc);
				int idx = astElem.getBody().indexOf(spc) + 1;
				System.out.print("idx = " + idx);
				//if (idx < 0) idx = 0;
				astElem.getBody().addAll(idx, stmts);
				
				Reindenter.reindent(astElem, ast, Strategy.REINDENT_EACH_LINE);
				
			}
			
		}
		
	}
	
	protected void forwardCallsSetEntryPointPhase1() {
		
		if (!reverseCallsSetEntryPointPhase1()) {
							
			//retrieve parameter names
			//TODO: move these elements into the model
			String param1 = "gcomp";
			String param2 = "rc";
			IASTListNode<ASTSubroutineParNode> pars = astElem.getSubroutineStmt().getSubroutinePars();
			if (pars != null &&	pars.size() == 2) {
				param1 = pars.get(0).getVariableName().getText();
				param2 = pars.get(1).getVariableName().getText();
			}
			
			IASTListNode<IBodyConstruct> stmts = 
					 CodeExtraction.parseLiteralStatementSequence("\n\ncall ESMF_GridCompSetEntryPoint(" + param1 + ", ESMF_METHOD_INITIALIZE, userRoutine=NEED_USER_ROUTINE_1, phase=1, rc=" + param2 + ") \n" + 
												 "if (ESMF_LogFoundError(rcToCheck=" + param2 + ", msg=ESMF_LOGERR_PASSTHRU, &\n" + 
												 "    line=__LINE__, &\n" +
												 "    file=__FILE__)) &\n" +
												 "    return");		
			
			ISpecificationPartConstruct spc = astElem.findLast(ISpecificationPartConstruct.class);
			System.out.print("spc = " + spc);
			int idx = astElem.getBody().indexOf(spc) + 1;
			System.out.print("idx = " + idx);
			//if (idx < 0) idx = 0;
			astElem.getBody().addAll(idx, stmts);
			
			Reindenter.reindent(astElem, ast, Strategy.REINDENT_EACH_LINE);
				
		}
			
	}
	
	protected void forwardCallsSetEntryPointPhase2() {
		
		if (!reverseCallsSetEntryPointPhase2()) {
							
			//retrieve parameter names
			//TODO: move these elements into the model
			String param1 = "gcomp";
			String param2 = "rc";
			IASTListNode<ASTSubroutineParNode> pars = astElem.getSubroutineStmt().getSubroutinePars();
			if (pars != null &&	pars.size() == 2) {
				param1 = pars.get(0).getVariableName().getText();
				param2 = pars.get(1).getVariableName().getText();
			}
			
			IASTListNode<IBodyConstruct> stmts = 
					 CodeExtraction.parseLiteralStatementSequence("\n\ncall ESMF_GridCompSetEntryPoint(" + param1 + ", ESMF_METHOD_INITIALIZE, userRoutine=NEED_USER_ROUTINE_2, phase=2, rc=" + param2 + ") \n" + 
												 "if (ESMF_LogFoundError(rcToCheck=" + param2 + ", msg=ESMF_LOGERR_PASSTHRU, &\n" + 
												 "    line=__LINE__, &\n" +
												 "    file=__FILE__)) &\n" +
												 "    return");		
			
			ISpecificationPartConstruct spc = astElem.findLast(ISpecificationPartConstruct.class);
			System.out.print("spc = " + spc);
			int idx = astElem.getBody().indexOf(spc) + 1;
			System.out.print("idx = " + idx);
			//if (idx < 0) idx = 0;
			astElem.getBody().addAll(idx, stmts);
			
			Reindenter.reindent(astElem, ast, Strategy.REINDENT_EACH_LINE);
				
		}
			
	}
	
	

}
