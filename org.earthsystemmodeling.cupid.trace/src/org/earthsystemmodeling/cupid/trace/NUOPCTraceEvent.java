package org.earthsystemmodeling.cupid.trace;

import org.eclipse.tracecompass.tmf.core.timestamp.ITmfTimestamp;
import org.eclipse.tracecompass.tmf.core.trace.text.TextTrace;
import org.eclipse.tracecompass.tmf.core.trace.text.TextTraceEvent;
import org.eclipse.tracecompass.tmf.core.trace.text.TextTraceEventContent;

public class NUOPCTraceEvent extends TextTraceEvent {

	static final NUOPCEventType eventType = new NUOPCEventType();
	
	public NUOPCTraceEvent(TextTrace<? extends TextTraceEvent> parentTrace, 
			ITmfTimestamp timestamp, TextTraceEventContent content) {
		super(parentTrace, timestamp, eventType, content);
	}
	
}
