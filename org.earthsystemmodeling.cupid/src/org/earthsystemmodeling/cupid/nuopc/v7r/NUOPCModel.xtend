package org.earthsystemmodeling.cupid.nuopc.v7r

import java.util.List
import org.earthsystemmodeling.cupid.NUOPC.Field
import org.earthsystemmodeling.cupid.NUOPC.Grid
import org.earthsystemmodeling.cupid.NUOPC.Model
import org.earthsystemmodeling.cupid.NUOPC.UniformGrid
import org.earthsystemmodeling.cupid.annotation.Child
import org.earthsystemmodeling.cupid.annotation.Doc
import org.earthsystemmodeling.cupid.annotation.Label
import org.earthsystemmodeling.cupid.annotation.MappingType
import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import org.earthsystemmodeling.cupid.nuopc.ReverseEngineerException
import org.earthsystemmodeling.cupid.nuopc.v7r.GridCodeConcept.CreateUniformGrid
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCBaseModel.AdvertiseField
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCBaseModel.RealizeField
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCModel.IPD.IPDv04p0
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCModel.IPD.IPDv04p1
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCModel.IPD.IPDv04p3
import org.eclipse.core.resources.IResource
import org.eclipse.photran.internal.core.parser.ASTNode
import org.eclipse.xtend.lib.annotations.Accessors

import static org.earthsystemmodeling.cupid.nuopc.ESMFCodeTemplates.*
import org.earthsystemmodeling.cupid.NUOPC.IPDVersion
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException
import org.earthsystemmodeling.cupid.core.CupidActivator
import org.apache.commons.io.IOUtils
import java.nio.charset.StandardCharsets

@Label(label="NUOPC Model")
@MappingType("module")
//@Doc(urlfrag="#model-top")
@Doc(urlfrag="node4.html#SECTION00043000000000000000")
class NUOPCModel extends NUOPCComponent {

	@Child(min=0)
	public DoxygenTemplate doc
	
	@Child(forward=true)
	public SetServices setServices
	
	@Child(forward=true)
	public Initialization initialization

	@Child
	public Run run

	@Child
	public Finalize finalize

	
	new(IResource context) {
		super(null, context, "NUOPC_Model")
	}

	static def newModel(IResource context, Model high) {
		val m = newBasicModel(context)
		m.forward(high)
		m
	}
	
	public static def newBasicModel(IResource context) {
		val model = new NUOPCModel(context)
		new DoxygenTemplate(model)
		new SetServices(model)
		new Initialization(model)
		new InitPhases(model.initialization)
		new InitSpecializations(model.initialization)
		new Run(model)
		new RunPhases(model.run)
		new RunSpecializations(model.run)
		//new ModelAdvance(model.run.runSpecs)
		new Finalize(model)
		new FinalizePhases(model.finalize)
		new FinalizeSpecializations(model.finalize)
		model
	}
	
	def forward(Model high) {
		name = high.name
		setServices.forward(high)
		initialization.forward(high)
		run.forward(high)
	}

	override prefix() { "model" }

	override NUOPCModel reverse() throws ReverseEngineerException {
		super.reverse as NUOPCModel
	}

	override reverseChildren() {
		doc = new DoxygenTemplate(this).reverse
		setServices = new SetServices(this).reverse as SetServices
		initialization = new Initialization(this).reverse
		run = new Run(this).reverse
		finalize = new Finalize(this).reverse
		this
	}

	override NUOPCModel forward() {
		super.forward as NUOPCModel
	}

	@Label(label="Doxygen Template")
	public static class DoxygenTemplate extends CodeConcept<NUOPCModel, ASTModuleNode> {
	
		new(NUOPCModel parent) {
			super(parent)
			parent.setOrAddChild(this)
		}
		
		override <T extends CodeConcept<?, ?>> reverse() throws ReverseEngineerException {
			//super.<T>reverse()
			val moduleNode =_parent.ASTRef
			if (moduleNode?.findFirstToken?.whiteBefore.contains("!>")) {
				this as T
			}
			else {
				null	
			}	
		}
		
		override <T extends CodeConcept<?, ?>> forward() throws CodeGenerationException {
			val moduleNode = _parent.ASTRef
			if (moduleNode == null) return this as T
			
			val whiteBefore = moduleNode?.findFirstToken?.whiteBefore
			var newWhite = ""
			if (whiteBefore != null) {
				newWhite = whiteBefore
			}
			val is = CupidActivator.getInputStream("templates/doxygen/capdoc.template");
			val doctemplate = IOUtils.toString(is, StandardCharsets.UTF_8)
			newWhite += doctemplate			
			moduleNode.findFirstToken?.setWhiteBefore(newWhite)
			this as T
		}
		
	}

