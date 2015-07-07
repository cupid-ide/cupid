package org.earthsystemmodeling.cupid.nuopc.v7bs50

import java.sql.SQLException
import java.util.List
import org.earthsystemmodeling.cupid.annotation.Child
import org.earthsystemmodeling.cupid.annotation.Label
import org.earthsystemmodeling.cupid.annotation.Prop
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept
import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import org.eclipse.photran.core.IFortranAST
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.eclipse.photran.internal.core.parser.ASTNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.eclipse.photran.internal.core.parser.ASTTypeDeclarationStmtNode
import org.eclipse.photran.internal.core.parser.IASTListNode
import org.eclipse.photran.internal.core.parser.IBodyConstruct

import static org.earthsystemmodeling.cupid.core.CupidActivator.log
import static org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept.newBasicCodeConcept
import static org.earthsystemmodeling.cupid.util.CodeExtraction.parseLiteralStatementSequence
import org.earthsystemmodeling.cupid.annotation.MappingType

@Label(label="NUOPC Driver")
@MappingType("module")
class NUOPCDriver extends NUOPCComponent {
	
	public String driverName	
	public String filename
	public String path
	
	@Child
	var public SetServicesCodeConcept<NUOPCDriver> setServices
	
	@Child
	var public Initialization initialization
	
	new(CodeDBIndex codeDB) {
		super(null)
		_codeDB = codeDB
	}
	
	override prefix() {"driver"}

