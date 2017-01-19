package org.earthsystemmodeling.cupid.cc.mapping

class CodeConceptInstanceReference<T> extends ReferenceMTVBinding<T> {
    
    new(MappingTypeVariable<T> boundTo, String reference) {
    	this(boundTo, reference, null)
    }
    
    new(MappingTypeVariable<T> boundTo, String reference, MappingTypeBinding binding) {
        super(null, reference)
        this.boundTo = boundTo
        if (binding != null) {
        	this.binding = binding
        }
    }
    
    override getValue() {
        if (reference != null && reference.startsWith("@")) {
        	val annotationName = reference.substring(1)
        	if (binding.currentInstance == null) {
        		throw new MappingTypeException("No current instance found")
        	}
        	val refVal = binding.currentInstance.get(annotationName)
        	if (refVal != null && !boundTo.type.isInstance(refVal)) {
                throw new IllegalVariableAssignment(boundTo.name, boundTo.type, refVal.class)
            }
            value = refVal as T
            return value
        }
        else if (reference != null && reference.startsWith("../") && !reference.substring(3).contains("/")) {
            
            var Object refVal
            if (reference.endsWith("*")) {
            	//dereference match
            	val subconceptName = reference.substring(3, reference.length-1)
            	refVal = binding.currentContext.getChild(subconceptName)?.match
            }
            else {
            	//concept instance itself
            	val subconceptName = reference.substring(3)
            	refVal = binding.currentContext.getChild(subconceptName)
            }
                        
            if (refVal != null && !boundTo.type.isInstance(refVal)) {
                throw new IllegalVariableAssignment(boundTo.name, boundTo.type, refVal.class)
            }
            value = refVal as T
            return value
        }
        else if (boundTo.name.equals("context")) {
            if (binding.currentInstance != null) {
            	value = binding.currentInstance.nearestAncestorWithMatch(boundTo.type)
            }
            else if (binding.currentContext != null) {
            	value = binding.currentContext.nearestAncestorWithMatch(boundTo.type)
            }
            else {
            	throw new MappingTypeException("No context information available")
            }
            return value
        }
        else {
            //handle everything else, i.e., path
            throw new UnsupportedOperationException("Cannot handle path expression: " + reference + " [" + boundTo + "].")
        }
    }
    
    override clone(MappingTypeBinding newBinding) {
        new CodeConceptInstanceReference<T>(boundTo, reference, newBinding)
    }
				
	override setValue(T value) {
		if (reference != null && reference.startsWith("@")) {
        	val annotationName = reference.substring(1)
        	binding.currentInstance.put(annotationName, value)
        }
        else if(boundTo.name.equals("match")) {
        	binding.currentInstance.match = value
        }
        else {
			throw new UnsupportedOperationException("Cannot set value for reference: " + reference)
		}
	}
    
}