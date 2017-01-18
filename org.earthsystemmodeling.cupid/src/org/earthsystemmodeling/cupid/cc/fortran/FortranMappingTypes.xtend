package org.earthsystemmodeling.cupid.cc.fortran

import org.earthsystemmodeling.cupid.cc.mapping.MappingType
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode

import static extension org.earthsystemmodeling.cupid.nuopc.ASTQuery.*
import static org.earthsystemmodeling.cupid.util.CodeExtraction.*
import org.eclipse.photran.core.IFortranAST
import org.eclipse.photran.internal.core.parser.ASTListNode
import org.eclipse.photran.internal.core.parser.IProgramUnit
import org.earthsystemmodeling.cupid.cc.CodeConcept
import org.earthsystemmodeling.cupid.cc.CodeConceptTemplate

class FortranMappingTypes {
	
	static FortranMappingTypes instance
    
    public static MappingType CallInSubroutineMT
    public static MappingType ModuleThatUsesMT
    public static MappingType ModuleUseStmtMT
    public static MappingType ModuleMT
    
    public static CodeConceptTemplate TopLevelCodeConcept
    
    def static getInstance() {
        if (instance == null) {
            instance = new FortranMappingTypes
        }
        instance
    }
       
    protected new() {
    	
    	
    	TopLevelCodeConcept = new CodeConceptTemplate("TopLevelCodeConcept", #[]);
    	
    	
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
        
        ModuleMT = new MappingType("ModuleMT", 
        	#{"context" -> IFortranAST, 
        	  "name" -> String, 
        	  "match" -> ASTModuleNode}
        ) => [
        	
        	find = [bind|
        		val IFortranAST ast = bind.context
        		val moduleNode = ast?.root?.programUnitList?.filter(ASTModuleNode)?.head
        		if (moduleNode != null) {
        			//TODO: verify name if it's not null
        			val r = bind.addResult(moduleNode)
        			r.put("name", moduleNode.moduleStmt.moduleName.moduleName.text)
        		}
        	]
        	
        	forwardAdd = [bind|
        		val IFortranAST ast = bind.context
        		val name = bind.getValueString("name")
        		
        		val code = 
        		'''
					module «name»
						
						use ESMF
						use NUOPC
							
						implicit none
						
						contains
						
					end module
				'''
		
				var ASTModuleNode moduleNode = parseLiteralProgramUnit(code)
							
				var pul = new ASTListNode<IProgramUnit>()
				pul.add(moduleNode)
				ast.root.programUnitList = pul
        		        		
        	]
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
            
            forwardAdd = [bind|
            	
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