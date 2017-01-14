package org.earthsystemmodeling.cupid.cc.mapping;

import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.mapping.IllegalVariableAssignment;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariable;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariableBinding;
import org.earthsystemmodeling.cupid.cc.mapping.ReferenceMTVBinding;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class CodeConceptInstanceReference<T extends Object> extends ReferenceMTVBinding<T> {
  public CodeConceptInstanceReference(final MappingTypeVariable<T> boundTo, final String reference) {
    super(null, reference);
    this.setBoundTo(boundTo);
  }
  
  @Override
  public T getValue() {
    try {
      MappingTypeVariable<T> _boundTo = this.getBoundTo();
      boolean _equals = _boundTo.name.equals("context");
      if (_equals) {
        MappingTypeBinding _binding = this.getBinding();
        CodeConceptInstance _currentContext = _binding.getCurrentContext();
        MappingTypeVariable<T> _boundTo_1 = this.getBoundTo();
        T _nearestAncestorWithMatch = _currentContext.<T>nearestAncestorWithMatch(_boundTo_1.type);
        this.value = _nearestAncestorWithMatch;
        return this.value;
      } else {
        String _reference = this.getReference();
        boolean _startsWith = _reference.startsWith("@");
        if (_startsWith) {
          String _reference_1 = this.getReference();
          final String annotationName = _reference_1.substring(1);
          MappingTypeBinding _binding_1 = this.getBinding();
          CodeConceptInstance _currentContext_1 = _binding_1.getCurrentContext();
          final Object refVal = _currentContext_1.get(annotationName);
          MappingTypeVariable<T> _boundTo_2 = this.getBoundTo();
          boolean _isInstance = _boundTo_2.type.isInstance(refVal);
          boolean _not = (!_isInstance);
          if (_not) {
            MappingTypeVariable<T> _boundTo_3 = this.getBoundTo();
            MappingTypeVariable<T> _boundTo_4 = this.getBoundTo();
            Class<?> _class = refVal.getClass();
            throw new IllegalVariableAssignment(_boundTo_3.name, _boundTo_4.type, _class);
          }
          this.value = ((T) refVal);
          return this.value;
        } else {
          if ((this.getReference().startsWith("../") && (!this.getReference().substring(3).contains("/")))) {
            String _reference_2 = this.getReference();
            final String subconceptName = _reference_2.substring(3);
            MappingTypeBinding _binding_2 = this.getBinding();
            CodeConceptInstance _currentContext_2 = _binding_2.getCurrentContext();
            CodeConceptInstance _child = _currentContext_2.getChild(subconceptName);
            Object _match = null;
            if (_child!=null) {
              _match=_child.getMatch();
            }
            final Object refVal_1 = _match;
            MappingTypeVariable<T> _boundTo_5 = this.getBoundTo();
            boolean _isInstance_1 = _boundTo_5.type.isInstance(refVal_1);
            boolean _not_1 = (!_isInstance_1);
            if (_not_1) {
              MappingTypeVariable<T> _boundTo_6 = this.getBoundTo();
              MappingTypeVariable<T> _boundTo_7 = this.getBoundTo();
              Class<?> _class_1 = refVal_1.getClass();
              throw new IllegalVariableAssignment(_boundTo_6.name, _boundTo_7.type, _class_1);
            }
            this.value = ((T) refVal_1);
            return this.value;
          } else {
            String _reference_3 = this.getReference();
            String _plus = ("Cannot handle path expression: " + _reference_3);
            String _plus_1 = (_plus + " [");
            MappingTypeVariable<T> _boundTo_8 = this.getBoundTo();
            String _plus_2 = (_plus_1 + _boundTo_8);
            String _plus_3 = (_plus_2 + "].");
            throw new UnsupportedOperationException(_plus_3);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public MappingTypeVariableBinding<T> clone() {
    MappingTypeVariable<T> _boundTo = this.getBoundTo();
    String _reference = this.getReference();
    return new CodeConceptInstanceReference<T>(_boundTo, _reference);
  }
  
  @Override
  public void setValue(final T value) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
