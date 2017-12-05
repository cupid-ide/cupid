package org.earthsystemmodeling.cupid.trace.callgraph;

import java.util.concurrent.Semaphore;

import org.earthsystemmodeling.cupid.trace.Activator;
import org.earthsystemmodeling.cupid.trace.callstack.NUOPCCtfCallStackAnalysis;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.tracecompass.tmf.core.analysis.IAnalysisModule;


public class NUOPCPerPETGraphTreeView extends AbstractGraphTreeView {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCPerPETGraphTreeView";
	
	private final Semaphore fLock = new Semaphore(1);
    private Job fJob;
    
	public NUOPCPerPETGraphTreeView() {
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
	public AbstractGraphTreeViewer createTreeViewer(Composite parent) {
		return new NUOPCFlameGraphTreeViewer(parent);
	}
	
	public class NUOPCFlameGraphTreeViewer extends AbstractGraphTreeViewer {
		public NUOPCFlameGraphTreeViewer(Composite parent) {
			super(parent, NUOPCPerPETGraphTreeView.this);
		}
	}


}
