package org.earthsystemmodeling.cupid.trace.json;

import java.util.List;
import java.util.Stack;

import org.earthsystemmodeling.cupid.trace.view.NUOPCEventType;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystem;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystemBuilder;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateSystemDisposedException;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateValueTypeException;
import org.eclipse.tracecompass.statesystem.core.exceptions.TimeRangeException;
import org.eclipse.tracecompass.statesystem.core.interval.ITmfStateInterval;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.statesystem.core.statevalue.TmfStateValue;
import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.statesystem.AbstractTmfStateProvider;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class NUOPCStateProvider extends AbstractTmfStateProvider {

	private Stack<String> activeComp;
	private Stack<String> activeState;
	private Stack<Integer> activeStateQuark;
	
    public NUOPCStateProvider(NUOPCTrace trace) {
        super(trace, "NUOPCStateSystemTraceID"); 
        activeComp = new Stack<>();
        activeState = new Stack<>();
        activeStateQuark = new Stack<>();
    }

    @Override
    public int getVersion() {
        /*
         * If the version of an existing file doesn't match the version supplied
         * in the provider, a rebuild of the history will be forced.
         */
        return 1;
    }

    @Override
    public NUOPCStateProvider getNewInstance() {
        return new NUOPCStateProvider((NUOPCTrace) getTrace());
    }

    @SuppressWarnings("unchecked")
	@Override
    protected void eventHandle(ITmfEvent event) {
    
    	ITmfStateSystemBuilder ss = getStateSystemBuilder();
    	final long ts = event.getTimestamp().toNanos();
        NUOPCTraceEvent e = (NUOPCTraceEvent) event;
        
        try {
        	
            if (e.getType() == NUOPCEventType.CONTROL) {
                
            	JSONObject jObj = (JSONObject) e.getContent().getFieldValue("json");
            	JSONObject jEvent = (JSONObject) jObj.get("ctrl");
            	String eventName = jEvent.get("event").toString();
            	
            	if (eventName.equals("region_enter") || eventName.equals("region_exit")) {
            		return;  //no additional processing for now
            	}
            	            	
            	String esmfid = jEvent.get("ESMFID").toString();
            	String compName = jEvent.get("compName").toString();
            	String method = jEvent.get("method").toString();
            	String phase = jEvent.get("phase").toString();
            	String currTime = jEvent.get("currTime").toString();
                
                int quark;
                ITmfStateValue phaseValue = TmfStateValue.newValueString(phase);
                ITmfStateValue methodValue = TmfStateValue.newValueString(method);
                ITmfStateValue clockValue = TmfStateValue.newValueString(currTime);
            	
                if (eventName.equals("start_prologue")) {
                	activeComp.push(esmfid);
                	quark = ss.getQuarkAbsoluteAndAdd("control", "activeComp");
                    ss.modifyAttribute(ts, TmfStateValue.newValueString(compName), quark);
                    quark = ss.getQuarkAbsoluteAndAdd("control", "prologueMethod");
                    ss.modifyAttribute(ts, methodValue, quark);
                    quark = ss.getQuarkAbsoluteAndAdd("control", "prologuePhase");
                    ss.modifyAttribute(ts, phaseValue, quark);
                }
                else if (eventName.equals("stop_prologue")) {
                	quark = ss.getQuarkAbsoluteAndAdd("control", "prologueMethod");
                    ss.modifyAttribute(ts, TmfStateValue.nullValue(), quark);
                    quark = ss.getQuarkAbsoluteAndAdd("control", "prologuePhase");
                    ss.modifyAttribute(ts, TmfStateValue.nullValue(), quark);
                }
                else if (eventName.equals("start_phase")) {
                    quark = ss.getQuarkAbsoluteAndAdd("control", "activeMethod");
                    ss.modifyAttribute(ts, methodValue, quark);
                    quark = ss.getQuarkAbsoluteAndAdd("control", "activePhase");
                    ss.modifyAttribute(ts, phaseValue, quark);
                }
                else if(eventName.equals("stop_phase")) {              	
                	quark = ss.getQuarkAbsoluteAndAdd("control", "activeMethod");
                    ss.modifyAttribute(ts, TmfStateValue.nullValue(), quark);
                    quark = ss.getQuarkAbsoluteAndAdd("control", "activePhase");
                    ss.modifyAttribute(ts, TmfStateValue.nullValue(), quark);
                }
                else if (eventName.equals("start_epilogue")) {
                    quark = ss.getQuarkAbsoluteAndAdd("control", "epilogueMethod");
                    ss.modifyAttribute(ts, methodValue, quark);
                    quark = ss.getQuarkAbsoluteAndAdd("control", "epiloguePhase");
                    ss.modifyAttribute(ts, phaseValue, quark);
                }
                else if (eventName.equals("stop_epilogue")) {
                	activeComp.pop();
                	quark = ss.getQuarkAbsoluteAndAdd("control", "epilogueMethod");
                    ss.modifyAttribute(ts, TmfStateValue.nullValue(), quark);
                    quark = ss.getQuarkAbsoluteAndAdd("control", "epiloguePhase");
                    ss.modifyAttribute(ts, TmfStateValue.nullValue(), quark);
                }
 
                quark = ss.getQuarkAbsoluteAndAdd("component", esmfid, "clock");
                clockValue = TmfStateValue.newValueString(currTime);
                ss.modifyAttribute(ts, clockValue, quark);
                
            }
            else if (e.getType() == NUOPCEventType.METADATA_COMPONENT) {
            	
            	JSONObject jObj = (JSONObject) e.getContent().getFieldValue("json");
            	JSONObject jComp = (JSONObject) jObj.get("comp");
            	            	
            	//String compName = jComp.getOrDefault("CompName$NUOPC$Instance", "UNKNOWN").toString();
            	String esmfid = jComp.get("ESMFID$NUOPC$Instance").toString();
            	
            	//sanity check
            	if (!esmfid.equals(activeComp.peek())) {
            		throw new RuntimeException("Component context id does not match: " + esmfid + ", " + activeComp.peek());
            	}
            	
            	for (Object key : jComp.keySet()) {
            		String val = jComp.get(key).toString();
            		int quark = ss.getQuarkAbsoluteAndAdd("component", esmfid, "attribute", key.toString());
            		ITmfStateValue value = newValueString(val);
            		ss.modifyAttribute(ts, value, quark);
            		
            		//handle special cases
            		if (key.toString().equals("InitializePhaseMap$NUOPC$Component")) {
            			JSONArray jIPD = (JSONArray) jComp.get(key);
            			jIPD.forEach(item -> {
            				String[] keyVal = item.toString().split("=");
            				int phaseNo = Integer.valueOf(keyVal[1]);
            				String phaseLabel = keyVal[0];
            				int phaseQuark = ss.getQuarkAbsoluteAndAdd("component", esmfid, "IPM", phaseLabel);
            				ss.modifyAttribute(ts, TmfStateValue.newValueInt(phaseNo), phaseQuark);
            			});
            		}
            		
            	}

            }
            else if (e.getType() == NUOPCEventType.METADATA_STATE) {
            	
            	JSONObject jObj = (JSONObject) e.getContent().getFieldValue("json");
            	JSONObject jState = (JSONObject) jObj.get("state");
            	            	
            	String stateESMFID = jState.get("ESMFID$NUOPC$Instance").toString();
            	String compESMFID = activeComp.peek();
            	activeState.push(stateESMFID);
            	activeStateQuark.push(ss.getQuarkAbsoluteAndAdd("component", compESMFID, "state", stateESMFID));
            	            	            	            	
            	for (Object key : jState.keySet()) {
            		String val = jState.get(key).toString();
            		if (key.equals("linkList")) {
            			JSONArray jLinkList = (JSONArray) jState.get("linkList");
            			handleLinkList(ts, activeStateQuark.peek(), jLinkList);
            		}
            		else {
            			int quark = ss.getQuarkRelativeAndAdd(activeStateQuark.peek(), "attribute", key.toString());
            			ITmfStateValue value = newValueString(val);
            			ss.modifyAttribute(ts, value, quark);
            		}
            	}
            }
            else if (e.getType() == NUOPCEventType.METADATA_FIELD) {
            	
            	JSONObject jObj = (JSONObject) e.getContent().getFieldValue("json");
            	JSONObject jField = (JSONObject) jObj.get("field");
            	            	
            	String fieldESMFID = jField.get("ESMFID$NUOPC$Instance").toString();
            	String stateESMFID = jField.get("stateESMFID$NUOPC$Instance").toString();
            	//String compESMFID = activeComp.peek();
            	
            	//sanity check
            	if (!stateESMFID.equals(activeState.peek())) {
               		while (!activeState.isEmpty()) {
            			activeState.pop();
            			activeStateQuark.pop();
            			if (activeState.peek().equals(stateESMFID)) break;
            		}
            		if (activeState.isEmpty()) {          		
            			throw new RuntimeException("State stack empty before finding state id: " + stateESMFID);
            		}
            	}
            	
            	//TODO: Is there a cleaner way to handle this?
            	if (jField.containsKey("StandardName$CF$Extended")) {
            		String standardName = jField.get("StandardName$CF$Extended").toString();
            		markMatchingFieldsAsReplaced(standardName, fieldESMFID, ts);
            	}          	
            	            	            	
            	for (Object key : jField.keySet()) {
            		String val = jField.get(key).toString();
            		
            		if (key.equals("petMinVal$NUOPC$Instance") || key.equals("petMaxVal$NUOPC$Instance")) {
                		//statistics
            			int quark = ss.getQuarkRelativeAndAdd(activeStateQuark.peek(), "field", fieldESMFID, "stats", key.toString());
                		ITmfStateValue value = TmfStateValue.newValueDouble(Double.valueOf(val));
                		ss.modifyAttribute(ts, value, quark);
            		}
            		else {
            			//standard attribute
            			int quark = ss.getQuarkRelativeAndAdd(activeStateQuark.peek(), "field", fieldESMFID, "attribute", key.toString());
            			ITmfStateValue value = newValueString(val);
            			ss.modifyAttribute(ts, value, quark);
            		}
            	}
            	
            }
            else if (e.getType() == NUOPCEventType.STATS) {
            	JSONObject jObj = (JSONObject) e.getContent().getFieldValue("json");
            	JSONObject jStats = (JSONObject) jObj.get("stats");
            	            	
            	String virtMemPet = jStats.get("virtMemPet").toString();
            	String physMemPet = jStats.get("physMemPet").toString();
            	
            	int quark = ss.getQuarkAbsoluteAndAdd("stats", "virtMemPet");
    			ITmfStateValue value = TmfStateValue.newValueLong(Long.valueOf(virtMemPet));
    			ss.modifyAttribute(ts, value, quark);
    			
    			quark = ss.getQuarkAbsoluteAndAdd("stats", "physMemPet");
    			value = TmfStateValue.newValueLong(Long.valueOf(physMemPet));
    			ss.modifyAttribute(ts, value, quark);
            }
            

        } catch (TimeRangeException ex) {
            throw new IllegalStateException(ex);
        } catch (StateValueTypeException ex) {
            throw new IllegalStateException(ex);
        }
		
    	
    }
    
    
    private void markMatchingFieldsAsReplaced(String standardName, String fieldESMFID, long ts) {
    	
    	//TODO: address this in a cleaner way!
    	//if there is another field with same standard name, mark it as replaced
    	//this is to have a way to hide replaced fields in other views
    	
    	ITmfStateSystemBuilder ss = getStateSystemBuilder();
    		
		int activeFieldQuark = ss.optQuarkRelative(activeStateQuark.peek(), "field");
		int myFieldQuark = ss.optQuarkRelative(activeStateQuark.peek(), "field", fieldESMFID);
		
		if (activeFieldQuark != ITmfStateSystem.INVALID_ATTRIBUTE && myFieldQuark != ITmfStateSystem.INVALID_ATTRIBUTE) {
			List<Integer> matches = ss.getSubAttributes(activeFieldQuark, false);
    		for (int m : matches) {
    			if (m == myFieldQuark) continue;
    			int possibleMatch = ss.optQuarkRelative(m, "attribute", "StandardName$CF$Extended");
    			if (possibleMatch != ITmfStateSystem.INVALID_ATTRIBUTE) {
    				ITmfStateInterval stateInterval;
					try {
						stateInterval = ss.querySingleState(ts, possibleMatch);
					} catch (StateSystemDisposedException e) {
						return;
					}
    				ITmfStateValue val = stateInterval.getStateValue();
    				
    				if (val.unboxStr().equals(standardName)) {
    					int quarkRepl = ss.getQuarkRelativeAndAdd(m, "replaced");
    					ss.modifyAttribute(ts, TmfStateValue.newValueString("true"), quarkRepl);
    				}
    			}
    		}
		}           		  	        
    	
    }
    
    //TODO: handle nested states
    private void handleLinkList(long ts, int parentQuark, JSONArray jLinkList) {
    	for (Object item : jLinkList) {
    		JSONObject jItem = (JSONObject) item;
    		if (jItem.containsKey("field")) {
    			JSONObject jField = (JSONObject) jItem.get("field");
    			String fieldName = jField.get("StandardName$CF$Extended").toString();
    			for (Object key : jField.keySet()) {
            		String val = jField.get(key).toString();
            		int quark = getStateSystemBuilder().getQuarkRelativeAndAdd(parentQuark, "field", fieldName, "attribute", key.toString());
            		ITmfStateValue value = newValueString(val);
            		getStateSystemBuilder().modifyAttribute(ts, value, quark);
            	}
    		}
    	}
    }
    
    private static TmfStateValue newValueString(String str) {
    	//if (str.length() > 100) {
    	//	str = str.substring(0, 100);
    	//}
    	return TmfStateValue.newValueString(str);
    }

}