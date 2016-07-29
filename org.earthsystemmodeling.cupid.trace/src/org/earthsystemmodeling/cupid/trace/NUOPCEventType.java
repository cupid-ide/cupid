package org.earthsystemmodeling.cupid.trace;

import org.eclipse.tracecompass.tmf.core.event.TmfEventType;

public class NUOPCEventType extends TmfEventType {
	
	public static final String EVENT_START_PHASE = "start_phase";
	public static final String EVENT_STOP_PHASE = "stop_phase";
	
	protected NUOPCEventType(String name) {
		super(name, null);
	}
	
	public static final NUOPCEventType EVENT = new NUOPCEventType("EVENT");
	public static final NUOPCEventType METADATA_COMPONENT = new NUOPCEventType("COMP");
	public static final NUOPCEventType METADATA_STATE = new NUOPCEventType("STATE");
	public static final NUOPCEventType LOG_INFO = new NUOPCEventType("INFO");
	public static final NUOPCEventType LOG_WARN = new NUOPCEventType("WARN");
	public static final NUOPCEventType LOG_ERROR = new NUOPCEventType("ERROR");
	public static final NUOPCEventType UNKNOWN = new NUOPCEventType("UNKNOWN");
	
	public static NUOPCEventType from(String msgtype) {
		if (msgtype.equals("INFO")) return LOG_INFO;
		else if (msgtype.equals("WARNING")) return LOG_WARN;
		else if (msgtype.equals("ERROR")) return LOG_ERROR;
		else return null;
	}
		
}
