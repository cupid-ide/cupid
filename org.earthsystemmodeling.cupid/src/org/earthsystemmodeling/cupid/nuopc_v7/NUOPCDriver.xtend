package org.earthsystemmodeling.cupid.nuopc_v7 
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex
import org.eclipse.photran.internal.core.parser.ASTSubroutineStmtNode
import java.sql.SQLException
import static org.earthsystemmodeling.cupid.core.CupidActivator.log
import org.earthsystemmodeling.cupid.annotation.Label
import org.earthsystemmodeling.cupid.annotation.Name
import org.earthsystemmodeling.cupid.annotation.Child
import org.eclipse.photran.internal.core.parser.ASTNode
import org.earthsystemmodeling.cupid.nuopc_v7.NUOPCDriver.Initialization

@Label("NUOPC Driver")
class NUOPCDriver extends CodeConcept<NUOPCDriver, NUOPCDriver, ASTModuleNode> {
	
	var public String driverName	
	
	@Name
	var public String filename
	var public String path
	
	@Label("ESMF Import")
	@Child
	var public long standardESMFImportID = -1
	
	@Label("NUOPC Import")
	@Child
	var public long standardNUOPCImportID = -1
	
	@Child
	var public SetServices setServices
	
	@Child
	var public Initialization initialization
	
	new(CodeDBIndex codeDB) {
		super(null, codeDB)	
	}
	
	override forward() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override reverse() {
		
		var rs = '''module(_moduleID, _compUnitID, _driverName), 
		            compilationUnit(_compUnitID, _filename, _path),
   					 ( uses(_uid, _mid, 'NUOPC_Driver') ;
     				   uses(_uid, _mid, 'NUOPC_DriverAtmOcn') ).'''.execQuery
		try {
			if (rs.next) {
				_id = rs.getLong("_moduleID")
				driverName = rs.getString("_driverName")
				filename = rs.getString("_filename")
				path = rs.getString("_path")
				rs.close
				
				rs = '''uses(_uid, «_id», 'ESMF').'''.execQuery
				if (rs.next) standardESMFImportID = rs.getLong("_uid")
				rs.close
				
				rs = '''uses(_uid, «_id», 'NUOPC').'''.execQuery
				if (rs.next) standardNUOPCImportID = rs.getLong("_uid")
				rs.close
				
				return reverseChildren
			}
		}
		catch (SQLException e) {
			log("SQL error", e);
		}
				
		null
	}
	
	def reverseChildren() {
		setServices = new SetServices(this, _codeDB).reverse
		//setModelServices = new SetModelServices(this, _codeDB).reverse
		initialization = new Initialization(this, _codeDB).reverse
		this
	}

	
	override toString() {
		'''NUOPCDriver2: (id = «_id», driverName = «driverName», standardESMFImportID = «standardESMFImportID», standardNUOPCImportID = «standardNUOPCImportID»)
	setServices: «setServices»
'''
	//setModelServices: «setModelServices»
	}
	
	
	@Label("SetServices")
	static class SetServices extends CodeConcept<SetServices, NUOPCDriver, ASTSubroutineStmtNode> {
		
		@Name
		var public String subroutineName
		var long callsCompDeriveID = -1
		
		new(NUOPCDriver parent, CodeDBIndex codeDB) {
			super(parent, codeDB)
		}
		
		override reverse() {
			
			var rs = '''esmf_setservices(_sid, «parentID», _sname), 
					( call_(_cid, _sid, 'NUOPC_CompDerive') ; true).'''.execQuery
						
			try {
				if (rs.next) {
					_id = rs.getLong("_sid")
					subroutineName = rs.getString("_sname")
					callsCompDeriveID = rs.getLong("_cid")
					rs.close
					return this
				}
			} catch (SQLException e) {
				log("SQL error", e);
			}
			
			null
					
		}
			
		override forward() {
			throw new UnsupportedOperationException("TODO: auto-generated method stub")
		}
		
		override toString() {
			'''SetServices: (id=«_id», callsCompDeriveID=«callsCompDeriveID»)'''
		}
		
	}
	
	@Label("SetModelServices")
	static class SetModelServices extends CodeConcept<SetModelServices, Initialization, ASTSubroutineStmtNode> {
	
		@Name
		var public String subroutineName
		
		new(Initialization parent, CodeDBIndex codeDB) {
			super(parent, codeDB)
		}
		
		override reverse() {
			var rs = '''esmf_setservices(_sid, «parentID», _sname), 
					 call_(_cid, _sid, 'NUOPC_DriverAddComp').'''.execQuery
			if (rs.next) {
				_id = rs.getLong("_sid")
				subroutineName = rs.getString("_sname")
				rs.close
				this
			}
			else {
				rs.close
				null
			}
		}
		
		override forward() {
			throw new UnsupportedOperationException("TODO: auto-generated method stub")
		}
		
		override toString() {
			'''SetModelServices: (id=«_id», subroutineName=«subroutineName»)'''
		}
		
	}
	
	@Label("Initialization")
	static class Initialization extends CodeConcept<Initialization, NUOPCDriver, ASTNode> {
	
		@Child
		var public SetModelServices setModelServices
	
		new(NUOPCDriver parent, CodeDBIndex codeDB) {
			super(parent, codeDB)
		}
		
		override reverse() {
			reverseChildren
		}
		
		def reverseChildren() {
			setModelServices = new SetModelServices(this, _codeDB).reverse
			this	
		}
		
		override forward() {
			throw new UnsupportedOperationException("TODO: auto-generated method stub")
		}
		
		
	}
	
	public static class SetModelCount extends CodeConcept<SetModelCount, Initialization, ASTSubroutineStmtNode> {
	
		new(Initialization parent, CodeDBIndex codeDB) {
			super(parent, codeDB)
		}
		
		override reverse() {
			var rs = '''esmf_specmethod(_sid, «parentID», _sname)'''.execQuery
			if (rs.next) {
				_id = rs.getLong("_sid")
				//subroutineName = rs.getString("_sname")
				rs.close
				this
			}
			else {
				rs.close
				null
			}
		}
		
		override forward() {
			throw new UnsupportedOperationException("TODO: auto-generated method stub")
		}
		
	}
	
}