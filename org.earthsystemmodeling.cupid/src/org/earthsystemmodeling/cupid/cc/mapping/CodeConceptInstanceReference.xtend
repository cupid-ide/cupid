package org.earthsystemmodeling.cupid.cc.mapping

import org.earthsystemmodeling.cupid.cc.CodeConceptInstance

class CodeConceptInstanceReference<T> extends ReferenceMTVBinding<T> {
    
    new(MappingTypeVariable<T> boundTo, String reference) {
        super(reference)
        this.boundTo = boundTo
    }
    
    def resolve(CodeConceptInstance instance) {
        
        value = null
        
        //special case
        if (boundTo.name.equals("context")) {
            value = instance.nearestAncestorWithMatch(boundTo.type)
            if (value != null && !boundTo.type.isInstance(value)) {
                throw new IllegalVariableAssignment(boundTo.name, boundTo.type, value.class)   
            }
        }
        else {
            //handle everything else, i.e., path
            throw new UnsupportedOperationException("Not handling path expressions yet: " + boundTo)
        }
    }
    
    override CodeConceptInstanceReference<T> clone() {
        new CodeConceptInstanceReference<T>(boundTo, reference)
    }
    
}