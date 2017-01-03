package org.earthsystemmodeling.cupid.cc.mapping

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Map

class MappingTypeBinding {
    
    @Accessors
    MappingType mappingType
    
    @Accessors
    Map<MappingTypeVariable<?>, MappingTypeVariableBinding<?>> bindings
    
    new(MappingType mappingType) {
        this.mappingType = mappingType
    }
    
    def <T> T getValue(MappingTypeVariable<T> variable) {
        bindings.get(variable).value as T
    }
    
    def <T> T getValue(String variable) {
        bindings.get(variable).value as T
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
        bindings.put(variable, binding)
    }
    
    def put(String variable, MappingTypeVariableBinding<?> binding) {
        if (!mappingType.hasParameter(variable)) {
            throw new MappingTypeException("Mapping type " + mappingType.name + " does not have parameter named: " + variable)
        }
        put(mappingType.getParameter(variable), binding)
    }
    
    def fullyBound() {
        mappingType.getParameters().forall[p|bindings.containsKey(p)]
    }
    
    def doFind() {
        mappingType.doFind(this)
    }
    
    def <T> T context() {
        getValue("context")
    } 
    
}