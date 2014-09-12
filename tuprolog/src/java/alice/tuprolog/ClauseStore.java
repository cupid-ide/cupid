package alice.tuprolog;

/**
 * <p>
 * A list of clauses belonging to the same family as a goal. A family is
 * composed by clauses with the same functor and arity. The clause store acts
 * as an iterator where each call to the <code>fetch</code> method produces
 * the next clause compatible with the current goal. The current goal and a list
 * of local variables are normally passed to the <code>ClauseStore</code> 
 * implementation during constructions time (see the ClauseStoreFactory interface). 
 * </p>
 */
public interface ClauseStore 
{	
	/**
	 * <p>
	 * Get the next clause compatible with the current goal. As a side-effect,
	 * all variables local to the clause store should be freed and available
	 * for unification again.
	 * </p>
	 */
	ClauseInfo fetch();		
	
	/** 
	 * <p>
	 * Return <code>true</code> if there are more clauses available compatible with 
	 * the current goal and <code>false</code> otherwise. A first call to this
	 * method is equivalent to a call to <code>hasCompatibleClause</code> (since
	 * no variables would have been bound as yet).
	 * </p>
	 */
	boolean haveAlternatives();
	
	/** 
	 * <p>
	 * Return <code>true</code> if there are more clauses compatible with the current
	 * goal, irrespective of local variable bindings.
	 * </p>  
	 */
	boolean hasCompatibleClause();
	
	/**
	 * <p>
	 * Clause the store and free any external resources or caches associated
	 * with it. This method must be implemented by variants that access external
	 * resources such disk or DBMSs. 
	 * </p>
	 * 
	 * <p>
	 * This being a cleanup method, implementations should try not to throw any
	 * exceptions here. It should also be possible to call this method repeatedly
	 * on the same instance without failure.
	 * </p>
	 */
	void close();
}