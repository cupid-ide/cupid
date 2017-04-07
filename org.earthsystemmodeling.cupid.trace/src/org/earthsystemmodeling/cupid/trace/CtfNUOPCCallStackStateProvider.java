package org.earthsystemmodeling.cupid.trace;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.statesystem.core.statevalue.TmfStateValue;
import org.eclipse.tracecompass.tmf.core.callstack.CallStackStateProvider;
import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.event.ITmfEventField;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ctf.core.CtfEnumPair;
import org.eclipse.tracecompass.tmf.ctf.core.event.CtfTmfEvent;
import org.eclipse.tracecompass.tmf.ctf.core.event.CtfTmfEventField;
import org.eclipse.tracecompass.tmf.ctf.core.trace.CtfTmfTrace;

public class CtfNUOPCCallStackStateProvider extends CallStackStateProvider {

	private CtfNUOPCStateSystemAnalysisModule stateAnalysis;
	
	public CtfNUOPCCallStackStateProvider(CtfTmfTrace trace) {
		super(trace);
		stateAnalysis = TmfTraceUtils.getAnalysisModuleOfClass(trace, CtfNUOPCStateSystemAnalysisModule.class, CtfNUOPCStateSystemAnalysisModule.ID);
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
		return event.getType().getName().equals("control");
	}
	
	private String getFuncName(ITmfEvent event) {
		long vmid   = event.getContent().getFieldValue(Long.class, "vmid");
		long baseid = event.getContent().getFieldValue(Long.class, "baseid");
		CtfEnumPair mp = event.getContent().getFieldValue(CtfEnumPair.class, "method");
		long phase  = event.getContent().getFieldValue(Long.class, "phase");
		
		String compName = stateAnalysis.queryComponentName(vmid, baseid);
		
		String phaseLabel = null;
		if (mp.getLongValue() == 0) {
			phaseLabel = stateAnalysis.queryComponentInit(vmid, baseid, phase);
		}
		if (phaseLabel == null) {
			phaseLabel = "#" + String.valueOf(phase);
		}

		return "[" + compName + "] " + phaseLabel;
	}
	
	@Override
	protected @Nullable ITmfStateValue functionEntry(ITmfEvent event) {
		ITmfEventField ctrl = event.getContent().getField("ctrl");
		CtfEnumPair v = (CtfEnumPair) ctrl.getValue();
		if (v.getLongValue() == 0) {
			return TmfStateValue.newValueString(getFuncName(event));
		}
		return null;
	}

	@Override
	protected @Nullable ITmfStateValue functionExit(ITmfEvent event) {
		ITmfEventField ctrl = event.getContent().getField("ctrl");
		CtfEnumPair v = (CtfEnumPair) ctrl.getValue();
		if (v.getLongValue() == 1) {
			return TmfStateValue.newValueString(getFuncName(event));
		}
		return null;
	}

	@Override
	protected int getProcessId(ITmfEvent event) {
		CtfTmfEvent e = (CtfTmfEvent) event;
		//return Integer.valueOf(event.getContent().getField("pet").getValue().toString());
		return ((Long) e.getPacketAttributes().get("pet")).intValue();
	}

	@Override
	protected long getThreadId(ITmfEvent event) {
		//CtfTmfEvent e = (CtfTmfEvent) event;
		//Map<String, Object> attributes = e.getPacketAttributes();
		//attributes.get("pet");
		//return (Long) attributes.get("pet");
		return 0;
	}
	
	

	
	
}
