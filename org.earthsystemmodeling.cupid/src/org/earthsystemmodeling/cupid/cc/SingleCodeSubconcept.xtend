package org.earthsystemmodeling.cupid.cc

import org.eclipse.xtend.lib.annotations.Accessors

class SingleCodeSubconcept extends CodeSubconcept {
    
    @Accessors(PUBLIC_GETTER)
    CodeConcept concept
    
    new(CodeConcept parent, CodeConcept concept) {
        this(parent, concept, false, 1, 1)
    }
    
    new(CodeConcept parent, CodeConcept concept, boolean essential, int min, int max) {
        super(parent, concept.name, essential, min, max)
        this.concept = concept
    }
    
    override reverse(CodeConceptInstance parent) {       
        if (max == 0 || max == 1) {
            val cci = concept.reverse(parent)
            if (essential) {
                if (cci == null && min > 0) {
                    throw new EssentialConstraintViolation("Missing essential subconcept")
                }
                else if (cci != null && max == 0) {
                    throw new EssentialConstraintViolation("Prohibited subconcept present")
                }
            }            
        }
        else {
            val ccis = concept.reverseAll(parent)
            if (essential && (ccis.size < min || ccis.size > max)) {
                throw new EssentialConstraintViolation("Must be at between " + min + " and " + max + " instances of " + concept.name)
            }           
        } 
    }
    
    override toString() {
    	'''		- [«min»-«max»] «concept»'''
    }
    
    
}