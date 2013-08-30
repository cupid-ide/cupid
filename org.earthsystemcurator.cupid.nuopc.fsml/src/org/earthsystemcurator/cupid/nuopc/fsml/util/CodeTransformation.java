package org.earthsystemcurator.cupid.nuopc.fsml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.photran.internal.core.parser.ASTModuleNameNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTModuleStmtNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.IASTNode;

@SuppressWarnings("restriction")
public class CodeTransformation {

	public static IASTNode addSubroutine(IASTNode context, String name, String[][] params) {
		
		String code = "\n\nsubroutine " + name + "(";
		for (int i = 0; i < params.length; i++) {
			code += params[i][0];
			if (i < params.length - 1)
				code += ", ";
		}
		code += ")\n";
		
		for (int i = 0; i < params.length; i++) {
			code += "\t" + params[i][1] + " :: " + params[i][0] + "\n";
		}
		
		code += "end subroutine\n";
		
		System.out.println("\n\n===============" + code + "\n\n=================");
				
				
		ASTSubroutineSubprogramNode node = 
				(ASTSubroutineSubprogramNode) CodeExtraction.parseLiteralProgramUnit(code);

		//need a more general solution
		if (context instanceof ASTModuleNode) {
			ASTModuleNode amn = (ASTModuleNode) context;
			amn.getModuleBody().add(node);
		}
		
		return context;
		
	}
	
	public static ASTModuleNode addModule(ASTModuleNode node, String name) {
		
		if (node == null) {
			node = (ASTModuleNode) CodeExtraction.parseLiteralProgramUnit("module test\nimplicit none\ncontains\nsubroutine dummy()\nend subroutine\nend module");
		}	
		
		if (node.getModuleStmt() == null)
			node.setModuleStmt(new ASTModuleStmtNode());
		
		if (node.getModuleStmt().getModuleName() == null)
			node.getModuleStmt().setModuleName(new ASTModuleNameNode());
		
		node.getModuleStmt().getModuleName().getModuleName().setText(name);
		
		return node;
		
	}
	
}
