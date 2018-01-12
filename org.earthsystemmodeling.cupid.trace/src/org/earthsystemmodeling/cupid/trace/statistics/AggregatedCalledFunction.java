/*******************************************************************************
 * Copyright (c) 2016 Ericsson
 *
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.earthsystemmodeling.cupid.trace.statistics;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.common.core.NonNullUtils;

/**
 * This class represents a function call in a certain level in the call stack.
 * It's used to build an aggregation segment tree (aggregated by depth and
 * callers). Per example,the two calls to the function A() in the call graph
 * below will be combined into one node in the generated tree:
 *
 * <pre>
 *   (Depth=0)      main              main
 *               ↓↑  ↓↑   ↓↑    =>   ↓↑   ↓↑
 *   (Depth=1)  A()  B()  A()       A()   B()
 * </pre>
 *
 * @author Sonia Farrah
 *
 */
public class AggregatedCalledFunction implements Cloneable, Serializable {

    // ------------------------------------------------------------------------
    // Attributes
    // ------------------------------------------------------------------------

    /**
	 * 
	 */
	private static final long serialVersionUID = 3778416001544176521L;
	
	private final Object fSymbol;
    private final int fDepth;
    private final int fMaxDepth;
    private final Map<Object, AggregatedCalledFunction> fChildren = new HashMap<>();
    private final @Nullable AggregatedCalledFunction fParent;
    private final AggregatedCalledFunctionStatistics fStatistics;
    private long fDuration = -1;
    private long fSelfTime= -1;
    private final int fProcessId;
    private boolean fForcedToComplete = false;
        
    private final Map<Long, AggregatedCalledFunctionStatistics> fStatisticsMap = new HashMap<>();

    /**
     * Constructor, parent is not null
     *
     * @param calledFunction
     *            called function
     * @param parent
     *            the parent entry
     *
     */
    public AggregatedCalledFunction(AbstractCalledFunction calledFunction, AggregatedCalledFunction parent) {
        fSymbol = calledFunction.getSymbol();
        fDepth = calledFunction.getDepth();
        fProcessId = calledFunction.getProcessId();
        fMaxDepth = parent.getMaxDepth();
        fParent = parent;
        fStatistics = new AggregatedCalledFunctionStatistics();
        if (calledFunction.isComplete()) {
        	complete(calledFunction);
        }
    }

    /**
     * Root constructor, parent is null
     *
     * @param calledFunction
     *            the called function
     * @param maxDepth
     *            the maximum depth
     */
    public AggregatedCalledFunction(AbstractCalledFunction calledFunction, int maxDepth) {
        fSymbol = calledFunction.getSymbol();
        fDepth = calledFunction.getDepth();
        fProcessId = calledFunction.getProcessId();
        fMaxDepth = maxDepth;
        fParent = null;
        fStatistics = new AggregatedCalledFunctionStatistics();
        if (calledFunction.isComplete()) {
        	complete(calledFunction);
        }
        fForcedToComplete = calledFunction.isForcedToComplete();
    }

    /**
     * copy constructor, used by the clone method
     *
     * @param toCopy Object to copy
     */
    private AggregatedCalledFunction(AggregatedCalledFunction toCopy) {
        fSymbol = toCopy.fSymbol;
        for (Entry<Object, AggregatedCalledFunction> entry : toCopy.fChildren.entrySet()) {
          AggregatedCalledFunction child = entry.getValue().clone();
        	fChildren.put(entry.getKey(), child);
        }
        fParent = toCopy.fParent;
        fMaxDepth = toCopy.fMaxDepth;
        fDepth = toCopy.fDepth;
        fStatistics = new AggregatedCalledFunctionStatistics();
        fStatistics.merge(toCopy.fStatistics);
        fProcessId = toCopy.fProcessId;
        fDuration = toCopy.fDuration;
        fSelfTime = toCopy.fSelfTime;
        toCopy.fStatisticsMap.forEach((t,f) -> {
        	AggregatedCalledFunctionStatistics s = new AggregatedCalledFunctionStatistics();
        	s.merge(f);
        	fStatisticsMap.put(t, s);
        });
        fForcedToComplete = toCopy.fForcedToComplete;
    }

    public void saveStatistics(long threadId) {
    	fStatisticsMap.put(threadId, fStatistics);
    	fChildren.values().forEach(c -> {
    		c.saveStatistics(threadId);
    	});
    }
    
    
    /**
     * The function's symbol (address or name)
     *
     * @return The function's symbol
     */
    public Object getSymbol() {
        return fSymbol;
    }

    /**
     * The callees of the function
     *
     * @return The function's callees
     */
    public synchronized Collection<AggregatedCalledFunction> getChildren() {
        return fChildren.values();
    }

    /**
     * The function's caller
     *
     * @return The caller of a function
     */
    public @Nullable AggregatedCalledFunction getParent() {
        return fParent;
    }

    public void complete(AbstractCalledFunction calledFunction) {
    	fDuration = calledFunction.getLength();
    	fSelfTime += calledFunction.getLength() + 1; 
    	fForcedToComplete = calledFunction.isForcedToComplete();
    }
    
    public boolean isComplete() {
    	return fDuration >= 0;
    }
    
   
    /**
     * Add a new callee into the Callees list. If the function exists in the
     * callees list, the new callee's duration will be added to its duration and
     * it'll combine their callees.
     *
     * @param child
     *            The callee to add to this function
     * @param aggregatedChild
     *            The aggregated data of the callee
     */
    public synchronized void addChild(AbstractCalledFunction child, AggregatedCalledFunction aggregatedChild) {
        if ((child != null && !child.isComplete()) || !aggregatedChild.isComplete()) {
        	throw new IllegalArgumentException("Error computing statistics: cannot add incomplete child.");
        }
    	// Update the child's statistics with itself
        fSelfTime -= aggregatedChild.getDuration();
        if (child != null) {
        	aggregatedChild.getFunctionStatistics().update(child);
        }
        AggregatedCalledFunction node = fChildren.get(aggregatedChild.getSymbol());
        if (node == null) {
            fChildren.put(aggregatedChild.getSymbol(), aggregatedChild.clone());
        } else {
            merge(node, aggregatedChild);
            fChildren.replace(node.getSymbol(), node);
        }
    }
    
