package org.earthsystemmodeling.cupid.trace;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.tracecompass.tmf.core.timestamp.TmfTimestamp;
import org.eclipse.tracecompass.tmf.core.trace.text.TextTrace;
import org.eclipse.tracecompass.tmf.core.trace.text.TextTraceEventContent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class NUOPCTrace extends TextTrace<NUOPCTraceEvent> {

	static final DateFormat formatter = new SimpleDateFormat("yyyyMMdd HHmmss.SSS");
	static final Pattern pattern = Pattern.compile("(\\d{8}\\s\\d{6}\\.\\d{3})\\s+(INFO|WARNING|JSON)\\s+PET(\\d+)\\s+(.*)");
	static final JSONParser jsonParser = new JSONParser();	
	
	@Override
	protected Pattern getFirstLinePattern() {
		//System.out.println("getFirstLinePattern()");
		return pattern;
	}

	@Override
	protected NUOPCTraceEvent parseFirstLine(Matcher matcher, String line) {
		//System.out.println("parseFirstLine: " + line);
				
		//20151105 195924.670
		
		long ts;
		Date date;
		try {
			date = formatter.parse(matcher.group(1));
			ts = date.getTime();
		} catch (ParseException e) {
			ts = 0;
		}
		TmfTimestamp timestamp = new TmfTimestamp(ts, TmfTimestamp.MILLISECOND_SCALE);
		
		TextTraceEventContent content = null;
		
		if (matcher.group(2).equals("JSON")) {
			JSONObject jo = null;
			try {
				jo = (JSONObject) jsonParser.parse(matcher.group(4));
				String comp = (String) jo.get("component");
				JSONObject jevent = (JSONObject) jo.get("event");
				String eventName = (String) jevent.get("name");
				String phase = (String) jevent.get("phase");
				
				content = new TextTraceEventContent(new String[] {"type", "pet", "component", "event", "phase"});
				content.setFieldValue("type", matcher.group(2));
				content.setFieldValue("pet", matcher.group(3));
				content.setFieldValue("component", comp);
				content.setFieldValue("event", eventName);
				content.setFieldValue("phase", phase);
				
			} catch (org.json.simple.parser.ParseException e) {
					e.printStackTrace();
			}
		}
		else {
			content = new TextTraceEventContent(new String[] {"type", "pet", "data"});
			content.setFieldValue("type", matcher.group(2));
			content.setFieldValue("pet", matcher.group(3));
			content.setFieldValue("data", matcher.group(4));
		}
			
		return new NUOPCTraceEvent(this, timestamp, content);
		
	}

	@Override
	protected void parseNextLine(NUOPCTraceEvent event, String line) {
		System.out.println("parseNextLine: " + line);
		
	}

	
	
	

}
