package org.earthsystemmodeling.cupid.cc.mapping;

import com.google.common.base.Objects;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.mapping.IllegalVariableAssignment;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariable;
import org.earthsystemmodeling.cupid.cc.mapping.ReferenceMTVBinding;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class CodeConceptInstanceReference<T extends Object> extends ReferenceMTVBinding<T> {
  public CodeConceptInstanceReference(final MappingTypeVariable<T> boundTo, final String reference) {
    super(reference);
    this.setBoundTo(boundTo);
  }
  
  public void resolve(final CodeConceptInstance instance) {
    try {
      this.value = null;
      MappingTypeVariable<T> _boundTo = this.getBoundTo();
      boolean _equals = _boundTo.name.equals("context");
      if (_equals) {
        MappingTypeVariable<T> _boundTo_1 = this.getBoundTo();
        T _nearestAncestorWithMatch = instance.<T>nearestAncestorWithMatch(_boundTo_1.type);
        this.value = _nearestAncestorWithMatch;
        if (((!Objects.equal(this.value, null)) && (!this.getBoundTo().type.isInstance(this.value)))) {
          MappingTypeVariable<T> _boundTo_2 = this.getBoundTo();
          MappingTypeVariable<T> _boundTo_3 = this.getBoundTo();
          Class<?> _class = this.value.getClass();
          throw new IllegalVariableAssignment(_boundTo_2.name, _boundTo_3.type, _class);
        }
      } else {
        MappingTypeVariable<T> _boundTo_4 = this.getBoundTo();
        String _plus = ("Not handling path expressions yet: " + _boundTo_4);
        throw new UnsupportedOperationException(_plus);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public CodeConceptInstanceReference<T> clone() {
    MappingTypeVariable<T> _boundTo = this.getBoundTo();
    String _reference = this.getReference();
    return new CodeConceptInstanceReference<T>(_boundTo, _reference);
  }
}