	override reverse() {
		  	
     	var rs = '''module(_moduleID, _compUnitID, _driverName), 
		            compilationUnit(_compUnitID, _filename, _path),
   					uses(_uid, _mid, 'NUOPC_Driver').'''.execQuery
		try {
			if (rs.next) {
				_id = rs.getLong("_moduleID")
				driverName = rs.getString("_driverName")
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
		this
	}

	
	override name() {
		driverName + " (" + filename + ")"
	}
	
	
		
	
	@Label(label="Initialize")
	public static class Initialization extends CodeConcept<NUOPCDriver, ASTNode> {
	
		@Child
		var public SetModelServices setModelServices
		
		//@Child
		//var public SetModelCount setModelCount
		
		//@Child(min=0)
		//var public SetModelPetLists setModelPetLists
		
		@Child(min=0)
		var public SetRunSequence setRunSequence
		
		//@Child(min=0)
		//var public ModifyInitializePhaseMap modifyInitializePhaseMap
	
		new(NUOPCDriver parent) {
			super(parent)
		}
		
		override Initialization reverse() {
			reverseChildren
		}
		
		def reverseChildren() {
			setModelServices = new SetModelServices(this).reverse as SetModelServices
			//setModelCount = new SetModelCount(this).reverse as SetModelCount
			//setModelPetLists = new SetModelPetLists(this).reverse as SetModelPetLists
			setRunSequence = new SetRunSequence(this).reverse as SetRunSequence
			//modifyInitializePhaseMap = new ModifyInitializePhaseMap(this).reverse as ModifyInitializePhaseMap		
			
			this	
		}
		
		
	}
	
	/*
	@Label(label="SetModelCount", type="subroutine")
	public static class SetModelCount extends SpecializationMethodCodeConcept<Initialization> {
		
		new(Initialization parent) {
			super(parent, "NUOPC_Driver", "label_SetModelCount")
			
			//defaults
			subroutineName = "SetModelCount"
			specLabel = "driver_label_SetModelCount"
			paramGridComp = "driver"
			paramRC = "rc"			
		}
		
		override subroutineTemplate() {
'''

subroutine «subroutineName»(«paramGridComp», «paramRC»)
    type(ESMF_GridComp)  :: «paramGridComp»
    integer, intent(out) :: «paramRC»

    rc = ESMF_SUCCESS

    ! set the modelCount 
    call NUOPC_DriverSet(driver, modelCount=1, rc=rc)
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
	*
	*/
	
	@Label(label="SetModelServices")
	@MappingType("subroutine")
	static class SetModelServices extends SpecializationMethodCodeConcept<Initialization> {
	
		@Child(max=-1)
		var public List<SetModelServices_AddComp> addComps
		
		@Label(label="SetClock")
		@MappingType("call")
		@Child
		var public BasicCodeConcept setClock
		
		new(Initialization parent) {
			super(parent, "NUOPC_Driver", "label_SetModelServices")
			subroutineName = "SetModelServices"
			specLabel = "driver_label_SetModelServices"
		}
			
		override reverse() {
			if (this == super.reverse) {				
				var rs = '''call_(_cid, «_id», 'ESMF_GridCompSet'),
							callArgWithType(_, _cid, _, 'clock', _, _clockExpr).'''.execQuery
				if (rs.next) {
					setClock = newBasicCodeConcept(this, rs.getLong("_cid"))
				}
				this
			}
			else {
				null
			}
		}	
			
		override reverseChildren() {
			addComps = new SetModelServices_AddComp(this).reverseMultiple as List<SetModelServices_AddComp>
			this
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
		
		override forward() {
			val IFortranAST ast = super.forward
			
			val ASTSubroutineSubprogramNode ssn = getASTRef

			var code = 
'''

type(ESMF_Time)            :: startTime
type(ESMF_Time)            :: stopTime
type(ESMF_TimeInterval)    :: timeStep
type(ESMF_Clock)           :: internalClock

'''			
			val IASTListNode<IBodyConstruct> typeNodes = parseLiteralStatementSequence(code)
						
			val ASTTypeDeclarationStmtNode last = ssn.findLast(ASTTypeDeclarationStmtNode);
			
			if (last != null) {
				for (IBodyConstruct typeNode : typeNodes.reverse) {
					ssn.body.insertAfter(last, typeNode);
				}
			}
			else {
				ssn.body.addAll(typeNodes);
			}
			
			
			code = 			
'''

! call into SetServices for all Model, Mediator, and Connector components



! set the model clock
call ESMF_TimeIntervalSet(timeStep, m=«paramint(15)», rc=«paramRC») ! 15 minute steps
if (ESMF_LogFoundError(rcToCheck=«paramRC», msg=ESMF_LOGERR_PASSTHRU, &
  line=__LINE__, &
  file=__FILE__)) &
  call ESMF_Finalize(endflag=ESMF_END_ABORT)

call ESMF_TimeSet(startTime, yy=«paramint(2010)», mm=«paramint(6)», dd=«paramint(1)», h=«paramint(0)», m=«paramint(0)», rc=«paramRC»)
if (ESMF_LogFoundError(rcToCheck=«paramRC», msg=ESMF_LOGERR_PASSTHRU, &
  line=__LINE__, &
  file=__FILE__)) &
  call ESMF_Finalize(endflag=ESMF_END_ABORT)

call ESMF_TimeSet(stopTime, yy=«paramint(2010)», mm=«paramint(6)», dd=«paramint(1)», h=«paramint(1)», m=«paramint(0)», rc=«paramRC»)
if (ESMF_LogFoundError(rcToCheck=«paramRC», msg=ESMF_LOGERR_PASSTHRU, &
  line=__LINE__, &
  file=__FILE__)) &
  call ESMF_Finalize(endflag=ESMF_END_ABORT)

internalClock = ESMF_ClockCreate(name="«paramch('AppClock')»", &
  timeStep=timeStep, startTime=startTime, stopTime=stopTime, rc=«paramRC»)
if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
  line=__LINE__, &
  file=__FILE__)) &
  call ESMF_Finalize(endflag=ESMF_END_ABORT)
  
call ESMF_GridCompSet(«paramGridComp», clock=internalClock, rc=«paramRC»)
if (ESMF_LogFoundError(rcToCheck=«paramRC», msg=ESMF_LOGERR_PASSTHRU, &
  line=__LINE__, &
  file=__FILE__)) &
  return  ! bail out
'''			
			val IASTListNode<IBodyConstruct> stmts = parseLiteralStatementSequence(code)
			ssn.body.addAll(stmts)
			
			ast
		}
		
	}
	
	@Label(label="Add Component")
	@MappingType("call")
	static class SetModelServices_AddComp extends CodeConcept<SetModelServices, ASTCallStmtNode> {
	
		//single child component
		var public String compLabel
		
		//connector component
		var public String srcCompLabel
		var public String dstCompLabel
		
		@Prop
		@Label(label="Set Services")
		var public String compSetServices
			
		new(SetModelServices parent) {
			super(parent)
		}
		
		override name() {
			if (compLabel != null) compLabel
			else if (srcCompLabel != null && dstCompLabel != null) srcCompLabel + " => " + dstCompLabel
			else null
		}
		
		override List reverseMultiple() {
			var retList = newArrayList()
			
			var rs = '''call_(_cid, «parentID», 'NUOPC_DriverAddComp'),
							callArgWithType(_, _cid, 2, _arg2keyword, _arg2Type, _arg2Expr),
							callArgWithType(_, _cid, 3, _arg3keyword, _arg3Type, _arg3Expr).'''
							.execQuery
			
			//var rs = '''call_(_cid, «parentID», 'NUOPC_DriverAddComp'),
			//				findall(arg(_idx, _keyword, _type, _expr), callArgWithType(_, _cid, _idx, _keyword, _type, _expr), Args).'''
			//				.execQueryStruct
			
			//for (Struct s : rs) {
				
				//println(s);
			//	println((s.getTerm(1) as Struct).getTerm(2) as Struct);
				
			//	var args = ((s.getTerm(1) as Struct).getTerm(2) as Struct).listIterator
				//args.
				
			//}
			
			
			
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
					addComp.compSetServices = rs.getString("_arg3Expr")
				}
				
				//addComp.compSetServices = rs.getString("_compSS")
				retList.add(addComp)
			}
			
			
			retList
		}
		
		override forward() {
			
			var IFortranAST ast = getAST
			var ASTSubroutineSubprogramNode ssn = _parent.ASTRef			
			
			var code = 
'''

type(ESMF_GridComp)            :: child
'''			
			val IASTListNode<IBodyConstruct> typeNodes = parseLiteralStatementSequence(code)
			val ASTTypeDeclarationStmtNode last = ssn.findLast(ASTTypeDeclarationStmtNode);
			if (last != null) {
				for (IBodyConstruct typeNode : typeNodes.reverse) {
					ssn.body.insertAfter(last, typeNode);
				}
			}
			else {
				ssn.body.addAll(typeNodes);
			}
					
			
			code = 
'''

call NUOPC_DriverAddComp(«_parent.paramGridComp», "«paramch('ComponentName')»", «paramch('CompSetServices')», comp=child, rc=«_parent.paramRC»)
if (ESMF_LogFoundError(rcToCheck=«_parent.paramRC», msg=ESMF_LOGERR_PASSTHRU, &
    line=__LINE__, &
    file=__FILE__)) &
    return  ! bail out
'''
			val IASTListNode<IBodyConstruct> stmts = parseLiteralStatementSequence(code)
						
			ssn.body.addAll(stmts)
			setASTRef(stmts.get(0) as ASTCallStmtNode)
	
			ast
		}
	
	}
	
	@Label(label="SetRunSequence")
	@MappingType("subroutine")
	static class SetRunSequence extends SpecializationMethodCodeConcept<Initialization> {
	
		@Label(label="New Run Sequence")
		@MappingType("call")
		@Child(forward=false)
		public BasicCodeConcept newRunSequence
		
		@Child(max=-1)
		public List<SetRunSequence_AddRunElement> runElements
		
		new(Initialization parent) {
			super(parent, "NUOPC_Driver", "label_SetRunSequence")
			//defaults
			subroutineName = "SetRunSequence"
			specLabel = "driver_label_SetRunSequence"
		}
			
		override reverse() {
			if (this == super.reverse) {				
				var rs = '''call_(_cid, «_id», 'NUOPC_DriverNewRunSequence'),
							callArgWithType(_, _cid, _, 'slotCount', _, _slotExpr).'''.execQuery
				if (rs.next) {
					newRunSequence = newBasicCodeConcept(this, rs.getLong("_cid"))
				}
				
				runElements = new SetRunSequence_AddRunElement(this).reverseMultiple() as List<SetRunSequence_AddRunElement>
				this
			}
			else {
				null
			}
	
		}
		
		override subroutineTemplate() {
'''

subroutine «subroutineName»(«paramGridComp», «paramRC»)
    type(ESMF_GridComp)  :: «paramGridComp»
    integer, intent(out) :: «paramRC»

    rc = ESMF_SUCCESS
    
    ! Replace the default RunSequence with a customized one
    call NUOPC_DriverNewRunSequence(«paramGridComp», slotCount=«paramint(1)», rc=«paramRC»)
    if (ESMF_LogFoundError(rcToCheck=«paramRC», msg=ESMF_LOGERR_PASSTHRU, &
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
	
	@Label(label="Add Run Element")
	@MappingType("call")
	static class SetRunSequence_AddRunElement extends CodeConcept<SetRunSequence, ASTCallStmtNode> {
	
		@Label(label="slot")
		@Prop
		public String slot
		public String compLabel
		
		public String srcCompLabel
		public String dstCompLabel
		
		
		override name() {
			if (compLabel != null) compLabel + "(slot=" + slot + ")"
			else srcCompLabel + " => " + dstCompLabel + "(slot=" + slot + ")"
		}		
		
		new(SetRunSequence parent) {
			super(parent)
		}
		
		override List reverseMultiple() {
			
			var retList = newArrayList()
			
			var rs = '''call_(_cid, «parentID», 'NUOPC_DriverAddRunElement').'''.execQuery
			
			/*
			 * due to limitation with CodeDB (using one instance of prolog)
			 * we cannot nest queries - therefore first go through the outer
			 * query and store in a list, then go back through the list
			 */
			while (rs.next) {
				var addComp = new SetRunSequence_AddRunElement(_parent)
				addComp._id = rs.getLong("_cid")
				retList.add(addComp)
			}
			rs.close
			
			for (SetRunSequence_AddRunElement addComp : retList) {
				rs = '''callArgWithType(_, «addComp._id», _, 'srcCompLabel', _, _srcCompExpr),
							 callArgWithType(_, «addComp._id», _, 'dstCompLabel', _, _dstCompExpr),
							 callArgWithType(_, «addComp._id», _, 'slot', _, _slotExpr).'''.execQuery
				
				if (rs.next) {
					addComp.srcCompLabel = rs.getString("_srcCompExpr")
					addComp.dstCompLabel = rs.getString("_dstCompExpr")
					addComp.slot = rs.getString("_slotExpr")
					rs.close
				}
				else {
					rs = '''callArgWithType(_, «addComp._id», _, 'compLabel', _, _compExpr),
							 callArgWithType(_, «addComp._id», _, 'slot', _, _slotExpr).'''.execQuery
					if (rs.next) {
						addComp.compLabel = rs.getString("_compExpr")
						addComp.slot = rs.getString("_slotExpr")
					}
					rs.close
				}
			}
			
			retList
			
		}
		
		override forward() {
			var IFortranAST ast = getAST			
			
			//this approach breaks the 1-to-1 mapping
			//probably need to separate subclasses, one for each type of run sequence element
			
			var code = 
'''

! add a run sequence element for a Model, Mediator, or Driver       
call NUOPC_DriverAddRunElement(«_parent.paramGridComp», slot=«paramint(1)», &
    compLabel="«paramch('compLabel')»", rc=«_parent.paramRC»)
if (ESMF_LogFoundError(rcToCheck=«_parent.paramRC», msg=ESMF_LOGERR_PASSTHRU, &
    line=__LINE__, &
    file=__FILE__)) &
    return  ! bail out

! add a run sequence element for a Connector   
call NUOPC_DriverAddRunElement(«_parent.paramGridComp», slot=«paramint(1)», &
    srcCompLabel="«paramch('srcComp')»", dstCompLabel="«paramch('dstComp')»", rc=«_parent.paramRC»)
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
	
	@Label(label="ModifyInitializePhaseMap")
	@MappingType("subroutine")
	static class ModifyInitializePhaseMap extends SpecializationMethodCodeConcept<Initialization> {
	
		new(Initialization parent) {
			super(parent, "NUOPC_Driver", "label_ModifyInitializePhaseMap")
			//defaults
			subroutineName = "ModifyInitializePhaseMap"
			specLabel = "driver_label_ModifyInitializePhaseMap"
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
	
	/*
	@Label(label="SetModelPetLists", type="subroutine")
	static class SetModelPetLists extends SpecializationMethodCodeConcept<Initialization> {
	
		new(Initialization parent) {
			super(parent, "NUOPC_Driver", "label_SetModelPetLists")
			//defaults
			subroutineName = "SetModelPetLists"
			specLabel = "driver_label_SetModelPetLists"
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
		
		override subroutineTemplate() {
'''

subroutine «subroutineName»(«paramGridComp», «paramRC»)
    type(ESMF_GridComp)  :: «paramGridComp»
    integer, intent(out) :: «paramRC»
    
    ! local variables
    integer                       :: localrc
    integer                       :: petCount, i
    integer, allocatable          :: petList(:)

    rc = ESMF_SUCCESS

    ! get the petCount
    call ESMF_GridCompGet(«paramGridComp», petCount=petCount, rc=localrc)
    if (ESMF_LogFoundError(rcToCheck=localrc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
    
    ! example of setting petList for a component
    allocate(petList(petCount/2-1))
    do i=1, petCount/2-1
      petList(i) = i-1 ! PET labeling goes from 0 to petCount-1
    enddo
    
    call NUOPC_DriverSetModel(«paramGridComp», compIndex=1, petList=petList, rc=localrc)
    if (ESMF_LogFoundError(rcToCheck=localrc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
    deallocate(petList)
      
    ! repeat as necessary for each component
    
  end subroutine

'''
		}
		
	
	}
	*
	*/
	
}