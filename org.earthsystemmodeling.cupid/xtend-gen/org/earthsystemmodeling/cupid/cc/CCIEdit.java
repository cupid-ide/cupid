package org.earthsystemmodeling.cupid.cc;

import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;

@SuppressWarnings("all")
public abstract class CCIEdit {
  protected CodeConceptInstance applyTo;
  
  public CCIEdit(final CodeConceptInstance applyTo) {
    this.applyTo = applyTo;
  }
  
  public abstract void apply();
}
