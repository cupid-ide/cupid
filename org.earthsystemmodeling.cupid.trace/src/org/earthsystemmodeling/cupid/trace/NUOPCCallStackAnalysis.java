package org.earthsystemmodeling.cupid.trace;

import org.eclipse.tracecompass.tmf.core.exceptions.TmfAnalysisException;
import org.eclipse.tracecompass.tmf.core.statesystem.ITmfStateProvider;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.ui.views.callstack.AbstractCallStackAnalysis;

public class NUOPCCallStackAnalysis extends AbstractCallStackAnalysis {

   
    @Override
    public boolean setTrace(ITmfTrace trace) throws TmfAnalysisException {
        if (!(trace instanceof NUOPCTrace)) {
            return false;
        }
        return super.setTrace(trace);
    }

    @Override
    protected NUOPCTrace getTrace() {
        return (NUOPCTrace) super.getTrace();
    }

    @Override
    protected ITmfStateProvider createStateProvider() {
        return new NUOPCCallStackStateProvider(getTrace());
    }
    
    
    

}

