package org.earthsystemmodeling.cupid.trace.callgraph;

import java.util.List;
import java.util.concurrent.Semaphore;

import org.earthsystemmodeling.cupid.trace.Activator;
import org.earthsystemmodeling.cupid.trace.callstack.NUOPCCtfCallStackAnalysis;
import org.earthsystemmodeling.cupid.trace.statistics.ThreadNode;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.tracecompass.analysis.timing.core.segmentstore.SegmentStoreStatisticsModel;
import org.eclipse.tracecompass.analysis.timing.core.segmentstore.statistics.AbstractSegmentStatisticsAnalysis;
import org.eclipse.tracecompass.internal.analysis.timing.core.segmentstore.SegmentStoreStatisticsDataProvider;
import org.eclipse.tracecompass.tmf.core.analysis.IAnalysisModule;
import org.eclipse.tracecompass.tmf.core.analysis.TmfAbstractAnalysisModule;
import org.eclipse.tracecompass.tmf.core.dataprovider.DataProviderManager;
import org.eclipse.tracecompass.tmf.core.model.filters.FilterTimeQueryFilter;
import org.eclipse.tracecompass.tmf.core.model.tree.ITmfTreeDataProvider;
import org.eclipse.tracecompass.tmf.core.response.ITmfResponse;
import org.eclipse.tracecompass.tmf.core.response.TmfModelResponse;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.ITmfTreeViewerEntry;


public class NUOPCPerPETStatisticsTreeView extends AbstractStatisticsTreeView {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCPerPETStatisticsTreeView";
		
	//private final Semaphore fLock = new Semaphore(1);
    //private Job fJob;
    
	public NUOPCPerPETStatisticsTreeView() {
		super(ID, NUOPCCtfCallStackAnalysis.class, NUOPCCtfCallStackAnalysis.ID);
	}
	
	/*
	@Override
	public void initializeViewer(IAnalysisModule analysisModule){
        
		Job job = fJob;
        if (job != null) {
            job.cancel();
        }
        try {
            fLock.acquire();
        } catch (InterruptedException e) {
            Activator.logWarning(e.getMessage(), e);
            fLock.release();
        }
        if (analysisModule == null) {
            getViewer().setInput(null);
            fLock.release();
            return;
        }
        
        NUOPCCtfCallStackAnalysis callStackAnalysis = (NUOPCCtfCallStackAnalysis) analysisModule;        
        getViewer().setInput(callStackAnalysis.getAggregateThreadNodes());
        callStackAnalysis.schedule();
        job = new Job("NUOPC Call Stack Analysis") {

            @Override
            protected IStatus run(IProgressMonitor monitor) {
                try {
                    if (monitor.isCanceled()) {
                        return Status.CANCEL_STATUS;
                    }
                    callStackAnalysis.waitForCompletion(monitor);
                    Display.getDefault().asyncExec(() -> {
                        getViewer().setInput(callStackAnalysis.getAggregateThreadNodes());
                     });
                    return Status.OK_STATUS;
                } finally {
                    fJob = null;
                    fLock.release();
                }
            }
        };
        fJob = job;
        job.schedule();
    }
	*/
	
	
	@Override
	public AbstractStatisticsTreeViewer createTreeViewer(Composite parent) {
		return new NUOPCFlameGraphTreeViewer(parent);
	}
	
	public class NUOPCFlameGraphTreeViewer extends AbstractStatisticsTreeViewer {
		
		//private List<ThreadNode> fThreadNodes;
		
		public NUOPCFlameGraphTreeViewer(Composite parent) {
			super(parent, NUOPCPerPETStatisticsTreeView.this);
		}

		
		@Override
		protected ITmfTreeViewerEntry updateElements(@NonNull ITmfTrace trace, long start, long end, boolean isSelection) {

			if (isSelection) {
				return null;
			}

			ITmfTreeDataProvider<PerPETStatsTreeDataModel> provider = null;

			provider = DataProviderManager.getInstance().getDataProvider(trace,
					PerPETStatsDataProvider.ID + ":" + PerPETStatsDataProvider.PERPET, PerPETStatsDataProvider.class);

			if (provider == null) {
				return null;
			}

			FilterTimeQueryFilter filter = new FilterTimeQueryFilter(start, end, 2, isSelection);
			TmfModelResponse<List<PerPETStatsTreeDataModel>> response = provider.fetchTree(filter, null);
			@Nullable List<PerPETStatsTreeDataModel> model = response.getModel();
			
			if (model == null) {
				return null;
			}
			if (model.size() == 0) {
				return null;
			}

			ITmfTreeViewerEntry root = new RootEntry(model.get(0).getThreadNodes());
			return root;

		}
	}


}
