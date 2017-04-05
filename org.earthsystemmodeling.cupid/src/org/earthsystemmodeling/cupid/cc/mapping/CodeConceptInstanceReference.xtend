package org.earthsystemmodeling.cupid.cc.mapping

import org.earthsystemmodeling.cupid.cc.CodeConceptInstance
import org.earthsystemmodeling.cupid.cc.types.MTPType

class CodeConceptInstanceReference extends ReferenceMTVBinding {
    
    new(MappingTypeParameter boundTo, String reference) {
    	this(boundTo, reference, null)
    }
    
    new(MappingTypeParameter boundTo, String reference, MappingTypeBinding binding) {
        super(null, reference)
        this.boundTo = boundTo
        if (binding != null) {
        	this.binding = binding
        }
    }
    
    //static val PATH_REGEX = "((\\.\\.)|(\\w+)|(@\\w+))\\/?";
	//static val Pattern PATH_PATTERN = Pattern.compile(PATH_REGEX);

	//final Matcher matcher = pattern.matcher(string);

    protected def MTPType<?> resolvePath() {
    	
    	var segments = reference.split("/")
    	var CodeConceptInstance current
    	if (segments.get(0) == "..") {
    		current = binding.currentContext
    		segments = segments.drop(1) //already took care of first segment
    	}
    	else {
    		current = binding.currentInstance
    	}
    	    	
    	for (seg : segments) {
    		if (seg == "..") {
    			current = current.parent
    		}
    		else if (seg.startsWith("@")) {
    			if (current != null) {
    				if (seg.startsWith("@@")) {
    					return current.getAnnotationRecursive(seg.substring(2))
    				}
    				else {
    					return current.get(seg.substring(1))
    				}
    			}
    			else {
    				/*
    				val dflt = current.type.getAnnotationDefault(seg.substring(1))
    				if (dflt != null) {
        				return dflt
        			}
        			else {
        				throw new MappingTypeException("No current instance or default defined for annotation: " + reference)
        			}
        			* 
        			*/
        			return null
    			}
    		}
    		else if (seg.endsWith("*")) {
    			return current.getChild(seg.substring(0, seg.length-1))?.match         
    		}
    		else {
    			current = current.getChild(seg)
    		}
    		
    	}
    	
    	//return current
    	return null
    	
    }
    
    
    override getValue() {
        
        if (reference != null) {
        	val refVal = resolvePath
        	if (refVal != null && !boundTo.type.isInstance(refVal)) {
                throw new IllegalVariableAssignment(boundTo.name, boundTo.type, refVal.class)
            }
            else {
            	value = refVal
            	return value
            }
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
        //TODO: handle "match" here??
        else {
            //handle everything else, i.e., path
            throw new UnsupportedOperationException("Cannot handle path expression: " + reference + " [" + boundTo + "].")
        }
    }
    
    /*
    def getValueOLD() {
        
        if (reference != null) {
        	resolvePath
        }
        
        if (reference != null && reference.startsWith("@")) {
        	if (binding.currentInstance == null) {
        		//see if there is a default defined
        		val dflt = binding.concept.getAnnotationDefault(reference.substring(1))
        		if (dflt != null) {
        			return dflt as T
        		}
        		else {
        			throw new MappingTypeException("No current instance or default defined for annotation: " + reference)
        		}
        	}
        	
        	var Object refVal
        	if (reference.startsWith("@@")) {
        		val annotationName = reference.substring(2)
        		refVal = binding.currentInstance.getAnnotationRecursive(annotationName)
        	}
        	else {
        		val annotationName = reference.substring(1)
        		refVal = binding.currentInstance.get(annotationName)
        	}
        	
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
    */
    
    override clone(MappingTypeBinding newBinding) {
        new CodeConceptInstanceReference(boundTo, reference, newBinding)
    }
				
	override setValue(MTPType<?> value) {
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