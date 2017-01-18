package org.earthsystemmodeling.cupid.cc

import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import org.earthsystemmodeling.cupid.cc.mapping.IllegalVariableAssignment

class CodeConceptInstance {
    
    @Accessors
    CodeConcept type
    
    @Accessors
    CodeConceptInstance parent
    
    @Accessors
    CCIStatus status
    
    //type of match is type.mappingType.matchType
    @Accessors
    Object match
       
    @Accessors
    Map<String, Object> annotations = newLinkedHashMap
    
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
    
    def setMatch(Object match) {
        if (match != null) {
            if (type.mappingType != null) {
                if (!type.mappingType.matchType.isInstance(match)) {
                    throw new CodeConceptException("Match for concept " + type.getName + " must be of type " + type.mappingType.matchType.simpleName + " (given type " + match.class.simpleName + ").")
                }
            }
        }
        this.match = match
    }
    
    def <T> T nearestAncestorWithMatch(Class<T> typeToFind) {
        if (type.mappingType?.matchType == typeToFind) {
            if (match != null) return match as T
        }
        if (parent != null) {
            parent.nearestAncestorWithMatch(typeToFind)
        }
    }
    
    def putAnnotations(Map<String, Object> annotations) {
        //TODO; determine if annotations should be restricted by metamodel and check here
        this.annotations.putAll(annotations)
    }
    
    def addChild(CodeConceptInstance child) throws CodeConceptException, CodeConceptConstraintViolation {
        val subconcept = type.getSubconcepts.filter(SingleCodeSubconcept).findFirst[s|s.concept == child.type]
        if (subconcept == null) {
            throw new CodeConceptException("Code concept " + type.name + " does not contain subconcept " + child.type.name)
        }
        //else if (subconcept.max != -1 && getChildren(child.type).size >= subconcept.max) {
        //    throw new CodeConceptConstraintViolation('''Cannot add child of type «child.type.name» to CodeConcept of type «type.name» because it will exceed the maximum allowed («subconcept.max»)''')
        //}
        else {
            children.add(child)
        }
    }
    
    def removeChild(CodeConceptInstance child) {
    	if (!children.contains(child)) {
    		throw new CodeConceptException("Attempt to remove child not in list: " + child)
    	}
    	children.remove(child)
    }
    
    def getChildren(CodeConcept ofType) {
        children.filter[c|c.type == ofType]
    }
    
    def getChild(String conceptName) {
        children.findFirst[c|c.type.name == conceptName]
    }
    
    def put(String annotationKey, Object annotationValue) {
        if (!type.annotations.containsKey(annotationKey)) {
        	throw new CodeConceptException("Concept " + type.name + " does not have annotation named " + annotationKey)
        }
        else if (!type.annotations.get(annotationKey).isInstance(annotationValue)) {
        	throw new IllegalVariableAssignment(annotationKey, type.annotations.get(annotationKey), annotationValue.class)
        }
        annotations.put(annotationKey, annotationValue)
    }
    
    def get(String annotationKey) {
        if (!type.annotations.containsKey(annotationKey)) {
        	throw new CodeConceptException("Concept " + type.name + " does not have annotation named " + annotationKey)
        }
    	annotations.get(annotationKey)
    }
    
   	
   	def addEdit(CCIEdit edit) {
   		
   	}
   
   
    override toString() {
        '''
        CodeConceptInstance of: «type.getName» 
            
            Annotations: «FOR a : getAnnotations.entrySet»
                - «a.key» = «a.value»«ENDFOR»
            
            Children: «FOR c : children»
                - «c.toString»
            «ENDFOR»
        '''
    }
    
    
}				