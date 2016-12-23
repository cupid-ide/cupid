package org.earthsystemmodeling.cupid.cc

abstract class RootCodeConcept<R> extends CodeConcept {
    
    //params: self, source
    //@Accessors
    //protected (RootCodeConcept<R>, R)=>CodeConceptInstance reverseFromSource
    
    new(String name, RootCodeConcept<R> refines) {
        super(name, null)
     }
    
    abstract def CodeConceptInstance reverseFromSource(R source)
    
}
