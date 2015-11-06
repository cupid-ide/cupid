package org.earthsystemmodeling.cupid.nuopc.v7bs59

import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException
import org.eclipse.photran.core.IFortranAST
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.eclipse.photran.internal.core.parser.ASTIfStmtNode
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode

import static org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept.newBasicCodeConcept
import static org.earthsystemmodeling.cupid.util.CodeExtraction.parseLiteralProgramUnit
import static org.earthsystemmodeling.cupid.util.CodeExtraction.parseLiteralStatement

public abstract class InternalEntryPointCodeConcept<P extends CodeConcept<?, ?>> extends EntryPointCodeConcept<P> {

	
	new(P parent, String phaseLabel) {
		super(parent, phaseLabel)		
	}
	
	/* subclasses using this must explicitly set the phaseLabel */
	new(P parent) {
		this(parent, null)
	}

	override reverse() {
		
		var rs = '''esmf_reg_intentrypoint(_epId, «module()._id», _epName, '"«phaseLabel»"', _regid).'''.execQuery		
		
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

call NUOPC_CompSetInternalEntryPoint(«setServices().paramGridComp», «methodType», &
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
