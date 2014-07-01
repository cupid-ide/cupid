package org.earthsystemmodeling;

import java.util.List;

import org.earthsystemmodeling.psyche.PathExpr;
import org.earthsystemmodeling.psyche.PathExprTerm;


public class PathExprNotFoundException extends Exception {
	
	private PathExpr pathExpr;
	
	public PathExprNotFoundException(PathExpr pathExpr) {
		this(pathExpr, "Path expression not found: " + toString(pathExpr));
	}
	
	public PathExprNotFoundException(PathExpr pathExpr, String message) {
		super(message);
		this.pathExpr = pathExpr;
	}
	
	public static String toString(PathExpr pathExpr) {
		List<PathExprTerm> segments = FSM.linearizePathExpr(pathExpr);
		String result = "";
		for (PathExprTerm segment : segments) {
			if (result.length() > 0) result+= "/";
			if (segment.getAxis() != null && segment.getAxis().isAncestor()) {
				result += "^";
			}
			result += segment.getRef().getName();
		}
		return result;
	}
}
