package alice.tuprolog;

import java.util.AbstractMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class DefaultClauseInfo implements ClauseInfo
{
	/** referring clause */
	private Struct clause;
	
	/** head of clause */
	private Struct head;
	
	/** body of clause */
	private SubGoalTree body;

	private Struct headCopy;
	private SubGoalTree bodyCopy;
	
	/** if the clause is part of a theory in a lib (null if not)*/
	private String libName;
	
	DefaultClauseInfo(Struct clause_, String lib) 
	{
		// super(clause_, lib);
		clause = clause_;
		head = extractHead(clause);
		body = extractBody(clause.getArg(1));
		libName = lib; 
	}
	
	/**
	 * Gets a clause from a generic Term
	 */
	private Struct extractHead(Struct clause) {
		return (Struct)clause.getArg(0);
	}
	
	public Struct getClause() { return clause; }	
	public Struct getHead() { return head; }    	
	public SubGoalTree getBody() { return body;	}	
	public Struct getHeadCopy() { return headCopy; }
	public SubGoalTree getBodyCopy() { return bodyCopy; }
	
	public String getLibName() { return libName; }
	
	/**
	 * Gets a clause from a generic Term
	 */
	static SubGoalTree extractBody(Term body) {
		SubGoalTree r = new SubGoalTree();
		extractBody(r, body);
		return r;
	}
	
	private static void extractBody(SubGoalTree parent, Term body) {
		while (body instanceof Struct && ((Struct)body).getName().equals(",")) {
			Term t = ((Struct)body).getArg(0);
			if (t instanceof Struct && ((Struct)t).getName().equals(",")) {
				extractBody(parent.addChild(),t);
			} else {
				parent.addChild(t);
			}
			body = ((Struct)body).getArg(1);
		}
		parent.addChild(body);
	}
	
	/**
	 * Gets the string representation
	 * recognizing operators stored by
	 * the operator manager
	 */
	public static String toString(Struct clause, OperatorManager op) {
		int p;
		if ((p = op.opPrio(":-","xfx")) >= OperatorManager.OP_LOW) {
			String st=indentPredicatesAsArgX(clause.getArg(1),op,p);
			String head = clause.getArg(0).toStringAsArgX(op,p);
			if (st.equals("true")) {
				return head +".\n";
			} else {
				return (head + " :-\n\t" + st +".\n");
			}
		}
		
		if ((p = op.opPrio(":-","yfx")) >= OperatorManager.OP_LOW) {
			String st=indentPredicatesAsArgX(clause.getArg(1),op,p);
			String head = clause.getArg(0).toStringAsArgY(op,p);
			if (st.equals("true")) {
				return head +".\n";
			} else {
				return (head + " :-\n\t" + st +".\n");
			}
		}
		
		if ((p = op.opPrio(":-","xfy")) >= OperatorManager.OP_LOW) {
			String st=indentPredicatesAsArgY(clause.getArg(1),op,p);
			String head = clause.getArg(0).toStringAsArgX(op,p);
			if (st.equals("true")) {
				return head +".\n";
			} else {
				return (head + " :-\n\t" + st +".\n");
			}
		}
		return (clause.toString());
	}

	/**
	 * Perform copy for use in current engine's demonstration
	 * @param idExecCtx Current ExecutionContext id
	 */
	public void performCopy(int idExecCtx) 
	{
		IdentityHashMap v = new IdentityHashMap();
		headCopy = (Struct)head.copy(v,idExecCtx);
		bodyCopy = new SubGoalTree();
		bodyCopy(body,bodyCopy,v,idExecCtx);
	}
	
	/**
	 * Perform copy for assertion operation
	 */
	void performCopy() {
		AbstractMap v = new LinkedHashMap();
		clause = (Struct) clause.copy(v, Var.ORIGINAL);
		v = new IdentityHashMap();
		head = (Struct)head.copy(v,Var.ORIGINAL);
		body = new SubGoalTree();
		bodyCopy(body,bodyCopy,v,Var.ORIGINAL);
	}
		
	private void bodyCopy(SubGoalTree source, SubGoalTree destination, AbstractMap map, int id) {
		Iterator it = source.iterator();
		while (it.hasNext()) {
			AbstractSubGoalTree s = (AbstractSubGoalTree)it.next();
			if (s.isLeaf()) {
				SubGoalElement l = (SubGoalElement)s;
				Term t = l.getValue().copy(map,id);
				destination.addChild(t);
			} else {
				SubGoalTree src  = (SubGoalTree)s; 
				SubGoalTree dest = destination.addChild();
				bodyCopy(src,dest,map,id);
			}
		}
	}
	
	/**
	 * Gets the string representation with default operator representation
	 */
	public String toString() {
		// default prio: xfx
		String st=indentPredicates(clause.getArg(1));
		return( clause.getArg(0).toString() + " :-\n\t"+st+".\n");
	}
	
	static private String indentPredicates(Term t) {
		if (t instanceof Struct) {
			Struct co=(Struct)t;
			if (co.getName().equals(",")){
				return co.getArg(0).toString()+",\n\t"+indentPredicates(co.getArg(1));
			} else {
				return t.toString();
			}
		} else {
			return t.toString();
		}
	}
	
	static private String indentPredicatesAsArgX(Term t,OperatorManager op,int p) {
		if (t instanceof Struct) {
			Struct co=(Struct)t;
			if (co.getName().equals(",")) {
				return co.getArg(0).toStringAsArgX(op,p)+",\n\t"+
				"("+indentPredicatesAsArgX(co.getArg(1),op,p)+")";
			} else {
				return t.toStringAsArgX(op,p);
			}
		} else {
			return t.toStringAsArgX(op,p);
		}
		
	}
	
	static private String indentPredicatesAsArgY(Term t,OperatorManager op,int p) {
		if (t instanceof Struct) {
			Struct co=(Struct)t;
			if (co.getName().equals(",")) {
				return co.getArg(0).toStringAsArgY(op,p)+",\n\t"+
				"("+indentPredicatesAsArgY(co.getArg(1),op,p)+")";
			} else {
				return t.toStringAsArgY(op,p);
			}
		} else {
			return t.toStringAsArgY(op,p);
		}
	}	
}
