package org.earthsystemmodeling.cupid.nuopc.v7r

import java.util.List
import org.earthsystemmodeling.cupid.annotation.Child
import org.earthsystemmodeling.cupid.annotation.Doc
import org.earthsystemmodeling.cupid.annotation.Label
import org.earthsystemmodeling.cupid.annotation.MappingType
import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import org.earthsystemmodeling.cupid.nuopc.v7r.GridCodeConcept.CreateUniformGrid
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCBaseModel.AdvertiseField
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCBaseModel.RealizeField
import org.eclipse.core.resources.IResource
import org.eclipse.photran.internal.core.parser.ASTNode
import org.eclipse.xtend.lib.annotations.Accessors

import static org.earthsystemmodeling.cupid.nuopc.ESMFCodeTemplates.*
import org.earthsystemmodeling.cupid.NUOPC.Mediator
import org.earthsystemmodeling.cupid.NUOPC.UniformGrid
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCMediator.IPD.IPDv04p1
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCMediator.IPD.IPDv04p3
import org.earthsystemmodeling.cupid.NUOPC.Field
import org.earthsystemmodeling.cupid.NUOPC.Grid
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCMediator.IPD.IPDv04p0

@Label(label="NUOPC Mediator")
@MappingType("module")
@Doc(urlfrag="#mediator-top")
class NUOPCMediator extends NUOPCComponent {

	@Child(forward=true)
	public SetServices setServices
	
	@Child(forward=true)
	public Initialization initialization

	@Child(forward=true)
	public Run run

	@Child(forward=true)
	public Finalize finalize

	new(IResource context) {
		super(null, context, "NUOPC_Mediator")
	}

	override prefix() { "mediator" }

	override NUOPCMediator reverse() {
		super.reverse as NUOPCMediator
	}

	override reverseChildren() {
		setServices = new SetServices(this).reverse as SetServices
		initialization = new Initialization(this).reverse
		run = new Run(this).reverse
		finalize = new Finalize(this).reverse
		this
	}

	override NUOPCMediator forward() {
		super.forward as NUOPCMediator
	}
		
		
	static def newMediator(IResource context, Mediator high) {
		val m = newBasicMediator(context)
		m.forward(high)
		m
	}
	
	static def newBasicMediator(IResource context) {
		val mediator = new NUOPCMediator(context)
		new SetServices(mediator)
		new Initialization(mediator)
		new InitPhases(mediator.initialization)
		new InitSpecializations(mediator.initialization)
		new Run(mediator)
		new RunPhases(mediator.run)
		new RunSpecializations(mediator.run)
		new MediatorAdvance(mediator.run.runSpecs)
		new Finalize(mediator)
		new FinalizePhases(mediator.finalize)
		new FinalizeSpecializations(mediator.finalize)
		mediator
	}
	
	def forward(Mediator high) {
		name = high.name
		initialization.forward(high)
	}	
		
	
	@Label(label="SetServices")
	@MappingType("subroutine")
	@Doc(urlfrag="#mediator-setservices")
	public static class SetServices extends SetServicesCodeConcept<NUOPCMediator> {	
		new(NUOPCMediator parent) {
			super(parent)
		}		
	}
	
	@Label(label="Initialize Phase Definition")
	public static abstract class IPD extends CodeConcept<NUOPCMediator.InitPhases, ASTNode> {

		new(NUOPCMediator.InitPhases parent) {
			super(parent)
			parent.setOrAddChild(this)
		}
	
		@Label(label="IPDv04p0 - Filter Initialization Phases")
		@MappingType("subroutine")
		public static class IPDv04p0 extends EntryPointCodeConcept<IPD> {
	
			public String ipdversion
			
			new(IPD parent) {
				super(parent)
				parent.setOrAddChild(this)
				subroutineName = "InitializeP0"
				methodType = "ESMF_METHOD_INITIALIZE"
				phaseNumber = "0"
				ipdversion = switch _parent {
					IPDv00 : "\"IPDv00\""
					IPDv01 : "\"IPDv01\""
					IPDv02 : "\"IPDv02\""
					IPDv03 : "\"IPDv03\""
					default : "\"IPDv04\""
				}
			}
			
			def getPhaseLabel() {
				switch _parent {
					IPDv00 : "IPDv00p0"
					IPDv01 : "IPDv01p0"
					IPDv02 : "IPDv02p0"
					IPDv03 : "IPDv03p0"
					default : "IPDv04p0"
				}
			}
			
