package org.earthsystemmodeling.cupid.cc.mapping;

import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariableBinding;
import org.earthsystemmodeling.cupid.cc.mapping.ReferenceMTVBinding;

@SuppressWarnings("all")
public class TemplateParameterReference<T extends Object> extends ReferenceMTVBinding<T> {
  public TemplateParameterReference(final String reference) {
    super(null, reference);
  }
  
  @Override
  public void setValue(final T value) {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public MappingTypeVariableBinding<T> clone(final MappingTypeBinding newBinding) {
    throw new UnsupportedOperationException();
  }
}
