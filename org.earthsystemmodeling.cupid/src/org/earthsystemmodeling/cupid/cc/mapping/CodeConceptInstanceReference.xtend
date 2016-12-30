package org.earthsystemmodeling.cupid.cc.mapping

import org.earthsystemmodeling.cupid.cc.CodeConceptInstance

class CodeConceptInstanceReference<T> extends ReferenceMTVBinding<T> {
    
    T value
    
    new(String reference) {
        super(reference)
    }
    
    override isResolved() {
        value != null
    }
    
    override resolve() {
        value
    }
    
    def bindWith(CodeConceptInstance instance) {

        //special case
        if (boundTo.name.equals("context")) {
            value = instance.nearestAncestorWithMatch(boundTo.type)
            if (value != null && !boundTo.type.isInstance(value)) {
                throw new IllegalVariableAssignment(boundTo.name, boundTo.type, value.class)   
            }
            //if (!isBound) {
            //    throw new MappingTypeException("No context of type " + type.simpleName + " found in concept instance tree.")
            //}  
        }
        else {
            //handle everything else, i.e., path
            throw new UnsupportedOperationException("Not handling path expressions yet: " + boundTo)
        }
        
    }
    
    
    
}