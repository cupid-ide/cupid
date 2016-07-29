package org.earthsystemmodeling.cupid.trace;

import java.util.List;

import org.eclipse.tracecompass.statesystem.core.exceptions.AttributeNotFoundException;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateSystemDisposedException;
import org.eclipse.tracecompass.statesystem.core.interval.ITmfStateInterval;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.statesystem.core.statevalue.TmfStateValue;
import org.eclipse.tracecompass.tmf.core.statesystem.ITmfStateProvider;
import org.eclipse.tracecompass.tmf.core.statesystem.TmfStateSystemAnalysisModule;

public class NUOPCStateSystemAnalysisModule extends TmfStateSystemAnalysisModule {

	@Override
	protected ITmfStateProvider createStateProvider() {
		return new NUOPCStateProvider((NUOPCTrace) getTrace());
	}
	
	
	@Override
	protected StateSystemBackendType getBackendType() {
		return StateSystemBackendType.INMEM;
	}
	
	
	@Override
	public String getName() {
		return "NUOPC State System Analysis";
	}
	
	public ITmfStateValue myQuery(long ts) {
		int quark;
		try {
			quark = getStateSystem().getQuarkAbsolute("ATM", "currentPhase");
			List<ITmfStateInterval> state = getStateSystem().queryFullState(ts);
	        ITmfStateValue value = state.get(quark).getStateValue();
	        return value;
		} catch (AttributeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (StateSystemDisposedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       return TmfStateValue.nullValue();
	}

}
