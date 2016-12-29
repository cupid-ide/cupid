package org.earthsystemmodeling.cupid.cc

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List

class CodeSubconceptInstance {
    
    @Accessors
    CodeSubconcept type
    
    @Accessors
    CodeConceptInstance parent
    
    //will support multiple values if needed
    List<CodeConceptInstance> instances = newLinkedList
    
    new(CodeSubconcept type, CodeConceptInstance parent) {
        this(type, parent, null)
    }
    
    new(CodeSubconcept type, CodeConceptInstance parent, CodeConceptInstance instance) {
        this.type = type
        this.parent = parent
        //this.parent.addSubconceptInstance(this)
        if (instance != null) {
            instances.add(instance)
        }
    }
    
    def getInstance() {
        if (instances.size > 0) instances.get(0)
    }
    
    def getInstances() {
        instances
    }
    
    def addInstance(CodeConceptInstance instance) {
        instances.add(instance)
    }
    
    override toString() {
        '''
        CodeSubconceptInstance: «type.getName»
        «FOR ci : instances»
            - «ci.toString»
        «ENDFOR»
        '''
    }
    
    
}