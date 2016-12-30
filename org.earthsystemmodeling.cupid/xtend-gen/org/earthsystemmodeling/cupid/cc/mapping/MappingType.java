package org.earthsystemmodeling.cupid.cc.mapping;

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.mapping.CodeConceptInstanceReference;
import org.earthsystemmodeling.cupid.cc.mapping.CodeConceptParameterReference;
import org.earthsystemmodeling.cupid.cc.mapping.LiteralMTVBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingResultSet;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeException;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariable;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class MappingType {
  private String name;
  
  @Accessors
  private MappingType refines;
  
  @Accessors
  private List<MappingTypeVariable<?>> parameters = CollectionLiterals.<MappingTypeVariable<?>>newLinkedList();
  
  @Accessors
  private Procedure2<? super MappingType, ? super MappingResultSet> find;
  
  public MappingType(final String name, final Class<?> contextType, final Class<?> matchType) {
    this(name, Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(Pair.<String, Class<?>>of("context", contextType), Pair.<String, Class<?>>of("match", matchType))));
  }
  
  public MappingType(final String name, final Map<String, Class<?>> parameters) {
    this(((MappingType) null), parameters);
    this.name = name;
  }
  
  public MappingType(final MappingType refines) {
    this(refines, null);
  }
  
  public MappingType(final MappingType refines, final Map<String, Class<?>> parameters) {
    try {
      this.refines = refines;
      boolean _notEquals = (!Objects.equal(parameters, null));
      if (_notEquals) {
        Set<Map.Entry<String, Class<?>>> _entrySet = parameters.entrySet();
        for (final Map.Entry<String, Class<?>> p : _entrySet) {
          {
            String _key = p.getKey();
            boolean _hasParameter = this.hasParameter(_key);
            if (_hasParameter) {
              String _key_1 = p.getKey();
              String _plus = ("Cannot add duplicate parameter: " + _key_1);
              throw new MappingTypeException(_plus);
            }
            String _key_2 = p.getKey();
            Class<?> _value = p.getValue();
            final MappingTypeVariable<?> mtv = new MappingTypeVariable(_key_2, _value);
            this.parameters.add(mtv);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String getName() {
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(this.name, null));
    if (_notEquals) {
      _xifexpression = this.name;
    } else {
      String _xifexpression_1 = null;
      boolean _notEquals_1 = (!Objects.equal(this.refines, null));
      if (_notEquals_1) {
        String _name = this.refines.getName();
        _xifexpression_1 = ("refinement of " + _name);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public static boolean isStaticReference(final Object obj) {
    return ((obj instanceof String) && ((String) obj).startsWith("$"));
  }
  
  public static CodeConceptParameterReference<Object> getStaticReference(final Object obj) {
    String _substring = ((String) obj).substring(1);
    return new CodeConceptParameterReference<Object>(_substring);
  }
  
  public static boolean isDynamicReference(final Object obj) {
    return ((obj instanceof String) && ((String) obj).startsWith("../"));
  }
  
  public static CodeConceptInstanceReference<Object> getDynamicReference(final Object obj) {
    return new CodeConceptInstanceReference<Object>(((String) obj));
  }
  
  public MappingType define() {
    return this.define(null);
  }
  
  public MappingType define(final Map<String, Object> parameterValues) {
    return this.refine(null, parameterValues);
  }
  
  public MappingType refine(final Map<String, Class<?>> newParameters) {
    return this.refine(newParameters, null);
  }
  
  public MappingType refine(final Map<String, Class<?>> newParameters, final Map<String, Object> parameterValues) {
    try {
      MappingType _xblockexpression = null;
      {
        final MappingType mt = new MappingType(this, newParameters);
        boolean _notEquals = (!Objects.equal(parameterValues, null));
        if (_notEquals) {
          Set<Map.Entry<String, Object>> _entrySet = parameterValues.entrySet();
          for (final Map.Entry<String, Object> input : _entrySet) {
            {
              String _key = input.getKey();
              boolean _hasParameter = this.hasParameter(_key);
              boolean _not = (!_hasParameter);
              if (_not) {
                String _key_1 = input.getKey();
                String _plus = ((("Mapping type " + this.name) + " does not have input parameter: ") + _key_1);
                throw new MappingTypeException(_plus);
              }
              String _key_2 = input.getKey();
              final MappingTypeVariable<Object> mtv = this.<Object>getParameter(_key_2);
              Object _value = input.getValue();
              boolean _isStaticReference = MappingType.isStaticReference(_value);
              if (_isStaticReference) {
                Object _value_1 = input.getValue();
                CodeConceptParameterReference<Object> _staticReference = MappingType.getStaticReference(_value_1);
                mtv.bind(_staticReference);
              } else {
                Object _value_2 = input.getValue();
                boolean _isDynamicReference = MappingType.isDynamicReference(_value_2);
                if (_isDynamicReference) {
                  Object _value_3 = input.getValue();
                  CodeConceptInstanceReference<Object> _dynamicReference = MappingType.getDynamicReference(_value_3);
                  mtv.bind(_dynamicReference);
                } else {
                  Object _value_4 = input.getValue();
                  LiteralMTVBinding<Object> _literalMTVBinding = new LiteralMTVBinding<Object>(_value_4);
                  mtv.bind(_literalMTVBinding);
                }
              }
            }
          }
        }
        if ((mt.hasParameter("context") && (!mt.<Object>getParameter("context").isBound()))) {
          MappingTypeVariable<Object> _parameter = mt.<Object>getParameter("context");
          CodeConceptInstanceReference<Object> _codeConceptInstanceReference = new CodeConceptInstanceReference<Object>(null);
          _parameter.bind(_codeConceptInstanceReference);
        }
        final Procedure2<MappingType, MappingResultSet> _function = (MappingType me, MappingResultSet result) -> {
          this.find.apply(me, result);
        };
        mt.find = _function;
        _xblockexpression = mt;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void resolveStaticBindings(final CodeConcept concept) {
    List<MappingTypeVariable<?>> _parameters = this.getParameters();
    final Function1<MappingTypeVariable<?>, Boolean> _function = (MappingTypeVariable<?> v) -> {
      return Boolean.valueOf((v.isBound() && (v.binding instanceof CodeConceptParameterReference<?>)));
    };
    Iterable<MappingTypeVariable<?>> _filter = IterableExtensions.<MappingTypeVariable<?>>filter(_parameters, _function);
    final Consumer<MappingTypeVariable<?>> _function_1 = (MappingTypeVariable<?> v) -> {
      ((CodeConceptParameterReference<?>) v.binding).bindWith(concept);
    };
    _filter.forEach(_function_1);
  }
  
  public void resolveDynamicBindings(final CodeConceptInstance instance) {
    List<MappingTypeVariable<?>> _parameters = this.getParameters();
    final Function1<MappingTypeVariable<?>, Boolean> _function = (MappingTypeVariable<?> v) -> {
      return Boolean.valueOf((v.isBound() && (v.binding instanceof CodeConceptInstanceReference<?>)));
    };
    Iterable<MappingTypeVariable<?>> _filter = IterableExtensions.<MappingTypeVariable<?>>filter(_parameters, _function);
    final Consumer<MappingTypeVariable<?>> _function_1 = (MappingTypeVariable<?> v) -> {
      ((CodeConceptInstanceReference<?>) v.binding).bindWith(instance);
    };
    _filter.forEach(_function_1);
  }
  
  public CodeConcept getMappingFor() {
    CodeConcept _xifexpression = null;
    CodeConcept _mappingFor = this.getMappingFor();
    boolean _notEquals = (!Objects.equal(_mappingFor, null));
    if (_notEquals) {
      _xifexpression = this.getMappingFor();
    } else {
      CodeConcept _xifexpression_1 = null;
      boolean _notEquals_1 = (!Objects.equal(this.refines, null));
      if (_notEquals_1) {
        _xifexpression_1 = this.refines.getMappingFor();
      } else {
        _xifexpression_1 = null;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public boolean hasParameter(final String name) {
    MappingTypeVariable<Object> _parameter = this.<Object>getParameter(name);
    return (!Objects.equal(_parameter, null));
  }
  
  public <T extends Object> MappingTypeVariable<T> getParameter(final String name) {
    final Function1<MappingTypeVariable<?>, Boolean> _function = (MappingTypeVariable<?> p) -> {
      return Boolean.valueOf(p.name.equals(name));
    };
    final MappingTypeVariable<?> p = IterableExtensions.<MappingTypeVariable<?>>findFirst(this.parameters, _function);
    if ((Objects.equal(p, null) && (!Objects.equal(this.refines, null)))) {
      return this.refines.<T>getParameter(name);
    }
    return ((MappingTypeVariable<T>) p);
  }
  
  public List<MappingTypeVariable<?>> getParameters() {
    LinkedList<MappingTypeVariable<?>> _xblockexpression = null;
    {
      final LinkedList<MappingTypeVariable<?>> retList = CollectionLiterals.<MappingTypeVariable<?>>newLinkedList();
      retList.addAll(this.parameters);
      boolean _notEquals = (!Objects.equal(this.refines, null));
      if (_notEquals) {
        List<MappingTypeVariable<?>> _parameters = this.refines.getParameters();
        retList.addAll(_parameters);
      }
      _xblockexpression = retList;
    }
    return _xblockexpression;
  }
  
  public Class<?> getParameterType(final String name) {
    MappingTypeVariable<Object> _parameter = this.<Object>getParameter(name);
    Class<Object> _type = null;
    if (_parameter!=null) {
      _type=_parameter.type;
    }
    return _type;
  }
  
  public Class<?> contextType() {
    return this.getParameterType("context");
  }
  
  public <T extends Object> T get(final String name) {
    try {
      T _xblockexpression = null;
      {
        boolean _hasParameter = this.hasParameter(name);
        boolean _not = (!_hasParameter);
        if (_not) {
          String _name = this.getName();
          String _plus = ("Mapping type " + _name);
          String _plus_1 = (_plus + " does not have input parameter: ");
          String _plus_2 = (_plus_1 + name);
          throw new MappingTypeException(_plus_2);
        }
        MappingTypeVariable<Object> _parameter = this.<Object>getParameter(name);
        Object _resolve = _parameter.resolve();
        _xblockexpression = ((T) _resolve);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public <T extends Object> T context() {
    return this.<T>get("context");
  }
  
  public Class<?> matchType() {
    return this.getParameterType("match");
  }
  
  public MappingResultSet doFind() {
    MappingResultSet _xblockexpression = null;
    {
      final MappingResultSet resultset = new MappingResultSet(this);
      boolean _notEquals = (!Objects.equal(this.refines, null));
      if (_notEquals) {
        this.refines.find.apply(this, resultset);
      }
      this.find.apply(this, resultset);
      _xblockexpression = resultset;
    }
    return _xblockexpression;
  }
  
  @Pure
  public MappingType getRefines() {
    return this.refines;
  }
  
  public void setRefines(final MappingType refines) {
    this.refines = refines;
  }
  
  public void setParameters(final List<MappingTypeVariable<?>> parameters) {
    this.parameters = parameters;
  }
  
  @Pure
  public Procedure2<? super MappingType, ? super MappingResultSet> getFind() {
    return this.find;
  }
  
  public void setFind(final Procedure2<? super MappingType, ? super MappingResultSet> find) {
    this.find = find;
  }
}
