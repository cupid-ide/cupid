package org.earthsystemmodeling.cupid.nuopc

import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode

import static extension org.earthsystemmodeling.cupid.nuopc.ASTQuery.*
import org.eclipse.photran.internal.core.lexer.Token

class ESMFQuery {
	
	def static findESMFSetServices(ASTModuleNode node) {
		findESMFMethods(node).findESMFSetServices
	}
	
	def static findESMFSetServices(Iterable<ASTSubroutineSubprogramNode> nodes) {
		nodes.findFirst[it.name.eic("SetServices") ||
			it.body.filter(ASTCallStmtNode).exists[
				it.subroutineName.text.eic("NUOPC_CompDerive")
			]
		]
	}
	
	def static findESMFMethods(ASTModuleNode node) {
		node.body.filter(ASTSubroutineSubprogramNode).filter[
			it.subroutineStmt.subroutinePars?.size == 2 
			&&
			{			
//			if (it.subroutineStmt.subroutinePars?.get(0) != null &&
//				it.subroutineStmt.subroutinePars?.get(0)?.variableName.resolveBinding.size() == 0) {
//				System.out.println("Cannot resolve binding for variable")
//				var vn = it.subroutineStmt.subroutinePars?.get(0)?.variableName
//				var lst = vn.resolveBinding
//				throw new ReverseEngineerException("Cannot resolve binding for variable")
//			}
//			else {
				var par1 = it.subroutineStmt.subroutinePars?.get(0)?.variableName.resolveOrDie
				if (par1?.type.toString.eic("type(esmf_gridcomp)")) {
					var par2 = it.subroutineStmt.subroutinePars?.get(1)?.variableName.resolveOrDie
					par2.type.toString.eic("integer") &&
					!par2.intentIn && 
					par2.intentOut
					}
				}
//			}
				
		]
	}
	
	def static findESMFEntryPoints(ASTModuleNode node) {
		node.body.filter(ASTSubroutineSubprogramNode).filter[
			it.subroutineStmt.subroutinePars?.size == 5 
			&&
			{	
//			if (it.subroutineStmt.subroutinePars?.get(0) != null &&
//				it.subroutineStmt.subroutinePars?.get(0)?.variableName.resolveBinding.size() == 0) {
//				System.out.println("Cannot resolve binding for variable")
//				false
//			}
//			else {
				var par1 = it.subroutineStmt.subroutinePars?.get(0)?.variableName.resolveOrDie
				if (par1?.type.toString.eic("type(esmf_gridcomp)")) {
					var par2 = it.subroutineStmt.subroutinePars?.get(1)?.variableName.resolveOrDie
					if (par2.type.toString.eic("type(esmf_state)")) {
						var par3 = it.subroutineStmt.subroutinePars?.get(2)?.variableName.resolveOrDie
						if (par3.type.toString.eic("type(esmf_state)")) {
							var par4 = it.subroutineStmt.subroutinePars?.get(3)?.variableName.resolveOrDie
							if (par4.type.toString.eic("type(esmf_clock)")) {
								var par5 = it.subroutineStmt.subroutinePars?.get(4)?.variableName.resolveOrDie
								par5.type.toString.eic("integer") &&
								!par5.intentIn &&
								par5.intentOut
							}
						}
					}
				}			
//				}
			}
		]
	}
	
	def static resolveOrDie(Token toResolve) {
		var defs = toResolve.resolveBinding
		if (defs == null || defs.size() == 0) throw new ReverseEngineerException("Cannot resolve binding for token: " + toResolve.text)
		else if (defs.size() > 1) throw new ReverseEngineerException("Ambiguous definition binding for token: " + toResolve.text)
		else defs.get(0)
	}	
	
	
	
}