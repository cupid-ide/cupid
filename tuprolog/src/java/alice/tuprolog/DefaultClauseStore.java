package alice.tuprolog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import alice.util.OneWayList;

public class DefaultClauseStore implements ClauseStore
{
	private Prolog engine;
	private OneWayList clauses;
	private Term goal;
	private List vars;
	private boolean haveAlternatives;
	
	
	private DefaultClauseStore(Prolog engine, Term goal, List vars) 
	{
		this.goal = goal;
		this.vars = vars;
		this.engine = engine;
		clauses = null;
	}

	public void close() { /* nothing to do here */ }
	
	/**
	 * Verify if there is a term in compatibleGoals compatible with goal. 
	 * @param goal
	 * @param compGoals
	 * @return true if compatible or false otherwise.
	 */
	public boolean hasCompatibleClause() {
		List saveUnifications = deunify(vars);
		boolean found = checkCompatibility(goal);
		reunify(vars, saveUnifications);
		return found;
	}
	
	
	/**
	 * Salva le unificazioni delle variabili da deunificare
	 * @param varsToDeunify
	 * @return unificazioni delle variabili
	 */
	private List deunify(List varsToDeunify) {
		List saveUnifications = new ArrayList();
		//deunifico le variabili termporaneamente
		Iterator it = varsToDeunify.iterator();
		while (it.hasNext()) {
			Var v = ((Var) it.next());
			saveUnifications.add(v.getLink());
			v.free();
		}
		return saveUnifications;
	}
	
	
	/**
	 * Restore previous unifications into variables.
	 * @param varsToReunify
	 * @param saveUnifications
	 */
	private void reunify(List varsToReunify, List saveUnifications) {
		int size = varsToReunify.size();
		ListIterator it1 = varsToReunify.listIterator(size);
		ListIterator it2 = saveUnifications.listIterator(size);
		// Only the first occurrence of a variable gets its binding saved;
		// following occurrences get a null instead. So, to avoid clashes
		// between those values, and avoid random variable deunification,
		// the reunification is made starting from the end of the list.
		while (it1.hasPrevious()) {
			((Var) it1.previous()).setLink((Term) it2.previous());
		}
	}
	
	
	/**
	 * Verify if a clause exists that is compatible with goal.
	 * As a side effect, clauses that are not compatible get
	 * discarded from the currently examined family.
	 * @param goal
	 */
	private boolean checkCompatibility(Term goal) {
		if (clauses == null) return false;
		ClauseInfo clause = null;
		do {
			clause = (ClauseInfo) clauses.getHead();
			if (goal.match(engine, clause.getHead())) return true;
			clauses = clauses.getTail();
		} while (clauses != null);
		return false;
	}	
	
	/**
	 * Carica una famiglia di clausole
	 * @param familyClauses
	 */
	public static ClauseStore build(Prolog engine, Term goal, List vars, List familyClauses) {
		DefaultClauseStore clauseStore = new DefaultClauseStore(engine, goal, vars);
		clauseStore.clauses = OneWayList.transform(familyClauses);
		if (clauseStore.clauses == null || !clauseStore.hasCompatibleClause())
			return null;
		return clauseStore;
	}
	
	public ClauseInfo fetch() {
		if (clauses == null) return null;
		deunify(vars);
		if (!checkCompatibility(goal))
			return null;
		ClauseInfo clause = (ClauseInfo) clauses.getHead();
		clauses = clauses.getTail();
		haveAlternatives = checkCompatibility(goal);
		return clause;
	}
	
	public boolean haveAlternatives() {
		return haveAlternatives;
	}
	
	public String toString() {
		return "clauses: "+clauses+"\n"+
		"goal: "+goal+"\n"+
		"vars: "+vars+"\n";
	}
	
}
