package org.earthsystemmodeling.cupid.cc.mapping;

import com.google.common.base.Objects;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.earthsystemmodeling.cupid.cc.mapping.MappingResultSet;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeException;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariable;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariableBinding;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class MappingTypeBinding {
  @Accessors
  private MappingType mappingType;
  
  @Accessors
  private Map<MappingTypeVariable<?>, MappingTypeVariableBinding<?>> bindings;
  
  public MappingTypeBinding(final MappingType mappingType) {
    this.mappingType = mappingType;
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
      MappingTypeVariableBinding<?> _get = this.bindings.get(variable);
      Object _value = _get.getValue();
      return ((T) _value);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public <T extends Object> MappingTypeVariableBinding<T> get(final MappingTypeVariable<T> variable) {
    MappingTypeVariableBinding<?> _get = this.bindings.get(variable);
    return ((MappingTypeVariableBinding<T>) _get);
  }
  
  public <T extends Object> MappingTypeVariableBinding<T> get(final String variable) {
    MappingTypeVariableBinding<T> _xblockexpression = null;
    {
      Set<MappingTypeVariable<?>> _keySet = this.bindings.keySet();
      final Function1<MappingTypeVariable<?>, Boolean> _function = (MappingTypeVariable<?> v) -> {
        return Boolean.valueOf(Objects.equal(v.name, variable));
      };
      final MappingTypeVariable<?> mtv = IterableExtensions.<MappingTypeVariable<?>>findFirst(_keySet, _function);
      MappingTypeVariableBinding<?> _get = this.bindings.get(mtv);
      _xblockexpression = ((MappingTypeVariableBinding<T>) _get);
    }
    return _xblockexpression;
  }
  
  public MappingTypeVariableBinding<?> put(final MappingTypeVariable<?> variable, final MappingTypeVariableBinding<?> binding) {
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
        _xblockexpression = this.bindings.put(variable, binding);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public MappingTypeVariableBinding<?> put(final String variable, final MappingTypeVariableBinding<?> binding) {
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
        _xblockexpression = this.put(_parameter, binding);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean fullyBound() {
    List<MappingTypeVariable<?>> _parameters = this.mappingType.getParameters();
    final Function1<MappingTypeVariable<?>, Boolean> _function = (MappingTypeVariable<?> p) -> {
      return Boolean.valueOf(this.bindings.containsKey(p));
    };
    return IterableExtensions.<MappingTypeVariable<?>>forall(_parameters, _function);
  }
  
  public MappingResultSet doFind() {
    return this.mappingType.doFind(this);
  }
  
  public <T extends Object> T context() {
    return this.<T>getValue("context");
  }
  
  @Pure
  public MappingType getMappingType() {
    return this.mappingType;
  }
  
  public void setMappingType(final MappingType mappingType) {
    this.mappingType = mappingType;
  }
  
  @Pure
  public Map<MappingTypeVariable<?>, MappingTypeVariableBinding<?>> getBindings() {
    return this.bindings;
  }
  
  public void setBindings(final Map<MappingTypeVariable<?>, MappingTypeVariableBinding<?>> bindings) {
    this.bindings = bindings;
  }
}
