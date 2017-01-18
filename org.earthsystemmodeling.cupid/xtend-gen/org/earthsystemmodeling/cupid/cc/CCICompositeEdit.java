package org.earthsystemmodeling.cupid.cc;

import java.util.List;
import org.earthsystemmodeling.cupid.cc.CCIEdit;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class CCICompositeEdit extends CCIEdit {
  @Accessors
  private List<CCIEdit> edits = CollectionLiterals.<CCIEdit>newLinkedList();
  
  public CCICompositeEdit(final CodeConceptInstance applyTo) {
    super(applyTo);
  }
  
  @Override
  public void apply() {
    for (final CCIEdit e : this.edits) {
      e.apply();
    }
  }
  
  @Pure
  public List<CCIEdit> getEdits() {
    return this.edits;
  }
  
  public void setEdits(final List<CCIEdit> edits) {
    this.edits = edits;
  }
}
