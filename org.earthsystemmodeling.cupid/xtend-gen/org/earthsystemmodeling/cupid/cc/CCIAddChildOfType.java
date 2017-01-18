package org.earthsystemmodeling.cupid.cc;

import org.earthsystemmodeling.cupid.cc.CCIEdit;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;

@SuppressWarnings("all")
public class CCIAddChildOfType extends CCIEdit {
  private CodeConcept typeToAdd;
  
  public CCIAddChildOfType(final CodeConceptInstance applyTo, final CodeConcept typeToAdd) {
    super(applyTo);
    this.typeToAdd = typeToAdd;
  }
  
  @Override
  public void apply() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
