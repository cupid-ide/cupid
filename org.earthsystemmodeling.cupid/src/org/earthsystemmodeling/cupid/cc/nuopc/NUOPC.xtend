package org.earthsystemmodeling.cupid.cc.nuopc

import org.earthsystemmodeling.cupid.cc.BootstrapCodeConcept
import org.earthsystemmodeling.cupid.cc.CodeConcept
import org.earthsystemmodeling.cupid.cc.MappingType
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode

import static extension org.earthsystemmodeling.cupid.nuopc.ASTQuery.*
import static extension org.earthsystemmodeling.cupid.nuopc.ESMFQuery.*

class NUOPC {
    
    static NUOPC instance
    
    /* mapping types */
    public MappingType ModuleThatUsesMT
    public MappingType ModuleUseStmtMT
    public MappingType SetServicesMT
    public MappingType ESMFMethodMT
    public MappingType SpecializationMethodMT
    
    /* concepts */   
    public CodeConcept NUOPCComponent
    public CodeConcept NUOPCDriver
    
    
    public BootstrapCodeConcept NUOPCDriverFromFile
    
    def static getInstance() {
        if (instance == null) {
            instance = new NUOPC
        }
        instance
    }
    
    new() {
        
        
        
                            /*
                            .forEach[c|
                    
                        var smcc = newInstance() as SpecializationMethodCodeConcept<P> //will be instance of subclass           
                        smcc => [
                            subroutineName = m.subroutineStmt.subroutineName.subroutineName.text
                            specLabel = c.litArgExprByKeyword("specLabel")
                            specPhaseLabel = c.litArgExprByKeyword("specPhaseLabel")
                            paramGridComp = pGridComp
                            paramRC = pRC
                            registration = new BasicCodeConcept(this, c)
                            setASTRef(m)
                        ]                   
                    
                        smcc = smcc.reverseChildren
                        if (smcc != null) {
                            resultList.add(smcc)
                        }
                        * 
                        */
        
        ESMFMethodMT = new MappingType(
            #{"module" -> ASTModuleNode},
            #{"match" -> ASTSubroutineSubprogramNode}) => [
            
            find = [me, result|
                val ASTModuleNode module = me.get("module")
                module.findESMFMethods.forEach[m|
                    result.addMatch(m)  
                ]
            ]
            
        ]       
        
        SpecializationMethodMT = ESMFMethodMT.refine(
            #{"setServices" -> ASTSubroutineSubprogramNode,
              "labelComponent" -> String, 
              "labelName" -> String}) => [
            
            find = [me, result|
                
                //a refinement - result contains result of super mapping type
                val ASTModuleNode module = me.get("module")
                val ASTSubroutineSubprogramNode setServicesNode = me.get("setServices")

                result.<ASTSubroutineSubprogramNode>removeMatchIf[m|m == setServicesNode]
                result.<ASTSubroutineSubprogramNode>retainMatchIf[m|
                    setServicesNode.body.filter(ASTCallStmtNode).
                        exists[                        
                            it.subroutineName.eic("NUOPC_CompSpecialize") &&
                            it.litArgExprByKeyword("specRoutine")?.eic(m.subroutineStmt.subroutineName.subroutineName) &&
                            it.litArgExprByKeyword("specLabel")?.eic(
                                module.localName(me.get("labelComponent"), 
                                                     me.get("labelName"))
                            )]
                ]
                
            ]
            
           // generate = [p1|]
            
        ]        
        
