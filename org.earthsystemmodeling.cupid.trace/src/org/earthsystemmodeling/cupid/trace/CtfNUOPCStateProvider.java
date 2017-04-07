package org.earthsystemmodeling.cupid.trace;

import org.eclipse.tracecompass.statesystem.core.ITmfStateSystemBuilder;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateValueTypeException;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.statesystem.core.statevalue.TmfStateValue;
import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.event.ITmfEventField;
import org.eclipse.tracecompass.tmf.core.statesystem.AbstractTmfStateProvider;
import org.eclipse.tracecompass.tmf.ctf.core.event.CtfTmfEventField;
import org.eclipse.tracecompass.tmf.ctf.core.trace.CtfTmfTrace;


public class CtfNUOPCStateProvider extends AbstractTmfStateProvider {
	
    public CtfNUOPCStateProvider(CtfTmfTrace trace) {
        super(trace, "CtfNUOPCStateSystemTraceID"); 
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
    public CtfNUOPCStateProvider getNewInstance() {
        return new CtfNUOPCStateProvider((CtfTmfTrace) getTrace());
    }

    //private long esmfObjId(long vmid, long baseid) {
    //	return vmid*100000+baseid;
    //}
    
    @Override
    protected void eventHandle(ITmfEvent event) {
    
    	ITmfStateSystemBuilder ss = getStateSystemBuilder();
    	final long ts = event.getTimestamp().toNanos();
                
        try {
        	
            if (event.getType().getName().equals("comp")) {
            	
            	long vmid = event.getContent().getFieldValue(Long.class, "vmid");
            	long baseid = event.getContent().getFieldValue(Long.class, "baseid");
            	//TODO: consider doing this on the tracing side
            	//long id = esmfObjId(vmid, baseid);
            	String id = vmid + "-" + baseid;
            	String name = event.getContent().getFieldValue(String.class, "name");
            	
            	int quark = ss.getQuarkAbsoluteAndAdd("component", id, "name");
        		ITmfStateValue value = newValueString(name);
        		ss.modifyAttribute(ts, value, quark);
        		
        		CtfTmfEventField attributes = (CtfTmfEventField) event.getContent().getField("attributes");
        		if (attributes != null) {
        			CtfTmfEventField[] attrs = (CtfTmfEventField[]) attributes.getValue();
        			for (CtfTmfEventField a : attrs) {
        				String k = a.getFieldValue(String.class, "key");
        				String v = a.getFieldValue(String.class, "value");
        				if (k.equalsIgnoreCase("NUOPC$Instance$InitializePhaseMap")) {
        					for (String kv : v.split("\\|\\|")) {
        						String[] keyval = kv.split("=");
        						quark = ss.getQuarkAbsoluteAndAdd("component", id, "init", keyval[1]);
        						ITmfStateValue phaseLabel = newValueString(keyval[0]);
        						ss.modifyAttribute(ts, phaseLabel, quark);
        					}
        				}
        			}
        		}
            }
        	
        } catch (StateValueTypeException ex) {
        	throw new IllegalStateException(ex);
        }
		    	
    }
    	
    private static TmfStateValue newValueString(String str) {
    	return TmfStateValue.newValueString(str);
    }

}