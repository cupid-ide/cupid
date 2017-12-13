package org.earthsystemmodeling.cupid.trace.callgraph;

import java.util.Comparator;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.segmentstore.core.ISegment;
import org.eclipse.tracecompass.tmf.core.segment.ISegmentAspect;

public class PETAspect implements ISegmentAspect {
	
    public static final ISegmentAspect PET_ASPECT = new PETAspect();
	
	@Override
	public String getName() {
		return "PET";				
	}

	@Override
	public String getHelpText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public @Nullable Comparator<?> getComparator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public @Nullable Object resolve(ISegment segment) {
		//if (segment instanceof AggregatedFunctionSegment) {
		//	return ((AggregatedFunctionSegment) segment).getThreadId();
		//}
		return null;
	}

}
