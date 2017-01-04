package org.earthsystemmodeling.cupid.cc.mapping

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Map
import java.util.List
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance

class MappingTypeBinding {
    
    @Accessors
    MappingType mappingType
    
    @Accessors
    Map<MappingTypeVariable<?>, MappingTypeVariableBinding<?>> bindings = newLinkedHashMap
    
    @Accessors(PROTECTED_GETTER)
    CodeConceptInstance currentContext
    
    new(MappingType mappingType) {
        this.mappingType = mappingType
    }
    
    def <T> T getValue(MappingTypeVariable<T> variable) {
        bindings.get(variable).value as T
    }
    
    def <T> T getValue(String variable) {
        val mtv = mappingType.getParameter(variable)
        bindings.get(mtv).value as T
    }
    
    def <T> MappingTypeVariableBinding<T> get(MappingTypeVariable<T> variable) {
        bindings.get(variable) as MappingTypeVariableBinding<T>
    }
    
    def <T> MappingTypeVariableBinding<T> get(String variable) {
        val mtv = bindings.keySet.findFirst[v|v.name==variable]
        bindings.get(mtv) as MappingTypeVariableBinding<T>
    }
    
    def put(MappingTypeVariable<?> variable, MappingTypeVariableBinding<?> binding) {
        if (!mappingType.hasParameter(variable)) {
            throw new MappingTypeException("Mapping type " + mappingType.name + " does not have parameter named: " + variable.name)
        }
        binding.binding = this
        bindings.put(variable, binding)
    }
    
    def put(String variable, MappingTypeVariableBinding<?> binding) {
        if (!mappingType.hasParameter(variable)) {
            throw new MappingTypeException("Mapping type " + mappingType.name + " does not have parameter named: " + variable)
        }
        put(mappingType.getParameter(variable), binding)
    }
    
    def fullyBound() {
        unbound.size == 0
    }
    
    def List<MappingTypeVariable<?>> unbound() {
         val retList = newLinkedList
         //retList.addAll(mappingType.getParameters().filter[p|!bindings.containsKey(p)])
         retList.addAll(mappingType.getParameters().filter[p|!bindings.containsKey(p) && !(p.name == "context") && !(p.name == "match")])
         retList
    }
    
    def doFind(CodeConceptInstance parent) {
        currentContext = parent
        val resultset = mappingType.doFind(this)
        currentContext = null
        return resultset
    }
    
    def <T> T context() {
        getValue("context")
    } 
    
}