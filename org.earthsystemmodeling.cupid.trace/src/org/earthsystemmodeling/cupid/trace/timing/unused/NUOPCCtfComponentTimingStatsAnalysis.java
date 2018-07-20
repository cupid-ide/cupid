package org.earthsystemmodeling.cupid.trace.timing.unused;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.analysis.timing.core.segmentstore.ISegmentStoreProvider;
import org.eclipse.tracecompass.analysis.timing.core.segmentstore.statistics.AbstractSegmentStatisticsAnalysis;
import org.eclipse.tracecompass.segmentstore.core.ISegment;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ui.analysis.TmfAnalysisViewOutput;

public class NUOPCCtfComponentTimingStatsAnalysis extends AbstractSegmentStatisticsAnalysis {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCCtfComponentTimingStatsAnalysisModule";
    	
	public NUOPCCtfComponentTimingStatsAnalysis() {
		registerOutput(new TmfAnalysisViewOutput(ComponentTimingStatisticsView.ID, NUOPCCtfComponentTimingAnalysis.ID));
	}
	
	@Override
	public String getId() {
		return ID;
	}
	
	@Override
	protected @Nullable String getSegmentType(ISegment segment) {
		if (segment instanceof ComponentPhaseSegment) {
			return ((ComponentPhaseSegment) segment).getComponentName();
		}
		return null;
	}

	@Override
	protected @Nullable ISegmentStoreProvider getSegmentProviderAnalysis(ITmfTrace trace) {
        return TmfTraceUtils.getAnalysisModuleOfClass(trace, NUOPCCtfComponentTimingAnalysis.class, 
        		NUOPCCtfComponentTimingAnalysis.ID);		
	}

}
