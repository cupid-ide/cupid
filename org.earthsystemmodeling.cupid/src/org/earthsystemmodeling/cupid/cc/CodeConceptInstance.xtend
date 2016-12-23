package org.earthsystemmodeling.cupid.cc

import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List

class CodeConceptInstance {
    
    @Accessors
    private CodeConcept type
    
    //type should be type.mapsTo
    private Object sourceRef
    
    @Accessors
    private Map<String, Object> annotations = newLinkedHashMap
    
    //@Accessors
    private Map<CodeSubconcept, List<CodeConceptInstance>> subconcepts = newLinkedHashMap
    
    protected new(CodeConcept type) {
        this(type, null)
    }
    
    protected new(CodeConcept type, Object sourceRef) {
        this.type = type
        this.sourceRef = sourceRef
    }
    
    def putAnnotations(Map<String, Object> annotations) {
        //TODO; determine if annotations should be restricted by metamodel and check here
        this.annotations.putAll(annotations)
    }
    
    def addSubconceptInstance(CodeSubconcept subconcept, CodeConceptInstance instance) {
        if (!type.getSubconcepts.contains(subconcept)) {
            throw new CodeConceptException("CodeConcept " + type.name + " does not contain subconcept " + subconcept.name)
        }
        else {
            val subconceptList = subconcepts.getOrDefault(subconcept, newLinkedList)
            if (subconcept.max <= 1 && subconceptList.size > 0) {
                throw new CodeConceptException("Cannot add multiple instances of subconcept " + subconcept.name + " to instance of " + type.name)
            }
            else {
                subconceptList.add(instance)
                subconcepts.put(subconcept, subconceptList)
            }
        }
    }
    
    def put(String annotationKey, Object annotationValue) {
        annotations.put(annotationKey, annotationValue)
    }
    
    def <T> T getSourceRef() {
        type.mapsTo.cast(sourceRef) as T
    }
    
    override toString() {
        '''
        CodeConceptInstance of: «type.getName» (SourceRef: «sourceRef.hashCode»)
        Annotations: «FOR a : getAnnotations.entrySet»
            - «a.key» = «a.value»«ENDFOR»
            
            «FOR s : subconcepts.entrySet»
            «s.key.name» : «FOR sc : s.value»
                - «sc.toString»
            «ENDFOR»
            «ENDFOR»
        '''
    }
    
    
}
					