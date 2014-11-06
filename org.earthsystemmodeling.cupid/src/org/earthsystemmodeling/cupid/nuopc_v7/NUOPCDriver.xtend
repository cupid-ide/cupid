package org.earthsystemmodeling.cupid.nuopc_v7 
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex
import org.eclipse.photran.internal.core.parser.ASTSubroutineStmtNode
import java.sql.SQLException
import static org.earthsystemmodeling.cupid.core.CupidActivator.log

@Label("NUOPC Driver")
class NUOPCDriver extends CodeConcept<NUOPCDriver, NUOPCDriver, ASTModuleNode> {
	
	@Name
	var driverName = null
	var long standardESMFImportID = -1
	var long standardNUOPCImportID = -1
	
	@Child
	var SetServices setServices
	
	@Child
	var SetModelServices setModelServices	
	
	new(CodeDBIndex codeDB) {
		super(null, codeDB)	
	}
	
	override forward() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override reverse() {
		
		var rs = '''module(_moduleID, _driverName), uses(_uid, _mid, 'NUOPC_Driver').'''.execQuery
		try {
			if (rs.next) {
				_id = rs.getLong("_moduleID")
				driverName = rs.getString("_driverName")
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
		setModelServices = new SetModelServices(this, _codeDB).reverse
		this
	}

	
	override toString() {
		'''NUOPCDriver2: (id = «_id», driverName = «driverName», standardESMFImportID = «standardESMFImportID», standardNUOPCImportID = «standardNUOPCImportID»)
	setServices: «setServices»
	setModelServices: «setModelServices»
'''
	}
	
	
	static class SetServices extends CodeConcept<SetServices, NUOPCDriver, ASTSubroutineStmtNode> {
		
		var String subroutineName
		var long callsCompDeriveID = -1
		
		new(NUOPCDriver parent, CodeDBIndex codeDB) {
			super(parent, codeDB)
		}
		
		override reverse() {
			
			var rs = '''esmf_setservices(_sid, «_parent._id», _sname), 
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
	
	static class SetModelServices extends CodeConcept<SetModelServices, NUOPCDriver, ASTSubroutineStmtNode> {
	
		var String subroutineName
		
		new(NUOPCDriver parent, CodeDBIndex codeDB) {
			super(parent, codeDB)
		}
		
		override reverse() {
			var rs = '''esmf_setservices(_sid, «_parent._id», _sname), 
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
	
}