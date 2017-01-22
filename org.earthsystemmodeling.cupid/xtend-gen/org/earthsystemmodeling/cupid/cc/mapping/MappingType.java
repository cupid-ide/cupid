package org.earthsystemmodeling.cupid.cc.mapping;

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeException;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariable;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class MappingType {
  private String name;
  
  @Accessors
  private MappingType refines;
  
  @Accessors
  private List<MappingTypeVariable<?>> parameters = CollectionLiterals.<MappingTypeVariable<?>>newLinkedList();
  
  private Map<MappingTypeVariable<?>, Object> parameterValues = CollectionLiterals.<MappingTypeVariable<?>, Object>newLinkedHashMap();
  
  @Accessors
  private Procedure1<? super MappingTypeBinding> find;
  
  @Accessors
  private Procedure1<? super MappingTypeBinding> forwardAdd;
  
  private Map<String, String> templates = CollectionLiterals.<String, String>newLinkedHashMap();
  
  public MappingType(final String name, final Class<?> contextType, final Class<?> matchType, final Map<String, Class<?>> additionalParameters) {
    this(name, contextType, matchType);
    this.addParameters(additionalParameters);
  }
  
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
    this.refines = refines;
    this.addParameters(parameters);
  }
  
  protected void addParameters(final Map<String, Class<?>> parameters) {
    try {
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
  
  public MappingType refine(final Map<String, Class<?>> newParameters) {
    return new MappingType(this, newParameters);
  }
  
  public MappingType refine(final Map<String, Class<?>> newParameters, final Map<String, String> parameterValues) {
    MappingType _xblockexpression = null;
    {
      final MappingType newType = this.refine(newParameters);
      final BiConsumer<String, String> _function = (String k, String v) -> {
        try {
          final MappingTypeVariable<Object> p = newType.<Object>getParameter(k);
          boolean _equals = Objects.equal(p, null);
          if (_equals) {
            throw new MappingTypeException(((("Mapping type " + this.name) + " does not have parameter: ") + k));
          }
          newType.parameterValues.put(p, v);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      parameterValues.forEach(_function);
      _xblockexpression = newType;
    }
    return _xblockexpression;
  }
  
  public boolean hasParameter(final String name) {
    MappingTypeVariable<Object> _parameter = this.<Object>getParameter(name);
    return (!Objects.equal(_parameter, null));
  }
  
  public boolean hasParameter(final MappingTypeVariable<?> toCheck) {
    return this.hasParameter(toCheck.name);
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
  
  public Object getParameterValue(final MappingTypeVariable<?> variable) {
    Object _parameterValue = null;
    if (this.refines!=null) {
      _parameterValue=this.refines.getParameterValue(variable);
    }
    return this.parameterValues.getOrDefault(variable, _parameterValue);
  }
  
  public Object getParameterValue(final String name) {
    MappingTypeVariable<Object> _parameter = this.<Object>getParameter(name);
    return this.getParameterValue(_parameter);
  }
  
  public Map<MappingTypeVariable<?>, Object> getParameterValues() {
    LinkedHashMap<MappingTypeVariable<?>, Object> _xblockexpression = null;
    {
      final LinkedHashMap<MappingTypeVariable<?>, Object> retMap = CollectionLiterals.<MappingTypeVariable<?>, Object>newLinkedHashMap();
      boolean _notEquals = (!Objects.equal(this.refines, null));
      if (_notEquals) {
        Map<MappingTypeVariable<?>, Object> _parameterValues = this.refines.getParameterValues();
        retMap.putAll(_parameterValues);
      }
      retMap.putAll(this.parameterValues);
      _xblockexpression = retMap;
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
  
  public Class<?> matchType() {
    return this.getParameterType("match");
  }
  
  public void addTemplate(final String name, final String template) {
    this.templates.put(name, template);
  }
  
  public Map<String, String> getTemplates() {
    LinkedHashMap<String, String> _xblockexpression = null;
    {
      final LinkedHashMap<String, String> retMap = CollectionLiterals.<String, String>newLinkedHashMap();
      boolean _notEquals = (!Objects.equal(this.refines, null));
      if (_notEquals) {
        Map<String, String> _templates = this.refines.getTemplates();
        retMap.putAll(_templates);
      }
      retMap.putAll(this.templates);
      _xblockexpression = retMap;
    }
    return _xblockexpression;
  }
  
  public void doFind(final MappingTypeBinding binding) {
    boolean _notEquals = (!Objects.equal(this.refines, null));
    if (_notEquals) {
      this.refines.doFind(binding);
    }
    boolean _notEquals_1 = (!Objects.equal(this.find, null));
    if (_notEquals_1) {
      this.find.apply(binding);
    }
  }
  
  public void doForwardAdd(final MappingTypeBinding binding) {
    boolean _notEquals = (!Objects.equal(this.refines, null));
    if (_notEquals) {
      this.refines.doForwardAdd(binding);
    }
    boolean _notEquals_1 = (!Objects.equal(this.forwardAdd, null));
    if (_notEquals_1) {
      this.forwardAdd.apply(binding);
    }
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
  public Procedure1<? super MappingTypeBinding> getFind() {
    return this.find;
  }
  
  public void setFind(final Procedure1<? super MappingTypeBinding> find) {
    this.find = find;
  }
  
  @Pure
  public Procedure1<? super MappingTypeBinding> getForwardAdd() {
    return this.forwardAdd;
  }
  
  public void setForwardAdd(final Procedure1<? super MappingTypeBinding> forwardAdd) {
    this.forwardAdd = forwardAdd;
  }
}
