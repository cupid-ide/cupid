package org.earthsystemmodeling.cupid.cc.fortran

import org.earthsystemmodeling.cupid.cc.mapping.MappingType
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeException
import org.eclipse.photran.core.IFortranAST
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode
import org.eclipse.photran.internal.core.parser.ASTListNode
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTOnlyNode
import org.eclipse.photran.internal.core.parser.ASTRenameNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode
import org.eclipse.photran.internal.core.parser.IASTListNode
import org.eclipse.photran.internal.core.parser.IBodyConstruct
import org.eclipse.photran.internal.core.parser.IProgramUnit
import org.eclipse.photran.internal.core.parser.ISpecificationPartConstruct

import static org.earthsystemmodeling.cupid.util.CodeExtraction.*

import static extension org.earthsystemmodeling.cupid.nuopc.ASTQuery.*

class FortranMappingTypes {
	
	static FortranMappingTypes instance
    
    public static MappingType FortranAstMT
    public static MappingType CallInSubroutineMT
    //public static MappingType ModuleThatUsesMT
    public static MappingType ModuleUseStmtMT
    public static MappingType ModuleUseEntityMT
    public static MappingType ModuleMT
    
    
    def static getInstance() {
        if (instance == null) {
            instance = new FortranMappingTypes
        }
        instance
    }
       
    protected new() {
    	
    	FortranAstMT = new MappingType("FortranAstMT", IFortranAST, IFortranAST);
    	
    	ModuleUseStmtMT = new MappingType("ModuleUseStmtMT", ASTModuleNode, ASTUseStmtNode,
            #{"uses"->String}) => [
            
            find = [bind|
                val ASTModuleNode moduleNode = bind.context
                val useStmtNode = moduleNode.moduleBody?.filter(ASTUseStmtNode).findFirst[usn|
                    usn.name.text.eic(bind.getValueString("uses"))
                ]
                if (useStmtNode != null) {
                    val r = bind.addResult(useStmtNode)
                    r.put("uses", useStmtNode.name.text)
                }
            ]
            
            forwardAdd = [bind|
            	val ASTModuleNode moduleNode = bind.context
            	val usn = ensureImport(moduleNode, bind.getValueString("uses"))
            	bind.setMatch(usn)
            ]
            
        ]
        
        ModuleUseEntityMT = new MappingType("ModuleUseStmtMT", ASTModuleNode, ASTUseStmtNode,
            #{"uses"->String, "entity"->String, "localName"->String}) => [
            
            find = [bind|
                
                val ASTModuleNode moduleNode = bind.context

                val useStmtNode = moduleNode.moduleBody?.filter(ASTUseStmtNode).findFirst[usn|
                    bind.bindToken("uses", usn.name)
                ]
                
                if (useStmtNode != null) {
	                val exists = 
						useStmtNode.findAll(ASTRenameNode)?.exists[rn|
							bind.bindToken("entity", rn.name) &&
							bind.bindToken("localName", rn.newName)
						] 
						||
						useStmtNode.findAll(ASTOnlyNode)?.exists[on|
							bind.bindToken("entity", on.name) &&
							bind.bindToken("localName", on.newName)
						]
						||
						(useStmtNode.findAll(ASTRenameNode).nullOrEmpty &&
					     useStmtNode.findAll(ASTOnlyNode).nullOrEmpty
						)
				
	                if (exists) {
	                    bind.addResult(useStmtNode)
	                }	                
	        	}
	        	
            ]
            
            forwardAdd = [bind|
            	val ASTModuleNode moduleNode = bind.context
            	val uses = bind.getValueString("uses")
                val entity = bind.getValueString("entity")
                val localName = bind.getValueString("localName")
                
            	val usn = ensureImport(moduleNode, uses, entity, localName, true)
            	bind.setMatch(usn)
            ]
            
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
        		        		
        		val code = bind.fill(
        		'''
					module {name}
												
						implicit none
						
						contains
						
					end module
				''')
		
				var ASTModuleNode moduleNode = parseLiteralProgramUnit(code)
							
				var pul = new ASTListNode<IProgramUnit>()
				pul.add(moduleNode)
				ast.root.programUnitList = pul
				
				bind.setMatch(moduleNode)
        		        		
        	]
        ]
        
        /*
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
        */
        
        CallInSubroutineMT = new MappingType("CallInSubroutineMT", 
        	ASTSubroutineSubprogramNode, ASTCallStmtNode, #{"calls" -> String}) => [
        	
        	find = [bind|
        		val ASTSubroutineSubprogramNode subr = bind.context
        		subr.body.filter(ASTCallStmtNode).filter[
					it.subroutineName.eic(bind.getValueString("calls"))].forEach[c|
						bind.addResult(c)
					]
        	]
        ]
    	
    }
    
    
    def static ASTUseStmtNode ensureImport(ASTUseStmtNode usn, String entityName, String localName) {
		
		val exists = 
			usn.findAll(ASTRenameNode)?.exists[rn|
				rn.name.eic(entityName) &&
				rn.newName.eic(localName)
			] 
			||
			usn.findAll(ASTOnlyNode)?.exists[on|
				on.name.eic(entityName) &&
				on.newName.eic(localName)
			]
			||
			(usn.findAll(ASTRenameNode).nullOrEmpty &&
		     usn.findAll(ASTOnlyNode).nullOrEmpty
			)
			
		if (!exists) {
			//need to add entity to list of imports
			val code = usn.toString.trim + ", &\n" + '''«localName» => «entityName»'''
			val newNode = parseLiteralStatement(code) as ASTUseStmtNode
			usn.replaceWith(newNode)
			return newNode
		}
		else {
			return usn
		}
		
	}
	
	def static ASTUseStmtNode ensureImport(ASTModuleNode amn, String moduleName) {
		ensureImport(amn, moduleName, null, null, false)
	}
	
	def static ASTUseStmtNode ensureImport(ASTModuleNode amn, String moduleName, String entityName, String localName, boolean useOnly) {
		
		//var String code	= null
		var ASTUseStmtNode usn = amn.body.children.filter(ASTUseStmtNode).findFirst[usn|
			usn.name.eic(moduleName)]
			
		if (usn != null) {
			return ensureImport(usn, entityName, localName)
		}
		else {
			val code = '''use «moduleName»«IF localName!=null && entityName!=null», «IF useOnly»only: «ENDIF»«localName» => «entityName»«ENDIF»'''
			
			usn = parseLiteralStatement(code) as ASTUseStmtNode
			
			val last = amn.body.findLast(ASTUseStmtNode)
			if (last != null) {
				(amn.body as IASTListNode<IBodyConstruct>).insertAfter(last, usn)
			}
			else {
				val firstSpec = amn.body.findFirst(ISpecificationPartConstruct)
				if (firstSpec != null) {
					(amn.body as IASTListNode<IBodyConstruct>).insertBefore(firstSpec, usn)
				}
				else {
					throw new MappingTypeException("Unable to insert use statement: " + usn.toString)
				}
			}
			return usn
		}
				
		
		
	}
    
    
    
}