package org.earthsystemmodeling.cupid.cc.mapping;

import com.google.common.base.Objects;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.mapping.IllegalVariableAssignment;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeException;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariable;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariableBinding;
import org.earthsystemmodeling.cupid.cc.mapping.ReferenceMTVBinding;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class CodeConceptInstanceReference<T extends Object> extends ReferenceMTVBinding<T> {
  public CodeConceptInstanceReference(final MappingTypeVariable<T> boundTo, final String reference) {
    this(boundTo, reference, null);
  }
  
  public CodeConceptInstanceReference(final MappingTypeVariable<T> boundTo, final String reference, final MappingTypeBinding binding) {
    super(null, reference);
    this.setBoundTo(boundTo);
    boolean _notEquals = (!Objects.equal(binding, null));
    if (_notEquals) {
      this.setBinding(binding);
    }
  }
  
  protected Object resolvePath() {
    String _reference = this.getReference();
    String[] segments = _reference.split("/");
    CodeConceptInstance current = null;
    String _get = segments[0];
    boolean _equals = Objects.equal(_get, "..");
    if (_equals) {
      MappingTypeBinding _binding = this.getBinding();
      CodeConceptInstance _currentContext = _binding.getCurrentContext();
      current = _currentContext;
      final String[] _converted_segments = (String[])segments;
      Iterable<String> _drop = IterableExtensions.<String>drop(((Iterable<String>)Conversions.doWrapArray(_converted_segments)), 1);
      segments = ((String[])Conversions.unwrapArray(_drop, String.class));
    } else {
      MappingTypeBinding _binding_1 = this.getBinding();
      CodeConceptInstance _currentInstance = _binding_1.getCurrentInstance();
      current = _currentInstance;
    }
    for (final String seg : segments) {
      boolean _equals_1 = Objects.equal(seg, "..");
      if (_equals_1) {
        CodeConceptInstance _parent = current.getParent();
        current = _parent;
      } else {
        boolean _startsWith = seg.startsWith("@");
        if (_startsWith) {
          boolean _notEquals = (!Objects.equal(current, null));
          if (_notEquals) {
            boolean _startsWith_1 = seg.startsWith("@@");
            if (_startsWith_1) {
              String _substring = seg.substring(2);
              return current.getAnnotationRecursive(_substring);
            } else {
              String _substring_1 = seg.substring(1);
              return current.get(_substring_1);
            }
          } else {
            return null;
          }
        } else {
          boolean _endsWith = seg.endsWith("*");
          if (_endsWith) {
            int _length = seg.length();
            int _minus = (_length - 1);
            String _substring_2 = seg.substring(0, _minus);
            CodeConceptInstance _child = current.getChild(_substring_2);
            Object _match = null;
            if (_child!=null) {
              _match=_child.getMatch();
            }
            return _match;
          } else {
            CodeConceptInstance _child_1 = current.getChild(seg);
            current = _child_1;
          }
        }
      }
    }
    return current;
  }
  
  @Override
  public T getValue() {
    try {
      String _reference = this.getReference();
      boolean _notEquals = (!Objects.equal(_reference, null));
      if (_notEquals) {
        final Object refVal = this.resolvePath();
        if (((!Objects.equal(refVal, null)) && (!this.getBoundTo().type.isInstance(refVal)))) {
          MappingTypeVariable<T> _boundTo = this.getBoundTo();
          MappingTypeVariable<T> _boundTo_1 = this.getBoundTo();
          Class<?> _class = refVal.getClass();
          throw new IllegalVariableAssignment(_boundTo.name, _boundTo_1.type, _class);
        } else {
          this.value = ((T) refVal);
          return this.value;
        }
      } else {
        MappingTypeVariable<T> _boundTo_2 = this.getBoundTo();
        boolean _equals = _boundTo_2.name.equals("context");
        if (_equals) {
          MappingTypeBinding _binding = this.getBinding();
          CodeConceptInstance _currentInstance = _binding.getCurrentInstance();
          boolean _notEquals_1 = (!Objects.equal(_currentInstance, null));
          if (_notEquals_1) {
            MappingTypeBinding _binding_1 = this.getBinding();
            CodeConceptInstance _currentInstance_1 = _binding_1.getCurrentInstance();
            MappingTypeVariable<T> _boundTo_3 = this.getBoundTo();
            T _nearestAncestorWithMatch = _currentInstance_1.<T>nearestAncestorWithMatch(_boundTo_3.type);
            this.value = _nearestAncestorWithMatch;
          } else {
            MappingTypeBinding _binding_2 = this.getBinding();
            CodeConceptInstance _currentContext = _binding_2.getCurrentContext();
            boolean _notEquals_2 = (!Objects.equal(_currentContext, null));
            if (_notEquals_2) {
              MappingTypeBinding _binding_3 = this.getBinding();
              CodeConceptInstance _currentContext_1 = _binding_3.getCurrentContext();
              MappingTypeVariable<T> _boundTo_4 = this.getBoundTo();
              T _nearestAncestorWithMatch_1 = _currentContext_1.<T>nearestAncestorWithMatch(_boundTo_4.type);
              this.value = _nearestAncestorWithMatch_1;
            } else {
              throw new MappingTypeException("No context information available");
            }
          }
          return this.value;
        } else {
          String _reference_1 = this.getReference();
          String _plus = ("Cannot handle path expression: " + _reference_1);
          String _plus_1 = (_plus + " [");
          MappingTypeVariable<T> _boundTo_5 = this.getBoundTo();
          String _plus_2 = (_plus_1 + _boundTo_5);
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
  public MappingTypeVariableBinding<T> clone(final MappingTypeBinding newBinding) {
    MappingTypeVariable<T> _boundTo = this.getBoundTo();
    String _reference = this.getReference();
    return new CodeConceptInstanceReference<T>(_boundTo, _reference, newBinding);
  }
  
  @Override
  public void setValue(final T value) {
    if (((!Objects.equal(this.getReference(), null)) && this.getReference().startsWith("@"))) {
      String _reference = this.getReference();
      final String annotationName = _reference.substring(1);
      MappingTypeBinding _binding = this.getBinding();
      CodeConceptInstance _currentInstance = _binding.getCurrentInstance();
      _currentInstance.put(annotationName, value);
    } else {
      MappingTypeVariable<T> _boundTo = this.getBoundTo();
      boolean _equals = _boundTo.name.equals("match");
      if (_equals) {
        MappingTypeBinding _binding_1 = this.getBinding();
        CodeConceptInstance _currentInstance_1 = _binding_1.getCurrentInstance();
        _currentInstance_1.setMatch(value);
      } else {
        String _reference_1 = this.getReference();
        String _plus = ("Cannot set value for reference: " + _reference_1);
        throw new UnsupportedOperationException(_plus);
      }
    }
  }
}
