package org.earthsystemmodeling.cupid.cc.fortran

import org.eclipse.photran.internal.core.parser.IExpr
import java.util.List

abstract class StringExpression extends Expression {
	
	
	
	static def oneOf(String... oneOf) {
		new OneOfStringExpression(oneOf)
	}
	
	static def literal(String literal) {
		new LiteralStringExpression(literal)
	}
	
	
	static class OneOfStringExpression extends StringExpression {
		List<String> oneOf
		
		new(String... oneOf) {
			this.oneOf = newArrayList(oneOf)
		}
		
		override match(IExpr expr) {
			oneOf.findFirst[o|expr.toString.equals(o)]
		}		
	}
	
	static class LiteralStringExpression extends StringExpression {	
		String literal
		
		new(String literal) {
			this.literal = literal
		}
		
		override match(IExpr expr) {
			if (expr.toString.equals(literal)) {
				literal
			}
			else {
				null
			}
		}
		
		override toString() {
			literal
		}	
	}
	
	
}