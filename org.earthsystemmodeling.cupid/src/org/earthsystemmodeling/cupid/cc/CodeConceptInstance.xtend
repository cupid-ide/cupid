package org.earthsystemmodeling.cupid.cc

import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import org.earthsystemmodeling.cupid.cc.mapping.IllegalVariableAssignment
import org.earthsystemmodeling.cupid.cc.types.MTPType

class CodeConceptInstance {
    
    @Accessors
    CodeConcept type
    
    @Accessors
    CodeConceptInstance parent
    
    @Accessors
    CCIStatus status
    
    //type of match is type.mappingType.matchType
    @Accessors
    MTPType<?> match
       
    @Accessors
    Map<String, MTPType<?>> annotations = newLinkedHashMap
    //Map<String, Object> annotations = newLinkedHashMap
    
    List<CodeConceptInstance> children = newLinkedList
    
    protected new(CodeConcept type, CodeConceptInstance parent) {
        this(type, parent, null)
    }
    
    protected new(CodeConcept type, CodeConceptInstance parent, Object match) {
        this.type = type
        this.parent = parent
        setMatch(match)
        if (parent != null) {
            parent.addChild(this)
        }
    }
    
    def void setStatus(CCIStatus status, boolean recursive) {
    	this.status = status
    	if (recursive) {
    		children.forEach[c|c.setStatus(status, recursive)]
    	}
    }
    
    def setMatch(Object match) {
        if (match != null) {
            if (type?.mappingType != null) {
                if (!type.mappingType.matchType.isInstance(match)) {
                    throw new CodeConceptException("Match for concept " + type.getName + " must be of type " + type.mappingType.matchType.simpleName + " (given type " + match.class.simpleName + ").")
                }
            }
        }
        this.match = match
    }
    
    def <T extends MTPType<?>> T nearestAncestorWithMatch(Class<T> typeToFind) {
        if (type.mappingType?.matchType == typeToFind) {
            if (match != null) return match as T
        }
        if (parent != null) {
            parent.nearestAncestorWithMatch(typeToFind)
        }
    }
    
    //def putAnnotations(Map<String, Object> annotations) {
    //    this.annotations.putAll(annotations)
    //}
    
    def addChild(CodeConceptInstance child) {
    	addChild(child, CCIStatus.RECONCILED)
    }
    
    def addChild(CodeConceptInstance child, CCIStatus status) {
        
        //if (type != null) {
        val subconcept = type.getSubconcepts.filter(SingleCodeSubconcept).findFirst[s|s.concept == child.type]
        if (subconcept == null) {
            throw new CodeConceptException("Code concept " + type.name + " does not contain subconcept " + child.type.name)
        }
	    //}
        
        child.setStatus(status, true)
        if (!children.contains(child)) {
           	children.add(child)
        }
        
        child
    }
    
    def addChildWithDefaults(CodeConcept type, boolean recursive) {
    	val instance = type.newInstanceWithDefaults(this, recursive)
    	addChild(instance, CCIStatus.ADDED)
    }
    
    def removeChild(CodeConceptInstance child) {
    	if (!children.contains(child)) {
    		throw new CodeConceptException("Attempt to remove child not in list: " + child)
    	}
    	children.remove(child)
    }
    
    
    def getChildren() {
    	children
    }
    
    def getChildren(CodeConcept ofType) {
        children.filter[c|c.type == ofType]
    }
    
    def getChild(String conceptName) {
        children.findFirst[c|c.type.name == conceptName]
    }
    
    def put(String annotationKey, MTPType<?> annotationValue) {
        if (!type.hasAnnotation(annotationKey)) {
        	throw new CodeConceptException("Concept " + type.name + " does not have annotation named " + annotationKey)
        }
        else if (annotationValue != null && !type.getAnnotationType(annotationKey).isInstance(annotationValue)) {
        	throw new IllegalVariableAssignment(annotationKey, type.getAnnotationType(annotationKey), annotationValue.class)
        }
        annotations.put(annotationKey, annotationValue)
    }
    
    def get(String annotationKey) {
        if (!type.hasAnnotation(annotationKey)) {
        	throw new CodeConceptException("Concept " + type.name + " does not have annotation named " + annotationKey)
        }
    	annotations.get(annotationKey)
    }
  
  	def MTPType<?> getAnnotationRecursive(String annotationKey) {
  		if (annotations.containsKey(annotationKey)) {
  			annotations.get(annotationKey)
  		}
  		else if (parent != null) {
  			parent.getAnnotationRecursive(annotationKey)
  		}
  		else {
  			throw new CodeConceptException("No annotation in instance tree named " + annotationKey)
  		}
  	}   
   
    override toString() {
        '''
        CodeConceptInstance of: «type.getName»  (Status = «status»)
            
            Annotations: «FOR a : getAnnotations.entrySet»
                - «a.key» = «a.value»«ENDFOR»
            
            Children: «FOR c : children»
                - «c.toString»
            «ENDFOR»
        '''
    }
    
    
}				