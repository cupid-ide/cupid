package org.earthsystemmodeling.cupid.cc

import org.eclipse.xtend.lib.annotations.Accessors

class CodeSubconcept {
    
    @Accessors
    private String name
    
    @Accessors
    private CodeConcept type
            
    @Accessors
    private int min
    
    @Accessors
    private int max
    
    new(CodeConcept type) {
        this(type.name, type, 1, 1)
    }
    
    new(String name, CodeConcept type, int min, int max) {
        this.name = name
        this.type = type
        this.min = min
        this.max = max
    }
    
    
}
