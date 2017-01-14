package org.earthsystemmodeling.cupid.cc

import org.eclipse.core.resources.IFile
import org.eclipse.photran.internal.core.vpg.PhotranVPG
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.earthsystemmodeling.cupid.cc.mapping.MappingType

class BootstrapCodeConcept {
    
    CodeConcept type
    
    new(CodeConcept type) {
        this.type = type    
    }
    
    def fromFile(IFile input) {
        val ast = PhotranVPG.instance.acquireTransientAST(input)
        if (ast==null) throw new Exception("NULL AST")
        
        val moduleNode = ast.root?.programUnitList?.filter(ASTModuleNode).head
        
        val rootMappingType = new MappingType("MappingRoot", ASTModuleNode, ASTModuleNode)
        val rootConcept = new CodeConcept("ConceptRoot", rootMappingType) => [
            addSubconcept(type.name, type, true, 1, 1)
        ]
        val cci = rootConcept.newInstance(null, moduleNode)       
        
        type.reverse(cci)
        cci
    }
    
}
