package org.earthsystemmodeling.cupid.cc.fortran

import org.eclipse.photran.internal.core.lexer.Token

class DefIdentifier implements MTVType<Token> {
	
	String literal
	
	protected new(String literal) {
		this.literal = literal
	}
	
	static def literal(String literal) {
		new DefIdentifier(literal)
	}
	
	override String match(Token token) {
		if (token.text.equalsIgnoreCase(literal)) {
			token.text
		}
		else {
			return null
		}
	}
	
	override toString() {
		literal
	}
	
}