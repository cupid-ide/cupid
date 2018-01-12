/*******************************************************************************
 * Copyright (c) 2016 Ericsson
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.earthsystemmodeling.cupid.trace.statistics;

import static org.eclipse.tracecompass.common.core.NonNullUtils.checkNotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import org.earthsystemmodeling.cupid.trace.callgraph.SymbolAspect;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.common.core.NonNullUtils;
import org.eclipse.tracecompass.segmentstore.core.ISegment;
import org.eclipse.tracecompass.segmentstore.core.SegmentComparators;

import com.google.common.collect.Ordering;

/**
 * Called Functuon common class, defines the start, end, depth, parent and
 * children. Does not define the symbol
 *
 * @author Matthew Khouzam
 * @author Sonia Farrah
 */
public abstract class AbstractCalledFunction implements ICalledFunction {

    static final Comparator<ISegment> COMPARATOR;
    static {
        /*
         * checkNotNull() has to be called separately, or else it breaks the
         * type inference.
         */
        Comparator<ISegment> comp = Ordering.from(SegmentComparators.INTERVAL_START_COMPARATOR).compound(SegmentComparators.INTERVAL_END_COMPARATOR);
        COMPARATOR = checkNotNull(comp);
    }

    /**
     * Serial Version UID
     */
    private static final long serialVersionUID = 7992199223906717340L;

    protected final long fStart;
    protected long fEnd = -1;
    protected final int fDepth;
    private final List<ICalledFunction> fChildren = new ArrayList<>();
    private final @Nullable ICalledFunction fParent;
    protected long fSelfTime = 0;
    private final int fProcessId;
    
    //this is true if the original trace was incomplete
    //and the region was forced to complete
    private boolean fForcedToComplete = false;

    //allow creating without knowing end time
    public AbstractCalledFunction(long start, int depth, int processId, @Nullable ICalledFunction parent) {
    	fStart = start;
        fDepth = depth;
        fParent = parent;
        fProcessId = processId;
    }
    
    public AbstractCalledFunction(long start, long end, int depth, int processId, @Nullable ICalledFunction parent) {
        this(start, depth, processId, parent);
        complete(end);
    }
    
    @Override
    public void complete(long end) {
    	if (fStart > end) {
            throw new IllegalArgumentException("Time error:" + "[" + fStart + "," + end + "]"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        }
    	fEnd = end;
    	fSelfTime = fEnd - fStart;
    }
    
    public void setForcedToComplete(boolean forcedToComplete) {
    	fForcedToComplete = forcedToComplete;
    }
    
    public boolean isForcedToComplete() {
    	return fForcedToComplete;
    }
    
    @Override
    public boolean isComplete() {
    	return fEnd >= 0;
    }

    @Override
    public long getStart() {
        return fStart;
    }

    @Override
    public long getEnd() {
    	if (!isComplete()) {
    		throw new IllegalStateException("Cannot get end time of incomplete AbstractCalledFunction.");
    	}
        return fEnd;
    }

    @Override
    public long getLength() {
    	if (!isComplete()) {
    		throw new IllegalStateException("Cannot get length (duration) of incomplete AbstractCalledFunction.");
    	}
    	else {
    		return getEnd() - getStart();
    	}
    }
    
    @Override
    public List<ICalledFunction> getChildren() {
        return fChildren;
    }

    @Override
    public @Nullable ICalledFunction getParent() {
        return fParent;
    }

    @Override
    public String getName() {
        return NonNullUtils.nullToEmptyString(SymbolAspect.SYMBOL_ASPECT.resolve(this));
    }

    /**
     * Add the child to the segment's children, and subtract the child's
     * duration to the duration of the segment so we can calculate its self
     * time.
     *
     * @param child
     *            The child to add to the segment's children
     */
    public void addChild(ICalledFunction child) {
        if (child.getParent() != this) {
            throw new IllegalArgumentException("Child parent not the same as child being added to."); //$NON-NLS-1$
        }
        fChildren.add(child);
        substractChildDuration(child.getEnd() - child.getStart());
    }

    /**
     * Subtract the child's duration to the duration of the segment.
     *
     * @param childDuration
     *            The child's duration
     */
    private void substractChildDuration(long childDuration) {
        fSelfTime -= childDuration;
    }

    @Override
    public long getSelfTime() {
    	if (!isComplete()) {
    		throw new IllegalStateException("Cannot get self time of incomplete AbstractCalledFunction.");
    	}
        return fSelfTime;
    }

    @Override
    public int getDepth() {
        return fDepth;
    }

    @Override
    public int getProcessId() {
        return fProcessId;
    }

    @Override
    public int compareTo(@Nullable ISegment o) {
        if (o == null) {
            throw new IllegalArgumentException();
        }
        return COMPARATOR.compare(this, o);
    }

    @Override
    public String toString() {
        return '[' + String.valueOf(fStart) + ", " + String.valueOf(fEnd) + ']' + " Duration: " + getLength() + ", Self Time: " + fSelfTime; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    }

    @Override
    public int hashCode() {
        return Objects.hash(fDepth, fEnd, fParent, fSelfTime, fStart, getSymbol());
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AbstractCalledFunction other = (AbstractCalledFunction) obj;
        if (fDepth != other.fDepth) {
            return false;
        }
        if (fEnd != other.fEnd) {
            return false;
        }
        if (fSelfTime != other.fSelfTime) {
            return false;
        }
        if (fStart != other.fStart) {
            return false;
        }
        if (!Objects.equals(fParent, other.getParent())) {
            return false;
        }
        if (!Objects.equals(getSymbol(), other.getSymbol())) {
            return false;
        }
        return true;
    }

}