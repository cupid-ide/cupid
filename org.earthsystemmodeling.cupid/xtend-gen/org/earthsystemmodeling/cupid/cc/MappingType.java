package org.earthsystemmodeling.cupid.cc;

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.Map;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.MappingResultSet;
import org.earthsystemmodeling.cupid.cc.MappingTypeException;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class MappingType {
  @Accessors
  private CodeConcept mappedTo;
  
  @Accessors
  private MappingType refines;
  
  @Accessors
  private Map<String, Class<?>> inputs = CollectionLiterals.<String, Class<?>>newLinkedHashMap();
  
  @Accessors
  private Map<String, Class<?>> outputs = CollectionLiterals.<String, Class<?>>newLinkedHashMap();
  
  private Map<String, Object> inputValues = CollectionLiterals.<String, Object>newLinkedHashMap();
  
  @Accessors
  private Procedure2<? super MappingType, ? super MappingResultSet> find;
  
  public MappingType() {
  }
  
  public MappingType(final Map<String, Class<?>> inputs, final Map<String, Class<?>> outputs) {
    this.inputs = inputs;
    this.outputs = outputs;
  }
  
  public MappingType(final Class<?> contextType, final Class<?> matchType) {
    this(Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(Pair.<String, Class<?>>of("context", contextType))), Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(Pair.<String, Class<?>>of("match", matchType))));
  }
  
  public Class<?> getInputType(final String name) {
    Class<?> _xifexpression = null;
    boolean _containsKey = this.inputs.containsKey(name);
    if (_containsKey) {
      _xifexpression = this.inputs.get(name);
    } else {
      Class<?> _xifexpression_1 = null;
      boolean _notEquals = (!Objects.equal(this.refines, null));
      if (_notEquals) {
        _xifexpression_1 = this.refines.getInputType(name);
      } else {
        _xifexpression_1 = null;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public <T extends Object> T get(final String name) {
    try {
      T _xifexpression = null;
      Class<?> _inputType = this.getInputType(name);
      boolean _equals = Objects.equal(_inputType, null);
      if (_equals) {
        throw new MappingTypeException(("Mapping Type does not have input " + name));
      } else {
        T _xifexpression_1 = null;
        boolean _containsKey = this.inputValues.containsKey(name);
        if (_containsKey) {
          Object _get = this.inputValues.get(name);
          _xifexpression_1 = ((T) _get);
        } else {
          T _xifexpression_2 = null;
          boolean _notEquals = (!Objects.equal(this.refines, null));
          if (_notEquals) {
            _xifexpression_2 = this.refines.<T>get(name);
          } else {
            throw new MappingTypeException(("Cannot get value of unbound input parameter: " + name));
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      return _xifexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public <T extends Object> T context() {
    return this.<T>get("context");
  }
  
  public Class<?> matchType() {
    return this.outputs.getOrDefault("match", null);
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
  
  public MappingType refine(final Map<String, Class<?>> inputs) {
    MappingType _xblockexpression = null;
    {
      final MappingType mt = new MappingType(inputs, null);
      mt.refines = this;
      final Procedure2<MappingType, MappingResultSet> _function = (MappingType me, MappingResultSet result) -> {
        this.find.apply(me, result);
      };
      mt.find = _function;
      _xblockexpression = mt;
    }
    return _xblockexpression;
  }
  
  public MappingType refine(final Map<String, Class<?>> inputs, final Map<String, Class<?>> outputs) {
    MappingType _xblockexpression = null;
    {
      final MappingType mt = new MappingType(inputs, outputs);
      mt.refines = this;
      final Procedure2<MappingType, MappingResultSet> _function = (MappingType me, MappingResultSet result) -> {
        this.find.apply(me, result);
      };
      mt.find = _function;
      _xblockexpression = mt;
    }
    return _xblockexpression;
  }
  
  public MappingType withParams(final Map<String, Object> inputs) {
    MappingType _xblockexpression = null;
    {
      final MappingType mt = new MappingType();
      mt.refines = this;
      mt.inputValues = inputs;
      final Procedure2<MappingType, MappingResultSet> _function = (MappingType me, MappingResultSet result) -> {
        this.find.apply(me, result);
      };
      mt.find = _function;
      _xblockexpression = mt;
    }
    return _xblockexpression;
  }
  
  @Pure
  public CodeConcept getMappedTo() {
    return this.mappedTo;
  }
  
  public void setMappedTo(final CodeConcept mappedTo) {
    this.mappedTo = mappedTo;
  }
  
  @Pure
  public MappingType getRefines() {
    return this.refines;
  }
  
  public void setRefines(final MappingType refines) {
    this.refines = refines;
  }
  
  @Pure
  public Map<String, Class<?>> getInputs() {
    return this.inputs;
  }
  
  public void setInputs(final Map<String, Class<?>> inputs) {
    this.inputs = inputs;
  }
  
  @Pure
  public Map<String, Class<?>> getOutputs() {
    return this.outputs;
  }
  
  public void setOutputs(final Map<String, Class<?>> outputs) {
    this.outputs = outputs;
  }
  
  @Pure
  public Procedure2<? super MappingType, ? super MappingResultSet> getFind() {
    return this.find;
  }
  
  public void setFind(final Procedure2<? super MappingType, ? super MappingResultSet> find) {
    this.find = find;
  }
}
