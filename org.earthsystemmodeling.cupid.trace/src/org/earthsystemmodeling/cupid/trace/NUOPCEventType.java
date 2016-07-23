package org.earthsystemmodeling.cupid.trace;

import org.eclipse.tracecompass.tmf.core.event.ITmfEventField;
import org.eclipse.tracecompass.tmf.core.event.TmfEventType;

public class NUOPCEventType extends TmfEventType {
	
	public static final String EVENT_START_PHASE = "start_phase";
	public static final String EVENT_STOP_PHASE = "stop_phase";
	
	public NUOPCEventType(String name, ITmfEventField content) {
		super(name, content);
	}
	
}
