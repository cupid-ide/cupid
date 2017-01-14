package org.earthsystemmodeling.cupid.cc.mapping;

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.earthsystemmodeling.cupid.cc.mapping.MappingResultSet;
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
  private Procedure2<? super MappingTypeBinding, ? super MappingResultSet> find;
  
  @Accessors
  private Procedure1<? super MappingTypeBinding> forwardAdd;
  
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
      final Procedure2<MappingTypeBinding, MappingResultSet> _function = (MappingTypeBinding me, MappingResultSet result) -> {
        refines.find.apply(me, result);
      };
      this.find = _function;
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
  
  public MappingResultSet doFind(final MappingTypeBinding binding) {
    MappingResultSet _xblockexpression = null;
    {
      final MappingResultSet resultset = new MappingResultSet(this);
      boolean _notEquals = (!Objects.equal(this.refines, null));
      if (_notEquals) {
        this.refines.find.apply(binding, resultset);
      }
      this.find.apply(binding, resultset);
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
  public Procedure2<? super MappingTypeBinding, ? super MappingResultSet> getFind() {
    return this.find;
  }
  
  public void setFind(final Procedure2<? super MappingTypeBinding, ? super MappingResultSet> find) {
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
