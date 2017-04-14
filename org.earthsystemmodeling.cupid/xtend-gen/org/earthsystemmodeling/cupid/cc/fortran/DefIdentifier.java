package org.earthsystemmodeling.cupid.cc.fortran;

import org.earthsystemmodeling.cupid.cc.fortran.MTVType;
import org.eclipse.photran.internal.core.lexer.Token;

@SuppressWarnings("all")
public class DefIdentifier implements MTVType<Token> {
  private String literal;
  
  protected DefIdentifier(final String literal) {
    this.literal = literal;
  }
  
  public static DefIdentifier literal(final String literal) {
    return new DefIdentifier(literal);
  }
  
  @Override
  public String match(final Token token) {
    String _xifexpression = null;
    boolean _equalsIgnoreCase = token.getText().equalsIgnoreCase(this.literal);
    if (_equalsIgnoreCase) {
      _xifexpression = token.getText();
    } else {
      return null;
    }
    return _xifexpression;
  }
  
  @Override
  public String toString() {
    return this.literal;
  }
}
