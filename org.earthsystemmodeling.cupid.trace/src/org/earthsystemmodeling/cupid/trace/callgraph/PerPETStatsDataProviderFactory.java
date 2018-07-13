package org.earthsystemmodeling.cupid.trace.callgraph;

import org.earthsystemmodeling.cupid.trace.callstack.NUOPCCtfCallStackAnalysis;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.tmf.core.dataprovider.IDataProviderFactory;
import org.eclipse.tracecompass.tmf.core.model.tree.ITmfTreeDataModel;
import org.eclipse.tracecompass.tmf.core.model.tree.ITmfTreeDataProvider;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;

public class PerPETStatsDataProviderFactory implements IDataProviderFactory {

	public final static String ID = "org.earthsystemmodeling.cupid.trace.callgraph.PerPETStatsDataProviderFactory";
		
	
	@Override
	public @Nullable ITmfTreeDataProvider<? extends ITmfTreeDataModel> createProvider(@NonNull ITmfTrace trace,
			@NonNull String secondaryId) {
		NUOPCCtfCallStackAnalysis analysis = TmfTraceUtils.getAnalysisModuleOfClass(trace, NUOPCCtfCallStackAnalysis.class, NUOPCCtfCallStackAnalysis.ID);
        if (analysis != null) {
        	return new PerPETStatsDataProvider(trace, analysis, secondaryId);
        }
        return null;
	}


	@Override
	public @Nullable ITmfTreeDataProvider<? extends ITmfTreeDataModel> createProvider(@NonNull ITmfTrace trace) {
		return createProvider(trace, PerPETStatsDataProvider.PERPET);
	}

}
