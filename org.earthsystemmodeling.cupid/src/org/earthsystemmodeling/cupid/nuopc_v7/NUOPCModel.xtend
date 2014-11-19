package org.earthsystemmodeling.cupid.nuopc_v7 
import org.earthsystemmodeling.cupid.annotation.Label
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.earthsystemmodeling.cupid.annotation.Child
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex
import static org.earthsystemmodeling.cupid.nuopc_v7.BasicCodeConcept.newBasicCodeConcept
import static org.earthsystemmodeling.cupid.core.CupidActivator.log
import java.sql.SQLException
import org.eclipse.photran.internal.core.parser.ASTNode
import org.earthsystemmodeling.cupid.nuopc_v7.NUOPCModel.Initialization
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.earthsystemmodeling.cupid.nuopc_v7.NUOPCModel.InitP1
import java.util.List
import org.earthsystemmodeling.cupid.annotation.Name
import org.eclipse.photran.core.IFortranAST
import org.eclipse.photran.internal.core.parser.IBodyConstruct
import org.eclipse.photran.internal.core.parser.IASTListNode

import static org.earthsystemmodeling.cupid.util.CodeExtraction.parseLiteralStatement
import static org.earthsystemmodeling.cupid.util.CodeExtraction.parseLiteralStatementSequence
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode

@Label(label="NUOPC Model", type="module")
class NUOPCModel extends CodeConcept<CodeConcept<?,?>, ASTModuleNode> {
	
	var public String modelName	
	var public String filename
	var public String path
	
	@Label(label="ESMF Import", type="uses")
	@Child
	var public BasicCodeConcept importESMF
	
	@Label(label="NUOPC Import", type="uses")
	@Child
	var public BasicCodeConcept importNUOPC
	
	@Label(label="NUOPC Model Import", type="uses")
	@Child
	var public BasicCodeConcept importNUOPCModel
	
	@Child
	var public SetServicesCodeConcept<NUOPCModel> setServices
	
	@Child
	var public Initialization initialization
	
	new(CodeDBIndex codeDB) {
		super(null)
		_codeDB = codeDB
	}
	
	
	override reverse() {
		  	
     	var rs = '''module(_moduleID, _compUnitID, _driverName), 
		            compilationUnit(_compUnitID, _filename, _path),
   					uses(_uid, _mid, 'NUOPC_Model').'''.execQuery
		try {
			if (rs.next) {
				_id = rs.getLong("_moduleID")
				modelName = rs.getString("_driverName")
				filename = rs.getString("_filename")
				path = rs.getString("_path")
				importNUOPCModel = newBasicCodeConcept(this, rs.getLong("_uid"))
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
		setServices = new SetServicesCodeConcept(this).reverse
		initialization = new Initialization(this).reverse
		this
	}

	
	override name() {
		modelName + " (" + filename + ")"
	}
	
	@Label(label="Initialize")
	public static class Initialization extends CodeConcept<NUOPCModel, ASTNode> {
		
		@Child
		var public InitP1 initP1
		
		@Child
		var public InitP2 initP2
		
		new(NUOPCModel parent) {
			super(parent)
		}
		
		override Initialization reverse() {
			reverseChildren
		}
		
		def reverseChildren() {
			initP1 = new InitP1(this).reverse as InitP1	
			initP2 = new InitP2(this).reverse as InitP2
			this	
		}
		
		
	}
	
	@Label(label="Initialize Phase 1", type="subroutine")
	public static class InitP1 extends EntryPointCodeConcept<Initialization> {
		
		@Child(max=-1)
		public List<InitP1_AdvertiseField> advertiseFields
		
		new(Initialization parent) {
			super(parent, "IPDv00p1")
		}
		
		override reverseChildren() {
			advertiseFields = new InitP1_AdvertiseField(this).reverseMultiple
			this
		}
		
		override module() {
			_parent._parent
		}
		
		override setServices() {
			_parent._parent.setServices
		}
		
	}
	
	@Label(label="Advertise Field", type="call")
	public static class InitP1_AdvertiseField extends CodeConcept<InitP1, ASTCallStmtNode> {
	
		public String state
		public String standardName
		
		new(InitP1 parent) {
			super(parent)
			//defaults
			state = _parent.paramImport
			standardName = "StandardName"
		}
		
		override name() {
			state + " / " + standardName
		}
		
		override List reverseMultiple() {
			var retList = newArrayList()
			
			var rs = '''call_(_cid, «parentID», 'NUOPC_StateAdvertiseField'),
						callArgWithType(_, _cid, 1, _, _, _stateExpr),
						callArgWithType(_, _cid, 2, _, _, _standardNameExpr).'''.execQuery

			while (rs.next) {
				var advField = new InitP1_AdvertiseField(_parent);
				advField._id = rs.getLong("_cid")
				advField.state = rs.getString("_stateExpr")
				advField.standardName = rs.getString("_standardNameExpr")
				retList.add(advField)
			}
			rs.close
			
			retList
		}
		
		override forward() {
			var IFortranAST ast = getAST			
								
			var code = 
'''

call NUOPC_StateAdvertiseField(«paramch(state)», '«paramch(standardName)»', rc=«_parent.paramRC»)
if (ESMF_LogFoundError(rcToCheck=«_parent.paramRC», msg=ESMF_LOGERR_PASSTHRU, &
    line=__LINE__, &
    file=__FILE__)) &
    return  ! bail out
'''
			val IASTListNode<IBodyConstruct> stmts = parseLiteralStatementSequence(code)
			var ASTSubroutineSubprogramNode ssn = _parent.ASTRef
			
			ssn.body.addAll(stmts)
			//setASTRef(stmts.get(0) as ASTCallStmtNode)
	
			ast
		}
	
		
		
	}
	
	@Label(label="Initialize Phase 2", type="subroutine")
	public static class InitP2 extends EntryPointCodeConcept<Initialization> {
	
		new(Initialization parent) {
			super(parent, "IPDv00p2")
		}
		
		override module() {
			_parent._parent
		}
		
		override setServices() {
			_parent._parent.setServices
		}
		
	}
	
}
	