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
import static org.earthsystemmodeling.cupid.nuopc_v7.BasicCodeConcept.newBasicCodeConcept
import org.earthsystemmodeling.cupid.nuopc_v7.NUOPCDriver.SetModelServices
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import java.util.List

import static org.earthsystemmodeling.cupid.util.CodeExtraction.parseLiteralStatement
import static org.earthsystemmodeling.cupid.util.CodeExtraction.parseLiteralProgramUnit

import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.apache.commons.io.IOUtils
import org.eclipse.photran.core.IFortranAST
import org.eclipse.photran.internal.core.parser.ASTExecutableProgramNode
import org.eclipse.ltk.core.refactoring.TextFileChange
import org.eclipse.text.edits.ReplaceEdit
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode

@Label(label="NUOPC Driver", type="module")
class NUOPCDriver extends CodeConcept<NUOPCDriver, NUOPCDriver, ASTModuleNode> {
	
	@Name
	var public String driverName	

	var public String filename
	var public String path
	
	@Label(label="ESMF Import", type="uses")
	@Child
	var public BasicCodeConcept importESMF
	
	@Label(label="NUOPC Import", type="uses")
	@Child
	var public BasicCodeConcept importNUOPC
	
	@Label(label="NUOPC Driver Import", type="uses")
	var public BasicCodeConcept importNUOPCDriver
	
	
	@Child
	var public SetServices setServices
	
	@Child
	var public Initialization initialization
	
	new(CodeDBIndex codeDB) {
		super(null)
		_codeDB = codeDB
	}
	
