package org.earthsystemmodeling.cupid.cc.mapping;

import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeParameterBinding;
import org.earthsystemmodeling.cupid.cc.types.MTPType;

@SuppressWarnings("all")
public class LiteralMTVBinding extends MappingTypeParameterBinding {
  private MTPType<?> value;
  
  public LiteralMTVBinding(final MTPType<?> value) {
    this.value = value;
  }
  
  @Override
  public MTPType<?> getValue() {
    return this.value;
  }
  
  @Override
  public MappingTypeParameterBinding clone(final MappingTypeBinding newBinding) {
    LiteralMTVBinding _xblockexpression = null;
    {
      final LiteralMTVBinding cl = new LiteralMTVBinding(this.value);
      cl.setBinding(newBinding);
      _xblockexpression = cl;
    }
    return _xblockexpression;
  }
  
  @Override
  public void setValue(final MTPType<?> value) {
    throw new UnsupportedOperationException();
  }
}
