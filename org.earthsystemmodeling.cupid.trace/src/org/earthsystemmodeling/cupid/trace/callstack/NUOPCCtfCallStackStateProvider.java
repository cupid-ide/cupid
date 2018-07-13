package org.earthsystemmodeling.cupid.trace.callstack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

import org.earthsystemmodeling.cupid.trace.Activator;
import org.earthsystemmodeling.cupid.trace.ESMFRegionId;
import org.earthsystemmodeling.cupid.trace.NUOPCCtfTrace;
import org.earthsystemmodeling.cupid.trace.state.NUOPCCtfStateSystemAnalysisModule;
import org.earthsystemmodeling.cupid.trace.statistics.AbstractCalledFunction;
import org.earthsystemmodeling.cupid.trace.statistics.AggregatedCalledFunction;
import org.earthsystemmodeling.cupid.trace.statistics.CalledFunctionFactory;
import org.earthsystemmodeling.cupid.trace.statistics.ICalledFunction;
import org.earthsystemmodeling.cupid.trace.statistics.IStatistics;
import org.earthsystemmodeling.cupid.trace.statistics.Statistics;
import org.earthsystemmodeling.cupid.trace.statistics.ThreadNode;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.analysis.profiling.core.callstack.CallStackStateProvider;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystemBuilder;
import org.eclipse.tracecompass.statesystem.core.exceptions.AttributeNotFoundException;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateValueTypeException;
import org.eclipse.tracecompass.statesystem.core.exceptions.TimeRangeException;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue.Type;
import org.eclipse.tracecompass.statesystem.core.statevalue.TmfStateValue;
import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.event.ITmfEventField;
import org.eclipse.tracecompass.tmf.core.event.ITmfEventType;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ctf.core.CtfEnumPair;
import org.eclipse.tracecompass.tmf.ctf.core.event.CtfTmfEvent;
import org.eclipse.tracecompass.tmf.ctf.core.trace.CtfTmfTrace;

public abstract class NUOPCCtfCallStackStateProvider extends CallStackStateProvider {

	public static final int REGION_ENTER = 0;
	public static final int REGION_EXIT = 1;

	public static final int ESMF_METHOD_INIT = 0;
	public static final int ESMF_METHOD_RUN = 1;
	public static final int ESMF_METHOD_FINAL = 2;

	protected NUOPCCtfStateSystemAnalysisModule stateAnalysis;
	protected final NUOPCCtfCallStackAnalysis fAnalysis;

	private static final boolean fDoCallGraph = true;
	//private long fTimer = 0;
	private long fEventCount = 0;
	private Map<Long, Deque<AbstractCalledFunction>> fThreadCallStacks = new HashMap<>();
	private Map<Long, Deque<AggregatedCalledFunction>> fThreadAggStacks = new HashMap<>();
	
	private IProgressMonitor fMonitor = null;
	private long fTotalWork = 1;
	private long fWorkIncrement = 1;
	
	public NUOPCCtfCallStackStateProvider(CtfTmfTrace trace, NUOPCCtfCallStackAnalysis analysis) {
		super(trace);
		fAnalysis = analysis;
		stateAnalysis = TmfTraceUtils.getAnalysisModuleOfClass(trace, NUOPCCtfStateSystemAnalysisModule.class, NUOPCCtfStateSystemAnalysisModule.ID);				
	}

	public static NUOPCCtfCallStackStateProvider newInstance(CtfTmfTrace trace, NUOPCCtfCallStackAnalysis analysis) {

		NUOPCCtfTrace trc = (NUOPCCtfTrace) trace;

		/*
		if (trc.getTraceVersion() ==  0.1) {
			return new Version0P1(trace);
		}
		else if (trc.getTraceVersion() == 0.2) {
			return new Version0P2(trace);
		}
		*/
		if (trc.getTraceVersion() >= 0.3) {
			return new Version0P3toP4(trace, analysis);
		}
		else {
			Activator.logWarning("Unsupported ESMF trace version:  " + trc.getTraceVersion());
			return null;
		}
	}

	@Override
	public int getVersion() {
		return NUOPCCtfTrace.ANALYSES_VERSION;
	}


	@Override
	protected abstract boolean considerEvent(ITmfEvent event);

	protected abstract String getComponentKind(ITmfEvent event);

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
		
