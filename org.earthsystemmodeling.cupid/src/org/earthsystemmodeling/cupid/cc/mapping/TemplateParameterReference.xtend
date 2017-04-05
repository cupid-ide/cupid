package org.earthsystemmodeling.cupid.cc.mapping

import org.earthsystemmodeling.cupid.cc.types.MTPType

class TemplateParameterReference extends ReferenceMTVBinding {
    
    new(String reference) {
        super(null, reference)
    }  
	
	override clone(MappingTypeBinding newBinding) {
		throw new UnsupportedOperationException
	}
	
	override setValue(MTPType<?> value) {
		throw new UnsupportedOperationException
	}
       
}
