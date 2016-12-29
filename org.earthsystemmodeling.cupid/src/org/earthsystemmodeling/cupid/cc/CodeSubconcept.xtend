package org.earthsystemmodeling.cupid.cc

import org.eclipse.xtend.lib.annotations.Accessors

class CodeSubconcept {
    
    //parent in the concept hierarchy
    private CodeConcept parent
    
    @Accessors
    private String name
    
    @Accessors
    private CodeConcept type
    
    //an essential subconcept is required for the parent to match
    @Accessors        
    private boolean essential
            
    @Accessors
    private int min
    
    @Accessors
    private int max
    
    new(CodeConcept parent, CodeConcept type) {
        this(parent, type.name, type, false, 1, 1)
    }
    
    new(CodeConcept parent, String name, CodeConcept type, boolean essential, int min, int max) {
        this.parent = parent
        this.name = name
        this.type = type
        this.min = min
        this.max = max
        this.essential = essential
    }
    
    /*
    def protected CodeConceptInstance reverse(CodeConceptInstance parent) throws CodeConceptConstraintViolation {       
        if (max == 1) {
            val cci = type.reverse(parent)
            if (cci == null) {
                if (min > 0) {
                    throw new CodeConceptConstraintViolation("Must be at least " + min + " instances of " + type.getName)
                }
                return null
            }
            else {
                type.newInstance(parent)
                //new CodeConceptInstance(this, parent, cci)
            }
        }
        else {
            val ccis = type.reverseAll(parent)
            if (ccis.size < min || ccis.size > max) {
                throw new CodeConceptConstraintViolation("Must be at between " + min + " and " + max + " instances of " + type.getName)
            }
            val csi = new CodeSubconceptInstance(this, parent)
            for (cci : ccis) {
                csi.addInstance(cci)
            }
            csi
        } 
    }
    */
    
}
