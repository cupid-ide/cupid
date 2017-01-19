package org.earthsystemmodeling.cupid.cc.mapping;

import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariable;
import org.earthsystemmodeling.cupid.cc.mapping.UnresolvedVariableAccessException;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public abstract class MappingTypeVariableBinding<T extends Object> {
  @Accessors
  private MappingTypeBinding binding;
  
  @Accessors
  private MappingTypeVariable<T> boundTo;
  
  public abstract boolean isResolved();
  
  public abstract T getValue() throws UnresolvedVariableAccessException;
  
  public abstract void setValue(final T value);
  
  public abstract MappingTypeVariableBinding<T> clone(final MappingTypeBinding newBinding);
  
  @Pure
  public MappingTypeBinding getBinding() {
    return this.binding;
  }
  
  public void setBinding(final MappingTypeBinding binding) {
    this.binding = binding;
  }
  
  @Pure
  public MappingTypeVariable<T> getBoundTo() {
    return this.boundTo;
  }
  
  public void setBoundTo(final MappingTypeVariable<T> boundTo) {
    this.boundTo = boundTo;
  }
}
