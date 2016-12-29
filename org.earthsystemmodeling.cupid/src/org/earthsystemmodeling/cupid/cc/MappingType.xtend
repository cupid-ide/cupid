package org.earthsystemmodeling.cupid.cc

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Map

class MappingType {
    
    @Accessors
    CodeConcept mappedTo
    
    @Accessors
    MappingType refines
    
    @Accessors
    Map<String, Class<?>> inputs = newLinkedHashMap
    
    @Accessors
    Map<String, Class<?>> outputs = newLinkedHashMap
    
    Map<String, Object> inputValues = newLinkedHashMap
    
    //List<Map<String, Object>> outputValues = newLinkedList
    
    @Accessors
    private (MappingType, MappingResultSet)=>void find
           
    //@Accessors
    //private (P1)=>void generate

    new() {}
    
    new(Map<String, Class<?>> inputs, Map<String, Class<?>> outputs) {
        this.inputs = inputs
        this.outputs = outputs
    }
    
    new(Class<?> contextType, Class<?> matchType) {
        this(#{"context" -> contextType}, #{"match" -> matchType})
    }

    def Class<?> getInputType(String name) {
        if (inputs.containsKey(name)) {
            inputs.get(name)
        }
        else if (refines != null) {
            refines.getInputType(name)
        }
        else {
            null
        }
    }
    
    def <T> T get(String name) {
        if (getInputType(name)==null) {
            throw new MappingTypeException("Mapping Type does not have input " + name)
        }
        else if (inputValues.containsKey(name)) {
            inputValues.get(name) as T
        }
        else if (refines != null) {
            refines.get(name)
        }
        else {
            throw new MappingTypeException("Cannot get value of unbound input parameter: " + name)
        }
        //if (input value is a String and starts with '$') then
        //   return mappedTo.getParameterValue(name with $ removed)
        //end if
    }    
     
    def <T> T context() {
        get("context")
    } 
    
    def Class<?> matchType() {
        outputs.getOrDefault("match", null)
    }
                
    def doFind() {
        val resultset = new MappingResultSet(this)
        if (refines != null) {
            refines.find.apply(this, resultset)
        }
        find.apply(this, resultset)
        resultset
    }
    
    def MappingType refine(Map<String,Class<?>> inputs) {
        val mt = new MappingType(inputs, null)
        mt.refines = this
        mt.find = [me,result|this.find.apply(me, result)]
        mt   
    }
    
    def MappingType refine(Map<String,Class<?>> inputs, Map<String,Class<?>> outputs) {
        val mt = new MappingType(inputs, outputs)
        mt.refines = this
        mt.find = [me,result|this.find.apply(me, result)]
        mt   
    }
    
    def MappingType withParams(Map<String,Object> inputs) {
        val mt = new MappingType
        mt.refines = this
        mt.inputValues = inputs //TODO: validate these
        mt.find = [me,result|this.find.apply(me, result)]
        mt
    }
    
}