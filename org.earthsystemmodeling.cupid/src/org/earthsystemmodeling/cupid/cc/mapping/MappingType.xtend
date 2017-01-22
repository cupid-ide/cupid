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
    
    //values fixed in refinement
    Map<MappingTypeVariable<?>, Object> parameterValues = newLinkedHashMap 
          
    @Accessors
    private (MappingTypeBinding)=>void find
    
    @Accessors
    private (MappingTypeBinding)=>void forwardAdd
    
    private Map<String, String> templates = newLinkedHashMap

    new(String name, Class<?> contextType, Class<?> matchType, Map<String,Class<?>> additionalParameters) {
    	this(name, contextType, matchType)
    	addParameters(additionalParameters)
    }
    
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
        addParameters(parameters)
        //this.find = [bind|refines.find.apply(bind)]
        //this.forwardAdd = [bind|refines.forwardAdd.apply(bind)]
    }
    
    protected def addParameters(Map<String, Class<?>> parameters) {
    	if (parameters != null) {
            for (p : parameters.entrySet) {
                if (hasParameter(p.key)) {
                    throw new MappingTypeException("Cannot add duplicate parameter: " + p.key)
                }
                val mtv = new MappingTypeVariable(p.key, p.value)
                this.parameters.add(mtv)
            }
        }
    }
    
    def String getName() {
        if (name != null) name
        else if (refines != null) "refinement of " + refines.getName
    }
    
              
    //refine by providing parameter values    
    def MappingType refine(Map<String, Class<?>> newParameters) {
        new MappingType(this, newParameters)
    }
    
    def MappingType refine(Map<String, Class<?>> newParameters, Map<String, String> parameterValues) {
    	val newType = refine(newParameters)
    	parameterValues.forEach[k,v|
    		val p = newType.getParameter(k)
    		if (p == null) {
    			throw new MappingTypeException("Mapping type " + name + " does not have parameter: " + k)
    		}
    		newType.parameterValues.put(p, v)
    	]
    	newType
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
    
    def getParameterValue(MappingTypeVariable<?> variable) {
    	parameterValues.getOrDefault(variable, refines?.getParameterValue(variable))
    }
    
    def getParameterValue(String name) {
    	getParameterValue(getParameter(name))
    }
    
    def Map<MappingTypeVariable<?>, Object> getParameterValues() {
    	val retMap = newLinkedHashMap
    	if (refines != null) {
    		retMap.putAll(refines.getParameterValues)
    	}
    	retMap.putAll(parameterValues)
    	retMap
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
          
    def void addTemplate(String name, String template) {
    	templates.put(name, template)
    }  
      
    //def String getTemplate(String name) {
    //	templates.getOrDefault(name, refines?.getTemplate(name))
    //}
    
    def Map<String, String> getTemplates() {
    	val retMap = newLinkedHashMap
    	if (refines != null) {
    		retMap.putAll(refines.getTemplates)
    	}
    	retMap.putAll(templates)
    	retMap
    }
                
    def void doFind(MappingTypeBinding binding) {
        if (refines != null) {
            //refines.find.apply(binding)
            refines.doFind(binding)
        }
        if (find != null) {
        	find.apply(binding)
        }
    }
    
    def void doForwardAdd(MappingTypeBinding binding) {
    	if (refines != null) {
    		refines.doForwardAdd(binding)
    	}
    	if (forwardAdd != null) {
    		forwardAdd.apply(binding)
    	}
    }
       
   
    
}
					