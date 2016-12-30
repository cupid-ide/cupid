package org.earthsystemmodeling.cupid.cc.mapping

import org.earthsystemmodeling.cupid.cc.CodeConcept

class CodeConceptParameterReference<T> extends ReferenceMTVBinding<T> {
    
    T value
    
    new(String reference) {
        super(reference)
    }
    
    def void bindWith(CodeConcept concept) {
        //assumes name is same as concept parameter name
        val bindingValue = concept.getParameterValue(reference) as T
        if (bindingValue != null) {
            this.value = value
        }
    }
    
    override isResolved() {
        value != null
    }
    
    override resolve() {
        value
    }
    
}
