package org.earthsystemmodeling.cupid.nuopc.v7r

import org.earthsystemmodeling.cupid.annotation.Child
import org.earthsystemmodeling.cupid.annotation.Label
import org.earthsystemmodeling.cupid.annotation.MappingType
import org.earthsystemmodeling.cupid.annotation.Name
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept
import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import org.eclipse.photran.internal.core.parser.ASTAccessStmtNode
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.eclipse.photran.internal.core.parser.ASTContainsStmtNode
import org.eclipse.photran.internal.core.parser.ASTImplicitStmtNode
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode

import static org.earthsystemmodeling.cupid.util.CodeExtraction.parseLiteralProgramUnit
import static org.earthsystemmodeling.cupid.util.CodeExtraction.parseLiteralStatement

@Label(label="SetServices")
@MappingType("subroutine")
public class SetServicesCodeConcept<P extends NUOPCComponent> extends CodeConcept<P, ASTSubroutineSubprogramNode> {

	@Name
	var public String subroutineName = "SetServices"
	
	var public String paramGridComp = "gcomp"
	var public String paramRC = "rc"

	@Label(label="NUOPC_CompDerive")
	@MappingType("call")
	@Child
	var public BasicCodeConcept<ASTCallStmtNode> callsCompDeriveID

	new(P parent) {
		super(parent)
	}

	override SetServicesCodeConcept<P> reverse() {
		
		//can be optimized by splitting this into two queries
		//because the second more expensive OR condition is checked on each node
		var node = _parent.ASTRef.moduleBody?.findAll(ASTSubroutineSubprogramNode).findFirst[
			it.subroutineStmt?.subroutineName.subroutineName.text.equalsIgnoreCase("SetServices") ||  //change to subroutineName
			//also accept if a subroutine calls NUOPC_CompDerive
			it.body.findAll(ASTCallStmtNode).exists[
				it.subroutineName.text.equalsIgnoreCase("NUOPC_CompDerive")
			]
		]
		
		if (node != null) {
			subroutineName = node.subroutineStmt?.subroutineName.subroutineName.text
			paramGridComp = node.subroutineStmt?.subroutinePars?.get(0)?.variableName.text
			paramRC = node.subroutineStmt?.subroutinePars?.get(1)?.variableName.text
			callsCompDeriveID = {
				var csn = node.body.findAll(ASTCallStmtNode).findFirst[
					it.subroutineName.text.equalsIgnoreCase("NUOPC_CompDerive")
				]
				if (csn != null) new BasicCodeConcept(this, csn)
			}
			setASTRef(node)
			this
		}
		else null	
	}
		
	override forward() {
		
		//add to generic import if necessary
		//TODO: is there a cleaner way to do this?
		var routineSetServices = _parent.importNUOPCGeneric.routineSetServices
		if (routineSetServices == null) {
			routineSetServices = _parent.prefix + "_SetServices";
			val ASTUseStmtNode genericUse = _parent.importNUOPCGeneric.ASTRef as ASTUseStmtNode
			var tempCode = genericUse.toString.trim
			tempCode += ''', &
						«routineSetServices» => SetServices'''
			var tempNode = parseLiteralStatement(tempCode) as ASTUseStmtNode;
			genericUse.replaceWith(tempNode)					
		}
				
		var code = 	
'''

subroutine SetServices(«paramGridComp», «paramRC»)
    type(ESMF_GridComp)  :: «paramGridComp»
    integer, intent(out) :: «paramRC»
    
    rc = ESMF_SUCCESS
    
    ! NUOPC_Driver registers the generic methods
    call NUOPC_CompDerive(«paramGridComp», «routineSetServices», rc=«paramRC»)
    if (ESMF_LogFoundError(rcToCheck=«paramRC», msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
      
end subroutine
'''

		var ASTModuleNode mn = _parent.ASTRef
		var ASTSubroutineSubprogramNode ssn = parseLiteralProgramUnit(code)

		mn.getModuleBody().add(ssn)
		setASTRef(ssn)
		
		
		//make SetServices public
		code = 
'''

public SetServices
'''
		var tempNode = parseLiteralStatement(code) as ASTAccessStmtNode;
		
		var ASTContainsStmtNode csn = mn.getModuleBody().findLast(ASTContainsStmtNode)
		if (csn != null) {
			mn.getModuleBody().insertBefore(csn, tempNode)
		}
		else {
			var ASTImplicitStmtNode isn = mn.getModuleBody().findLast(ASTImplicitStmtNode)
			if (isn != null) {
				mn.getModuleBody().insertAfter(isn, tempNode)
			}
			else {
				mn.getModuleBody().add(tempNode)
			}
		}
		
		reverse()
		
	}


}
