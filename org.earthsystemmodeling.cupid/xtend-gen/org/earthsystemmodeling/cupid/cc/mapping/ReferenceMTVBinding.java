package org.earthsystemmodeling.cupid.cc.mapping;

import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariableBinding;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public abstract class ReferenceMTVBinding<T extends Object> extends MappingTypeVariableBinding<T> {
  @Accessors
  private String reference;
  
  public ReferenceMTVBinding(final String reference) {
    this.reference = reference;
  }
  
  @Pure
  public String getReference() {
    return this.reference;
  }
  
  public void setReference(final String reference) {
    this.reference = reference;
  }
}
