package org.earthsystemmodeling.cupid.cc.fortran;

import org.earthsystemmodeling.cupid.cc.fortran.Expression;
import org.eclipse.photran.internal.core.parser.ASTIntConstNode;
import org.eclipse.photran.internal.core.parser.IExpr;

@SuppressWarnings("all")
public class IntExpression extends Expression {
  private int literal;
  
  protected IntExpression(final int literal) {
    this.literal = literal;
  }
  
  public static IntExpression literal(final int literal) {
    return new IntExpression(literal);
  }
  
  @Override
  public String match(final IExpr expr) {
    if ((expr instanceof ASTIntConstNode)) {
      final ASTIntConstNode node = ((ASTIntConstNode) expr);
      Integer _valueOf = Integer.valueOf(node.getIntConst().getText());
      boolean _equals = ((_valueOf).intValue() == this.literal);
      if (_equals) {
        return Integer.toString(this.literal);
      }
    }
    return null;
  }
  
  @Override
  public String toString() {
    return String.valueOf(this.literal);
  }
}
