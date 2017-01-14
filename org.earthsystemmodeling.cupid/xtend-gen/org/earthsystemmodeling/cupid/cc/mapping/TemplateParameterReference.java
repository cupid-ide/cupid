package org.earthsystemmodeling.cupid.cc.mapping;

import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariableBinding;
import org.earthsystemmodeling.cupid.cc.mapping.ReferenceMTVBinding;

@SuppressWarnings("all")
public class TemplateParameterReference<T extends Object> extends ReferenceMTVBinding<T> {
  public TemplateParameterReference(final String reference) {
    super(null, reference);
  }
  
  @Override
  public MappingTypeVariableBinding<T> clone() {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public void setValue(final T value) {
    throw new UnsupportedOperationException();
  }
}
