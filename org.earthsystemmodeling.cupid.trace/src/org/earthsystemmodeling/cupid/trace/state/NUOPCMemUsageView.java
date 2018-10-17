package org.earthsystemmodeling.cupid.trace.state;

import org.earthsystemmodeling.cupid.trace.PETSelectedSignal;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystem;
import org.eclipse.tracecompass.statesystem.core.exceptions.AttributeNotFoundException;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateSystemDisposedException;
import org.eclipse.tracecompass.statesystem.core.interval.ITmfStateInterval;
import org.eclipse.tracecompass.tmf.core.signal.TmfSignalHandler;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ui.viewers.xycharts.TmfXYChartViewer;
import org.eclipse.tracecompass.tmf.ui.viewers.xycharts.linecharts.TmfCommonXLineChartViewer;
import org.eclipse.tracecompass.tmf.ui.views.TmfChartView;

public class NUOPCMemUsageView extends TmfChartView {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCMemUsageView";
	
	public NUOPCMemUsageView() {
		super("NUOPC Memory Usage View");
		
	}

	@Override
	protected TmfXYChartViewer createChartViewer(Composite parent) {
		return new NUOPCStatsChartViewer(parent);
		
	}

	public class NUOPCStatsChartViewer extends TmfCommonXLineChartViewer {

		private NUOPCCtfStateSystemAnalysisModule analysisModule;
		private long currentPet = 0;
		
		public NUOPCStatsChartViewer(Composite parent) {
			super(parent, "Memory Usage", "Time", "Memory Usage (MB)");
		}
		
		@TmfSignalHandler
		public void handleSignal(PETSelectedSignal signal) {
			//System.out.println(signal.getPet());
			if (currentPet != signal.getPet()) {
				currentPet = signal.getPet();
				setPartName("PET " + currentPet + " Memory Usage");
				refresh();
			}
			//refresh();
		}
		
		@Override
	    protected void initializeDataSource() {
	        ITmfTrace trace = getTrace();
	        if (trace != null) {
	            analysisModule = TmfTraceUtils.getAnalysisModuleOfClass(trace, NUOPCCtfStateSystemAnalysisModule.class, NUOPCCtfStateSystemAnalysisModule.ID);
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
				String pet = String.valueOf(currentPet);
				quarkPhysMemPet = ss.getQuarkAbsolute("mem", pet, "physMem");
				quarkVirtMemPet = ss.getQuarkAbsolute("mem", pet, "virtMem");
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
                
                //CtfTmfTrace t = (CtfTmfTrace) getTrace();
                
                
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
                setSeries("Virt Mem Usage (MB)", yVirtMemPet);
                
                if (monitor != null && monitor.isCanceled()) {
                    return;
                }
                updateDisplay();
                 
            }
            
		}
	
	}
	

}
