package org.earthsystemmodeling.cupid.trace;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.event.aspect.ITmfEventAspect;
import org.eclipse.tracecompass.tmf.core.event.aspect.TmfBaseAspects;
import org.eclipse.tracecompass.tmf.core.event.aspect.TmfEventFieldAspect;
import org.eclipse.tracecompass.tmf.core.timestamp.ITmfTimestamp;
import org.eclipse.tracecompass.tmf.core.timestamp.TmfTimestamp;
import org.eclipse.tracecompass.tmf.core.trace.text.TextTrace;
import org.eclipse.tracecompass.tmf.core.trace.text.TextTraceEventContent;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.common.collect.ImmutableList;

public class NUOPCTrace extends TextTrace<NUOPCTraceEvent> {

	static final DateFormat formatter = new SimpleDateFormat("yyyyMMdd HHmmss.SSS");
	static final Pattern pattern = Pattern.compile("(\\d{8}\\s\\d{6}\\.\\d{3})\\s+(INFO|WARNING|ERROR|JSON)\\s+PET(\\d+)\\s+(.*)");
	static final JSONParser jsonParser = new JSONParser();	
	
	@Override
	protected Pattern getFirstLinePattern() {
		//System.out.println("getFirstLinePattern()");
		return pattern;
	}

	ITmfEventAspect<String> ESMF_LOGMSG_TYPE = new ITmfEventAspect<String>() {
        @Override
        public String getName() {
            return "Line Type";
        }

        @Override
        public String getHelpText() {
            return EMPTY_STRING;
        }

        @Override
        public String resolve(ITmfEvent event) {
            return ((NUOPCTraceEvent) event).getContent().getField("logmsg_type").getValue().toString();
        }
    };
	
	
	@Override
	public Iterable<ITmfEventAspect<?>> getEventAspects() {
		return ImmutableList.of(
                TmfBaseAspects.getTimestampAspect(),
				ESMF_LOGMSG_TYPE,
                TmfBaseAspects.getEventTypeAspect(),
                TmfBaseAspects.getContentsAspect()
				);
	}
	
	
	@Override
	protected NUOPCTraceEvent parseFirstLine(Matcher matcher, String line) {
		long ts;
		Date date;
		try {
			date = formatter.parse(matcher.group(1));
			ts = date.getTime();
		} catch (ParseException e) {
			ts = 0;
		}
		ITmfTimestamp timestamp = TmfTimestamp.fromMillis(ts); // new TmfTimestamp(ts, TmfTimestamp.MILLISECOND_SCALE);
		
		TextTraceEventContent content = null;
		NUOPCEventType eventType = null;
		
		if (matcher.group(2).equals("JSON")) {
			JSONObject jo = null;
			try {
				jo = (JSONObject) jsonParser.parse(matcher.group(4));
				
				String event = null;
				if (jo.containsKey("field")) {
					jo = (JSONObject) jo.get("field");
					event = "metadata_field";
				}
				else if (jo.containsKey("comp")) {
					jo = (JSONObject) jo.get("comp");
					event = "metadata_comp";
				}
				else {
					return null;
				}
				
				content = new TextTraceEventContent(jo.entrySet().size() + 2);
				content.addField("logmsg_type", matcher.group(2));
				content.addField("pet", matcher.group(3));
				for (Object k : jo.keySet()) {
					content.addField((String) k, jo.get(k));
				}
				//TODO: generically read in key/values?
				//String compName = (String) jo.get("compName");
				//String event = (String) jo.get("event");
				//String method = (String) jo.get("method");
				//String phase = (String) jo.get("phase");
				
				//content = new TextTraceEventContent(new String[] {"logmsg_type", "pet", "compName", "event", "method", "phase"});
				//content = new TextTraceEventContent(jo.entrySet().size());
				
				//content.setFieldValue("logmsg_type", matcher.group(2));
				//content.setFieldValue("pet", matcher.group(3));
				//content.setFieldValue("compName", compName);
				//content.setFieldValue("event", event);
				//content.setFieldValue("method", method);
				//content.setFieldValue("phase", phase);
				
				eventType = new NUOPCEventType(event, content);
				
			} catch (org.json.simple.parser.ParseException e) {
					throw new RuntimeException("Exeception when parsing JSON log line: " + matcher.group(4), e);
			}
		}
		else {
			content = new TextTraceEventContent(new String[] {"logmsg_type", "pet", "data"});
			content.setFieldValue("logmsg_type", matcher.group(2));
			content.setFieldValue("pet", matcher.group(3));
			content.setFieldValue("data", matcher.group(4));
			eventType = new NUOPCEventType("ESMF Log Text", content);
		}
		
		return new NUOPCTraceEvent(this, timestamp, eventType, content);
		
	}

	@Override
	protected void parseNextLine(NUOPCTraceEvent event, String line) {
		//System.out.println("parseNextLine: " + line);		
	}

	
	
	

}
