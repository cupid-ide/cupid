package org.earthsystemmodeling.cupid.trace;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.statesystem.core.statevalue.TmfStateValue;
import org.eclipse.tracecompass.tmf.core.callstack.CallStackStateProvider;
import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.json.simple.JSONObject;

public class NUOPCCallStackStateProvider extends CallStackStateProvider {

	public NUOPCCallStackStateProvider(ITmfTrace trace) {
		super(trace);
	}

	@Override
	public int getVersion() {
		return 0;
	}

	
	@Override
	public NUOPCCallStackStateProvider getNewInstance() {
		return new NUOPCCallStackStateProvider(getTrace());
	}
	
	@Override
	protected boolean considerEvent(ITmfEvent event) {
		return event.getType() == NUOPCEventType.CONTROL;
	}

	@Override
	protected @Nullable ITmfStateValue functionEntry(ITmfEvent event) {
		JSONObject jObj = (JSONObject) event.getContent().getField("json").getValue();
		JSONObject jEvent = (JSONObject) jObj.get("ctrl");
		String eventName = jEvent.get("event").toString();
		
		if (eventName.startsWith("start_")) {
			String phase = jEvent.get("phase").toString();
			String compName = jEvent.get("compName").toString();
			String method = jEvent.get("method").toString();
			if (eventName.equals("start_prologue")) {
				method = method + " prologue";
			}
			else if (eventName.equals("start_epilogue")) {
				method = method + " epilogue";
			}
			return TmfStateValue.newValueString(compName + " " + method + " " + phase);
		}
		else {
			return null;
		}	
	}

	@Override
	protected @Nullable ITmfStateValue functionExit(ITmfEvent event) {
		JSONObject jObj = (JSONObject) event.getContent().getField("json").getValue();
		JSONObject jEvent = (JSONObject) jObj.get("ctrl");
		String eventName = jEvent.get("event").toString();
		
		if (eventName.startsWith("stop_")) {
			String phase = jEvent.get("phase").toString();
			String compName = jEvent.get("compName").toString();
			String method = jEvent.get("method").toString();
			if (eventName.equals("stop_prologue")) {
				method = method + " prologue";
			}
			else if (eventName.equals("stop_epilogue")) {
				method = method + " epilogue";
			}
			return TmfStateValue.newValueString(compName + " " + method + " " + phase);
		}
		else {
			return null;
		}	
	}

	@Override
	protected int getProcessId(ITmfEvent event) {
		return Integer.valueOf(event.getContent().getField("pet").getValue().toString());
	}

	@Override
	protected long getThreadId(ITmfEvent event) {
		return Long.valueOf(event.getContent().getField("pet").getValue().toString());
	}

	
	
}
