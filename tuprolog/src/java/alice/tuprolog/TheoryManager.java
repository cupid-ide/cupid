/*
 * tuProlog - Copyright (C) 2001-2007  aliCE team at deis.unibo.it
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package alice.tuprolog;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.List;

/**
 * This class defines the Theory Manager who manages the clauses/theory often referred to as the Prolog database.
 * The theory (as a set of clauses) are stored in the ClauseDatabase which in essence is a HashMap grouped by functor/arity.
 * <p/>
 * The TheoryManager functions logically, as prescribed by ISO Standard 7.5.4
 * section. The effects of assertions and retractions shall not be undone if the
 * program subsequently backtracks over the assert or retract call, as prescribed
 * by ISO Standard 7.7.9 section.
 * <p/>
 * To use the TheoryManager one should primarily use the methods assertA, assertZ, consult, retract, abolish and find.
 * <p/>
 *
 * rewritten by:
 * @author ivar.orstavik@hist.no
 *
 * @see Theory
 */
public class TheoryManager implements Serializable {

    private ClauseDatabase dynamicDBase;
    private ClauseDatabase staticDBase;
    private Prolog engine;
    private PrimitiveManager primitiveManager;
    private Stack startGoalStack;
    Theory lastConsultedTheory;

    void initialize(Prolog vm) {
        dynamicDBase = new ClauseDatabase();
        staticDBase = new ClauseDatabase();
        lastConsultedTheory = new Theory();
        engine = vm;
        primitiveManager = engine.getPrimitiveManager();
    }

    /**
     * inserting of a clause at the head of the dbase
     */
    public void assertA(Struct clause, boolean dyn, String libName, boolean backtrackable) {
        ClauseInfo d = new DefaultClauseInfo(toClause(clause), libName);
        String key = d.getHead().getPredicateIndicator();
        if (dyn) {
        	dynamicDBase.addFirst(key, d);
        	if (staticDBase.containsKey(key)) {
            	engine.warn("A static predicate with signature " + key + " has been overriden.");
        	}
        } else
        	staticDBase.addFirst(key, d);
        engine.spy("INSERTA: " + d.getClause() + "\n");
    }

    /**
     * inserting of a clause at the end of the dbase
     */
    public void assertZ(Struct clause, boolean dyn, String libName, boolean backtrackable) {
        ClauseInfo d = new DefaultClauseInfo(toClause(clause), libName);
        String key = d.getHead().getPredicateIndicator();
        if (dyn) {
        	dynamicDBase.addLast(key, d);
        	if (staticDBase.containsKey(key)) {
        		engine.warn("A static predicate with signature " + key + " has been overriden.");
        	}
        } else
        	staticDBase.addLast(key, d);
        engine.spy("INSERTZ: " + d.getClause() + "\n");
    }

    /**
     * removing from dbase the first clause with head unifying with clause
     * (m if a free substitution index and t is the first free timestamp)
     */
    public ClauseInfo retract(Struct cl) {
    	Struct clause = toClause(cl);
    	Struct struct = ((Struct) clause.getArg(0));
        LinkedList family = (LinkedList) dynamicDBase.get(struct.getPredicateIndicator());
        if (family == null)
            return null;
        for (Iterator it = family.iterator(); it.hasNext();) {
            ClauseInfo d = (ClauseInfo) it.next();
            if (clause.match(engine, d.getClause())) {
                it.remove();
                engine.spy("DELETE: " + d.getClause() + "\n");
                return new DefaultClauseInfo(d.getClause(), null);
            }
        }
        return null;
    }

    /**
     * removing from dbase the first clause with head unifying with clause
     * (m if a free substitution index and t is the first free timestamp)
     */
    public boolean abolish(Struct cl) {
    	cl = toClause(cl);
    	String key = cl.getPredicateIndicator();
        LinkedList abolished = dynamicDBase.abolish(key);
        if (abolished != null)
        	engine.spy("ABOLISHED: " + key + " number of clauses=" + abolished.size() + "\n");
        return true;
    }

    /**
     * Returns a family of clauses with functor and arity equals
     * to the functor and arity of the term passed as a parameter
     */
    public List find(Term headt) {
        if (headt instanceof Struct) {
        	String key = ((Struct) headt).getPredicateIndicator();
        	List list = (List) dynamicDBase.getPredicates(key);
        	if (list.isEmpty())
        		list = (List) staticDBase.getPredicates(key);
        	return list;
        }
        	
        if (headt instanceof Var){
//            List l = new LinkedList();
//            for (Iterator iterator = clauseDBase.iterator(); iterator.hasNext();) {
//                ClauseInfo ci =  (ClauseInfo) iterator.next();
//                if(ci.dynamic)
//                    l.add(ci);
//            }
//            return l;
            throw new RuntimeException();
        }
        return new LinkedList();
    }

