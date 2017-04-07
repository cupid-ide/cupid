package org.earthsystemmodeling.cupid.trace;

import java.util.List;

import org.eclipse.tracecompass.statesystem.core.ITmfStateSystem;
import org.eclipse.tracecompass.statesystem.core.exceptions.AttributeNotFoundException;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateSystemDisposedException;
import org.eclipse.tracecompass.statesystem.core.interval.ITmfStateInterval;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.tmf.core.statesystem.ITmfStateProvider;
import org.eclipse.tracecompass.tmf.core.statesystem.TmfStateSystemAnalysisModule;
import org.eclipse.tracecompass.tmf.ctf.core.trace.CtfTmfTrace;

public class CtfNUOPCStateSystemAnalysisModule extends TmfStateSystemAnalysisModule {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.CtfNUOPCStateSystemAnalysisModule";
	
	@Override
	protected ITmfStateProvider createStateProvider() {
		return new CtfNUOPCStateProvider((CtfTmfTrace) getTrace());
	}
	
	@Override
	protected StateSystemBackendType getBackendType() {
		return StateSystemBackendType.FULL;
	}
	
	@Override
	public String getName() {
		return "CTF NUOPC State System Analysis";
	}
		
	public String queryComponentName(long vmid, long baseid) {	
		ITmfStateSystem ss = getStateSystem();
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
	
	public String queryComponentInit(long vmid, long baseid, long phase) {	
		ITmfStateSystem ss = getStateSystem();
		long endts = ss.getCurrentEndTime();
		String id = vmid + "-" + baseid;
		try {
			int quark = ss.getQuarkAbsolute("component", id, "init", String.valueOf(phase));
			List<ITmfStateInterval> state = ss.queryFullState(endts);
			ITmfStateValue value = state.get(quark).getStateValue();
	        return value.unboxStr();
		} catch (AttributeNotFoundException e) {
			return null;
		} catch (StateSystemDisposedException e) {
			return null;
		}
	}
	
	
}
