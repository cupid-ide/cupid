package org.earthsystemmodeling.cupid.cc

import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.photran.internal.core.parser.IASTNode

class ASTNodeCodeConcept<N extends IASTNode, O extends IASTNode> extends org.earthsystemmodeling.cupid.cc.nuopc.CodeConcept {
          
    @Accessors
    protected (N)=>O find
    
    @Accessors
    protected (N)=>Iterable<O> findAll
    
    @Accessors
    protected (O, org.earthsystemmodeling.cupid.cc.nuopc.CodeConceptInstance)=>void populate
    
    new(String name) {
        super(name)   
                
        //default procedure for single value
        erse = [me, parentcci|
            val out = find.apply(parentcci.tokenRef.findToken.findNearestAncestor(IASTNode) as N)
            if (out != null) {
                val cci = new org.earthsystemmodeling.cupid.cc.nuopc.CodeConceptInstance(me, out.findFirstToken.tokenRef)
                populate.apply(out, cci)
            
                //reverse children
                children.forEach[c|
                    if (!c.child.reverse.apply(me, cci)) throw new Exception  //need to break
                ]
                return true                
            } 
            false
        ]
    }
    
    
}
		