    /**
     * Consults a theory.
     *
     * @param theory        theory to add
     * @param dynamicTheory if it is true, then the clauses are marked as dynamic
     * @param libName       if it not null, then the clauses are marked to belong to the specificed library
     */
    public void consult(Theory theory, boolean dynamicTheory, String libName) throws InvalidTheoryException {
    	startGoalStack = new Stack();

    	Iterator it;
		// iterate all clauses in theory and assert them
		for (it = theory.iterator(engine); it.hasNext();) {
			Struct d = (Struct) it.next();
			if (!runDirective(d))
				assertZ(d, dynamicTheory, libName, true);
		}
		
		String error = null;
		
		if (it instanceof TermIterator)
			error = ((TermIterator)it).getParserError();
		if (error != null && error.length() > 0)
			throw new RuntimeException(error);
		if (libName == null)
			lastConsultedTheory.append(theory);
	}

    /**
     * Binds clauses in the database with the corresponding
     * primitive predicate, if any
     */
    void rebindPrimitives() {
        for (Iterator allClauses = dynamicDBase.iterator(); allClauses.hasNext();) {
            ClauseInfo d = (ClauseInfo) allClauses.next();
            for (Iterator itBody = d.getBody().iterator(); itBody.hasNext();)
            	primitiveManager.identifyPredicate((Struct) itBody.next());
        }
    }

    /**
     * Clears the clause dbase.
     */
    public void clear() 
    {
    	dynamicDBase = new ClauseDatabase();
    }

    /**
     * remove all the clauses of lib theory
     */
    void removeLibraryTheory(String libName) {
        for (Iterator allClauses = staticDBase.iterator(); allClauses.hasNext();) {
            ClauseInfo d = (ClauseInfo) allClauses.next();
            if (libName.equals(d.getLibName()))
                allClauses.remove();
        }
    }

    private boolean runDirective(Struct c) {
        if ("':-'".equals(c.getName()) || ":-".equals(c.getName()) && c.getArity() == 1 && c.getTerm(0) instanceof Struct) {
            Struct dir = (Struct) c.getTerm(0);
            try {
            	if (!primitiveManager.evalAsDirective(dir))
                    engine.warn("The directive " + dir.getPredicateIndicator() + " is unknown.");
            } catch (Throwable t) {
                engine.warn("An exception has been thrown during the execution of the " +
            		    dir.getPredicateIndicator() + " directive.\n" + t.getMessage());
            }
            return true;
        }
        return false;
    }

    private Term cloneTermForAssert(Term t)
    {
    	if (t instanceof Struct)
    	{    		
    		Struct s = (Struct)t;
    		Struct r = new Struct(s.getName(), s.getArity());
    		for (int i = 0; i < s.getArity(); i++)
    		{
    			r.setArg(i, cloneTermForAssert(s.getArg(i)));
    		}
    		return r;
    	}
    	else if (t instanceof Var)
    	{
    		Var v = (Var)t;
    		if (v.isBound())
    			return cloneTermForAssert(v.getTerm());
    		else
    		{
	    		try { return new Var(((Var)t).getName()); }
	    		catch (Throwable ex) { throw new RuntimeException(ex); }
    		}
    	}
    	else // the others are all immutable and don't contain any interesting state
    		return t;
    }
    
    /**
     * Gets a clause from a generic Term
     */
    private Struct toClause(Struct t) {
//        try {
            t = (Struct)cloneTermForAssert(t); 
            t.resolveTerm();
            // TODO bad, slow way of cloning. requires approx twice the time necessary            
//            Struct other = (Struct) Term.createTerm(t.toString(), this.engine.getOperatorManager());
//            if (other.getName().indexOf("wordSense") > -1)
//            	System.out.println("parsed wordsnese");
//            t = other;
//        } catch (InvalidTermException e) {
        	// this should never happen
//        } 
        if (!t.isClause())
            t = new Struct(":-", t, new Struct("true"));
        primitiveManager.identifyPredicate(t);
        return t;
    }

    void solveTheoryGoal() {
        Struct s = null;
        while (!startGoalStack.empty()) {
            s = (s == null) ?
                    (Struct) startGoalStack.pop() :
                    new Struct(",", (Struct) startGoalStack.pop(), s);
        }
        if (s != null) {
            try {
                engine.solve(s);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * add a goal eventually defined by last parsed theory.
     */
    void addStartGoal(Struct g) {
        startGoalStack.push(g);
    }

    /**
     * saves the dbase on a output stream.
     */
    boolean save(OutputStream os, boolean onlyDynamic) {
        try {
            new DataOutputStream(os).writeBytes(getTheory(onlyDynamic));
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    /**
     * Gets current theory
     *
     * @param onlyDynamic if true, fetches only dynamic clauses
     */
    public String getTheory(boolean onlyDynamic) {
        StringBuffer buffer = new StringBuffer();
        for (Iterator dynamicClauses = dynamicDBase.iterator(); dynamicClauses.hasNext();) {
            ClauseInfo d = (ClauseInfo) dynamicClauses.next();
            buffer.append(DefaultClauseInfo.toString(d.getClause(), engine.getOperatorManager())).append("\n");
        }
        if (!onlyDynamic)
        	for (Iterator staticClauses = staticDBase.iterator(); staticClauses.hasNext();) {
                ClauseInfo d = (ClauseInfo) staticClauses.next();
                buffer.append(DefaultClauseInfo.toString(d.getClause(), engine.getOperatorManager())).append("\n");
            }
        return buffer.toString();
    }

    /**
     * Gets last consulted theory
     *
     * @return last theory
     */
    Theory getLastConsultedTheory() {
        return lastConsultedTheory;
    }

}