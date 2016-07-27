package org.earthsystemmodeling.cupid.trace;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.statesystem.core.statevalue.TmfStateValue;
import org.eclipse.tracecompass.tmf.core.callstack.CallStackStateProvider;
import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;

public class NUOPCCallStackStateProvider extends CallStackStateProvider {

	public NUOPCCallStackStateProvider(ITmfTrace trace) {
		
		super(trace);
		System.out.println("NUOPCCallStackStateProvider: " + trace.getName());
	}

	@Override
	public int getVersion() {
		return 0;
	}

	
	@Override
	public NUOPCCallStackStateProvider getNewInstance() {
		System.out.println("NUOPCCallStackStateProvider.newInstance");
		return new NUOPCCallStackStateProvider(getTrace());
	}
	
	
	@Override
	protected boolean considerEvent(ITmfEvent event) {
		//System.out.println("NUOPCCallStackStateProvider.considerEvent");
		if (event instanceof NUOPCTraceEvent) {
			//System.out.println("te = " + event.getContent());
			if (event.getContent().getField("event") != null ) {
				//System.out.println("event = " + event.getContent().getField("event"));
				//if (((String) event.getContent().getField("event").getValue()).contains("start") ||
			     //   ((String) event.getContent().getField("event").getValue()).contains("stop")) {
					return true;
				//}
			}
		}
		return false;
	}

	@Override
	protected @Nullable ITmfStateValue functionEntry(ITmfEvent event) {
		if (((String) event.getContent().getField("event").getValue()).equals(NUOPCEventType.EVENT_START_PHASE)) {
			String phase = (String) event.getContent().getField("phase").getValue();
			String compName = (String) event.getContent().getField("compName").getValue();
			return TmfStateValue.newValueString(compName + " Init phase " + phase);
		}
		else {
			return null;
		}
	}

	@Override
	protected @Nullable ITmfStateValue functionExit(ITmfEvent event) {
		if (((String) event.getContent().getField("event").getValue()).equals(NUOPCEventType.EVENT_STOP_PHASE)) {
			String phase = (String) event.getContent().getField("phase").getValue();
			String compName = (String) event.getContent().getField("compName").getValue();
			return TmfStateValue.newValueString(compName + " Init phase " + phase);
		}
		else {
			return null;
		}
		
	}

	@Override
	protected String getThreadName(ITmfEvent event) {
		return (String) "PET " + event.getContent().getField("pet").getValue();
	}
	
	@Override
	protected long getThreadId(ITmfEvent event) {
		return Long.valueOf(event.getContent().getField("pet").getValue().toString());
	}

	@Override
	protected int getProcessId(ITmfEvent arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
