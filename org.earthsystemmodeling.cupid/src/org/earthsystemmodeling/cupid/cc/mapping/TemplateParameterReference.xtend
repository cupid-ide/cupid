package org.earthsystemmodeling.cupid.cc.mapping

import org.earthsystemmodeling.cupid.cc.CodeConcept

class TemplateParameterReference<T> extends ReferenceMTVBinding<T> {
    
    new(String reference) {
        super(reference)
    }  
    
    def resolve(CodeConcept concept) {
        //val bindingValue = concept.getParameterValue(reference) as T
        //if (bindingValue != null) {
        //    value = bindingValue
        //}
    }
    
    override clone() {
        throw new UnsupportedOperationException()
    }
       
}
