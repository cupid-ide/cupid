package org.earthsystemmodeling.cupid.trace;

import java.util.Map;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.statesystem.core.statevalue.TmfStateValue;
import org.eclipse.tracecompass.tmf.core.callstack.CallStackStateProvider;
import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.event.ITmfEventType;
import org.eclipse.tracecompass.tmf.ctf.core.event.CtfTmfEvent;
import org.eclipse.tracecompass.tmf.ctf.core.event.CtfTmfEventField;
import org.eclipse.tracecompass.tmf.ctf.core.trace.CtfTmfTrace;

public class CtfNUOPCCallStackStateProvider extends CallStackStateProvider {

	public CtfNUOPCCallStackStateProvider(CtfTmfTrace trace) {
		super(trace);
		//phaseLabelMap = new HashMap<>();
	}

	@Override
	public int getVersion() {
		return 0;
	}

	
	@Override
	public CtfNUOPCCallStackStateProvider getNewInstance() {
		return new CtfNUOPCCallStackStateProvider((CtfTmfTrace) getTrace());
	}
	
	@Override
	protected boolean considerEvent(ITmfEvent event) {
		CtfTmfEvent e = (CtfTmfEvent) event;
		
		long pet = getThreadId(e);
		if (pet > 10) return false;
		
		ITmfEventType t = e.getType();
		return t.getName().equals("phase_enter") || t.getName().equals("phase_exit") || 
			   t.getName().equals("phase_prologue_enter") || t.getName().equals("phase_prologue_exit") ||
			   t.getName().equals("phase_epilogue_enter") || t.getName().equals("phase_epilogue_exit");
	}
	
	private String getFuncName(ITmfEvent event) {
		Long vmid   = event.getContent().getFieldValue(Long.class, "vmid");
		Long baseid = event.getContent().getFieldValue(Long.class, "baseid");
		CtfTmfEventField method = (CtfTmfEventField) event.getContent().getField("method");
		Long phase  = event.getContent().getFieldValue(Long.class, "phase");
		return "[" + vmid.toString() + "_" + baseid.toString() + 
				"] " + method.getFormattedValue() + " " + phase.toString();
	}
	
	@Override
	protected @Nullable ITmfStateValue functionEntry(ITmfEvent event) {
		String eventName = event.getType().getName();
		if (eventName.equals("phase_enter")) {
			return TmfStateValue.newValueString(getFuncName(event));
		}
		else if	(eventName.equals("phase_prologue_enter")) {
			return TmfStateValue.newValueString(getFuncName(event) + " PRO");
		}
		else if	(eventName.equals("phase_epilogue_enter")) {
			return TmfStateValue.newValueString(getFuncName(event) + " EPI");
		}
		return null;
	}

	@Override
	protected @Nullable ITmfStateValue functionExit(ITmfEvent event) {
		String eventName = event.getType().getName();
		if (eventName.equals("phase_exit")) {
			return TmfStateValue.newValueString(getFuncName(event));
		}
		else if	(eventName.equals("phase_prologue_exit")) {
			return TmfStateValue.newValueString(getFuncName(event) + " PRO");
		}
		else if	(eventName.equals("phase_epilogue_exit")) {
			return TmfStateValue.newValueString(getFuncName(event) + " EPI");
		}
		return null;
	}

	@Override
	protected int getProcessId(ITmfEvent event) {
		//return Integer.valueOf(event.getContent().getField("pet").getValue().toString());
		return UNKNOWN_PID;
	}

	@Override
	protected long getThreadId(ITmfEvent event) {
		CtfTmfEvent e = (CtfTmfEvent) event;
		Map<String, Object> attributes = e.getPacketAttributes();
		//attributes.get("pet");
		return (Long) attributes.get("pet");
	}

	
	
}
