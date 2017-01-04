package org.earthsystemmodeling.cupid.cc.mapping

class LiteralMTVBinding<T> extends MappingTypeVariableBinding<T> {
   
    T value

    new(T value) {
        this.value = value
    }

    override isResolved() {
        true
    }  
    
    override getValue() {
        value
    }
    
    override clone() {
        new LiteralMTVBinding<T>(this.value)
    }
           
}
