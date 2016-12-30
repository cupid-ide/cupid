package org.earthsystemmodeling.cupid.cc.mapping

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Map
import java.util.List
import org.earthsystemmodeling.cupid.cc.CodeConcept
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance

class MappingType {
    
    String name
   
    //@Accessors
    //CodeConcept mappingFor
    
    @Accessors
    MappingType refines
    
    @Accessors
    List<MappingTypeVariable<?>> parameters = newLinkedList
      
    @Accessors
    private (MappingType, MappingResultSet)=>void find
           
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
    }
    
    def String getName() {
        if (name != null) name
        else if (refines != null) "refinement of " + refines.getName
    }
    
    static def isStaticReference(Object obj) {
        (obj instanceof String) && ((obj as String).startsWith("$"))
    }
    
    static def getStaticReference(Object obj) {
        new CodeConceptParameterReference((obj as String).substring(1))
    }
    
    static def isDynamicReference(Object obj) {
        (obj instanceof String) && ((obj as String).startsWith("../"))
    }
    
    static def getDynamicReference(Object obj) {
         new CodeConceptInstanceReference(obj as String)
    }
    
    def MappingType define() {
        define(null)
    }
    
    def MappingType define(Map<String, Object> parameterValues) {
        refine(null, parameterValues)
    }
     
    def MappingType refine(Map<String, Class<?>> newParameters) {
        refine(newParameters, null)        
    }
          
    //refine by providing parameter values
    def MappingType refine(Map<String, Class<?>> newParameters, Map<String, Object> parameterValues) {
        val mt = new MappingType(this, newParameters)
                
        //validate inputs
        if (parameterValues != null) {
            for (input : parameterValues.entrySet) {
                if (!hasParameter(input.key)) {
                    throw new MappingTypeException("Mapping type " + name + " does not have input parameter: " + input.key)
                }
                val mtv = getParameter(input.key)
                
                if (isStaticReference(input.value)) {
                    mtv.bind(getStaticReference(input.value))
                }
                else if (isDynamicReference(input.value)) {
                    mtv.bind(getDynamicReference(input.value))
                }
                else {
                   mtv.bind(new LiteralMTVBinding(input.value))
                }
            }
        }
        //implicitly bind "context" parameter if needed
        if (mt.hasParameter("context") && !mt.getParameter("context").isBound) {
            mt.getParameter("context").bind(new CodeConceptInstanceReference(null))
        }
        
        mt.find = [me, result | this.find.apply(me, result)]
        mt
    }
    
     
    def void resolveStaticBindings(CodeConcept concept) {
        getParameters().filter[v|v.bound && v.binding instanceof CodeConceptParameterReference<?>].forEach[v|
            (v.binding as CodeConceptParameterReference<?>).bindWith(concept)
        ]
    }
    
    def void resolveDynamicBindings(CodeConceptInstance instance) {
        getParameters().filter[v|v.bound && v.binding instanceof CodeConceptInstanceReference<?>].forEach[v|
            (v.binding as CodeConceptInstanceReference<?>).bindWith(instance)
        ]
    }
    
    
    def CodeConcept getMappingFor() {
        if (mappingFor != null) {
            mappingFor
        }
        else if (refines != null) {
            refines.getMappingFor
        }
        else {
            null
        }
    }

    def hasParameter(String name) {
        getParameter(name) != null    
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
    
    def <T> T get(String name) {
        
        if (!hasParameter(name)) {
            throw new MappingTypeException("Mapping type " + getName + " does not have input parameter: " + name)
        }
        
        getParameter(name).resolve() as T
                
        //try to bind to static concept parameter
        /*
        if (String.isInstance(inputVal) && getMappingFor != null) {
            val strVal = inputVal as String
            if (strVal.startsWith("$")) {
                //if it can be satisfied at this level, return it
                val toRet = getMappingFor.getParameterValue(strVal.substring(1)) as T
                if (toRet != null) return toRet
            }
        }
        */
        
    }    
     
    def <T> T context() {
        get("context")
    } 
    
    def Class<?> matchType() {
        getParameterType("match")
    }
                
    def doFind() {
        val resultset = new MappingResultSet(this)
        if (refines != null) {
            refines.find.apply(this, resultset)
        }
        find.apply(this, resultset)
        resultset
    }
    
       
   
    
}
					