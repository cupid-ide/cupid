package org.earthsystemmodeling.cupid.cc.mapping;

import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeParameter;
import org.earthsystemmodeling.cupid.cc.mapping.UnresolvedVariableAccessException;
import org.earthsystemmodeling.cupid.cc.types.MTPType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public abstract class MappingTypeParameterBinding {
  @Accessors
  private MappingTypeBinding binding;
  
  @Accessors
  private MappingTypeParameter boundTo;
  
  public abstract MTPType<?> getValue() throws UnresolvedVariableAccessException;
  
  public abstract void setValue(final MTPType<?> value);
  
  public abstract MappingTypeParameterBinding clone(final MappingTypeBinding newBinding);
  
  @Pure
  public MappingTypeBinding getBinding() {
    return this.binding;
  }
  
  public void setBinding(final MappingTypeBinding binding) {
    this.binding = binding;
  }
  
  @Pure
  public MappingTypeParameter getBoundTo() {
    return this.boundTo;
  }
  
  public void setBoundTo(final MappingTypeParameter boundTo) {
    this.boundTo = boundTo;
  }
}
