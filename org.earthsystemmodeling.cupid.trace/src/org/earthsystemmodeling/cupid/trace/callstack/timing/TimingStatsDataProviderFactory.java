package org.earthsystemmodeling.cupid.trace.callstack.timing;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.tmf.core.dataprovider.IDataProviderFactory;
import org.eclipse.tracecompass.tmf.core.model.tree.ITmfTreeDataModel;
import org.eclipse.tracecompass.tmf.core.model.tree.ITmfTreeDataProvider;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;

public class TimingStatsDataProviderFactory implements IDataProviderFactory {
	
	
	@Override
	public @Nullable ITmfTreeDataProvider<? extends ITmfTreeDataModel> createProvider(@NonNull ITmfTrace trace,
			@NonNull String secondaryId) {
		//NUOPCCtfCallStackAnalysis analysis = TmfTraceUtils.getAnalysisModuleOfClass(trace, NUOPCCtfCallStackAnalysis.class, NUOPCCtfCallStackAnalysis.ID);
		TimingAnalysis analysis = TmfTraceUtils.getAnalysisModuleOfClass(trace, TimingAnalysis.class, TimingAnalysis.ID);
        if (analysis != null) {
        	return new TimingStatsDataProvider(trace, analysis, secondaryId);
        }
        return null;
	}


	@Override
	public @Nullable ITmfTreeDataProvider<? extends ITmfTreeDataModel> createProvider(@NonNull ITmfTrace trace) {
		return createProvider(trace, TimingStatsDataProvider.PERPET);
	}

}
