package org.earthsystemmodeling.cupid.nuopc.v7r

import java.util.List
import org.earthsystemmodeling.cupid.annotation.Child
import org.earthsystemmodeling.cupid.annotation.Label
import org.earthsystemmodeling.cupid.annotation.MappingType
import org.earthsystemmodeling.cupid.annotation.Prop
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept
import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException
import org.eclipse.photran.core.IFortranAST
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.eclipse.photran.internal.core.parser.ASTIfStmtNode
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode

import static org.earthsystemmodeling.cupid.util.CodeExtraction.parseLiteralProgramUnit
import static org.earthsystemmodeling.cupid.util.CodeExtraction.parseLiteralStatement

import static extension org.earthsystemmodeling.cupid.nuopc.ASTQuery.*
import static extension org.earthsystemmodeling.cupid.nuopc.ESMFQuery.*
import org.earthsystemmodeling.cupid.nuopc.ESMFCodeTemplates

public abstract class SpecializationMethodCodeConcept<P extends CodeConcept<?,?>> extends CodeConcept<P, ASTSubroutineSubprogramNode> {

	//@Name
	var public String subroutineName = "SpecializationMethod"  //subclasses should default

	var public String specLabel = "label_SpecializationLabel"  //subclasses should default
	
	@Label(label="Phase Label")
	@Prop
	var public String specPhaseLabel

	@Label(label="Registration")
	@MappingType("call")
	@Child
	var public BasicCodeConcept<ASTCallStmtNode> registration

	var public String paramGridComp = "driver"	//subclasses should default

	var public String paramRC = "rc" //subclasses should default

	var String labelComponent
	var String labelName
	
	

	new(P parent, String labelComponent, String labelName) {
		super(parent)
		parent.setOrAddChild(this)
		this.labelComponent = labelComponent
		this.labelName = labelName
	}
	
	override name() {
		if (specPhaseLabel != null)
			subroutineName + " (" + specPhaseLabel + ")"
		else
			subroutineName
	}
 
 	override reverse() {
 		val lst = reverseMultiple
 		if (lst?.size() > 0) 
 			lst?.get(0) as CodeConcept<P, ASTSubroutineSubprogramNode>
 		else null
 	}

	override List reverseMultiple() {
	
		val moduleNode = module?.ASTRef
		if (moduleNode == null) return null
		val setServicesNode = setServices?.ASTRef	
		if (setServicesNode==null) return null	
			
		val esmfMethods = moduleNode.findESMFMethods
	
		val resultList = newArrayList()
		
		val pGridComp = setServicesNode.subroutineStmt.subroutinePars.get(0).variableName.text
		val pRC =  setServicesNode.subroutineStmt.subroutinePars.get(1).variableName.text
		
		esmfMethods.filter[it != setServicesNode].forEach[m|
			setServicesNode.body.filter(ASTCallStmtNode).
				filter[
						it.subroutineName.eic("NUOPC_CompSpecialize") &&
						it.litArgExprByKeyword("specRoutine")?.eic(m.subroutineStmt.subroutineName.subroutineName) &&
						it.litArgExprByKeyword("specLabel")?.eic(moduleNode.localName(labelComponent, labelName))]
					.forEach[c|
					
						var smcc = newInstance() as SpecializationMethodCodeConcept<P> //will be instance of subclass			
						smcc => [
							subroutineName = m.subroutineStmt.subroutineName.subroutineName.text
							specLabel = c.litArgExprByKeyword("specLabel")
						    specPhaseLabel = c.litArgExprByKeyword("specPhaseLabel")
							paramGridComp = pGridComp
							paramRC = pRC
							registration = new BasicCodeConcept(this, c)
							setASTRef(m)
						]					
				
						smcc = smcc.reverseChildren
						if (smcc != null) {
							resultList.add(smcc)
						}
					]
				]
				
		resultList
	
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
		
		//add specialization subroutine itself			
		var code = subroutineTemplate()

		var ASTModuleNode mn = module.getASTRef
		var ASTSubroutineSubprogramNode ssn = parseLiteralProgramUnit(code)
		mn.getModuleBody().add(ssn)
		setASTRef(ssn)

		//add label import
		var usn = ensureImport(genericUse.ASTRef, labelName, specLabel)
		genericUse.setASTRef(usn)

		//add call in setservices
		var ASTSubroutineSubprogramNode setServicesNode = setServices().getASTRef
		if (setServicesNode != null) {

			code = 
'''

call NUOPC_CompSpecialize(«setServices().paramGridComp», specLabel=«specLabel», &
	«IF specPhaseLabel!=null»specPhaseLabel=«specPhaseLabel», «ENDIF»specRoutine=«subroutineName», rc=«setServices().paramRC»)
'''

			var ASTCallStmtNode regCall = parseLiteralStatement(code) as ASTCallStmtNode
			setServicesNode.body.add(regCall)
			this.registration = new BasicCodeConcept<ASTCallStmtNode>(this, regCall)
		
			code = '''«ESMFCodeTemplates.ESMFErrorCheck(paramRC)»'''
			
			var ASTIfStmtNode ifNode = parseLiteralStatement(code) as ASTIfStmtNode
			setServicesNode.body.add(ifNode)
		
		}

		super.forward

	}
	
	

}
