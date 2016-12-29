package org.earthsystemmodeling.cupid.cc

import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

class CodeConcept {
    
    //may be null for anonymous
    protected String name = null
        
    @Accessors
    protected CodeConcept refines = null
    
    //list of formal (static?) parameters    
    protected List<String> parameters = newLinkedList
    
    //parameter values to refine the super type
    @Accessors
    protected Map<String,Object> parameterValues = newLinkedHashMap
    
    protected List<CodeSubconcept> subconcepts = newLinkedList
           
    @Accessors
    protected MappingType mappingType
    
        
    new(String name) {
        this(name, null)
    }
    
    new(String name, List<String> parameters) {
        this.name = name
        if (parameters != null) {
            this.parameters.addAll(parameters)
        } 
    }
    
    def isAnonymous() {
        name == null
    }
    
    def getName() {
        if (name != null) {
            name
        }
        else {
            "(Anonymous)"
        }
    }
    
    
    def protected List<CodeConceptInstance> reverseAll(CodeConceptInstance parent) {
        
        val retList = newLinkedList
        
        if (mappingType != null) {
            val resultset = mappingType.doFind()
            for (res : resultset.results) {
                val cci = reverse(parent, res)
                if (cci != null) retList.add(cci)
            }
        }
        else {
            //TODO: deal with this case   
        }
        retList
    }
      
    def CodeConceptInstance reverse(CodeConceptInstance parent) {
        if (mappingType != null) {
            
            //will all parameters be bound at this point??
            
            //for (p : mappingType.unboundParameters) {
            //  p.name, p.type
            //  ctx = parent.nearestMapping(p.type) //find nearest mapped concept
            //  newParams.put(p.name, ctx)
            //endif
            //mappingType.withParams(newParams)
            
            val resultset = mappingType.doFind()
            if (resultset.size() > 0) {
                reverse(parent, resultset.first)
            }
        }
    }
    
    def protected CodeConceptInstance reverse(CodeConceptInstance parent, MappingResult result) {
        val cci = newInstance(parent)
        cci.match = result.match
        //annotate.apply(cci.annotations, sourceMatch)
        try {
            for (sc : getSubconcepts) {
                if (sc.max == 1) {
                    val child = sc.type.reverse(cci)
                    if (child == null) {
                        if (sc.min > 0 && sc.essential) {
                            return null  //do not map without essential feature
                        }
                        else if (sc.min > 0) {
                            throw new CodeConceptConstraintViolation("Must be at least " + sc.min + " instances of " + sc.type.getName)
                        }
                    }
                    else {
                        sc.type.newInstance(cci)
                    }
                }
                else {
                    val children = sc.type.reverseAll(cci)
                    if (children.size < sc.min || children.size > sc.max) {
                        throw new CodeConceptConstraintViolation("Must be at between " + sc.min + " and " + sc.max + " instances of " + sc.type.getName)
                    }
                } 
            }
        }
        catch(CodeConceptConstraintViolation cscv) {
            //required subconcept did not match, so return null
            System.out.println(cscv)
            //return null
        }                    
        cci 
    }
    
    def protected CodeConceptInstance newInstance(CodeConceptInstance parent) {
        //verify all parameters defined, if not can't instantiate
        if (getParameters.exists[p|getParameterValue(p) == null]) {
            throw new CodeConceptException("Cannot instantiate CodeConcept " + name + " because not all parameters have been defined.")
        }
        new CodeConceptInstance(this, parent)
    }
    
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
       subconcepts.add(new CodeSubconcept(this, name, type, essential, 1, 1))
       this 
    }
    
    def CodeConcept addSubconcept(String name, CodeConcept type, boolean essential, int min, int max) {
       subconcepts.add(new CodeSubconcept(this, name, type, essential, 1, 1))
       this 
    }
    
    //add subconcept with anonymous concept type
    def CodeConcept addSubconcept(String name, MappingType mappingType) {
        val newcc = new CodeConcept(name)
        newcc.mappingType = mappingType
        addSubconcept(newcc)
        this
    }
    
    def CodeConcept addSubconcept(String name, MappingType mappingType, boolean essential) {
        val newcc = new CodeConcept(name)
        newcc.mappingType = mappingType
        addSubconcept(name, newcc, essential, 1, 1)
        this
    }
    
    def CodeConcept addSubconcept(String name, MappingType mappingType, boolean essential, int min, int max) {
        val newcc = new CodeConcept(name)
        newcc.setMappingType(mappingType)
        addSubconcept(name, newcc, essential, min, max)
        this
    }
    
    def void setMappingType(MappingType mt) {
        mappingType = mt.withParams(#{})  //ensures one instance per concept
        mappingType.mappedTo = this
        
        //could validate parameters here
    }
    
    //def operator_modulo(Map<String,Object> paramValues) {
    //    refine(paramValues)
   // }
        
    def CodeConcept refine(Map<String,Object> paramValues) {
        refine(null, paramValues)
    }
    
    def CodeConcept refine(String name, Map<String,Object> paramValues) {
        val newcc = new CodeConcept(name)
        newcc.refines = this
        newcc.setMappingType(this.mappingType)
        //newcc.mapsTo = mapsTo
        paramValues.forEach[k, v|
            if (parameters.contains(k)) {
                newcc.parameterValues.put(k,v)
            }
            else {
                throw new CodeConceptException("CodeConcept " + getName + " does not have parameter: " + k)
            }
        ]
        
        //default is to call my find
        //newcc.find = [me,context|
        //    this.find.apply(me, context)
        //]
        
        //default is to call my annotate
        //newcc.annotate = [map,source|
        //    this.annotate.apply(map,source)
        //]
        
        newcc
    }
    
    override toString() {
        '''
        CodeConcept: «getName»«IF(refines!=null)» refines «refines.getName»«ENDIF»
        Parameters Values: «FOR pv : parameterValues.entrySet»
            - «pv.key» = «pv.value»«ENDFOR»
        Declared Parameters: «FOR p : declaredParameters»
            - «p»«ENDFOR»
        All Parameters: «FOR p : getParameters»
            - «p»«ENDFOR» 
        Declared Subconcepts: «FOR s : declaredSubconcepts»
            - «s.name»«ENDFOR»
        All Subconcepts: «FOR s : getSubconcepts»
            - «s.name»«ENDFOR»
        '''    
    }
    
    
}
				