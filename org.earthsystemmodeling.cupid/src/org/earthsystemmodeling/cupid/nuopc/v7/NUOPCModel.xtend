package org.earthsystemmodeling.cupid.nuopc.v7

import java.sql.SQLException
import java.util.List
import org.earthsystemmodeling.cupid.annotation.Child
import org.earthsystemmodeling.cupid.annotation.Label
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex
import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import org.eclipse.photran.core.IFortranAST
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.eclipse.photran.internal.core.parser.ASTNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.eclipse.photran.internal.core.parser.IASTListNode
import org.eclipse.photran.internal.core.parser.IBodyConstruct

import static org.earthsystemmodeling.cupid.core.CupidActivator.log
import static org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept.newBasicCodeConcept
import static org.earthsystemmodeling.cupid.util.CodeExtraction.parseLiteralStatementSequence

@Label(label="NUOPC Model", type="module")
class NUOPCModel extends NUOPCComponent {
	
	public String modelName	
	public String filename
	public String path
	
	@Child
	public SetServicesCodeConcept<NUOPCModel> setServices
	
	@Child
	public Initialization initialization
	
	@Child
	public Run run
	
	@Child
	public Finalize finalize
	
	new(CodeDBIndex codeDB) {
		super(null)
		_codeDB = codeDB
	}
	
