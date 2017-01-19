package org.earthsystemmodeling.cupid.cc.nuopc

import org.earthsystemmodeling.cupid.cc.CodeConcept
import org.earthsystemmodeling.cupid.cc.CodeConceptTemplate
import org.earthsystemmodeling.cupid.cc.fortran.FortranMappingTypes
import org.earthsystemmodeling.cupid.cc.mapping.MappingType
import org.earthsystemmodeling.cupid.nuopc.ESMFCodeTemplates
import org.eclipse.photran.core.IFortranAST
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.eclipse.photran.internal.core.parser.IASTListNode
import org.eclipse.photran.internal.core.parser.IBodyConstruct

import static org.earthsystemmodeling.cupid.cc.fortran.FortranMappingTypes.*
import static org.earthsystemmodeling.cupid.util.CodeExtraction.*

import static extension org.earthsystemmodeling.cupid.nuopc.ASTQuery.*
import static extension org.earthsystemmodeling.cupid.nuopc.ESMFQuery.*
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance

class NUOPC {
    
    static NUOPC instance
    //static FortranMappingTypes FMT
    
    /* mapping types */
    public MappingType SetServicesMT
    public MappingType ESMFMethodMT
    public MappingType SpecializationMethodMT  /* refines ESMFMethodMT */
    
    /* concepts */   
    public CodeConcept NUOPCComponent
    public CodeConcept NUOPCDriver
    public CodeConcept SetServices
    
    
    //public BootstrapCodeConcept NUOPCDriverFromFile
    
    def static getInstance() {
        if (instance == null) {
            instance = new NUOPC
        }
        instance
    }
    
