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
    
    protected Map<String, Object> annotationDefaults = newHashMap
    
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
    
    def void addAnnotationDefault(String name, Object value) {
    	annotationDefaults.put(name, value)
    }
    
    def void addAnnotationDefaults(Map<String,Object> defaults) {
    	annotationDefaults.putAll(defaults)
    }
    
    def void addAnnotationsWithDefaults(Map<String,String> defaults) {
    	defaults.forEach[k,v|
    		addAnnotation(k)
    		addAnnotationDefault(k, v)
    	]
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
        //implicit binding of match
        if (mappingType.hasParameter("match") && binding.unbound("match")) {
            val mtv = mappingType.getParameter("match")
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
    
    def CodeConceptInstance newInstance(CodeConceptInstance parent) {
    	newInstance(parent, null)
    }
    
    def CodeConceptInstance newInstance(CodeConceptInstance parent, Object match) {
        new CodeConceptInstance(this, parent, match)
    }
    
    def CodeConceptInstance newInstanceWithDefaults(CodeConceptInstance parent, boolean recursive) {
    	val instance = newInstance(parent)
    	//instance.status = CCIStatus.ADDED
    	annotationDefaults.forEach[k,v|
    		instance.put(k, v)
    	]
    	if (recursive) {
	    	getSubconcepts.forEach[sc|
	    		val ssc = sc as SingleCodeSubconcept
	    		if (ssc.includeByDefault) {
	    			ssc.concept.newInstanceWithDefaults(instance, recursive)
	    		}
	    	]
	    }
    	instance
    }
     
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
    
    def getSubconcept(String name) {
        getSubconcepts().findFirst[sc|sc.name.equals(name)]
    }
    
    def getChildConcept(String name) {
    	(getSubconcept(name) as SingleCodeSubconcept).concept
    }
    
    def getDeclaredSubconcepts() {
        subconcepts
    }
    
    def void addSubconcept(String name, CodeConcept type, boolean essential, int min, int max, boolean includeByDefault) {
       subconcepts.add(new SingleCodeSubconcept(this, type, essential, min, max, includeByDefault)) 
    }
    
    def CodeConcept addSubconcept(String name, MappingType mappingType) {
        addSubconcept(name, mappingType, false, null)
    }
        
    def CodeConcept addSubconcept(String name, MappingType mappingType, Map<String, Object> parameters) {
        addSubconcept(name, mappingType, false, parameters)
    }
    
    def CodeConcept addSubconcept(String name, MappingType mappingType, boolean essential, Map<String, Object> parameters) {
        addSubconcept(name, mappingType, essential, 1, 1, parameters, essential)
    }
    
    //NOTE: subclass overrides to create a CodeConceptTemplate
    def CodeConcept addSubconcept(String name, MappingType mappingType, boolean essential, 
    	int min, int max, Map<String, Object> parameters, boolean includeByDefault) {
        
        val concept = new CodeConcept(name, mappingType, parameters)
        addSubconcept(name, concept, essential, min, max, includeByDefault)
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
					addSubconcept(concept.name, concept, false, min, max, false)
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
					
					val subconcept = addSubconcept(name, mappingType, false, min, max, params, false)
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
    
    
    override toString() {
        '''
        CodeConcept: «getName»«IF(refines!=null)» refines «refines.getName»«ENDIF»
        Subconcepts: «FOR s : getSubconcepts»
            - «s»«ENDFOR»
        '''    
    }
    
    
}
				