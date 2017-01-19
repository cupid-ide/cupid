package org.earthsystemmodeling.cupid.cc.mapping;

import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariableBinding;

@SuppressWarnings("all")
public class LiteralMTVBinding<T extends Object> extends MappingTypeVariableBinding<T> {
  private T value;
  
  public LiteralMTVBinding(final T value) {
    this.value = value;
  }
  
  @Override
  public boolean isResolved() {
    return true;
  }
  
  @Override
  public T getValue() {
    return this.value;
  }
  
  @Override
  public MappingTypeVariableBinding<T> clone(final MappingTypeBinding newBinding) {
    LiteralMTVBinding<T> _xblockexpression = null;
    {
      final LiteralMTVBinding<T> cl = new LiteralMTVBinding<T>(this.value);
      cl.setBinding(newBinding);
      _xblockexpression = cl;
    }
    return _xblockexpression;
  }
  
  @Override
  public void setValue(final T value) {
    throw new UnsupportedOperationException();
  }
}