	override prefix() {"model"}
	
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
				importNUOPCGeneric = new GenericImport(this, rs.getLong("_uid")).reverse
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
		run = new Run(this).reverse
		finalize = new Finalize(this).reverse
		this
	}

	
	override name() {
		modelName + " (" + filename + ")"
	}
	
	@Label(label="Initialize")
	public static class Initialization extends CodeConcept<NUOPCModel, ASTNode> {
		
		@Child
		public InitP1 initP1
		
		@Child
		public InitP2 initP2
		
		@Child(min=0)
		public SetClock setClock
		
		@Child(min=0)
		public DataInitialize dataInitialize
		
		new(NUOPCModel parent) {
			super(parent)
		}
		
		override Initialization reverse() {
			reverseChildren
		}
		
		def reverseChildren() {
			initP1 = new InitP1(this).reverse as InitP1	
			initP2 = new InitP2(this).reverse as InitP2
			setClock = new SetClock(this).reverse as SetClock
			dataInitialize = new DataInitialize(this).reverse as DataInitialize
			this	
		}
		
		
	}
	
	@Label(label="Initialize Phase 1", type="subroutine")
	public static class InitP1 extends EntryPointCodeConcept<Initialization> {
		
		@Child(min=0, max=-1)
		public List<InitP1_AdvertiseField> advertiseFields
		
		new(Initialization parent) {
			super(parent, "IPDv00p1")
			subroutineName = "InitializeP1"
			methodType = "ESMF_METHOD_INITIALIZE"
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
		
		//testing forward chaining
		override forward() {
			var ast = super.forward
			ast = new InitP1_AdvertiseField(this).forward
			ast	
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
	
		@Child(min=0, max=-1)
		public List<InitP2_RealizeField> realizeFields
		
		new(Initialization parent) {
			super(parent, "IPDv00p2")
			subroutineName = "InitializeP2"
			methodType = "ESMF_METHOD_INITIALIZE"
		}
		
		override reverseChildren() {
			realizeFields = new InitP2_RealizeField(this).reverseMultiple
			this
		}
		
		override module() {
			_parent._parent
		}
		
		override setServices() {
			_parent._parent.setServices
		}
		
	}
	
	@Label(label="Realize Field", type="call")
	public static class InitP2_RealizeField extends CodeConcept<InitP2, ASTCallStmtNode> {
	
		public String state
		public String field
		
		new(InitP2 parent) {
			super(parent)
			//defaults
			state = _parent.paramImport
			field = "field"
		}
		
		override name() {
			state + " / " + field
		}
		
		override List reverseMultiple() {
			var retList = newArrayList()
			
			var rs = '''call_(_cid, «parentID», 'NUOPC_StateRealizeField'),
						callArgWithType(_, _cid, 1, _, _, _stateExpr),
						callArgWithType(_, _cid, 2, _, _, _fieldExpr).'''.execQuery

			while (rs.next) {
				var relField = new InitP2_RealizeField(_parent);
				relField._id = rs.getLong("_cid")
				relField.state = rs.getString("_stateExpr")
				relField.field = rs.getString("_fieldExpr")
				retList.add(relField)
			}
			rs.close
			
			retList
		}
		
		override forward() {
			var IFortranAST ast = getAST			
				
							
			var code = 
'''

call NUOPC_StateRealizeField(«paramch(state)», field=«paramch(field)», rc=«_parent.paramRC»)
if (ESMF_LogFoundError(rcToCheck=«_parent.paramRC», msg=ESMF_LOGERR_PASSTHRU, &
    line=__LINE__, &
    file=__FILE__)) &
    return  ! bail out
'''
			val IASTListNode<IBodyConstruct> stmts = parseLiteralStatementSequence(code)
			var ASTSubroutineSubprogramNode ssn = _parent.ASTRef
			
			ssn.body.addAll(stmts)
			ast
		}	
		
	}
	
	@Label(label="SetClock", type="subroutine")
	public static class SetClock extends SpecializationMethodCodeConcept<Initialization> {
		
		new(Initialization parent) {
			super(parent, "NUOPC_Model", "label_SetClock")
			
			//defaults
			subroutineName = "SetClock"
			specLabel = "model_label_SetClock"
			paramGridComp = "gcomp"
			paramRC = "rc"			
		}
		
		override subroutineTemplate() {
'''

subroutine «subroutineName»(«paramGridComp», «paramRC»)
    type(ESMF_GridComp)  :: «paramGridComp»
    integer, intent(out) :: «paramRC»

    ! local variables
    type(ESMF_Clock)              :: clock
    type(ESMF_TimeInterval)       :: stabilityTimeStep

    rc = ESMF_SUCCESS
    
    ! query the Component for its clock, importState and exportState
    call ESMF_GridCompGet(gcomp, clock=clock, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
      
    ! initialize internal clock
    ! here: parent Clock and stability timeStep determine actual model timeStep
    call ESMF_TimeIntervalSet(stabilityTimeStep, m=«paramint(5)», rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
    
    call NUOPC_CompSetClock(gcomp, clock, stabilityTimeStep, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

end subroutine
'''
	}
		
		override module() {
			_parent._parent
		}
		
		override setServices() {
			_parent._parent.setServices
		}
		
		override genericUse() {
			_parent._parent.importNUOPCGeneric
		}
		
	}
	
	
	@Label(label="DataInitialize", type="subroutine")
	public static class DataInitialize extends SpecializationMethodCodeConcept<Initialization> {
		
		new(Initialization parent) {
			super(parent, "NUOPC_Model", "label_DataInitialize")
			
			//defaults
			subroutineName = "DataInitialize"
			specLabel = "model_label_DataInitialize"
			paramGridComp = "gcomp"
			paramRC = "rc"			
		}
		
		override subroutineTemplate() {
'''

subroutine «subroutineName»(«paramGridComp», «paramRC»)
    type(ESMF_GridComp)  :: «paramGridComp»
    integer, intent(out) :: «paramRC»

    rc = ESMF_SUCCESS
    
    ! initialize export fields

end subroutine
'''
	}
		
		override module() {
			_parent._parent
		}
		
		override setServices() {
			_parent._parent.setServices
		}
		
		override genericUse() {
			_parent._parent.importNUOPCGeneric
		}
		
	}
	
	@Label(label="Run")
	public static class Run extends CodeConcept<NUOPCModel, ASTNode> {
		
		@Child(min=0)
		public SetRunClock setRunClock
		
		@Child(min=0)
		public CheckImport checkImport
		
		@Child
		public ModelAdvance modelAdvance
		
		new(NUOPCModel parent) {
			super(parent)
		}
		
		override Run reverse() {
			reverseChildren
		}
		
		def reverseChildren() {
			modelAdvance = new ModelAdvance(this).reverse as ModelAdvance
			setRunClock = new SetRunClock(this).reverse as SetRunClock
			checkImport = new CheckImport(this).reverse as CheckImport
			this	
		}
		
	}
	
	@Label(label="ModelAdvance", type="subroutine")
	public static class ModelAdvance extends SpecializationMethodCodeConcept<Run> {
		
		new(Run parent) {
			super(parent, "NUOPC_Model", "label_Advance")
			
			//defaults
			subroutineName = "ModelAdvance"
			specLabel = "model_label_Advance"
			paramGridComp = "gcomp"
			paramRC = "rc"			
		}
		
		override subroutineTemplate() {
'''

subroutine «subroutineName»(«paramGridComp», «paramRC»)
    type(ESMF_GridComp)  :: «paramGridComp»
    integer, intent(out) :: «paramRC»

     ! local variables
    type(ESMF_Clock)              :: clock
    type(ESMF_State)              :: importState, exportState
    type(ESMF_Time)               :: currTime
    type(ESMF_TimeInterval)       :: timeStep

    rc = ESMF_SUCCESS

    ! query the Component for its clock, importState and exportState
    call ESMF_GridCompGet(«paramGridComp», clock=clock, importState=importState, &
        exportState=exportState, rc=«paramRC»)
    if (ESMF_LogFoundError(rcToCheck=«paramRC», msg=ESMF_LOGERR_PASSTHRU, &
        line=__LINE__, &
        file=__FILE__)) &
        return  ! bail out

    ! advance the model: currTime -> currTime + timeStep

    call NUOPC_ClockPrintCurrTime(clock, &
        "------>Advancing «_parent._parent.modelName» from: ", rc=«paramRC»)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
        line=__LINE__, &
        file=__FILE__)) &
        return  ! bail out

    call ESMF_ClockGet(clock, currTime=currTime, timeStep=timeStep, rc=«paramRC»)
    if (ESMF_LogFoundError(rcToCheck=«paramRC», msg=ESMF_LOGERR_PASSTHRU, &
        line=__LINE__, &
        file=__FILE__)) &
        return  ! bail out

    call NUOPC_TimePrint(currTime + timeStep, &
        "--------------------------------> to: ", rc=«paramRC»)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
        line=__LINE__, &
        file=__FILE__)) &
        return  ! bail out

end subroutine
'''
	}
		
		override module() {
			_parent._parent
		}
		
		override setServices() {
			_parent._parent.setServices
		}
		
		override genericUse() {
			_parent._parent.importNUOPCGeneric
		}
		
	}
	
	@Label(label="SetRunClock", type="subroutine")
	public static class SetRunClock extends SpecializationMethodCodeConcept<Run> {
		
		new(Run parent) {
			super(parent, "NUOPC_Model", "label_SetRunClock")
			
			//defaults
			subroutineName = "SetRunClock"
			specLabel = "model_label_SetRunClock"
			paramGridComp = "gcomp"	
			paramRC = "rc"			
		}
		
		override subroutineTemplate() {
'''

subroutine «subroutineName»(«paramGridComp», «paramRC»)
    type(ESMF_GridComp)  :: «paramGridComp»
    integer, intent(out) :: «paramRC»

    ! local variables
    type(ESMF_Clock)              :: clock
    
    rc = ESMF_SUCCESS
    
    ! query the component for its clock
    call ESMF_GridCompGet(gcomp, clock=clock, rc=«paramRC»)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
      
    ! set the component's clock 
    call NUOPC_CompSetClock(gcomp, externalClock=clock, rc=«paramRC»)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

end subroutine
'''
	}
		
		override module() {
			_parent._parent
		}
		
		override setServices() {
			_parent._parent.setServices
		}
		
		override genericUse() {
			_parent._parent.importNUOPCGeneric
		}
		
	}
	
	@Label(label="CheckImport", type="subroutine")
	public static class CheckImport extends SpecializationMethodCodeConcept<Run> {
		
		new(Run parent) {
			super(parent, "NUOPC_Model", "label_CheckImport")
			
			//defaults
			subroutineName = "CheckImport"
			specLabel = "model_label_CheckImport"
			paramGridComp = "gcomp"	
			paramRC = "rc"			
		}
		
		override subroutineTemplate() {
'''

subroutine «subroutineName»(«paramGridComp», «paramRC»)
    type(ESMF_GridComp)  :: «paramGridComp»
    integer, intent(out) :: «paramRC»

    rc = ESMF_SUCCESS
    
    ! check fields in import state

end subroutine
'''
	}
		
		override module() {
			_parent._parent
		}
		
		override setServices() {
			_parent._parent.setServices
		}
		
		override genericUse() {
			_parent._parent.importNUOPCGeneric
		}
		
	}
	
	@Label(label="Finalize")
	public static class Finalize extends CodeConcept<NUOPCModel, ASTNode> {
		
		@Child(min=0)
		public FinalizeP1 finalizeP1
		
		new(NUOPCModel parent) {
			super(parent)
		}
		
		override Finalize reverse() {
			reverseChildren
		}
		
		def reverseChildren() {
			finalizeP1 = new FinalizeP1(this).reverse as FinalizeP1
			this	
		}
		
	}
	
	@Label(label="Finalize Phase 1", type="subroutine")
	public static class FinalizeP1 extends EntryPointCodeConcept<Finalize> {
		
		new(Finalize parent) {
			super(parent, "FinalizePhase1")
			methodType = "ESMF_METHOD_FINALIZE"
			subroutineName = "Finalize"
		}
			
		override reverseChildren() {
			this
		}
		
		override module() {
			_parent._parent
		}
		
		override setServices() {
			_parent._parent.setServices
		}
		
	}
	
	
	
	
}
	