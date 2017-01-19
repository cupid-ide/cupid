package org.earthsystemmodeling.cupid.cc.mapping

class TemplateParameterReference<T> extends ReferenceMTVBinding<T> {
    
    new(String reference) {
        super(null, reference)
    }  
        		
	override setValue(T value) {
		throw new UnsupportedOperationException
	}
	
	override clone(MappingTypeBinding newBinding) {
		throw new UnsupportedOperationException
	}
       
}
