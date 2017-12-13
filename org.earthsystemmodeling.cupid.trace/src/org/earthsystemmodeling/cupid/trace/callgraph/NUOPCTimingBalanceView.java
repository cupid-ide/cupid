package org.earthsystemmodeling.cupid.trace.callgraph;

import java.util.concurrent.Semaphore;

import org.earthsystemmodeling.cupid.trace.Activator;
import org.earthsystemmodeling.cupid.trace.callstack.NUOPCCtfCallStackAnalysis;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.tracecompass.tmf.core.signal.TmfSignalHandler;
import org.eclipse.tracecompass.tmf.core.signal.TmfTraceSelectedSignal;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceManager;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ui.views.TmfView;

public class NUOPCTimingBalanceView extends TmfView {

    public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCTimingBalanceView";
    
	private static final int[] DEFAULT_WEIGHTS = new int[] { 4, 6 };

	private ITmfTrace fTrace;
    private @Nullable NUOPCStatisticsBalanceChartViewer fBalanceViewer;
    private @Nullable NUOPCGlobalStatisticsTreeViewer fTreeViewer;
    
    private final Semaphore fLock = new Semaphore(1);
    private Job fJob;

    
    public NUOPCTimingBalanceView() {
        super(ID);
    }

    /**
     * Used to keep the table in sync with the density viewer.
     */
    /*
    private final class DataChangedListener implements ISegmentStoreDensityViewerDataListener {

        private void updateTableModel(@Nullable Iterable<? extends ISegment> data) {
            final AbstractSegmentStoreTableViewer viewer = fTableViewer;
            if (viewer != null && data != null) {
                viewer.updateModel(data);
            }
        }

        @Override
        public void viewDataChanged(@NonNull Iterable<? extends @NonNull ISegment> newData) {
            updateTableModel(newData);
        }

        @Override
        public void selectedDataChanged(@Nullable Iterable<? extends @NonNull ISegment> newSelectionData) {
            updateTableModel(newSelectionData);
        }

    }
	*/
    
    @Override
    public void createPartControl(@Nullable Composite parent) {
        super.createPartControl(parent);

        final SashForm sashForm = new SashForm(parent, SWT.NONE);

        fTreeViewer = createStatisticsTreeViewer(sashForm);
        fBalanceViewer = createStatisticsBalanceChartViewer(sashForm);
        fTreeViewer.setBalanceChartViewer(fBalanceViewer);
        
        sashForm.setWeights(DEFAULT_WEIGHTS);

        //Action zoomOut = new ZoomOutAction(this);
        //IToolBarManager toolBar = getViewSite().getActionBars().getToolBarManager();
        //toolBar.add(zoomOut);
        
        ITmfTrace trace = TmfTraceManager.getInstance().getActiveTrace();
        if (trace != null) {
            TmfTraceSelectedSignal signal = new TmfTraceSelectedSignal(this, trace);
            traceSelected(signal);
            //if (fBalanceViewer != null) {
            //    fBalanceViewer.traceSelected(signal);
            //}
            //if (fTreeViewer != null) {
            //    fTreeViewer.traceSelected(signal);
            //}
        }
    }
    
    @TmfSignalHandler
    public void traceSelected(final TmfTraceSelectedSignal signal) {
        fTrace = signal.getTrace();
        if (fTrace != null) {
            NUOPCCtfCallStackAnalysis analysisModule = TmfTraceUtils.getAnalysisModuleOfClass(fTrace, NUOPCCtfCallStackAnalysis.class, NUOPCCtfCallStackAnalysis.ID);
            initializeTreeViewer(analysisModule);
        }
    }
    
    
    protected void initializeTreeViewer(NUOPCCtfCallStackAnalysis analysisModule){
        
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
            getTreeViewer().setInput(null);
            fLock.release();
            return;
        }
        
        getTreeViewer().setInput(null);
        analysisModule.schedule();
        job = new Job("NUOPC Call Stack Analysis") {

            @Override
            protected IStatus run(IProgressMonitor monitor) {
                try {
                    if (monitor.isCanceled()) {
                        return Status.CANCEL_STATUS;
                    }
                    analysisModule.waitForCompletion(monitor);
                    Display.getDefault().asyncExec(() -> {
                        getTreeViewer().setInput(analysisModule.getGlobalStatistics());
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

    protected NUOPCGlobalStatisticsTreeViewer createStatisticsTreeViewer(Composite parent) {
    	return new NUOPCGlobalStatisticsTreeViewer(parent, this);
    }

    protected NUOPCStatisticsBalanceChartViewer createStatisticsBalanceChartViewer(Composite parent) {
    	return new NUOPCStatisticsBalanceChartViewer(parent);
    }

    @Override
    public void setFocus() {
        final NUOPCStatisticsBalanceChartViewer viewer = fBalanceViewer;
        if (viewer != null) {
            viewer.getControl().setFocus();
        }
    }

    @Override
    public void dispose() {
        final NUOPCStatisticsBalanceChartViewer balanceViewer = fBalanceViewer;
        if (balanceViewer != null) {
            balanceViewer.dispose();
        }

        final AbstractStatisticsTreeViewer treeViewer = fTreeViewer;
        if (treeViewer != null) {
            treeViewer.dispose();
        }

        super.dispose();
    }

  
    protected NUOPCStatisticsBalanceChartViewer getBalanceChartViewer() {
        return fBalanceViewer;
    }

   
    protected AbstractStatisticsTreeViewer getTreeViewer() {
        return fTreeViewer;
    }
}