		internalEventHandle(event);
	}
	
	protected void internalEventHandle(ITmfEvent event) {
				
		if (!considerEvent(event)) {
			return;
		}
		
		ITmfStateSystemBuilder ss = getStateSystemBuilder();
		if (ss == null) return;

		/* Check if the event is a function entry */
		ITmfStateValue functionEntryName = functionEntry(event);
		if (functionEntryName != null) {
			long timestamp = event.getTimestamp().toNanos();

			String processName = getProcessName(event);
			int processId = getProcessId(event);
			if (processName == null) {
				processName = (processId == UNKNOWN_PID) ? UNKNOWN : Integer.toString(processId);
			}
			int processQuark = ss.getQuarkAbsoluteAndAdd(PROCESSES, processName);
			ss.updateOngoingState(TmfStateValue.newValueInt(processId), processQuark);

			//String threadName = getThreadName(event);
			long threadId = getThreadId(event);
			String threadName = Long.toString(threadId);
			
			int threadQuark = ss.getQuarkRelativeAndAdd(processQuark, threadName);
			ss.updateOngoingState(TmfStateValue.newValueLong(threadId), threadQuark);
				
			int callStackQuark = ss.getQuarkRelativeAndAdd(threadQuark, CALL_STACK);
			ITmfStateValue value = functionEntryName;
			ss.pushAttribute(timestamp, value, callStackQuark);
			
			if (fDoCallGraph) {
				Deque<AbstractCalledFunction> threadCallStack = fThreadCallStacks.get(threadId);
				Deque<AggregatedCalledFunction> threadAggStack = fThreadAggStacks.get(threadId);
				if (threadCallStack == null) {
					AbstractCalledFunction initSegment = CalledFunctionFactory.create(0, 0, 0, threadName, processId, null);
		            ThreadNode init = new ThreadNode(initSegment, 0, threadId);
					fAnalysis.addThreadNode(init);
		            
					threadCallStack = new ArrayDeque<AbstractCalledFunction>(10);
					fThreadCallStacks.put(threadId, threadCallStack);
					
					threadAggStack = new ArrayDeque<AggregatedCalledFunction>(10);
					fThreadAggStacks.put(threadId, threadAggStack);
					threadAggStack.push(init);
				}
				
				int depth = threadCallStack.size();
				AbstractCalledFunction calledFunction = 
						CalledFunctionFactory.create(timestamp, depth, functionEntryName.unboxStr(), processId, threadCallStack.peek());
	            threadCallStack.push(calledFunction);
	            
	            AggregatedCalledFunction aggFunction = new AggregatedCalledFunction(calledFunction, threadAggStack.peek());
	            threadAggStack.push(aggFunction);
			}

			//add component kind
			String kind = getComponentKind(event);
			int compkindQuark = ss.getQuarkRelativeAndAdd(threadQuark, "compkind");
			ITmfStateValue toPush = TmfStateValue.newValueString("Unknown");
			if (kind != null) {
				toPush = TmfStateValue.newValueString(kind);
			}
			ss.pushAttribute(timestamp, toPush, compkindQuark);

			//add io stats
			int quark = ss.getQuarkRelativeAndAdd(threadQuark, "ioread", "totalBytes");
			toPush = TmfStateValue.newValueLong(0);
			ss.pushAttribute(timestamp, toPush, quark);
			
			quark = ss.getQuarkRelativeAndAdd(threadQuark, "ioread", "totalTime");
			toPush = TmfStateValue.newValueLong(0);
			ss.pushAttribute(timestamp, toPush, quark);
			
			quark = ss.getQuarkRelativeAndAdd(threadQuark, "iowrite", "totalBytes");
			toPush = TmfStateValue.newValueLong(0);
			ss.pushAttribute(timestamp, toPush, quark);
			
			quark = ss.getQuarkRelativeAndAdd(threadQuark, "iowrite", "totalTime");
			toPush = TmfStateValue.newValueLong(0);
			ss.pushAttribute(timestamp, toPush, quark);
			
			//add mpi stats
			quark = ss.getQuarkRelativeAndAdd(threadQuark, "mpibarrier", "count");
			toPush = TmfStateValue.newValueLong(0);
			ss.pushAttribute(timestamp, toPush, quark);
			quark = ss.getQuarkRelativeAndAdd(threadQuark, "mpibarrier", "time");
			toPush = TmfStateValue.newValueLong(0);
			ss.pushAttribute(timestamp, toPush, quark);
			quark = ss.getQuarkRelativeAndAdd(threadQuark, "mpiwait", "count");
			toPush = TmfStateValue.newValueLong(0);
			ss.pushAttribute(timestamp, toPush, quark);
			quark = ss.getQuarkRelativeAndAdd(threadQuark, "mpiwait", "time");
			toPush = TmfStateValue.newValueLong(0);
			ss.pushAttribute(timestamp, toPush, quark);
						
			
			return;
		}

		/* Check if the event is a function exit */
		ITmfStateValue functionExitState = functionExit(event);
		if (functionExitState != null) {
			long timestamp = event.getTimestamp().toNanos();
			String processName = getProcessName(event);
			int processId = getProcessId(event);
			if (processName == null) {
				processName = (processId == UNKNOWN_PID) ? UNKNOWN : Integer.toString(processId);
			}
			long threadId = getThreadId(event);
			String threadName = Long.toString(threadId);
			
			int quarkThread = ss.getQuarkAbsoluteAndAdd(PROCESSES, processName, threadName);
			int quarkCallStack = ss.getQuarkRelativeAndAdd(quarkThread, CALL_STACK);
			int quarkCompKind = ss.getQuarkRelativeAndAdd(quarkThread, "compkind");
						
			ITmfStateValue poppedValue = ss.popAttribute(timestamp, quarkCallStack);
			ss.popAttribute(timestamp, quarkCompKind);
			
			//TODO: abstract this
			int quark = ss.getQuarkRelativeAndAdd(quarkThread, "ioread", "totalBytes");
			ss.popAttribute(timestamp, quark);
			quark = ss.getQuarkRelativeAndAdd(quarkThread, "ioread", "totalTime");
			ss.popAttribute(timestamp, quark);
			quark = ss.getQuarkRelativeAndAdd(quarkThread, "iowrite", "totalBytes");
			ss.popAttribute(timestamp, quark);
			quark = ss.getQuarkRelativeAndAdd(quarkThread, "iowrite", "totalTime");
			ss.popAttribute(timestamp, quark);
			
			//mpi
			long totalTimeMPI = 0;
			long totalCountMPI = 0;
			
			quark = ss.getQuarkRelativeAndAdd(quarkThread, "mpibarrier", "count");
			totalCountMPI += ss.popAttribute(timestamp, quark).unboxLong();
			
			quark = ss.getQuarkRelativeAndAdd(quarkThread, "mpibarrier", "time");
			totalTimeMPI += ss.popAttribute(timestamp, quark).unboxLong();
			
			quark = ss.getQuarkRelativeAndAdd(quarkThread, "mpiwait", "count");
			totalCountMPI += ss.popAttribute(timestamp, quark).unboxLong();
			
			quark = ss.getQuarkRelativeAndAdd(quarkThread, "mpiwait", "time");
			totalTimeMPI += ss.popAttribute(timestamp, quark).unboxLong();
			
			
			AbstractCalledFunction calledFunction = null;
			if (fDoCallGraph) {
				calledFunction = fThreadCallStacks.get(threadId).pop();
				calledFunction.complete(timestamp);
				//calledFunction.addToSubregionTime("mpi", totalTimeMPI);
				
				AggregatedCalledFunction aggFunction = fThreadAggStacks.get(threadId).pop();
				aggFunction.complete(calledFunction);
				if (!calledFunction.getSymbol().equals(aggFunction.getSymbol())) {
					throw new IllegalStateException("Error computing statistics: called and aggregate functions do not match");
				}
				
				///// ADD MPI REGION
				if (totalTimeMPI > 0) {
					IStatistics<ICalledFunction> mpiStats = new Statistics<>(totalTimeMPI, totalCountMPI);
					AggregatedCalledFunction aggMPI = new AggregatedCalledFunction("__MPI", mpiStats, aggFunction);
					aggFunction.addChild(aggMPI);
				}
								
				fThreadAggStacks.get(threadId).peek().addChild(calledFunction, aggFunction);
			}
			
			/*
			 * Check for regions that were not closed.
			 */
			while (poppedValue!= null && !functionExitState.isNull() && !functionExitState.equals(poppedValue)) {
			
				Activator.logWarning("Timing region was not closed: " 
						+ poppedValue.unboxStr() + ".  Event: " + functionExitState.unboxStr());						
				
				poppedValue = ss.popAttribute(timestamp, quarkCallStack);
				ss.popAttribute(timestamp, quarkCompKind);
				
				quark = ss.getQuarkRelativeAndAdd(quarkThread, "ioread", "totalBytes");
				ss.popAttribute(timestamp, quark);
				quark = ss.getQuarkRelativeAndAdd(quarkThread, "ioread", "totalTime");
				ss.popAttribute(timestamp, quark);
				quark = ss.getQuarkRelativeAndAdd(quarkThread, "iowrite", "totalBytes");
				ss.popAttribute(timestamp, quark);
				quark = ss.getQuarkRelativeAndAdd(quarkThread, "iowrite", "totalTime");
				ss.popAttribute(timestamp, quark);
				
				totalTimeMPI = 0;
				quark = ss.getQuarkRelativeAndAdd(quarkThread, "mpibarrier", "count");
				ss.popAttribute(timestamp, quark);
				
				quark = ss.getQuarkRelativeAndAdd(quarkThread, "mpibarrier", "time");
				totalTimeMPI += ss.popAttribute(timestamp, quark).unboxLong();
				
				quark = ss.getQuarkRelativeAndAdd(quarkThread, "mpiwait", "count");
				ss.popAttribute(timestamp, quark);
				
				quark = ss.getQuarkRelativeAndAdd(quarkThread, "mpiwait", "time");
				totalTimeMPI += ss.popAttribute(timestamp, quark).unboxLong();
								
				if (fDoCallGraph) {
					calledFunction = fThreadCallStacks.get(threadId).pop();
					calledFunction.complete(timestamp);
					calledFunction.addToSubregionTime("mpi", totalTimeMPI);
					
					AggregatedCalledFunction aggFunction = fThreadAggStacks.get(threadId).pop();
					aggFunction.complete(calledFunction);
					if (!calledFunction.getSymbol().equals(aggFunction.getSymbol())) {
						throw new IllegalStateException("Error computing statistics: called and aggregate functions do not match");
					}
					fThreadAggStacks.get(threadId).peek().addChild(calledFunction, aggFunction);
				}
				
			}
			if (poppedValue == null) {
				Activator.logWarning("Ill-formed timer regions for event: " + functionExitState.unboxStr());		
			}
						
		}

	}

	@Override
	public void done() {
		super.done();
		long endtime = getStateSystemBuilder().getCurrentEndTime();

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
		
				
		
	}
	
	protected String getFuncName(ITmfEvent event) {
		if (event.getType().getName().equals("region")) {
			return event.getContent().getFieldValue(String.class, "name");
		}
		return null;
	}

	@Override
	protected @Nullable ITmfStateValue functionEntry(ITmfEvent event) {
		if (event.getType().getName().equals("region")) {
			ITmfEventField ctrl = event.getContent().getField("ctrl");
			CtfEnumPair v = (CtfEnumPair) ctrl.getValue();
			if (v.getLongValue() == REGION_ENTER) {
				String name = event.getContent().getFieldValue(String.class, "name");
				if (name == null) return null;
				if (name.length()==0) name = "UNNAMED";
				return TmfStateValue.newValueString(name);
			}
		}
		return null;
	}

	@Override
	protected @Nullable ITmfStateValue functionExit(ITmfEvent event) {
		if (event.getType().getName().equals("region")) {
			ITmfEventField ctrl = event.getContent().getField("ctrl");
			CtfEnumPair v = (CtfEnumPair) ctrl.getValue();
			if (v.getLongValue() == REGION_EXIT) {
				String name = event.getContent().getFieldValue(String.class, "name");
				if (name == null) return null;
				if (name.length()==0) name = "UNNAMED";
				return TmfStateValue.newValueString(name);
			}			
		}
		return null;
	}

	@Override
	protected int getProcessId(ITmfEvent event) {
		CtfTmfEvent e = (CtfTmfEvent) event;
		return ((Long) e.getPacketAttributes().get("pet")).intValue();		
	}

	@Override
	protected long getThreadId(ITmfEvent event) {
		return 0;
	}



	
	////////////////////version 0.3-0.4 trace //////////////////////

	public static final String EN_PROLOGUE_ENTER = "prologue_enter";
	public static final String EN_EPILOGUE_EXIT = "epilogue_exit";
	public static final String EN_PHASE_ENTER = "phase_enter";
	public static final String EN_PHASE_EXIT = "phase_exit";
	public static final String EN_REGION_ENTER = "region_enter";
	public static final String EN_REGION_EXIT = "region_exit";
	public static final String EN_REGIONID_ENTER = "regionid_enter";
	public static final String EN_REGIONID_EXIT = "regionid_exit";
	public static final String EN_CLOCK = "clk";
	public static final String EN_IOREAD = "ioread";
	public static final String EN_IOWRITE = "iowrite";
	public static final String EN_MPIBARRIER = "mpibarrier";
	public static final String EN_MPIWAIT = "mpiwait";
	

	public static class Version0P3toP4 extends NUOPCCtfCallStackStateProvider {
				
		public Version0P3toP4(CtfTmfTrace trace, NUOPCCtfCallStackAnalysis analysis) {
			super(trace, analysis);
		}

		@Override
		public NUOPCCtfCallStackStateProvider getNewInstance() {
			return new Version0P3toP4((CtfTmfTrace) getTrace(), fAnalysis);			
		}
		
		@Override
		protected int getProcessId(ITmfEvent event) {
			return 0;		
		}

		@Override
		protected long getThreadId(ITmfEvent event) {
			CtfTmfEvent e = (CtfTmfEvent) event;
			return ((Long) e.getPacketAttributes().get("pet")).intValue();
		}
		

		@Override
		protected @Nullable String getProcessName(ITmfEvent event) {
			CtfTmfEvent e = (CtfTmfEvent) event;
			return (String) e.getPacketAttributes().get("nodename");
		}
		
		
		
		
		protected void internalEventHandle(ITmfEvent event) {

			if (!considerEvent(event)) {
				return;
			}

			ITmfStateSystemBuilder ss = getStateSystemBuilder();
			if (ss == null) return;

			//String ename = event.getType().getName();
			ITmfEventType type = event.getType();
			if (type.getName().equals(EN_PROLOGUE_ENTER)) {
				long timestamp = event.getTimestamp().toNanos();

				String processName = getProcessName(event);
				int processId = getProcessId(event);
				if (processName == null) {
					processName = (processId == UNKNOWN_PID) ? UNKNOWN : Integer.toString(processId);
				}
				int processQuark = ss.getQuarkAbsoluteAndAdd(PROCESSES, processName);
				ss.updateOngoingState(TmfStateValue.newValueInt(processId), processQuark);

				String threadName = getThreadName(event);
				long threadId = getThreadId(event);
				if (threadName == null) {
					threadName = Long.toString(threadId);
				}
				int threadQuark = ss.getQuarkRelativeAndAdd(processQuark, threadName);
				ss.updateOngoingState(TmfStateValue.newValueLong(threadId), threadQuark);

				long vmid   = event.getContent().getFieldValue(Long.class, "vmid");
				long baseid = event.getContent().getFieldValue(Long.class, "baseid");
				CtfEnumPair mp = event.getContent().getFieldValue(CtfEnumPair.class, "method");
				long phase  = event.getContent().getFieldValue(Long.class, "phase");

				//push the vmid, baseid, method, and phase
				int proStackQuark = ss.getQuarkRelativeAndAdd(threadQuark, "PrologueEpilogue", "vmid");
				ITmfStateValue value = TmfStateValue.newValueLong(vmid);
				ss.pushAttribute(timestamp, value, proStackQuark);

				proStackQuark = ss.getQuarkRelativeAndAdd(threadQuark, "PrologueEpilogue", "baseid");
				value = TmfStateValue.newValueLong(baseid);
				ss.pushAttribute(timestamp, value, proStackQuark);

				proStackQuark = ss.getQuarkRelativeAndAdd(threadQuark, "PrologueEpilogue", "method");
				value = TmfStateValue.newValueLong(mp.getLongValue().intValue());
				ss.pushAttribute(timestamp, value, proStackQuark);

				proStackQuark = ss.getQuarkRelativeAndAdd(threadQuark, "PrologueEpilogue", "phase");
				value = TmfStateValue.newValueLong(phase);
				ss.pushAttribute(timestamp, value, proStackQuark);	            

			}
			else if (type.getName().equals(EN_EPILOGUE_EXIT)) {

				long timestamp = event.getTimestamp().toNanos();
				String processName = getProcessName(event);
				if (processName == null) {
					int processId = getProcessId(event);
					processName = (processId == UNKNOWN_PID) ? UNKNOWN : Integer.toString(processId);
				}
				String threadName = getThreadName(event);
				if (threadName == null) {
					threadName = Long.toString(getThreadId(event));
				}

				//sanity check popped values
				long vmid   = event.getContent().getFieldValue(Long.class, "vmid");
				long baseid = event.getContent().getFieldValue(Long.class, "baseid");
				CtfEnumPair mp = event.getContent().getFieldValue(CtfEnumPair.class, "method");
				long phase  = event.getContent().getFieldValue(Long.class, "phase");

				int quark = ss.getQuarkAbsoluteAndAdd(PROCESSES, processName, threadName, "PrologueEpilogue", "vmid");	            
				ITmfStateValue poppedValue = ss.popAttribute(timestamp, quark);
				if (!poppedValue.isNull() && poppedValue.unboxLong() != vmid) {
					Activator.logWarning("Call stack popped value does not match.  Possible missing event.");
				}

				quark = ss.getQuarkAbsoluteAndAdd(PROCESSES, processName, threadName, "PrologueEpilogue", "baseid");	            
				poppedValue = ss.popAttribute(timestamp, quark);
				if (!poppedValue.isNull() && poppedValue.unboxLong() != baseid) {
					Activator.logWarning("Call stack popped value does not match.  Possible missing event.");
				}

				quark = ss.getQuarkAbsoluteAndAdd(PROCESSES, processName, threadName, "PrologueEpilogue", "method");	            
				poppedValue = ss.popAttribute(timestamp, quark);
				if (!poppedValue.isNull() && poppedValue.unboxLong() != mp.getLongValue()) {
					Activator.logWarning("Call stack popped value does not match.  Possible missing event.");
				}

				quark = ss.getQuarkAbsoluteAndAdd(PROCESSES, processName, threadName, "PrologueEpilogue", "phase");	            
				poppedValue = ss.popAttribute(timestamp, quark);
				if (!poppedValue.isNull() && poppedValue.unboxLong() != phase) {
					Activator.logWarning("Call stack popped value does not match.  Possible missing event.");
				}

			}
			else if (type.getName().equals(EN_CLOCK)) {

				long timestamp = event.getTimestamp().toNanos();
				String processName = getProcessName(event);
				if (processName == null) {
					int processId = getProcessId(event);
					processName = (processId == UNKNOWN_PID) ? UNKNOWN : Integer.toString(processId);
				}
				String threadName = getThreadName(event);
				if (threadName == null) {
					threadName = Long.toString(getThreadId(event));
				}

				long year = event.getContent().getFieldValue(Long.class, "year");
				long month = event.getContent().getFieldValue(Long.class, "month");
				long day = event.getContent().getFieldValue(Long.class, "day");
				long hour = event.getContent().getFieldValue(Long.class, "hour");
				long minute = event.getContent().getFieldValue(Long.class, "minute");
				long second = event.getContent().getFieldValue(Long.class, "second");
				String monthStr = String.valueOf(month);
				if (monthStr.length() == 1) monthStr = "0"+monthStr;
				String dayStr = String.valueOf(day);
				if (dayStr.length() == 1) dayStr = "0"+dayStr;
				String hourStr = String.valueOf(hour);
				if (hourStr.length() == 1) hourStr = "0"+hourStr;
				String minuteStr = String.valueOf(minute);
				if (minuteStr.length() == 1) minuteStr = "0"+minuteStr;
				String secondStr = String.valueOf(second);
				if (secondStr.length() == 1) secondStr = "0"+secondStr;


				String timeStr = "" + year + monthStr + dayStr + "T" + hourStr + ":" + minuteStr + ":" + secondStr;
				TmfStateValue.newValueString(timeStr);

				int quark = ss.getQuarkAbsoluteAndAdd(PROCESSES, processName, threadName, "clock");	            
				ss.modifyAttribute(timestamp, TmfStateValue.newValueString(timeStr), quark);
				//ss.updateOngoingState(TmfStateValue.newValueString(timeStr), quark);

			}
			else if (type.getName().equals(EN_IOREAD) || type.getName().equals(EN_IOWRITE)) {
				
				String processName = getProcessName(event);
				if (processName == null) {
					int processId = getProcessId(event);
					processName = (processId == UNKNOWN_PID) ? UNKNOWN : Integer.toString(processId);
				}
				String threadName = getThreadName(event);
				if (threadName == null) {
					threadName = Long.toString(getThreadId(event));
				}
				
				long totalBytes = event.getContent().getFieldValue(Long.class, "bytes");
				long totalTime = event.getContent().getFieldValue(Long.class, "time");
				
				String quarkName = "ioread";
				if (type.getName().equals(EN_IOWRITE)) {
					quarkName = "iowrite";
				}
				
				int quark = ss.getQuarkAbsoluteAndAdd(PROCESSES, processName, threadName, quarkName, "totalBytes");
				peekModifyAttribute(quark, TmfStateValue.newValueLong(totalBytes));	
				
				quark = ss.getQuarkAbsoluteAndAdd(PROCESSES, processName, threadName, quarkName, "totalTime");
				peekModifyAttribute(quark, TmfStateValue.newValueLong(totalTime));
				
			}
			else if (type.getName().equals(EN_MPIBARRIER) || type.getName().equals(EN_MPIWAIT)) {
				
				String processName = getProcessName(event);
				if (processName == null) {
					int processId = getProcessId(event);
					processName = (processId == UNKNOWN_PID) ? UNKNOWN : Integer.toString(processId);
				}
				String threadName = getThreadName(event);
				if (threadName == null) {
					threadName = Long.toString(getThreadId(event));
				}
				
				long count = event.getContent().getFieldValue(Long.class, "count");
				long time = event.getContent().getFieldValue(Long.class, "time");
				
				String quarkName = "mpiwait";
				if (type.getName().equals(EN_MPIBARRIER)) {
					quarkName = "mpibarrier";
				}
				
				//WARNING:  this assumes only one statistics event per region since it does not add to existing state
				int quark = ss.getQuarkAbsoluteAndAdd(PROCESSES, processName, threadName, quarkName, "count");
				peekModifyAttribute(quark, TmfStateValue.newValueLong(count));	
				
				quark = ss.getQuarkAbsoluteAndAdd(PROCESSES, processName, threadName, quarkName, "time");
				peekModifyAttribute(quark, TmfStateValue.newValueLong(time));
				
			}
			else {
				super.internalEventHandle(event);
			}

		}
	
		@Override
		protected boolean considerEvent(ITmfEvent event) {
			String typeName = event.getType().getName();
			
			return EN_REGIONID_ENTER.equals(typeName) ||
					EN_REGIONID_EXIT.equals(typeName) ||
					EN_REGION_ENTER.equals(typeName) ||
					EN_REGION_EXIT.equals(typeName) ||
					EN_PROLOGUE_ENTER.equals(typeName) ||
					EN_EPILOGUE_EXIT.equals(typeName) ||
					EN_PHASE_ENTER.equals(typeName) ||
					EN_PHASE_EXIT.equals(typeName) ||					
					EN_CLOCK.equals(typeName) ||
					EN_IOREAD.equals(typeName) ||
					EN_IOWRITE.equals(typeName) ||
					EN_MPIBARRIER.equals(typeName) ||
					EN_MPIWAIT.equals(typeName);
		}

		
		@Override
		protected String getComponentKind(ITmfEvent event) {
			String typeName = event.getType().getName();
			if (EN_PROLOGUE_ENTER.equals(typeName) ||
				EN_EPILOGUE_EXIT.equals(typeName) ||
				EN_PHASE_ENTER.equals(typeName) ||
				EN_PHASE_EXIT.equals(typeName)) {
				
				long vmid   = event.getContent().getFieldValue(Long.class, "vmid");
				long baseid = event.getContent().getFieldValue(Long.class, "baseid");
				long pet = getThreadId(event);
				
				return stateAnalysis.queryComponentKind(pet, vmid, baseid);
			}
			return null;
		}
		
		
		protected void peekModifyAttribute(int attributeQuark, ITmfStateValue newValue)
				throws TimeRangeException, StateValueTypeException {

			ITmfStateSystemBuilder ss = getStateSystemBuilder();
			if (ss == null) return;

			// These are the state values of the stack-attribute itself 
			ITmfStateValue previousSV = ss.queryOngoingState(attributeQuark);

			if (previousSV.isNull()) {
				
				return;
			}
			if (previousSV.getType() != Type.INTEGER) {
				
				throw new StateValueTypeException(ss.getSSID() + " Quark:" + attributeQuark + ", Type:" + previousSV.getType() + ", Expected:" + Type.INTEGER); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}

			int stackDepth = previousSV.unboxInt();

			if (stackDepth <= 0) {
	
				throw new StateValueTypeException(ss.getSSID() + " Quark:" + attributeQuark + ", Stack depth:" + stackDepth);  //$NON-NLS-1$//$NON-NLS-2$
			}

			
			int subAttributeQuark;
			try {
				subAttributeQuark = ss.getQuarkRelative(attributeQuark, String.valueOf(stackDepth));
			} catch (AttributeNotFoundException e) {
				String message = " Stack attribute missing sub-attribute for depth:" + stackDepth; //$NON-NLS-1$
				throw new IllegalStateException(ss.getSSID() + " Quark:" + attributeQuark + message); //$NON-NLS-1$
			}
			ss.updateOngoingState(newValue, subAttributeQuark);
			//ITmfStateValue peekedValue = ss.queryOngoingState(subAttributeQuark);
			//return peekedValue;
		}
		
		
		
		@Override
		protected @Nullable ITmfStateValue functionEntry(ITmfEvent event) {
			if (event.getType().getName().equals(EN_PHASE_ENTER)) {
				long vmid   = event.getContent().getFieldValue(Long.class, "vmid");
				long baseid = event.getContent().getFieldValue(Long.class, "baseid");
				CtfEnumPair mp = event.getContent().getFieldValue(CtfEnumPair.class, "method");
				long phase  = event.getContent().getFieldValue(Long.class, "phase");
				long pet = getThreadId(event);
				
				String funcName = getFuncName(pet, vmid, baseid, mp.getLongValue(), phase);
				return TmfStateValue.newValueString(funcName);			
			}
			else if (event.getType().getName().equals(EN_REGION_ENTER)) {
				String name = event.getContent().getFieldValue(String.class, "name");
				if (name == null || name.length() == 0) name = "UNNAMED";
				return TmfStateValue.newValueString(name);
			}
			else if (event.getType().getName().equals(EN_REGIONID_ENTER)) {
				long regionId = event.getContent().getFieldValue(Long.class, "regionid");
				String name = getRegionName(getThreadId(event), regionId);
				return TmfStateValue.newValueString(name);
			}
			return null;
		}

		@Override
		protected @Nullable ITmfStateValue functionExit(ITmfEvent event) {
			if (event.getType().getName().equals(EN_PHASE_EXIT)) {
				long vmid   = event.getContent().getFieldValue(Long.class, "vmid");
				long baseid = event.getContent().getFieldValue(Long.class, "baseid");
				CtfEnumPair mp = event.getContent().getFieldValue(CtfEnumPair.class, "method");
				long phase  = event.getContent().getFieldValue(Long.class, "phase");
				long pet = getThreadId(event);
				
				String funcName = getFuncName(pet, vmid, baseid, mp.getLongValue(), phase);
				return TmfStateValue.newValueString(funcName);			
			}
			else if (event.getType().getName().equals(EN_REGION_EXIT)) {
				String name = event.getContent().getFieldValue(String.class, "name");
				if (name == null || name.length() == 0) name = "UNNAMED";
				return TmfStateValue.newValueString(name);
			}
			else if (event.getType().getName().equals(EN_REGIONID_EXIT)) {
				long regionId = event.getContent().getFieldValue(Long.class, "regionid");
				String name = getRegionName(getThreadId(event), regionId);
				return TmfStateValue.newValueString(name);
			}
			return null;	
		}

		protected String getFuncName(long pet, long vmid, long baseid, long method, long phase) {
			String compName = stateAnalysis.queryComponentName(pet, vmid, baseid);
			if (compName == null) {
				compName = "UNKNOWN";
			}

			String phaseLabel = null;
			phaseLabel = stateAnalysis.queryComponentPhaseLabel(pet, vmid, baseid, method, phase);

			if (phaseLabel == null) phaseLabel = "UNKNOWN";
			return "[" + compName + "] " + phaseLabel;
		}
		
		protected String getRegionName(long pet, long regionid) {
			String regionName = stateAnalysis.queryRegionName(new ESMFRegionId(pet, regionid));
			if (regionName == null) {
				return "UNKNOWN";
			}
			else {
				return regionName;
			}
		}


	}
	
	

}