			override subroutineTemplate() {
			'''
			
			subroutine «subroutineName»(«paramGridComp», «paramImport», «paramExport», «paramClock», «paramRC»)
			    type(ESMF_GridComp)  :: «paramGridComp»
			    type(ESMF_State)     :: «paramImport», «paramExport»
			    type(ESMF_Clock)     :: «paramClock»
			    integer, intent(out) :: «paramRC»
			    
			     rc = ESMF_SUCCESS
			     
			     ! Switch to «ipdversion» by filtering all other phaseMap entries
			     call NUOPC_CompFilterPhaseMap(«paramGridComp», «methodType», &
			        acceptStringList=(/«ipdversion»/), rc=«paramRC»)
			     «ESMFErrorCheck(paramRC)»
			    
			end subroutine
			'''
			}
			
			override module() {
				_parent._parent._parent._parent
			}

			override setServices() {
				_parent._parent._parent._parent.setServices
			}

		}	
			
		@Label(label="IPDv04p1 - Advertise Fields")
		@MappingType("subroutine")
		@Doc(urlfrag="#mediator-phase-advertisefields")
		public static class IPDv04p1 extends EntryPointCodeConcept<IPD> {

			@Child(min=0, max=-1)
			public List<AdvertiseField> advertiseFields
		
			new(IPD parent) {
				super(parent)
				phaseLabel = getPhaseLabel()
				subroutineName = "AdvertiseFields"
				methodType = "ESMF_METHOD_INITIALIZE"
				parent.setOrAddChild(this)
				advertiseFields = newArrayList()
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
			
			def forward(Mediator high) {
				for (Field f : high.importFields) {
					val af = new AdvertiseField(this)
					af.standardName = '''"«f.standardName»"'''
					af.name = '''"«f.name»"'''
					af.state = paramImport
				}
				for (Field f : high.exportFields) {
					val af = new AdvertiseField(this)
					af.standardName = '''"«f.standardName»"'''
					af.name = '''"«f.name»"'''
					af.state = paramExport
				}
			}

		}
		
		@Label(label="IPDv04p2 - Unspecified by NUOPC")
		@MappingType("subroutine-inherited")
		@Doc(urlfrag="#mediator-initseq")
		public static class IPDv04p2 extends CodeConcept<IPD, ASTNode> {
			new(IPD parent) {
				super(parent)
			}
		}		

		@Label(label="IPDv04p3 - Realize Fields Providing Geom Object")
		@MappingType("subroutine")
		@Doc(urlfrag="#mediator-phase-realizefieldsproviding")
		public static class IPDv04p3 extends EntryPointCodeConcept<IPD> {

			@Child(min=0, max=-1)
			public List<RealizeField> realizeFields
			
			@Accessors
			List<String> grids
			
			new(IPD parent) {
				super(parent)
				phaseLabel = getPhaseLabel()
				subroutineName = "RealizeFieldsProvidingGrid"
				methodType = "ESMF_METHOD_INITIALIZE"
				parent.setOrAddChild(this)
				realizeFields = newArrayList()
				grids = newArrayList()
			}
			
