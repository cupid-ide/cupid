package org.earthsystemmodeling.cupid.trace.callstack.timing;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.earthsystemmodeling.cupid.trace.Activator;
import org.earthsystemmodeling.cupid.trace.ESMFRegionId;
import org.earthsystemmodeling.cupid.trace.NUOPCCtfTrace;
import org.earthsystemmodeling.cupid.trace.callstack.NUOPCCtfCallStackStateProvider;
import org.earthsystemmodeling.cupid.trace.state.NUOPCCtfStateSystemAnalysisModule;
import org.earthsystemmodeling.cupid.trace.statistics.AbstractCalledFunction;
import org.earthsystemmodeling.cupid.trace.statistics.AggregatedCalledFunction;
import org.earthsystemmodeling.cupid.trace.statistics.CalledFunctionFactory;
import org.earthsystemmodeling.cupid.trace.statistics.ThreadNode;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.statesystem.AbstractTmfStateProvider;
import org.eclipse.tracecompass.tmf.core.statesystem.ITmfStateProvider;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ctf.core.CtfEnumPair;
import org.eclipse.tracecompass.tmf.ctf.core.event.CtfTmfEvent;

public class TimingStateProvider extends AbstractTmfStateProvider {
	
	private static final @NonNull String NAME = "Timings"; //$NON-NLS-1$

	private TimingAnalysis fAnalysis;
	private NUOPCCtfStateSystemAnalysisModule fStateAnalysis;
	
	private long fEventCount = 0;
	private IProgressMonitor fMonitor = null;
	private long fTotalWork = 1;
	private long fWorkIncrement = 1;
	private Map<Long, Deque<AbstractCalledFunction>> fThreadCallStacks = new HashMap<>();
	private Map<Long, Deque<AggregatedCalledFunction>> fThreadAggStacks = new HashMap<>();
	private List<ThreadNode> fThreadNodes = new ArrayList<ThreadNode>();
	long fTimestamp = 0;
	
	public TimingStateProvider(@NonNull ITmfTrace trace, @NonNull TimingAnalysis analysis) {
		super(trace, NAME);
		fAnalysis = analysis;
		fStateAnalysis = TmfTraceUtils.getAnalysisModuleOfClass(trace, 
				NUOPCCtfStateSystemAnalysisModule.class, NUOPCCtfStateSystemAnalysisModule.ID);
	}

	@Override
	public int getVersion() {
		return NUOPCCtfTrace.ANALYSES_VERSION;
	}

	@Override
	public ITmfStateProvider getNewInstance() {
		return new TimingStateProvider(this.getTrace(), fAnalysis);
	}

	@Override
	protected void eventHandle(ITmfEvent event) {
	
		fEventCount++;
		
		if (fMonitor == null) {
			fTotalWork = fAnalysis.getExpectedNumberOfEvents();
			fWorkIncrement = (fTotalWork / 1000) + 1;
			fMonitor = SubMonitor.convert(fAnalysis.getProgressMonitor(), 1000);
		}
		if (fEventCount % fWorkIncrement == 0) {
			fMonitor.worked(1);			
		}
		
		int processId = 0;
		
		String regionEntryName = regionEntry(event);
		if (regionEntryName != null) {
			
			fTimestamp = event.getTimestamp().toNanos();
			
			long threadId = getThreadId(event);
			String threadName = Long.toString(threadId);
			
			Deque<AbstractCalledFunction> threadCallStack = fThreadCallStacks.get(threadId);
			Deque<AggregatedCalledFunction> threadAggStack = fThreadAggStacks.get(threadId);
			if (threadCallStack == null) {
				AbstractCalledFunction initSegment = CalledFunctionFactory.create(0, 0, 0, threadName, processId, null);
	            ThreadNode init = new ThreadNode(initSegment, 0, threadId);
				fThreadNodes.add(init);
	            
				threadCallStack = new ArrayDeque<AbstractCalledFunction>(10);
				fThreadCallStacks.put(threadId, threadCallStack);
				
				threadAggStack = new ArrayDeque<AggregatedCalledFunction>(10);
				fThreadAggStacks.put(threadId, threadAggStack);
				threadAggStack.push(init);
			}
			
			int depth = threadCallStack.size();
			AbstractCalledFunction calledFunction = 
					CalledFunctionFactory.create(fTimestamp, depth, regionEntryName, processId, threadCallStack.peek());
            threadCallStack.push(calledFunction);
            
            AggregatedCalledFunction aggFunction = new AggregatedCalledFunction(calledFunction, threadAggStack.peek());
            threadAggStack.push(aggFunction);
            
            return;
		}
		
		String regionExitName = regionExit(event);
		if (regionExitName != null) {
			
			fTimestamp = event.getTimestamp().toNanos();
			long threadId = getThreadId(event);
			
			AbstractCalledFunction calledFunction = fThreadCallStacks.get(threadId).pop();
			calledFunction.complete(fTimestamp);
			//calledFunction.addToSubregionTime("mpi", totalTimeMPI);
			
			AggregatedCalledFunction aggFunction = fThreadAggStacks.get(threadId).pop();
			aggFunction.complete(calledFunction);
			if (!calledFunction.getSymbol().equals(aggFunction.getSymbol())) {
				throw new IllegalStateException("Error computing statistics: called and aggregate functions do not match");
			}
			
			///// ADD MPI REGION
			//if (totalTimeMPI > 0) {
			//	IStatistics<ICalledFunction> mpiStats = new Statistics<>(totalTimeMPI, totalCountMPI);
			//	AggregatedCalledFunction aggMPI = new AggregatedCalledFunction("__MPI", mpiStats, aggFunction);
			//	aggFunction.addChild(aggMPI);
			//}
							
			fThreadAggStacks.get(threadId).peek().addChild(calledFunction, aggFunction);
			
			while (!calledFunction.getName().equals(regionExitName)) {
				
				Activator.logWarning("Timing region was not closed: " 
						+ calledFunction.getName() + ".  Event: " + regionExitName);
				
				calledFunction = fThreadCallStacks.get(threadId).pop();
				calledFunction.complete(fTimestamp);
				//calledFunction.addToSubregionTime("mpi", totalTimeMPI);
					
				aggFunction = fThreadAggStacks.get(threadId).pop();
				aggFunction.complete(calledFunction);
				if (!calledFunction.getSymbol().equals(aggFunction.getSymbol())) {
					throw new IllegalStateException("Error computing statistics: called and aggregate functions do not match");
				}
				fThreadAggStacks.get(threadId).peek().addChild(calledFunction, aggFunction);
				
			}
			
		}
		
	}

	
	@Override
	public void done() {
		super.done();
		long endtime = fTimestamp;

		//handle outstanding calls left in the thread call stacks
		fThreadCallStacks.entrySet().forEach(e -> {
			Deque<AbstractCalledFunction> q = e.getValue();
			if (!q.isEmpty()) {
				long threadId = e.getKey();
				
				Activator.logWarning("Trace is incomplete for PET " + threadId + ".  Closing all timing regions using final timestamp.");
				
				AbstractCalledFunction calledFunction = fThreadCallStacks.get(threadId).pop();
				while (calledFunction != null) {
					calledFunction.complete(endtime);
					calledFunction.setForcedToComplete(true);
					AggregatedCalledFunction aggFunction = fThreadAggStacks.get(threadId).pop();
					aggFunction.complete(calledFunction);
					if (!calledFunction.getSymbol().equals(aggFunction.getSymbol())) {
						throw new IllegalStateException("Error computing statistics: called and aggregate functions do not match");
					}
					fThreadAggStacks.get(threadId).peek().addChild(calledFunction, aggFunction);
					
					calledFunction = fThreadCallStacks.get(threadId).poll();
				}
				
			}
		});
		
		fAnalysis.setThreadNodes(fThreadNodes);
		
	}
	
