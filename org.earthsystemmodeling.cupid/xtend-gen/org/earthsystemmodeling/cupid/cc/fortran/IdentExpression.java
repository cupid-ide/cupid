package org.earthsystemmodeling.cupid.cc.fortran;

import org.earthsystemmodeling.cupid.cc.fortran.Expression;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTNameNode;
import org.eclipse.photran.internal.core.parser.ASTVarOrFnRefNode;
import org.eclipse.photran.internal.core.parser.IExpr;

@SuppressWarnings("all")
public class IdentExpression extends Expression {
  private String identifier;
  
  protected IdentExpression(final String identifier) {
    this.identifier = identifier;
  }
  
  public static IdentExpression literal(final String identifier) {
    return new IdentExpression(identifier);
  }
  
  @Override
  public String match(final IExpr expr) {
    if ((expr instanceof ASTVarOrFnRefNode)) {
      final ASTVarOrFnRefNode node = ((ASTVarOrFnRefNode) expr);
      ASTNameNode _name = node.getName();
      Token _name_1 = _name.getName();
      String _text = _name_1.getText();
      boolean _equals = _text.equals(this.identifier);
      if (_equals) {
        return this.identifier;
      }
    }
    return null;
  }
  
  @Override
  public String toString() {
    return this.identifier;
  }
}
