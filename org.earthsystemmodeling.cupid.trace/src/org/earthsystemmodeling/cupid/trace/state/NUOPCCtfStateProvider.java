package org.earthsystemmodeling.cupid.trace.state;

import org.earthsystemmodeling.cupid.trace.NUOPCCtfTrace;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystemBuilder;
import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.statesystem.AbstractTmfStateProvider;
import org.eclipse.tracecompass.tmf.ctf.core.event.CtfTmfEvent;
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
                
    	//TODO: consider whether component info needs to be stored in a state system
    	// or in a different kind of representation since it should be time independent
        if (event.getType().getName().equals("comp")) {
        	
        	CtfTmfEvent e = (CtfTmfEvent) event;
        	String pet = ((Long) e.getPacketAttributes().get("pet")).toString();
        	
        	long vmid = e.getContent().getFieldValue(Long.class, "vmid");
        	long baseid = e.getContent().getFieldValue(Long.class, "baseid");
        	String id = vmid + "-" + baseid;
        	String name = e.getContent().getFieldValue(String.class, "name");
        	           	
        	int quark = ss.getQuarkAbsoluteAndAdd("component", pet, id, "name");
    		ss.modifyAttribute(ts, name, quark);
    		   
    		String IPM = e.getContent().getFieldValue(String.class, "IPM");
    		if (IPM != null && IPM.length() > 0) {
    			for (String kv : IPM.split("\\|\\|")) {
					String[] keyval = kv.split("=");
					quark = ss.getQuarkAbsoluteAndAdd("component", pet, id, "IPM", keyval[1]);
					ss.modifyAttribute(ts, keyval[0], quark);
				}
    		}
    		String RPM = e.getContent().getFieldValue(String.class, "RPM");
    		if (RPM != null && RPM.length() > 0) {
    			for (String kv : RPM.split("\\|\\|")) {
					String[] keyval = kv.split("=");
					quark = ss.getQuarkAbsoluteAndAdd("component", pet, id, "RPM", keyval[1]);
					ss.modifyAttribute(ts, keyval[0], quark);
				}
    		}
    		String FPM = e.getContent().getFieldValue(String.class, "FPM");
    		if (FPM != null && FPM.length() > 0) {
    			for (String kv : FPM.split("\\|\\|")) {
					String[] keyval = kv.split("=");
					quark = ss.getQuarkAbsoluteAndAdd("component", pet, id, "FPM", keyval[1]);
					ss.modifyAttribute(ts, keyval[0], quark);
				}
    		}
    		
    		//fix up kind attribute (since not recorded correctly by NUOPC yet)
    		if (name != null && name.toUpperCase().contains("-TO-")) {
    			quark = ss.getQuarkAbsoluteAndAdd("component", pet, id, "kind");
    			ss.modifyAttribute(ts, "Connector", quark);
    		}
        }
        else if (event.getType().getName().equals("mem")) {
        
        	CtfTmfEvent e = (CtfTmfEvent) event;
        	String pet = ((Long) e.getPacketAttributes().get("pet")).toString();
        	
        	long virtMem = event.getContent().getFieldValue(Long.class, "virtMem");
        	long physMem = event.getContent().getFieldValue(Long.class, "physMem");
        	
        	int quark = ss.getQuarkAbsoluteAndAdd("mem", pet, "virtMem");
        	ss.modifyAttribute(ts, virtMem, quark);
        	
        	quark = ss.getQuarkAbsoluteAndAdd("mem", pet, "physMem");
        	ss.modifyAttribute(ts, physMem, quark);
        }
        else if (event.getType().getName().equals("define_region")) {
        	
        	CtfTmfEvent e = (CtfTmfEvent) event;
        	String pet = ((Long) e.getPacketAttributes().get("pet")).toString();
        	
        	long regionId = event.getContent().getFieldValue(Long.class, "id");
        	String regionName = event.getContent().getFieldValue(String.class, "name");
        	
        	//TODO: if needed, we can distinguish here between user regions and comp phases
        	//final long REGION_TYPE_COMPPHASE = 0;
        	//final long REGION_TYPE_USER = 1;
        	//CtfEnumPair regionType = event.getContent().getFieldValue(CtfEnumPair.class, "type");
        	//can also get vmid, baseid, method, phase if we need it
        	
        	int quark = ss.getQuarkAbsoluteAndAdd("regions", pet, String.valueOf(regionId));
        	ss.modifyAttribute(ts, regionName, quark);
        }
		    	
    }
    
}