package org.earthsystemmodeling.cupid.nuopc.v7r

import java.util.List
import org.earthsystemmodeling.cupid.NUOPC.Field
import org.earthsystemmodeling.cupid.NUOPC.Model
import org.earthsystemmodeling.cupid.NUOPC.UniformGrid
import org.earthsystemmodeling.cupid.annotation.Child
import org.earthsystemmodeling.cupid.annotation.Doc
import org.earthsystemmodeling.cupid.annotation.Label
import org.earthsystemmodeling.cupid.annotation.MappingType
import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import org.earthsystemmodeling.cupid.nuopc.v7r.GridCodeConcept.CreateUniformGrid
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCModel.IPD.IPDv04p1
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCModel.IPD.IPDv04p3
import org.eclipse.core.resources.IResource
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.eclipse.photran.internal.core.parser.ASTNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.eclipse.photran.internal.core.parser.ASTTypeDeclarationStmtNode
import org.eclipse.photran.internal.core.parser.IASTListNode
import org.eclipse.photran.internal.core.parser.IBodyConstruct
import org.eclipse.photran.internal.core.parser.IDeclarationConstruct

import static org.earthsystemmodeling.cupid.nuopc.ESMFCodeTemplates.*
import static org.earthsystemmodeling.cupid.util.CodeExtraction.*

import static extension org.earthsystemmodeling.cupid.nuopc.ASTQuery.*
import static extension org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCModel.*
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException
import org.eclipse.xtend.lib.annotations.Accessors
import org.earthsystemmodeling.cupid.NUOPC.Grid
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCBaseModel.RealizeField
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCBaseModel.AdvertiseField

@Label(label="NUOPC Model")
@MappingType("module")
@Doc(urlfrag="#model-top")
class NUOPCModel extends NUOPCComponent {

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
	
	static def newBasicModel(IResource context) {
		val model = new NUOPCModel(context)
		new SetServices(model)
		new Initialization(model)
		new InitPhases(model.initialization)
		new InitSpecializations(model.initialization)
		new Run(model)
		new RunPhases(model.run)
		new RunSpecializations(model.run)
		new ModelAdvance(model.run.runSpecs)
		new Finalize(model)
		new FinalizePhases(model.finalize)
		new FinalizeSpecializations(model.finalize)
		model
	}
	
	def forward(Model high) {
		name = high.name
		initialization.forward(high)
	}

	override prefix() { "model" }

	override NUOPCModel reverse() {
		super.reverse as NUOPCModel
	}

	override reverseChildren() {
		setServices = new SetServices(this).reverse as SetServices
		initialization = new Initialization(this).reverse
		run = new Run(this).reverse
		finalize = new Finalize(this).reverse
		this
	}

	override NUOPCModel forward() {
		super.forward as NUOPCModel
	}

	@Label(label="SetServices")
	@MappingType("subroutine")
	@Doc(urlfrag="#model-setservices")
	public static class SetServices extends SetServicesCodeConcept<NUOPCModel> {	
		new(NUOPCModel parent) {
			super(parent)
		}		
	}
	
	
	@Label(label="Initialize Phase Definition")
	public static abstract class IPD extends CodeConcept<NUOPCModel.InitPhases, ASTNode> {

		new(NUOPCModel.InitPhases parent) {
			super(parent)
			parent.setOrAddChild(this)
		}
		
