
package org.earthsystemmodeling.cupid.trace.statistics;

/**
 * This class represents the global call graph statistics across all threads.
 *
 */
public class GlobalNode extends AggregatedCalledFunction {

    
    /**
	 * 
	 */
	private static final long serialVersionUID = -4564680095442529408L;

	/**
     * @param calledFunction
     *            the called function
     * @param maxDepth
     *            The maximum depth
     * @param id
     *            The thread id
     */
    public GlobalNode(AbstractCalledFunction calledFunction, int maxDepth) {
        super(calledFunction, maxDepth);
    }

	
}
