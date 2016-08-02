package org.earthsystemmodeling.cupid.trace;

import org.eclipse.tracecompass.tmf.core.event.TmfEventType;
import org.json.simple.JSONObject;

public class NUOPCEventType extends TmfEventType {
	
	protected NUOPCEventType(String name) {
		super(name, null);
	}
	
	public static final NUOPCEventType HEADER = new NUOPCEventType("HEADER");
	public static final NUOPCEventType CONTROL = new NUOPCEventType("CONTROL");
	public static final NUOPCEventType METADATA_COMPONENT = new NUOPCEventType("COMP");
	public static final NUOPCEventType METADATA_STATE = new NUOPCEventType("STATE");
	public static final NUOPCEventType METADATA_FIELD = new NUOPCEventType("FIELD");
	public static final NUOPCEventType STATS = new NUOPCEventType("STATS");
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
	
	public static NUOPCEventType from(JSONObject jObj) {
		if (jObj.containsKey("ctrl")) {
			return CONTROL;
		}
		else if (jObj.containsKey("comp")) {
			return METADATA_COMPONENT;
		}
		else if (jObj.containsKey("state")) {
			return METADATA_STATE;
		}
		else if (jObj.containsKey("field")) {
			return METADATA_FIELD;
		}
		else if (jObj.containsKey("stats")) {
			return STATS;
		}
		else if (jObj.containsKey("esmf_json")) {
			return HEADER;
		}
		else {
			return UNKNOWN;
		}
	}
	
		
}
