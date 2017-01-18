package org.earthsystemmodeling.cupid.cc;

import org.earthsystemmodeling.cupid.cc.CCIEdit;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class CCIAddChildInstance extends CCIEdit {
  private CodeConceptInstance child;
  
  public CCIAddChildInstance(final CodeConceptInstance applyTo, final CodeConceptInstance child) {
    super(applyTo);
    this.child = child;
  }
  
  @Override
  public void apply() {
    try {
      this.applyTo.addChild(this.child);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
