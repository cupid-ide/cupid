package org.earthsystemmodeling.cupid.trace;

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

    public NUOPCStateProvider(NUOPCTrace trace) {
        super(trace, "NUOPCStateSystemTraceID"); 
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

    @Override
    protected void eventHandle(ITmfEvent event) {
    
    	ITmfStateSystemBuilder ss = getStateSystemBuilder();
    	final long ts = event.getTimestamp().toNanos();
        NUOPCTraceEvent e = (NUOPCTraceEvent) event;
        
        try {
        	
            if (e.getType() == NUOPCEventType.CONTROL) {
                
            	JSONObject jObj = (JSONObject) e.getContent().getFieldValue("json");
            	JSONObject jEvent = (JSONObject) jObj.get("ctrl");
            	
            	String compName = jEvent.get("compName").toString();
            	String method = jEvent.get("method").toString();
            	String phase = jEvent.get("phase").toString();
            	String eventName = jEvent.get("event").toString();
            	String currTime = jEvent.get("currTime").toString();
                
                int quark;
                ITmfStateValue phaseValue = TmfStateValue.newValueString(phase);
                ITmfStateValue methodValue = TmfStateValue.newValueString(method);
                ITmfStateValue clockValue = TmfStateValue.newValueString(currTime);
            	
                if (eventName.equals("start_prologue")) {
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
                	quark = ss.getQuarkAbsoluteAndAdd("control", "epilogueMethod");
                    ss.modifyAttribute(ts, TmfStateValue.nullValue(), quark);
                    quark = ss.getQuarkAbsoluteAndAdd("control", "epiloguePhase");
                    ss.modifyAttribute(ts, TmfStateValue.nullValue(), quark);
                }
 
                quark = ss.getQuarkAbsoluteAndAdd(compName, "clock");
                clockValue = TmfStateValue.newValueString(currTime);
                ss.modifyAttribute(ts, clockValue, quark);
                
            }
            else if (e.getType() == NUOPCEventType.METADATA_COMPONENT) {
            	
            	//{"comp":{"CompName$NUOPC$Instance":"ESM","Profiling$NUOPC$Component":"0",
            	//  "Nestling$NUOPC$Driver":"0","Verbosity$NUOPC$Component":"0",
            	//  "FinalizePhaseMap$NUOPC$Component":"FinalizePhase1=1",
            	//  "InitializePhaseMap$NUOPC$Component":["IPDv00p1=1","IPDv01p1=1","IPDv02p1=1","IPDv03p1=1"],
            	//  "InitializeDataComplete$NUOPC$Driver":"false","NestingGeneration$NUOPC$Driver":"0",
            	//  "RunPhaseMap$NUOPC$Component":"RunPhase1=1","InitializeDataProgress$NUOPC$Driver":"false",
            	//  "Kind$NUOPC$Component":"Driver","ESMF_RUNTIME_COMPLIANCEICREGISTER$$":"NUOPC_Driver_ComplianceICR"}}

            	JSONObject jObj = (JSONObject) e.getContent().getFieldValue("json");
            	JSONObject jComp = (JSONObject) jObj.get("comp");
            	            	
            	String compName = jComp.get("CompName$NUOPC$Instance").toString();
            	
            	for (Object key : jComp.keySet()) {
            		String val = jComp.get(key).toString();
            		int quark = ss.getQuarkAbsoluteAndAdd(compName, "attribute", key.toString());
            		ITmfStateValue value = newValueString(val);
            		ss.modifyAttribute(ts, value, quark);
            	}

            }
            else if (e.getType() == NUOPCEventType.METADATA_STATE) {
            	
            	JSONObject jObj = (JSONObject) e.getContent().getFieldValue("json");
            	JSONObject jState = (JSONObject) jObj.get("state");
            	            	
            	String compName = jState.get("Namespace$NUOPC$Instance").toString();
            	String stateName = jState.get("name$NUOPC$Instance").toString();
            	
            	for (Object key : jState.keySet()) {
            		String val = jState.get(key).toString();
            		if (key.equals("linkList")) {
            			JSONArray jLinkList = (JSONArray) jState.get("linkList");
            			int quark = ss.getQuarkAbsoluteAndAdd(compName, "state", stateName);
            			handleLinkList(ts, quark, jLinkList);
            		}
            		else {
            			int quark = ss.getQuarkAbsoluteAndAdd(compName, "state", stateName, "attribute", key.toString());
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
    
    //TODO: handle nested states
    private void handleLinkList(long ts, int parentQuark, JSONArray jLinkList) {
    	for (Object item : jLinkList) {
    		JSONObject jItem = (JSONObject) item;
    		if (jItem.containsKey("field")) {
    			JSONObject jField = (JSONObject) jItem.get("field");
    			String fieldName = jField.get("StandardName$CF$Extended").toString();
    			for (Object key : jField.keySet()) {
            		String val = jField.get(key).toString();
            		int quark = getStateSystemBuilder().getQuarkRelativeAndAdd(parentQuark, fieldName, "attribute", key.toString());
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