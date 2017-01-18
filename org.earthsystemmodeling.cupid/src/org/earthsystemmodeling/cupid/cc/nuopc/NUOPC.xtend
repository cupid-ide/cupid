package org.earthsystemmodeling.cupid.cc.nuopc

import org.earthsystemmodeling.cupid.cc.BootstrapCodeConcept
import org.earthsystemmodeling.cupid.cc.CodeConcept
import org.earthsystemmodeling.cupid.cc.CodeConceptTemplate
import org.earthsystemmodeling.cupid.cc.mapping.MappingType
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode

import static org.earthsystemmodeling.cupid.cc.fortran.FortranMappingTypes.*

import static org.earthsystemmodeling.cupid.util.CodeExtraction.*
import static extension org.earthsystemmodeling.cupid.nuopc.ASTQuery.*
import static extension org.earthsystemmodeling.cupid.nuopc.ESMFQuery.*
import org.earthsystemmodeling.cupid.cc.fortran.FortranMappingTypes
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance
import org.eclipse.photran.internal.core.parser.IASTListNode
import org.eclipse.photran.internal.core.parser.IBodyConstruct
import org.eclipse.photran.core.IFortranAST
import org.earthsystemmodeling.cupid.nuopc.ESMFCodeTemplates

class NUOPC {
    
    static NUOPC instance
    //static FortranMappingTypes FMT
    
    /* mapping types */
    //public MappingType CallInSubroutineMT
    //public MappingType ModuleThatUsesMT
    //public MappingType ModuleUseStmtMT
    public MappingType SetServicesMT
    public MappingType ESMFMethodMT
    public MappingType SpecializationMethodMT  /* refines ESMFMethodMT */
    
    /* concepts */   
    public CodeConceptTemplate NUOPCComponent
    public CodeConcept NUOPCDriver
    
    public BootstrapCodeConcept NUOPCDriverFromFile
    
    def static getInstance() {
        if (instance == null) {
            instance = new NUOPC
        }
        instance
    }
    
    protected new() {
        
        //required to initialize static members
        FortranMappingTypes.instance
               
        ESMFMethodMT = new MappingType("ESMFMethodMT", 
        	#{"context" -> ASTModuleNode, 
        	  "match" -> ASTSubroutineSubprogramNode
        	  //"name" -> String,
        	  //"gcomp" -> String,
        	  //"import" -> String,
        	  //"export" -> String,
        	  //"clock" -> String,
        	  //"rc" -> String
        	  }) => [
            
            find = [bind|
                val ASTModuleNode module = bind.context
                module.findESMFMethods.forEach[m|
                    //result.addMatch(m).put("name", m.subroutineStmt.subroutineName.subroutineName.text)
                    bind.addResult(m)  
                ]
            ]
                       
            forwardAdd = [b|
            	val ASTModuleNode module = b.context
            	val code = '''
					
					subroutine «b.getValue("name")»(«b.getValue("gcomp")», «b.getValue("import")», «b.getValue("export")», «b.getValue("clock")», «b.getValue("rc")»)
						type(ESMF_GridComp)  :: «b.getValue("gcomp")»
						type(ESMF_State)     :: «b.getValue("import")», «b.getValue("export")»
						type(ESMF_Clock)     :: «b.getValue("clock")»
						integer, intent(out) :: «b.getValue("rc")»
					    
					    rc = ESMF_SUCCESS
					    
					end subroutine
				'''
				
				var ASTSubroutineSubprogramNode ssn = parseLiteralProgramUnit(code)
				module.getModuleBody().add(ssn)
            ]
            
        ]       
        
        SpecializationMethodMT = ESMFMethodMT.refine(
            #{"SetServices" -> ASTSubroutineSubprogramNode,
              "labelComponent" -> String, 
              "labelName" -> String}) => [
            
            find = [bind|
                
                //a refinement - result contains result of super mapping type
                val ASTModuleNode module = bind.context
                val ASTSubroutineSubprogramNode setServicesNode = bind.getValue("SetServices")

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
            
           // generate = [p1|]
            
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
				
            ]
        ]
        
        
        
        NUOPCComponent = new CodeConceptTemplate("NUOPCComponent", #["genericImport"]) => [
            
            addAnnotation("ast", IFortranAST)
            addAnnotation("name")
                       
            setMappingType(ModuleMT, #{"context"->"@ast", "name" -> "@name"})
            
            addSubconcepts(
            	#["UsesESMF", ModuleUseStmtMT, #{"uses" -> "ESMF"}],     
            	#["UsesNUOPC", ModuleUseStmtMT, #{"uses" -> "NUOPC"}],
            	#["UsesGeneric", ModuleUseStmtMT, #{"uses" -> "$genericImport"}],
            	#["SetServices", SetServicesMT, #{"rc"->"rc", "gcomp"->"gcomp", "routineSetServices"->"ss"}]
          	)            
            
        ]
        
       	val SetModelServices_AddComponent = new CodeConcept("AddComponent") => [
        	addAnnotations(#["compLabel", "srcCompLabel", "dstCompLabel"])
        	setMappingType(AddComponentToDriverMT, 
        		#{"calls"->"NUOPC_DriverAddComp", "compLabel"->"@compLabel",
        			"srcCompLabel"->"@srcCompLabel", "dstCompLabel"->"@dstCompLabel"
        		}
        	)
       	]
                
        NUOPCDriver = NUOPCComponent.instantiate("NUOPCDriver", #{"genericImport" -> "NUOPC_Driver"}) => [
                                 
            addSubconcepts(
            	#["SetModelServices", SpecializationMethodMT, #{"SetServices" -> "../SetServices", 
                  								"labelComponent" -> "NUOPC_Driver",
      	  										"labelName" -> "label_SetModelServices"},
      	  			#[
      	  				#[SetModelServices_AddComponent, 1, -1]
      	  				//#["AddComponent", AddComponentToDriverMT, #{"calls"->"NUOPC_DriverAddComp", "compLabel"->"@compLabel"}, 1, -1]
      	  			 ]							
      	  		 ]
            )
          
        ]
 
 		//val cci = NUOPCDriver.newInstance(#{"name"->"MyDriver"})
               
        
        NUOPCDriverFromFile = new BootstrapCodeConcept(NUOPCDriver)
        
               
        
                  
        
    }
    
        
    
}
