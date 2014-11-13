package org.earthsystemmodeling.cupid.nuopc_v7;

import org.earthsystemmodeling.cupid.nuopc_v7.CodeConcept;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class BasicCodeConcept extends CodeConcept<BasicCodeConcept, CodeConcept, IASTNode> {
  public BasicCodeConcept(final CodeConcept parent, final long id) {
    super(parent);
    this._id = id;
  }
  
  public BasicCodeConcept reverse() {
    return this;
  }
  
  public IFortranAST forward() {
    return null;
  }
  
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("BasicCodeConcept: (id=");
    _builder.append(this._id, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  public static BasicCodeConcept newBasicCodeConcept(final CodeConcept parent, final long id) {
    BasicCodeConcept _xifexpression = null;
    if ((id > 0)) {
      _xifexpression = new BasicCodeConcept(parent, id);
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
}
