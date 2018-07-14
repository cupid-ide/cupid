package org.earthsystemmodeling.cupid.trace.callgraph;

import java.util.ArrayList;
import java.util.List;

import org.earthsystemmodeling.cupid.trace.callstack.NUOPCCtfCallStackAnalysis;
import org.earthsystemmodeling.cupid.trace.statistics.GlobalNode;
import org.earthsystemmodeling.cupid.trace.statistics.ThreadNode;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.tmf.core.model.CommonStatusMessage;
import org.eclipse.tracecompass.tmf.core.model.filters.TimeQueryFilter;
import org.eclipse.tracecompass.tmf.core.model.tree.ITmfTreeDataProvider;
import org.eclipse.tracecompass.tmf.core.response.ITmfResponse;
import org.eclipse.tracecompass.tmf.core.response.ITmfResponse.Status;
import org.eclipse.tracecompass.tmf.core.response.TmfModelResponse;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;


public class TimingStatsDataProvider implements ITmfTreeDataProvider<TimingStatsDataModel> {

// extends AbstractTreeDataProvider<NUOPCCtfCallStackAnalysis, PerPETStatsTreeDataModel> {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.callgraph.TimingStatsDataProvider";
	public static final String PERPET = "perpet";
	public static final String GLOBAL = "global";
	
	private NUOPCCtfCallStackAnalysis fAnalysis;
	private String fMode;
	
	public TimingStatsDataProvider(ITmfTrace trace, @NonNull NUOPCCtfCallStackAnalysis analysisModule, String mode) {
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
	public TmfModelResponse<List<TimingStatsDataModel>> fetchTree(TimeQueryFilter filter,
			@Nullable IProgressMonitor monitor) {
		
		if (monitor != null) {
            fAnalysis.waitForCompletion(monitor);
            if (monitor.isCanceled()) {
                return new TmfModelResponse<>(null, Status.CANCELLED, CommonStatusMessage.TASK_CANCELLED);
            }
        } else {
            fAnalysis.waitForCompletion();
        }
		
		List<TimingStatsDataModel> toRet = new ArrayList<>();
		if (fMode.equals(PERPET)) {
			List<ThreadNode> threadNodes = fAnalysis.getAggregateThreadNodes();			
			toRet.add(new TimingStatsDataModel(-1, -1, "threads", threadNodes));
		}
		else if (fMode.equals(GLOBAL)) {
			GlobalNode gn = fAnalysis.getGlobalStatistics();
			if (gn==null || gn.getChildren().size() < 1) {
				throw new RuntimeException("No global stats");
			}
			toRet.add(new TimingStatsDataModel(-1, -1, "global", gn));
		}
		return new TmfModelResponse<>(toRet,
            ITmfResponse.Status.COMPLETED, CommonStatusMessage.COMPLETED);
		
	}

}
