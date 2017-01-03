package org.earthsystemmodeling.cupid.cc

import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors
import org.earthsystemmodeling.cupid.cc.mapping.MappingType
import org.earthsystemmodeling.cupid.cc.mapping.MappingResult
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding
import org.earthsystemmodeling.cupid.cc.mapping.CodeConceptInstanceReference
import org.earthsystemmodeling.cupid.cc.mapping.LiteralMTVBinding

class CodeConcept {
    
    @Accessors
    protected String name = null
        
    @Accessors
    protected CodeConcept refines = null
    
    protected List<CodeSubconcept> subconcepts = newLinkedList
        
    @Accessors
    protected MappingTypeBinding binding
    
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
    
    def setMappingType(MappingType mappingType, Map<String,Object> parameters) {
        binding = new MappingTypeBinding(mappingType)
        if (parameters != null) {
            for (p : parameters.entrySet) {
                //static reference disallowed since this is not a template
                if (isDynamicReference(p.value)) {
                    val mtv = mappingType.getParameter(p.key)
                    binding.put(p.key, new CodeConceptInstanceReference(mtv, p.value as String))   
                }
                else {
                    binding.put(p.key, new LiteralMTVBinding(p.value))
                }
            }
        }
        if (!binding.fullyBound) {
            throw new CodeConceptException("Missing parameters to mapping type " + mappingType.name + ".")         
        }
    }
    
    def getMappingType() {
        binding?.mappingType
    }
    
    def protected List<CodeConceptInstance> reverseAll(CodeConceptInstance parent) {
        
        val retList = newLinkedList
        
        if (binding != null) {
            val resultset = binding.doFind()
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
            val resultset = binding.doFind()
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
    
    def protected CodeConceptInstance newInstance(CodeConceptInstance parent, Object match) {
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
            toRet.addAll(subconcepts)
            toRet.addAll(refines.getSubconcepts)
            toRet
        }
    }
    
    def CodeSubconcept getSubconcept(String name) {
        getSubconcepts().findFirst[sc|sc.name.equals(name)]
    }
    
    def getDeclaredSubconcepts() {
        subconcepts
    }
    
    //single valued subconcept   
    
    def CodeConcept addSubconcept(CodeConcept type) {
       addSubconcept(type.name, type)
    }
    
    def CodeConcept addSubconcept(String name, CodeConcept type) {
       addSubconcept(name, type, false)
    }
    
    def CodeConcept addSubconcept(String name, CodeConcept type, boolean essential) {
       addSubconcept(name, type, essential, 1, 1)
    }
    
    def CodeConcept addSubconcept(String name, CodeConcept type, boolean essential, int min, int max) {
       subconcepts.add(new SingleCodeSubconcept(this, type, essential, min, max))
       this 
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
    
    def CodeConcept addSubconcept(String name, MappingType mappingType, boolean essential, int min, int max, Map<String, Object> parameters) {
        val concept = new CodeConcept(name, mappingType)
        addSubconcept(name, concept, essential, min, max)
        this
    }
    
    static def isStaticReference(Object obj) {
        (obj instanceof String) && ((obj as String).startsWith("$"))
    }
    
    static def isDynamicReference(Object obj) {
        (obj instanceof String) && ((obj as String).startsWith("../"))
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
        Declared Subconcepts: «FOR s : declaredSubconcepts»
            - «s.name»«ENDFOR»
        All Subconcepts: «FOR s : getSubconcepts»
            - «s.name»«ENDFOR»
        '''    
    }
    
    
}
				