    protected new() {
        
        //required to initialize static members
        FortranMappingTypes.instance
               
        ESMFMethodMT = new MappingType("ESMFMethodMT", ASTModuleNode, ASTSubroutineSubprogramNode,
        	  #{"name" -> String, "gcomp" -> String, "rc" -> String}) => [
            
            find = [bind|
                val ASTModuleNode module = bind.context
                module.findESMFMethods.forEach[m|
                    //result.addMatch(m).put("name", m.subroutineStmt.subroutineName.subroutineName.text)
                    bind.addResult(m)  
                ]
            ]
                       
            forwardAdd = [b|
            	val ASTModuleNode module = b.context
            	val code = b.fill('''
					
					subroutine {name}({gcomp}, {rc})
					    type(ESMF_GridComp)  :: {gcomp}
					    integer, intent(out) :: {rc}
					
					    rc = ESMF_SUCCESS
					
					end subroutine
				''')
				
				var ASTSubroutineSubprogramNode ssn = parseLiteralProgramUnit(code)
				module.getModuleBody().add(ssn)
				b.match = ssn
            ]
            
        ]       
        
        SpecializationMethodMT = ESMFMethodMT.refine(
            #{"SetServices" -> CodeConceptInstance,
              "specLabel" -> String,
              "specPhaseLabel" -> String,
              "labelComponent" -> String, 
              "labelName" -> String}) => [
            
            find = [bind|
                
                //a refinement - result contains result of super mapping type
                val ASTModuleNode module = bind.context
                val ASTSubroutineSubprogramNode setServicesNode = (bind.getValue("SetServices") as CodeConceptInstance).match as ASTSubroutineSubprogramNode

                bind.resultSet.<ASTSubroutineSubprogramNode>removeMatchIf[m|m == setServicesNode]
                bind.resultSet.<ASTSubroutineSubprogramNode>retainMatchIf[m|
                    setServicesNode.body.filter(ASTCallStmtNode).
                        exists[                        
                            it.subroutineName.eic("NUOPC_CompSpecialize") &&
                            it.litArgExprByKeyword("specRoutine")?.eic(m.subroutineStmt.subroutineName.subroutineName) &&
                            it.litArgExprByKeyword("specLabel")?.eic(
                                module.localName(bind.getValue("labelComponent"), 
                                                     bind.getValue("labelName"))
                            )]
                ]
                
            ]
            
            forwardAdd = [bind|
            	//super type already did its work, so the subroutine
            	//has been defined, still need to add registration call
            	
            	val ASTModuleNode moduleNode = bind.context
            	//TODO: should we allow this?
            	val CodeConceptInstance setServices = bind.getValue("SetServices")
            	val gcomp = setServices.get("gcomp")
            	val rc = setServices.get("rc")
            	
            	val name = bind.getValueString("name")
            	val labelComponent = bind.getValueString("labelComponent")
            	val labelName = bind.getValueString("labelName")
            	val specLabel = bind.getValueString("specLabel")
            	val specPhaseLabel = bind.getValueString("specPhaseLabel")
            	
            	ensureImport(moduleNode, labelComponent, labelName, specLabel, true)
            	
            	val code = '''

					call NUOPC_CompSpecialize(«gcomp», specLabel=«specLabel», &
						«IF specPhaseLabel!=null»specPhaseLabel=«specPhaseLabel», «ENDIF»specRoutine=«name», rc=«rc»)
					'''

				var ASTCallStmtNode regCall = parseLiteralStatement(code)
				(setServices.match as ASTSubroutineSubprogramNode).body.add(regCall)
            	
            ]
            
            
        ]        
        
      
       	val AddComponentToDriverMT = CallInSubroutineMT.refine(
       		#{"compLabel"->String, "srcCompLabel"->String, "dstCompLabel"->String}
       	) => [
       		find = [bind|
       			//here we modify existing results
       			bind.resultSet.results.forEach[r|
       				val callStmt = r.match as ASTCallStmtNode
       				if (callStmt.argList.get(1).name?.eic("srcCompLabel")) {
       					r.put("srcCompLabel", callStmt.argList.get(1).expr.literal)
       					r.put("dstCompLabel", callStmt.argList.get(2).expr.literal)
       				}
       				else {
       					r.put("compLabel", callStmt.argList.get(1).expr.literal)
       					//r.put("compLabelExpr", callStmt.argList.get(1).expr)
       				}
       			]
       		]
       		
       		/*
       		 * 
       		 * 		if (compLabel != null) {			
					}
							else if (srcCompLabel != null && dstCompLabel != null) {
								code = 
					'''
					
					call NUOPC_DriverAddRunElement(«_parent.paramGridComp», slot=«paramint(slot)», &
					    srcCompLabel=«paramch(srcCompLabel)», dstCompLabel=«paramch(dstCompLabel)», rc=«_parent.paramRC»)
					«ESMFErrorCheck(_parent.paramRC)»
					'''				
							}
							else if (slot != null && linkSlot != null) {
								code = 
					'''	
					
					! add a run sequence element to link between slots    
					call NUOPC_DriverAddRunElement(«_parent.paramGridComp», slot=«paramint(slot)», linkSlot=«paramint(linkSlot)», rc=«_parent.paramRC»)
					«ESMFErrorCheck(_parent.paramRC)»
					'''    
							}
       		 */
       		 
       		forwardAdd = [bind|
       			
       			//TODO: automatically replace parameters with binding values
       			val gcomp = bind.getValueString("gcomp")
       			val rc = bind.getValueString("rc")
       			val slot = bind.getValueString("slot")
       			val compLabel = bind.getValueString("compLabel")
       			val phaseLabel = bind.getValueString("phaseLabel")
       		     			
       			val code = '''

call NUOPC_DriverAddRunElement(«gcomp», slot=«slot», &
    compLabel=«compLabel», «IF phaseLabel!=null»phaseLabel=«phaseLabel»,«ENDIF» rc=«rc»)
'''
				val IASTListNode<IBodyConstruct> stmts = parseLiteralStatementSequence(code)
				val ASTSubroutineSubprogramNode ssn = bind.context
				ssn.body.addAll(stmts)	
       		]
       		
       	]
       	
       
        
