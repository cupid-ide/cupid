package org.earthsystemmodeling.cupid.trace;

import java.util.LinkedList;
import java.util.List;

import org.earthsystemmodeling.cupid.trace.view.NUOPCCallStackView;
import org.earthsystemmodeling.cupid.trace.view.NUOPCMemUsageView;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystem;
import org.eclipse.tracecompass.statesystem.core.exceptions.AttributeNotFoundException;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateSystemDisposedException;
import org.eclipse.tracecompass.statesystem.core.interval.ITmfStateInterval;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.tmf.core.analysis.IAnalysisOutput;
import org.eclipse.tracecompass.tmf.core.statesystem.ITmfStateProvider;
import org.eclipse.tracecompass.tmf.core.statesystem.TmfStateSystemAnalysisModule;
import org.eclipse.tracecompass.tmf.ctf.core.trace.CtfTmfTrace;
import org.eclipse.tracecompass.tmf.ui.analysis.TmfAnalysisViewOutput;

public class NUOPCCtfStateSystemAnalysisModule extends TmfStateSystemAnalysisModule {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCCtfStateSystemAnalysisModule";
	
	@Override
	protected ITmfStateProvider createStateProvider() {
		return new NUOPCCtfStateProvider((CtfTmfTrace) getTrace());
	}
	
	@Override
	protected StateSystemBackendType getBackendType() {
		return StateSystemBackendType.FULL;
	}
	
	@Override
	public String getName() {
		return "CTF NUOPC State System Analysis";
	}
		
	private static final long TIMEOUT = 20*1000;
	
	public String queryComponentName(long vmid, long baseid) {	
		
		ITmfStateSystem ss = getStateSystem();
		if (!ss.waitUntilBuilt(TIMEOUT)) {
			//System.out.println("not built");
		}
		
		long endts = ss.getCurrentEndTime();
		String id = vmid + "-" + baseid;
		try {
			int quark = ss.getQuarkAbsolute("component", id, "name");
			List<ITmfStateInterval> state = ss.queryFullState(endts);
			ITmfStateValue value = state.get(quark).getStateValue();
	        return value.unboxStr();
		} catch (AttributeNotFoundException e) {
			return null;
		} catch (StateSystemDisposedException e) {
			return null;
		}
	}
	
	public String queryComponentKind(long vmid, long baseid) {	
		
		ITmfStateSystem ss = getStateSystem();
		if (!ss.waitUntilBuilt(TIMEOUT)) {
			/* ignore */
		}
		
		long endts = ss.getCurrentEndTime();
		String id = vmid + "-" + baseid;
		try {
			int quark = ss.getQuarkAbsolute("component", id, "kind");
			List<ITmfStateInterval> state = ss.queryFullState(endts);
			ITmfStateValue value = state.get(quark).getStateValue();
	        return value.unboxStr();
		} catch (AttributeNotFoundException e) {
			return null;
		} catch (StateSystemDisposedException e) {
			return null;
		}
	}
	
	public String queryComponentPhaseLabel(long vmid, long baseid, long method, long phase) {	
		
		ITmfStateSystem ss = getStateSystem();
		if (!ss.waitUntilBuilt(TIMEOUT)) {
			//System.out.println("not built");
		}
		
		long endts = ss.getCurrentEndTime();		
		
		String id = vmid + "-" + baseid;
		String map = null;
		
		if (method == 0) map = "IPM";
		else if (method == 1) map = "RPM";
		else if (method == 2) map = "FPM";
		else return null;
		
		try {
			int quark = ss.getQuarkAbsolute("component", id, map, String.valueOf(phase));
			List<ITmfStateInterval> state = ss.queryFullState(endts);
			ITmfStateValue value = state.get(quark).getStateValue();
	        return value.unboxStr();
		} catch (AttributeNotFoundException e) {
			return null;
		} catch (StateSystemDisposedException e) {
			return null;
		}
	}
	
	/*
	public String queryActiveComponent(long ts, int pet, int stackLevel) {	
		
		ITmfStateSystem ss = getStateSystem();
		if (!ss.waitUntilBuilt(TIMEOUT)) {
			
		}
				
		try {
			int quark = ss.getQuarkAbsolute("active", "component", 
					String.valueOf(pet), String.valueOf(stackLevel));
			ITmfStateInterval val = ss.querySingleState(ts, quark);
			return val.getStateValue().unboxStr();			
		} catch (AttributeNotFoundException e) {
			return null;
		} catch (StateSystemDisposedException e) {
			return null;
		}
	}
	*/
	
	@Override
    public Iterable<IAnalysisOutput> getOutputs() {
    	List<IAnalysisOutput> toRet = new LinkedList<>();
    	toRet.add(new TmfAnalysisViewOutput(NUOPCMemUsageView.ID));
    	return toRet;
    }
}
