package org.earthsystemmodeling.cupid.cc.nuopc

import org.earthsystemmodeling.cupid.cc.CodeConcept
import org.earthsystemmodeling.cupid.cc.fortran.FortranMappingTypes
import org.earthsystemmodeling.cupid.cc.mapping.MappingType
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode

import static org.earthsystemmodeling.cupid.cc.fortran.FortranMappingTypes.*

import static extension org.earthsystemmodeling.cupid.nuopc.ASTQuery.*
import static extension org.earthsystemmodeling.cupid.nuopc.ESMFQuery.*
import org.earthsystemmodeling.cupid.cc.fortran.IntExpression
import org.earthsystemmodeling.cupid.cc.fortran.IdentExpression
import org.earthsystemmodeling.cupid.cc.fortran.DefIdentifier
import org.earthsystemmodeling.cupid.cc.types.StringExpression
import org.earthsystemmodeling.cupid.cc.types.DeclIdent

class NUOPC {
    
    static NUOPC instance
    
    /* mapping types */
    public MappingType SetServicesMT
    public MappingType ESMFMethodMT
    public MappingType SpecializationMethodMT  /* refines ESMFMethodMT */
    public MappingType AddComponentToDriverMT  /* refines CallInSubroutineMT */
    public MappingType NUOPCEntryPointMT
    public MappingType AdvertiseFieldsMT
    
    /* concepts */   
    public CodeConcept NUOPCComponent
    public CodeConcept NUOPCModel
    public CodeConcept NUOPCModelRoot
    public CodeConcept NUOPCDriver
    public CodeConcept NUOPCDriverRoot
    public CodeConcept SetServices
    public CodeConcept SetModelServices
    public CodeConcept SetModelServices$AddComponent
    public CodeConcept ESMFEntryPoint
    
            
    def static getInstance() {
        if (instance == null) {
            instance = new NUOPC
        }
        instance
    }
    
