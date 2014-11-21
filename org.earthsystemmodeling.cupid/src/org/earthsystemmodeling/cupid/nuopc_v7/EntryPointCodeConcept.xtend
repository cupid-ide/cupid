package org.earthsystemmodeling.cupid.nuopc_v7

import org.eclipse.photran.internal.core.parser.IASTNode
import org.earthsystemmodeling.cupid.annotation.Name
import org.earthsystemmodeling.cupid.annotation.Label
import org.earthsystemmodeling.cupid.annotation.Child
import static org.earthsystemmodeling.cupid.nuopc_v7.BasicCodeConcept.newBasicCodeConcept
import org.eclipse.photran.core.IFortranAST
import org.eclipse.photran.internal.core.parser.ASTModuleNode

import static org.earthsystemmodeling.cupid.util.CodeExtraction.parseLiteralStatement
import static org.earthsystemmodeling.cupid.util.CodeExtraction.parseLiteralProgramUnit
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.eclipse.photran.internal.core.parser.ASTIfStmtNode
import java.util.List
import org.earthsystemmodeling.cupid.annotation.Prop

public abstract class EntryPointCodeConcept<P extends CodeConcept<?, ?>> extends CodeConcept<P, ASTSubroutineSubprogramNode> {

	@Name
	public String subroutineName = "NUOPCEntryPoint"  //subclasses should default

	@Label(label="Registration", type="call")
	@Child
	public BasicCodeConcept registration

	public String paramGridComp = "gcomp"	//subclasses should default
	public String paramRC = "rc" //subclasses should default
	public String paramImport = "importState"
	public String paramExport = "exportState"
	public String paramClock = "clock"
	
	public String methodType = "ESMF_METHOD_INITIALIZE"
	
	public List<String> phaseLabelList
	
	String phaseLabel

	//var SetServicesCodeConcept<?> setServices

	new(P parent, String phaseLabel) {
		super(parent)
		phaseLabelList = newArrayList()
		this.phaseLabel = phaseLabel
	}

	override reverse() {
		
		var rs = '''esmf_reg_entrypoint(_epId, «module()._id», _epName, '"«phaseLabel»"', _regid).'''.execQuery		
		
		if (rs.next) {
			_id = rs.getLong("_epId")
			subroutineName = rs.getString("_epName")
			registration = newBasicCodeConcept(this, rs.getLong("_regid"))
			rs.close
			
			rs = '''esmf_entrypoint(_sid, «parentID», _name, _param_gridcomp, _param_import, _param_export, _param_clock, _param_rc).'''.execQuery
			if (rs.next) {
				paramGridComp = rs.getString("_param_gridcomp")
				paramImport = rs.getString("_param_import")
				paramExport = rs.getString("_param_export")
				paramClock = rs.getString("_param_clock")
			}
			rs.close
							      
			reverseChildren
		} 
		else {
			rs.close
			null
		}	
	}

	def reverseChildren() {
		this
	}

	/*
	 * override
	 */
	def String subroutineTemplate() {
		'''

subroutine «subroutineName»(«paramGridComp», «paramImport», «paramExport», «paramClock», «paramRC»)
    type(ESMF_GridComp)  :: «paramGridComp»
    type(ESMF_State)     :: «paramImport», «paramExport»
    type(ESMF_Clock)     :: «paramClock»
    integer, intent(out) :: «paramRC»
    
    rc = ESMF_SUCCESS
    
end subroutine
'''
	}

	def abstract CodeConcept<?, ASTModuleNode> module()

	def abstract SetServicesCodeConcept<?> setServices()

	//def abstract BasicCodeConcept genericUse()

	override forward() {

		if (setServices() == null) {
			throw new CodeGenerationException("A SetServices subroutine must exist first.")	
		}
		
		val IFortranAST ast = getAST()

		//add specialization subroutine itself			
		var code = subroutineTemplate()

		var ASTModuleNode mn = module.getASTRef
		var ASTSubroutineSubprogramNode ssn = parseLiteralProgramUnit(code)

		mn.getModuleBody().add(ssn)
		setASTRef(ssn)

		//add label import
		//var usesNUOPCDriver = genericUse.getASTRef as ASTUseStmtNode
		//var tempCode = usesNUOPCDriver.toString.trim
		//tempCode += ''', &
		//«IF !specLabel.equals(labelName)»«specLabel» => «ENDIF»«labelName»'''

		//var tempNode = parseLiteralStatement(tempCode) as ASTUseStmtNode;
		//usesNUOPCDriver.replaceWith(tempNode)

		//add call in setservices
		var ASTSubroutineSubprogramNode setServicesNode = setServices().getASTRef
		if (setServicesNode != null) {

			code = 
'''

call NUOPC_CompSetEntryPoint(«setServices().paramGridComp», «methodType», &
	«IF phaseLabel!=null»phaseLabelList=(/"«phaseLabel»"/),«ENDIF» userRoutine=«subroutineName», rc=«setServices().paramRC»)
'''

			var ASTCallStmtNode regCall = parseLiteralStatement(code) as ASTCallStmtNode
			setServicesNode.body.add(regCall)
		
			code = 
'''
if (ESMF_LogFoundError(rcToCheck=«paramRC», msg=ESMF_LOGERR_PASSTHRU, &
            line=__LINE__, &
            file=__FILE__)) &
            return  ! bail out
'''
			var ASTIfStmtNode ifNode = parseLiteralStatement(code) as ASTIfStmtNode
			setServicesNode.body.add(ifNode)
		
		}

		ast

	}

}
