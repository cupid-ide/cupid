package org.earthsystemmodeling.cupid.nuopc.v7r

import org.earthsystemmodeling.cupid.annotation.Child
import org.earthsystemmodeling.cupid.annotation.Label
import org.earthsystemmodeling.cupid.annotation.MappingType
import org.earthsystemmodeling.cupid.annotation.Name
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept
import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode

import static extension org.earthsystemmodeling.cupid.nuopc.ASTQuery.*
import static org.earthsystemmodeling.cupid.util.CodeExtraction.parseLiteralProgramUnit
import static org.earthsystemmodeling.cupid.util.CodeExtraction.parseLiteralStatement
import java.util.List
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTAccessStmtNode
import org.eclipse.photran.internal.core.parser.ASTContainsStmtNode
import org.eclipse.photran.internal.core.parser.ASTImplicitStmtNode
import org.earthsystemmodeling.cupid.nuopc.ESMFCodeTemplates
import org.eclipse.photran.internal.core.parser.ASTArrayConstructorNode
import org.earthsystemmodeling.cupid.nuopc.ReverseEngineerException
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException
import org.earthsystemmodeling.cupid.NUOPC.BaseModel

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

	@Child(min=0, max=-1, forward=true)
	var public List<MethodRegistration> registrations

	new(P parent) {
		super(parent)
		registrations = newArrayList()
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
			registrations = new MethodRegistration(this).reverseMultiple
			this
		}
		else null	
	}
	
	def forward(BaseModel high) {
		high.advance.forEach[a|
			if (!a.phaseLabel.nullOrEmpty) {
				//ensureImport(_parent.importNUOPCGeneric.ASTRef, "label_Advance", _parent.prefix + "_label_Advance")
				//make sure run routine is there
				//if (_parent.importNUOPCGeneric.routineRun == null)
				//	_parent.importNUOPCGeneric.routineRun = _parent.prefix + "_routine_Run" 
				
				_parent.importNUOPCGeneric.imports.put("routine_Run", _parent.prefix + "_routine_Run")
				
				val mr = new MethodRegistration(this)
				mr.internal = false
				mr.methodType = "ESMF_METHOD_RUN"
				mr.phaseLabelList.clear()
				mr.phaseLabelList.add("\"" + a.phaseLabel + "\"")
				mr.userRoutine = _parent.prefix + "_routine_Run"
			}
		]
	}
		
	override forward() {
		
		//add to generic import if necessary
		var routineSetServices = _parent.importNUOPCGeneric.routineSetServices
		if (routineSetServices == null) {
			routineSetServices = _parent.prefix + "_SetServices";
			ensureImport(_parent.importNUOPCGeneric.ASTRef, "SetServices", routineSetServices)
		}
		
				
		var code = 	
'''

subroutine SetServices(«paramGridComp», «paramRC»)
    type(ESMF_GridComp)  :: «paramGridComp»
    integer, intent(out) :: «paramRC»
    
    rc = ESMF_SUCCESS
    
    ! NUOPC_Driver registers the generic methods
    call NUOPC_CompDerive(«paramGridComp», «routineSetServices», rc=«paramRC»)
    «ESMFCodeTemplates.ESMFErrorCheck(paramRC)»
    
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
		
		//reverse()
		
		super.forward
		
		
	}

	
	@Label(label="Set Entry Point")
	@MappingType("call")
	public static class MethodRegistration extends CodeConcept<SetServicesCodeConcept, ASTCallStmtNode> {
	
		public String methodType
		public List<String> phaseLabelList
		public String userRoutine
		public boolean internal
	
		new(SetServicesCodeConcept parent) {
			super(parent)
			parent.setOrAddChild(this)
			phaseLabelList = newArrayList()
			
			//defaults
			methodType = "ESMF_METHOD_INITIALIZE"
			phaseLabelList.add("\"phaseLabel\"")
			userRoutine = "userRoutine"
			internal = false
		}
		
		override name() {
			if (phaseLabelList.size() > 0) 
				userRoutine + " / " + phaseLabelList.get(0)
			else userRoutine 
		}
		
		override forward() {
			
			val setServicesNode =  _parent.ASTRef as ASTSubroutineSubprogramNode
			if (setServicesNode == null) throw new CodeGenerationException("No SetServices found")
			
			val subroutineToCall = {
				if (internal) "NUOPC_CompSetInternalEntryPoint"
				else "NUOPC_CompSetEntryPoint"
			} 	
			
    		var code = 
			'''
			
			call «subroutineToCall»(«_parent.paramGridComp», «methodType», &
			      phaseLabelList=(/«FOR pl : phaseLabelList SEPARATOR ", "»«pl»«ENDFOR»/), &
			      userRoutine=«userRoutine», rc=«_parent.paramRC»)
			'''

			var ASTCallStmtNode regCall = parseLiteralStatement(code) as ASTCallStmtNode
			setServicesNode.body.add(regCall)
			setASTRef(regCall)
					
			code = '''«ESMFCodeTemplates.ESMFErrorCheck(_parent.paramRC)»'''
			
			var ifNode = parseLiteralStatement(code)
			setServicesNode.body.add(ifNode)
    	
    		this
		}
		
		override List reverseMultiple() {
			
			val setServicesNode =  _parent.ASTRef as ASTSubroutineSubprogramNode
			if (setServicesNode == null) throw new ReverseEngineerException("No SetServices found")
			
			val retList = newArrayList()
			
			setServicesNode.body.filter(ASTCallStmtNode).filter[
				it.subroutineName.text.eic("NUOPC_CompSetEntryPoint") ||
				it.subroutineName.text.eic("NUOPC_CompSetInternalEntryPoint")
				].forEach[c|
					val mr = new MethodRegistration(_parent)
					mr.methodType = c.litArgExprByIdx(1)
					val ASTArrayConstructorNode pll = c.argExprByKeywordElseIdx("phaseLabelList", 2)
					mr.phaseLabelList.clear()
					pll?.acValueList?.forEach[v|
						mr.phaseLabelList.add(v.expr.literal)
					]
					mr.userRoutine = c.litArgExprByKeywordElseIdx("userRoutine", 3)
					if (c.subroutineName.text.eic("NUOPC_CompSetInternalEntryPoint")) {
						mr.internal = true
					}
					else {
						mr.internal = false
					}
					mr.setASTRef(c)
					retList.add(mr)
				]
				
			retList
		}
		
	}


}
