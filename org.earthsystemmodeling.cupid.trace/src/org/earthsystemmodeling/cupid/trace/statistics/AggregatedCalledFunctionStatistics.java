/*******************************************************************************
 * Copyright (c) 2016, 2017 Ericsson, École Polytechnique de Montréal
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.earthsystemmodeling.cupid.trace.statistics;

import java.io.Serializable;


/**
 * Class to calculate statistics for an aggregated function.
 *
 * @author Sonia Farrah
 * @author Geneviève Bastien
 */
public class AggregatedCalledFunctionStatistics implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6295453856973835602L;
	
	// Duration statistics will be kept for all calls of the method, so we make
    // them on the called function themselves
    private final IStatistics<ICalledFunction> fDurations;
    // Self time statistics are on aggregated called function because self times
    // are known only at the end, once the aggregation is over
    private final IStatistics<ICalledFunction> fSelfTimes;
    
    //private final Map<String, IStatistics<ICalledFunction>> fSubregionTimes;

        
    /**
     * Use this constructor if an initial set of stats are available.
     * 
     * @param initialStats
     */
    public AggregatedCalledFunctionStatistics(IStatistics<ICalledFunction> initialStats) {
    	this();
    	fDurations.merge(initialStats);
    	fSelfTimes.merge(initialStats);
    }
    
    public AggregatedCalledFunctionStatistics() {
    	fDurations = new Statistics<>(f -> f.getLength());
        fSelfTimes = new Statistics<>(f -> f.getSelfTime());
        //fSubregionTimes = new HashMap<String, IStatistics<ICalledFunction>>();
        //for (int i=0; i<subregions.length; i++) {
        //	final int ii = i;
        //	fSubregionTimes.put(subregions[i], new Statistics<ICalledFunction>(f -> f.getSubregionTime(subregions[ii])));
        //}
    }

    /**
     * Update the durations and self time statistics for a function. This
     * function should be called only once all the children of the function have
     * been assigned and the self time will not change anymore, otherwise, the
     * results will not be accurate for self times.
     *
     * @param function
     *            The function to add statistics for
     */
    public void update(ICalledFunction function) {
        fDurations.update(function);
        fSelfTimes.update(function);
        //for (IStatistics<ICalledFunction> s : fSubregionTimes.values()) {
        //	s.update(function);
        //}
    }

    /**
     * Update the statistics, this is used while merging nodes for the
     * aggregation tree.
     *
     * @param statisticsNode
     *            The statistics node to be merged
     */
    public void merge(AggregatedCalledFunctionStatistics statisticsNode) {
        fDurations.merge(statisticsNode.fDurations);
        fSelfTimes.merge(statisticsNode.fSelfTimes);
        //for (Entry<String, IStatistics<ICalledFunction>> e : fSubregionTimes.entrySet()) {
        //	String subregion = e.getKey();
        //	//only merge if other node contains subregion
        //	if (statisticsNode.fSubregionTimes.containsKey(subregion)) {        		
        //		e.getValue().merge(statisticsNode.fSubregionTimes.get(subregion));
        //	}
        //}
    }

    /**
     * Get the statistics for the duration of the called functions
     *
     * @return The durations statistics
     */
    public IStatistics<ICalledFunction> getDurationStatistics() {
        return fDurations;
    }

    /**
     * Get the statistics for the self times of the called functions
     *
     * @return The self time statistics
     */
    public IStatistics<ICalledFunction> getSelfTimeStatistics() {
        return fSelfTimes;
    }
    
    //public IStatistics<ICalledFunction> getSubregionStatistics(String subregion) {
    //	return fSubregionTimes.getOrDefault(subregion, new Statistics<>());
    //}

    @Override
    public String toString() {
        return "Aggregated function statistics: Durations: " + fDurations + ", Self times " + fSelfTimes; //$NON-NLS-1$//$NON-NLS-2$
    }

}
