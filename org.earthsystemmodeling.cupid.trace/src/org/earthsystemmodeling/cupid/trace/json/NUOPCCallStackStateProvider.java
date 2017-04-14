package org.earthsystemmodeling.cupid.trace.json;

import org.earthsystemmodeling.cupid.trace.view.NUOPCEventType;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystem;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateSystemDisposedException;
import org.eclipse.tracecompass.statesystem.core.interval.ITmfStateInterval;
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
	
	private ITmfStateSystem stateSystem;
	
	private String getFunctionName(long ts, String id, String compName, String method, String phase) {
		
		String toReturn =  compName + " " + method + " " + phase;
		
		if (stateSystem == null) {
		 
			NUOPCStateSystemAnalysisModule module = (NUOPCStateSystemAnalysisModule) getTrace().getAnalysisModule(NUOPCStateSystemAnalysisModule.ID);
			if (module == null) return toReturn;
			module.schedule();
		
			if (!module.waitForInitialization()) {
				return toReturn;
			}	
	        	
			stateSystem = module.getStateSystem();
			if (stateSystem == null) return toReturn;
			stateSystem.waitUntilBuilt(1000);
	        
		}
				
		if (ts < stateSystem.getStartTime() || ts > stateSystem.getCurrentEndTime()) return toReturn;

		if (method.equals("init")) {
			int quarkPhaseMap = stateSystem.optQuarkAbsolute("component", id, "IPM");
			if (quarkPhaseMap != ITmfStateSystem.INVALID_ATTRIBUTE) {
				StringBuffer phaseLabels = new StringBuffer();
				stateSystem.getSubAttributes(quarkPhaseMap, false).forEach(q -> {
					ITmfStateInterval stateItvl;
					try {
						stateItvl = stateSystem.querySingleState(ts, q);
						if (phaseLabels.length() == 0 && !stateItvl.getStateValue().isNull()) {
							int phaseNo = stateItvl.getStateValue().unboxInt();
							if (phaseNo == Integer.valueOf(phase)) {
								phaseLabels.append(stateSystem.getAttributeName(q));							
							}
						}
					} catch (StateSystemDisposedException e) {
						return;
					}
					
				});
				if (phaseLabels.length() > 0) return compName + ": " + phaseLabels.toString();
			}
		}
		
		return toReturn;
		
	}
	
	private static final boolean includeEpiloguePrologue = true;
	
	@Override
	protected @Nullable ITmfStateValue functionEntry(ITmfEvent event) {
		
		JSONObject jObj = (JSONObject) event.getContent().getField("json").getValue();
		JSONObject jEvent = (JSONObject) jObj.get("ctrl");
		String eventName = jEvent.get("event").toString();
		
		if (eventName.startsWith("start_")) {
			String phase = jEvent.get("phase").toString();
			String compName = jEvent.get("compName").toString();
			String method = jEvent.get("method").toString();
			String id = jEvent.get("ESMFID").toString();
			
			String funcName = getFunctionName(event.getTimestamp().toNanos(), id, compName, method, phase);
			
			//if (funcName == null) {
			//	System.out.println(event);
			//}
			
			if (eventName.equals("start_prologue")) {
				//method = method + " prologue";
				funcName += " prologue";
				if (!includeEpiloguePrologue) return null;
			}
			else if (eventName.equals("start_epilogue")) {
				//method = method + " epilogue";
				funcName += " epilogue";
				if (!includeEpiloguePrologue) return null;
			}
									
			return TmfStateValue.newValueString(funcName);
		}
		else if (eventName.equals("region_enter")) {
			String name = jEvent.get("name").toString();
			return TmfStateValue.newValueString(name);
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
			String id = jEvent.get("ESMFID").toString();
			
			String funcName = getFunctionName(event.getTimestamp().toNanos(), id, compName, method, phase);
			
			if (eventName.equals("stop_prologue")) {
				//method = method + " prologue";
				funcName += " prologue";
				if (!includeEpiloguePrologue) return null;
			}
			else if (eventName.equals("stop_epilogue")) {
				//method = method + " epilogue";
				funcName += " epilogue";
				if (!includeEpiloguePrologue) return null;
			}
			
			return TmfStateValue.newValueString(funcName);
		}
		else if (eventName.equals("region_exit")) {
			String name = jEvent.get("name").toString();
			return TmfStateValue.newValueString(name);
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
