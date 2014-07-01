package org.earthsystemmodeling;

import org.earthsystemmodeling.psyche.PathExpr;


public class ElementAlreadyBoundException extends Exception {
	
	public ElementAlreadyBoundException(PathExpr pathExpr) {
		super("Cannot set an element that is already bound: " + PathExprNotFoundException.toString(pathExpr));
	}
	
}
