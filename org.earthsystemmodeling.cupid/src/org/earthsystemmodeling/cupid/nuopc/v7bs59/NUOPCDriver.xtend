package org.earthsystemmodeling.cupid.nuopc.v7bs59

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
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCModel.IPD.AdvertiseField
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCModel.IPD.RealizeField
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode

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
	
	@Child
	var public Run run
	
	@Child
	var public Finalize finalize
	
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
		run = new Run(this).reverse
		finalize = new Finalize(this).reverse
		this
	}

	
	override name() {
		driverName + " (" + filename + ")"
	}
	
	
	
	//////////////
	
	
	@Label(label="Initialize Phase Definition")
	public static abstract class IPD extends CodeConcept<InternalInitPhases, ASTNode> {

		new(InternalInitPhases parent) {
			super(parent)
		}
	
		@Label(label="IPDv04p1 - Advertise Fields")
		@MappingType("subroutine")
		public static class IPDv04p1 extends InternalEntryPointCodeConcept<IPD> {

			@Child(min=0, max=-1)
			public List<NUOPCModel.IPD.AdvertiseField> advertiseFields
		
			new(IPD parent) {
				super(parent)
				phaseLabel = getPhaseLabel()
				subroutineName = "AdvertiseFields"
				methodType = "ESMF_METHOD_INITIALIZE"
			}
			
			def getPhaseLabel() {
				switch _parent {
					IPDv00 : "IPDv00p1"
					IPDv01 : "IPDv01p1"
					IPDv02 : "IPDv02p1"
					IPDv03 : "IPDv03p1"
					default : "IPDv04p1"
				}
			}

			override reverseChildren() {
				advertiseFields = new AdvertiseField(this).reverseMultiple
				this
			}

			override module() {
				_parent._parent._parent._parent
			}

			override setServices() {
				_parent._parent._parent._parent.setServices
			}

		}
		
		@Label(label="IPDv04p2 - Modify CplList in Connectors")
		@MappingType("subroutine")
		public static class IPDv04p2 extends InternalEntryPointCodeConcept<IPD> {

			new(IPD parent) {
				super(parent)
				phaseLabel = getPhaseLabel()
				subroutineName = "ModifyCplList"
				methodType = "ESMF_METHOD_INITIALIZE"
				paramGridComp = "driver"
			}
			
			def getPhaseLabel() {
				switch _parent {
					IPDv01 : "IPDv01p2"
					IPDv02 : "IPDv02p2"
					IPDv03 : "IPDv03p2"
					default : "IPDv04p2"
				}
			}

			override reverseChildren() {
				this
			}
			
			override module() {
				_parent._parent._parent._parent
			}

			override setServices() {
				_parent._parent._parent._parent.setServices
			}
			
			override subroutineTemplate() {
				'''
				
recursive subroutine «subroutineName»(«paramGridComp», «paramImport», «paramExport», «paramClock», «paramRC»)
    type(ESMF_GridComp)  :: «paramGridComp»
    type(ESMF_State)     :: «paramImport», «paramExport»
    type(ESMF_Clock)     :: «paramClock»
    integer, intent(out) :: «paramRC»

    type(ESMF_CplComp), pointer     :: connectorList(:)
    integer                         :: i, j, cplListSize
    character(len=160), allocatable :: cplList(:)

    rc = ESMF_SUCCESS

    nullify(connectorList)
    call NUOPC_DriverGetComp(«paramGridComp», compList=connectorList, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
        line=__LINE__, &
        file=__FILE__)) &
        return  ! bail out
     
    do i=1, size(connectorList)
        ! query the cplList for connector i
        call NUOPC_CompAttributeGet(connectorList(i), name="CplList", &
            itemCount=cplListSize, rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
            line=__LINE__, &
            file=__FILE__)) &
            return  ! bail out
        if (cplListSize>0) then
            allocate(cplList(cplListSize))
            call NUOPC_CompAttributeGet(connectorList(i), name="CplList", &
                valueList=cplList, rc=rc)
            if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
                line=__LINE__, &
                file=__FILE__)) &
                return  ! bail out
            ! go through all of the entries in the cplList
            do j=1, cplListSize
            	! example of modifying a cplList entry
                !if (trim(cplList(j))=="air_pressure_at_sea_level") then
                !    ! switch from default regrid to redist
                !    cplList(j) = trim(cplList(j))//":REMAPMETHOD=redist"
                !endif
            enddo
            ! store the modified cplList in CplList attribute of connector i
            call NUOPC_CompAttributeSet(connectorList(i), &
                name="CplList", valueList=cplList, rc=rc)
            if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
                line=__LINE__, &
                file=__FILE__)) &
                return  ! bail out
            deallocate(cplList)
        endif
    enddo
  
    deallocate(connectorList)

end subroutine				
				'''
			}

		}
		
		@Label(label="IPDv04p3 - Realize Fields Providing Geom Object")
		@MappingType("subroutine")
		public static class IPDv04p3 extends InternalEntryPointCodeConcept<IPD> {

			@Child(min=0, max=-1)
			public List<RealizeField> realizeFields
			
			new(IPD parent) {
				super(parent)
				phaseLabel = getPhaseLabel()
				subroutineName = "RealizeFieldsProvidingGrid"
				methodType = "ESMF_METHOD_INITIALIZE"
			}
			
			def getPhaseLabel() {
				switch _parent {
					IPDv00 : "IPDv00p2"
					IPDv01 : "IPDv01p3"
					IPDv02 : "IPDv02p3"
					IPDv03 : "IPDv03p3"
					default : "IPDv04p3"
				}
			}

			override reverseChildren() {
				realizeFields = new RealizeField(this).reverseMultiple
				this
			}
			
			override module() {
				_parent._parent._parent._parent
			}

			override setServices() {
				_parent._parent._parent._parent.setServices
			}

		}
		
		@Label(label="IPDv04p4 - Modify Decomposition of Accepted Geom Object")
		@MappingType("subroutine")
		public static class IPDv04p4 extends InternalEntryPointCodeConcept<IPD> {

			new(IPD parent) {
				super(parent)
				phaseLabel = getPhaseLabel()
				subroutineName = "ModifyDistGrid"
				methodType = "ESMF_METHOD_INITIALIZE"
			}
			
			def getPhaseLabel() {
				switch _parent {
					IPDv03 : "IPDv03p4"
					default : "IPDv04p4"
				}
			}

			override reverseChildren() {
				this
			}

			override module() {
				_parent._parent._parent._parent
			}

			override setServices() {
				_parent._parent._parent._parent.setServices
			}


		}
		
		@Label(label="IPDv04p5 - Realize Fields Accepting Geom Object")
		@MappingType("subroutine")
		public static class IPDv04p5 extends InternalEntryPointCodeConcept<IPD> {
			
			new(IPD parent) {
				super(parent)
				phaseLabel = getPhaseLabel()
				subroutineName = "RealizeFieldsAcceptingGrid"
				methodType = "ESMF_METHOD_INITIALIZE"
			}
			
			def getPhaseLabel() {
				switch _parent {
					IPDv03 : "IPDv03p5"
					default : "IPDv04p5"
				}
			}

			override reverseChildren() {
				this
			}

			override module() {
				_parent._parent._parent._parent
			}

			override setServices() {
				_parent._parent._parent._parent.setServices
			}
		}
		
		@Label(label="IPDv04p6 - Unspecified by NUOPC")
		@MappingType("subroutine-inherited")
		public static class IPDv04p6 extends CodeConcept<IPD, ASTNode> {
			new(IPD parent) {
				super(parent)
			}
		}	

		@Label(label="IPDv04p7 - Unspecified by NUOPC")
		@MappingType("subroutine-inherited")
		public static class IPDv04p7 extends CodeConcept<IPD, ASTNode> {
			new(IPD parent) {
				super(parent)
			}
		}
		

	}
	

	@Label(label="Initialize Phase Definition (v00)")
	public static class IPDv00 extends IPD {

		@Child(min=0)
		@Label(label="IPDv00p1 - Advertise Fields")
		public IPD.IPDv04p1 ipdv00p1

		@Child(min=0)
		@Label(label="IPDv00p2 - Realize Fields")
		public IPD.IPDv04p3 ipdv00p2

		@Child(min=0)
		@Label(label="IPDv00p3 - Unspecified by NUOPC")
		public IPD.IPDv04p6 ipdv00p3

		@Child(min=0)
		@Label(label="IPDv00p4 - Unspecified by NUOPC")
		public IPD.IPDv04p7 ipdv00p4

		new(InternalInitPhases parent) {
			super(parent)
		}

		override IPDv00 reverse() {
			ipdv00p1 = new IPD.IPDv04p1(this).reverse as IPD.IPDv04p1
			ipdv00p2 = new IPD.IPDv04p3(this).reverse as IPD.IPDv04p3
			ipdv00p3 = new IPD.IPDv04p6(this).reverse as IPD.IPDv04p6
			ipdv00p4 = new IPD.IPDv04p7(this).reverse as IPD.IPDv04p7
			this
		}

	}
	
	
	@Label(label="Initialize Phase Definition (v01)")
	public static class IPDv01 extends IPD {

		@Child(min=0)
		@Label(label="IPDv01p1 - Advertise Fields")
		public IPD.IPDv04p1 ipdv01p1

		@Child(min=0)
		@Label(label="IPDv01p2 - Modify CplList in Connectors")
		public IPD.IPDv04p2 ipdv01p2

		@Child(min=0)
		@Label(label="IPDv01p3 - Realize Fields")
		public IPD.IPDv04p3 ipdv01p3

		@Child(min=0)
		@Label(label="IPDv01p4 - Unspecified by NUOPC")
		public IPD.IPDv04p6 ipdv01p4
		
		@Child(min=0)
		@Label(label="IPDv01p5 - Unspecified by NUOPC")
		public IPD.IPDv04p7 ipdv01p5

		new(InternalInitPhases parent) {
			super(parent)
		}

		override IPDv01 reverse() {
			ipdv01p1 = new IPD.IPDv04p1(this).reverse as IPD.IPDv04p1
			ipdv01p2 = new IPD.IPDv04p2(this).reverse as IPD.IPDv04p2
			ipdv01p3 = new IPD.IPDv04p3(this).reverse as IPD.IPDv04p3
			ipdv01p4 = new IPD.IPDv04p6(this).reverse as IPD.IPDv04p6
			ipdv01p5 = new IPD.IPDv04p7(this).reverse as IPD.IPDv04p7
			this
		}
		
		
		
	}
		
	@Label(label="Initialize Phase Definition (v02)")
	public static class IPDv02 extends IPD {
	
		new(InternalInitPhases parent) {
			super(parent)
		}
		
		@Child(min=0)
		@Label(label="IPDv02p1 - Advertise Fields")
		public IPD.IPDv04p1 ipdv02p1

		@Child(min=0)
		@Label(label="IPDv02p2 - Modify CplList in Connectors")
		public IPD.IPDv04p2 ipdv02p2

		@Child(min=0)
		@Label(label="IPDv02p3 - Realize Fields Providing Geom Object")
		public IPD.IPDv04p3 ipdv02p3
		
		@Child(min=0)
		@Label(label="IPDv02p4 - Unspecified by NUOPC")
		public IPD.IPDv04p6 ipdv02p4
		
		@Child(min=0)
		@Label(label="IPDv02p5 - Unspecified by NUOPC")
		public IPD.IPDv04p7 ipdv02p5
		
		override IPDv02 reverse() {
			ipdv02p1 = new IPD.IPDv04p1(this).reverse as IPD.IPDv04p1
			ipdv02p2 = new IPD.IPDv04p2(this).reverse as IPD.IPDv04p2
			ipdv02p3 = new IPD.IPDv04p3(this).reverse as IPD.IPDv04p3
			ipdv02p4 = new IPD.IPDv04p6(this).reverse as IPD.IPDv04p6
			ipdv02p5 = new IPD.IPDv04p7(this).reverse as IPD.IPDv04p7
			this
		}
		
		
	}
	
	@Label(label="Initialize Phase Definition (v03)")
	public static class IPDv03 extends IPD {
	
		new(InternalInitPhases parent) {
			super(parent)
		}
		
		@Child(min=0)
		@Label(label="IPDv03p1 - Advertise Fields")
		public IPD.IPDv04p1 ipdv03p1

		@Child(min=0)
		@Label(label="IPDv03p2 - Modify CplList in Connectors")
		public IPD.IPDv04p2 ipdv03p2

		@Child(min=0)
		@Label(label="IPDv03p3 - Realize Fields Providing Geom Object")
		public IPD.IPDv04p3 ipdv03p3
				
		@Child(min=0)
		@Label(label="IPDv03p4 - Modify Decomposition of Accepted Geom Object")
		public IPD.IPDv04p4 ipdv03p4
		
		@Child(min=0)
		@Label(label="IPDv03p5 - Realize Fields Accepting Geom Object")
		public IPD.IPDv04p5 ipdv03p5

		@Child(min=0)
		@Label(label="IPDv03p6 - Unspecified by NUOPC")
		public IPD.IPDv04p6 ipdv03p6
		
		@Child(min=0)
		@Label(label="IPDv03p7 - Unspecified by NUOPC")
		public IPD.IPDv04p7 ipdv03p7
		
		override IPDv03 reverse() {
			ipdv03p1 = new IPD.IPDv04p1(this).reverse as IPD.IPDv04p1
			ipdv03p2 = new IPD.IPDv04p2(this).reverse as IPD.IPDv04p2
			ipdv03p3 = new IPD.IPDv04p3(this).reverse as IPD.IPDv04p3
			ipdv03p4 = new IPD.IPDv04p4(this).reverse as IPD.IPDv04p4
			ipdv03p5 = new IPD.IPDv04p5(this).reverse as IPD.IPDv04p5
			ipdv03p6 = new IPD.IPDv04p6(this).reverse as IPD.IPDv04p6
			ipdv03p7 = new IPD.IPDv04p7(this).reverse as IPD.IPDv04p7
			this
		}
		
	}
	
	@Label(label="Initialize Phase Definition (v04)")
	public static class IPDv04 extends IPD {
	
		new(InternalInitPhases parent) {
			super(parent)
		}
		
		@Child(min=0)
		public IPD.IPDv04p1 ipdv04p1

		@Child(min=0)
		public IPD.IPDv04p2 ipdv04p2

		@Child(min=0)
		public IPD.IPDv04p3 ipdv04p3
		
		@Child(min=0)
		public IPD.IPDv04p4 ipdv04p4
		
		@Child(min=0)
		public IPD.IPDv04p5 ipdv04p5

		@Child(min=0)
		public IPD.IPDv04p6 ipdv04p6
		
		@Child(min=0)
		public IPD.IPDv04p7 ipdv04p7
		
		override IPDv04 reverse() {
			ipdv04p1 = new IPD.IPDv04p1(this).reverse as IPD.IPDv04p1
			ipdv04p2 = new IPD.IPDv04p2(this).reverse as IPD.IPDv04p2
			ipdv04p3 = new IPD.IPDv04p3(this).reverse as IPD.IPDv04p3
			ipdv04p4 = new IPD.IPDv04p4(this).reverse as IPD.IPDv04p4
			ipdv04p5 = new IPD.IPDv04p5(this).reverse as IPD.IPDv04p5
			ipdv04p6 = new IPD.IPDv04p6(this).reverse as IPD.IPDv04p6
			ipdv04p7 = new IPD.IPDv04p7(this).reverse as IPD.IPDv04p7
			
			//if (ipdv04p1==null && ipdv04p3==null && ipdv04p4==null) return null
			//else this
			this
		}
		
	}
	
	
	@Label(label="Internal Phases")
	public static class InternalInitPhases extends CodeConcept<Initialization, ASTNode> {
	
		@Child
		public IPDv00 ipdv00
		
		@Child
		public IPDv01 ipdv01
		
		@Child
		public IPDv02 ipdv02
		
		@Child
		public IPDv03 ipdv03
		
		@Child
		public IPDv04 ipdv04
	
		new(Initialization parent) {
			super(parent)
		}
		
		override reverse() {
			ipdv00 = new IPDv00(this).reverse
			ipdv01 = new IPDv01(this).reverse
			ipdv02 = new IPDv02(this).reverse
			ipdv03 = new IPDv03(this).reverse
			ipdv04 = new IPDv04(this).reverse
			this
		}
		
		override validate() {
			ipdv00.validate ||
			ipdv01.validate ||
			ipdv02.validate ||
			ipdv03.validate || 
			ipdv04.validate
		}
	
	}
		
	@Label(label="Phases")
	public static class InitPhases extends CodeConcept<Initialization, ASTNode> {
	
		@Child
		public InitP1 initP1
	
		new(Initialization parent) {
			super(parent)
		}
		
		override reverse() {
			initP1 = new InitP1(this).reverse as InitP1			
			this
		}
		
		@Label(label="Phase 1")
		@MappingType("subroutine-inherited")
		public static class InitP1 extends CodeConcept<InitPhases, ASTNode> {
			new(InitPhases parent) {
				super(parent)
			}
		}
	
	}
	

	@Label(label="Initialize")
	public static class Initialization extends CodeConcept<NUOPCDriver, ASTNode> {

		@Child
		public InitPhases initPhases
		
		@Child
		public InternalInitPhases internalInitPhases
		
		@Child
		public InitSpecializations initSpecs
		
		new(NUOPCDriver parent) {
			super(parent)
		}

		override Initialization reverse() {
			reverseChildren
		}

		def reverseChildren() {
			initPhases = new InitPhases(this).reverse as InitPhases
			internalInitPhases = new InternalInitPhases(this).reverse as InternalInitPhases
			initSpecs = new InitSpecializations(this).reverse as InitSpecializations
			this
		}

	}
	
	
	
	
	
	/////////////////////
		
		
		
		
		
	
	@Label(label="Specializations")
	public static class InitSpecializations extends CodeConcept<Initialization, ASTNode> {
	
		@Child
		var public SetModelServices setModelServices
		
		@Child(min=0)
		var public SetRunSequence setRunSequence
		
		@Child(min=0)
		var public ModifyInitializePhaseMap modifyInitializePhaseMap
	
		new(Initialization parent) {
			super(parent)
		}
		
		override InitSpecializations reverse() {
			reverseChildren
		}
		
		def reverseChildren() {
			setModelServices = new SetModelServices(this).reverse as SetModelServices
			setRunSequence = new SetRunSequence(this).reverse as SetRunSequence
			modifyInitializePhaseMap = new ModifyInitializePhaseMap(this).reverse as ModifyInitializePhaseMap		
			
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
	static class SetModelServices extends SpecializationMethodCodeConcept<InitSpecializations> {
	
		@Child(max=-1)
		var public List<SetModelServices_AddComp> addComps
		
		@Label(label="SetClock")
		@MappingType("call")
		@Child
		var public BasicCodeConcept setClock
		
		new(InitSpecializations parent) {
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
			_parent._parent._parent
		}
		
		override setServices() {
			_parent._parent._parent.setServices
		}
		
		override genericUse() {
			_parent._parent._parent.importNUOPCGeneric
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
  return

call ESMF_TimeSet(startTime, yy=«paramint(2010)», mm=«paramint(6)», dd=«paramint(1)», h=«paramint(0)», m=«paramint(0)», rc=«paramRC»)
if (ESMF_LogFoundError(rcToCheck=«paramRC», msg=ESMF_LOGERR_PASSTHRU, &
  line=__LINE__, &
  file=__FILE__)) &
  return

call ESMF_TimeSet(stopTime, yy=«paramint(2010)», mm=«paramint(6)», dd=«paramint(1)», h=«paramint(1)», m=«paramint(0)», rc=«paramRC»)
if (ESMF_LogFoundError(rcToCheck=«paramRC», msg=ESMF_LOGERR_PASSTHRU, &
  line=__LINE__, &
  file=__FILE__)) &
  return

internalClock = ESMF_ClockCreate(name="«paramch('AppClock')»", &
  timeStep=timeStep, startTime=startTime, stopTime=stopTime, rc=«paramRC»)
if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
  line=__LINE__, &
  file=__FILE__)) &
  return
  
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
	
	@Label(label="DriverAddComp")
	@MappingType("call")
	static class SetModelServices_AddComp extends CodeConcept<SetModelServices, ASTCallStmtNode> {
	
		//single child component
		var public String compLabel
		
		//connector component
		var public String srcCompLabel
		var public String dstCompLabel
		
		//@Prop
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
			
			var ASTModuleNode amn = _parent._parent._parent._parent.ASTRef

/*			
			var code = 
'''
						
use «paramch('MODEL')», only: «paramch('modelSS')» => SetServices
'''			

			val IASTListNode<IBodyConstruct> useNodes = parseLiteralStatementSequence(code)
*/

/*
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
*/					
			
			var code = 
'''

call NUOPC_DriverAddComp(«_parent.paramGridComp», "«paramch('ComponentName')»", «paramch('CompSetServices')», rc=«_parent.paramRC»)

! To add a Connector, use signature below instead   
!call NUOPC_DriverAddComp(«_parent.paramGridComp», srcCompLabel="«paramch('SrcComp')»", dstCompLabel="«paramch('DstComp')»", &
!    compSetServicesRoutine=«paramch('cplSS')», rc=rc)

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
	static class SetRunSequence extends SpecializationMethodCodeConcept<InitSpecializations> {
	
		@Label(label="New Run Sequence")
		@MappingType("call")
		@Child(forward=false)
		public BasicCodeConcept newRunSequence
		
		@Child(max=-1)
		public List<SetRunSequence_AddRunElement> runElements
		
		new(InitSpecializations parent) {
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
			_parent._parent._parent
		}
		
		override setServices() {
			_parent._parent._parent.setServices
		}
		
		override genericUse() {
			_parent._parent._parent.importNUOPCGeneric
		}
		
		
	}
	
	@Label(label="Add Run Element")
	@MappingType("call")
	static class SetRunSequence_AddRunElement extends CodeConcept<SetRunSequence, ASTCallStmtNode> {
	
		@Label(label="slot")
		@Prop
		public String slot
		
		@Label(label="linkSlot")
		@Prop
		public String linkSlot
		
		public String compLabel
		
		public String srcCompLabel
		public String dstCompLabel
		
		
		override name() {
			if (compLabel != null) compLabel + "(slot=" + slot + ")"
			else if (linkSlot != null) "slot " + slot + " => slot " + linkSlot
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
						rs.close
					}
					else {
						//call NUOPC_DriverAddRunElement(driver, slot=1, linkSlot=2, rc=rc)
						rs = '''callArgWithType(_, «addComp._id», _, 'slot', _, _slotExpr),
							 callArgWithType(_, «addComp._id», _, 'linkSlot', _, _linkSlotExpr).'''.execQuery
						if (rs.next) {
							addComp.linkSlot = rs.getString("_linkSlotExpr")
							addComp.slot = rs.getString("_slotExpr")
							rs.close
						}
					}
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
    compLabel="«paramch('compLabel')»", phaseLabel="«paramch('optionalPhaseLabel')»", rc=«_parent.paramRC»)
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

! add a run sequence element to link between slots    
call NUOPC_DriverAddRunElement(«_parent.paramGridComp», slot=«paramint(1)», linkSlot=«paramint(2)», rc=«_parent.paramRC»)
if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
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
	static class ModifyInitializePhaseMap extends SpecializationMethodCodeConcept<InitSpecializations> {
	
		new(InitSpecializations parent) {
			super(parent, "NUOPC_Driver", "label_ModifyInitializePhaseMap")
			//defaults
			subroutineName = "ModifyInitializePhaseMap"
			specLabel = "driver_label_ModifyInitializePhaseMap"
		}
		
		override module() {
			_parent._parent._parent
		}
		
		override setServices() {
			_parent._parent._parent.setServices
		}
		
		override genericUse() {
			_parent._parent._parent.importNUOPCGeneric
		}	
		
	}
	
	
	@Label(label="Run")
	public static class Run extends CodeConcept<NUOPCDriver, ASTNode> {

		@Child
		public RunPhases runPhases
		
		@Child
		public RunSpecializations runSpecs
	
		new(NUOPCDriver parent) {
			super(parent)
		}
		
		override Run reverse() {
			runPhases = new RunPhases(this).reverse as RunPhases
			runSpecs = new RunSpecializations(this).reverse as RunSpecializations
			this
		}
	
	}
	
	
	@Label(label="Phases")
	public static class RunPhases extends CodeConcept<Run, ASTNode> {
	
		@Child
		public RunPhase1 p1
		
		new(Run parent) {
			super(parent)
		}
		
		override RunPhases reverse() {
			p1 = new RunPhase1(this).reverse as RunPhase1
			this
		}
	
	}
	
	@Label(label="Run Phase 1")
	@MappingType("subroutine-inherited")
	public static class RunPhase1 extends CodeConcept<RunPhases, ASTNode> {
		new(RunPhases parent) {
			super(parent)
		}
	}	
	
	@Label(label="Specializations")
	public static class RunSpecializations extends CodeConcept<Run, ASTNode> {

		@Child(min=0)
		public SetRunClock setRunClock

		new(Run parent) {
			super(parent)
		}

		override reverse() {
			reverseChildren
		}

		def reverseChildren() {
			setRunClock = new SetRunClock(this).reverse as SetRunClock
			this
		}

	}
	
	@Label(label="SetRunClock")
	@MappingType("subroutine")
	public static class SetRunClock extends SpecializationMethodCodeConcept<RunSpecializations> {

		new(RunSpecializations parent) {
			super(parent, "NUOPC_Driver", "label_SetRunClock")

			// defaults
			subroutineName = "SetRunClock"
			specLabel = "driver_label_SetRunClock"
			paramGridComp = "driver"
			paramRC = "rc"
		}

		override subroutineTemplate() {
			'''

subroutine «subroutineName»(«paramGridComp», «paramRC»)
    type(ESMF_GridComp)  :: «paramGridComp»
    integer, intent(out) :: «paramRC»
   
   	! local variable
   	type(ESMF_Clock) :: myClock
   	
    rc = ESMF_SUCCESS

    ! check and set clock against an external clock
    call NUOPC_CompCheckSetClock(«paramGridComp», «paramch('myClock')», rc=«paramRC»)
    if (ESMF_LogFoundError(rcToCheck=«paramRC», msg=ESMF_LOGERR_PASSTHRU, &
        line=__LINE__, &
        file=__FILE__)) &
        return  ! bail out
          
  end subroutine
'''
		}

		override module() {
			_parent._parent._parent
		}

		override setServices() {
			_parent._parent._parent.setServices
		}

		override genericUse() {
			_parent._parent._parent.importNUOPCGeneric
		}
		
	
	}
	
	@Label(label="Phases")
	public static class FinalizePhases extends CodeConcept<Finalize, ASTNode> {
	
		@Child
		public FinalizePhase1 p1
		
		new(Finalize parent) {
			super(parent)
		}
		
		override FinalizePhases reverse() {
			p1 = new FinalizePhase1(this).reverse as FinalizePhase1
			this
		}
	
	}
	
	@Label(label="Specializations")
	public static class FinalizeSpecializations extends CodeConcept<Finalize, ASTNode> {

		@Child(min=0)
		public FinalizeDriver finalize

		new(Finalize parent) {
			super(parent)
		}

		override reverse() {
			reverseChildren
		}

		def reverseChildren() {
			finalize = new FinalizeDriver(this).reverse as FinalizeDriver
			this
		}

	}
	
	@Label(label="Finalize Phase 1")
	@MappingType("subroutine-inherited")
	public static class FinalizePhase1 extends CodeConcept<FinalizePhases, ASTNode> {
		new(FinalizePhases parent) {
			super(parent)
		}
	}	

	@Label(label="Finalize")
	public static class Finalize extends CodeConcept<NUOPCDriver, ASTNode> {

		@Child
		public FinalizePhases finalPhases
		
		@Child
		public FinalizeSpecializations finalSpecs

		new(NUOPCDriver parent) {
			super(parent)
		}

		override Finalize reverse() {
			reverseChildren
		}

		def reverseChildren() {
			finalPhases = new FinalizePhases(this).reverse as FinalizePhases
			finalSpecs = new FinalizeSpecializations(this).reverse as FinalizeSpecializations
			this
		}

	}
	
	@Label(label="FinalizeDriver")
	@MappingType("subroutine")
	public static class FinalizeDriver extends SpecializationMethodCodeConcept<FinalizeSpecializations> {

		new(FinalizeSpecializations parent) {
			super(parent, "NUOPC_Driver", "label_Finalize")

			// defaults
			subroutineName = "FinalizeDriver"
			specLabel = "driver_label_Finalize"
			paramGridComp = "driver"
			paramRC = "rc"
		}

		override subroutineTemplate() {
			'''

subroutine «subroutineName»(«paramGridComp», «paramRC»)
    type(ESMF_GridComp)  :: «paramGridComp»
    integer, intent(out) :: «paramRC»

    rc = ESMF_SUCCESS
    
    ! finalize driver

end subroutine
'''
		}

		override module() {
			_parent._parent._parent
		}

		override setServices() {
			_parent._parent._parent.setServices
		}

		override genericUse() {
			_parent._parent._parent.importNUOPCGeneric
		}

	}
	
}