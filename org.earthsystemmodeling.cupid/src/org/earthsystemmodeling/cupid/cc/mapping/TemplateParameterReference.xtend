package org.earthsystemmodeling.cupid.cc.mapping

class TemplateParameterReference<T> extends ReferenceMTVBinding<T> {
    
    new(String reference) {
        super(null, reference)
    }  
        
    override clone() {
        throw new UnsupportedOperationException
    }
				
	override setValue(T value) {
		throw new UnsupportedOperationException
	}
       
}
