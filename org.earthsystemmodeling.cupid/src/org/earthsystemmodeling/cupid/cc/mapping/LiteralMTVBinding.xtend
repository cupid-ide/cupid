package org.earthsystemmodeling.cupid.cc.mapping

import org.earthsystemmodeling.cupid.cc.types.MTPType

class LiteralMTVBinding extends MappingTypeParameterBinding {
   
    MTPType<?> value

    new(MTPType<?> value) {
        this.value = value
    }

    //override isResolved() {
    //    true
    //}  
    
    override getValue() {
        value
    }
    
    override clone(MappingTypeBinding newBinding) {
        val cl = new LiteralMTVBinding(this.value)
        cl.binding = newBinding
        cl
    }
				
	override setValue(MTPType<?> value) {
		throw new UnsupportedOperationException
	}
           
}
