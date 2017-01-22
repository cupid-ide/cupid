package org.earthsystemmodeling.cupid.cc.mapping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.mapping.IllegalVariableAssignment;
import org.earthsystemmodeling.cupid.cc.mapping.MappingResult;
import org.earthsystemmodeling.cupid.cc.mapping.MappingResultSet;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeException;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariable;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariableBinding;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IExpr;
import org.eclipse.photran.internal.core.parser.IProgramUnit;
import org.eclipse.xtend.lib.annotations.AccessorType;
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
  private Map<MappingTypeVariable<?>, MappingTypeVariableBinding<?>> bindings = CollectionLiterals.<MappingTypeVariable<?>, MappingTypeVariableBinding<?>>newLinkedHashMap();
  
  private CodeConceptInstance currentContext;
  
  private CodeConceptInstance currentInstance;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private MappingResultSet resultSet;
  
  private MappingResult currentResult;
  
  public MappingTypeBinding(final MappingType mappingType, final CodeConcept concept) {
    this.mappingType = mappingType;
    this.concept = concept;
  }
  
  public MappingTypeBinding(final MappingTypeBinding toClone, final CodeConcept concept) {
    this(toClone.mappingType, concept);
    final BiConsumer<MappingTypeVariable<?>, MappingTypeVariableBinding<?>> _function = (MappingTypeVariable<?> k, MappingTypeVariableBinding<?> v) -> {
      MappingTypeVariableBinding<?> _clone = v.clone(this);
      this.bindings.put(k, _clone);
    };
    toClone.bindings.forEach(_function);
  }
  
  public <T extends Object> T getValue(final MappingTypeVariable<T> variable) {
    try {
      T _xblockexpression = null;
      {
        final Object retVal = this.mappingType.getParameterValue(variable);
        T _xifexpression = null;
        boolean _notEquals = (!Objects.equal(retVal, null));
        if (_notEquals) {
          _xifexpression = ((T) retVal);
        } else {
          MappingTypeVariableBinding<?> _get = this.bindings.get(variable);
          Object _value = _get.getValue();
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
        final MappingTypeVariable<T> mtv = this.mappingType.<T>getParameter(variable);
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
  
  public <T extends Object> void setValue(final MappingTypeVariable<T> variable, final T value) {
    MappingTypeVariableBinding<?> _get = this.bindings.get(variable);
    ((MappingTypeVariableBinding<T>) _get).setValue(value);
  }
  
  public <T extends Object> void setValue(final String variable, final T value) {
    try {
      final MappingTypeVariable<T> mtv = this.mappingType.<T>getParameter(variable);
      boolean _equals = Objects.equal(mtv, null);
      if (_equals) {
        String _name = this.mappingType.getName();
        String _plus = ("Mapping type " + _name);
        String _plus_1 = (_plus + " does not have parameter: ");
        String _plus_2 = (_plus_1 + variable);
        throw new MappingTypeException(_plus_2);
      }
      this.<T>setValue(mtv, value);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public <T extends Object> MappingTypeVariableBinding<T> getBinding(final MappingTypeVariable<T> variable) {
    MappingTypeVariableBinding<?> _get = this.bindings.get(variable);
    return ((MappingTypeVariableBinding<T>) _get);
  }
  
  public <T extends Object> MappingTypeVariableBinding<T> getBinding(final String variable) {
    MappingTypeVariableBinding<T> _xblockexpression = null;
    {
      Set<MappingTypeVariable<?>> _keySet = this.bindings.keySet();
      final Function1<MappingTypeVariable<?>, Boolean> _function = (MappingTypeVariable<?> v) -> {
        return Boolean.valueOf(Objects.equal(v.name, variable));
      };
      final MappingTypeVariable<?> mtv = IterableExtensions.<MappingTypeVariable<?>>findFirst(_keySet, _function);
      MappingTypeVariableBinding<?> _binding = this.getBinding(mtv);
      _xblockexpression = ((MappingTypeVariableBinding<T>) _binding);
    }
    return _xblockexpression;
  }
  
  public MappingTypeVariableBinding<?> putBinding(final MappingTypeVariable<?> variable, final MappingTypeVariableBinding<?> binding) {
    try {
      MappingTypeVariableBinding<?> _xblockexpression = null;
      {
        boolean _hasParameter = this.mappingType.hasParameter(variable);
        boolean _not = (!_hasParameter);
        if (_not) {
          String _name = this.mappingType.getName();
          String _plus = ("Mapping type " + _name);
          String _plus_1 = (_plus + " does not have parameter named: ");
          String _plus_2 = (_plus_1 + variable.name);
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
  
  public MappingTypeVariableBinding<?> putBinding(final String variable, final MappingTypeVariableBinding<?> binding) {
    try {
      MappingTypeVariableBinding<?> _xblockexpression = null;
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
        MappingTypeVariable<Object> _parameter = this.mappingType.<Object>getParameter(variable);
        _xblockexpression = this.putBinding(_parameter, binding);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean fullyBound() {
    List<MappingTypeVariable<?>> _unbound = this.unbound();
    int _size = _unbound.size();
    return (_size == 0);
  }
  
  public List<MappingTypeVariable<?>> unbound() {
    LinkedList<MappingTypeVariable<?>> _xblockexpression = null;
    {
      final LinkedList<MappingTypeVariable<?>> retList = CollectionLiterals.<MappingTypeVariable<?>>newLinkedList();
      List<MappingTypeVariable<?>> _parameters = this.mappingType.getParameters();
      final Function1<MappingTypeVariable<?>, Boolean> _function = (MappingTypeVariable<?> p) -> {
        return Boolean.valueOf(((!this.bindings.containsKey(p)) && Objects.equal(this.mappingType.getParameterValue(p), null)));
      };
      Iterable<MappingTypeVariable<?>> _filter = IterableExtensions.<MappingTypeVariable<?>>filter(_parameters, _function);
      Iterables.<MappingTypeVariable<?>>addAll(retList, _filter);
      _xblockexpression = retList;
    }
    return _xblockexpression;
  }
  
  public boolean unbound(final String variable) {
    MappingTypeVariableBinding<Object> _binding = this.<Object>getBinding(variable);
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
          Object _match = res.match();
          final CodeConceptInstance instance = this.concept.newInstance(parent, _match);
          this.currentInstance = instance;
          Map<String, Object> _values = res.getValues();
          final BiConsumer<String, Object> _function = (String k, Object v) -> {
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
        Object _match = r.match();
        final CodeConceptInstance instance = this.concept.newInstance(parent, _match);
        this.currentInstance = instance;
        Map<String, Object> _values = r.getValues();
        final BiConsumer<String, Object> _function_1 = (String k, Object v) -> {
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
  
  private static Pattern TEMPLATE_VAR = Pattern.compile("\\{\\w+\\}");
  
  public String fill(final String template) {
    try {
      String _xblockexpression = null;
      {
        final Matcher matcher = MappingTypeBinding.TEMPLATE_VAR.matcher(template);
        final StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
          {
            String varToReplace = matcher.group();
            int _length = varToReplace.length();
            int _minus = (_length - 1);
            String _substring = varToReplace.substring(1, _minus);
            varToReplace = _substring;
            final String replacement = this.getValueString(varToReplace);
            boolean _notEquals = (!Objects.equal(replacement, null));
            if (_notEquals) {
              matcher.appendReplacement(sb, replacement);
            } else {
              throw new MappingTypeException((((("Template variable cannot be evaluated: " + varToReplace) + "\n******\n") + template) + "\n******"));
            }
          }
        }
        matcher.appendTail(sb);
        _xblockexpression = sb.toString();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String fillST(final String template) {
    try {
      String _xblockexpression = null;
      {
        final LinkedList<String> templateParams = CollectionLiterals.<String>newLinkedList();
        Set<MappingTypeVariable<?>> _keySet = this.bindings.keySet();
        final Function1<MappingTypeVariable<?>, Boolean> _function = (MappingTypeVariable<?> k) -> {
          return Boolean.valueOf(((!Objects.equal(k.name, "match")) && (!Objects.equal(k.name, "context"))));
        };
        Iterable<MappingTypeVariable<?>> _filter = IterableExtensions.<MappingTypeVariable<?>>filter(_keySet, _function);
        final Function1<MappingTypeVariable<?>, String> _function_1 = (MappingTypeVariable<?> k) -> {
          return k.name;
        };
        Iterable<String> _map = IterableExtensions.<MappingTypeVariable<?>, String>map(_filter, _function_1);
        Iterables.<String>addAll(templateParams, _map);
        Map<MappingTypeVariable<?>, Object> _parameterValues = this.mappingType.getParameterValues();
        final BiConsumer<MappingTypeVariable<?>, Object> _function_2 = (MappingTypeVariable<?> k, Object v) -> {
          boolean _contains = templateParams.contains(k.name);
          boolean _not = (!_contains);
          if (_not) {
            templateParams.add(k.name);
          }
        };
        _parameterValues.forEach(_function_2);
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
        final BiConsumer<MappingTypeVariable<?>, MappingTypeVariableBinding<?>> _function_3 = (MappingTypeVariable<?> k, MappingTypeVariableBinding<?> v) -> {
          if (((!Objects.equal(k.name, "match")) && (!Objects.equal(k.name, "context")))) {
            Object _value_1 = this.getValue(k);
            st.add(k.name, _value_1);
          }
        };
        this.bindings.forEach(_function_3);
        Map<MappingTypeVariable<?>, Object> _parameterValues_1 = this.mappingType.getParameterValues();
        final BiConsumer<MappingTypeVariable<?>, Object> _function_4 = (MappingTypeVariable<?> k, Object v) -> {
          Object _value_1 = this.getValue(k);
          st.add(k.name, _value_1);
        };
        _parameterValues_1.forEach(_function_4);
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
  
  private void addBindingToResult(final String variable, final Object value) {
    try {
      boolean _equals = Objects.equal(this.currentResult, null);
      if (_equals) {
        MappingResult _mappingResult = new MappingResult();
        this.currentResult = _mappingResult;
      }
      if (((!Objects.equal(value, null)) && (!this.mappingType.getParameterType(variable).isInstance(value)))) {
        Class<?> _parameterType = this.mappingType.getParameterType(variable);
        Class<?> _class = value.getClass();
        throw new IllegalVariableAssignment(variable, _parameterType, _class);
      }
      this.currentResult.put(variable, value);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public <T extends IASTNode> boolean bind(final String variable, final T node) {
    boolean _xblockexpression = false;
    {
      final T toMatch = this.<T>getValue(variable);
      boolean _xifexpression = false;
      boolean _notEquals = (!Objects.equal(toMatch, null));
      if (_notEquals) {
        _xifexpression = toMatch.equals(node);
      } else {
        boolean _xblockexpression_1 = false;
        {
          this.addBindingToResult(variable, node);
          _xblockexpression_1 = true;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean bindExpr(final String variable, final IExpr expr) {
    boolean _xblockexpression = false;
    {
      final String toMatch = this.getValueString(variable);
      boolean _xifexpression = false;
      boolean _notEquals = (!Objects.equal(toMatch, null));
      if (_notEquals) {
        String _string = expr.toString();
        String _trim = _string.trim();
        _xifexpression = toMatch.equalsIgnoreCase(_trim);
      } else {
        boolean _xblockexpression_1 = false;
        {
          String _string_1 = expr.toString();
          String _trim_1 = _string_1.trim();
          this.addBindingToResult(variable, _trim_1);
          _xblockexpression_1 = true;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean bindExprContains(final String variable, final IExpr expr) {
    boolean _xblockexpression = false;
    {
      final String toMatch = this.getValueString(variable);
      boolean _xifexpression = false;
      boolean _notEquals = (!Objects.equal(toMatch, null));
      if (_notEquals) {
        String _lowerCase = toMatch.toLowerCase();
        String _string = expr.toString();
        String _trim = _string.trim();
        String _lowerCase_1 = _trim.toLowerCase();
        _xifexpression = _lowerCase.contains(_lowerCase_1);
      } else {
        boolean _xblockexpression_1 = false;
        {
          String _string_1 = expr.toString();
          String _trim_1 = _string_1.trim();
          this.addBindingToResult(variable, _trim_1);
          _xblockexpression_1 = true;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean bindToken(final String variable, final Token token) {
    boolean _xblockexpression = false;
    {
      final String toMatch = this.getValueString(variable);
      boolean _xifexpression = false;
      boolean _notEquals = (!Objects.equal(toMatch, null));
      if (_notEquals) {
        String _text = token.getText();
        _xifexpression = toMatch.equalsIgnoreCase(_text);
      } else {
        boolean _xblockexpression_1 = false;
        {
          String _text_1 = token.getText();
          this.addBindingToResult(variable, _text_1);
          _xblockexpression_1 = true;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public MappingResult addResult(final Object match) {
    try {
      Class<?> _matchType = this.mappingType.matchType();
      boolean _isInstance = _matchType.isInstance(match);
      boolean _not = (!_isInstance);
      if (_not) {
        Class<?> _matchType_1 = this.mappingType.matchType();
        Class<?> _class = match.getClass();
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
  
  public MappingResult reset() {
    return this.currentResult = null;
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
  
  public <T extends Object> void setMatch(final T match) {
    this.<T>setValue("match", match);
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
  public Map<MappingTypeVariable<?>, MappingTypeVariableBinding<?>> getBindings() {
    return this.bindings;
  }
  
  public void setBindings(final Map<MappingTypeVariable<?>, MappingTypeVariableBinding<?>> bindings) {
    this.bindings = bindings;
  }
  
  @Pure
  public MappingResultSet getResultSet() {
    return this.resultSet;
  }
}