	@Label(label="SetServices")
	@MappingType("subroutine")
	//@Doc(urlfrag="#model-setservices")
	public static class SetServices extends SetServicesCodeConcept<NUOPCModel> {	
		new(NUOPCModel parent) {
			super(parent)
			parent.setOrAddChild(this)
		}		
	}
	
	
	@Label(label="Initialize Phase Definition")
	public static abstract class IPD extends CodeConcept<NUOPCModel.InitPhases, ASTNode> {

		new(NUOPCModel.InitPhases parent) {
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
		//@Doc(urlfrag="#model-phase-advertisefields")
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
			
			def forward(Model high) {
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
		
		@Label(label="IPDv04p2 - Unspecified by NUOPC")
		@MappingType("subroutine-inherited")
		//@Doc(urlfrag="#model-initseq")
		public static class IPDv04p2 extends CodeConcept<IPD, ASTNode> {
			new(IPD parent) {
				super(parent)
			}
		}		

		@Label(label="IPDv04p3 - Realize Fields Providing Geom Object")
		@MappingType("subroutine")
		//@Doc(urlfrag="#model-phase-realizefieldsproviding")
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
			
			
			def forward(Model high) {
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
		//@Doc(urlfrag="#model-phase-modifydecomp")
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
		//@Doc(urlfrag="#model-phase-realizefieldsaccepting")
		public static class IPDv04p5 extends EntryPointCodeConcept<IPD> {
			
			@Child(min=0, max=-1)
			public List<RealizeField> realizeFields
			
			new(IPD parent) {
				super(parent)
				phaseLabel = getPhaseLabel()
				subroutineName = "RealizeFieldsAcceptingGrid"
				methodType = "ESMF_METHOD_INITIALIZE"
				parent.setOrAddChild(this)
				realizeFields = newArrayList()
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
		//@Doc(urlfrag="#model-phase-verifyimports")
		public static class IPDv04p6 extends CodeConcept<IPD, ASTNode> {
			new(IPD parent) {
				super(parent)
			}
		}	

		@Label(label="IPDv04p7 - Data Initialize")
		@MappingType("subroutine-inherited")
		//@Doc(urlfrag="#model-phase-initexport")
		public static class IPDv04p7 extends CodeConcept<IPD, ASTNode> {
			new(IPD parent) {
				super(parent)
			}
		}	

	}
	

	@Label(label="Initialize Phase Definition (v00)")
	//@Doc(urlfrag="#model-initseq")
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

		new(NUOPCModel.InitPhases parent) {
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
	//@Doc(urlfrag="#model-initseq")
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

		new(NUOPCModel.InitPhases parent) {
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
	//@Doc(urlfrag="#model-initseq")
	public static class IPDv02 extends IPD {
	
		new(NUOPCModel.InitPhases parent) {
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
	//@Doc(urlfrag="#model-initseq")
	public static class IPDv03 extends IPD {
	
		new(NUOPCModel.InitPhases parent) {
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
	//@Doc(urlfrag="#model-initseq")
	public static class IPDv04 extends IPD {
	
		new(NUOPCModel.InitPhases parent) {
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
	
		@Child(forward=true)
		public IPDv00 ipdv00
		
		@Child(forward=true)
		public IPDv01 ipdv01
		
		@Child(forward=true)
		public IPDv02 ipdv02
		
		@Child(forward=true)
		public IPDv03 ipdv03
		
		@Child(forward=true)
		public IPDv04 ipdv04
	
		new(Initialization parent) {
			super(parent)
			parent.setOrAddChild(this)
		}
		
		override InitPhases reverse() {
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
		
	

	@Label(label="Initialize")
	public static class Initialization extends CodeConcept<NUOPCModel, ASTNode> {

		@Child(forward=true)
		public InitPhases initPhases
		
		@Child(forward=true)
		public InitSpecializations initSpecs
		
		@Child(min=0)
		public List<CreateUniformGrid> createUniformGrid
		
		new(NUOPCModel parent) {
			super(parent)
			parent.setOrAddChild(this)
			createUniformGrid = newArrayList()
		}

		override Initialization reverse() {
			reverseChildren
		}

		def reverseChildren() {
			initPhases = new InitPhases(this).reverse
			initSpecs = new InitSpecializations(this).reverse
			//createUniformGrid = new CreateUniformGrid(this).reverse
			this
		}
		
		def forward(Model high) {
			
			new InitSpecializations(this)
			
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
			
			//assuming IPDv04 for now
			//if (high.IPDVersion != IPDVersion.IP_DV01)
			//	throw new CodeGenerationException("Only initialize version IPDv01 currently supported")
			
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
			
			//DataInitialize required for IPDv02 or higher
			if (high.IPDVersion == IPDVersion.IP_DV02 ||
				high.IPDVersion == IPDVersion.IP_DV03 ||
				high.IPDVersion == IPDVersion.IP_DV04) {
			
				val dataInit = new DataInitialize(initSpecs)
				dataInit.forward(high)
					
			}
			
		}

	}
	
			
	@Label(label="Specializations")
	public static class InitSpecializations extends CodeConcept<Initialization, ASTNode> {
	
		@Child(min=0)
		public SetClock setClock

		@Child(min=0)
		public DataInitialize dataInitialize
		
		
		new(Initialization parent) {
			super(parent)
			parent.setOrAddChild(this)
		}
		
		override InitSpecializations reverse() {
			setClock = new SetClock(this).reverse as SetClock
			dataInitialize = new DataInitialize(this).reverse as DataInitialize
			this
		}
		
	}
	


	@Label(label="SetClock")
	@MappingType("subroutine")
	//@Doc(urlfrag="#model-specialization-setclock")
	public static class SetClock extends SpecializationMethodCodeConcept<InitSpecializations> {

		new(InitSpecializations parent) {
			super(parent, "NUOPC_Model", "label_SetClock")

			// defaults
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
			_parent._parent._parent
		}

		override setServices() {
			_parent._parent._parent.setServices
		}

		override genericUse() {
			_parent._parent._parent.importNUOPCGeneric
		}

	}

	@Label(label="DataInitialize")
	@MappingType("subroutine")
	//@Doc(urlfrag="#model-specialization-datainitialize")
	public static class DataInitialize extends SpecializationMethodCodeConcept<InitSpecializations> {

		List<String> exportFieldsToInit
		
		new(InitSpecializations parent) {
			super(parent, "NUOPC_Model", "label_DataInitialize")

			exportFieldsToInit = newArrayList()
			
			// defaults
			subroutineName = "DataInitialize"
			specLabel = "model_label_DataInitialize"
			paramGridComp = "gcomp"
			paramRC = "rc"
		}
	
		def forward(Model high) {
			high.exportFields.forEach[f|
				exportFieldsToInit.add(f.name)
			]
		}

		override subroutineTemplate() {
			'''

subroutine «subroutineName»(«paramGridComp», «paramRC»)
    type(ESMF_GridComp)  :: «paramGridComp»
    integer, intent(out) :: «paramRC»

	type(ESMF_State) :: exportState
	type(ESMF_Field) :: field
	
    rc = ESMF_SUCCESS
    
    ! query the Component for its clock, importState and exportState
    call NUOPC_ModelGet(«paramGridComp», exportState=exportState, & 
        rc=«paramRC»)
    «ESMFErrorCheck(paramRC)»
    
    ! initialize export fields here and mark as updated
    «FOR f : exportFieldsToInit SEPARATOR '\n'»
    call ESMF_StateGet(exportState, field=field, itemName="«f»", rc=«paramRC»)
    «ESMFErrorCheck(paramRC)»
    call NUOPC_SetAttribute(field, name="Updated", & 
        value="true", rc=«paramRC»)
    «ESMFErrorCheck(paramRC)»
    «ENDFOR»
    
    ! when all export fields are initialized, mark as complete
    call NUOPC_CompAttributeSet(«paramGridComp», name="InitializeDataComplete", &
    	value="true", rc=«paramRC»)
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

	@Label(label="Run")
	public static class Run extends CodeConcept<NUOPCModel, ASTNode> {

		@Child
		public RunPhases runPhases
		
		@Child
		public RunSpecializations runSpecs
	
		new(NUOPCModel parent) {
			super(parent)
			parent.setOrAddChild(this)
		}
		
		override Run reverse() {
			runPhases = new RunPhases(this).reverse as RunPhases
			runSpecs = new RunSpecializations(this).reverse as RunSpecializations
			this
		}
		
		def forward(Model high) {
			runSpecs.forward(high)
		}
	
	}
	
	
	@Label(label="Specializations")
	public static class RunSpecializations extends CodeConcept<Run, ASTNode> {

		@Child(min=0, max=-1)
		public List<SetRunClock> setRunClock

		@Child(min=0, max=-1)
		public List<CheckImport> checkImport

		@Child(min=1, max=-1)
		public List<ModelAdvance> modelAdvance

		new(Run parent) {
			super(parent)
			parent.setOrAddChild(this)
			setRunClock = newArrayList()
			checkImport = newArrayList()
			modelAdvance = newArrayList()
		}

		override reverse() {
			reverseChildren
		}

		def reverseChildren() {
			modelAdvance = new ModelAdvance(this).reverseMultiple
			setRunClock = new SetRunClock(this).reverseMultiple
			checkImport = new CheckImport(this).reverseMultiple
			this
		}
		
		def forward(Model high) {
			high.advance.forEach[a|
				val adv = new ModelAdvance(this)
				if (!a.phaseLabel.nullOrEmpty) {
					adv.specPhaseLabel = "\"" + a.phaseLabel + "\"";
				}
			]
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
	//@Doc(urlfrag="#model-phase-run")
	public static class RunPhase1 extends CodeConcept<RunPhases, ASTNode> {
		new(RunPhases parent) {
			super(parent)
		}
	}	
	

	@Label(label="Advance")
	@MappingType("subroutine")
	//@Doc(urlfrag="#model-specialization-advance")
	public static class ModelAdvance extends SpecializationMethodCodeConcept<RunSpecializations> {

		new(RunSpecializations parent) {
			super(parent, "NUOPC_Model", "label_Advance")
			parent.setOrAddChild(this)

			// defaults
			subroutineName = "ModelAdvance"
			if (parent.modelAdvance?.size > 1) {
				subroutineName += parent.modelAdvance.size
			}
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
			    call NUOPC_ModelGet(«paramGridComp», modelClock=clock, importState=importState, &
			      exportState=exportState, rc=«paramRC»)
			    «ESMFErrorCheck(paramRC)»
			    
			! advance the model: currTime -> currTime + timeStep
			
				call ESMF_ClockPrint(clock, options="currTime", &
			      preString="------>Advancing «module.name» from: ", rc=«paramRC»)
			    «ESMFErrorCheck(paramRC)»
			
			    call ESMF_ClockPrint(clock, options="stopTime", &
			      preString="--------------------------------> to: ", rc=«paramRC»)
			    «ESMFErrorCheck(paramRC)»
			
			end subroutine
			'''
		}

		override NUOPCComponent module() {
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
	//@Doc(urlfrag="#model-specialization-setrunclock")
	public static class SetRunClock extends SpecializationMethodCodeConcept<RunSpecializations> {

		new(RunSpecializations parent) {
			super(parent, "NUOPC_Model", "label_SetRunClock")

			// defaults
			subroutineName = "SetRunClock"
			if (parent.setRunClock?.size > 1) {
				subroutineName += parent.setRunClock.size
			}
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
	//@Doc(urlfrag="#model-specialization-checkimport")
	public static class CheckImport extends SpecializationMethodCodeConcept<RunSpecializations> {

		new(RunSpecializations parent) {
			super(parent, "NUOPC_Model", "label_CheckImport")

			// defaults
			subroutineName = "CheckImport"
			if (parent.checkImport?.size > 1) {
				subroutineName += parent.checkImport.size
			}
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
		public FinalizeModel finalize

		new(Finalize parent) {
			super(parent)
		}

		override reverse() {
			reverseChildren
		}

		def reverseChildren() {
			finalize = new FinalizeModel(this).reverse as FinalizeModel
			this
		}

	}
	
	@Label(label="Finalize Phase 1")
	@MappingType("subroutine-inherited")
	//@Doc(urlfrag="#model-phase-finalize")
	public static class FinalizePhase1 extends CodeConcept<FinalizePhases, ASTNode> {
		new(FinalizePhases parent) {
			super(parent)
		}
	}	

	@Label(label="Finalize")
	public static class Finalize extends CodeConcept<NUOPCModel, ASTNode> {

		@Child
		public FinalizePhases finalPhases
		
		@Child
		public FinalizeSpecializations finalSpecs

		new(NUOPCModel parent) {
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
	
	@Label(label="FinalizeModel")
	@MappingType("subroutine")
	//@Doc(urlfrag="#model-specialization-finalize")
	public static class FinalizeModel extends SpecializationMethodCodeConcept<FinalizeSpecializations> {

		new(FinalizeSpecializations parent) {
			super(parent, "NUOPC_Model", "label_Finalize")

			// defaults
			subroutineName = "FinalizeModel"
			specLabel = "model_label_Finalize"
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
	