	protected @Nullable String regionEntry(ITmfEvent event) {
		if (event.getType().getName().equals(NUOPCCtfCallStackStateProvider.EN_PHASE_ENTER)) {
			long vmid   = event.getContent().getFieldValue(Long.class, "vmid");
			long baseid = event.getContent().getFieldValue(Long.class, "baseid");
			CtfEnumPair mp = event.getContent().getFieldValue(CtfEnumPair.class, "method");
			long phase  = event.getContent().getFieldValue(Long.class, "phase");
			long pet = getThreadId(event);
			return getFuncName(pet, vmid, baseid, mp.getLongValue(), phase);
		}
		else if (event.getType().getName().equals(NUOPCCtfCallStackStateProvider.EN_REGION_ENTER)) {
			String name = event.getContent().getFieldValue(String.class, "name");
			if (name == null || name.length() == 0) name = "UNNAMED";
			return name;
		}
		else if (event.getType().getName().equals(NUOPCCtfCallStackStateProvider.EN_REGIONID_ENTER)) {
			long regionId = event.getContent().getFieldValue(Long.class, "regionid");
			String name = getRegionName(getThreadId(event), regionId);
			return name;
		}
		return null;
	}

	protected @Nullable String regionExit(ITmfEvent event) {
		if (event.getType().getName().equals(NUOPCCtfCallStackStateProvider.EN_PHASE_EXIT)) {
			long vmid   = event.getContent().getFieldValue(Long.class, "vmid");
			long baseid = event.getContent().getFieldValue(Long.class, "baseid");
			CtfEnumPair mp = event.getContent().getFieldValue(CtfEnumPair.class, "method");
			long phase  = event.getContent().getFieldValue(Long.class, "phase");
			long pet = getThreadId(event);
			return getFuncName(pet, vmid, baseid, mp.getLongValue(), phase);
		}
		else if (event.getType().getName().equals(NUOPCCtfCallStackStateProvider.EN_REGION_EXIT)) {
			String name = event.getContent().getFieldValue(String.class, "name");
			if (name == null || name.length() == 0) name = "UNNAMED";
			return name;
		}
		else if (event.getType().getName().equals(NUOPCCtfCallStackStateProvider.EN_REGIONID_EXIT)) {
			long regionId = event.getContent().getFieldValue(Long.class, "regionid");
			String name = getRegionName(getThreadId(event), regionId);
			return name;
		}
		return null;	
	}
	
	protected long getThreadId(ITmfEvent event) {
		CtfTmfEvent e = (CtfTmfEvent) event;
		return ((Long) e.getPacketAttributes().get("pet")).intValue();
	}
	
	protected String getFuncName(long pet, long vmid, long baseid, long method, long phase) {
		String compName = fStateAnalysis.queryComponentName(pet, vmid, baseid);
		if (compName == null) {
			compName = "UNKNOWN";
		}

		String phaseLabel = null;
		phaseLabel = fStateAnalysis.queryComponentPhaseLabel(pet, vmid, baseid, method, phase);

		if (phaseLabel == null) phaseLabel = "UNKNOWN";
		return "[" + compName + "] " + phaseLabel;
	}
	
	protected String getRegionName(long pet, long regionid) {
		String regionName = fStateAnalysis.queryRegionName(new ESMFRegionId(pet, regionid));
		if (regionName == null) {
			return "UNKNOWN";
		}
		else {
			return regionName;
		}
	}
	

}
