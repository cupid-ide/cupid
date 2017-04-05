package org.earthsystemmodeling.cupid.cc

import java.util.List
import java.util.Map
import org.earthsystemmodeling.cupid.cc.mapping.CodeConceptInstanceReference
import org.earthsystemmodeling.cupid.cc.mapping.LiteralMTVBinding
import org.earthsystemmodeling.cupid.cc.mapping.MappingType
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding
import org.eclipse.xtend.lib.annotations.Accessors
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeParameterBinding
import org.earthsystemmodeling.cupid.cc.types.MTPType

class CodeConcept {
    
    @Accessors
    protected String name = null
        
    @Accessors
    protected CodeConcept extends_ = null
    
    protected List<CodeSubconcept> subconcepts = newLinkedList
        
    MappingTypeBinding binding
    
    Map<String, Class<?>> annotations = newLinkedHashMap
    
    Map<String, MTPType<?>> annotationDefaults = newLinkedHashMap
    
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
    
    def extend(String name) {
    	val concept = new CodeConcept(name)
    	concept.extends_ = this
    	concept.binding = new MappingTypeBinding(this.binding, concept)  //clone
    	concept
    }
    
    def void addAnnotation(String name, Class<?> type) {
    	if (annotations.containsKey(name) && annotations.get(name) != type) {
    		throw new CodeConceptException('''Cannot add annotation "«name»" of type «type.simpleName» 
    			to concept «getName» because it already has the same annotation with a 
    			different type: «annotations.get(name)»''')
    	}
    	annotations.put(name, type)
    }
    
    def void addAnnotations(String... name) {
    	name.forEach[n|addAnnotation(n, String)]
    }
    
    def void addAnnotations(List<String> names) {
    	names.forEach[n|addAnnotations(n)]
    }
    
    def void addAnnotationDefault(String name, MTPType<?> value) {
    	if (getAnnotationType(name)?.isInstance(value)) {
    		annotationDefaults.put(name, value)
    	}
    	else if (getAnnotationType(name) != null) {
    		throw new CodeConceptException("Type mismatch adding annotation default")
    	}
    	else {
    		throw new CodeConceptException("Cannot add default for undeclared annotation: " + name)
    	}
    }
    
    def void addAnnotationDefaults(Map<String,MTPType<?>> defaults) {
    	annotationDefaults.putAll(defaults)
    }
    
    def void addAnnotationsWithDefaults(Map<String,MTPType<?>> defaults) {
    	defaults.forEach[k,v|
    		addAnnotations(k)
    		addAnnotationDefault(k, v)
    	]
    }
    
    def Map<String, Class<?>> getAnnotations() {
    	val retMap = newLinkedHashMap
    	if (extends_ != null) {
    		retMap.putAll(extends_.getAnnotations)
    	}
    	retMap.putAll(annotations)
    	retMap
    }
    
    def boolean hasAnnotation(String name) {
    	annotations.containsKey(name) || (extends_ != null && extends_.hasAnnotation(name))
    }
    
    def Class<?> getAnnotationType(String name) {
    	if (annotations.containsKey(name)) {
    		annotations.get(name)
    	}
    	else if (extends_ != null) {
    		extends_.getAnnotationType(name)
    	}
    	else {
    		null
    	}
    }
    
    def Map<String, MTPType<?>> getAnnotationDefaults() {
    	val retMap = newLinkedHashMap
    	if (extends_ != null) {
    		retMap.putAll(extends_.getAnnotationDefaults)
    	}
    	retMap.putAll(annotationDefaults)
    	retMap
    }
    
    def Object getAnnotationDefault(String name) {
    	if (annotationDefaults.containsKey(name)) {
    		annotationDefaults.get(name)
    	}
    	else if (extends_ != null) {
    		extends_.getAnnotationDefault(name)
    	}
    	else {
    		null
    	}
    }
    
    def setMappingType(MappingType mappingType) {
    	setMappingType(mappingType, null)
    }
    
    def setMappingType(MappingType mappingType, Map<String,Object> parameters) {
        
        if (extends_ != null) {
        	throw new CodeConceptException("Cannot set mapping type for concept extension")
        }
        
        binding = new MappingTypeBinding(mappingType, this)
        if (parameters != null) {
            for (p : parameters.entrySet) {
                binding.putBinding(p.key, getVariableBindingForParameter(p.key, p.value))
            }
        }
        
        //implicit binding of context
        if (mappingType.hasParameter("context") && binding.unbound("context")) {
            val mtv = mappingType.getParameter("context")
            binding.putBinding("context", new CodeConceptInstanceReference(mtv, null))
        }
        //implicit binding of match
        if (mappingType.hasParameter("match") && binding.unbound("match")) {
            val mtv = mappingType.getParameter("match")
            binding.putBinding("match", new CodeConceptInstanceReference(mtv, null))
        }
        //automatically create bindings for unbound parameters that
        //that match local annotations
        //binding.unbound.forEach[v|
        //	if (getAnnotationType(v.name)==v.type) {
        //		binding.putBinding(v, new CodeConceptInstanceReference(v, "@"+v.name))
        //	}
        //]
        
        //automatically create local annotations for remaining unbound parameters
        binding.unbound.forEach[v|
        	addAnnotation(v.name, v.type)
        	binding.putBinding(v.name, new CodeConceptInstanceReference(v, "@"+v.name))
        ]
        
        if (!binding.fullyBound) {
            throw new CodeConceptException("Missing parameters to mapping type " + mappingType.name + ": " + binding.unbound.join(", "))        
        }
    }
    
    //subclasses can override
    protected def MappingTypeParameterBinding getVariableBindingForParameter(String paramName, Object paramValue) {
        if (isDynamicReference(paramValue)) {
            val mtv = mappingType.getParameter(paramName)
            new CodeConceptInstanceReference(mtv, paramValue as String)
        }
        else {
            new LiteralMTVBinding(paramValue as MTPType<?>)
        }
    }
    
    def MappingTypeBinding getBinding() {
    	binding   	
    }
    
    protected def void setBinding(MappingTypeBinding binding) {
    	this.binding = binding
    }
    
    def getMappingType() {
        getBinding?.mappingType
    }
    
    def CodeConceptInstance newInstance(CodeConceptInstance parent) {
    	newInstance(parent, null)
    }
    
    def CodeConceptInstance newInstance(CodeConceptInstance parent, Object match) {
        new CodeConceptInstance(this, parent, match)
    }
    
    def CodeConceptInstance newInstanceWithDefaults(CodeConceptInstance parent, boolean recursive) {
    	val instance = newInstance(parent)
    	getAnnotationDefaults.forEach[k,v|
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
        if (extends_ == null) {
            subconcepts
        }
        else {
            val toRet = newLinkedList
            toRet.addAll(extends_.getSubconcepts)
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
    
    //def getDeclaredSubconcepts() {
    //    subconcepts
    //}
    
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
         //TODO: fix to check for reference path more explicitly
        (obj instanceof String) && ((obj as String).startsWith("../") || (obj as String).startsWith("@"))
    }
    
    
    override toString() {
        '''
        CodeConcept: «getName»«IF(extends_ != null)» refines «extends_.getName»«ENDIF»
        Subconcepts: «FOR s : getSubconcepts»
            - «s»«ENDFOR»
        '''    
    }
    
    
}
				