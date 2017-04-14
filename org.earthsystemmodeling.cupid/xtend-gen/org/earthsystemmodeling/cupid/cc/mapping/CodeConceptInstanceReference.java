package org.earthsystemmodeling.cupid.cc.mapping;

import com.google.common.base.Objects;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.mapping.IllegalVariableAssignment;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeException;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeParameter;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeParameterBinding;
import org.earthsystemmodeling.cupid.cc.mapping.ReferenceMTVBinding;
import org.earthsystemmodeling.cupid.cc.types.MTPType;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class CodeConceptInstanceReference extends ReferenceMTVBinding {
  public CodeConceptInstanceReference(final MappingTypeParameter boundTo, final String reference) {
    this(boundTo, reference, null);
  }
  
  public CodeConceptInstanceReference(final MappingTypeParameter boundTo, final String reference, final MappingTypeBinding binding) {
    super(null, reference);
    this.setBoundTo(boundTo);
    boolean _notEquals = (!Objects.equal(binding, null));
    if (_notEquals) {
      this.setBinding(binding);
    }
  }
  
  protected MTPType<?> resolvePath() {
    String[] segments = this.getReference().split("/");
    CodeConceptInstance current = null;
    String _get = segments[0];
    boolean _equals = Objects.equal(_get, "..");
    if (_equals) {
      current = this.getBinding().getCurrentContext();
      final String[] _converted_segments = (String[])segments;
      segments = ((String[])Conversions.unwrapArray(IterableExtensions.<String>drop(((Iterable<String>)Conversions.doWrapArray(_converted_segments)), 1), String.class));
    } else {
      current = this.getBinding().getCurrentInstance();
    }
    for (final String seg : segments) {
      boolean _equals_1 = Objects.equal(seg, "..");
      if (_equals_1) {
        current = current.getParent();
      } else {
        boolean _startsWith = seg.startsWith("@");
        if (_startsWith) {
          boolean _notEquals = (!Objects.equal(current, null));
          if (_notEquals) {
            boolean _startsWith_1 = seg.startsWith("@@");
            if (_startsWith_1) {
              return current.getAnnotationRecursive(seg.substring(2));
            } else {
              return current.get(seg.substring(1));
            }
          } else {
            return null;
          }
        } else {
          boolean _endsWith = seg.endsWith("*");
          if (_endsWith) {
            int _length = seg.length();
            int _minus = (_length - 1);
            CodeConceptInstance _child = current.getChild(seg.substring(0, _minus));
            MTPType<?> _match = null;
            if (_child!=null) {
              _match=_child.getMatch();
            }
            return _match;
          } else {
            current = current.getChild(seg);
          }
        }
      }
    }
    return null;
  }
  
  @Override
  public MTPType<?> getValue() {
    try {
      String _reference = this.getReference();
      boolean _notEquals = (!Objects.equal(_reference, null));
      if (_notEquals) {
        final MTPType<?> refVal = this.resolvePath();
        if (((!Objects.equal(refVal, null)) && (!this.getBoundTo().getType().isInstance(refVal)))) {
          String _name = this.getBoundTo().getName();
          Class<? extends MTPType<?>> _type = this.getBoundTo().getType();
          Class<? extends MTPType> _class = refVal.getClass();
          throw new IllegalVariableAssignment(_name, _type, _class);
        } else {
          this.value = refVal;
          return this.value;
        }
      } else {
        boolean _equals = this.getBoundTo().getName().equals("context");
        if (_equals) {
          CodeConceptInstance _currentInstance = this.getBinding().getCurrentInstance();
          boolean _notEquals_1 = (!Objects.equal(_currentInstance, null));
          if (_notEquals_1) {
            this.value = this.getBinding().getCurrentInstance().nearestAncestorWithMatch(this.getBoundTo().getType());
          } else {
            CodeConceptInstance _currentContext = this.getBinding().getCurrentContext();
            boolean _notEquals_2 = (!Objects.equal(_currentContext, null));
            if (_notEquals_2) {
              this.value = this.getBinding().getCurrentContext().nearestAncestorWithMatch(this.getBoundTo().getType());
            } else {
              throw new MappingTypeException("No context information available");
            }
          }
          return this.value;
        } else {
          String _reference_1 = this.getReference();
          String _plus = ("Cannot handle path expression: " + _reference_1);
          String _plus_1 = (_plus + " [");
          MappingTypeParameter _boundTo = this.getBoundTo();
          String _plus_2 = (_plus_1 + _boundTo);
          String _plus_3 = (_plus_2 + "].");
          throw new UnsupportedOperationException(_plus_3);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * def getValueOLD() {
   * 
   * if (reference != null) {
   * resolvePath
   * }
   * 
   * if (reference != null && reference.startsWith("@")) {
   * if (binding.currentInstance == null) {
   * //see if there is a default defined
   * val dflt = binding.concept.getAnnotationDefault(reference.substring(1))
   * if (dflt != null) {
   * return dflt as T
   * }
   * else {
   * throw new MappingTypeException("No current instance or default defined for annotation: " + reference)
   * }
   * }
   * 
   * var Object refVal
   * if (reference.startsWith("@@")) {
   * val annotationName = reference.substring(2)
   * refVal = binding.currentInstance.getAnnotationRecursive(annotationName)
   * }
   * else {
   * val annotationName = reference.substring(1)
   * refVal = binding.currentInstance.get(annotationName)
   * }
   * 
   * if (refVal != null && !boundTo.type.isInstance(refVal)) {
   * throw new IllegalVariableAssignment(boundTo.name, boundTo.type, refVal.class)
   * }
   * value = refVal as T
   * return value
   * }
   * else if (reference != null && reference.startsWith("../") && !reference.substring(3).contains("/")) {
   * 
   * var Object refVal
   * if (reference.endsWith("*")) {
   * //dereference match
   * val subconceptName = reference.substring(3, reference.length-1)
   * refVal = binding.currentContext.getChild(subconceptName)?.match
   * }
   * else {
   * //concept instance itself
   * val subconceptName = reference.substring(3)
   * refVal = binding.currentContext.getChild(subconceptName)
   * }
   * 
   * if (refVal != null && !boundTo.type.isInstance(refVal)) {
   * throw new IllegalVariableAssignment(boundTo.name, boundTo.type, refVal.class)
   * }
   * value = refVal as T
   * return value
   * }
   * else if (boundTo.name.equals("context")) {
   * if (binding.currentInstance != null) {
   * value = binding.currentInstance.nearestAncestorWithMatch(boundTo.type)
   * }
   * else if (binding.currentContext != null) {
   * value = binding.currentContext.nearestAncestorWithMatch(boundTo.type)
   * }
   * else {
   * throw new MappingTypeException("No context information available")
   * }
   * return value
   * }
   * else {
   * //handle everything else, i.e., path
   * throw new UnsupportedOperationException("Cannot handle path expression: " + reference + " [" + boundTo + "].")
   * }
   * }
   */
  @Override
  public MappingTypeParameterBinding clone(final MappingTypeBinding newBinding) {
    MappingTypeParameter _boundTo = this.getBoundTo();
    String _reference = this.getReference();
    return new CodeConceptInstanceReference(_boundTo, _reference, newBinding);
  }
  
  @Override
  public void setValue(final MTPType<?> value) {
    if (((!Objects.equal(this.getReference(), null)) && this.getReference().startsWith("@"))) {
      final String annotationName = this.getReference().substring(1);
      this.getBinding().getCurrentInstance().put(annotationName, value);
    } else {
      boolean _equals = this.getBoundTo().getName().equals("match");
      if (_equals) {
        CodeConceptInstance _currentInstance = this.getBinding().getCurrentInstance();
        _currentInstance.setMatch(value);
      } else {
        String _reference = this.getReference();
        String _plus = ("Cannot set value for reference: " + _reference);
        throw new UnsupportedOperationException(_plus);
      }
    }
  }
}
