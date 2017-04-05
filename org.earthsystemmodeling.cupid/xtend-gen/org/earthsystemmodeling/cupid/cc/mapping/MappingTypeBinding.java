package org.earthsystemmodeling.cupid.cc.mapping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.mapping.IllegalVariableAssignment;
import org.earthsystemmodeling.cupid.cc.mapping.MappingResult;
import org.earthsystemmodeling.cupid.cc.mapping.MappingResultSet;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeException;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeParameter;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeParameterBinding;
import org.earthsystemmodeling.cupid.cc.types.MTPType;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IProgramUnit;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STErrorListener;
import org.stringtemplate.v4.STGroupString;
import org.stringtemplate.v4.misc.STMessage;

@SuppressWarnings("all")
public class MappingTypeBinding {
  @Accessors
  private MappingType mappingType;
  
  @Accessors
  private CodeConcept concept;
  
  @Accessors
  private Map<String, MappingTypeParameterBinding> bindings = CollectionLiterals.<String, MappingTypeParameterBinding>newLinkedHashMap();
  
  private CodeConceptInstance currentContext;
  
  private CodeConceptInstance currentInstance;
  
  private MappingResultSet resultSet;
  
  private MappingResult currentResult;
  
  public MappingTypeBinding(final MappingType mappingType, final CodeConcept concept) {
    this.mappingType = mappingType;
    this.concept = concept;
  }
  
  public MappingTypeBinding(final MappingTypeBinding toClone, final CodeConcept concept) {
    this(toClone.mappingType, concept);
    final BiConsumer<String, MappingTypeParameterBinding> _function = (String k, MappingTypeParameterBinding v) -> {
      MappingTypeParameterBinding _clone = v.clone(this);
      this.bindings.put(k, _clone);
    };
    toClone.bindings.forEach(_function);
  }
  
