package org.earthsystemmodeling.cupid.cc.mapping

class CodeConceptInstanceReference<T> extends ReferenceMTVBinding<T> {
    
    new(MappingTypeVariable<T> boundTo, String reference) {
        super(null, reference)
        this.boundTo = boundTo
    }
    
    override getValue() {
        if (reference != null && reference.startsWith("@")) {
        	val annotationName = reference.substring(1)
        	val refVal = binding.currentInstance.get(annotationName)
        	if (refVal != null && !boundTo.type.isInstance(refVal)) {
                throw new IllegalVariableAssignment(boundTo.name, boundTo.type, refVal.class)
            }
            value = refVal as T
            return value
        }
        else if (reference != null && reference.startsWith("../") && !reference.substring(3).contains("/")) {
            val subconceptName = reference.substring(3)
            val refVal = binding.currentContext.getChild(subconceptName)?.match
            if (!boundTo.type.isInstance(refVal)) {
                throw new IllegalVariableAssignment(boundTo.name, boundTo.type, refVal.class)
            }
            value = refVal as T
            return value
        }
        else if (boundTo.name.equals("context")) {
            value = binding.currentContext.nearestAncestorWithMatch(boundTo.type)
            return value
        }
        else {
            //handle everything else, i.e., path
            throw new UnsupportedOperationException("Cannot handle path expression: " + reference + " [" + boundTo + "].")
        }
    }
    
    override clone() {
        new CodeConceptInstanceReference<T>(boundTo, reference)
    }
				
	override setValue(T value) {
		if (reference.startsWith("@")) {
        	val annotationName = reference.substring(1)
        	binding.currentInstance.put(annotationName, value)
        }
        else {
			throw new UnsupportedOperationException("Cannot set value for reference: " + reference)
		}
	}
    
}