    /**
     * Assumes statistics on aggregatedChild are already present so
     * it does not require an AbstractCalledFunction and does not
     * update the child's statistics.
     * 
     * @param aggregatedChild
     */
    public synchronized void addChild(AggregatedCalledFunction aggregatedChild) {
    	addChild(null, aggregatedChild);
    }
    
    
    public AggregatedCalledFunction getChild(Object symbol) {
    	return fChildren.get(symbol);
    }

    @Override
    public @NonNull AggregatedCalledFunction clone() {
        // We use a constructor instead of super.clone, otherwise some fields cannot be
        // final 
    	return new AggregatedCalledFunction(this);
    }
    
    

    /**
     * Modify the function's duration
     *
     * @param duration
     *            The amount to increment the duration by
     */
    private void addToDuration(long duration) {
        fDuration += duration;
    }

    /**
     * Merge the callees of two functions.
     *
     * @param firstNode
     *            The first parent secondNode The second parent
     */
    private static void mergeChildren(AggregatedCalledFunction firstNode, AggregatedCalledFunction secondNode) {
        for (Map.Entry<Object, AggregatedCalledFunction> FunctionEntry : secondNode.fChildren.entrySet()) {
            Object childSymbol = NonNullUtils.checkNotNull(FunctionEntry.getKey());
            AggregatedCalledFunction secondNodeChild = NonNullUtils.checkNotNull(FunctionEntry.getValue());
            AggregatedCalledFunction aggregatedCalledFunction = firstNode.fChildren.get(childSymbol);
                        
            if (aggregatedCalledFunction == null) {
                firstNode.fChildren.put(secondNodeChild.getSymbol(), secondNodeChild);
            } else {
                // combine children
                AggregatedCalledFunction firstNodeChild = aggregatedCalledFunction;
                merge(firstNodeChild, secondNodeChild);
                firstNode.fChildren.replace(firstNodeChild.getSymbol(), firstNodeChild);
            }
        }
    }

    /**
     * Merge two functions, add durations, self times, increment the calls,
     * update statistics and merge children.
     *
     * @param destination
     *            the node to merge to
     * @param source
     *            the node to merge
     */
    private static void merge(AggregatedCalledFunction destination, AggregatedCalledFunction source) {
        long sourceDuration = source.getDuration();
        long sourceSelfTime = source.getSelfTime();
        destination.addToDuration(sourceDuration);
        destination.addToSelfTime(sourceSelfTime);
        destination.getFunctionStatistics().merge(source.getFunctionStatistics());
        
        //merge any saved statistics
        source.fStatisticsMap.forEach((t,f) -> {
        	AggregatedCalledFunctionStatistics s = new AggregatedCalledFunctionStatistics();
        	s.merge(f);
        	destination.fStatisticsMap.put(t, s);
        });
        
        //if source was forced to complete, destination is as well
        if (source.isForcedToComplete()) {
        	destination.fForcedToComplete = true;
        }
        
        // merge the children callees.
        mergeChildren(destination, source);
    }

    public boolean isForcedToComplete() {
    	return fForcedToComplete;
    }
    
    /**
     * The function's duration
     *
     * @return The duration of the function
     */
    public long getDuration() {
    	if (!isComplete()) {
    		throw new IllegalStateException("Cannot get duration of incomplete aggregate function.");
    	}
        return fDuration;
    }

    /**
     * The function's depth
     *
     * @return The depth of the function
     */
    public int getDepth() {
        return fDepth;
    }

    /**
     * The depth of the aggregated tree
     *
     * @return The depth of the aggregated tree
     */
    public int getMaxDepth() {
        return fMaxDepth;
    }

    /**
     * The number of calls of a function
     *
     * @return The number of calls of a function
     */
    public long getNbCalls() {
        return fStatistics.getDurationStatistics().getNbElements();
    }

    /**
     * The self time of an aggregated function
     *
     * @return The self time
     */
    public long getSelfTime() {
    	if (!isComplete()) {
    		throw new IllegalStateException("Cannot get self time of incomplete aggregate function.");
    	}
        return fSelfTime;
    }

    /**
     * Add to the self time of an aggregated function
     *
     * @param selfTime
     *            The amount of self time to add
     */
    public void addToSelfTime(long selfTime) {
        fSelfTime += selfTime;
    }

    /**
     * The process ID of the trace application.
     * @return The process Id
     */
    public int getProcessId() {
        return fProcessId;
    }

    /**
     * Returns whether the function has callees.
     *
     * @return Boolean
     */
    public Boolean hasChildren() {
        return !fChildren.isEmpty();
    }

    /**
     * The function's statistics
     *
     * @return The function's statistics
     */
    public AggregatedCalledFunctionStatistics getFunctionStatistics() {
        return fStatistics;
    }
    
    public Map<Long, AggregatedCalledFunctionStatistics> getFunctionStatisticsMap() {
    	return fStatisticsMap;
    }
    

    @Override
    public String toString() {
        return "Aggregate Function: " + getSymbol() + ", Duration: " + getDuration() + ", Self Time: " + fSelfTime + " on " + getNbCalls() + " calls"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
    }
}
