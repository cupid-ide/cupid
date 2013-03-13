package org.earthsystemcurator.cupid.nuopc.fsml.mapping;

import java.io.StringReader;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory;
import org.eclipse.photran.internal.core.FortranAST;
import org.eclipse.photran.internal.core.lexer.ASTLexerFactory;
import org.eclipse.photran.internal.core.lexer.IAccumulatingLexer;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTModuleNameNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTModuleStmtNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IProgramUnit;
import org.eclipse.photran.internal.core.parser.Parser;
import org.eclipse.rephraserengine.core.vpg.refactoring.VPGRefactoring;

@SuppressWarnings("restriction")
public class ModelToModuleMapping extends Mapping<Model, ASTModuleNode> {
	
	public ModelToModuleMapping(Model m, ASTModuleNode astModuleNode) {
		super(m, astModuleNode);
	}

	@Override
	public Model reverse() {
		
		if (modelElem == null)
			modelElem = NUOPCFactory.eINSTANCE.createModel();
		
		modelElem.setName(reverseName());
		modelElem.setDefinesSetServices(reverseDefinesSetServices());
		modelElem.setUsesAllImports(reverseUsesAllImports());
		
		return modelElem;
	}

	public boolean reverseUsesAllImports() {
		boolean usesESMF = false;
		boolean usesNUOPC = false;
		boolean usesNUOPCModel = false;
		
		for (ASTUseStmtNode usn : astElem.getModuleBody().findAll(ASTUseStmtNode.class)) {
			if (usn.getName().getText().equalsIgnoreCase("ESMF")) usesESMF = true;
			if (usn.getName().getText().equalsIgnoreCase("NUOPC")) usesNUOPC = true;
			if (usn.getName().getText().equalsIgnoreCase("NUOPC_Model")) usesNUOPCModel = true;
		}
		
		return usesESMF && usesNUOPC && usesNUOPCModel;
	}

	public void forwardUsesAllImports() {
		ensureUses(astElem, "NUOPC_Model");
		ensureUses(astElem, "NUOPC");
		ensureUses(astElem, "ESMF");
	}
	
	public void ensureUses(ASTModuleNode module, String moduleToUse) {		
		for (ASTUseStmtNode usn : module.getOrCreateBody().findAll(ASTUseStmtNode.class)) {
			if (usn.getName().getText().equalsIgnoreCase(moduleToUse)) return;
		}
		
		
		//ASTUseStmtNode usn = new ASTUseStmtNode();
		//usn.setName(new Token(null, moduleToUse));
		//module.getModuleBody().add(0, usn);
	}
	
	
	public ModelDefinesSetServices reverseDefinesSetServices() {
		ModelDefinesSetServicesToSubroutineMapping map = new ModelDefinesSetServicesToSubroutineMapping(null, astElem);
		return map.reverse();
	}

	public void forwardDefinesSetServices() {
		
		if (modelElem != null) {
			
			ModelDefinesSetServicesToSubroutineMapping map = 
					new ModelDefinesSetServicesToSubroutineMapping(modelElem.getDefinesSetServices(), astElem);
			
			map.forward();
			//ModelDefinesSetServices mdss = null;
			//if ((mdss = modelElem.getDefinesSetServices()) != null) {
				//for (ASTSubroutineSubprogramNode n : astElem.findAll(ASTSubroutineSubprogramNode.class)) {
				//ModelDefinesSetServicesToSubroutineMapping map = new ModelDefinesSetServicesToSubroutineMapping(mdss, n);
				//return map.forward();					
				//}
			//}
		}
		
	}
	
	public String reverseName() {
			
		if (astElem == null)
			return null;
				
		if (astElem.getModuleStmt() == null)
			return null;
		
		if (astElem.getModuleStmt().getModuleName() == null)
			return null;				
		
		//if (modelElem == null)
		//	modelElem = NUOPCFactory.eINSTANCE.createModel();
		
		//modelElem.setName(astElem.getModuleStmt().getModuleName().getModuleName().toString());
		//return modelElem;
		
		return astElem.getModuleStmt().getModuleName().getModuleName().toString();
	}
	
	public void forwardName() {
		
		//FortranResourceRefactoring.
		
		if (astElem == null) {
			//astElem = new ASTModuleNode();
			astElem = (ASTModuleNode) parseLiteralProgramUnit("module test\nimplicit none\ncontains\nsubroutine dummy()\nend subroutine\nend module");
		}	
		
		if (astElem.getModuleStmt() == null)
			astElem.setModuleStmt(new ASTModuleStmtNode());
		
		if (astElem.getModuleStmt().getModuleName() == null)
			astElem.getModuleStmt().setModuleName(new ASTModuleNameNode());
		
		astElem.getModuleStmt().getModuleName().setModuleName(new Token(null, modelElem.getName()));
		
	}

	protected static IProgramUnit parseLiteralProgramUnit(String string)
    {
        try
        {
            IAccumulatingLexer lexer = new ASTLexerFactory().createLexer(
                new StringReader(string), null, "(none)");
            Parser parser = new Parser();

            FortranAST ast = new FortranAST(null, parser.parse(lexer), lexer.getTokenList());
            return ast.getRoot().getProgramUnitList().get(0);
        }
        catch (Exception e)
        {
            throw new Error(e);
        }
    }
	
	@Override
	public ASTModuleNode forward() {
		forwardName();
		forwardUsesAllImports();
		forwardDefinesSetServices();
		return astElem;
	}

		
	
}
