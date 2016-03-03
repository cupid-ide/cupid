package org.earthsystemmodeling.cupid.nuopc;

import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.eclipse.photran.internal.core.parser.IASTNode;

@SuppressWarnings("all")
public class BasicCodeConcept<A extends IASTNode> extends CodeConcept<CodeConcept<?, ?>, A> {
  public BasicCodeConcept(final CodeConcept<?, ?> parent, final A astRef) {
    super(parent);
    this._astRef = astRef;
  }
  
  public BasicCodeConcept(final CodeConcept<?, ?> parent) {
    super(parent);
  }
  
  @Override
  public CodeConcept<?, ?> reverse() {
    return this;
  }
}
