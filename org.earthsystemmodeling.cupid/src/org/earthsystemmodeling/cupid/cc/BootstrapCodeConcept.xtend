package org.earthsystemmodeling.cupid.cc

import org.eclipse.core.resources.IFile
import org.eclipse.photran.internal.core.vpg.PhotranVPG
import org.eclipse.photran.internal.core.parser.ASTModuleNode

class BootstrapCodeConcept {
    
    CodeConcept type
    
    new(CodeConcept type) {
        this.type = type    
    }
    
    def fromFile(IFile input) {
        val ast = PhotranVPG.instance.acquireTransientAST(input)
        if (ast==null) throw new Exception("NULL AST")
        
        val moduleNode = ast.root?.programUnitList?.filter(ASTModuleNode).head
        val cci = type.newInstance(null)
        type.reverse(cci)
        cci
    }
    
}
