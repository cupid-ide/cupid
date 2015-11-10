package org.earthsystemmodeling.cupid.nuopc.v7bs59

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
import java.sql.PreparedStatement
import java.lang.reflect.Constructor

public abstract class SpecializationMethodCodeConcept<P extends CodeConcept<?, ?>> extends CodeConcept<P, ASTSubroutineSubprogramNode> {

	//@Name
	var public String subroutineName = "SpecializationMethod"  //subclasses should default

	var public String specLabel = "label_SpecializationLabel"  //subclasses should default
	
	@Label(label="Phase Label")
	@Prop
	var public String specPhaseLabel

	@Label(label="Registration")
	@MappingType("call")
	@Child
	var public BasicCodeConcept registration

	var public String paramGridComp = "driver"	//subclasses should default

	var public String paramRC = "rc" //subclasses should default

	var String labelComponent
	var String labelName
	
	//PreparedStatement
	static PreparedStatement stmtRegspec = null	

	new(P parent, String labelComponent, String labelName) {
		super(parent)
		this.labelComponent = labelComponent
		this.labelName = labelName
		
		if (stmtRegspec == null) {
			stmtRegspec = _codeDB.prepareStatement('''
								SELECT * FROM esmf_regspec 
								WHERE mod_id=? AND genericUse=? AND specLabelOrig=?''')
		}
	}
	
	override name() {
		if (specPhaseLabel != null)
			subroutineName + " (" + specPhaseLabel + ")"
		else
			subroutineName
	}

	override SpecializationMethodCodeConcept<P> reverse() {
			
		stmtRegspec.setLong(1, parentID)
		stmtRegspec.setString(2, labelComponent)
		stmtRegspec.setString(3, labelName)
		
		var rs = stmtRegspec.executeQuery
		
		if (rs.next) {
			_id = rs.getLong("id")
			subroutineName = rs.getString("name")
			specLabel = rs.getString("specLabelExpr")
			specPhaseLabel = rs.getString("specPhaseLabel")
			paramGridComp = rs.getString("param_gcomp")
			paramRC = rs.getString("param_rc")
			registration = newBasicCodeConcept(this, rs.getLong("reg_id"))
							
			rs.close	
			reverseChildren
		} else {
			rs.close
			null
		}
	}
	
	override List reverseMultiple() {
		
		var retList = newArrayList()
		
		stmtRegspec.setLong(1, parentID)
		stmtRegspec.setString(2, labelComponent)
		stmtRegspec.setString(3, labelName)
		
		var rs = stmtRegspec.executeQuery
		
		var Constructor<?> con = this.class.constructors.findFirst[parameterCount==1]
		while (rs.next) {
			
			var SpecializationMethodCodeConcept<P> smcc = 
				con.newInstance(_parent) as SpecializationMethodCodeConcept<P>					
			
			smcc._id = rs.getLong("id")
			smcc.subroutineName = rs.getString("name")
			smcc.specLabel = rs.getString("specLabelExpr")
			smcc.specPhaseLabel = rs.getString("specPhaseLabel")
			smcc.paramGridComp = rs.getString("param_gcomp")
			smcc.paramRC = rs.getString("param_rc")
			smcc.registration = newBasicCodeConcept(this, rs.getLong("reg_id"))
			
			smcc = smcc.reverseChildren
			if (smcc != null) {
				retList.add(smcc)
			}
		}
		rs.close
				
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