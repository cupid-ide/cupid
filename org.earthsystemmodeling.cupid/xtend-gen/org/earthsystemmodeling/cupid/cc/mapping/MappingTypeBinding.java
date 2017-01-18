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
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

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
  
  public MappingTypeBinding(final MappingType mappingType, final CodeConcept concept) {
    this.mappingType = mappingType;
    this.concept = concept;
  }
  
  public <T extends Object> T getValue(final MappingTypeVariable<T> variable) {
    try {
      MappingTypeVariableBinding<?> _get = this.bindings.get(variable);
      Object _value = _get.getValue();
      return ((T) _value);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public <T extends Object> T getValue(final String variable) {
    try {
      T _xblockexpression = null;
      {
        final MappingTypeVariable<Object> mtv = this.mappingType.<Object>getParameter(variable);
        boolean _equals = Objects.equal(mtv, null);
        if (_equals) {
          String _name = this.mappingType.getName();
          String _plus = ("Mapping type " + _name);
          String _plus_1 = (_plus + " does not have parameter: ");
          String _plus_2 = (_plus_1 + variable);
          throw new MappingTypeException(_plus_2);
        }
        MappingTypeVariableBinding<?> _get = this.bindings.get(mtv);
        Object _value = _get.getValue();
        _xblockexpression = ((T) _value);
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
        return Boolean.valueOf((((!this.bindings.containsKey(p)) && (!Objects.equal(p.name, "context"))) && (!Objects.equal(p.name, "match"))));
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
  public CodeConceptInstance bind(final CodeConceptInstance parent) {
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
              this.<Object>setValue(k, v);
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
  public List<CodeConceptInstance> bindAll(final CodeConceptInstance parent) {
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
            String _group = matcher.group();
            matcher.appendReplacement(sb, _group);
          }
        }
      }
      matcher.appendTail(sb);
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  public MappingResult addResult(final Object match) {
    try {
      MappingResult _xblockexpression = null;
      {
        Class<?> _matchType = this.mappingType.matchType();
        boolean _isInstance = _matchType.isInstance(match);
        boolean _not = (!_isInstance);
        if (_not) {
          Class<?> _matchType_1 = this.mappingType.matchType();
          Class<?> _class = match.getClass();
          throw new IllegalVariableAssignment("match", _matchType_1, _class);
        }
        _xblockexpression = this.resultSet.addMatch(match);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public MappingResult addResult(final Map<String, Object> params) {
    MappingResult _xblockexpression = null;
    {
      Object _get = params.get("match");
      final MappingResult result = this.addResult(_get);
      final BiConsumer<String, Object> _function = (String k, Object v) -> {
        boolean _equals = k.equals("match");
        boolean _not = (!_equals);
        if (_not) {
          result.put(k, v);
        }
      };
      params.forEach(_function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public <T extends Object> T context() {
    return this.<T>getValue("context");
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