	override forward() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override reverse() {
		
		//var rs = '''module(_moduleID, _compUnitID, _driverName), 
		//           compilationUnit(_compUnitID, _filename, _path),
   		//			 ( uses(_uid, _mid, 'NUOPC_Driver') ;
     	//			   uses(_uid, _mid, 'NUOPC_DriverAtmOcn') ).'''.execQuery
     	
     	var rs = '''module(_moduleID, _compUnitID, _driverName), 
		            compilationUnit(_compUnitID, _filename, _path),
   					uses(_uid, _mid, 'NUOPC_Driver').'''.execQuery
		try {
			if (rs.next) {
				_id = rs.getLong("_moduleID")
				driverName = rs.getString("_driverName")
				filename = rs.getString("_filename")
				path = rs.getString("_path")
				importNUOPCDriver = newBasicCodeConcept(this, rs.getLong("_uid"))
				rs.close
				
				rs = '''uses(_uid, «_id», 'ESMF').'''.execQuery
				if (rs.next) importESMF = newBasicCodeConcept(this, rs.getLong("_uid"))
				rs.close
				
				rs = '''uses(_uid, «_id», 'NUOPC').'''.execQuery
				if (rs.next) importNUOPC = newBasicCodeConcept(this, rs.getLong("_uid"))
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
		setServices = new SetServices(this).reverse
		//setModelServices = new SetModelServices(this, _codeDB).reverse
		initialization = new Initialization(this).reverse
		this
	}

	
	override toString() {
'''NUOPCDriver2: (id = «_id», driverName = «driverName»)
	importESMF: «importESMF»
	importNUOPC: «importNUOPC»
	importNUOPCDriver: «importNUOPCDriver»
	setServices: «setServices»
'''
	
	}
	
	
	@Label(label="SetServices", type="subroutine")
	static class SetServices extends CodeConcept<SetServices, NUOPCDriver, ASTSubroutineSubprogramNode> {
		
		@Name
		var public String subroutineName
		var long callsCompDeriveID = -1
		
		new(NUOPCDriver parent) {
			super(parent)
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
	
	
	
	@Label(label="Initialize Specialization Points")
	static class Initialization extends CodeConcept<Initialization, NUOPCDriver, ASTNode> {
	
		@Child
		var public SetModelServices setModelServices
		
		@Child(min=1)
		var public SetModelCount setModelCount
		
		@Child
		var public SetRunSequence setRunSequence
	
		new(NUOPCDriver parent) {
			super(parent)
		}
		
		override reverse() {
			reverseChildren
		}
		
		def reverseChildren() {
			setModelServices = new SetModelServices(this).reverse
			setModelCount = new SetModelCount(this).reverse
			setRunSequence = new SetRunSequence(this).reverse
			this	
		}
		
		override forward() {
			throw new UnsupportedOperationException("TODO: auto-generated method stub")
		}
		
		
	}
	
	@Label(label="SetModelCount", type="subroutine")
	public static class SetModelCount extends CodeConcept<SetModelCount, Initialization, ASTSubroutineStmtNode> {
	
		@Name
		var public String subroutineName = "SetModelCount"  //default values?
		
		//@Child
		var public String specLabel = "driver_label_SetModelCount"
		
		@Label(label="Registration", type="call")
		@Child
		var public BasicCodeConcept registration
		
		var public String paramGridComp = "driver"
		
		var public String paramRC = "rc"
		
		
		new(Initialization parent) {
			super(parent)
		}
		
		override reverse() {
			var rs = '''esmf_regspec(_sid, «parentID», _name, 'NUOPC_Driver', _specLabelExpr, 'label_SetModelCount', _regid).'''.execQuery
			if (rs.next) {
				_id = rs.getLong("_sid")
				subroutineName = rs.getString("_name")
				specLabel = rs.getString("_specLabelExpr")
				registration = newBasicCodeConcept(this, rs.getLong("_regid"))
				rs.close
				
				rs = '''esmf_specmethod(«_id», «parentID», _, _param_gridcomp, _param_rc).'''.execQuery
				if (rs.next) {
					paramGridComp = rs.getString("_param_gridcomp")
					paramRC = rs.getString("_param_rc")
					rs.close	
				}
				
				this
			}
			else {
				rs.close
				null
			}
		}
		
		override forward() {
						
			val IFortranAST ast = getAST()
				
			//add specialization subroutine itself			
			var code = '''

subroutine SetModelCount(driver, rc)
    type(ESMF_GridComp)  :: driver
    integer, intent(out) :: rc

    rc = ESMF_SUCCESS

    ! set the modelCount 
    call NUOPC_DriverSet(driver, modelCount=XXX, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

  end subroutine
  '''
								
			var ASTModuleNode mn = _parent._parent.getASTRef
			var ASTSubroutineSubprogramNode ssn = parseLiteralProgramUnit(code)
		
			mn.getModuleBody().add(ssn)
				
			//add label import
			var usesNUOPCDriver = _parent._parent.importNUOPCDriver.getASTRef as ASTUseStmtNode		
			var tempCode = usesNUOPCDriver.toString.trim
			tempCode += ''', &
			«IF !specLabel.equals("label_SetModelCount")»«specLabel» => «ENDIF»label_SetModelCount'''
			
			var tempNode = parseLiteralStatement(tempCode) as ASTUseStmtNode;
			usesNUOPCDriver.replaceWith(tempNode)
			
			
			//add call in setservices
			var ASTSubroutineSubprogramNode setServices = _parent._parent.setServices?.getASTRef
			if (setServices != null) {
				
				code = 
'''

call NUOPC_CompSpecialize(«paramGridComp», specLabel=«specLabel», &
	specRoutine=«subroutineName», rc=«paramRC»)
'''

				var ASTCallStmtNode regCall = parseLiteralStatement(code) as ASTCallStmtNode
				setServices.body.add(regCall)
				
			}
			
		
			ast
		}
		
	}
	
	@Label(label="SetModelServices", type="subroutine")
	static class SetModelServices extends CodeConcept<SetModelServices, Initialization, ASTSubroutineStmtNode> {
	
		@Name
		var public String subroutineName
		
		@Child
		var public List<SetModelServices_AddComp> addComps
		
		new(Initialization parent) {
			super(parent)
		}
		
		override reverse() {
			var rs = '''esmf_regspec(_sid, «parentID», _name, 'NUOPC_Driver', _specLabelExpr, 'label_SetModelServices', _regid).'''.execQuery
			if (rs.next) {
				_id = rs.getLong("_sid")
				subroutineName = rs.getString("_name")
				rs.close
				reverseChildren
			}
			else {
				rs.close
				null
			}
		}
		
		def reverseChildren() {
			addComps = new SetModelServices_AddComp(this).reverseMultiple
			this
		}
		
		override forward() {
			throw new UnsupportedOperationException("TODO: auto-generated method stub")
		}
		
		override toString() {
			'''SetModelServices: (id=«_id», subroutineName=«subroutineName»)'''
		}
		
	}
	
	@Label(label="Add Component", type="call")
	static class SetModelServices_AddComp extends CodeConcept<SetModelServices_AddComp, SetModelServices, ASTCallStmtNode> {
	
		//single child component
		var public String compLabel
		
		//connector component
		var public String srcCompLabel
		var public String dstCompLabel
		
		var public String compSetServices
			
		new(SetModelServices parent) {
			super(parent)
		}
		
		override name() {
			if (compLabel != null) compLabel
			else if (srcCompLabel != null && dstCompLabel != null) srcCompLabel + " => " + dstCompLabel
			else null
		}
		
		override reverseMultiple() {
			var retList = newArrayList()
			
			var rs = '''call_(_cid, «parentID», 'NUOPC_DriverAddComp'),
							callArgWithType(_, _cid, 2, _arg2keyword, _arg2Type, _arg2Expr),
							callArgWithType(_, _cid, 3, _arg3keyword, _arg3Type, _arg3Expr).'''
							.execQuery
			
			while (rs.next) {
				var addComp = new SetModelServices_AddComp(_parent)
				addComp._id = rs.getLong("_cid")
				
				var String arg2keyword = rs.getString("_arg2keyword")
				if (arg2keyword.equalsIgnoreCase("srcCompLabel")) {
					addComp.srcCompLabel = rs.getString("_arg2Expr")
					addComp.dstCompLabel = rs.getString("_arg3Expr")
				}
				else {
					addComp.compLabel = rs.getString("_arg2Expr")	
				}
				
				//addComp.compSetServices = rs.getString("_compSS")
				retList.add(addComp)
			}
			
			retList
		}
		
		override forward() {
			throw new UnsupportedOperationException("TODO: auto-generated method stub")
		}
	
	}
	
	@Label(label="SetRunSequence", type="subroutine")
	static class SetRunSequence extends CodeConcept<SetRunSequence, Initialization, ASTSubroutineStmtNode> {
	
		@Name
		var public String subroutineName
		
		@Label(label="Registration", type="call")
		@Child
		var public BasicCodeConcept registration
		
		//@Child
		//var public List<SetModelServices_AddComp> addComps
		
		new(Initialization parent) {
			super(parent)
		}
		
		override reverse() {
			var rs = '''esmf_regspec(_sid, «parentID», _name, 'NUOPC_Driver', _specLabelExpr, 'label_SetRunSequence', _regid).'''.execQuery
			if (rs.next) {
				_id = rs.getLong("_sid")
				subroutineName = rs.getString("_name")
				registration = newBasicCodeConcept(this, rs.getLong("_regid"))
				rs.close
				this
				//reverseChildren
			}
			else {
				rs.close
				null
			}
		}
		
		//def reverseChildren() {
		//	addComps = new SetModelServices_AddComp(this, _codeDB).reverseMultiple
		//	this
		//}
		
		override forward() {
			throw new UnsupportedOperationException("TODO: auto-generated method stub")
		}
		
		override toString() {
			'''SetModelServices: (id=«_id», subroutineName=«subroutineName»)'''
		}
		
	}
}