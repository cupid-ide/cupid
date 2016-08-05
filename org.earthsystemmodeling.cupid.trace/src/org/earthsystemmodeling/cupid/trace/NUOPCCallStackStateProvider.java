package org.earthsystemmodeling.cupid.trace;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.statesystem.core.statevalue.TmfStateValue;
import org.eclipse.tracecompass.tmf.core.callstack.CallStackStateProvider;
import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.json.simple.JSONObject;

public class NUOPCCallStackStateProvider extends CallStackStateProvider {

	public NUOPCCallStackStateProvider(ITmfTrace trace) {
		super(trace);
		//phaseLabelMap = new HashMap<>();
	}

	@Override
	public int getVersion() {
		return 0;
	}

	
	@Override
	public NUOPCCallStackStateProvider getNewInstance() {
		return new NUOPCCallStackStateProvider(getTrace());
	}
	
	@Override
	protected boolean considerEvent(ITmfEvent event) {
		return event.getType() == NUOPCEventType.CONTROL; //||
				//event.getType() == NUOPCEventType.METADATA_COMPONENT;
	}

	
	/*
	private Map<String, Map<String,String>> phaseLabelMap;
	
	
	private String findInitPhaseLabel(String compName, String phase) {
		if (phaseLabelMap.containsKey(compName)) {
			final StringBuffer ret = new StringBuffer();
			phaseLabelMap.get(compName).entrySet().forEach(entry -> {
				if (entry.getValue().equals(phase)) {
					ret.append("|" + entry.getKey());
				}
			});
			return ret.toString();
		}
		else {
			return null;
		}
	}
	*/
	

	@Override
	protected @Nullable ITmfStateValue functionEntry(ITmfEvent event) {
		
		/*
		if (event.getType() == NUOPCEventType.METADATA_COMPONENT) {
			JSONObject jObj = (JSONObject) event.getContent().getField("json").getValue();
        	JSONObject jComp = (JSONObject) jObj.get("comp");
        	            	
        	String compName = jComp.getOrDefault("CompName$NUOPC$Instance", "").toString();
        	if (!compName.equals("")) {
        		
        		if (phaseLabelMap.containsKey(compName)) return null;  //only process once
        		
        		if (jComp.containsKey("InitializePhaseMap$NUOPC$Component")) {
        			
        			phaseLabelMap.putIfAbsent(compName, new HashMap<>());
    				Map<String,String> labelMap = phaseLabelMap.get(compName);
    				
        			JSONArray jIMP = (JSONArray) jComp.get("InitializePhaseMap$NUOPC$Component");
        			jIMP.forEach(entry -> {
        				String[] keyVal = entry.toString().split("=");
        				labelMap.put(keyVal[0], keyVal[1]);
        			});
        		}
        	}
        	return null;
        	
		}
		*/
		
		JSONObject jObj = (JSONObject) event.getContent().getField("json").getValue();
		JSONObject jEvent = (JSONObject) jObj.get("ctrl");
		String eventName = jEvent.get("event").toString();
		
		if (eventName.startsWith("start_")) {
			String phase = jEvent.get("phase").toString();
			String compName = jEvent.get("compName").toString();
			String method = jEvent.get("method").toString();
			
			//if (method.equals("init")) {
			//	String phaseLabel = findInitPhaseLabel(compName, phase);
			//	if (phaseLabel != null) phase = phase + "(" + phaseLabel + ")";  //replace number with label
			//}
			
			if (eventName.equals("start_prologue")) {
				method = method + " prologue";
			}
			else if (eventName.equals("start_epilogue")) {
				method = method + " epilogue";
			}
			
			
			
			return TmfStateValue.newValueString(compName + " " + method + " " + phase);
		}
		else {
			return null;
		}	
	}

	@Override
	protected @Nullable ITmfStateValue functionExit(ITmfEvent event) {
		
		//if (event.getType() != NUOPCEventType.CONTROL) {
		//	return null;
		//}
		
		JSONObject jObj = (JSONObject) event.getContent().getField("json").getValue();
		JSONObject jEvent = (JSONObject) jObj.get("ctrl");
		String eventName = jEvent.get("event").toString();
		
		if (eventName.startsWith("stop_")) {
			String phase = jEvent.get("phase").toString();
			String compName = jEvent.get("compName").toString();
			String method = jEvent.get("method").toString();
			
			//if (method.equals("init")) {
			//	String phaseLabel = findInitPhaseLabel(compName, phase);
			//	if (phaseLabel != null) phase = phase + "(" + phaseLabel + ")";  //replace number with label
			//}
			
			if (eventName.equals("stop_prologue")) {
				method = method + " prologue";
			}
			else if (eventName.equals("stop_epilogue")) {
				method = method + " epilogue";
			}
			return TmfStateValue.newValueString(compName + " " + method + " " + phase);
		}
		else {
			return null;
		}	
	}

	@Override
	protected int getProcessId(ITmfEvent event) {
		//return Integer.valueOf(event.getContent().getField("pet").getValue().toString());
		return 0;
	}

	@Override
	protected long getThreadId(ITmfEvent event) {
		return Long.valueOf(event.getContent().getField("pet").getValue().toString());
	}

	
	
}
