package org.earthsystemmodeling.cupid.cc.mapping

import org.eclipse.xtend.lib.annotations.Accessors

abstract class ReferenceMTVBinding<T> extends MappingTypeVariableBinding<T> {
    
    @Accessors
    String reference
    
    new(String reference) {
        this.reference = reference
    }
    
}