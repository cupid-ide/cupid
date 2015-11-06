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

@Label(label="NUOPC Driver")
@MappingType("module")
public abstract class NUOPCComponent extends CodeConcept<CodeConcept<?,?>, ASTModuleNode> {
	
	@Label(label="ESMF Import", sort=1)
	@Child(forward=false)
	@MappingType("uses")
	public BasicCodeConcept importESMF
	
	@Label(label="NUOPC Import", sort=2)
	@Child(forward=false)
	@MappingType("uses")
	public BasicCodeConcept importNUOPC
	
	@Label(label="Generic Import", sort=3)
	@Child
	@MappingType("uses")
	public GenericImport importNUOPCGeneric
	
	new(CodeConcept<?, ?> parent) {
		super(parent)
	}
	
	def abstract String prefix() 
	
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
		
		override GenericImport reverse() {
			var rs = '''uses(«_id», _mid, _genericComp),
						(usesEntity(_, «_id», 'SetServices', _newName, _) ; true).'''.execQuery
			if (rs.next) {
				genericComp = rs.getString("_genericComp")
				routineSetServices = rs.getString("_newName")
				rs.close
				this
			}
			else {
				rs.close
				null
			}
		}
		
		
		
		
	}
	
}