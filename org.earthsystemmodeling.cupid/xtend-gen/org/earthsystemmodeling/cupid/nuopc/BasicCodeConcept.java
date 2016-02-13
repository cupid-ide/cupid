package org.earthsystemmodeling.cupid.nuopc;

import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class BasicCodeConcept<A extends IASTNode> extends CodeConcept<CodeConcept<?, ?>, A> {
  public BasicCodeConcept(final CodeConcept<?, ?> parent, final long id) {
    super(parent);
    this._id = id;
  }
  
  public BasicCodeConcept(final CodeConcept<?, ?> parent, final A astRef) {
    super(parent);
    this._astRef = astRef;
  }
  
  public BasicCodeConcept(final CodeConcept<?, ?> parent) {
    super(parent);
  }
  
  @Override
  public CodeConcept<CodeConcept<?, ?>, A> reverse() {
    return this;
  }
  
  @Override
  public IFortranAST forward() {
    return null;
  }
  
  @Override
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("BasicCodeConcept: (id=");
    _builder.append(this._id, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  public static BasicCodeConcept newBasicCodeConcept(final CodeConcept<?, ?> parent, final long id) {
    BasicCodeConcept<IASTNode> _xifexpression = null;
    if ((id > 0)) {
      _xifexpression = new BasicCodeConcept<IASTNode>(parent, id);
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
}
