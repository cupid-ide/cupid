package org.earthsystemmodeling.cupid.cc.fortran;

import java.util.List;
import org.earthsystemmodeling.cupid.cc.fortran.Expression;
import org.eclipse.photran.internal.core.parser.IExpr;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public abstract class StringExpression extends Expression {
  public static class OneOfStringExpression extends StringExpression {
    private List<String> oneOf;
    
    public OneOfStringExpression(final String... oneOf) {
      this.oneOf = CollectionLiterals.<String>newArrayList(oneOf);
    }
    
    @Override
    public String match(final IExpr expr) {
      final Function1<String, Boolean> _function = (String o) -> {
        return Boolean.valueOf(expr.toString().equals(o));
      };
      return IterableExtensions.<String>findFirst(this.oneOf, _function);
    }
  }
  
  public static class LiteralStringExpression extends StringExpression {
    private String literal;
    
    public LiteralStringExpression(final String literal) {
      this.literal = literal;
    }
    
    @Override
    public String match(final IExpr expr) {
      String _xifexpression = null;
      boolean _equals = expr.toString().equals(this.literal);
      if (_equals) {
        _xifexpression = this.literal;
      } else {
        _xifexpression = null;
      }
      return _xifexpression;
    }
    
    @Override
    public String toString() {
      return this.literal;
    }
  }
  
  public static StringExpression.OneOfStringExpression oneOf(final String... oneOf) {
    return new StringExpression.OneOfStringExpression(oneOf);
  }
  
  public static StringExpression.LiteralStringExpression literal(final String literal) {
    return new StringExpression.LiteralStringExpression(literal);
  }
}