        SetServicesMT = new MappingType("SetServicesMT", ASTModuleNode, ASTSubroutineSubprogramNode,
        	#{"rc"->String, "gcomp"->String, "routineSetServices"->String}
        ) => [
            
            find = [me|
                val ASTModuleNode module = me.context()
                val ssn = module.moduleBody?.findAll(ASTSubroutineSubprogramNode).findFirst[
                    it.subroutineStmt?.subroutineName.subroutineName.text.eic("SetServices") ||  
                    //also accept if a subroutine calls NUOPC_CompDerive
                    it.body.findAll(ASTCallStmtNode).exists[
                        it.subroutineName.text.equalsIgnoreCase("NUOPC_CompDerive")
                    ]
                ]
                if (ssn != null) {
                    me.addResult(ssn)
                }
            ]
            
            forwardAdd = [bind|
            	
            	val code = bind.fill('''

					subroutine SetServices({gcomp}, {rc})
					    type(ESMF_GridComp)  :: {gcomp}
					    integer, intent(out) :: {rc}
					    
					    rc = ESMF_SUCCESS
					    
					    ! NUOPC_Driver registers the generic methods
					    call NUOPC_CompDerive({gcomp}, {routineSetServices}, rc={rc})
					    «ESMFCodeTemplates.ESMFErrorCheck(bind.getValueString("rc"))»
					    
					end subroutine
					''')
				
				val ASTSubroutineSubprogramNode ssn = parseLiteralProgramUnit(code)
				val ASTModuleNode moduleNode = bind.context
				moduleNode.getModuleBody.add(ssn)
				bind.match = ssn
				
            ]
        ]
        
        
        SetServices = new CodeConceptTemplate("SetServices", #[]) => [
        	addAnnotationsWithDefaults(#{"rc"->"rc", "gcomp"->"gcomp", "routineSetServices"->"fixme"})
        	setMappingType(SetServicesMT, #{"rc"->"@rc", "gcomp"->"@gcomp", "routineSetServices"->"@routineSetServices"})
        ]
        
        /*
        NUOPCComponent = new CodeConceptTemplate("NUOPCComponent", #["genericImport"]) => [
            
            //addAnnotation("ast", IFortranAST)
            addAnnotation("name")
                       
            setMappingType(ModuleMT, #{"name" -> "@name"})
   
            addSubconcept("UsesESMF", ModuleUseStmtMT, false, 1, 1, #{"uses" -> "ESMF"}, true)
            addSubconcept("UsesNUOPC", ModuleUseStmtMT, false, 1, 1, #{"uses" -> "NUOPC"}, true)
            
            //ModuleUseEntityMT = new MappingType("ModuleUseStmtMT", ASTModuleNode, ASTUseStmtNode,
            //#{"uses"->String, "entity"->String, "localName"->String}) => [
            //addSubconcept("UsesGeneric", ModuleUseEntityMT, true, 1, 1, #{"uses"->"$genericImport", "entity"->"SetServices", "localName"->"genericSS"}, true)
            addSubconcept("SetServices", SetServices, false, 1, 1, true)
           
        ]
        */
        
        NUOPCComponent = new CodeConcept("NUOPCComponent") => [
            
            addAnnotation("name")
                       
            setMappingType(ModuleMT, #{"name" -> "@name"})
   
            addSubconcept("UsesESMF", ModuleUseStmtMT, false, 1, 1, #{"uses" -> "ESMF"}, true)
            addSubconcept("UsesNUOPC", ModuleUseStmtMT, false, 1, 1, #{"uses" -> "NUOPC"}, true)
            addSubconcept("SetServices", SetServices, false, 1, 1, true)
           
        ]
        
       	val SetModelServices_AddComponent = new CodeConcept("AddComponent") => [
        	addAnnotations(#["compLabel", "srcCompLabel", "dstCompLabel"])
        	setMappingType(AddComponentToDriverMT, 
        		#{"calls"->"NUOPC_DriverAddComp", "compLabel"->"@compLabel",
        			"srcCompLabel"->"@srcCompLabel", "dstCompLabel"->"@dstCompLabel"
        		}
        	)
       	]
                
        val SetModelServices = new CodeConcept("SetModelServices") => [
        	setMappingType(SpecializationMethodMT, 
        			#{"SetServices" -> "../SetServices", 
                  	  "labelComponent" -> "NUOPC_Driver",
      	  			  "labelName" -> "label_SetModelServices",
      	  			  "specLabel" -> "driver_label_SetModelServices",
      	  			  "specPhaseLabel" -> null,
      	  			  "name"->"SetModelServices",
      	  			  "gcomp"->"gcomp",
      	  			  "rc"->"rc"})
        ]   
             
        NUOPCDriver = NUOPCComponent.extend("NUOPCDriver") => [
           
           	addSubconcept("UsesGeneric", ModuleUseEntityMT, true, 1, 1, #{"uses"->"NUOPC_Driver", "entity"->"SetServices", "localName"->"driverSS"}, true)
 
           	addSubconcept("SetModelServices", SetModelServices, false, 1, 1, true)
           	
           	/*                      
            addSubconcepts(
            	#["SetModelServices", SpecializationMethodMT, 
            		#{"SetServices" -> "../SetServices", 
                  	  "labelComponent" -> "NUOPC_Driver",
      	  			  "labelName" -> "label_SetModelServices"},
      	  			#[
      	  				#[SetModelServices_AddComponent, 1, -1]
      	  				//#["AddComponent", AddComponentToDriverMT, #{"calls"->"NUOPC_DriverAddComp", "compLabel"->"@compLabel"}, 1, -1]
      	  			 ]							
      	  		 ]
            )
          */
        ]
 
 		//val cci = NUOPCDriver.newInstance(#{"name"->"MyDriver"})
               
        
        //NUOPCDriverFromFile = new BootstrapCodeConcept(NUOPCDriver)
        
               
        
                  
        
    }
    
        
    
}
