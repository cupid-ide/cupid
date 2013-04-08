package org.earthsystemcurator.cupid.nuopc.fsml.mapping;

import java.util.List;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeExtraction;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeQuery;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.analysis.binding.Definition;
import org.eclipse.photran.internal.core.analysis.types.DerivedType;
import org.eclipse.photran.internal.core.analysis.types.Type;
import org.eclipse.photran.internal.core.lexer.Terminal;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTListNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineNameNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineParNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineStmtNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTTypeDeclarationStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.reindenter.Reindenter;


@SuppressWarnings("restriction")
public class ModelDefinesSetServicesToSubroutineMapping extends Mapping<ModelDefinesSetServices, ASTSubroutineSubprogramNode> {

	protected ModelDefinesSetServicesToSubroutineMapping(
			ModelDefinesSetServices m, ASTSubroutineSubprogramNode a, IFortranAST ast) {
		super(m, a, ast);
	}

	@Override
	public ModelDefinesSetServices reverse() {
		
		if (astElem != null) {
			if (modelElem == null) {
				modelElem = NUOPCFactory.eINSTANCE.createModelDefinesSetServices();
			}
			
			reverseName();
			reverseParameters();
			reverseCallsGenericSetServices();
			reverseCallsSetEntryPointPhase1();
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
			modelElem.setParameters(true);
			return true;
		}
		else {
			modelElem.setParameters(false);
			return false;
		}
	}
	
	protected boolean reverseCallsGenericSetServices() {
		if (CodeQuery.containsCall(astElem, "routine_SetServices")) {
			modelElem.setCallsGenericSetServices(true);
			return true;
		}
		else {
			modelElem.setParameters(false);
			return false;
		}
	}
	
	protected boolean reverseCallsSetEntryPointPhase1() {
		if (CodeQuery.containsCall(astElem, "ESMF_GridCompSetEntryPoint")) {
			//TODO: check for correct phase
			modelElem.setCallsSetEntryPointPhase1(true);
			return true;
		}
		else {
			modelElem.setCallsSetEntryPointPhase1(false);
			return false;
		}
	}
	
	@Override
	protected int score() {
		 return (modelElem.isParameters() ? 1 : 0) +
				(modelElem.isCallsGenericSetServices() ? 1 : 0) +
				(modelElem.isCallsSetEntryPointPhase1() ? 1 : 0) +
				(modelElem.isCallsSetEntryPointPhase2() ? 1 : 0);
	}
	
	@Override
	protected boolean certain() {
		return modelElem.isParameters() && modelElem.isCallsGenericSetServices();
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
				System.out.println("Parsing new AST node for SetServices");
				astElem = (ASTSubroutineSubprogramNode) CodeExtraction.parseLiteralProgramUnit(
								//"module dummy\n " +
								//"contains \n" + 
								"\n\nsubroutine SetServices(gcomp, rc)\n" + 
								"	type(ESMF_GridComp)  :: gcomp\n" + 
								"   integer, intent(out) :: rc\n" +
								"end subroutine\n");
								//"end module\n");
			}
			System.out.println("astElem = " + astElem);
			forwardName();
			forwardParameters();
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
		
		if (modelElem.isParameters()) {
			
			//ensure parameters are correct, if not change them
			
			if (CodeQuery.matchesParamTypes(astElem, new DerivedType("ESMF_GridComp"), Type.INTEGER)) {
				return;
			}
			else {
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
	
	

}
