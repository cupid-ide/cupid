package org.earthsystemcurator.cupid.nuopc.fsml.mapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeExtraction;
import org.earthsystemcurator.cupid.nuopc.fsml.util.CodeQuery;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTModuleNameNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTModuleStmtNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.reindenter.Reindenter;
import org.eclipse.photran.internal.core.reindenter.Reindenter.Strategy;

@SuppressWarnings("restriction")
public class ModelToModuleMapping extends Mapping<Model, ASTModuleNode> {
	
	/**
	 * These are candidate mappings.
	 */
	protected List<Mapping<ModelDefinesSetServices, ASTSubroutineSubprogramNode>> mappingsDefinesSetServices;
	
	public ModelToModuleMapping(Model m, ASTModuleNode astModuleNode, IFortranAST ast) {		
		super(m, astModuleNode, ast);
		
		mappingsDefinesSetServices = new ArrayList<Mapping<ModelDefinesSetServices, ASTSubroutineSubprogramNode>>();
	}

	@Override
	public Model reverse() {
		
		if (modelElem == null)
			modelElem = NUOPCFactory.eINSTANCE.createModel();
		
		reverseName();
		reverseDefinesSetServices();
		reverseUsesAllImports();
			
		return modelElem;
	}

	public void reverseUsesAllImports() {
		boolean usesESMF = false;
		boolean usesNUOPC = false;
		boolean usesNUOPCModel = false;
		
		for (ASTUseStmtNode usn : astElem.getModuleBody().findAll(ASTUseStmtNode.class)) {
			if (usn.getName().getText().equalsIgnoreCase("ESMF")) usesESMF = true;
			if (usn.getName().getText().equalsIgnoreCase("NUOPC")) usesNUOPC = true;
			if (usn.getName().getText().equalsIgnoreCase("NUOPC_Model")) usesNUOPCModel = true;
		}
		
		modelElem.setUsesAllImports(usesESMF && usesNUOPC && usesNUOPCModel);
	}

	public void forwardUsesAllImports() {
		if (modelElem.isUsesAllImports()) {
			ensureUses(astElem, "NUOPC_Model");
			ensureUses(astElem, "NUOPC");
			ensureUses(astElem, "ESMF");
		}
	}
	
	public void ensureUses(ASTModuleNode module, String moduleToUse) {		
		for (ASTUseStmtNode usn : module.getOrCreateBody().findAll(ASTUseStmtNode.class)) {
			if (usn.getName().getText().equalsIgnoreCase(moduleToUse)) return;
		}
		
		//create use statement node
		ASTUseStmtNode usn = (ASTUseStmtNode) CodeExtraction.parseLiteralStatement("use " + moduleToUse + "\n");
		
		//are there any existing use statements?
		ASTUseStmtNode last = module.getModuleBody().findLast(ASTUseStmtNode.class);
		
		if (last != null) {
			module.getModuleBody().insertAfter(last, usn);
		}
		else {
			module.getModuleBody().add(0, usn);	
		}
		Reindenter.reindent(usn, ast, Strategy.REINDENT_EACH_LINE);
	}
	
	
	public void reverseDefinesSetServices() {
		
		ModelDefinesSetServicesToSubroutineMapping map;  
		for (ASTSubroutineSubprogramNode ssn : astElem.findAll(ASTSubroutineSubprogramNode.class)) {
			map = new ModelDefinesSetServicesToSubroutineMapping(null, ssn, ast);
			map.reverse();
			mappingsDefinesSetServices.add(map);			
		}
		
		Collections.sort(mappingsDefinesSetServices);
		Collections.reverse(mappingsDefinesSetServices);
		
		System.out.println("Sorted mappings: ");
		for (Mapping<ModelDefinesSetServices, ASTSubroutineSubprogramNode> x : mappingsDefinesSetServices) {
			System.out.println(x.score() + " : " + x);
		}
		
		for (Mapping<ModelDefinesSetServices, ASTSubroutineSubprogramNode> x : mappingsDefinesSetServices) {
			if (x.certain()) {
				modelElem.setDefinesSetServices(x.modelElem);
				return;
			}
		}
		
		//if we are here, we have to deal with candidates
	}

	public void forwardDefinesSetServices() {
		
		if (modelElem != null) {
			
			if (modelElem.getDefinesSetServices() != null) {				
				ASTSubroutineSubprogramNode ssn = 
						CodeQuery.findSubroutineByName(astElem, modelElem.getDefinesSetServices().getName());
						
				ModelDefinesSetServicesToSubroutineMapping map = 
					new ModelDefinesSetServicesToSubroutineMapping(modelElem.getDefinesSetServices(), ssn, ast);
			
				ssn = map.forward();
				System.out.println("enclosing scope = " + ssn.getEnclosingScope());
				if (ssn.getEnclosingScope() != astElem) {
					//System.out.println("Null parent -- adding to ast");
					astElem.getModuleBody().add(ssn);
					Reindenter.reindent(astElem, ast, Reindenter.Strategy.REINDENT_EACH_LINE);
				}
			}
			
		}
		
	}
	
	public void reverseName() {
		
		/*
		if (astElem == null)
			return null;
				
		if (astElem.getModuleStmt() == null)
			return null;
		
		if (astElem.getModuleStmt().getModuleName() == null)
			return null;				
		
		//if (modelElem == null)
		//	modelElem = NUOPCFactory.eINSTANCE.createModel();
		 
		 */
		
		try {
			modelElem.setName(astElem.getModuleStmt().getModuleName().getModuleName().getText());
		}
		catch (NullPointerException npe) {
			modelElem.setName(null);
		}
		
	}
	
	public void forwardName() {
		
		if (astElem == null) {
			//astElem = new ASTModuleNode();
			astElem = (ASTModuleNode) CodeExtraction.parseLiteralProgramUnit("module test\nimplicit none\ncontains\nsubroutine dummy()\nend subroutine\nend module");
		}	
		
		if (astElem.getModuleStmt() == null)
			astElem.setModuleStmt(new ASTModuleStmtNode());
		
		if (astElem.getModuleStmt().getModuleName() == null)
			astElem.getModuleStmt().setModuleName(new ASTModuleNameNode());
		
		astElem.getModuleStmt().getModuleName().getModuleName().setText(modelElem.getName());
		
	}	
	
	@Override
	public ASTModuleNode forward() {
		forwardName();
		forwardUsesAllImports();
		forwardDefinesSetServices();
		return astElem;
	}

	@Override
	protected int score() {
		return (modelElem.isUsesAllImports() ? 2 : 0) +
				(modelElem.getDefinesSetServices() != null ? 2 : 0) +
				(modelElem.getName() != null ? 1 : 0);
	}

	@Override
	protected boolean certain() {		
		return modelElem.isUsesAllImports() && modelElem.getDefinesSetServices() != null;
	}

		
	
}
