package org.earthsystemmodeling.cupid.trace;

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
		System.out.println("NUOPCCallStackStateProvider.considerEvent");
		if (event instanceof NUOPCTraceEvent) {
			System.out.println("te = " + event.getContent());
			if (event.getContent().getField("event") != null ) {
				System.out.println("event = " + event.getContent().getField("event"));
				if (((String) event.getContent().getField("event").getValue()).contains("start") ||
			        ((String) event.getContent().getField("event").getValue()).contains("stop")) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	protected String functionEntry(ITmfEvent event) {
		return "A";
		/*
		if (((String) event.getContent().getField("event").getValue()).contains("start")) {
			return (String) event.getContent().getField("phase").getValue();
		}
		*/
		
	}

	@Override
	protected String functionExit(ITmfEvent event) {
		return "A";
		/*
		if (((String) event.getContent().getField("event").getValue()).contains("stop")) {
			return (String) event.getContent().getField("phase").getValue();
		}
		*/
		
	}

	@Override
	protected String getThreadName(ITmfEvent event) {
		return "FirstThread";
	}

}
