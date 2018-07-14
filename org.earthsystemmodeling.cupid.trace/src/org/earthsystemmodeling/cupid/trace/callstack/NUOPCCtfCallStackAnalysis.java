package org.earthsystemmodeling.cupid.trace.callstack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.trace.callgraph.NUOPCPerPETStatisticsTreeView;
import org.earthsystemmodeling.cupid.trace.callgraph.NUOPCTimingBalanceView;
import org.earthsystemmodeling.cupid.trace.state.NUOPCCtfStateSystemAnalysisModule;
import org.earthsystemmodeling.cupid.trace.statistics.AbstractCalledFunction;
import org.earthsystemmodeling.cupid.trace.statistics.AggregatedCalledFunction;
import org.earthsystemmodeling.cupid.trace.statistics.CalledFunctionFactory;
import org.earthsystemmodeling.cupid.trace.statistics.GlobalNode;
import org.earthsystemmodeling.cupid.trace.statistics.IGlobalStatisticsProvider;
import org.earthsystemmodeling.cupid.trace.statistics.ThreadNode;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.analysis.profiling.core.callstack.CallStackAnalysis;
import org.eclipse.tracecompass.tmf.core.analysis.IAnalysisModule;
import org.eclipse.tracecompass.tmf.core.analysis.IAnalysisOutput;
import org.eclipse.tracecompass.tmf.core.exceptions.TmfAnalysisException;
import org.eclipse.tracecompass.tmf.core.statesystem.ITmfStateProvider;
import org.eclipse.tracecompass.tmf.core.statistics.TmfStatisticsModule;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceManager;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ctf.core.trace.CtfTmfTrace;
import org.eclipse.tracecompass.tmf.ui.analysis.TmfAnalysisViewOutput;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class NUOPCCtfCallStackAnalysis extends CallStackAnalysis implements IGlobalStatisticsProvider {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCCtfCallStackAnalysis";
	
	private List<ThreadNode> fThreadNodes = new ArrayList<ThreadNode>();
	private IProgressMonitor fMonitor;
	
	@Override
	public IStatus schedule() {
		// TODO Auto-generated method stub
		return super.schedule();
	}

		
    @Override
    public boolean setTrace(ITmfTrace trace) throws TmfAnalysisException {
        if (!(trace instanceof CtfTmfTrace)) {
            return false;
        }
        return super.setTrace(trace);
    }

    @Override
	public CtfTmfTrace getTrace() {
       return (CtfTmfTrace) super.getTrace();
    }

    @Override
    protected ITmfStateProvider createStateProvider() {    	
    	return NUOPCCtfCallStackStateProvider.newInstance(getTrace(), this);
    }
        
    @Override
    protected Iterable<IAnalysisModule> getDependentAnalyses() {   	
    	return Lists.newArrayList(
    			TmfTraceUtils.getAnalysisModuleOfClass(getTrace(), NUOPCCtfStateSystemAnalysisModule.class, NUOPCCtfStateSystemAnalysisModule.ID),
    			TmfTraceUtils.getAnalysisModuleOfClass(getTrace(), TmfStatisticsModule.class, TmfStatisticsModule.ID));
    }
    
    protected long getExpectedNumberOfEvents() {
    	TmfStatisticsModule module = TmfTraceUtils.getAnalysisModuleOfClass(getTrace(), TmfStatisticsModule.class, TmfStatisticsModule.ID);
    	if (module != null) {
    		module.schedule();
    		if (module.waitForCompletion(fMonitor)) {
    			return module.getStatistics().getEventsTotal();
    		}
    	}
    	return 0;
    }
    
    public IProgressMonitor getProgressMonitor() {
    	return fMonitor != null ? fMonitor : new NullProgressMonitor();
    }

    @Override
    protected boolean executeAnalysis(@Nullable IProgressMonitor monitor) {    	
    	fThreadNodes.clear();
    	fMonitor = monitor;
    	boolean success = super.executeAnalysis(monitor);
    	fMonitor = null;
    	if (success) {
    		if (getBackendType() == StateSystemBackendType.FULL) {
    			
    			/* analysis produced a new set of statistics, so cache to file */
    			if (fThreadNodes.size() > 0) {
    				FileOutputStream fos = null;
					try {
						fos = new FileOutputStream(getPerPetStatsFile());
					} catch (FileNotFoundException e) {
						CupidActivator.log("Error writing per pet statistics to file", e);					
						return false;
					}
    	            try {
						ObjectOutputStream out = new ObjectOutputStream(fos);
						out.writeInt(fThreadNodes.size());
						for (ThreadNode node : fThreadNodes) {
							out.writeObject(node);
						}
						out.close();
						fos.close();
					} catch (IOException e) {
						CupidActivator.log("Error writing per pet statistics to file", e);
						return false;
					}   	            
    			}
    			/* if stats file exists, read it in */
    			else if (getPerPetStatsFile().exists()) {
    				FileInputStream fis = null;
					try {
						fis = new FileInputStream(getPerPetStatsFile());
					} catch (FileNotFoundException e) {
						CupidActivator.log("Error reading per pet statistics from file", e);
						return false;
					}
    				ObjectInputStream in = null;
					try {
						in = new ObjectInputStream(fis);
					} catch (IOException e) {
						CupidActivator.log("Error reading per pet statistics from file", e);
						try {
							fis.close();
						} catch (IOException e1) {
							//ignore
						}
						return false;
					}

    				try {
						int size = in.readInt();
						for (int i = 0; i < size; i++) {
	    					ThreadNode node = (ThreadNode) in.readObject();
	    					fThreadNodes.add(node);
	    				}
						in.close();
						fis.close();
					} catch (IOException | ClassNotFoundException e) {
						CupidActivator.log("Error reading per pet statistics from file", e);
						fThreadNodes.clear();
						return false;
					}
    			}
    		}
    	}
    	return success;
    }
    
    private @Nullable File getPerPetStatsFile() {
        ITmfTrace trace = getTrace();
        if (trace == null) {
            return null;
        }
        String directory = TmfTraceManager.getSupplementaryFileDir(trace);
        File file = new File(directory + "perpet.stats");
        return file;
    }  
        
    public List<ThreadNode> getAggregateThreadNodes() {
        synchronized(fThreadNodes) {
        	return ImmutableList.copyOf(fThreadNodes);
        }	
    }
    
    protected void addThreadNode(ThreadNode node) {
    	synchronized(fThreadNodes) {
    		fThreadNodes.add(node);
    	}
    }
   
    
    @Override
    public Iterable<IAnalysisOutput> getOutputs() {
    	return ImmutableList.of(new TmfAnalysisViewOutput(NUOPCCallStackView.ID), 
    							new TmfAnalysisViewOutput(NUOPCPerPETStatisticsTreeView.ID),
    							//new TmfAnalysisViewOutput(NUOPCGlobalStatisticsTreeView.ID), 
    							new TmfAnalysisViewOutput(NUOPCTimingBalanceView.ID));    	
    }

	@Override
	public GlobalNode getGlobalStatistics() {
		synchronized(fThreadNodes) {
			AbstractCalledFunction initSegment = CalledFunctionFactory.create(0, 0, 0, "root", -1, null);
    		GlobalNode init = new GlobalNode(initSegment, 0);
    		for (ThreadNode node : fThreadNodes) {
    			for (AggregatedCalledFunction aggFunc : node.getChildren()) {
    				AggregatedCalledFunction aggFuncClone = aggFunc.clone();
    				aggFuncClone.saveStatistics(node.getId());
    				init.addChild(aggFuncClone);
    			}
    		}
    		return init;
		}
	}

	
    
    
  /*  
	@Override
	public void removeListener(IAnalysisProgressListener listener) {
		// TODO Auto-generated method stub
	}

	@Override
	public Iterable<ISegmentAspect> getSegmentAspects() {
		return ImmutableList.of(PETAspect.PET_ASPECT);
	}

	@Override
	public @Nullable ISegmentStore<ISegment> getSegmentStore() {
		ISegmentStore<ISegment> store = SegmentStoreFactory.createSegmentStore(SegmentStoreType.Fast);		
		for (ThreadNode node : fThreadNodes) {
			for (AggregatedCalledFunction child : node.getChildren()) {
				store.add(new AggregatedFunctionSegment(child, node.getId()));
			}
		}
		return store;
	}

	@Override
	public void addListener(IAnalysisProgressListener listener) {
		// TODO Auto-generated method stub
	}
	
	public static class AggregatedFunctionSegment implements INamedSegment {

		private final AggregatedCalledFunction fFunction;
		private final long fThreadId;
		
		private static final long serialVersionUID = 1559969863958229959L;
		
		public AggregatedFunctionSegment(AggregatedCalledFunction function, long threadId) {
			fFunction = function;
			fThreadId = threadId;
		}

		@Override
		public long getStart() {
			return 0;
		}

		@Override
		public long getEnd() {
			return 0;
		}

		@Override
		public String getName() {
			return fFunction.getSymbol().toString();
		}

		public AggregatedCalledFunction getFunction() {
			return fFunction;
		}
		
		public long getThreadId() {
			return fThreadId;
		}
		
	}
    */
    
    

}

