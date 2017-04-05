package org.earthsystemmodeling.cupid.cc.fortran

import org.earthsystemmodeling.cupid.cc.fortran.Expression
import org.eclipse.photran.internal.core.parser.IExpr
import org.eclipse.photran.internal.core.parser.ASTIntConstNode

class IntExpression extends Expression {
	
	int literal
	
	protected new(int literal) {
		this.literal = literal
	}
	
	static def literal(int literal) {
		new IntExpression(literal)
	}
	
	override match(IExpr expr) {
		if (expr instanceof ASTIntConstNode) {
			val node = expr as ASTIntConstNode
			if (Integer.valueOf(node.intConst.text) == literal) {
				return Integer.toString(literal)
			}
		}
		return null
	}
	
	override toString() {
		String.valueOf(literal)
	}
	
}