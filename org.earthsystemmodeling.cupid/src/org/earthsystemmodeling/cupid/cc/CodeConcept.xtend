package org.earthsystemmodeling.cupid.cc

import java.util.List
import java.util.Map
import org.earthsystemmodeling.cupid.cc.mapping.CodeConceptInstanceReference
import org.earthsystemmodeling.cupid.cc.mapping.LiteralMTVBinding
import org.earthsystemmodeling.cupid.cc.mapping.MappingResult
import org.earthsystemmodeling.cupid.cc.mapping.MappingType
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariableBinding
import org.eclipse.xtend.lib.annotations.Accessors

class CodeConcept {
    
    @Accessors
    protected String name = null
        
    @Accessors
    protected CodeConcept refines = null
    
    protected List<CodeSubconcept> subconcepts = newLinkedList
        
    @Accessors
    protected MappingTypeBinding binding
    
    protected Map<String, Class<?>> annotations = newHashMap
    
    new(String name) {
        this(name, null)    
    }
    
    new(String name, MappingType mappingType) {
        this(name, mappingType, null)
    }
        
    new(String name, MappingType mappingType, Map<String,Object> parameters) {
        this.name = name
        if (mappingType != null) {
            setMappingType(mappingType, parameters)
        }
    }
    
    def void addAnnotation(String name, Class<?> type) {
    	annotations.put(name, type)
    }
    
    def void addAnnotation(String name) {
    	addAnnotation(name, String)
    }
    
    def void addAnnotations(List<String> names) {
    	names.forEach[n|addAnnotation(n)]
    }
    
    def setMappingType(MappingType mappingType, Map<String,Object> parameters) {
        binding = new MappingTypeBinding(mappingType, this)
        if (parameters != null) {
            for (p : parameters.entrySet) {
                binding.putBinding(p.key, getVariableBindingForParameter(p.key, p.value))
            }
        }
        //implicit binding of context
        if (mappingType.hasParameter("context") && binding.unbound("context")) {
            val mtv = mappingType.getParameter("context")
            binding.putBinding(mtv, new CodeConceptInstanceReference(mtv, null))
        }
        if (!binding.fullyBound) {
            throw new CodeConceptException("Missing parameters to mapping type " + mappingType.name + ": " + binding.unbound.join(", "))        
        }
    }
    
    //subclasses can override
    protected def MappingTypeVariableBinding<?> getVariableBindingForParameter(String paramName, Object paramValue) {
        if (isDynamicReference(paramValue)) {
            val mtv = mappingType.getParameter(paramName)
            new CodeConceptInstanceReference(mtv, paramValue as String)
        }
        else {
            new LiteralMTVBinding(paramValue)
        }
    }
    
    def getMappingType() {
        binding?.mappingType
    }
    
    /*
    def protected List<CodeConceptInstance> reverseAll(CodeConceptInstance parent) {
        
        val retList = newLinkedList
        
        if (binding != null) {
            val resultset = binding.doFind(parent)
            for (res : resultset.results) {
                val cci = reverse(parent, res)
                if (cci != null) retList.add(cci)
            }
        }
        else {
            //TODO: deal with this case
            throw new UnsupportedOperationException()   
        }
        retList
    }
      
    def CodeConceptInstance reverse(CodeConceptInstance parent) {
        if (binding != null) {
            val resultset = binding.doFind(parent)
            if (resultset.size() > 0) {
                reverse(parent, resultset.first)
            }
        }
    }
    
    def protected CodeConceptInstance reverse(CodeConceptInstance parent, MappingResult result) {
        val instance = newInstance(parent, result.match)
        try {
            for (sc : getSubconcepts) {               
                sc.reverse(instance)
            }
        }
        catch(EssentialConstraintViolation ecv) {
            return null
        }                    
        instance
    }
    */
    
    def CodeConceptInstance newInstance(CodeConceptInstance parent) {
    	newInstance(parent, null)
    }
    
    def CodeConceptInstance newInstance(CodeConceptInstance parent, Object match) {
        new CodeConceptInstance(this, parent, match)
    }
    
    /*
    def List<String> getParameters() {
        if (refines == null) {
            getDeclaredParameters
        }
        else {
            val toRet = newLinkedList
            toRet.addAll(getDeclaredParameters)
            toRet.addAll(refines.getParameters)
            toRet
        }
    }
    
    
    def getDeclaredParameters() {
        parameters
    }
    
    def getParameterValue(String param) {
        if (!getParameters.exists[it==param]) {
            throw new CodeConceptException("CodeConcept " + name + " does not contain parameter: " + param)
        }
        if (parameterValues.containsKey(param)) {
            parameterValues.get(param)
        }
        else if (refines != null) {
            refines.getParameterValueString(param)
        }
        else {
            null
        }
    }
    
    def String getParameterValueString(String param) {
        getParameterValue(param) as String
    }
    */
     