  public <T extends Object> T getValue(final MappingTypeParameter variable) {
    try {
      T _xblockexpression = null;
      {
        final Object retVal = this.mappingType.getParameterValue(variable);
        T _xifexpression = null;
        boolean _notEquals = (!Objects.equal(retVal, null));
        if (_notEquals) {
          _xifexpression = ((T) retVal);
        } else {
          MappingTypeParameterBinding _get = this.bindings.get(variable);
          MTPType<?> _value = _get.getValue();
          _xifexpression = ((T) _value);
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public <T extends Object> T getValue(final String variable) {
    try {
      T _xblockexpression = null;
      {
        final MappingTypeParameter mtv = this.mappingType.getParameter(variable);
        boolean _equals = Objects.equal(mtv, null);
        if (_equals) {
          String _name = this.mappingType.getName();
          String _plus = ("Mapping type " + _name);
          String _plus_1 = (_plus + " does not have parameter: ");
          String _plus_2 = (_plus_1 + variable);
          throw new MappingTypeException(_plus_2);
        }
        _xblockexpression = this.<T>getValue(mtv);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String getValueString(final String variable) {
    return this.<String>getValue(variable);
  }
  
  public <T extends Object> void setValue(final MappingTypeParameter variable, final MTPType<?> value) {
    MappingTypeParameterBinding _get = this.bindings.get(variable);
    ((MappingTypeParameterBinding) _get).setValue(value);
  }
  
  public <T extends Object> void setValue(final String variable, final MTPType<?> value) {
    try {
      final MappingTypeParameter mtv = this.mappingType.getParameter(variable);
      boolean _equals = Objects.equal(mtv, null);
      if (_equals) {
        String _name = this.mappingType.getName();
        String _plus = ("Mapping type " + _name);
        String _plus_1 = (_plus + " does not have parameter: ");
        String _plus_2 = (_plus_1 + variable);
        throw new MappingTypeException(_plus_2);
      }
      this.<Object>setValue(mtv, value);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public MappingTypeParameterBinding getBinding(final String variable) {
    return this.bindings.get(variable);
  }
  
  /**
   * def putBinding(MappingTypeParameter<?> variable, MappingTypeParameterBinding<?> binding) {
   * if (!mappingType.hasParameter(variable)) {
   * throw new MappingTypeException("Mapping type " + mappingType.name + " does not have parameter named: " + variable.name)
   * }
   * binding.binding = this
   * bindings.put(variable, binding)
   * }
   */
  public MappingTypeParameterBinding putBinding(final String variable, final MappingTypeParameterBinding binding) {
    try {
      MappingTypeParameterBinding _xblockexpression = null;
      {
        boolean _hasParameter = this.mappingType.hasParameter(variable);
        boolean _not = (!_hasParameter);
        if (_not) {
          String _name = this.mappingType.getName();
          String _plus = ("Mapping type " + _name);
          String _plus_1 = (_plus + " does not have parameter named: ");
          String _plus_2 = (_plus_1 + variable);
          throw new MappingTypeException(_plus_2);
        }
        binding.setBinding(this);
        _xblockexpression = this.bindings.put(variable, binding);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean fullyBound() {
    List<MappingTypeParameter> _unbound = this.unbound();
    int _size = _unbound.size();
    return (_size == 0);
  }
  
  public List<MappingTypeParameter> unbound() {
    LinkedList<MappingTypeParameter> _xblockexpression = null;
    {
      final LinkedList<MappingTypeParameter> retList = CollectionLiterals.<MappingTypeParameter>newLinkedList();
      List<MappingTypeParameter> _parameters = this.mappingType.getParameters();
      final Function1<MappingTypeParameter, Boolean> _function = (MappingTypeParameter p) -> {
        return Boolean.valueOf(((!this.bindings.containsKey(p)) && Objects.equal(this.mappingType.getParameterValue(p), null)));
      };
      Iterable<MappingTypeParameter> _filter = IterableExtensions.<MappingTypeParameter>filter(_parameters, _function);
      Iterables.<MappingTypeParameter>addAll(retList, _filter);
      _xblockexpression = retList;
    }
    return _xblockexpression;
  }
  
  public boolean unbound(final String variable) {
    MappingTypeParameterBinding _binding = this.getBinding(variable);
    return Objects.equal(_binding, null);
  }
  
  /**
   * Execute the mapping to try to bind a single result. If successful, the returned
   * instance will be set as a child of the parent.
   * 
   * @param parent the parent context
   * @return an instance of this binding's concept, or null if none found
   */
  public CodeConceptInstance find(final CodeConceptInstance parent) {
    CodeConceptInstance _xblockexpression = null;
    {
      MappingResultSet _mappingResultSet = new MappingResultSet(this.mappingType);
      this.resultSet = _mappingResultSet;
      this.currentContext = parent;
      this.mappingType.doFind(this);
      this.currentContext = null;
      CodeConceptInstance _xifexpression = null;
      int _size = this.resultSet.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        CodeConceptInstance _xblockexpression_1 = null;
        {
          final MappingResult res = this.resultSet.first();
          MTPType<?> _match = res.match();
          final CodeConceptInstance instance = this.concept.newInstance(parent, _match);
          this.currentInstance = instance;
          Map<String, MTPType<?>> _values = res.getValues();
          final BiConsumer<String, MTPType<?>> _function = (String k, MTPType<?> v) -> {
            boolean _equals = k.equals("match");
            boolean _not = (!_equals);
            if (_not) {
              try {
                this.<Object>setValue(k, v);
              } catch (final Throwable _t) {
                if (_t instanceof UnsupportedOperationException) {
                  final UnsupportedOperationException uoe = (UnsupportedOperationException)_t;
                } else {
                  throw Exceptions.sneakyThrow(_t);
                }
              }
            }
          };
          _values.forEach(_function);
          this.currentInstance = null;
          _xblockexpression_1 = instance;
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Execute the mapping to try to bind multiple results. If successful, the returned
   * instances will be set as a child of the parent.
   * 
   * @param parent the parent context
   * @return a (potentially empty) list of instances of this binding's concept
   */
  public List<CodeConceptInstance> findAll(final CodeConceptInstance parent) {
    LinkedList<CodeConceptInstance> _xblockexpression = null;
    {
      MappingResultSet _mappingResultSet = new MappingResultSet(this.mappingType);
      this.resultSet = _mappingResultSet;
      this.currentContext = parent;
      this.mappingType.doFind(this);
      this.currentContext = null;
      final LinkedList<CodeConceptInstance> retList = CollectionLiterals.<CodeConceptInstance>newLinkedList();
      List<MappingResult> _results = this.resultSet.getResults();
      final Consumer<MappingResult> _function = (MappingResult r) -> {
        MTPType<?> _match = r.match();
        final CodeConceptInstance instance = this.concept.newInstance(parent, _match);
        this.currentInstance = instance;
        Map<String, MTPType<?>> _values = r.getValues();
        final BiConsumer<String, MTPType<?>> _function_1 = (String k, MTPType<?> v) -> {
          boolean _equals = k.equals("match");
          boolean _not = (!_equals);
          if (_not) {
            this.<Object>setValue(k, v);
          }
        };
        _values.forEach(_function_1);
        this.currentInstance = null;
        retList.add(instance);
      };
      _results.forEach(_function);
      _xblockexpression = retList;
    }
    return _xblockexpression;
  }
  
  public CodeConceptInstance forwardAdd(final CodeConceptInstance instance) {
    CodeConceptInstance _xblockexpression = null;
    {
      this.currentInstance = instance;
      this.mappingType.doForwardAdd(this);
      _xblockexpression = this.currentInstance = null;
    }
    return _xblockexpression;
  }
  
  /**
   * static Pattern TEMPLATE_VAR = Pattern.compile("\\{\\w+\\}")
   * 
   * def fill(String template) {
   * //TODO: look into StringTemplate
   * val matcher = TEMPLATE_VAR.matcher(template)
   * val sb = new StringBuffer
   * while (matcher.find()) {
   * var varToReplace = matcher.group
   * varToReplace = varToReplace.substring(1, varToReplace.length-1)
   * val replacement = getValueString(varToReplace)
   * if (replacement != null) {
   * matcher.appendReplacement(sb, replacement)
   * }
   * else {
   * //matcher.appendReplacement(sb, matcher.group)  //leave unchanged
   * throw new MappingTypeException("Template variable cannot be evaluated: " + varToReplace + "\n******\n" + template + "\n******")
   * }
   * }
   * matcher.appendTail(sb)
   * 
   * sb.toString
   * }
   */
  public String fillST(final String template) {
    try {
      String _xblockexpression = null;
      {
        final LinkedList<String> templateParams = CollectionLiterals.<String>newLinkedList();
        Set<String> _keySet = this.bindings.keySet();
        final Function1<String, Boolean> _function = (String k) -> {
          return Boolean.valueOf(((!Objects.equal(k, "match")) && (!Objects.equal(k, "context"))));
        };
        Iterable<String> _filter = IterableExtensions.<String>filter(_keySet, _function);
        Iterables.<String>addAll(templateParams, _filter);
        Map<MappingTypeParameter, Object> _parameterValues = this.mappingType.getParameterValues();
        final BiConsumer<MappingTypeParameter, Object> _function_1 = (MappingTypeParameter k, Object v) -> {
          String _name = k.getName();
          boolean _contains = templateParams.contains(_name);
          boolean _not = (!_contains);
          if (_not) {
            String _name_1 = k.getName();
            templateParams.add(_name_1);
          }
        };
        _parameterValues.forEach(_function_1);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("ESMFErrorCheck(rc) ::= <<");
        _builder.newLine();
        _builder.append("if (ESMF_LogFoundError(rcToCheck=<rc>, msg=ESMF_LOGERR_PASSTHRU, &");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("line=__LINE__, &");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("file=__FILE__)) &");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("return");
        _builder.newLine();
        _builder.append(">>");
        _builder.newLine();
        _builder.newLine();
        {
          Map<String, String> _templates = this.mappingType.getTemplates();
          Set<Map.Entry<String, String>> _entrySet = _templates.entrySet();
          for(final Map.Entry<String, String> e : _entrySet) {
            String _key = e.getKey();
            _builder.append(_key, "");
            _builder.append("() ::= <<");
            _builder.newLineIfNotEmpty();
            String _value = e.getValue();
            _builder.append(_value, "");
            _builder.newLineIfNotEmpty();
            _builder.append(">>");
            _builder.newLine();
          }
        }
        _builder.newLine();
        _builder.append("thistmp_(");
        {
          boolean _hasElements = false;
          for(final String arg : templateParams) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            _builder.append(arg, "");
          }
        }
        _builder.append(") ::= <<");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append(template, "");
        _builder.newLineIfNotEmpty();
        _builder.append(">>");
        _builder.newLine();
        final String templateGroup = _builder.toString();
        final STGroupString stgroup = new STGroupString(templateGroup);
        stgroup.setListener(MappingTypeBinding.templateErrorListener);
        final ST st = stgroup.getInstanceOf("thistmp_");
        boolean _equals = Objects.equal(st, null);
        if (_equals) {
          throw new MappingTypeException(("Error in template: " + template));
        }
        final BiConsumer<String, MappingTypeParameterBinding> _function_2 = (String k, MappingTypeParameterBinding v) -> {
          if (((!Objects.equal(k, "match")) && (!Objects.equal(k, "context")))) {
            Object _value_1 = this.<Object>getValue(k);
            st.add(k, _value_1);
          }
        };
        this.bindings.forEach(_function_2);
        Map<MappingTypeParameter, Object> _parameterValues_1 = this.mappingType.getParameterValues();
        final BiConsumer<MappingTypeParameter, Object> _function_3 = (MappingTypeParameter k, Object v) -> {
          String _name = k.getName();
          Object _value_1 = this.<Object>getValue(k);
          st.add(_name, _value_1);
        };
        _parameterValues_1.forEach(_function_3);
        _xblockexpression = st.render();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public <T extends IProgramUnit> T parseProgramUnit(final String template) {
    T _xblockexpression = null;
    {
      final String code = this.fillST(template);
      _xblockexpression = CodeExtraction.<T>parseLiteralProgramUnit(code);
    }
    return _xblockexpression;
  }
  
  public <T extends IBodyConstruct> T parseStatement(final String template) {
    T _xblockexpression = null;
    {
      final String code = this.fillST(template);
      _xblockexpression = CodeExtraction.<T>parseLiteralStatement(code);
    }
    return _xblockexpression;
  }
  
  public IASTListNode<IBodyConstruct> parseStatementSeq(final String template) {
    IASTListNode<IBodyConstruct> _xblockexpression = null;
    {
      final String code = this.fillST(template);
      _xblockexpression = CodeExtraction.parseLiteralStatementSequence(code);
    }
    return _xblockexpression;
  }
  
  private void addBindingToResult(final String variable, final MTPType<?> value) {
    try {
      boolean _equals = Objects.equal(this.currentResult, null);
      if (_equals) {
        MappingResult _mappingResult = new MappingResult();
        this.currentResult = _mappingResult;
      }
      if (((!Objects.equal(value, null)) && (!this.mappingType.getParameterType(variable).isInstance(value)))) {
        Class<?> _parameterType = this.mappingType.getParameterType(variable);
        Class<? extends MTPType> _class = value.getClass();
        throw new IllegalVariableAssignment(variable, _parameterType, _class);
      }
      this.currentResult.put(variable, value);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public <T extends IASTNode> boolean bind(final String variable, final T node) {
    return false;
  }
  
  /**
   * def boolean bindToken(String variable, Token token) {
   * val toMatch = getValueString(variable)
   * if (toMatch != null) {
   * toMatch.equalsIgnoreCase(token.text)
   * }
   * else {
   * addBindingToResult(variable, token.text)
   * true
   * }
   * }
   */
  public MappingResult addResult(final MTPType<?> match) {
    try {
      Class<?> _matchType = this.mappingType.matchType();
      boolean _isInstance = _matchType.isInstance(match);
      boolean _not = (!_isInstance);
      if (_not) {
        Class<?> _matchType_1 = this.mappingType.matchType();
        Class<? extends MTPType> _class = match.getClass();
        throw new IllegalVariableAssignment("match", _matchType_1, _class);
      }
      boolean _notEquals = (!Objects.equal(this.currentResult, null));
      if (_notEquals) {
        this.currentResult.put("match", match);
        this.resultSet.addResult(this.currentResult);
        final MappingResult toRet = this.currentResult;
        this.currentResult = null;
        return toRet;
      } else {
        return this.resultSet.addMatch(match);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean reset() {
    boolean _xblockexpression = false;
    {
      this.currentResult = null;
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
  
  /**
   * Called by a refining MappingType to filter the results by checking
   * the provided predicate against each result's match.
   */
  public <T extends Object> void removeMatchIf(final Function1<? super T, Boolean> predicate) {
    this.resultSet.<T>removeMatchIf(predicate);
  }
  
  /**
   * Called by a refining MappingType to filter the results by checking
   * the provided predicate against each result's match.
   */
  public <T extends Object> void retainMatchIf(final Function1<? super T, Boolean> predicate) {
    this.resultSet.<T>retainMatchIf(predicate);
  }
  
  /**
   * Called by a refining MappingType to apply an action to each of the
   * results.  This is typically to annotate each of the results.
   */
  public void forEachResult(final Consumer<? super MappingResult> action) {
    List<MappingResult> _results = this.resultSet.getResults();
    _results.forEach(action);
  }
  
  /**
   * def addResult(Map<String, Object> params) {
   * val result = addResult(params.get("match"))  //TODO: for now assume there is a match
   * params.forEach[k, v|
   * if (!k.equals("match")) {
   * result.put(k, v)  //TODO: could type check here
   * }
   * ]
   * result
   * }
   */
  public <T extends Object> T context() {
    return this.<T>getValue("context");
  }
  
  public void setMatch(final MTPType<?> match) {
    this.<Object>setValue("match", match);
  }
  
  public CodeConceptInstance getCurrentContext() {
    CodeConceptInstance _xifexpression = null;
    boolean _notEquals = (!Objects.equal(this.currentContext, null));
    if (_notEquals) {
      _xifexpression = this.currentContext;
    } else {
      CodeConceptInstance _xifexpression_1 = null;
      boolean _notEquals_1 = (!Objects.equal(this.currentInstance, null));
      if (_notEquals_1) {
        _xifexpression_1 = this.currentInstance.getParent();
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CodeConceptInstance getCurrentInstance() {
    return this.currentInstance;
  }
  
  private static STErrorListener templateErrorListener = new STErrorListener() {
    @Override
    public void IOError(final STMessage m) {
      try {
        String _string = m.toString();
        throw new MappingTypeException(_string);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    @Override
    public void compileTimeError(final STMessage m) {
      try {
        String _string = m.toString();
        throw new MappingTypeException(_string);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    @Override
    public void internalError(final STMessage m) {
      try {
        String _string = m.toString();
        throw new MappingTypeException(_string);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    @Override
    public void runTimeError(final STMessage m) {
      try {
        String _string = m.toString();
        throw new MappingTypeException(_string);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  };
  
  @Pure
  public MappingType getMappingType() {
    return this.mappingType;
  }
  
  public void setMappingType(final MappingType mappingType) {
    this.mappingType = mappingType;
  }
  
  @Pure
  public CodeConcept getConcept() {
    return this.concept;
  }
  
  public void setConcept(final CodeConcept concept) {
    this.concept = concept;
  }
  
  @Pure
  public Map<String, MappingTypeParameterBinding> getBindings() {
    return this.bindings;
  }
  
  public void setBindings(final Map<String, MappingTypeParameterBinding> bindings) {
    this.bindings = bindings;
  }
}
