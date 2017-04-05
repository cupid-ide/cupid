package org.earthsystemmodeling.cupid.cc.mapping

import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors
import org.earthsystemmodeling.cupid.cc.types.MTPType

class MappingType {
    
    String name
   
    @Accessors
    MappingType refines
    
    @Accessors
    List<MappingTypeParameter> parameters = newLinkedList
    
    //values fixed in refinement
    Map<MappingTypeParameter, Object> parameterValues = newLinkedHashMap 
          
    @Accessors
    private (MappingTypeBinding)=>void find
    
    @Accessors
    private (MappingTypeBinding)=>void forwardAdd
    
    Map<String, String> templates = newLinkedHashMap
    
    Class<?> contextType
    Class<?> matchType

    new(String name, Class<?> contextType, 
    	Class<?> matchType, 
    	Map<String, Class<? extends MTPType<?>>> additionalParameters) 
    {
    	this.contextType = contextType
    	this.matchType = matchType
    	addParameters(additionalParameters)
    }
    
    new(String name, Class<?> contextType, Class<?> matchType) {
        this(name, contextType, matchType, null)
    }

    //new(String name, Map<String, Class<? extends MTPType<?>>> parameters) {
    //    this(null as MappingType, parameters)
    //    this.name = name
    //}
    
    new(MappingType refines) {
        this(refines, null)
    }
    
    new(MappingType refines, Map<String, Class<? extends MTPType<?>>> parameters) {
        this.refines = refines
        addParameters(parameters)
    }
    
    protected def addParameters(Map<String, Class<? extends MTPType<?>>> parameters) {
    	if (parameters != null) {
            for (p : parameters.entrySet) {
                if (hasParameter(p.key)) {
                    throw new MappingTypeException("Cannot add duplicate parameter: " + p.key)
                }
                val mtv = new MappingTypeParameter(p.key, p.value)
                this.parameters.add(mtv)
            }
        }
    }
    
    def String getName() {
        if (name != null) name
        else if (refines != null) "refinement of " + refines.getName
    }
              
    def MappingType refine(Map<String, Class<? extends MTPType<?>>> newParameters) {
        new MappingType(this, newParameters)
    }

    //refine by providing parameter values        
    def MappingType refine(Map<String, Class<? extends MTPType<?>>> newParameters, Map<String, Object> parameterValues) {
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
    
    def hasParameter(MappingTypeParameter toCheck) {
        hasParameter(toCheck.name)
    }
           
    def MappingTypeParameter getParameter(String name) {
        val p = parameters.findFirst[p|p.name.equals(name)]
        if (p == null && refines != null) {
            return refines.getParameter(name)
        }
        return p 
    }
    
    def List<MappingTypeParameter> getParameters() {
        val retList = newLinkedList
        retList.addAll(parameters)
        if (refines != null) {
            retList.addAll(refines.getParameters)
        }
        retList
    }
    
    def getParameterValue(MappingTypeParameter variable) {
    	parameterValues.getOrDefault(variable, refines?.getParameterValue(variable))
    }
    
    def getParameterValue(String name) {
    	getParameterValue(getParameter(name))
    }
    
    def Map<MappingTypeParameter, Object> getParameterValues() {
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
        contextType
    }    
    
    def Class<?> matchType() {
        matchType
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
    
    /**
     * A refinement first executes the query of the refined
     * MappingType and then the refining type is able to:
     *    (1) provide explicit values for parameters, and/or
     *    (2) after the refined query runs, further filter the 
     *        results of the query, possibly reducing the
     *        number of results, and/or
     *    (3) bind additional parameters to the matches.
     * 
     * In general a refining type should not increase the size of
     * the resultset since that would break subset semantics.
     */            
    def void doFind(MappingTypeBinding binding) {
        if (refines != null) {
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
					