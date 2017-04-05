package org.earthsystemmodeling.cupid.cc

import org.earthsystemmodeling.cupid.cc.CodeConcept
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Map
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding
import org.earthsystemmodeling.cupid.cc.mapping.TemplateParameterReference
import org.earthsystemmodeling.cupid.cc.mapping.LiteralMTVBinding
import org.earthsystemmodeling.cupid.cc.mapping.MappingType
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeParameterBinding
import org.earthsystemmodeling.cupid.cc.types.MTPType

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
    
    //new(CodeConcept toCopy) {
    //	super(toCopy.name)
    //}
    
    def CodeConcept instantiate(Map<String,MTPType<?>> parameterValues) {
        instantiate(null, parameterValues)    
    }
    
    def CodeConcept instantiate(String name, Map<String,MTPType<?>> parameterValues) {
        val concept = new CodeConcept({if (name==null) this.name else name})
        val binding = new MappingTypeBinding(this.binding.mappingType, concept)
        for (e : this.binding.bindings.entrySet) {
            if (e.value instanceof TemplateParameterReference) {                
                //TODO: figure out the $<ref> syntax, extend if needed - this is very basic now
                //replace template parameter with actual value, remove the "$" first
                val refVar = (e.value as TemplateParameterReference).reference.substring(1)
                if (parameterValues.containsKey(refVar)) {
                    binding.putBinding(e.key, new LiteralMTVBinding(parameterValues.get(refVar)))
                }
                else {
                    throw new CodeConceptException("Cannot instantiate template due to missing parameter value: " + e.key)
                }
            }
            else {
                binding.putBinding(e.key, e.value.clone(binding))
            }
        }
        concept.binding = binding
        
        //copy annotations
        this.annotations.forEach[k,v|
        	concept.addAnnotation(k, v)
        ]
        
        //copy annotation defaults
        this.annotationDefaults.forEach[k,v|
        	concept.addAnnotationDefault(k,v)
        ]
        
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
            concept.addSubconcept(singleSubconcept.name, instantiatedConcept, sc.essential, sc.min, sc.max, singleSubconcept.includeByDefault)
        }
                
        concept
        
    }
    
    override MappingTypeParameterBinding getVariableBindingForParameter(String paramName, Object paramValue) {
        if (isStaticReference(paramValue)) {
            new TemplateParameterReference(paramValue as String)
        }
        else {
            super.getVariableBindingForParameter(paramName, paramValue)
        }
    }
    
    override addSubconcept(String name, MappingType mappingType, boolean essential, int min, int max, Map<String, Object> parameters, boolean includeByDefault) {
        val concept = new CodeConceptTemplate(name, mappingType, parameters)
        addSubconcept(name, concept, essential, min, max, includeByDefault)
        concept
    }
    
    //override addSubconcept(String name, CodeConcept type, boolean essential, int min, int max, boolean includeByDefault) {
    //   	subconcepts.add(new SingleCodeSubconcept(this, type, essential, min, max, includeByDefault)) 
    //}
    
    
}