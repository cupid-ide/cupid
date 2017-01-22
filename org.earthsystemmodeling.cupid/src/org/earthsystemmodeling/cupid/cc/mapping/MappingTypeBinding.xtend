package org.earthsystemmodeling.cupid.cc.mapping

import java.util.List
import java.util.Map
import java.util.regex.Pattern
import org.earthsystemmodeling.cupid.cc.CodeConcept
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance
import org.eclipse.photran.internal.core.lexer.Token
import org.eclipse.photran.internal.core.parser.IASTListNode
import org.eclipse.photran.internal.core.parser.IASTNode
import org.eclipse.photran.internal.core.parser.IBodyConstruct
import org.eclipse.photran.internal.core.parser.IExpr
import org.eclipse.photran.internal.core.parser.IProgramUnit
import org.eclipse.xtend.lib.annotations.Accessors
import org.stringtemplate.v4.STErrorListener
import org.stringtemplate.v4.STGroupString
import org.stringtemplate.v4.misc.STMessage

import static org.earthsystemmodeling.cupid.util.CodeExtraction.*

class MappingTypeBinding {
    
    @Accessors
    MappingType mappingType
    
    @Accessors
    CodeConcept concept
    
    @Accessors
    Map<MappingTypeVariable<?>, MappingTypeVariableBinding<?>> bindings = newLinkedHashMap
    
    //@Accessors(PROTECTED_GETTER)
    CodeConceptInstance currentContext
    
    //@Accessors(PROTECTED_GETTER)
    CodeConceptInstance currentInstance
      
    @Accessors(PUBLIC_GETTER)  //can be accessed by refinements of mappingType
    MappingResultSet resultSet
    
    MappingResult currentResult
    
    new(MappingType mappingType, CodeConcept concept) {
        this.mappingType = mappingType
        this.concept  = concept
    }
    
    new(MappingTypeBinding toClone, CodeConcept concept) {
    	this(toClone.mappingType, concept)
    	toClone.bindings.forEach[k,v|
    		this.bindings.put(k,v.clone(this))
    	]
    }
    
    def <T> T getValue(MappingTypeVariable<T> variable) {
        //first, see if defined at mappingType level
        val retVal = mappingType.getParameterValue(variable)
        if (retVal != null) {
        	retVal as T
        }
        else {
        	bindings.get(variable).value as T
        }
    }
    
    def <T> T getValue(String variable) {
        val mtv = mappingType.getParameter(variable)
        if (mtv == null) {
    		throw new MappingTypeException("Mapping type " + mappingType.name + " does not have parameter: " + variable)
    	}
        //bindings.get(mtv).value as T
        getValue(mtv)
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
         retList.addAll(mappingType.getParameters().filter[p|
         	!bindings.containsKey(p) && mappingType.getParameterValue(p) == null])
         retList
    }
    
