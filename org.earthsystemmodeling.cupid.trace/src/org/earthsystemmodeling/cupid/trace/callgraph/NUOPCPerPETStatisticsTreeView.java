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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.tracecompass.tmf.core.analysis.IAnalysisModule;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.ITmfTreeViewerEntry;


public class NUOPCPerPETStatisticsTreeView extends AbstractStatisticsTreeView {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCPerPETStatisticsTreeView";
		
	private final Semaphore fLock = new Semaphore(1);
    private Job fJob;
    
	public NUOPCPerPETStatisticsTreeView() {
		super(ID, NUOPCCtfCallStackAnalysis.class, NUOPCCtfCallStackAnalysis.ID);
	}
	
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
	
	
	@Override
	public AbstractStatisticsTreeViewer createTreeViewer(Composite parent) {
		return new NUOPCFlameGraphTreeViewer(parent);
	}
	
	public class NUOPCFlameGraphTreeViewer extends AbstractStatisticsTreeViewer {
		
		private List<ThreadNode> fThreadNodes;
		
		public NUOPCFlameGraphTreeViewer(Composite parent) {
			super(parent, NUOPCPerPETStatisticsTreeView.this);
		}

		@SuppressWarnings("unchecked")
		@Override
		public void setInput(Object input) {
			if (input == null) {
				fThreadNodes = null;
			}
			else if (input instanceof List<?>) {
				fThreadNodes = (List<ThreadNode>) input;
				updateContent(getWindowStartTime(), getWindowEndTime(), false);
			}
			else {
				throw new IllegalArgumentException();
			}
		}

		@Override
		protected ITmfTreeViewerEntry updateElements(long start, long end, boolean isSelection) {
			if (isSelection) {
				return null;
			}			
			ITmfTreeViewerEntry root = new RootEntry(fThreadNodes);
			return root;
		}
	}


}
