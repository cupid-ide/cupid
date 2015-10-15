package org.earthsystemmodeling.cupid.nuopc.v7bs50

import org.eclipse.photran.internal.core.parser.IASTNode
import org.earthsystemmodeling.cupid.annotation.Name
import org.earthsystemmodeling.cupid.annotation.Label
import org.earthsystemmodeling.cupid.annotation.Child
import static org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept.newBasicCodeConcept
import org.eclipse.photran.core.IFortranAST
import org.eclipse.photran.internal.core.parser.ASTModuleNode

import static org.earthsystemmodeling.cupid.util.CodeExtraction.parseLiteralStatement
import static org.earthsystemmodeling.cupid.util.CodeExtraction.parseLiteralProgramUnit
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.eclipse.photran.internal.core.parser.ASTIfStmtNode
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept
import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException
import org.earthsystemmodeling.cupid.annotation.MappingType
import java.util.List
import org.earthsystemmodeling.cupid.annotation.Prop

public abstract class SpecializationMethodCodeConcept<P extends CodeConcept<?, ?>> extends CodeConcept<P, ASTSubroutineSubprogramNode> {

	@Name
	var public String subroutineName = "SpecializationMethod"  //subclasses should default

	var public String specLabel = "label_SpecializationLabel"  //subclasses should default
	
	@Prop
	var public String specPhaseLabel = "EMPTY"

	@Label(label="Registration")
	@MappingType("call")
	@Child
	var public BasicCodeConcept registration

	var public String paramGridComp = "driver"	//subclasses should default

	var public String paramRC = "rc" //subclasses should default

	var String labelComponent
	var String labelName
	//var SetServicesCodeConcept<?> setServices

	new(P parent, String labelComponent, String labelName) {
		super(parent)
		this.labelComponent = labelComponent
		this.labelName = labelName
	}

	override SpecializationMethodCodeConcept<P> reverse() {
		var rs = '''esmf_regspec(_sid, «parentID», _name, '«labelComponent»', _specLabelExpr, '«labelName»', _specPhaseLabel, _regid, _paramgcomp, _paramrc).'''.
			execQuery
		if (rs.next) {
			_id = rs.getLong("_sid")
			subroutineName = rs.getString("_name")
			specLabel = rs.getString("_specLabelExpr")
			specPhaseLabel = rs.getString("_specPhaseLabel")
			registration = newBasicCodeConcept(this, rs.getLong("_regid"))
			paramGridComp = rs.getString("_paramgcomp")
			paramRC = rs.getString("_paramrc")
				
			rs.close
			/*
			rs = '''esmf_specmethod(«_id», «parentID», _, _param_gridcomp, _param_rc).'''.execQuery
			if (rs.next) {
				paramGridComp = rs.getString("_param_gridcomp")
				paramRC = rs.getString("_param_rc")
				rs.close
			}
			*/

			reverseChildren
		} else {
			rs.close
			null
		}
	}
	
	override List reverseMultiple() {
		var retList = newArrayList()

		/*
		var rs = '''call_(_cid, «parentID», 'NUOPC_StateAdvertiseField'),
					callArgWithType(_, _cid, 1, _, _, _stateExpr),
					callArgWithType(_, _cid, 2, _, _, _standardNameExpr).'''.execQuery

		while (rs.next) {
			var advField = new AdvertiseField(_parent);
			advField._id = rs.getLong("_cid")
			advField.state = rs.getString("_stateExpr")
			advField.standardName = rs.getString("_standardNameExpr")
			retList.add(advField)
		}
		rs.close
		*/

		var rs = '''esmf_regspec(_sid, «parentID», _name, '«labelComponent»', _specLabelExpr, '«labelName»', _specPhaseLabel, _regid, _paramgcomp, _paramrc).'''.
			execQuery

		while (rs.next) {
			var smcc = this.class.newInstance
			smcc._parent = _parent
			smcc._id = rs.getLong("_sid")
			smcc.subroutineName = rs.getString("_name")
			smcc.specLabel = rs.getString("_specLabelExpr")
			smcc.specPhaseLabel = rs.getString("_specPhaseLabel")
			smcc.registration = newBasicCodeConcept(this, rs.getLong("_regid"))
			
			smcc = smcc.reverseChildren
			if (smcc != null) {
				retList.add(smcc)
			}
		}
		rs.close
		
		/*
		rs = '''esmf_specmethod(«_id», «parentID», _, _param_gridcomp, _param_rc).'''.execQuery
			if (rs.next) {
				paramGridComp = rs.getString("_param_gridcomp")
				paramRC = rs.getString("_param_rc")
				rs.close
			}
			
			*/

		retList
	}

	def reverseChildren() {
		this
	}

	/*
	 * override
	 */
	def String subroutineTemplate() {
		'''

subroutine «subroutineName»(«paramGridComp», «paramRC»)
    type(ESMF_GridComp)  :: «paramGridComp»
    integer, intent(out) :: «paramRC»

    rc = ESMF_SUCCESS

end subroutine
'''
	}

	def abstract CodeConcept<?, ASTModuleNode> module()

	def abstract SetServicesCodeConcept<?> setServices()

	def abstract NUOPCComponent.GenericImport genericUse()

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
		var usesNUOPCDriver = genericUse.getASTRef as ASTUseStmtNode
		var tempCode = usesNUOPCDriver.toString.trim
		tempCode += ''', &
		«IF !specLabel.equals(labelName)»«specLabel» => «ENDIF»«labelName»'''

		var tempNode = parseLiteralStatement(tempCode) as ASTUseStmtNode;
		usesNUOPCDriver.replaceWith(tempNode)

		//add call in setservices
		var ASTSubroutineSubprogramNode setServicesNode = setServices().getASTRef
		if (setServicesNode != null) {

			code = 
'''

call NUOPC_CompSpecialize(«setServices().paramGridComp», specLabel=«specLabel», &
	specRoutine=«subroutineName», rc=«setServices().paramRC»)
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
