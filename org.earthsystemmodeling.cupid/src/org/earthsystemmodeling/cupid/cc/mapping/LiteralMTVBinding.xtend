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
    
    override clone(MappingTypeBinding newBinding) {
        val cl = new LiteralMTVBinding<T>(this.value)
        cl.binding = newBinding
        cl
    }
				
	override setValue(T value) {
		throw new UnsupportedOperationException
	}
           
}