		@Label(label="IPDv04p1 - Advertise Fields")
		@MappingType("subroutine")
		@Doc(urlfrag="#model-phase-advertisefields")
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
					af.state = paramImport
				}
				for (Field f : high.exportFields) {
					val af = new AdvertiseField(this)
					af.standardName = '''"«f.standardName»"'''
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
		@Doc(urlfrag="#model-initseq")
		public static class IPDv04p2 extends CodeConcept<IPD, ASTNode> {
			new(IPD parent) {
				super(parent)
			}
		}		

		@Label(label="IPDv04p3 - Realize Fields Providing Geom Object")
		@MappingType("subroutine")
		@Doc(urlfrag="#model-phase-realizefieldsproviding")
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
				
			
			
			/*
			override IPDv04p3 forward() {
				
				//generate subroutine template
				super.forward
				
				for (String gridName : grids) {
					addTypeDeclaration('''type(ESMF_Grid) :: «gridName»''', getASTRef)
				}

				for (String gridName : grids) {
					val code = '''
					
					«gridName» = CreateGrid_«gridName»(rc=«paramRC»)
					«ESMFErrorCheck(paramRC)»
					'''
					val IASTListNode<IBodyConstruct> stmts = parseLiteralStatementSequence(code)
					getASTRef.body.addAll(stmts)
				}
				
				this
				
			}
			*/
			
			
			
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
		@Doc(urlfrag="#model-phase-modifydecomp")
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
		@Doc(urlfrag="#model-phase-verifyimports")
		public static class IPDv04p6 extends CodeConcept<IPD, ASTNode> {
			new(IPD parent) {
				super(parent)
			}
		}	

		@Label(label="IPDv04p7 - Data Initialize")
		@MappingType("subroutine-inherited")
		@Doc(urlfrag="#model-phase-initexport")
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
			public String grid
			public String fieldName
	
			new(EntryPointCodeConcept<?> parent) {
				super(parent)
				parent.setOrAddChild(this)
				state = _parent.paramImport
				field = "field"
				grid = "grid"
				fieldName = "\"field_name\""
			}
	
			override name() {
				state + " / " + fieldName
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
				
				if (field == null || fieldName == null || grid == null || state == null) {
					throw new CodeGenerationException("Missing parameters required to generate Realize Field.")
				}
				
				val ASTSubroutineSubprogramNode ssn = _parent.ASTRef
								
				addTypeDeclaration('''type(ESMF_Field) :: «field»''', ssn)
								
				var code = 
'''

! field «fieldName»
«field» = ESMF_FieldCreate(name=«fieldName», grid=«grid», &
      typekind=ESMF_TYPEKIND_R8, rc=«_parent.paramRC»)
«ESMFErrorCheck(_parent.paramRC)»
	
call NUOPC_Realize(«paramch(state)», field=«paramch(field)», rc=«_parent.paramRC»)
«ESMFErrorCheck(_parent.paramRC)»
'''
				val IASTListNode<IBodyConstruct> stmts = parseLiteralStatementSequence(code)
					
				ssn.body.addAll(stmts)
				super.forward
			}
			
			def forward(Field high, String state) {
				fieldName = "\"" + high.standardName + "\""
				field = high.name
				grid = high.grid.name
				this.state = state
			}
	
		}
		*/
		
		
			

	}
	

	@Label(label="Initialize Phase Definition (v00)")
	@Doc(urlfrag="#model-initseq")
	public static class IPDv00 extends IPD {

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
			ipdv00p1 = new IPD.IPDv04p1(this).reverse as IPD.IPDv04p1
			ipdv00p2 = new IPD.IPDv04p3(this).reverse as IPD.IPDv04p3
			ipdv00p3 = new IPD.IPDv04p6(this).reverse as IPD.IPDv04p6
			ipdv00p4 = new IPD.IPDv04p7(this).reverse as IPD.IPDv04p7
			this
		}
		

	}
	
	
	@Label(label="Initialize Phase Definition (v01)")
	@Doc(urlfrag="#model-initseq")
	public static class IPDv01 extends IPD {

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
			ipdv01p1 = new IPD.IPDv04p1(this).reverse as IPD.IPDv04p1
			ipdv01p2 = new IPD.IPDv04p2(this).reverse as IPD.IPDv04p2
			ipdv01p3 = new IPD.IPDv04p3(this).reverse as IPD.IPDv04p3
			ipdv01p4 = new IPD.IPDv04p6(this).reverse as IPD.IPDv04p6
			ipdv01p5 = new IPD.IPDv04p7(this).reverse as IPD.IPDv04p7
			this
		}
		
		
	}
		
	@Label(label="Initialize Phase Definition (v02)")
	@Doc(urlfrag="#model-initseq")
	public static class IPDv02 extends IPD {
	
		new(NUOPCModel.InitPhases parent) {
			super(parent)
		}
		
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
			ipdv02p1 = new IPD.IPDv04p1(this).reverse as IPD.IPDv04p1
			ipdv02p2 = new IPD.IPDv04p2(this).reverse as IPD.IPDv04p2
			ipdv02p3 = new IPD.IPDv04p3(this).reverse as IPD.IPDv04p3
			ipdv02p4 = new IPD.IPDv04p6(this).reverse as IPD.IPDv04p6
			ipdv02p5 = new IPD.IPDv04p7(this).reverse as IPD.IPDv04p7
			this
		}
		
		
		
	}
	
	@Label(label="Initialize Phase Definition (v03)")
	@Doc(urlfrag="#model-initseq")
	public static class IPDv03 extends IPD {
	
		new(NUOPCModel.InitPhases parent) {
			super(parent)
		}
		
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
	@Doc(urlfrag="#model-initseq")
	public static class IPDv04 extends IPD {
	
		new(NUOPCModel.InitPhases parent) {
			super(parent)
		}
		
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
			
			high.grids.filter(UniformGrid).forEach[g|
				val cug = new CreateUniformGrid(this)
				cug.name = '''"«g.name»"'''
				cug.minIndex = g.minIndex.toIntArray
				cug.maxIndex = g.maxIndex.toIntArray
				cug.minCornerCoord = g.minCornerCoord.toDoubleArray
				cug.maxCornerCoord = g.maxCornerCoord.toDoubleArray
			]
			
			if (high.importFields.size > 0 || high.exportFields.size > 0) {
				val ipdv04 = new IPDv04(initPhases)
				val ipdv04p1 = new IPDv04p1(ipdv04)
				ipdv04p1.forward(high)
				val ipdv04p3 = new IPDv04p3(ipdv04)
				ipdv04p3.forward(high)
			}
		}

	}
	
	def static toIntArray(List<Integer> intList) {
		val toRet = newIntArrayOfSize(intList.size)
		for (var i=0; i < intList.size; i++) {
			toRet.set(i, intList.get(i))
		}
		toRet
	}
	
	def static toDoubleArray(List<Double> dblList) {
		var toRet = newDoubleArrayOfSize(dblList.size)
		for (var i=0; i < dblList.size; i++) {
			toRet.set(i, dblList.get(i))
		}
		toRet
	}
		
	@Label(label="Specializations")
	public static class InitSpecializations extends CodeConcept<Initialization, ASTNode> {
	
		@Child(min=0)
		public SetClock setClock

		@Child(min=0)
		public DataInitialize dataInitialize
		
		
		new(Initialization parent) {
			super(parent)
		}
		
		override InitSpecializations reverse() {
			setClock = new SetClock(this).reverse as SetClock
			dataInitialize = new DataInitialize(this).reverse as DataInitialize
			this
		}
		
	}
	


	@Label(label="SetClock")
	@MappingType("subroutine")
	@Doc(urlfrag="#model-specialization-setclock")
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
	@Doc(urlfrag="#model-specialization-datainitialize")
	public static class DataInitialize extends SpecializationMethodCodeConcept<InitSpecializations> {

		new(InitSpecializations parent) {
			super(parent, "NUOPC_Model", "label_DataInitialize")

			// defaults
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
	@Doc(urlfrag="#model-phase-run")
	public static class RunPhase1 extends CodeConcept<RunPhases, ASTNode> {
		new(RunPhases parent) {
			super(parent)
		}
	}	

	@Label(label="Advance")
	@MappingType("subroutine")
	@Doc(urlfrag="#model-specialization-advance")
	public static class ModelAdvance extends SpecializationMethodCodeConcept<RunSpecializations> {

		new(RunSpecializations parent) {
			super(parent, "NUOPC_Model", "label_Advance")
			parent.setOrAddChild(this)

			// defaults
			subroutineName = "ModelAdvance"
			if (parent.modelAdvance?.size > 0) {
				subroutineName += parent.modelAdvance.size+1
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
    call ESMF_GridCompGet(«paramGridComp», clock=clock, importState=importState, &
        exportState=exportState, rc=«paramRC»)
    if (ESMF_LogFoundError(rcToCheck=«paramRC», msg=ESMF_LOGERR_PASSTHRU, &
        line=__LINE__, &
        file=__FILE__)) &
        return  ! bail out

    ! advance the model: currTime -> currTime + timeStep

	call ESMF_ClockPrint(clock, options="currTime", &
      preString="------>Advancing «_parent._parent._parent.name» from: ", rc=«paramRC»)
    if (ESMF_LogFoundError(rcToCheck=«paramRC», msg=ESMF_LOGERR_PASSTHRU, &
        line=__LINE__, &
        file=__FILE__)) &
        return  ! bail out

    call ESMF_ClockPrint(clock, options="stopTime", &
      preString="--------------------------------> to: ", rc=«paramRC»)
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

	@Label(label="SetRunClock")
	@MappingType("subroutine")
	@Doc(urlfrag="#model-specialization-setrunclock")
	public static class SetRunClock extends SpecializationMethodCodeConcept<RunSpecializations> {

		new(RunSpecializations parent) {
			super(parent, "NUOPC_Model", "label_SetRunClock")

			// defaults
			subroutineName = "SetRunClock"
			if (parent.setRunClock?.size > 0) {
				subroutineName += parent.setRunClock.size+1
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
	@Doc(urlfrag="#model-specialization-checkimport")
	public static class CheckImport extends SpecializationMethodCodeConcept<RunSpecializations> {

		new(RunSpecializations parent) {
			super(parent, "NUOPC_Model", "label_CheckImport")

			// defaults
			subroutineName = "CheckImport"
			if (parent.checkImport?.size > 0) {
				subroutineName += parent.checkImport.size+1
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
	@Doc(urlfrag="#model-phase-finalize")
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
	@Doc(urlfrag="#model-specialization-finalize")
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
	