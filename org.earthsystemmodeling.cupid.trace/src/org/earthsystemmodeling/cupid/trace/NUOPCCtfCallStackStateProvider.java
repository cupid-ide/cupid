package org.earthsystemmodeling.cupid.trace;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystemBuilder;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.statesystem.core.statevalue.TmfStateValue;
import org.eclipse.tracecompass.tmf.core.callstack.CallStackStateProvider;
import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.event.ITmfEventField;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ctf.core.CtfEnumPair;
import org.eclipse.tracecompass.tmf.ctf.core.event.CtfTmfEvent;
import org.eclipse.tracecompass.tmf.ctf.core.trace.CtfTmfTrace;

public class NUOPCCtfCallStackStateProvider extends CallStackStateProvider {

	private NUOPCCtfStateSystemAnalysisModule stateAnalysis;
	
	public NUOPCCtfCallStackStateProvider(CtfTmfTrace trace) {
		super(trace);
		stateAnalysis = TmfTraceUtils.getAnalysisModuleOfClass(trace, NUOPCCtfStateSystemAnalysisModule.class, NUOPCCtfStateSystemAnalysisModule.ID);
		if (stateAnalysis == null) {
			System.out.println("here");
		}
	}

	@Override
	public int getVersion() {
		return 0;
	}

	
	@Override
	public NUOPCCtfCallStackStateProvider getNewInstance() {
		return new NUOPCCtfCallStackStateProvider((CtfTmfTrace) getTrace());
	}
	
	@Override
	protected boolean considerEvent(ITmfEvent event) {
		String ename = event.getType().getName();
		return ename.equals("control") || ename.equals("region");
	}
	
	@Override
	protected void eventHandle(ITmfEvent event) {
		
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

            String threadName = getThreadName(event);
            long threadId = getThreadId(event);
            if (threadName == null) {
                threadName = Long.toString(threadId);
            }
            int threadQuark = ss.getQuarkRelativeAndAdd(processQuark, threadName);
            ss.updateOngoingState(TmfStateValue.newValueLong(threadId), threadQuark);

            int callStackQuark = ss.getQuarkRelativeAndAdd(threadQuark, CALL_STACK);
            ITmfStateValue value = functionEntryName;
            ss.pushAttribute(timestamp, value, callStackQuark);
            
            //add component id
            Long vmid = event.getContent().getFieldValue(Long.class, "vmid");
            Long baseid = event.getContent().getFieldValue(Long.class, "baseid");
            String kind = null;
            if (vmid != null && baseid != null) {  /* could be a region */
            	kind = stateAnalysis.queryComponentKind(vmid, baseid);
            }
        	int compkindQuark = ss.getQuarkRelativeAndAdd(threadQuark, "compkind");
        	ITmfStateValue toPush = TmfStateValue.newValueString("Unknown");
        	if (kind != null) {
        		toPush = TmfStateValue.newValueString(kind);
        	}
        	ss.pushAttribute(timestamp, toPush, compkindQuark);                       
            return;
        }

        /* Check if the event is a function exit */
        ITmfStateValue functionExitState = functionExit(event);
        if (functionExitState != null) {
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
            int quark = ss.getQuarkAbsoluteAndAdd(PROCESSES, processName, threadName, CALL_STACK);
            ITmfStateValue poppedValue = ss.popAttribute(timestamp, quark);
            /*
             * Verify that the value we are popping matches the one in the
             * event field, unless the latter is undefined.
             */
            if (!functionExitState.isNull() && !functionExitState.equals(poppedValue)) {
                //TODO: error logging
            	//CupidActivator.log(Status.WARNING, "Call stack popped value does not match.  Possible missing event.");
            	//Activator.logWarning(NLS.bind(
                //        Messages.CallStackStateProvider_UnmatchedPoppedValue,
                //        functionExitState,
                //        poppedValue));
            }
            
            quark = ss.getQuarkAbsoluteAndAdd(PROCESSES, processName, threadName, "compkind");
            ss.popAttribute(timestamp, quark);
        }
		
		
		
	}
	
	//static final long ESMF_METHOD_INIT = 0;
	//static final long ESMF_METHOD_RUN = 1;
	//static final long ESMF_METHOD_FINAL = 2;

	private String getFuncName(ITmfEvent event) {
		
		if (event.getType().getName().equals("control")) {
			long vmid   = event.getContent().getFieldValue(Long.class, "vmid");
			long baseid = event.getContent().getFieldValue(Long.class, "baseid");
			CtfEnumPair mp = event.getContent().getFieldValue(CtfEnumPair.class, "method");
			long phase  = event.getContent().getFieldValue(Long.class, "phase");
			
			String compName = stateAnalysis.queryComponentName(vmid, baseid);
			if (compName == null) {
				compName = "Unknown";
			}
			//else if (compName.contains("-TO-")) {
			//	return null;
			//}
			
			String phaseLabel = null;
			phaseLabel = stateAnalysis.queryComponentPhaseLabel(vmid, baseid, mp.getLongValue(), phase);
					
			if (phaseLabel == null) {
				String method = "";
				if (mp.getLongValue() == 0) {
					method = "init ";
				}
				else if (mp.getLongValue() == 1) {
					method = "run ";
				}
				else if (mp.getLongValue() == 2) {
					method = "final ";
				}
				phaseLabel = method + "#" + String.valueOf(phase);
			}
	
			return "[" + compName + "] " + phaseLabel;
		}
		else if (event.getType().getName().equals("region")) {
			//user region
			return event.getContent().getFieldValue(String.class, "name");
		}
		else {
			return null;
		}
	}
	
	@Override
	protected @Nullable ITmfStateValue functionEntry(ITmfEvent event) {
		ITmfEventField ctrl = event.getContent().getField("ctrl");
		CtfEnumPair v = (CtfEnumPair) ctrl.getValue();
		if (v.getLongValue() == 0) {
			String name = getFuncName(event);
			if (name == null) return null;
			return TmfStateValue.newValueString(name);
		}
		return null;
	}

	@Override
	protected @Nullable ITmfStateValue functionExit(ITmfEvent event) {
		ITmfEventField ctrl = event.getContent().getField("ctrl");
		CtfEnumPair v = (CtfEnumPair) ctrl.getValue();
		if (v.getLongValue() == 1) {
			String name = getFuncName(event);
			if (name == null) return null;
			return TmfStateValue.newValueString(name);
		}
		return null;
	}

	@Override
	protected int getProcessId(ITmfEvent event) {
		CtfTmfEvent e = (CtfTmfEvent) event;
		return ((Long) e.getPacketAttributes().get("pet")).intValue();
		//return UNKNOWN_PID; 
	}

	@Override
	protected long getThreadId(ITmfEvent event) {
		return 0;
	}
	
	

	
	
}
