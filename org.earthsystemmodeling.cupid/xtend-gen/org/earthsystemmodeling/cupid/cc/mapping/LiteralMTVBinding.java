package org.earthsystemmodeling.cupid.cc.mapping;

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
  public LiteralMTVBinding<T> clone() {
    return new LiteralMTVBinding<T>(this.value);
  }
}
