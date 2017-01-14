package org.earthsystemmodeling.cupid.cc.mapping

import org.eclipse.xtend.lib.annotations.Accessors

abstract class MappingTypeVariableBinding<T> {
    
    @Accessors
    MappingTypeBinding binding
    
    @Accessors
    MappingTypeVariable<T> boundTo
    
    abstract def boolean isResolved()
    
    abstract def T getValue() throws UnresolvedVariableAccessException
    
    abstract def void setValue(T value)
    
    abstract override MappingTypeVariableBinding<T> clone()
        
    //abstract def T resolve()
    
}