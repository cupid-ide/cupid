package org.earthsystemmodeling.cupid.cc.mapping;

import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeParameterBinding;
import org.earthsystemmodeling.cupid.cc.mapping.ReferenceMTVBinding;
import org.earthsystemmodeling.cupid.cc.types.MTPType;

@SuppressWarnings("all")
public class TemplateParameterReference extends ReferenceMTVBinding {
  public TemplateParameterReference(final String reference) {
    super(null, reference);
  }
  
  @Override
  public MappingTypeParameterBinding clone(final MappingTypeBinding newBinding) {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public void setValue(final MTPType<?> value) {
    throw new UnsupportedOperationException();
  }
}
