package org.earthsystemmodeling.cupid.cc

import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List

class CodeConceptInstance {
    
    @Accessors
    private CodeConcept type
    
    @Accessors
    private CodeConceptInstance parent
    
    //traceability links to code patterns
    //@Accessors
    //private Map<String, Object> mappings = newLinkedHashMap
    
    //type of match is type.mappingType.matchType
    @Accessors
    private Object match
       
    @Accessors
    private Map<String, Object> annotations = newLinkedHashMap
    
    //private List<CodeSubconceptInstance> subconceptInstances = newLinkedList
    
    private List<CodeConceptInstance> children = newLinkedList
    
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
    
    /*
    def putMapping(String name, Object ref) {
        if (!type.getMappingTypes.containsKey(name)) {
            throw new CodeConceptException("Code Concept " + type.name + " does not contain a mapping named " + name + ".")
        }
        else if (type.getMappingTypes.get(name).isInstance(ref)) {
            throw new CodeConceptException("Mapping type " + name + " should be of type " + 
                type.getMappingTypes.get(name).simpleName + " but instead is of type " + ref.class.simpleName + ".")
        }
        else {
            mappings.put(name, ref)
        }
    }
    
    def <T> T getMapping(String name) {
        if (!type.getMappingTypes.containsKey(name)) {
            throw new CodeConceptException("Code Concept " + type.name + " does not contain a mapping named " + name + ".")
        }
        //not checking type
        mappings.get(name) as T
    }
    */
    
    /*
    def addSubconceptInstance(CodeSubconceptInstance subconceptInstance) {
        if (!type.getSubconcepts.contains(subconceptInstance.type)) {
            throw new CodeConceptException("CodeConcept " + type.name + " does not contain subconcept " + subconceptInstance.type.name)
        }
        else {
            subconceptInstances.add(subconceptInstance)
        }
    }
    */
    
    def addChild(CodeConceptInstance child) throws CodeConceptException, CodeConceptConstraintViolation {
        val subconcept = type.getSubconcepts.findFirst[s|s.type == child.type]
        if (subconcept == null) {
            throw new CodeConceptException("CodeConcept " + type.name + " does not contain subconcept " + child.type.name)
        }
        else if (subconcept.max != -1 && getChildren(child.type).size >= subconcept.max) {
            throw new CodeConceptConstraintViolation('''Cannot add child of type «child.type.name» to CodeConcept of type «type.name» because it will exceed the maximum allowed («subconcept.max»)''')
        }
        else {
            children.add(child)
        }
    }
    
    def getChildren(CodeConcept ofType) {
        children.filter[c|c.type == ofType]
    }
    
    def put(String annotationKey, Object annotationValue) {
        annotations.put(annotationKey, annotationValue)
    }
    
    //def <T> T getSourceRef() {
    //    type.mapsTo.cast(sourceRef) as T
    //}
    
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
					