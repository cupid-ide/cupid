package org.earthsystemmodeling.cupid.nuopc.v7bs59

import java.util.List
import org.earthsystemmodeling.cupid.annotation.Child
import org.earthsystemmodeling.cupid.annotation.Doc
import org.earthsystemmodeling.cupid.annotation.Label
import org.earthsystemmodeling.cupid.annotation.MappingType
import org.earthsystemmodeling.cupid.annotation.Prop
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept
import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCModel.IPD.AdvertiseField
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCModel.IPD.RealizeField
import org.eclipse.core.resources.IResource
import org.eclipse.photran.core.IFortranAST
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.eclipse.photran.internal.core.parser.ASTTypeDeclarationStmtNode
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode
import org.eclipse.photran.internal.core.parser.IASTListNode
import org.eclipse.photran.internal.core.parser.IBodyConstruct

import static org.earthsystemmodeling.cupid.util.CodeExtraction.*

import static extension org.earthsystemmodeling.cupid.nuopc.ASTQuery.*

@Label(label="NUOPC Driver")
@MappingType("module")
@Doc(urlfrag="#driver-top")
class NUOPCDriver extends NUOPCComponent {
	
	public String driverName = "driver"
	public String filename
	public String path
	
	@Child(forward=true)
	var public SetServices setServices
	
	@Child
	var public Initialization initialization
	
	@Child
	var public Run run
	
	@Child
	var public Finalize finalize
	
	new(CodeDBIndex codeDB) {
		super(null)
		_codeDB = null
	}
	
	
	new(IResource context) {
		super(null)
		_context = context
		_codeDB = null
	}
	
	
	override prefix() {"driver"}


	override NUOPCDriver reverse() {
		
		var ast = getAST()
				
		_astRef = ast.root?.programUnitList?.filter(ASTModuleNode).findFirst[
			it.moduleBody?.filter(ASTUseStmtNode).exists[it.name.text.eic("NUOPC_Driver")]
		]
		
		if (_astRef != null) {
			driverName = _astRef.moduleStmt.moduleName.moduleName.text
			
			//move some or all of these to NUOPCComponent
			_astRef.moduleBody.filter(ASTUseStmtNode).forEach[
				if (it.name.text.eic("ESMF")) {
					importESMF = new BasicCodeConcept(this, it)
				}
				else if (it.name.text.eic("NUOPC")) {
					importNUOPC = new BasicCodeConcept(this, it)
				}
				else if (it.name.text.eic("NUOPC_Driver")) {
					importNUOPCGeneric = new GenericImport(this, it).reverse
				}
			]
						
			reverseChildren
			
		}
		else null
	}
	
		
	/*
	def reverseOLD() {
		  	
     	var rs = '''module(_moduleID, _compUnitID, _driverName), 
		            compilationUnit(_compUnitID, _filename, _path),
   					uses(_uid, _moduleID, 'NUOPC_Driver').'''.execQuery
   					
   	   		
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
	*/
	
	def reverseChildren() {
		setServices = new SetServices(this).reverse as SetServices
		initialization = new Initialization(this).reverse
		run = new Run(this).reverse
		finalize = new Finalize(this).reverse
		this
	}

	override NUOPCDriver fward() {
		
		if (getASTRef == null) {
			
			if (driverName==null) throw new CodeGenerationException("No driver name specified")
			
			//create module
			var code = '''
module «driverName»
	
	use ESMF
	use NUOPC
	use NUOPC_Driver, only: &
		driver_SetServices => SetServices
		
	implicit none
	
	contains
	
end module
			'''
	
			var ASTModuleNode moduleNode = parseLiteralProgramUnit(code)
			setASTRef(moduleNode)
			
			moduleNode.moduleBody.filter(ASTUseStmtNode).forEach[
				if (it.name.text.eic("ESMF")) {
					importESMF = new BasicCodeConcept(this, it)
				}
				else if (it.name.text.eic("NUOPC")) {
					importNUOPC = new BasicCodeConcept(this, it)
				}
				else if (it.name.text.eic("NUOPC_Driver")) {
					importNUOPCGeneric = new GenericImport(this, it).reverse
				}
			]
			
			//createFile(code)
			
			//reverse engineer to populate AST refs
			//reverse()
									
		}
		
		super.fward as NUOPCDriver
		
	}

	
	override name() {
		driverName + " (" + filename + ")"
	}
	
	
	@Label(label="SetServices")
	@MappingType("subroutine")
	@Doc(urlfrag="#driver-setservices")
	public static class SetServices extends SetServicesCodeConcept<NUOPCDriver> {	
		new(NUOPCDriver parent) {
			super(parent)
		}		
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
		
