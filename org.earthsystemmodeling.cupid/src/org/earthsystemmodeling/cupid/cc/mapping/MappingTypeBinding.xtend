package org.earthsystemmodeling.cupid.cc.mapping

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Map
import java.util.List
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance
import org.earthsystemmodeling.cupid.cc.CodeConcept

class MappingTypeBinding {
    
    @Accessors
    MappingType mappingType
    
    @Accessors
    CodeConcept concept
    
    @Accessors
    Map<MappingTypeVariable<?>, MappingTypeVariableBinding<?>> bindings = newLinkedHashMap
    
    @Accessors(PROTECTED_GETTER)
    CodeConceptInstance currentContext
    
    @Accessors(PROTECTED_GETTER)
    CodeConceptInstance currentInstance
    
    @Accessors(PUBLIC_GETTER)  //can be accessed by refinements of mappingType
    MappingResultSet resultSet
    
    new(MappingType mappingType, CodeConcept concept) {
        this.mappingType = mappingType
        this.concept  = concept
    }
    
    def <T> T getValue(MappingTypeVariable<T> variable) {
        bindings.get(variable).value as T
    }
    
    def <T> T getValue(String variable) {
        val mtv = mappingType.getParameter(variable)
        bindings.get(mtv).value as T
    }
    
    def String getValueString(String variable) {
    	getValue(variable)	
    }
    
    def <T> void setValue(MappingTypeVariable<T> variable, T value) {
    	(bindings.get(variable) as MappingTypeVariableBinding<T>).value = value
    }
    
    def <T> void setValue(String variable, T value) {
    	val mtv = mappingType.getParameter(variable)
    	if (mtv == null) {
    		throw new MappingTypeException("Mapping type " + mappingType.name + " does not have parameter: " + variable)
    	}
    	setValue(mtv, value)
    }
    
    def <T> MappingTypeVariableBinding<T> getBinding(MappingTypeVariable<T> variable) {
        bindings.get(variable) as MappingTypeVariableBinding<T>
    }
    
    def <T> MappingTypeVariableBinding<T> getBinding(String variable) {
        val mtv = bindings.keySet.findFirst[v|v.name==variable]
        getBinding(mtv) as MappingTypeVariableBinding<T>
    }
    
    
    def putBinding(MappingTypeVariable<?> variable, MappingTypeVariableBinding<?> binding) {
        if (!mappingType.hasParameter(variable)) {
            throw new MappingTypeException("Mapping type " + mappingType.name + " does not have parameter named: " + variable.name)
        }
        binding.binding = this
        bindings.put(variable, binding)
    }
    
    def putBinding(String variable, MappingTypeVariableBinding<?> binding) {
        if (!mappingType.hasParameter(variable)) {
            throw new MappingTypeException("Mapping type " + mappingType.name + " does not have parameter named: " + variable)
        }
        putBinding(mappingType.getParameter(variable), binding)
    }
    
    def fullyBound() {
        unbound.size == 0
    }
    
    def List<MappingTypeVariable<?>> unbound() {
         val retList = newLinkedList
         retList.addAll(mappingType.getParameters().filter[p|!bindings.containsKey(p) && !(p.name == "context") && !(p.name == "match")])
         retList
    }
    
    def unbound(String variable) {
    	getBinding(variable) == null
    }
    
    /*
    def doFind(CodeConceptInstance parent) {
        currentContext = parent
        val resultset = mappingType.doFind(this)
        currentContext = null
        return resultset
    }
    */
    
    /*
    private def reset() {
    	resultSet = null	
    }
    */
    
    /**
     * Execute the mapping to try to bind a single result. If successful, the returned
     * instance will be set as a child of the parent. 
     * 
     * @param parent the parent context
     * @return an instance of this binding's concept, or null if none found
     */
    def CodeConceptInstance bind(CodeConceptInstance parent) {
    	
    	resultSet = new MappingResultSet(mappingType)
    	currentContext = parent
    	mappingType.doFind(this)
    	currentContext = null
    	
    	if (resultSet.size > 0) {
    		val res = resultSet.first
    		val instance = concept.newInstance(parent, res.match)
    		currentInstance = instance  //used by dynamic bindings
    		res.values.forEach[k,v|
    			if (!k.equals("match")) {
    				setValue(k, v)
    			}
    		]
    		currentInstance = null
    		instance
    	}
    	else {
    		null
    	}
    }
    
    /**
     * Execute the mapping to try to bind multiple results. If successful, the returned
     * instances will be set as a child of the parent. 
     * 
     * @param parent the parent context
     * @return a (potentially empty) list of instances of this binding's concept
     */
    def List<CodeConceptInstance> bindAll(CodeConceptInstance parent) {
    	
    	resultSet = new MappingResultSet(mappingType)
    	currentContext = parent
    	mappingType.doFind(this)
    	currentContext = null
    	
    	val retList = newLinkedList
    	
    	resultSet.results.forEach[r|
    		val instance = concept.newInstance(parent, r.match)
    		currentInstance = instance  //used by dynamic bindings
    		r.values.forEach[k,v|
    			if (!k.equals("match")) {
    				setValue(k, v)
    			}
    		]
    		currentInstance = null
    		retList.add(instance)
    	]
    	
    	retList
    }

	/*
	def boolean bindXXX(CodeConceptInstance parent) {
    	
    	//currentInstance = instance
    	
    	//resultSet being null means that we need to
    	//execute the mapping type first
    	if (resultSet == null) {
    		resultSet = new MappingResultSet(mappingType)
    		mappingType.doFind(this)
    	}
    	//at this point, resultSet will be populated
    	//thanks to callbacks to addResult() methods
    	
    	if (resultSet.size() > 0) {
    		
    		val res = resultSet.pop()
    		res.values.forEach[k,v|
    			if (k.equals("match")) {
    				currentInstance.match = v
    			}
    			else {
    				setValue(k, v)
    			}
    		]
    		currentInstance = null
    		true
    	}
    	else {
    		//reset()
    		currentInstance = null
    		false
    	}
    }
    */
    
    def addResult(Object match) {
    	if (!mappingType.matchType.isInstance(match)) {
    		throw new IllegalVariableAssignment("match", mappingType.matchType, match.class)
    	}
    	resultSet.addMatch(match)   	
    }
    
    def addResult(Map<String, Object> params) {
    	val result = addResult(params.get("match"))  //TODO: for now assume there is a match
    	params.forEach[k, v|
    		if (!k.equals("match")) {
    			result.put(k, v)  //TODO: could type check here
    		}
    	]
    	result
    }
    
    def <T> T context() {
        getValue("context")
    } 
    
}