    protected new() {
        
        //required to initialize static members
        FortranMappingTypes.instance
        
		/*      
        ESMFMethodMT = new MappingType("ESMFMethodMT", ASTModuleNode, ASTSubroutineSubprogramNode,
        	  #{"name" -> DeclIdent, "gcomp" -> DeclIdent, "rc" -> DeclIdent}) => [
            
            find = [bind|
                val ASTModuleNode module = bind.context
                module.findESMFMethods.forEach[m|
                    //result.addMatch(m).put("name", m.subroutineStmt.subroutineName.subroutineName.text)
                    bind.addResult(m)  
                ]
            ]
                       
            forwardAdd = [b|
            	val ASTModuleNode module = b.context
            	val ASTSubroutineSubprogramNode ssn = b.parseProgramUnit(
            	'''
					
					subroutine <name>(<gcomp>, <rc>)
					    type(ESMF_GridComp)  :: <gcomp>
					    integer, intent(out) :: <rc>
					
					    rc = ESMF_SUCCESS
					
					end subroutine
				''')
				
				
				module.getModuleBody().add(ssn)
				b.match = ssn
            ]
            
        ] 
        
        * 
        */
        
        /*        
       	NUOPCEntryPointMT = new MappingType("NUOPCEntryPointMT", ASTModuleNode, ASTSubroutineSubprogramNode, 
        	#{"SetServices" -> ASTSubroutineSubprogramNode,
        	  "Reg" -> ASTCallStmtNode, 
        	  "name" -> DefIdentifier,
        	  "phaseNumber" -> IntExpression, 
        	  "phaseLabel" -> StringExpression,
        	  "methodType" -> IdentExpression}) => [
        	  
        	  //"import"->String, "export"->String,
        	  //"gcomp"->String, "rc"->String,
        	        	
       	
        	find = [bind|
        		
        		val ASTModuleNode module = bind.context
        		val ASTSubroutineSubprogramNode setServices = bind.getValue("SetServices")  				
  				
  				setServices.body.filter(ASTCallStmtNode).forEach[call|
  					
  					bind.reset
  					
  					if (
  						((
  							call.subroutineName.text.eic("ESMF_GridCompSetEntryPoint") &&
  						 	bind.bind("phaseNumber", call.argExprByKeyword("phase")) &&
  						 	bind.bind("methodType", call.argExprByIdx(1))
  						)
  						||
  						(
  							call.subroutineName.text.eic("NUOPC_CompSetEntryPoint") &&
  						 	bind.bindOneOf("phaseLabel", call.argExprByKeywordElseIdx("phaseLabelList", 2).arrayExprs) &&
  						 	bind.bind("methodType", call.argExprByIdx(1)) 						 	
  						))
  						&&
  						(bind.bind("Reg", call))
  						) {
  							val epSub = module.findESMFEntryPoints.findFirst[sub|
  								bind.bind("name", sub.subroutineStmt.subroutineName.subroutineName) &&
								sub.subroutineStmt.subroutineName.subroutineName.eic(call.litArgExprByKeyword("userRoutine"))
							]
							if (epSub != null) {
								bind.addResult(epSub)
							}
  							
  						} 				
  				]
  				
        	]
        	
        	addTemplate("body", "")
        	
        	forwardAdd = [bind|
        		
        		val ASTSubroutineSubprogramNode ssn = bind.parseProgramUnit(
        			'''
					
					subroutine <name>(gcomp, importState, exportState, clock, rc)
					    type(ESMF_GridComp)  :: gcomp
					    type(ESMF_State)     :: importState, exportState
					    type(ESMF_Clock)     :: clock
					    integer, intent(out) :: rc
					    
					    rc = ESMF_SUCCESS
					    
					    <body()>
					    
					end subroutine
					''')
				
				val ASTModuleNode module = bind.context
				module.moduleBody.add(ssn)
				bind.match = ssn
				
        		val ASTSubroutineSubprogramNode setServices = bind.getValue("SetServices")
        		
        		val regCall = bind.parseStatementSeq(
					'''					
					
					<if(phaseNumber)>
					call ESMF_GridCompSetEntryPoint(gcomp, <methodType>, &
												userRoutine=<name>, phase=<phaseNumber>, rc=rc)
					<else>
					call NUOPC_CompSetEntryPoint(gcomp, <methodType>, &
						<if(phaseLabel)>phaseLabelList=(/"<phaseLabel>"/),<endif> userRoutine=<name>, rc=rc)
					<endif>
					<ESMFErrorCheck("rc")>
					''')
									
				setServices.body.addAll(regCall)
				bind.setValue("Reg", regCall.get(0))
        		
        		
        	]
        	
        	
        	
        ]  
        
        * 
        */
        
        /*
        AdvertiseFieldsMT = NUOPCEntryPointMT.refine(#{}, 
        	#{"methodType" -> "ESMF_METHOD_INITIALIZE",
              "phaseLabel" -> StringExpression.oneOf("IPDv00p1", "IPDv01p1")}) => [
        	
        	//find = [bind|
        	//	
        	//	bind.r
        	//	
        	//]
        	
        	addTemplate("body", "! HERE IS THE BODY")
        	
        	
        	forwardAdd = [bind|
        		val ASTSubroutineSubprogramNode ssn = bind.getValue("match")
        		ssn.subroutineStmt.subroutineName.subroutineName.whiteBefore = "! ADDED THIS COMMMENT"
        		
        	]
        	
        ]     
        */
        
      	//componentDefs()
      	//driverDefs()
      	//modelDefs()
         
    }
    
    
    /*
    protected def componentDefs() {
    	
    	
    	SpecializationMethodMT = ESMFMethodMT.refine(
            #{"SetServices" -> ASTSubroutineSubprogramNode,
              "specLabel" -> String,
              "specPhaseLabel" -> String,
              "labelComponent" -> String, 
              "labelName" -> String}) => [
            
            find = [bind|
                
                //a refinement - result contains result of super mapping type
                val ASTModuleNode module = bind.context
                val ASTSubroutineSubprogramNode setServicesNode = bind.getValue("SetServices")

                bind.removeMatchIf[m|m == setServicesNode]
                bind.<ASTSubroutineSubprogramNode>retainMatchIf[m|
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
            	val ASTSubroutineSubprogramNode setServices = bind.getValue("SetServices")

            	val labelComponent = bind.getValueString("labelComponent")
            	val labelName = bind.getValueString("labelName")
            	val specLabel = bind.getValueString("specLabel")
             	
            	ensureImport(moduleNode, labelComponent, labelName, specLabel, true)
            	
            	var ASTCallStmtNode regCall = bind.parseStatement('''

					call NUOPC_CompSpecialize(<gcomp>, specLabel=<specLabel>, &
						<if(specPhaseLabel)>specPhaseLabel=<specPhaseLabel>, <endif>specRoutine=<name>, rc=<rc>)
					<ESMFErrorCheck(rc)>
					''')
				
				setServices.body.add(regCall)
            	
            ]
            
        ]    
    	
    	
    	SetServicesMT = new MappingType("SetServicesMT", ASTModuleNode, ASTSubroutineSubprogramNode,
        	#{"rc"->String, "gcomp"->String, "genericSS"->String}) => [
            
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
            	            	
            	val ASTSubroutineSubprogramNode ssn = bind.parseProgramUnit(
					'''

					subroutine SetServices(<gcomp>, <rc>)
					    type(ESMF_GridComp)  :: <gcomp>
					    integer, intent(out) :: <rc>
					    
					    rc = ESMF_SUCCESS
					    
					    <if(genericSS)>
					    ! Register the generic methods
					    call NUOPC_CompDerive(<gcomp>, <genericSS>, rc=<rc>)
					    <ESMFErrorCheck(rc)>
					    <endif>
					    
					end subroutine
					''')
				
				val ASTModuleNode moduleNode = bind.context
				moduleNode.getModuleBody.add(ssn)
				bind.match = ssn
				
            ]
        ]
    	
    	
    	SetServices = new CodeConcept("SetServices") => [
        	addAnnotationsWithDefaults(#{"rc"->"rc", "gcomp"->"gcomp"})
        	setMappingType(SetServicesMT, #{"genericSS"->"../UsesGeneric/@genericSS"})
        ]
             
        ESMFEntryPoint = new CodeConcept("EntryPoint") => [
        	//addAnnotationsWithDefaults(#{"name"->"EntryPoint", "methodType"->"ESMF_METHOD_INITIALIZE"})
        	setMappingType(NUOPCEntryPointMT, #{"SetServices"->"../SetServices*"})
        ]
        
               
        NUOPCComponent = new CodeConcept("NUOPCComponent") => [
            
            setMappingType(ModuleMT)
   
            addSubconcept("UsesESMF", ModuleUseStmtMT, false, 1, 1, #{"uses" -> "ESMF"}, true)
            addSubconcept("UsesNUOPC", ModuleUseStmtMT, false, 1, 1, #{"uses" -> "NUOPC"}, true)
            addSubconcept("SetServices", SetServices, false, 1, 1, true)
            addSubconcept("ESMFEntryPoint", ESMFEntryPoint, false, 0, -1, false)           
           
        ]
    	
    }
    
    protected def modelDefs() {
    	
    	NUOPCModel = NUOPCComponent.extend("NUOPCModel") => [
           
           	addSubconcept("UsesGeneric", ModuleUseEntityMT, true, 1, 1, 
           		#{"uses"->"NUOPC_Model", "entity"->"SetServices", "localName"->"@genericSS"}, true) => [
           			addAnnotationsWithDefaults(#{"genericSS"->"modelSS"})
           		]
 
 			addSubconcept("InitializeAdvertise", AdvertiseFieldsMT, false, 1, 1,
 				#{"SetServices"->"../SetServices*", "phaseLabel"->StringExpression.literal("IPDv01p1")}, true) => [

        	  		addAnnotationDefaults(#{"name" -> DefIdentifier.literal("InitializeAdvertise")})
        	  		
        		]
        	  	    
        	
        	addSubconcept("InitializeRealize", NUOPCEntryPointMT, false, 1, 1,
 				#{"SetServices" -> "../SetServices*",
        	  	  "methodType" -> IdentExpression.literal("ESMF_METHOD_INITIALIZE"), 
        	  	  "phaseLabel" -> StringExpression.oneOf("IPDv00p2", "IPDv01p2")}
        	  	, true) => [
        	  	      	
        	  		addAnnotationDefaults(#{"name"->DefIdentifier.literal("InitializeRealize")})
        	 	]
           
        ]
        
        NUOPCModelRoot = new CodeConcept("NUOPCModelRoot", FortranAstMT) => [
        	addSubconcept("NUOPCModel", NUOPCModel, true, 1, 1, true);
        ]
    	
    }
    
    protected def driverDefs() {
    	
    	
    	AddComponentToDriverMT = CallInSubroutineMT.refine(
       		#{"gcomp"->String, "rc"->String, "slot"->String, "linkSlot"->String,
       		  "compLabel"->String, "phaseLabel"->String, 
       		  "srcCompLabel"->String, "dstCompLabel"->String},
       		#{"calls"->"NUOPC_DriverAddRunElement"}) => [
       		
       		find = [bind|
       			//here we annotate existing results
       			bind.forEachResult[r|
       				val callStmt = r.match as ASTCallStmtNode
       				if (callStmt.argList.get(1).name?.eic("srcCompLabel")) {
       					r.put("srcCompLabel", callStmt.argList.get(1).expr.literal)
       					r.put("dstCompLabel", callStmt.argList.get(2).expr.literal)
       				}
       				else {
       					r.put("compLabel", callStmt.argList.get(1).expr.literal)
       				}
       			]
       		]
       		 
       		forwardAdd = [bind|       			

	       		val stmts = bind.parseStatementSeq('''
					
					<if(compLabel)>
					call NUOPC_DriverAddRunElement(<gcomp>, slot=<slot>, &
					    compLabel=<compLabel>, <if(phaseLabel)>phaseLabel=<phaseLabel>,<endif> rc=<rc>)
					<elseif (srcCompLabel && dstCompLabel)>
					call NUOPC_DriverAddRunElement(<gcomp>, slot=<slot>, &
						srcCompLabel=<srcCompLabel>, dstCompLabel=<dstCompLabel>, rc=<rc>)
					<elseif (slot && linkSlot)>
					! add a run sequence element to link between slots    
					call NUOPC_DriverAddRunElement(<gcomp>, slot=<slot>, linkSlot=<linkSlot>, rc=<rc>)
					<else>
					! CODE GENERATION ERROR: incomplete information to generate call to NUOPC_DriverAddRunElement	
					<endif>
					<ESMFErrorCheck(rc)>
					''')
				
				val ASTSubroutineSubprogramNode ssn = bind.context
				ssn.body.addAll(stmts)	
       		]
       		
       	]
       	   	
    	
    	SetModelServices = new CodeConcept("SetModelServices") => [
        	
        	addAnnotationsWithDefaults(
        		#{"gcomp"->"gcomp", "rc"->"rc",
        		  "name"->"SetModelServices",
        		  "specLabel"->"driver_label_SetModelServices"
        		 }
        	)
        	
        	setMappingType(SpecializationMethodMT, 
        			#{"SetServices" -> "../SetServices*", 
                  	  "labelComponent" -> "NUOPC_Driver",
      	  			  "labelName" -> "label_SetModelServices"})
      	  			 
        		  
      	  	SetModelServices$AddComponent =	  	      	  	
      	  		addSubconcept("AddComponent", AddComponentToDriverMT, false, 1, -1, 
      	  		#{"gcomp"->"../@gcomp", "rc"->"../@rc"}, true) => [
        				
    				addAnnotationsWithDefaults(
    					#{"compLabel"->"\"COMP\"", 
    					  "srcCompLabel"->"\"SRC\"", "dstCompLabel"->"\"DST\"", 
    					  "phaseLabel"->"FIXME", "slot"->"1", "linkSlot"->"2"})
        		]
        ]   
        
             
        NUOPCDriver = NUOPCComponent.extend("NUOPCDriver") => [
           
           	addSubconcept("UsesGeneric", ModuleUseEntityMT, true, 1, 1, 
           		#{"uses"->"NUOPC_Driver", "entity"->"SetServices", "localName"->"@genericSS"}, true) => [
           			addAnnotationsWithDefaults(#{"genericSS"->"driverSS"})
           		]
 
           	addSubconcept("SetModelServices", SetModelServices, false, 1, 1, true)    	
           
        ]
        
        NUOPCDriverRoot = new CodeConcept("NUOPCDriverRoot", FortranAstMT) => [
        	addSubconcept("NUOPCDriver", NUOPCDriver, true, 1, 1, true);
        ]
    	
    	
    }
    */
    
    /*
    def static ESMFErrorCheck(String rcToCheck) {
		'''	
		if (ESMF_LogFoundError(rcToCheck=«rcToCheck», msg=ESMF_LOGERR_PASSTHRU, &
			line=__LINE__, &
			file=__FILE__)) &
			return  ! bail out
		'''
	}	
     */  
    
}
