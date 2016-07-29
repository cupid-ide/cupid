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
        	
            if (e.getType() == NUOPCEventType.EVENT) {
                
            	//{"event":{"phase":"9","method":"init","name":"end_phase","currTime":"","compName":"OCN-TO-MED"}}
            	JSONObject jObj = (JSONObject) e.getContent().getFieldValue("json");
            	JSONObject jEvent = (JSONObject) jObj.get("event");
            	
            	String compName = jEvent.get("compName").toString();
            	String method = jEvent.get("method").toString();
            	String phase = jEvent.get("phase").toString();
            	String eventName = jEvent.get("name").toString();
            	String currTime = jEvent.get("currTime").toString();
                
                int quark;
                ITmfStateValue value;
                
                quark = ss.getQuarkAbsoluteAndAdd(compName, "currentMethod");
                value = TmfStateValue.newValueString(method);
                ss.modifyAttribute(ts, value, quark);
                
                quark = ss.getQuarkAbsoluteAndAdd(compName, "currentPhase");
                if (eventName.equals("start_phase")) {
                	value = TmfStateValue.newValueString(phase);               	
                }
                else {  //end_phase
                	value = TmfStateValue.nullValue();
                }
                ss.modifyAttribute(ts, value, quark);
                
                quark = ss.getQuarkAbsoluteAndAdd(compName, "clock");
                value = TmfStateValue.newValueString(currTime);
                ss.modifyAttribute(ts, value, quark);
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
            		ITmfStateValue value = TmfStateValue.newValueString(val);
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
            			ITmfStateValue value = TmfStateValue.newValueString(val);
            			ss.modifyAttribute(ts, value, quark);
            		}
            	}

            }
            

        } catch (TimeRangeException ex) {
            throw new IllegalStateException(ex);
        } catch (StateValueTypeException ex) {
            throw new IllegalStateException(ex);
        }
		
    	
    }
    
    private void handleLinkList(long ts, int parentQuark, JSONArray jLinkList) {
    	for (Object item : jLinkList) {
    		JSONObject jItem = (JSONObject) item;
    		if (jItem.containsKey("field")) {
    			JSONObject jField = (JSONObject) jItem.get("field");
    			String fieldName = jField.get("StandardName$CF$Extended").toString();
    			for (Object key : jField.keySet()) {
            		String val = jField.get(key).toString();
            		int quark = getStateSystemBuilder().getQuarkRelativeAndAdd(parentQuark, fieldName, "attribute", key.toString());
            		ITmfStateValue value = TmfStateValue.newValueString(val);
            		getStateSystemBuilder().modifyAttribute(ts, value, quark);
            	}
    		}
    	}
    }

}