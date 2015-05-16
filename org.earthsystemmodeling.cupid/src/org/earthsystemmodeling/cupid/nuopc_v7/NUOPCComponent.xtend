package org.earthsystemmodeling.cupid.nuopc_v7 
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.earthsystemmodeling.cupid.annotation.Label
import org.earthsystemmodeling.cupid.annotation.Child
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode
import org.earthsystemmodeling.cupid.annotation.Name
import org.earthsystemmodeling.cupid.annotation.Prop

@Label(label="NUOPC Driver", type="module")
public abstract class NUOPCComponent extends CodeConcept<CodeConcept<?,?>, ASTModuleNode> {
	
	@Label(label="ESMF Import", type="uses", sort=1)
	@Child(forward=false)
	public BasicCodeConcept importESMF
	
	@Label(label="NUOPC Import", type="uses", sort=2)
	@Child(forward=false)
	public BasicCodeConcept importNUOPC
	
	@Label(label="Generic Import", type="uses", sort=3)
	@Child
	public GenericImport importNUOPCGeneric
	
	new(CodeConcept<?, ?> parent) {
		super(parent)
	}
	
	def abstract String prefix() 
	
	@Label(label="Generic Import", type="uses")
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