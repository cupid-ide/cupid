package org.earthsystemmodeling.cupid.nuopc.v7bs59 
import org.eclipse.photran.internal.core.parser.ASTModuleNode

import org.earthsystemmodeling.cupid.annotation.Label
import org.earthsystemmodeling.cupid.annotation.Child
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode
import org.earthsystemmodeling.cupid.annotation.Name
import org.earthsystemmodeling.cupid.annotation.Prop
import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept
import org.earthsystemmodeling.cupid.annotation.MappingType
import org.eclipse.core.resources.IResource

import static extension org.earthsystemmodeling.cupid.nuopc.ASTQuery.*
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException
import static org.earthsystemmodeling.cupid.util.CodeExtraction.*
import org.eclipse.photran.internal.core.parser.ASTListNode
import org.eclipse.photran.internal.core.parser.IProgramUnit

@Label(label="NUOPC Driver")
@MappingType("module")
public abstract class NUOPCComponent extends CodeConcept<CodeConcept<?,?>, ASTModuleNode> {
	
	protected String genericImport
	
	public String name
	
	@Label(label="ESMF Import", sort=1)
	@Child(forward=false)
	@MappingType("uses")
	public BasicCodeConcept<ASTUseStmtNode> importESMF
	
	@Label(label="NUOPC Import", sort=2)
	@Child(forward=false)
	@MappingType("uses")
	public BasicCodeConcept<ASTUseStmtNode> importNUOPC
	
	@Label(label="Generic Import", sort=3)
	@Child
	@MappingType("uses")
	public GenericImport importNUOPCGeneric
	
	new(CodeConcept<?, ?> parent, String genericImport) {
		this(parent, null, genericImport)
	}
	
	new(CodeConcept<?,?> parent, IResource context, String genericImport) {
		super(parent, context)
		this.genericImport = genericImport
		if (genericImport==null) throw new CodeGenerationException("Name of generic import of component cannot be null")
	}
	
	def abstract String prefix() 
	
	override name() {
		name + " (" + _context?.name + ")"
	}
		
	override reverse() {
		
		var ast = getAST()
				
		_astRef = ast.root?.programUnitList?.filter(ASTModuleNode)?.findFirst[
			it.moduleBody?.filter(ASTUseStmtNode)?.exists[it.name.text.eic(genericImport)]
		]
		
		if (_astRef != null) {
			name = _astRef.moduleStmt.moduleName.moduleName.text
			
			//move some or all of these to NUOPCComponent
			_astRef.moduleBody.filter(ASTUseStmtNode).forEach[
				if (it.name.text.eic("ESMF")) {
					importESMF = new BasicCodeConcept<ASTUseStmtNode>(this, it)
				}
				else if (it.name.text.eic("NUOPC")) {
					importNUOPC = new BasicCodeConcept<ASTUseStmtNode>(this, it)
				}
				else if (it.name.text.eic(genericImport)) {
					importNUOPCGeneric = new GenericImport(this, it).reverse
				}
			]
						
			reverseChildren
			
		}
		else null
	}
	
	//subclasses should override
	def <T extends NUOPCComponent> T reverseChildren() {this as T}
	
	
	override NUOPCComponent fward() {
				
		if (name == null) throw new CodeGenerationException("No component name specified")
		
		//create module
		var code = 
'''
module «name»
	
	use ESMF
	use NUOPC
	use «genericImport», only: &
		«prefix»_SetServices => SetServices
		
	implicit none
	
	contains
	
end module
'''
	
		var ASTModuleNode moduleNode = parseLiteralProgramUnit(code)
		setASTRef(moduleNode)
		
		var pul = new ASTListNode<IProgramUnit>()
		pul.add(moduleNode)
		getAST.root.programUnitList = pul
		
		moduleNode.moduleBody.filter(ASTUseStmtNode).forEach[
			if (it.name.text.eic("ESMF")) {
				importESMF = new BasicCodeConcept(this, it)
			}
			else if (it.name.text.eic("NUOPC")) {
				importNUOPC = new BasicCodeConcept(this, it)
			}
			else if (it.name.text.eic(genericImport)) {
				importNUOPCGeneric = new GenericImport(this, it).reverse
			}
		]	
		
		super.fward
		
	}
	
	
	
	@Label(label="Generic Import")
	@MappingType("uses")
	public static class GenericImport extends CodeConcept<NUOPCComponent, ASTUseStmtNode> {
	
		@Name
		public String genericComp
		
		@Prop
		@Label(label="routineSetServices")
		public String routineSetServices
		
		new(NUOPCComponent parent, long id) {
			super(parent)
			_id = id;
		}
		
		new(NUOPCComponent parent, ASTUseStmtNode astRef) {
			super(parent)
			_astRef = astRef
		}
		
		override GenericImport reverse() {
			genericComp = getASTRef?.name.text
			var on = getASTRef?.onlyList?.findFirst[it.name.text.equalsIgnoreCase("SetServices")]
			if (on != null) {
				routineSetServices = {
					if (on.renamed) on.newName.text
					else on.name.text
				}
			}
			else {
				var rn = getASTRef?.renameList?.findFirst[it.name.text.equalsIgnoreCase("SetServices")]
				if (rn != null) {
					routineSetServices = rn.newName.text
				}
			}
			this
		}
		
		
	}
	
}