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
import org.eclipse.tracecompass.tmf.core.timestamp.ITmfTimestamp;
import org.eclipse.tracecompass.tmf.core.timestamp.TmfTimestamp;
import org.eclipse.tracecompass.tmf.core.trace.text.TextTrace;
import org.eclipse.tracecompass.tmf.core.trace.text.TextTraceEventContent;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.common.collect.ImmutableList;

public class NUOPCTrace extends TextTrace<NUOPCTraceEvent> {

	//static final DateFormat formatter = new SimpleDateFormat("yyyyMMdd HHmmss.SSS");
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
				TmfBaseAspects.getEventTypeAspect(),
                TmfBaseAspects.getContentsAspect()
				);
	}
	
	
	@Override
	protected NUOPCTraceEvent parseFirstLine(Matcher matcher, String line) {
		
		long ts;
		final DateFormat formatter = new SimpleDateFormat("yyyyMMdd HHmmss.SSS");
		
		try {
			Date date = formatter.parse(matcher.group(1));
			ts = date.getTime();			
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
					
		ITmfTimestamp timestamp = TmfTimestamp.fromMillis(ts);
		
		TextTraceEventContent content = null;
				
		if (matcher.group(2).equals("JSON")) {
			JSONObject jo = null;
			try {
				jo = (JSONObject) jsonParser.parse(matcher.group(4));
				
				NUOPCEventType eventType = null;
				if (jo.containsKey("event")) {
					//jo = (JSONObject) jo.get("event");
					eventType = NUOPCEventType.EVENT;
				}
				else if (jo.containsKey("comp")) {
					//jo = (JSONObject) jo.get("comp");
					eventType = NUOPCEventType.METADATA_COMPONENT;
				}
				else if (jo.containsKey("state")) {
					//jo = (JSONObject) jo.get("state");
					eventType = NUOPCEventType.METADATA_STATE;
				}
				else {
					eventType = NUOPCEventType.UNKNOWN;
				}
				
				content = new TextTraceEventContent(new String[] {"pet", "json"});
				content.setFieldValue("pet", matcher.group(3));
				content.setFieldValue("json", jo);
				//for (Object k : jo.keySet()) {
				//	content.addField((String) k, jo.get(k));
				//}
								
				return new NUOPCTraceEvent(this, timestamp, eventType, content);
				
			} catch (org.json.simple.parser.ParseException e) {
					throw new RuntimeException("Exeception when parsing JSON log line: " + matcher.group(4), e);
			}
		}
		else {	
			content = new TextTraceEventContent(new String[] {"pet", "logmsg"});
			//content.setFieldValue("logmsg_type", matcher.group(2));
			content.setFieldValue("pet", matcher.group(3));
			content.setFieldValue("logmsg", matcher.group(4));
			return new NUOPCTraceEvent(this, timestamp, NUOPCEventType.from(matcher.group(2)), content);
		}
		
	}

	@Override
	protected void parseNextLine(NUOPCTraceEvent event, String line) {
		System.out.println("parseNextLine: " + line);		
	}

	
	
	

}
