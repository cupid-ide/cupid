package org.earthsystemmodeling.cupid.cc.mapping

import org.eclipse.xtend.lib.annotations.Accessors

class MappingTypeVariable<T> {
    
    @Accessors
    protected String name
    
    @Accessors
    protected Class<T> type
        
    new(String name, Class<T> type) {
        this.name = name
        this.type = type
    }
        
    override toString() {
        name + " (" + type.simpleName + ")"
    }
    
}