        /*
        SpecializationMethod = new CodeConcept("SpecializationMethod", #["labelComponent", "labelName"]) => [
           
            mappingType = SpecializationMethodMT.withParams(#{"x"->"y"})
            
            findAll = [me, context|
                
                val ASTModuleNode moduleNode = context.sourceRef
                val ASTSubroutineSubprogramNode setServicesNode = null //setServices?.ASTRef
                
                context.findConcept(SetServices) // search through tree, or provide explicit? 
                //if (setServicesNode==null) return null  
            
                val esmfMethods = moduleNode.findESMFMethods
    
                val resultList = newArrayList()
        
                //val pGridComp = setServicesNode.subroutineStmt.subroutinePars.get(0).variableName.text
                //val pRC =  setServicesNode.subroutineStmt.subroutinePars.get(1).variableName.text
        
                esmfMethods.filter[it != setServicesNode].filter[m|
                    setServicesNode.body.filter(ASTCallStmtNode).
                        exists[                        
                            it.subroutineName.eic("NUOPC_CompSpecialize") &&
                            it.litArgExprByKeyword("specRoutine")?.eic(m.subroutineStmt.subroutineName.subroutineName) &&
                            it.litArgExprByKeyword("specLabel")?.eic(
                                moduleNode.localName(me.getParameterValueString("labelComponent"), 
                                                     me.getParameterValueString("labelName"))
                            )]
                ]
            ]
        ]
        */
       
        //SetModelServices = SpecializationMethod.newRefinement("ModelSetServices", 
        //    #{"labelComponent" -> "NUOPC_Driver", "labelName" -> "label_SetModelServices"}
       // )
        
        SetServicesMT = new MappingType(ASTModuleNode, ASTSubroutineSubprogramNode) => [
            find = [me, results|
                val ASTModuleNode module = me.context()
                module.moduleBody?.findAll(ASTSubroutineSubprogramNode).findFirst[
                    it.subroutineStmt?.subroutineName.subroutineName.text.eic("SetServices") ||  
                    //also accept if a subroutine calls NUOPC_CompDerive
                    it.body.findAll(ASTCallStmtNode).exists[
                        it.subroutineName.text.equalsIgnoreCase("NUOPC_CompDerive")
                    ]
                ]
            ]
        ]
        
        ModuleUseStmtMT = new MappingType(
            #{"context" -> ASTModuleNode, "uses" -> String},
            #{"match" -> ASTUseStmtNode}) => [
            find = [me, result|
                val ASTModuleNode moduleNode = me.context()
                moduleNode.moduleBody?.filter(ASTUseStmtNode).findFirst[usn|
                    usn.name.text.eic(me.get("uses") as String)
                ]
            ]
            
            //generate = []
        ]
        
        ModuleThatUsesMT = new MappingType(
            #{"context" -> ASTModuleNode, "uses" -> String},
            #{"match" -> ASTModuleNode}) => [
           
            find = [me, result|
                val ASTModuleNode moduleNode = me.context
                if (moduleNode.moduleBody?.filter(ASTUseStmtNode)?.exists[it.name.eic(me.get("uses") as String)]) {
                    result.addMatch(moduleNode)
                }
            ]
        ]
        
        NUOPCComponent = new CodeConcept("NUOPCComponent", #["genericImport"]) => [
            
            //$ here indicates that the parameter is NOT a literal, but comes in through the concept
            mappingType = ModuleThatUsesMT.withParams(#{"uses" -> "$genericImport"})
            
            //TODO: cardinality constraints
            addSubconcept("UsesESMF", ModuleUseStmtMT.withParams(#{"uses" -> "ESMF"}))        
            addSubconcept("UsesNUOPC", ModuleUseStmtMT.withParams(#{"uses" -> "NUOPC"}))
            addSubconcept("UsesGeneric", ModuleUseStmtMT.withParams(#{"uses" -> "$genericImport"}))
            addSubconcept("SetServices", SetServicesMT)
            
        ]
        
        
        NUOPCDriver = NUOPCComponent.refine("NUOPCDriver", #{"genericImport" -> "NUOPC_Driver"}) => [
                     
            //add a new child with given name
            addSubconcept("SetModelServices", SpecializationMethodMT.withParams(
                #{"SetServices" -> "../SetServices", 
                  "labelComponent" -> "NUOPC_Driver",
                  "labelName" -> "label_SetModelServices"}
            ))
          
        ]
               
        
        NUOPCDriverFromFile = new BootstrapCodeConcept(NUOPCDriver)
        
               
        
                  
        
    }
    
        
    
}
