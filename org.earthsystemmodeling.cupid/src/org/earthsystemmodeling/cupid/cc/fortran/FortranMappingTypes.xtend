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
            find = [me, result|
                val ASTModuleNode moduleNode = me.context()
                val useStmtNode = moduleNode.moduleBody?.filter(ASTUseStmtNode).findFirst[usn|
                    usn.name.text.eic(me.getValue("uses") as String)
                ]
                if (useStmtNode != null) {
                    result.addMatch(useStmtNode)
                }
            ]
            
            //generate = []
        ]
        
        ModuleThatUsesMT = new MappingType("ModuleThatUsesMT",
            #{"context" -> ASTModuleNode, "uses" -> String, "match" -> ASTModuleNode, "name" -> String}) => [
           
            find = [me, result|
                val ASTModuleNode moduleNode = me.context
                if (moduleNode.moduleBody?.filter(ASTUseStmtNode)?.exists[it.name.eic(me.getValueString("uses"))]) {
                    result.addMatch(moduleNode)
                }
            ]
        ]
        
        CallInSubroutineMT = new MappingType("CallInSubroutineMT", 
        	#{"context" -> ASTSubroutineSubprogramNode, "calls" -> String, "match" -> ASTCallStmtNode}) => [
        	
        	find = [me, result|
        		val subr = me.context as ASTSubroutineSubprogramNode
        		subr.body.filter(ASTCallStmtNode).filter[
					it.subroutineName.eic(me.getValueString("calls"))].forEach[c|
						result.addMatch(c)
					]
        	]
        ]
    	
    }
    
    
}