			def forward(Mediator high) {
				for (Field f : high.importFields) {
					new RealizeField(this).forward(f, paramImport)				
				}
				for (Field f : high.exportFields) {
					new RealizeField(this).forward(f, paramExport)
				}
				for (Grid g : high.grids) {
					grids.add(g.name)
				}
			}
			
			
			override subroutineTemplate() {
			'''
			
			subroutine «subroutineName»(«paramGridComp», «paramImport», «paramExport», «paramClock», «paramRC»)
			    type(ESMF_GridComp)  :: «paramGridComp»
			    type(ESMF_State)     :: «paramImport», «paramExport»
			    type(ESMF_Clock)     :: «paramClock»
			    integer, intent(out) :: «paramRC»
			    
			    «FOR g : grids»
			    type(ESMF_Grid) :: «g»
			    «ENDFOR»
			    
			    rc = ESMF_SUCCESS
			    
			    «FOR g : grids»
			    «g» = CreateGrid_«g»(rc=«paramRC»)
			    «ESMFErrorCheck(paramRC)»
			    «ENDFOR»
			    
			    
			    
			end subroutine
			'''
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
		@Doc(urlfrag="#mediator-phase-modifydecomp")
		public static class IPDv04p4 extends EntryPointCodeConcept<IPD> {

			new(IPD parent) {
				super(parent)
				phaseLabel = getPhaseLabel()
				subroutineName = "ModifyDistGrid"
				methodType = "ESMF_METHOD_INITIALIZE"
				parent.setOrAddChild(this)
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
		@Doc(urlfrag="#model-phase-realizefieldsaccepting")
		public static class IPDv04p5 extends EntryPointCodeConcept<IPD> {
			
			@Child(min=0, max=-1)
			public List<RealizeField> realizeFields
			
			new(IPD parent) {
				super(parent)
				phaseLabel = getPhaseLabel()
				subroutineName = "RealizeFieldsAcceptingGrid"
				methodType = "ESMF_METHOD_INITIALIZE"
				realizeFields = newArrayList()
				parent.setOrAddChild(this)
			}
			
			def getPhaseLabel() {
				switch _parent {
					IPDv03 : "IPDv03p5"
					default : "IPDv04p5"
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
		
		@Label(label="IPDv04p6 - Verify Connected / Set Clock")
		@MappingType("subroutine-inherited")
		@Doc(urlfrag="#mediator-phase-verifyimports")
		public static class IPDv04p6 extends CodeConcept<IPD, ASTNode> {
			new(IPD parent) {
				super(parent)
			}
		}	

		@Label(label="IPDv04p7 - Data Initialize")
		@MappingType("subroutine-inherited")
		@Doc(urlfrag="#mediator-phase-initexport")
		public static class IPDv04p7 extends CodeConcept<IPD, ASTNode> {
			new(IPD parent) {
				super(parent)
			}
		}
		
		/*
		@Label(label="Advertise Field")
		@MappingType("call")
		public static class AdvertiseField extends CodeConcept<EntryPointCodeConcept<?>, ASTCallStmtNode> {
	
			public String state
			public String standardName
	
			new(EntryPointCodeConcept<?> parent) {
				super(parent)
				// defaults
				state = _parent.paramImport
				standardName = "StandardName"
				parent.setOrAddChild(this)
			}
	
			override name() {
				state + " / " + standardName
			}
	
			override List reverseMultiple() {
				val retList = newArrayList()
				_parent.ASTRef.body.filter(ASTCallStmtNode).filter[c|
					c.subroutineName.eic("NUOPC_Advertise")].forEach[
						var advField = new AdvertiseField(_parent)
						advField.state = it.litArgExprByIdx(0)
						advField.standardName = it.litArgExprByIdx(1)
						advField.setASTRef(it)
						retList.add(advField)	
					]
				retList
			}
	
			override forward() {
	
				var code = 
'''

call NUOPC_Advertise(«paramch(state)», «paramch(standardName)», rc=«_parent.paramRC»)
«ESMFErrorCheck(_parent.paramRC)»
'''
				val IASTListNode<IBodyConstruct> stmts = parseLiteralStatementSequence(code)
				val ASTSubroutineSubprogramNode ssn = _parent.ASTRef
	
				ssn.body.addAll(stmts)
				setASTRef(stmts.get(0) as ASTCallStmtNode)
				this
			}
	
		}
		
		@Label(label="Realize Field")
		@MappingType("call")
		public static class RealizeField extends CodeConcept<EntryPointCodeConcept<?>, ASTCallStmtNode> {

			public String state
			public String field
	
			new(EntryPointCodeConcept<?> parent) {
				super(parent)
				// defaults
				state = _parent.paramImport
				field = "field"
				parent.setOrAddChild(this)
			}
	
			override name() {
				state + " / " + field
			}
	
			override List reverseMultiple() {
				val retList = newArrayList()
				_parent.ASTRef.body.filter(ASTCallStmtNode).filter[c|
					c.subroutineName.eic("NUOPC_Realize")].forEach[
						var relField = new RealizeField(_parent)
						relField.state = it.litArgExprByIdx(0)
						relField.field = it.litArgExprByIdx(1)
						relField.setASTRef(it)
						retList.add(relField)	
					]
				retList
			}
	
			override forward() {	
				var code = 
'''
	
call NUOPC_Realize(«paramch(state)», field=«paramch(field)», rc=«_parent.paramRC»)
«ESMFErrorCheck(_parent.paramRC)»
'''
				val IASTListNode<IBodyConstruct> stmts = parseLiteralStatementSequence(code)
				val ASTSubroutineSubprogramNode ssn = _parent.ASTRef
	
				ssn.body.addAll(stmts)
				super.forward
			}

	}
	*/	
			

	}
	

	@Label(label="Initialize Phase Definition (v00)")
	@Doc(urlfrag="#mediator-initseq")
	public static class IPDv00 extends IPD {

		@Child(min=0)
		@Label(label="IPDv00p0 - Filter Initialization Phases")
		public IPD.IPDv04p0 ipdv00p0
		
		@Child(min=1)
		@Label(label="IPDv00p1 - Advertise Fields")
		public IPD.IPDv04p1 ipdv00p1

		@Child(min=1)
		@Label(label="IPDv00p2 - Realize Fields")
		public IPD.IPDv04p3 ipdv00p2

		@Child
		@Label(label="IPDv00p3 - Verify All Connected & Set Clock")
		public IPD.IPDv04p6 ipdv00p3

		@Child
		@Label(label="IPDv00p4 - Initialize Fields")
		public IPD.IPDv04p7 ipdv00p4

		new(NUOPCMediator.InitPhases parent) {
			super(parent)
		}

		override IPDv00 reverse() {
			ipdv00p0 = new IPD.IPDv04p0(this).reverse as IPD.IPDv04p0
			ipdv00p1 = new IPD.IPDv04p1(this).reverse as IPD.IPDv04p1
			ipdv00p2 = new IPD.IPDv04p3(this).reverse as IPD.IPDv04p3
			ipdv00p3 = new IPD.IPDv04p6(this).reverse as IPD.IPDv04p6
			ipdv00p4 = new IPD.IPDv04p7(this).reverse as IPD.IPDv04p7
			this
		}
		

	}
	
	
	@Label(label="Initialize Phase Definition (v01)")
	@Doc(urlfrag="#mediator-initseq")
	public static class IPDv01 extends IPD {

		@Child(min=0)
		@Label(label="IPDv01p0 - Filter Initialization Phases")
		public IPD.IPDv04p0 ipdv01p0
		
		@Child(min=1)
		@Label(label="IPDv01p1 - Advertise Fields")
		public IPD.IPDv04p1 ipdv01p1

		@Child
		@Label(label="IPDv01p2 - (unspecified by NUOPC)")
		public IPD.IPDv04p2 ipdv01p2

		@Child(min=1)
		@Label(label="IPDv01p3 - Realize Fields")
		public IPD.IPDv04p3 ipdv01p3

		@Child
		@Label(label="IPDv01p4 - Verify All Connected & Set Clock")
		public IPD.IPDv04p6 ipdv01p4
		
		@Child
		@Label(label="IPDv01p5 - Initialize Fields")
		public IPD.IPDv04p7 ipdv01p5

		new(NUOPCMediator.InitPhases parent) {
			super(parent)
		}

		override IPDv01 reverse() {
			ipdv01p0 = new IPD.IPDv04p0(this).reverse as IPD.IPDv04p0
			ipdv01p1 = new IPD.IPDv04p1(this).reverse as IPD.IPDv04p1
			ipdv01p2 = new IPD.IPDv04p2(this).reverse as IPD.IPDv04p2
			ipdv01p3 = new IPD.IPDv04p3(this).reverse as IPD.IPDv04p3
			ipdv01p4 = new IPD.IPDv04p6(this).reverse as IPD.IPDv04p6
			ipdv01p5 = new IPD.IPDv04p7(this).reverse as IPD.IPDv04p7
			this
		}
		
		
	}
		
	@Label(label="Initialize Phase Definition (v02)")
	@Doc(urlfrag="#mediator-initseq")
	public static class IPDv02 extends IPD {
	
		new(NUOPCMediator.InitPhases parent) {
			super(parent)
		}
		
		@Child(min=0)
		@Label(label="IPDv02p0 - Filter Initialization Phases")
		public IPD.IPDv04p0 ipdv02p0
		
		@Child(min=1)
		@Label(label="IPDv02p1 - Advertise Fields")
		public IPD.IPDv04p1 ipdv02p1

		@Child
		@Label(label="IPDv02p2 - Unspecified by NUOPC")
		public IPD.IPDv04p2 ipdv02p2

		@Child(min=1)
		@Label(label="IPDv02p3 - Realize Fields Providing Geom Object")
		public IPD.IPDv04p3 ipdv02p3
		
		@Child
		@Label(label="IPDv02p4 - Verify Connected / Set Clock")
		public IPD.IPDv04p6 ipdv02p4
		
		@Child
		@Label(label="IPDv02p5 - Data Initialize")
		public IPD.IPDv04p7 ipdv02p5
		
		override IPDv02 reverse() {
			ipdv02p0 = new IPD.IPDv04p0(this).reverse as IPD.IPDv04p0
			ipdv02p1 = new IPD.IPDv04p1(this).reverse as IPD.IPDv04p1
			ipdv02p2 = new IPD.IPDv04p2(this).reverse as IPD.IPDv04p2
			ipdv02p3 = new IPD.IPDv04p3(this).reverse as IPD.IPDv04p3
			ipdv02p4 = new IPD.IPDv04p6(this).reverse as IPD.IPDv04p6
			ipdv02p5 = new IPD.IPDv04p7(this).reverse as IPD.IPDv04p7
			this
		}
		
		
		
	}
	
	@Label(label="Initialize Phase Definition (v03)")
	@Doc(urlfrag="#mediator-initseq")
	public static class IPDv03 extends IPD {
	
		new(NUOPCMediator.InitPhases parent) {
			super(parent)
		}
		
		@Child(min=0)
		@Label(label="IPDv03p0 - Filter Initialization Phases")
		public IPD.IPDv04p0 ipdv03p0
		
		@Child(min=1)
		@Label(label="IPDv03p1 - Advertise Fields")
		public IPD.IPDv04p1 ipdv03p1

		@Child
		@Label(label="IPDv03p2 - Unspecified by NUOPC")
		public IPD.IPDv04p2 ipdv03p2

		@Child(min=1)
		@Label(label="IPDv03p3 - Realize Fields Providing Geom Object")
		public IPD.IPDv04p3 ipdv03p3
				
		@Child(min=0)
		@Label(label="IPDv03p4 - Modify Decomposition of Accepted Geom Object")
		public IPD.IPDv04p4 ipdv03p4
		
		@Child(min=1)
		@Label(label="IPDv03p5 - Realize Fields Accepting Geom Object")
		public IPD.IPDv04p5 ipdv03p5

		@Child
		@Label(label="IPDv03p6 - Verify Connected / Set Clock")
		public IPD.IPDv04p6 ipdv03p6
		
		@Child
		@Label(label="IPDv03p7 - Data Initialize")
		public IPD.IPDv04p7 ipdv03p7
		
		override IPDv03 reverse() {
			ipdv03p0 = new IPD.IPDv04p0(this).reverse as IPD.IPDv04p0
			ipdv03p1 = new IPD.IPDv04p1(this).reverse as IPD.IPDv04p1
			ipdv03p2 = new IPD.IPDv04p2(this).reverse as IPD.IPDv04p2
			ipdv03p3 = new IPD.IPDv04p3(this).reverse as IPD.IPDv04p3
			ipdv03p4 = new IPD.IPDv04p4(this).reverse as IPD.IPDv04p4
			ipdv03p5 = new IPD.IPDv04p5(this).reverse as IPD.IPDv04p5
			ipdv03p6 = new IPD.IPDv04p6(this).reverse as IPD.IPDv04p6
			ipdv03p7 = new IPD.IPDv04p7(this).reverse as IPD.IPDv04p7
			this
		}
		
		override validate(List<String> errors) {
			(ipdv03p1 != null && ipdv03p1.validate(errors)) &&
			((ipdv03p3 != null && ipdv03p3.validate(errors)) ||
			(ipdv03p5 != null && ipdv03p5.validate(errors)))
		}
		
		
	}
	
	@Label(label="Initialize Phase Definition (v04)")
	@Doc(urlfrag="#mediator-initseq")
	public static class IPDv04 extends IPD {
	
		new(NUOPCMediator.InitPhases parent) {
			super(parent)
		}
		
		@Child(min=0)
		public IPD.IPDv04p0 ipdv04p0
		
		@Child(min=1)
		public IPD.IPDv04p1 ipdv04p1

		@Child
		public IPD.IPDv04p2 ipdv04p2

		@Child(min=1)
		public IPD.IPDv04p3 ipdv04p3
		
		@Child(min=0)
		public IPD.IPDv04p4 ipdv04p4
		
		@Child(min=1)
		public IPD.IPDv04p5 ipdv04p5

		@Child
		public IPD.IPDv04p6 ipdv04p6
		
		@Child
		public IPD.IPDv04p7 ipdv04p7
		
		override IPDv04 reverse() {
			ipdv04p0 = new IPD.IPDv04p0(this).reverse as IPD.IPDv04p0
			ipdv04p1 = new IPD.IPDv04p1(this).reverse as IPD.IPDv04p1
			ipdv04p2 = new IPD.IPDv04p2(this).reverse as IPD.IPDv04p2
			ipdv04p3 = new IPD.IPDv04p3(this).reverse as IPD.IPDv04p3
			ipdv04p4 = new IPD.IPDv04p4(this).reverse as IPD.IPDv04p4
			ipdv04p5 = new IPD.IPDv04p5(this).reverse as IPD.IPDv04p5
			ipdv04p6 = new IPD.IPDv04p6(this).reverse as IPD.IPDv04p6
			ipdv04p7 = new IPD.IPDv04p7(this).reverse as IPD.IPDv04p7
			this
		}
		
		override validate(List<String> errors) {
			(ipdv04p1 != null && ipdv04p1.validate(errors)) &&
			((ipdv04p3 != null && ipdv04p3.validate(errors)) ||
			(ipdv04p5 != null && ipdv04p5.validate(errors)))
		}
		
		
	}
	
	
	@Label(label="Phases")
	public static class InitPhases extends CodeConcept<Initialization, ASTNode> {
	
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
			parent.setOrAddChild(this)
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
			ipdv00.validate(errors)||
			ipdv01.validate(errors) ||
			ipdv02.validate(errors) ||
			ipdv03.validate(errors) ||
			ipdv04.validate(errors)	
		}
		
	
	}
		
	

	@Label(label="Initialize")
	public static class Initialization extends CodeConcept<NUOPCMediator, ASTNode> {

		@Child
		public InitPhases initPhases
		
		@Child
		public InitSpecializations initSpecs
		
		@Child(min=0)
		public List<CreateUniformGrid> createUniformGrid
		
		new(NUOPCMediator parent) {
			super(parent)
			parent.setOrAddChild(this)
			createUniformGrid = newArrayList()
		}

		override Initialization reverse() {
			reverseChildren
		}

		def reverseChildren() {
			initPhases = new InitPhases(this).reverse as InitPhases
			initSpecs = new InitSpecializations(this).reverse as InitSpecializations
			this
		}
		
		def forward(Mediator high) {
			
			high.grids.filter(UniformGrid).forEach[g|
				val cug = new CreateUniformGrid(this)
				cug.name = '''"«g.name»"'''
				cug.minIndex = g.minIndex.toIntArray
				cug.maxIndex = g.maxIndex.toIntArray
				cug.minCornerCoord = g.minCornerCoord.toDoubleArray
				cug.maxCornerCoord = g.maxCornerCoord.toDoubleArray
				g.staggerLocToFillCoords.forEach[l|
					cug.staggerLocs.add(l.literal)
				]
			]
			
			val IPD ipd = switch (high.IPDVersion) {
				case IP_DV00: new IPDv00(initPhases)
				case IP_DV01: new IPDv01(initPhases)
				case IP_DV02: new IPDv02(initPhases)
				case IP_DV03: new IPDv03(initPhases)
				default: new IPDv04(initPhases)
			}
			
			new IPDv04p0(ipd)
						
			if (high.importFields.size > 0 || high.exportFields.size > 0) {
				val ipdv04p1 = new IPDv04p1(ipd)
				ipdv04p1.forward(high)
				val ipdv04p3 = new IPDv04p3(ipd)
				ipdv04p3.forward(high)
			}
		}

	}
	
	@Label(label="Specializations")
	public static class InitSpecializations extends CodeConcept<Initialization, ASTNode> {
	
		//@Child(min=0)
		//public SetClock setClock

		@Child(min=0)
		public DataInitialize dataInitialize
		
		
		new(Initialization parent) {
			super(parent)
			parent.setOrAddChild(this)
		}
		
		override reverse() {
			//setClock = new SetClock(this).reverse as SetClock
			dataInitialize = new DataInitialize(this).reverse as DataInitialize
			this
		}
		
	}
	

	@Label(label="DataInitialize")
	@MappingType("subroutine")
	@Doc(urlfrag="#mediator-specialization-datainitialize")
	public static class DataInitialize extends SpecializationMethodCodeConcept<InitSpecializations> {

		new(InitSpecializations parent) {
			super(parent, "NUOPC_Mediator", "label_DataInitialize")

			// defaults
			subroutineName = "DataInitialize"
			specLabel = "mediator_label_DataInitialize"
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
	public static class Run extends CodeConcept<NUOPCMediator, ASTNode> {

		@Child
		public RunPhases runPhases
		
		@Child
		public RunSpecializations runSpecs
	
		new(NUOPCMediator parent) {
			super(parent)
			parent.setOrAddChild(this)
		}
		
		override Run reverse() {
			runPhases = new RunPhases(this).reverse as RunPhases
			runSpecs = new RunSpecializations(this).reverse as RunSpecializations
			this
		}
	
	}
	
	
	@Label(label="Specializations")
	public static class RunSpecializations extends CodeConcept<Run, ASTNode> {

		@Child(min=0, max=-1)
		public List<SetRunClock> setRunClock

		@Child(min=0, max=-1)
		public List<CheckImport> checkImport

		@Child(min=1, max=-1)
		public List<MediatorAdvance> mediatorAdvance
		
		@Child(min=0, max=-1)
		public List<TimestampExport> timestampExport

		new(Run parent) {
			super(parent)
			parent.setOrAddChild(this)
			setRunClock = newArrayList()
			checkImport = newArrayList()
			mediatorAdvance = newArrayList()
			timestampExport = newArrayList()
		}

		override reverse() {
			reverseChildren
		}

		def reverseChildren() {
			mediatorAdvance = new MediatorAdvance(this).reverseMultiple
			setRunClock = new SetRunClock(this).reverseMultiple
			checkImport = new CheckImport(this).reverseMultiple
			timestampExport = new TimestampExport(this).reverseMultiple
			this
		}

	}
	
	@Label(label="Phases")
	public static class RunPhases extends CodeConcept<Run, ASTNode> {
	
		@Child
		public RunPhase1 p1
		
		new(Run parent) {
			super(parent)
			parent.setOrAddChild(this)
		}
		
		override RunPhases reverse() {
			p1 = new RunPhase1(this).reverse as RunPhase1
			this
		}
	
	}
	
	@Label(label="Run Phase 1")
	@MappingType("subroutine-inherited")
	@Doc(urlfrag="#mediator-phase-run")
	public static class RunPhase1 extends CodeConcept<RunPhases, ASTNode> {
		new(RunPhases parent) {
			super(parent)
		}
	}	

	@Label(label="Advance")
	@MappingType("subroutine")
	@Doc(urlfrag="#mediator-specialization-advance")
	public static class MediatorAdvance extends SpecializationMethodCodeConcept<RunSpecializations> {

		new(RunSpecializations parent) {
			super(parent, "NUOPC_Mediator", "label_Advance")

			// defaults
			subroutineName = "MediatorAdvance"
			if (parent.mediatorAdvance?.size > 1) {
				subroutineName += parent.mediatorAdvance.size
			}
			specLabel = "mediator_label_Advance"
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
			    call NUOPC_MediatorGet(«paramGridComp», mediatorClock=clock, importState=importState, &
			      exportState=exportState, rc=«paramRC»)
			    «ESMFErrorCheck(paramRC)»
			    
			! advance the mediator
			
				call ESMF_ClockPrint(clock, options="currTime", &
			      preString="------>Advancing «module.name» from: ", rc=«paramRC»)
			    «ESMFErrorCheck(paramRC)»
			
			    call ESMF_ClockPrint(clock, options="stopTime", &
			      preString="--------------------------------> to: ", rc=«paramRC»)
			    «ESMFErrorCheck(paramRC)»
			
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

	@Label(label="SetRunClock")
	@MappingType("subroutine")
	@Doc(urlfrag="#mediator-specialization-setrunclock")
	public static class SetRunClock extends SpecializationMethodCodeConcept<RunSpecializations> {
	
		new(RunSpecializations parent) {
			super(parent, "NUOPC_Mediator", "label_SetRunClock")

			// defaults
			subroutineName = "SetRunClock"
			if (parent.setRunClock?.size > 0) {
				subroutineName += parent.setRunClock.size+1
			}
			specLabel = "mediator_label_SetRunClock"
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
    if (ESMF_LogFoundError(rcToCheck=«paramRC», msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
      
    ! set the component's clock 
    call NUOPC_CompSetClock(gcomp, externalClock=clock, rc=«paramRC»)
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

	@Label(label="CheckImport")
	@MappingType("subroutine")
	@Doc(urlfrag="#mediator-specialization-checkimport")
	public static class CheckImport extends SpecializationMethodCodeConcept<RunSpecializations> {
	
		new(RunSpecializations parent) {
			super(parent, "NUOPC_Mediator", "label_CheckImport")

			// defaults
			subroutineName = "CheckImport"
			if (parent.checkImport?.size > 0) {
				subroutineName += parent.checkImport.size+1
			}
			specLabel = "mediator_label_CheckImport"
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
			_parent._parent._parent
		}

		override setServices() {
			_parent._parent._parent.setServices
		}

		override genericUse() {
			_parent._parent._parent.importNUOPCGeneric
		}

	}
	
	@Label(label="TimestampExport")
	@MappingType("subroutine")
	@Doc(urlfrag="#mediator-specialization-timestampexport")
	public static class TimestampExport extends SpecializationMethodCodeConcept<RunSpecializations> {

		new(RunSpecializations parent) {
			super(parent, "NUOPC_Mediator", "label_TimestampExport")

			// defaults
			subroutineName = "TimestampExport"
			if (parent.timestampExport?.size > 0) {
				subroutineName += parent.timestampExport.size+1
			}
			specLabel = "mediator_label_TimestampExport"
			paramGridComp = "gcomp"
			paramRC = "rc"
		}

		override subroutineTemplate() {
			'''

subroutine «subroutineName»(«paramGridComp», «paramRC»)
    type(ESMF_GridComp)  :: «paramGridComp»
    integer, intent(out) :: «paramRC»
    
    ! local variables
    type(ESMF_Clock)      :: clock
    type(ESMF_State)      :: exportState

    rc = ESMF_SUCCESS
    
    ! The default behavior is to timestamp export fields
    ! to the current time on the clock
    
    ! query the Component for info
    call ESMF_GridCompGet(«paramGridComp», clock=clock, &
      exportState=exportState, rc=«paramRC»)
    if (ESMF_LogFoundError(rcToCheck=«paramRC», msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    ! update timestamp on export Fields
    call NUOPC_UpdateTimestamp(exportState, clock, rc=«paramRC»)
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
		public FinalizeMediator finalize

		new(Finalize parent) {
			super(parent)
		}

		override reverse() {
			reverseChildren
		}

		def reverseChildren() {
			finalize = new FinalizeMediator(this).reverse as FinalizeMediator
			this
		}

	}
	
	@Label(label="Finalize Phase 1")
	@MappingType("subroutine-inherited")
	@Doc(urlfrag="#mediator-phase-finalize")
	public static class FinalizePhase1 extends CodeConcept<FinalizePhases, ASTNode> {
		new(FinalizePhases parent) {
			super(parent)
		}
	}	

	@Label(label="Finalize")
	public static class Finalize extends CodeConcept<NUOPCMediator, ASTNode> {

		@Child
		public FinalizePhases finalPhases
		
		@Child
		public FinalizeSpecializations finalSpecs

		new(NUOPCMediator parent) {
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
	
	@Label(label="FinalizeMediator")
	@MappingType("subroutine")
	@Doc(urlfrag="#mediator-specialization-finalize")
	public static class FinalizeMediator extends SpecializationMethodCodeConcept<FinalizeSpecializations> {

		new(FinalizeSpecializations parent) {
			super(parent, "NUOPC_Mediator", "label_Finalize")

			// defaults
			subroutineName = "FinalizeMediator"
			specLabel = "mediator_label_Finalize"
			paramGridComp = "gcomp"
			paramRC = "rc"
		}

		override subroutineTemplate() {
			'''

subroutine «subroutineName»(«paramGridComp», «paramRC»)
    type(ESMF_GridComp)  :: «paramGridComp»
    integer, intent(out) :: «paramRC»

    rc = ESMF_SUCCESS
    
    ! finalize model

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
	