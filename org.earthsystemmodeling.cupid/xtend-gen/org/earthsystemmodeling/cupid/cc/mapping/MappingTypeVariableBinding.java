package org.earthsystemmodeling.cupid.cc.mapping;

import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariable;
import org.earthsystemmodeling.cupid.cc.mapping.UnresolvedVariableAccessException;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public abstract class MappingTypeVariableBinding<T extends Object> {
  @Accessors
  private MappingTypeVariable<T> boundTo;
  
  public abstract boolean isResolved();
  
  public abstract T getValue() throws UnresolvedVariableAccessException;
  
  @Override
  public abstract MappingTypeVariableBinding<T> clone();
  
  @Pure
  public MappingTypeVariable<T> getBoundTo() {
    return this.boundTo;
  }
  
  public void setBoundTo(final MappingTypeVariable<T> boundTo) {
    this.boundTo = boundTo;
  }
}
