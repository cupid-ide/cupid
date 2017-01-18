package org.earthsystemmodeling.cupid.cc.nuopc

import org.junit.Test
import org.earthsystemmodeling.cupid.cc.mapping.MappingType
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode

import static extension org.earthsystemmodeling.cupid.nuopc.ESMFQuery.*
import org.junit.BeforeClass
import org.eclipse.core.resources.IProject
import org.earthsystemmodeling.cupid.test.TestHelpers
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCTest
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding
import org.eclipse.photran.internal.core.vpg.PhotranVPG
import org.earthsystemmodeling.cupid.cc.mapping.MappingResultSet

import static org.junit.Assert.assertEquals
import org.earthsystemmodeling.cupid.cc.CodeConcept

class MappingTypeTest {
	
	//static IProject PROJECT_NUOPC_PROTOTYPES;
	static MappingType ESMFMethodMT
	
	@BeforeClass
	static def void setUp() {
		
		//PROJECT_NUOPC_PROTOTYPES = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG, NUOPCTest.NUOPC_TAG);
		
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
        ]    
	}
	
	//@Test
	def MappingTypeTest() {
		
		val p = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnProto", NUOPCTest.NUOPC_TAG + "_AtmOcnProto");
		val f = p.getFile("esm.F90");
		val ast = PhotranVPG.getInstance().acquireTransientAST(f)
		val module = ast.root?.programUnitList?.filter(ASTModuleNode).head
				
		val concept = new CodeConcept("MyConcept")		
		val binding = new MappingTypeBinding(ESMFMethodMT, concept) {
			override ASTModuleNode context() {
				module
			}
		}
		
		val instance = concept.newInstance(null)
		//binding.bindOne(instance)
		
		//ESMFMethodMT.find.apply(binding)
		
		assertEquals(3, binding.resultSet)
		
	}
	
}