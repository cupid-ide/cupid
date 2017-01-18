package org.earthsystemmodeling.cupid.cc

import org.eclipse.xtend.lib.annotations.Accessors

abstract class CodeSubconcept {
    
    //parent in the concept hierarchy
    private CodeConcept parent
    
    @Accessors
    private String name
    
    //an essential subconcept is required for the parent to match
    @Accessors        
    private boolean essential
            
    @Accessors
    private int min
    
    @Accessors
    private int max
    
    //new(CodeConcept parent, String name) {
    //    this(parent, name, false, 1, 1)
    //}
    
    new(CodeConcept parent, String name, boolean essential, int min, int max) {
        this.parent = parent
        this.name = name
        this.min = min
        this.max = max
        this.essential = essential
        if (max != -1 && min > max) {
            throw new CodeConceptException("Min should be greater than max in subconcept: " + name)
        }
    }
    
    //abstract def void reverse(CodeConceptInstance parent) throws EssentialConstraintViolation
    
    //abstract def List<CodeConceptInstance> reverseAll(CodeConceptInstance parent)   
    
}
