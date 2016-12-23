package org.earthsystemmodeling.cupid.cc

import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

class CodeConcept {
    
    //may be null for anonymous
    protected String name = null
        
    @Accessors
    protected CodeConcept refines = null
    
    //list of formal parameters    
    protected List<String> parameters = newLinkedList
    
    //parameter values to refine the super type
    @Accessors
    protected Map<String,Object> parameterValues = newLinkedHashMap
    
    protected List<CodeSubconcept> subconcepts = newLinkedList
    
    @Accessors
    protected Class<?> mapsTo = null
    
    //find an instance of the this concept in the current context
    //CodeConcept param is ref to calling concept
    //CodeConceptInstnace param is context (parent)
    @Accessors
    protected (CodeConcept, CodeConceptInstance)=>Object find
    
    @Accessors
    protected (CodeConcept, CodeConceptInstance)=>Iterable<?> findAll
    
    //given a found source instance, add the annotations to store
    //Map<String,Object> is map for annotations
    //Object is the source ref
    @Accessors
    protected (Map<String,Object>, Object)=>void annotate = [map,src|/* default - do nothing */]
    
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
    
    //consider moving this into CodeSubconcept
    def protected List<CodeConceptInstance> reverseAll(CodeConceptInstance parent) {
        val sourceMatches = findAll.apply(this, parent)
        val retList = newLinkedList
        sourceMatches.forEach[match|
            val cci = reverse(parent, match)
            if (cci != null) {
                retList.add(cci)
            }
        ]
        retList
    }
      
    def protected CodeConceptInstance reverse(CodeConceptInstance parent) {
        val sourceRef = find.apply(this, parent)
        if (sourceRef != null) {
            reverse(parent, sourceRef)
        }
    }
    
    def protected CodeConceptInstance reverse(CodeConceptInstance parent, Object sourceMatch) {
        val cci = newInstance(sourceMatch)
        annotate.apply(cci.annotations, sourceMatch)
        try {
            getSubconcepts.forEach[sc|
                if (sc.max == 1) {
                    val subconceptInstance = sc.type.reverse(cci)
                    if (subconceptInstance == null) {
                        if (sc.min > 0) {
                            throw new InterruptedException()
                        }
                    }
                    else {
                        cci.addSubconceptInstance(sc, subconceptInstance)
                    }
                }
                else {
                    val subconceptInstances = sc.type.reverseAll(cci)
                    if (subconceptInstances.size < sc.min || subconceptInstances.size > sc.max) {
                        throw new InterruptedException()
                    }
                    for (subconceptInstance : subconceptInstances) {
                        cci.addSubconceptInstance(sc, subconceptInstance)
                    }
                }
            ]
        }
        catch(InterruptedException ie) {
            //required subconcept did not match, so return null
            return null
        }                    
        cci 
    }
    
    def protected CodeConceptInstance newInstance(Object sourceRef) {
        //verify all parameters defined, if not can't instantiate
        if (getParameters.exists[p|getParameterValue(p) == null]) {
            throw new CodeConceptException("Cannot instantiate CodeConcept " + name + " because not all parameters have been defined.")
        }
        new CodeConceptInstance(this, sourceRef)
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
        subconcepts.add(new CodeSubconcept(type))
        this
    }
    
    def CodeConcept addSubconcept(String name, CodeConcept type) {
       subconcepts.add(new CodeSubconcept(name, type, 1, 1))
       this 
    }
    
    def operator_modulo(Map<String,Object> paramValues) {
        newRefinement(paramValues)
    }
        
    def CodeConcept newRefinement(Map<String,Object> paramValues) {
        newRefinement(null, paramValues)
    }
    
    def CodeConcept newRefinement(String name, Map<String,Object> paramValues) {
        val newcc = new CodeConcept(name)
        newcc.refines = this
        newcc.mapsTo = mapsTo
        paramValues.forEach[k, v|
            if (parameters.contains(k)) {
                newcc.parameterValues.put(k,v)
            }
            else {
                throw new CodeConceptException("CodeConcept " + getName + " does not have parameter: " + k)
            }
        ]
        
        //default is to call my find
        newcc.find = [me,context|
            this.find.apply(me, context)
        ]
        
        //default is to call my annotate
        newcc.annotate = [map,source|
            this.annotate.apply(map,source)
        ]
        
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
				