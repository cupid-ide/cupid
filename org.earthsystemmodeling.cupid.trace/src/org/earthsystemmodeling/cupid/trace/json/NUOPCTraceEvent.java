package org.earthsystemmodeling.cupid.trace.json;

import org.eclipse.tracecompass.tmf.core.event.ITmfEventType;
import org.eclipse.tracecompass.tmf.core.timestamp.ITmfTimestamp;
import org.eclipse.tracecompass.tmf.core.trace.text.TextTrace;
import org.eclipse.tracecompass.tmf.core.trace.text.TextTraceEvent;
import org.eclipse.tracecompass.tmf.core.trace.text.TextTraceEventContent;

public class NUOPCTraceEvent extends TextTraceEvent {

	//static final NUOPCEventType eventType = new NUOPCEventType();
	
	public NUOPCTraceEvent(TextTrace<? extends TextTraceEvent> parentTrace, 
			ITmfTimestamp timestamp, ITmfEventType type, TextTraceEventContent content) {
		super(parentTrace, timestamp, type, content);
	}
	
}
