package org.earthsystemmodeling.cupid.nuopc.v7r

import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTFunctionSubprogramNode
import static org.earthsystemmodeling.cupid.util.CodeExtraction.*
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException
import org.earthsystemmodeling.cupid.annotation.Label

class GridCodeConcept {
	
	@Accessors
	@Label(label="Create Uniform Grid")
	public static class CreateUniformGrid extends CodeConcept<CodeConcept<?,?>, ASTFunctionSubprogramNode> {
			
		String name
		int[] minIndex	
		int[] maxIndex
		double[] minCornerCoord
		double[] maxCornerCoord
	
		new(CodeConcept<?,?> parent) {
			super(parent)
			parent.setOrAddChild(this)
		}
		
		override CreateUniformGrid reverse() {null}
		
		override CreateUniformGrid forward() {
			
			// find nearest parent that references an ASTModuleNode
			val ancestorConcept = findNearestAncestor(ASTModuleNode)
			val moduleNode = ancestorConcept?.ASTRef as ASTModuleNode
			
			if (moduleNode == null) throw new CodeGenerationException("Cannot generate CreateUniformGrid function without parent node")
			
			val functionName = "CreateGrid_" + name.stripQuotes
			
			val code = 
'''

function «functionName»(rc)
    type(ESMF_Grid) :: «functionName»
    integer, intent(out), optional :: rc
    
    rc = ESMF_SUCCESS
    «functionName» = ESMF_GridCreateNoPeriDimUfrm(name=«name», &
    	minIndex=«minIndex.litArray», &
    	maxIndex=«maxIndex.litArray», &
    	minCornerCoord=«minCornerCoord.litArrayR8», &
    	maxCornerCoord=«maxCornerCoord.litArrayR8», &
    	rc=rc)
    
end function    

'''
			val fsn = parseLiteralProgramUnit(code) as ASTFunctionSubprogramNode
			moduleNode.moduleBody.add(fsn)
			this
		}
		
	}
	
	def static litArray(int[] intArray) {
		'''(/«FOR x : intArray SEPARATOR ', '»«x»«ENDFOR»/)'''
	}
	
	def static litArrayR8(double[] dblArray) {
		'''(/«FOR x : dblArray SEPARATOR ', '»«x»_ESMF_KIND_R8«ENDFOR»/)'''
	}
	
	def static stripQuotes(String str) {
		str.replaceAll("\"", "").replaceAll("'","")
	}
	
}