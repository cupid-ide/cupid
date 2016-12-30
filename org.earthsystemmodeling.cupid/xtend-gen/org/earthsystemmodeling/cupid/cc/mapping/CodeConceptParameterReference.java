package org.earthsystemmodeling.cupid.cc.mapping;

import com.google.common.base.Objects;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.mapping.ReferenceMTVBinding;

@SuppressWarnings("all")
public class CodeConceptParameterReference<T extends Object> extends ReferenceMTVBinding<T> {
  private T value;
  
  public CodeConceptParameterReference(final String reference) {
    super(reference);
  }
  
  public void bindWith(final CodeConcept concept) {
    String _reference = this.getReference();
    Object _parameterValue = concept.getParameterValue(_reference);
    final T bindingValue = ((T) _parameterValue);
    boolean _notEquals = (!Objects.equal(bindingValue, null));
    if (_notEquals) {
      this.value = this.value;
    }
  }
  
  @Override
  public boolean isResolved() {
    return (!Objects.equal(this.value, null));
  }
  
  @Override
  public T resolve() {
    return this.value;
  }
}
