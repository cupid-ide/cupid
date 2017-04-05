package org.earthsystemmodeling.cupid.cc.mapping

import org.eclipse.xtend.lib.annotations.Accessors
import org.earthsystemmodeling.cupid.cc.types.MTPType

abstract class MappingTypeParameterBinding {
    
    @Accessors
    MappingTypeBinding binding
    
    @Accessors
    MappingTypeParameter boundTo
    
    //abstract def boolean isResolved()
    
    abstract def MTPType<?> getValue() throws UnresolvedVariableAccessException
    
    abstract def void setValue(MTPType<?> value)
    
    abstract def MappingTypeParameterBinding clone(MappingTypeBinding newBinding)
        
    //abstract def T resolve()
    
}