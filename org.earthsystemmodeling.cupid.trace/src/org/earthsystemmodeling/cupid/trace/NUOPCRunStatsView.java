package org.earthsystemmodeling.cupid.trace;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystem;
import org.eclipse.tracecompass.statesystem.core.exceptions.AttributeNotFoundException;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateSystemDisposedException;
import org.eclipse.tracecompass.statesystem.core.interval.ITmfStateInterval;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ui.viewers.xycharts.TmfXYChartViewer;
import org.eclipse.tracecompass.tmf.ui.viewers.xycharts.linecharts.TmfCommonXLineChartViewer;
import org.eclipse.tracecompass.tmf.ui.views.TmfChartView;

public class NUOPCRunStatsView extends TmfChartView {

	public NUOPCRunStatsView() {
		super("NUOPC Run Statistics View");
		
	}

	@Override
	protected TmfXYChartViewer createChartViewer(Composite parent) {
		return new NUOPCStatsChartViewer(parent);
		
	}

	public class NUOPCStatsChartViewer extends TmfCommonXLineChartViewer {

		private NUOPCStateSystemAnalysisModule analysisModule;
		
		public NUOPCStatsChartViewer(Composite parent) {
			super(parent, "NUOPC Run Statistics", "Time", "Memory Usage (MB)");
			
						
		}

		@Override
	    protected void initializeDataSource() {
	        ITmfTrace trace = getTrace();
	        if (trace != null) {
	            analysisModule = TmfTraceUtils.getAnalysisModuleOfClass(trace, NUOPCStateSystemAnalysisModule.class, NUOPCStateSystemAnalysisModule.ID);
	            if (analysisModule == null) {
	                return;
	            }
	            analysisModule.schedule();
	        }
	    }
		
		@Override
		protected void updateData(long start, long end, int nb, IProgressMonitor monitor) {
			
			if (getTrace() == null || analysisModule == null) {
	            return;
	        }
	        if (!analysisModule.waitForInitialization()) {
	            return;
	        }
	        ITmfStateSystem ss = analysisModule.getStateSystem();
	        if (ss == null) {
	            return;
	        }
			
			double[] xvalues = getXAxis(start, end, nb);
            setXAxis(xvalues);
            
            boolean complete = false;
            long currentEnd = start;

            final int quarkPhysMemPet, quarkVirtMemPet;
			try {
				quarkPhysMemPet = ss.getQuarkAbsolute("stats", "physMemPet");
				quarkVirtMemPet = ss.getQuarkAbsolute("stats", "virtMemPet");
			} catch (AttributeNotFoundException e1) {
				return;
			}
            
            while (!complete && currentEnd < end) {
                if (monitor != null && monitor.isCanceled()) {
                    return;
                }
                complete = ss.waitUntilBuilt(500);
                currentEnd = ss.getCurrentEndTime();
                long traceStart = getStartTime();
                long traceEnd = getEndTime();
                long offset = this.getTimeOffset();
                
                double yPhysMemPet[] = new double[xvalues.length];
                double yVirtMemPet[] = new double[xvalues.length];
                
                for (int i = 0; i < xvalues.length; i++) {
                    if (monitor != null && monitor.isCanceled()) {
                        return;
                    }
                    double x = xvalues[i];
                    long time = (long) x + offset;
                    time = Math.max(traceStart, time);
                    time = Math.min(traceEnd, time);
                    
                    ITmfStateInterval interval;
					try {
						interval = ss.querySingleState(time, quarkPhysMemPet);
						yPhysMemPet[i] = interval.getStateValue().unboxLong() / 1000.0; //convert to MB
					} catch (StateSystemDisposedException e) {
						yPhysMemPet[i] = 0;
					}
					
					try {
						interval = ss.querySingleState(time, quarkVirtMemPet);
						yVirtMemPet[i] = interval.getStateValue().unboxLong() / 1000.0; //convert to MB
					} catch (StateSystemDisposedException e) {
						yVirtMemPet[i] = 0;
					}
                    
                    
                }
                setSeries("Phys Mem Usage (MB)", yPhysMemPet);
                setSeries("Virtual Mem Usage (MB)", yVirtMemPet);
                
                if (monitor != null && monitor.isCanceled()) {
                    return;
                }
                updateDisplay();
                 
            }
            
		}
	
	}
	

}
