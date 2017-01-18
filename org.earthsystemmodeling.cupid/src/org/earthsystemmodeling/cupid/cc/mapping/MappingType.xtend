package org.earthsystemmodeling.cupid.cc.mapping

import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

class MappingType {
    
    String name
   
    @Accessors
    MappingType refines
    
    @Accessors
    List<MappingTypeVariable<?>> parameters = newLinkedList
          
    @Accessors
    private (MappingTypeBinding)=>void find
    
    @Accessors
    private (MappingTypeBinding)=>void forwardAdd
           
    //@Accessors
    //private (P1)=>void generate

    new(String name, Class<?> contextType, Class<?> matchType) {
        this(name, #{"context" -> contextType, "match" -> matchType})
    }

    new(String name, Map<String, Class<?>> parameters) {
        this(null as MappingType, parameters)
        this.name = name
    }
    
    new(MappingType refines) {
        this(refines, null)
    }
    
    new(MappingType refines, Map<String, Class<?>> parameters) {
        this.refines = refines
        if (parameters != null) {
            for (p : parameters.entrySet) {
                if (hasParameter(p.key)) {
                    throw new MappingTypeException("Cannot add duplicate parameter: " + p.key)
                }
                val mtv = new MappingTypeVariable(p.key, p.value)
                this.parameters.add(mtv)
            }
        }
        this.find = [bind|refines.find.apply(bind)]
    }
    
    def String getName() {
        if (name != null) name
        else if (refines != null) "refinement of " + refines.getName
    }
    
    
        
    //def MappingType refine(Map<String, Class<?>> newParameters) {
    //    refine(newParameters, null)        
    //}
          
    //refine by providing parameter values
    
    def MappingType refine(Map<String, Class<?>> newParameters) {
        new MappingType(this, newParameters)
        /*
        //validate inputs
        if (parameterValues != null) {
            for (input : parameterValues.entrySet) {
                if (!hasParameter(input.key)) {
                    throw new MappingTypeException("Mapping type " + name + " does not have input parameter: " + input.key)
                }

                val mtv = getParameter(input.key)
                
            }
        }
        
        mt.find = [me, result | this.find.apply(me, result)]
        mt
        
        */
    }
    
    
    
    def hasParameter(String name) {
        getParameter(name) != null    
    }
    
    def hasParameter(MappingTypeVariable<?> toCheck) {
        hasParameter(toCheck.name)
    }
           
    def <T> MappingTypeVariable<T> getParameter(String name) {
        val p = parameters.findFirst[p|p.name.equals(name)]
        if (p == null && refines != null) {
            return refines.getParameter(name)
        }
        return p as MappingTypeVariable<T>
    }
    
    def List<MappingTypeVariable<?>> getParameters() {
        val retList = newLinkedList
        retList.addAll(parameters)
        if (refines != null) {
            retList.addAll(refines.getParameters)
        }
        retList
    }
    
    def Class<?> getParameterType(String name) {
        getParameter(name)?.type        
    } 
        
    def Class<?> contextType() {
        getParameterType("context")
    }    
    
    def Class<?> matchType() {
        getParameterType("match")
    }
                
    def doFind(MappingTypeBinding binding) {
        //val resultset = new MappingResultSet(this)
        if (refines != null) {
            refines.find.apply(binding)
        }
        find.apply(binding)
        //resultset
    }
    
       
   
    
}
					