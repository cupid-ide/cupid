package org.earthsystemmodeling.cupid.cc.fortran

import org.earthsystemmodeling.cupid.cc.mapping.MappingType
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode

import static extension org.earthsystemmodeling.cupid.nuopc.ASTQuery.*

class FortranMappingTypes {
	
	static FortranMappingTypes instance
    
    public static MappingType CallInSubroutineMT
    public static MappingType ModuleThatUsesMT
    public static MappingType ModuleUseStmtMT
    
    def static getInstance() {
        if (instance == null) {
            instance = new FortranMappingTypes
        }
        instance
    }
       
    protected new() {
    	
    	
    	ModuleUseStmtMT = new MappingType("ModuleUseStmtMT",
            #{"context" -> ASTModuleNode, "uses" -> String, "match" -> ASTUseStmtNode}) => [
            find = [bind|
                val ASTModuleNode moduleNode = bind.context
                val useStmtNode = moduleNode.moduleBody?.filter(ASTUseStmtNode).findFirst[usn|
                    usn.name.text.eic(bind.getValue("uses") as String)
                ]
                if (useStmtNode != null) {
                    bind.addResult(useStmtNode)
                }
            ]
            
            //generate = []
        ]
        
        ModuleThatUsesMT = new MappingType("ModuleThatUsesMT",
            #{"context" -> ASTModuleNode, "uses" -> String, "match" -> ASTModuleNode, "name" -> String}) => [
           
            find = [bind|
                val ASTModuleNode moduleNode = bind.context
                if (moduleNode.moduleBody?.filter(ASTUseStmtNode)?.exists[it.name.eic(bind.getValueString("uses"))]) {
                    val r = bind.addResult(moduleNode)
                    r.put("name", moduleNode.moduleStmt.moduleName.moduleName.text)
                }
            ]
        ]
        
        CallInSubroutineMT = new MappingType("CallInSubroutineMT", 
        	#{"context" -> ASTSubroutineSubprogramNode, "calls" -> String, "match" -> ASTCallStmtNode}) => [
        	
        	find = [bind|
        		val ASTSubroutineSubprogramNode subr = bind.context
        		subr.body.filter(ASTCallStmtNode).filter[
					it.subroutineName.eic(bind.getValueString("calls"))].forEach[c|
						bind.addResult(c)
					]
        	]
        ]
    	
    }
    
    
}