		override validate(List<String> errors) {
			ipdv00.validate(errors) ||
			ipdv01.validate(errors) ||
			ipdv02.validate(errors) ||
			ipdv03.validate(errors) || 
			ipdv04.validate(errors)
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
		@Doc(urlfrag="#driver-phase-init")
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
	
	
	@Label(label="SetModelServices")
	@MappingType("subroutine")
	@Doc(urlfrag="#driver-specialization-setmodelservices")
	static class SetModelServices extends SpecializationMethodCodeConcept<InitSpecializations> {
	
		@Child(min=0, max=-1)
		var public List<SetModelServices_AddComp> addComps
		
		@Label(label="SetClock")
		@MappingType("call")
		@Child(min=0)
		var public BasicCodeConcept<ASTCallStmtNode> setClock
		
		new(InitSpecializations parent) {
			super(parent, "NUOPC_Driver", "label_SetModelServices")
			subroutineName = "SetModelServices"
			specLabel = "driver_label_SetModelServices"
		}
			
		override reverse() {
			
			var ret = super.reverse as SetModelServices
			if (ret != null) {							
				/*
				var rs = '''call_(_cid, «_id», 'ESMF_GridCompSet'),
							callArgWithType(_, _cid, _, 'clock', _, _clockExpr).'''.execQuery
				if (rs.next) {
					setClock = newBasicCodeConcept(this, rs.getLong("_cid"))
				}
				*
				*/				
				val setClockCall = ret.ASTRef.body.filter(ASTCallStmtNode).findFirst[
					it.subroutineName.eic("ESMF_GridCompSet") &&
					it.argList?.exists[it.name?.eic("clock")]
				]
				if (setClockCall != null) ret.setClock = new BasicCodeConcept<ASTCallStmtNode>(ret, setClockCall)
				ret
			}
			else null
			
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
			
			val retList = newArrayList()
			
			_parent.ASTRef.body.filter(ASTCallStmtNode).filter[
				it.subroutineName.eic("NUOPC_DriverAddComp")].forEach[c|
					var smsac = newInstance() as SetModelServices_AddComp
					if (c.argList.get(1).name?.eic("srcCompLabel")) {
						//connector
						smsac.srcCompLabel = c.argList.get(1).expr.literal
						smsac.dstCompLabel = c.argList.get(2).expr.literal
						smsac.compSetServices = c.argList.get(3).expr.literal
					}
					else {
						//component
						smsac.compLabel = c.argList.get(1).expr.literal
						smsac.compSetServices = c.argList.get(2).expr.literal
					}
					retList.add(smsac)
				]
			
			retList
			
		}
		
		/*
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
		*/
		
		override forward() {
			
			var IFortranAST ast = getAST
			var ASTSubroutineSubprogramNode ssn = _parent.ASTRef			
			
			var ASTModuleNode amn = _parent._parent._parent._parent.ASTRef
		
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
	@Doc(urlfrag="#driver-specialization-setrunsequence")
	static class SetRunSequence extends SpecializationMethodCodeConcept<InitSpecializations> {
	
		@Label(label="New Run Sequence")
		@MappingType("call")
		@Child(min=0)
		public BasicCodeConcept<ASTCallStmtNode> newRunSequence
		
		@Child(min=0, max=-1)
		public List<SetRunSequence_AddRunElement> runElements
		
		new(InitSpecializations parent) {
			super(parent, "NUOPC_Driver", "label_SetRunSequence")
			//defaults
			subroutineName = "SetRunSequence"
			specLabel = "driver_label_SetRunSequence"
			//parent.setRunSequence = this
		}
			
		override reverse() {
			
			var ret = super.reverse as SetRunSequence
			if (ret != null) {							
				val newRunSequence = ret.ASTRef.body.filter(ASTCallStmtNode).findFirst[
					it.subroutineName.eic("NUOPC_DriverNewRunSequence")
				]
				if (newRunSequence != null) ret.newRunSequence = new BasicCodeConcept<ASTCallStmtNode>(ret, newRunSequence)
				ret.runElements = new SetRunSequence_AddRunElement(ret).reverseMultiple() as List<SetRunSequence_AddRunElement>
				ret
			}
			else null
			
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
			val retList = newArrayList()
			
			_parent.ASTRef.body.filter(ASTCallStmtNode).filter[
				it.subroutineName.eic("NUOPC_DriverAddRunElement")].forEach[c|
					var srsare = newInstance() as SetRunSequence_AddRunElement
					if (c.argList.get(2).name?.eic("srcCompLabel")) {
						srsare.srcCompLabel = c.argList.get(2).expr.literal
						srsare.dstCompLabel = c.argList.get(3).expr.literal
						srsare.slot = c.argList.get(1).expr.literal
					}
					else if (c.argList.get(2).name?.eic("compLabel")) {
						srsare.compLabel = c.argList.get(2).expr.literal
						srsare.slot = c.argList.get(1).expr.literal
					}
					else if (c.argList.get(2).name?.eic("linkSlot")) {
						srsare.slot = c.argList.get(1).expr.literal
						srsare.linkSlot = c.argList.get(2).expr.literal
					}
					retList.add(srsare)
				]
			
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
		
	override SetRunSequence_AddRunElement fward() {
		
		var String code
				
		if (compLabel != null) {			
			code = 
'''

! add a run sequence element for a Model, Mediator, or Driver       
call NUOPC_DriverAddRunElement(«_parent.paramGridComp», slot=«paramint(slot)», &
    compLabel=«paramch(compLabel)», phaseLabel="«paramch('optionalPhaseLabel')»", rc=«_parent.paramRC»)
if (ESMF_LogFoundError(rcToCheck=«_parent.paramRC», msg=ESMF_LOGERR_PASSTHRU, &
    line=__LINE__, &
    file=__FILE__)) &
    return  ! bail out
'''			
		}
		else throw new CodeGenerationException("Need to implement") //for now			

		val IASTListNode<IBodyConstruct> stmts = parseLiteralStatementSequence(code)
		val ASTSubroutineSubprogramNode ssn = _parent.ASTRef
		ssn.body.addAll(stmts)

		setASTRef(stmts.get(0) as ASTCallStmtNode)
	
		this
	}
		
		
		
	}
	
	@Label(label="ModifyInitializePhaseMap")
	@MappingType("subroutine")
	@Doc(urlfrag="#driver-specialization-modifyinitphasemap")
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
	@Doc(urlfrag="#driver-phase-run")
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
	@Doc(urlfrag="#driver-specialization-setrunclock")
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
	@Doc(urlfrag="#driver-phase-finalize")
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
	@Doc(urlfrag="#driver-specialization-finalize")
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