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

	static final Pattern pattern = Pattern.compile("(\\d{8}\\s\\d{6}\\.\\d{3})\\s+(INFO|WARNING|ERROR|JSON)\\s+PET(\\d+)\\s+(.*)");
	static final JSONParser jsonParser = new JSONParser();	
	
	protected double version = -1;
	
	@Override
	protected Pattern getFirstLinePattern() {
		//System.out.println("getFirstLinePattern()");
		return pattern;
	}

	/*
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
	*/
	
	@Override
	public Iterable<ITmfEventAspect<?>> getEventAspects() {
		return ImmutableList.of(
                TmfBaseAspects.getTimestampAspect(),
				TmfBaseAspects.getEventTypeAspect(),
                TmfBaseAspects.getContentsAspect()
				);
	}
	
	//private ITmfTimestamp previousTimestamp = null;
	
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
					
		ITmfTimestamp timestamp = TmfTimestamp.fromNanos(ts*1000000L);
		
		/*
		if (previousTimestamp != null) {
			if (previousTimestamp.getValue() - timestamp.getValue() < 1000) {
				//reset
			}
			else if (timestamp.getValue() - previousTimestamp.getValue() <= 1000L) {
				timestamp = TmfTimestamp.fromNanos(previousTimestamp.getValue() + 1L);
			}
		}
		previousTimestamp = timestamp;
		*/
		
		TextTraceEventContent content = null;
				
		if (matcher.group(2).equals("JSON")) {
			JSONObject jo = null;
			try {
				jo = (JSONObject) jsonParser.parse(matcher.group(4));
				
				NUOPCEventType eventType = NUOPCEventType.from(jo);
				if (eventType == NUOPCEventType.HEADER) {
					setJSONVersion(jo);
				}
				
				content = new TextTraceEventContent(new String[] {"pet", "json"});
				content.setFieldValue("pet", matcher.group(3));
				content.setFieldValue("json", jo);
												
				return new NUOPCTraceEvent(this, timestamp, NUOPCEventType.from(jo), content);
				
			} catch (org.json.simple.parser.ParseException e) {
					throw new RuntimeException("Exeception when parsing JSON log line: " + matcher.group(4), e);
			}
		}
		else {	
			content = new TextTraceEventContent(new String[] {"pet", "logmsg"});
			content.setFieldValue("pet", matcher.group(3));
			content.setFieldValue("logmsg", matcher.group(4));
			return new NUOPCTraceEvent(this, timestamp, NUOPCEventType.from(matcher.group(2)), content);
		}
		
	}

	@Override
	protected void parseNextLine(NUOPCTraceEvent event, String line) {
		System.out.println("parseNextLine: " + line);		
	}

	private void setJSONVersion(JSONObject jObj) {
		String ver = ((JSONObject) jObj.get("esmf_json")).get("version").toString();
		version = Double.valueOf(ver);
	}
	
	
	
	

}
