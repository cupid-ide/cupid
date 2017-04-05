package org.earthsystemmodeling.cupid.cc.mapping

import org.eclipse.xtend.lib.annotations.Accessors
import org.earthsystemmodeling.cupid.cc.types.MTPType

class MappingTypeParameter {
    
    @Accessors
    String name
    
    @Accessors
    //MTPType<?> type
    Class<? extends MTPType<?>> type
        
    new(String name, Class<? extends MTPType<?>> type) {
        this.name = name
        this.type = type
    }
        
    override toString() {
        name + " (" + type.simpleName + ")"
    }
    
}
