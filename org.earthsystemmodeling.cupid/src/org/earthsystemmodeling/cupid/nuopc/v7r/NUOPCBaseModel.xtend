package org.earthsystemmodeling.cupid.nuopc.v7r

import org.earthsystemmodeling.cupid.annotation.Label
import org.earthsystemmodeling.cupid.annotation.MappingType
import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import java.util.List

import static org.earthsystemmodeling.cupid.nuopc.ESMFCodeTemplates.*
import static org.earthsystemmodeling.cupid.util.CodeExtraction.*
import static extension org.earthsystemmodeling.cupid.nuopc.ASTQuery.*
import org.eclipse.photran.internal.core.parser.IASTListNode
import org.eclipse.photran.internal.core.parser.IBodyConstruct
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException
import org.earthsystemmodeling.cupid.NUOPC.Field

class NUOPCBaseModel {
	
	
	@Label(label="Advertise Field")
	@MappingType("call")
	public static class AdvertiseField extends CodeConcept<EntryPointCodeConcept<?>, ASTCallStmtNode> {

		public String state
		public String standardName
		public String name

		new(EntryPointCodeConcept<?> parent) {
			super(parent)
			parent.setOrAddChild(this)
			state = _parent.paramImport
			standardName = "\"StandardName\""
			name = null
		}

		override name() {
			state + " / " + standardName
		}
		
		override List reverseMultiple() {
			
			val retList = newArrayList()
			
			_parent.ASTRef.body.filter(ASTCallStmtNode).filter[c|
				c.subroutineName.eic("NUOPC_Advertise")].forEach[
					var advField = new AdvertiseField(_parent)
					advField.state = it.litArgExprByIdx(0)
					advField.standardName = it.litArgExprByIdx(1)
					advField.name = it.litArgExprByKeyword("name")
					advField.setASTRef(it)
					retList.add(advField)	
				]
			
			retList
			
		}
		
		override forward() {

			var code = 
'''

call NUOPC_Advertise(«paramch(state)», StandardName=«paramch(standardName)»«IF name!=null», name=«paramch(name)»«ENDIF», rc=«_parent.paramRC»)
«ESMFErrorCheck(_parent.paramRC)»
'''
			val IASTListNode<IBodyConstruct> stmts = parseLiteralStatementSequence(code)
			val ASTSubroutineSubprogramNode ssn = _parent.ASTRef

			ssn.body.addAll(stmts)
			setASTRef(stmts.get(0) as ASTCallStmtNode)
			this
		}

	}
	
	@Label(label="Realize Field")
	@MappingType("call")
	public static class RealizeField extends CodeConcept<EntryPointCodeConcept<?>, ASTCallStmtNode> {

		public String state
		public String field
		public String grid
		public String fieldName

		new(EntryPointCodeConcept<?> parent) {
			super(parent)
			parent.setOrAddChild(this)
			state = _parent.paramImport
			field = "field"
			grid = "grid"
			fieldName = "\"field_name\""
		}

		override name() {
			state + " / " + fieldName
		}

		override List reverseMultiple() {
			
			val retList = newArrayList()
				
			_parent.ASTRef.body.filter(ASTCallStmtNode).filter[c|
				c.subroutineName.eic("NUOPC_Realize")].forEach[
					var relField = new RealizeField(_parent)
					relField.state = it.litArgExprByIdx(0)
					relField.field = it.litArgExprByIdx(1)
					relField.setASTRef(it)
					retList.add(relField)	
				]
			
			retList
			
		}

		override forward() {	
			
			if (field == null || fieldName == null || grid == null || state == null) {
				throw new CodeGenerationException("Missing parameters required to generate Realize Field.")
			}
			
			val ASTSubroutineSubprogramNode ssn = _parent.ASTRef
							
			addTypeDeclaration('''type(ESMF_Field) :: «field»''', ssn, true)
							
			var code = 
'''

! field «fieldName»
«field» = ESMF_FieldCreate(name=«fieldName», grid=«grid», &
  typekind=ESMF_TYPEKIND_R8, rc=«_parent.paramRC»)
«ESMFErrorCheck(_parent.paramRC)»
	
call NUOPC_Realize(«paramch(state)», field=«paramch(field)», rc=«_parent.paramRC»)
«ESMFErrorCheck(_parent.paramRC)»
'''
			val IASTListNode<IBodyConstruct> stmts = parseLiteralStatementSequence(code)
				
			ssn.body.addAll(stmts)
			super.forward
		}
		
		def forward(Field high, String state) {
			fieldName = "\"" + high.name + "\""
			field = high.name
			grid = high.grid.name
			this.state = state
		}

	}

	
}