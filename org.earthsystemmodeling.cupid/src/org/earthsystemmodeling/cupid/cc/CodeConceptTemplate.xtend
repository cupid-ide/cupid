package org.earthsystemmodeling.cupid.cc

import org.earthsystemmodeling.cupid.cc.CodeConcept
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Map
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding
import org.earthsystemmodeling.cupid.cc.mapping.TemplateParameterReference
import org.earthsystemmodeling.cupid.cc.mapping.LiteralMTVBinding

class CodeConceptTemplate extends CodeConcept {
    
    @Accessors
    List<String> parameters
    
    new(String name, List<String> parameters) {
        super(name)
        this.parameters = parameters
    }
    
    def CodeConcept instantiate(String name, Map<String,Object> parameterValues) {
        
        val concept = new CodeConcept(name)
        val binding = new MappingTypeBinding(this.binding.mappingType)
        for (e : this.binding.bindings.entrySet) {
            if (e.value instanceof TemplateParameterReference<?>) {
                if (parameterValues.containsKey(e.key.name)) {
                    binding.put(e.key, new LiteralMTVBinding(parameterValues.get(e.key)))
                }
                else {
                    throw new CodeConceptException("Cannot instantiate template due to missing parameter value: " + e.key.name)
                }
            }
            else {
                binding.put(e.key, e.value.clone)
            }
        }
        concept.binding = binding
        
        //validate no extra parameters
        for (e : parameterValues.entrySet) {
            if (this.binding.get(e.key) == null) {
                throw new CodeConceptException("Code concept template " + name + " does not have parameter: " + e.key)
            }
        }
                
        concept
        
    }
    
    
}