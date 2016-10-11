package org.earthsystemmodeling.cupid.trace;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

	static final Pattern pattern = Pattern.compile("(\\d{8}\\s\\d{6}\\.\\d{3})\\s+(INFO|WARNING|ERROR|JSON)\\s+PET(\\d+)\\s+(\\d+\\.\\d+)?(.*)");
	
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
		/*
		final DateFormat formatter = new SimpleDateFormat("yyyyMMdd HHmmss.SSS");
		
		try {
			Date date = formatter.parse(matcher.group(1));
			ts = date.getTime();			
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		
		
		ITmfTimestamp timestamp = TmfTimestamp.fromNanos(ts*1000000L);
		*/
		
		ITmfTimestamp timestamp;
		String highResTime = matcher.group(4);
		if (highResTime != null) {
			double d = Double.valueOf(highResTime);
			long t = (long) (d*1000000000L);
			timestamp = TmfTimestamp.fromNanos(t);
		}
		else {
			final DateFormat formatter = new SimpleDateFormat("yyyyMMdd HHmmss.SSS");		
			try {
				Date date = formatter.parse(matcher.group(1));
				ts = date.getTime();			
			} catch (ParseException e) {
				e.printStackTrace();
				return null;
			}		
			timestamp = TmfTimestamp.fromNanos(ts*1000000L);
		}
				
		TextTraceEventContent content = null;
				
		if (matcher.group(2).equals("JSON")) {
			final JSONParser jsonParser = new JSONParser();	
			JSONObject jo = null;
			try {
				
				//try {			
					jo = (JSONObject) jsonParser.parse(matcher.group(5));
				//}
				//catch(ClassCastException cce) {
				//	System.out.println(matcher.group(5));
				//	cce.printStackTrace();
				//}
				
				NUOPCEventType eventType = NUOPCEventType.from(jo);
				if (eventType == NUOPCEventType.HEADER) {
					setJSONVersion(jo);
				}
				/*
				else if (eventType == NUOPCEventType.CONTROL) {
				
					JSONObject jCtrl = (JSONObject) jo.get("ctrl");
					String sysTimeStr = (String) jCtrl.get("sysTime");
					if (sysTimeStr != null) {
						int idx = sysTimeStr.indexOf(".");
						sysTimeStr = sysTimeStr.substring(idx+4, idx+7);
						long increment = Long.valueOf(sysTimeStr) * 1000;
						timestamp = TmfTimestamp.fromNanos(ts*1000000L + increment);
					}
				}
				*/
								
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
			content.setFieldValue("logmsg", matcher.group(5));
			return new NUOPCTraceEvent(this, timestamp, NUOPCEventType.from(matcher.group(2)), content);
		}
		
	}

	@Override
	protected void parseNextLine(NUOPCTraceEvent event, String line) {
		//System.out.println("parseNextLine: " + line);		
	}

	
	
	private void setJSONVersion(JSONObject jObj) {
		String ver = ((JSONObject) jObj.get("esmf_json")).get("version").toString();
		version = Double.valueOf(ver);
	}
	
	
	
	

}
