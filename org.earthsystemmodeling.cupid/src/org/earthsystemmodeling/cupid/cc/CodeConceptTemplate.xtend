package org.earthsystemmodeling.cupid.cc

import org.earthsystemmodeling.cupid.cc.CodeConcept
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Map
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding
import org.earthsystemmodeling.cupid.cc.mapping.TemplateParameterReference
import org.earthsystemmodeling.cupid.cc.mapping.LiteralMTVBinding
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariableBinding
import org.earthsystemmodeling.cupid.cc.mapping.MappingType

class CodeConceptTemplate extends CodeConcept {
    
    @Accessors
    List<String> parameters
    
    new(String name, List<String> parameters) {
        super(name)
        this.parameters = parameters
    }
    
    new(String name, MappingType mappingType, Map<String, Object> mappingTypeParameters) {
        super(name, mappingType, mappingTypeParameters)
    }
    
    def CodeConcept instantiate(Map<String,Object> parameterValues) {
        instantiate(null, parameterValues)    
    }
    
    def CodeConcept instantiate(String name, Map<String,Object> parameterValues) {
        val concept = new CodeConcept({if (name==null) this.name else name})
        val binding = new MappingTypeBinding(this.binding.mappingType)
        for (e : this.binding.bindings.entrySet) {
            if (e.value instanceof TemplateParameterReference<?>) {                
                //TODO: figure out the $<ref> syntax, extend if needed - this is very basic now
                //replace template parameter with actual value, remove the "$" first
                val refVar = (e.value as TemplateParameterReference<?>).reference.substring(1)
                if (parameterValues.containsKey(refVar)) {
                    binding.put(e.key, new LiteralMTVBinding(parameterValues.get(refVar)))
                }
                else {
                    throw new CodeConceptException("Cannot instantiate template due to missing parameter value: " + e.key.name)
                }
            }
            else {
                binding.put(e.key, e.value.clone())
            }
        }
        concept.binding = binding
        
        //validate no extra parameters
        //TODO: consider parameters defined on child templates
        //for (e : parameterValues.entrySet) {
        //    if (!parameters.contains(e.key)) {
        //        throw new CodeConceptException("Code concept template " + name + " does not have parameter: " + e.key)
        //    }
        //}
        
        for (sc : getSubconcepts) {
            //TODO: assuming only SingleCodeSunconcepts
            val singleSubconcept = sc as SingleCodeSubconcept
            val instantiatedConcept = (singleSubconcept.concept as CodeConceptTemplate).instantiate(parameterValues)
            concept.addSubconcept(singleSubconcept.name, instantiatedConcept, sc.essential, sc.min, sc.max)
        }
                
        concept
        
    }
    
    override MappingTypeVariableBinding<?> getVariableBindingForParameter(String paramName, Object paramValue) {
        if (isStaticReference(paramValue)) {
            new TemplateParameterReference(paramValue as String)
        }
        else {
            super.getVariableBindingForParameter(paramName, paramValue)
        }
    }
    
    override CodeConcept addSubconcept(String name, MappingType mappingType, boolean essential, int min, int max, Map<String, Object> parameters) {
        val concept = new CodeConceptTemplate(name, mappingType, parameters)
        addSubconcept(name, concept, essential, min, max)
        this
    }
    
    
}