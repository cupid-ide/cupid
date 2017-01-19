package org.earthsystemmodeling.cupid.cc.mapping

import org.eclipse.xtend.lib.annotations.Accessors

abstract class ReferenceMTVBinding<T> extends MappingTypeVariableBinding<T> {
    
    protected T value
    
    @Accessors
    String reference
    
    new(MappingTypeBinding binding, String reference) {
        this.binding = binding
        this.reference = reference?.trim()
    }
    
    override isResolved() {
        value != null
    }
    
    override getValue() {
        if (value == null) {
            throw new UnresolvedVariableAccessException(boundTo.name)
        }
        value
    }
    
    
}