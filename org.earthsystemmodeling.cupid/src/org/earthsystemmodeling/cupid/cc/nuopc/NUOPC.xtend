package org.earthsystemmodeling.cupid.cc.nuopc

import org.eclipse.photran.core.IFortranAST
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode

import static extension org.earthsystemmodeling.cupid.nuopc.ASTQuery.*
import static extension org.earthsystemmodeling.cupid.nuopc.ESMFQuery.*
import org.earthsystemmodeling.cupid.cc.CodeConcept
import org.earthsystemmodeling.cupid.cc.BootstrapCodeConcept

class NUOPC {
    
    static NUOPC instance
    
    public CodeConcept NUOPCDriver
    public CodeConcept NUOPCComponent
    
    public CodeConcept SetServices
    public CodeConcept SpecializationMethod
    
    public CodeConcept ModuleUses
    
    public BootstrapCodeConcept NUOPCDriverFromFile
    
    def static getInstance() {
        if (instance == null) {
            instance = new NUOPC
        }
        instance
    }
    
    new() {
        
        SpecializationMethod = new CodeConcept("SpecMethod") => [
            findAll = [me, context|
                val ASTModuleNode module = context.sourceRef
                module.findESMFMethods
            ]
        ]
        
        SetServices = new CodeConcept("SetServices") => [
            
            find = [me, context|
                val ASTModuleNode module = context.sourceRef
                module.moduleBody?.findAll(ASTSubroutineSubprogramNode).findFirst[
                    it.subroutineStmt?.subroutineName.subroutineName.text.equalsIgnoreCase("SetServices") ||  //change to subroutineName
                    //also accept if a subroutine calls NUOPC_CompDerive
                    it.body.findAll(ASTCallStmtNode).exists[
                        it.subroutineName.text.equalsIgnoreCase("NUOPC_CompDerive")
                    ]
                ]
            ]
        
            annotate = [map,sourceRef|
                val ssn = sourceRef as ASTSubroutineSubprogramNode
                map.put("subroutineName", ssn.subroutineStmt?.subroutineName.subroutineName.text)
                map.put("paramGridComp", ssn.subroutineStmt?.subroutinePars?.get(0)?.variableName.text)
             //etc
            ]
            
        ]
        
        ModuleUses = new CodeConcept("ModuleUses", #["moduleName"]) => [
            find = [me, parent|
                val ASTModuleNode moduleNode = parent.sourceRef
                moduleNode.moduleBody?.filter(ASTUseStmtNode).findFirst[usn|
                    usn.name.text.eic(me.getParameterValueString("moduleName"))
                ]
            ]
        ]
        
        NUOPCComponent = new CodeConcept("NUOPCComponent", #["genericImport"]) => [
            mapsTo = ASTModuleNode
            
            addSubconcept("Uses ESMF", ModuleUses % #{"moduleName" -> "ESMF"})
            addSubconcept("Uses NUOPC", ModuleUses % #{"moduleName" -> "NUOPC"})
            
            //need to do lazy evaluation of getParamString!
            //could add copies of these into the subtype, when declared....
            //addSubconcept("Uses Generic", ModuleUses % #{"moduleName" -> [NUOPCComponent.getParamString("genericImport")]})
            
            addSubconcept(SetServices)
            
            find = [me, parent|
                val ASTModuleNode moduleNode = parent.sourceRef
                if (moduleNode.moduleBody?.filter(ASTUseStmtNode)?.exists[it.name.text.eic(me.getParameterValueString("genericImport"))]) {
                    return moduleNode
                }
                null               
            ]
            
            annotate = [map, sourceRef|
                val moduleNode = sourceRef as ASTModuleNode
                map.put("name", moduleNode.moduleStmt.moduleName.moduleName.text)
            ] 
           
        ]
        
        NUOPCDriver = NUOPCComponent.newRefinement("NUOPCDriver", 
            #{"genericImport" -> "NUOPC_Driver"}) => [
            
            addSubconcept("Uses NUOPC_Driver", ModuleUses % #{"moduleName" -> "NUOPC_Driver"})
          
        ]
        
        NUOPCDriverFromFile = new BootstrapCodeConcept(NUOPCDriver)
        
               
        
                  
        
    }
    
        
    
}
