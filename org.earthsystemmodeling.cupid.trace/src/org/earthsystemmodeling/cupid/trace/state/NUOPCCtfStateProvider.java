package org.earthsystemmodeling.cupid.trace.state;

import org.earthsystemmodeling.cupid.trace.NUOPCCtfTrace;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystemBuilder;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateValueTypeException;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.statesystem.core.statevalue.TmfStateValue;
import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.statesystem.AbstractTmfStateProvider;
import org.eclipse.tracecompass.tmf.ctf.core.event.CtfTmfEvent;
import org.eclipse.tracecompass.tmf.ctf.core.event.CtfTmfEventField;
import org.eclipse.tracecompass.tmf.ctf.core.trace.CtfTmfTrace;


public class NUOPCCtfStateProvider extends AbstractTmfStateProvider {
	
    public NUOPCCtfStateProvider(CtfTmfTrace trace) {
        super(trace, "NUOPCCtfStateSystemTraceID");         
    }

    @Override
    public int getVersion() {
        return NUOPCCtfTrace.ANALYSES_VERSION;
    }

    @Override
    public NUOPCCtfStateProvider getNewInstance() {
        return new NUOPCCtfStateProvider((CtfTmfTrace) getTrace());
    }

      
    @Override
    protected void eventHandle(ITmfEvent event) {
    
    	ITmfStateSystemBuilder ss = getStateSystemBuilder();
    	final long ts = event.getTimestamp().toNanos();
                
        try {
        	            
            if (event.getType().getName().equals("comp")) {
            	
            	CtfTmfEvent e = (CtfTmfEvent) event;
            	String pet = ((Long) e.getPacketAttributes().get("pet")).toString();
            	
            	long vmid = e.getContent().getFieldValue(Long.class, "vmid");
            	long baseid = e.getContent().getFieldValue(Long.class, "baseid");
            	String id = vmid + "-" + baseid;
            	String name = e.getContent().getFieldValue(String.class, "name");
            	           	
            	int quark = ss.getQuarkAbsoluteAndAdd("component", pet, id, "name");
        		ITmfStateValue value = newValueString(name);
        		ss.modifyAttribute(ts, value, quark);
        		   
        		/*
        		CtfTmfEventField attributes = (CtfTmfEventField) event.getContent().getField("attributes");
        		if (attributes != null) {
        			CtfTmfEventField[] attrs = (CtfTmfEventField[]) attributes.getValue();
        			for (CtfTmfEventField a : attrs) {
        				String k = a.getFieldValue(String.class, "key");
        				String v = a.getFieldValue(String.class, "value");
        				if (k.equalsIgnoreCase("IPM") || k.equalsIgnoreCase("RPM") || k.equalsIgnoreCase("FPM")) {
        					for (String kv : v.split("\\|\\|")) {
        						String[] keyval = kv.split("=");
        						quark = ss.getQuarkAbsoluteAndAdd("component", id, k, keyval[1]);
        						ITmfStateValue phaseLabel = newValueString(keyval[0]);
        						ss.modifyAttribute(ts, phaseLabel, quark);
        					}
        				}
        				else if (k.equalsIgnoreCase("kind")) {
        					quark = ss.getQuarkAbsoluteAndAdd("component", pet, id, "kind");
        					ss.modifyAttribute(ts, newValueString(v), quark);
        				}
        			}
        		}
        		*/
        		
        		//barectf version of trace has explicit phase map field
        		String IPM = e.getContent().getFieldValue(String.class, "IPM");
        		if (IPM != null && IPM.length() > 0) {
        			for (String kv : IPM.split("\\|\\|")) {
						String[] keyval = kv.split("=");
						quark = ss.getQuarkAbsoluteAndAdd("component", pet, id, "IPM", keyval[1]);
						ITmfStateValue phaseLabel = newValueString(keyval[0]);
						ss.modifyAttribute(ts, phaseLabel, quark);
					}
        		}
        		String RPM = e.getContent().getFieldValue(String.class, "RPM");
        		if (RPM != null && RPM.length() > 0) {
        			for (String kv : RPM.split("\\|\\|")) {
						String[] keyval = kv.split("=");
						quark = ss.getQuarkAbsoluteAndAdd("component", pet, id, "RPM", keyval[1]);
						ITmfStateValue phaseLabel = newValueString(keyval[0]);
						ss.modifyAttribute(ts, phaseLabel, quark);
					}
        		}
        		String FPM = e.getContent().getFieldValue(String.class, "FPM");
        		if (FPM != null && FPM.length() > 0) {
        			for (String kv : FPM.split("\\|\\|")) {
						String[] keyval = kv.split("=");
						quark = ss.getQuarkAbsoluteAndAdd("component", pet, id, "FPM", keyval[1]);
						ITmfStateValue phaseLabel = newValueString(keyval[0]);
						ss.modifyAttribute(ts, phaseLabel, quark);
					}
        		}
        		
        		//fix up kind attribute (since not recorded correctly by NUOPC yet)
        		if (name != null && name.toUpperCase().contains("-TO-")) {
        			quark = ss.getQuarkAbsoluteAndAdd("component", pet, id, "kind");
        			value = newValueString("Connector");
        			ss.modifyAttribute(ts, value, quark);
        		}
            }
            else if (event.getType().getName().equals("mem")) {
            
            	CtfTmfEvent e = (CtfTmfEvent) event;
            	String pet = ((Long) e.getPacketAttributes().get("pet")).toString();
            	
            	long virtMem = event.getContent().getFieldValue(Long.class, "virtMem");
            	long physMem = event.getContent().getFieldValue(Long.class, "physMem");
            	
            	int quark = ss.getQuarkAbsoluteAndAdd("mem", pet, "virtMem");
            	ITmfStateValue value = TmfStateValue.newValueLong(virtMem);
            	ss.modifyAttribute(ts, value, quark);
            	
            	quark = ss.getQuarkAbsoluteAndAdd("mem", pet, "physMem");
            	value = TmfStateValue.newValueLong(physMem);
            	ss.modifyAttribute(ts, value, quark);
            }
            else if (event.getType().getName().equals("define_region")) {
            	
            	CtfTmfEvent e = (CtfTmfEvent) event;
            	String pet = ((Long) e.getPacketAttributes().get("pet")).toString();
            	
            	long regionId = event.getContent().getFieldValue(Long.class, "id");
            	String regionName = event.getContent().getFieldValue(String.class, "name");
            	
            	int quark = ss.getQuarkAbsoluteAndAdd("regions", pet, String.valueOf(regionId));
            	ITmfStateValue value = TmfStateValue.newValueString(regionName);
            	ss.modifyAttribute(ts, value, quark);
            	
            }
            
        	
        } catch (StateValueTypeException ex) {
        	throw new IllegalStateException(ex);
        }
		    	
    }
    	
    private static TmfStateValue newValueString(String str) {
    	return TmfStateValue.newValueString(str);    	
    }

}