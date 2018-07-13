package org.earthsystemmodeling.cupid.trace.callgraph;

import java.util.ArrayList;
import java.util.List;

import org.earthsystemmodeling.cupid.trace.callstack.NUOPCCtfCallStackAnalysis;
import org.earthsystemmodeling.cupid.trace.statistics.GlobalNode;
import org.earthsystemmodeling.cupid.trace.statistics.ThreadNode;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.tmf.core.model.CommonStatusMessage;
import org.eclipse.tracecompass.tmf.core.model.filters.TimeQueryFilter;
import org.eclipse.tracecompass.tmf.core.model.tree.ITmfTreeDataProvider;
import org.eclipse.tracecompass.tmf.core.response.ITmfResponse;
import org.eclipse.tracecompass.tmf.core.response.TmfModelResponse;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;


public class PerPETStatsDataProvider implements ITmfTreeDataProvider<PerPETStatsTreeDataModel> {

// extends AbstractTreeDataProvider<NUOPCCtfCallStackAnalysis, PerPETStatsTreeDataModel> {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.callgraph.PerPETStatsDataProvider";
	public static final String PERPET = "perpet";
	public static final String GLOBAL = "global";
	
	private NUOPCCtfCallStackAnalysis fAnalysis;
	private String fMode;
	
	public PerPETStatsDataProvider(ITmfTrace trace, @NonNull NUOPCCtfCallStackAnalysis analysisModule, String mode) {
		fAnalysis = analysisModule;
		fMode = mode;
		//super(trace, analysisModule);
	}
		
	@Override
	public String getId() {
		return ID + ":" + fMode;
	}

		
	/*
	
	@Override
	protected List<PerPETStatsTreeDataModel> getTree(ITmfStateSystem ss, TimeQueryFilter filter,
			@Nullable IProgressMonitor monitor) throws StateSystemDisposedException {
		
		List<PerPETStatsTreeDataModel> toRet = new ArrayList<>();
		
		//TODO: need to remove this
		getAnalysisModule().waitForCompletion();
		
		List<ThreadNode> threadNodes = super.getAnalysisModule().getAggregateThreadNodes();
		if (threadNodes.size() < 1) {
			throw new RuntimeException("Error getting thread timings");
		}
		long id = super.getEntryId();
		toRet.add(new PerPETStatsTreeDataModel(id, -1, "threads", threadNodes));
		
		return toRet;
		
	}

	*/
	
	@Override
	public TmfModelResponse<List<PerPETStatsTreeDataModel>> fetchTree(TimeQueryFilter filter,
			@Nullable IProgressMonitor monitor) {
		
		if (monitor == null) monitor = new NullProgressMonitor();
		
		//TODO: this is not ideal to wait for completion here....
		if (fAnalysis.waitForCompletion(monitor)) {
			List<PerPETStatsTreeDataModel> toRet = new ArrayList<>();
			if (fMode.equals(PERPET)) {
				List<ThreadNode> threadNodes = fAnalysis.getAggregateThreadNodes();			
				toRet.add(new PerPETStatsTreeDataModel(-1, -1, "threads", threadNodes));
			}
			else if (fMode.equals(GLOBAL)) {
				GlobalNode gn = fAnalysis.getGlobalStatistics();
				toRet.add(new PerPETStatsTreeDataModel(-1, -1, "global", gn));
			}
			return new TmfModelResponse<>(toRet,
                    ITmfResponse.Status.COMPLETED, CommonStatusMessage.COMPLETED);
		}
		else {
			 return new TmfModelResponse<>(null, ITmfResponse.Status.FAILED, CommonStatusMessage.STATE_SYSTEM_FAILED);
		}
		
	}

}
