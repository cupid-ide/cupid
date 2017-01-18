package org.earthsystemmodeling.cupid.cc

import org.eclipse.xtend.lib.annotations.Accessors

class SingleCodeSubconcept extends CodeSubconcept {
    
    @Accessors(PUBLIC_GETTER)
    CodeConcept concept
    
    @Accessors
    boolean includeByDefault
    
    new(CodeConcept parent, CodeConcept concept) {
        this(parent, concept, false, 1, 1, false)
    }
    
    new(CodeConcept parent, CodeConcept concept, boolean essential, int min, int max, boolean includeByDefault) {
        super(parent, concept.name, essential, min, max)
        this.concept = concept
        this.includeByDefault = includeByDefault
    }
    
    override toString() {
    	'''		- [«min»-«max»] (includeByDefault = «includeByDefault») «concept»'''
    }
    
    
}