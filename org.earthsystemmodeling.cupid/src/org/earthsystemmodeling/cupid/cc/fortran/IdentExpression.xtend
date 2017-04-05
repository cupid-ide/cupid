package org.earthsystemmodeling.cupid.cc.fortran

import org.eclipse.photran.internal.core.parser.IExpr
import org.eclipse.photran.internal.core.parser.ASTVarOrFnRefNode

class IdentExpression extends Expression {
	
	String identifier
	
	protected new(String identifier) {
		this.identifier = identifier
	}
	
	static def literal(String identifier) {
		new IdentExpression(identifier)
	}
	
	override match(IExpr expr) {
		if (expr instanceof ASTVarOrFnRefNode) {
			val node = expr as ASTVarOrFnRefNode
			if (node.name.name.text.equals(identifier)) {
				return identifier
			}
		}
		return null
	}
	
	override toString() {
		identifier
	}
	
}