    def unbound(String variable) {
    	getBinding(variable) == null
    }
    
        
    /**
     * Execute the mapping to try to bind a single result. If successful, the returned
     * instance will be set as a child of the parent. 
     * 
     * @param parent the parent context
     * @return an instance of this binding's concept, or null if none found
     */
    def CodeConceptInstance find(CodeConceptInstance parent) {
    	
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
    				try {
    					setValue(k, v)
    				}
    				catch(UnsupportedOperationException uoe) {
    					//ignore - this means we tried to set a literal, so
    					//the concept is not really interested in this value
    				}
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
    def List<CodeConceptInstance> findAll(CodeConceptInstance parent) {
    	
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
	
	def forwardAdd(CodeConceptInstance instance) {
		currentInstance = instance
		mappingType.doForwardAdd(this)
		currentInstance = null
	}
	
	static Pattern TEMPLATE_VAR = Pattern.compile("\\{\\w+\\}")
	
	def fill(String template) {
		//TODO: look into StringTemplate
		val matcher = TEMPLATE_VAR.matcher(template)
		val sb = new StringBuffer
		while (matcher.find()) {
			var varToReplace = matcher.group
			varToReplace = varToReplace.substring(1, varToReplace.length-1)
			val replacement = getValueString(varToReplace)
			if (replacement != null) {
				matcher.appendReplacement(sb, replacement)
			}
			else {
				//matcher.appendReplacement(sb, matcher.group)  //leave unchanged
				throw new MappingTypeException("Template variable cannot be evaluated: " + varToReplace + "\n******\n" + template + "\n******")
			}
		}
		matcher.appendTail(sb)
		
		sb.toString
	}
	
		
	def fillST(String template) {
		
		val templateParams = newLinkedList
		templateParams.addAll(bindings.keySet.filter[k|k.name != "match" && k.name != "context"].map[k|k.name])
		mappingType.getParameterValues.forEach[k,v|
			if (!templateParams.contains(k.name)) {
				templateParams.add(k.name)
			}
		]
		
		//TODO: consider computing this once and caching, if possible
		val templateGroup = 
			'''
				ESMFErrorCheck(rc) ::= <<
				if (ESMF_LogFoundError(rcToCheck=<rc>, msg=ESMF_LOGERR_PASSTHRU, &
					line=__LINE__, &
					file=__FILE__)) &
					return
				>>
				
				«FOR e : mappingType.templates.entrySet»
				«e.key»() ::= <<
				«e.value»
				>>
				«ENDFOR»
				
				thistmp_(«FOR arg : templateParams SEPARATOR ', '»«arg»«ENDFOR») ::= <<
				
				«template»
				>>
			'''
		
		val stgroup = new STGroupString(templateGroup)
		stgroup.setListener(templateErrorListener)
		
		val st = stgroup.getInstanceOf("thistmp_") //new ST(template)
		if (st == null) {
			throw new MappingTypeException("Error in template: " + template)
		}
		bindings.forEach[k,v|
			if (k.name != "match" && k.name != "context") {
				st.add(k.name, getValue(k))
			}
		]
		mappingType.getParameterValues.forEach[k,v|
			st.add(k.name, getValue(k))
		]
		//add error check
		//st.add("ESMFErrorCheck", "blag")
		
		st.render
		
	}
	
	def <T extends IProgramUnit> T parseProgramUnit(String template) {
		val code = fillST(template)
		parseLiteralProgramUnit(code)
	}
	
	def <T extends IBodyConstruct> T parseStatement(String template) {
		val code = fillST(template)
		parseLiteralStatement(code)
	}
	
	def IASTListNode<IBodyConstruct> parseStatementSeq(String template) {
		val code = fillST(template)
		parseLiteralStatementSequence(code)
	}
	
	
	
	private def void addBindingToResult(String variable, Object value) {
		if (currentResult == null) {
			currentResult = new MappingResult
		}
		if (value != null && !mappingType.getParameterType(variable).isInstance(value)) {
			throw new IllegalVariableAssignment(variable, mappingType.getParameterType(variable), value.class)
		}
		currentResult.put(variable, value)
	}
	
	def <T extends IASTNode> boolean bind(String variable, T node) {
		val T toMatch = getValue(variable)
		if (toMatch != null) {
			toMatch.equals(node)
		}
		else {
			addBindingToResult(variable, node)
			true
		}
	}    
	    
	def boolean bindExpr(String variable, IExpr expr) {
		val toMatch = getValueString(variable)
		if (toMatch != null) {
			toMatch.equalsIgnoreCase(expr.toString.trim)
		}
		else {
			addBindingToResult(variable, expr.toString.trim)
			true
		}
	}
	
	def boolean bindExprContains(String variable, IExpr expr) {
		val toMatch = getValueString(variable)
		if (toMatch != null) {
			toMatch.toLowerCase.contains(expr.toString.trim.toLowerCase)
		}
		else {
			addBindingToResult(variable, expr.toString.trim)
			true
		}
	}
	
	def boolean bindToken(String variable, Token token) {
		val toMatch = getValueString(variable)
		if (toMatch != null) {
			toMatch.equalsIgnoreCase(token.text)
		}
		else {
			addBindingToResult(variable, token.text)
			true
		}
	}
	    
    def addResult(Object match) {
    	if (!mappingType.matchType.isInstance(match)) {
    		throw new IllegalVariableAssignment("match", mappingType.matchType, match.class)
    	}
    	if (currentResult != null) {
    		currentResult.put("match", match)
    		resultSet.addResult(currentResult)
    		val toRet = currentResult
    		currentResult = null
    		return toRet
    	}
    	else {
    		return resultSet.addMatch(match)
    	} 	
    }
    
    def reset() {
    	currentResult = null
    }
    
    /*
    def addResult(Map<String, Object> params) {
    	val result = addResult(params.get("match"))  //TODO: for now assume there is a match
    	params.forEach[k, v|
    		if (!k.equals("match")) {
    			result.put(k, v)  //TODO: could type check here
    		}
    	]
    	result
    }
    */
    
    def <T> T context() {
        getValue("context")
    }
    
    def <T> setMatch(T match) {
    	setValue("match", match)
    }
    
    def CodeConceptInstance getCurrentContext() {
    	if (currentContext != null) {
    		currentContext
    	}
    	else if (currentInstance != null) {
    		currentInstance.parent
    	}
    }
    
    def CodeConceptInstance getCurrentInstance() {
    	 currentInstance
    }
    
    
    static STErrorListener templateErrorListener = new STErrorListener() {
		
		override IOError(STMessage m) {
			throw new MappingTypeException(m.toString)
		}
		
		override compileTimeError(STMessage m) {
			throw new MappingTypeException(m.toString)
		}
		
		override internalError(STMessage m) {
			throw new MappingTypeException(m.toString)
		}
		
		override runTimeError(STMessage m) {
			throw new MappingTypeException(m.toString)
		}
		
	}
    
}