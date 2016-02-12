package org.earthsystemmodeling.cupid.nuopc

import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode

import static extension org.earthsystemmodeling.cupid.nuopc.ASTQuery.*

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
			var par1 = it.subroutineStmt.subroutinePars?.get(0)?.variableName.resolveBinding.get(0)
			if (par1?.type.toString.eic("type(esmf_gridcomp)")) {
				var par2 = it.subroutineStmt.subroutinePars?.get(1)?.variableName.resolveBinding.get(0)
				par2.type.toString.eic("integer") &&
				!par2.intentIn && 
				par2.intentOut
				}
			}
		]
	}
	
	/*
	esmf_entrypoint(_id, _parentid, _name, _param_gridcomp, _param_import, _param_export, _param_clock, _param_rc) :- 
  	subroutine(_id, _parentid, _name),
  	param(_pid1, _id, 1, _param_gridcomp, 'type(esmf_gridcomp)', _, _),
  	param(_pid2, _id, 2, _param_import,   'type(esmf_state)',    _, _),
  	param(_pid3, _id, 3, _param_export,   'type(esmf_state)',    _, _),
  	param(_pid4, _id, 4, _param_clock,    'type(esmf_clock)',    _, _),
  	param(_pid5, _id, 5, _param_rc,       'integer',             false, true).
	*/
	
	def static findESMFEntryPoints(ASTModuleNode node) {
		node.body.filter(ASTSubroutineSubprogramNode).filter[
			it.subroutineStmt.subroutinePars?.size == 5 
			&&
			{
			var par1 = it.subroutineStmt.subroutinePars?.get(0)?.variableName.resolveBinding.get(0)
			if (par1?.type.toString.eic("type(esmf_gridcomp)")) {
				var par2 = it.subroutineStmt.subroutinePars?.get(1)?.variableName.resolveBinding.get(0)
				if (par2.type.toString.eic("type(esmf_state)")) {
					var par3 = it.subroutineStmt.subroutinePars?.get(2)?.variableName.resolveBinding.get(0)
					if (par3.type.toString.eic("type(esmf_state)")) {
						var par4 = it.subroutineStmt.subroutinePars?.get(3)?.variableName.resolveBinding.get(0)
						if (par4.type.toString.eic("type(esmf_clock)")) {
							var par5 = it.subroutineStmt.subroutinePars?.get(4)?.variableName.resolveBinding.get(0)
							par5.type.toString.eic("integer") &&
							!par5.intentIn &&
							par5.intentOut
						}
					}
				}
			}
			}
		]
	}
	
		
	
	
}