    def List<CodeSubconcept> getSubconcepts() {
        if (refines == null) {
            subconcepts
        }
        else {
            val toRet = newLinkedList
            toRet.addAll(refines.getSubconcepts)
            toRet.addAll(subconcepts)
            toRet
        }
    }
    
    def CodeSubconcept getSubconcept(String name) {
        getSubconcepts().findFirst[sc|sc.name.equals(name)]
    }
    
    def getDeclaredSubconcepts() {
        subconcepts
    }
    
    /*   
    def void addSubconcept(CodeConcept type) {
       addSubconcept(type.name, type)
    }
    
    def void addSubconcept(String name, CodeConcept type) {
       addSubconcept(name, type, false)
    }
    
    def void addSubconcept(String name, CodeConcept type, boolean essential) {
       addSubconcept(name, type, essential, 1, 1)
    }
    */
    
    def void addSubconcept(String name, CodeConcept type, boolean essential, int min, int max) {
       subconcepts.add(new SingleCodeSubconcept(this, type, essential, min, max)) 
    }
    
    def CodeConcept addSubconcept(String name, MappingType mappingType) {
        addSubconcept(name, mappingType, false, null)
    }
        
    def CodeConcept addSubconcept(String name, MappingType mappingType, Map<String, Object> parameters) {
        addSubconcept(name, mappingType, false, parameters)
    }
    
    def CodeConcept addSubconcept(String name, MappingType mappingType, boolean essential, Map<String, Object> parameters) {
        addSubconcept(name, mappingType, essential, 1, 1, parameters)
    }
    
    //NOTE: subclass overrides to create a CodeConceptTemplate
    def CodeConcept addSubconcept(String name, MappingType mappingType, boolean essential, int min, int max, Map<String, Object> parameters) {
        val concept = new CodeConcept(name, mappingType, parameters)
        addSubconcept(name, concept, essential, min, max)
        concept
    }
    
    def void addSubconcepts(List<Object> toAdd) {
    	if (toAdd.size() >= 1) {
	    	if (toAdd.get(0) instanceof List) {
	    		toAdd.forEach[s|
    				addSubconcepts(s as List<Object>)
    			]
	    	}
	    	//TODO: handle these parameter lists better
	    	else if (toAdd.size() >= 2 && toAdd.size() <= 5) {
				if (toAdd.get(0) instanceof CodeConcept) {
					val concept = toAdd.get(0) as CodeConcept
					val min = toAdd.get(1) as Integer
					val max = toAdd.get(2) as Integer
					val subList = { if (toAdd.size() == 4) toAdd.get(3) as List<Object> else null }
					addSubconcept(concept.name, concept, false, min, max)
					if (subList != null) {
						concept.addSubconcepts(subList)
					}	
				}
				else {
					val name = toAdd.get(0) as String
					val mappingType = toAdd.get(1) as MappingType    			
					val params = { if (toAdd.size() >= 3) toAdd.get(2) as Map<String, Object> else null }
					val subList = { if (toAdd.size() == 4) toAdd.get(3) as List<Object> else null }
					val min = { if (toAdd.size() == 5) toAdd.get(3) as Integer else 1}
					val max = { if (toAdd.size() == 5) toAdd.get(4) as Integer else 1}
					
					val subconcept = addSubconcept(name, mappingType, false, min, max, params)
					if (subList != null) {
						subconcept.addSubconcepts(subList)
					}					
				}
			}
			else {
				throw new CodeConceptException("Subconcept parameter list must be size 2 to 5.")
			}
		}	
    }
    
    def void addSubconcepts(List<Object>... toAdd) {
    	addSubconcepts(newLinkedList(toAdd))
    }
    
    
    static def isStaticReference(Object obj) {
        (obj instanceof String) && ((obj as String).startsWith("$"))
    }
    
    static def isDynamicReference(Object obj) {
        (obj instanceof String) && ((obj as String).startsWith("../") || (obj as String).startsWith("@"))
    }
    
    //def void setMappingType(MappingType mt) {
    //    mappingType = mt
    //    mappingType.setMappingFor(this)
    //}
    
    //def operator_modulo(Map<String,Object> paramValues) {
    //    refine(paramValues)
   // }
    
    /*    
    def CodeConcept refine(Map<String,Object> paramValues) {
        refine(null, paramValues)
    }
    
    def CodeConcept refine(String name, Map<String,Object> paramValues) {
        val newcc = new CodeConcept(name)
        newcc.refines = this
        //ewcc.setMappingType(this.mappingType.define)
       
        
        paramValues.forEach[k, v|
            if (parameters.contains(k)) {
                newcc.parameterValues.put(k,v)
            }
            else {
                throw new CodeConceptException("CodeConcept " + getName + " does not have parameter: " + k)
            }
        ]
        
        
        newcc
    }
    */
    
    override toString() {
        '''
        CodeConcept: «getName»«IF(refines!=null)» refines «refines.getName»«ENDIF»
        Subconcepts: «FOR s : getSubconcepts»
            - «s»«ENDFOR»
        '''    
    }
    
    
}
				