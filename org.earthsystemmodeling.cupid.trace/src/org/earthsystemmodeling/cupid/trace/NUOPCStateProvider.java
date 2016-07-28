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
        	
            if (e.getType().getName().equals("event")) {
                
                String compName = e.getContent().getFieldValue("compName").toString();
                String phase = e.getContent().getFieldValue("phase").toString();
                String eventName = e.getContent().getFieldValue("name").toString();
                String currTime = e.getContent().getFieldValue("currTime").toString();
                
                int quark = ss.getQuarkAbsoluteAndAdd(compName, "currentPhase");
                ITmfStateValue value;
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
            else if (e.getType().getName().equals("comp")) {
            	String compName = e.getContent().getFieldValue("CompName$NUOPC$Instance").toString();
            	for (String n : e.getContent().getFieldNames()) {
            		String val = e.getContent().getFieldValue(n).toString();
            		int quark = ss.getQuarkAbsoluteAndAdd(compName, "comp", n);
            		ITmfStateValue value = TmfStateValue.newValueString(val);
            		ss.modifyAttribute(ts, value, quark);
            	}
            }
            else if (e.getType().getName().equals("state")) {
            	String compName = e.getContent().getFieldValue("Namespace$NUOPC$Instance").toString();
            	String stateName = e.getContent().getFieldValue("name$NUOPC$Instance").toString();
            	for (String n : e.getContent().getFieldNames()) {
            		
            		Object val = e.getContent().getFieldValue(n);
            		if (val instanceof JSONArray) {
            			JSONArray arr = (JSONArray) val;
            			for (Object item : arr) {
            				JSONObject jo = (JSONObject) item;
            				if (jo.containsKey("field")) {
            					JSONObject jfield = (JSONObject) jo.get("field");
            					int quark = ss.getQuarkAbsoluteAndAdd(compName, "state", stateName, "fields", jfield.get("StandardName$CF$Extended").toString());
            					ITmfStateValue value = TmfStateValue.newValueString(jfield.toString());
                    			ss.modifyAttribute(ts, value, quark);
            				}
            			}
            		}
            		else {		
            			int quark = ss.getQuarkAbsoluteAndAdd(compName, "state", stateName, n);
            			ITmfStateValue value = TmfStateValue.newValueString(val.toString());
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

}