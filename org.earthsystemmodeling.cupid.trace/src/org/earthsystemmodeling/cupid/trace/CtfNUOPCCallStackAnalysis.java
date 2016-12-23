package org.earthsystemmodeling.cupid.trace;

import org.eclipse.tracecompass.tmf.core.exceptions.TmfAnalysisException;
import org.eclipse.tracecompass.tmf.core.statesystem.ITmfStateProvider;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.ctf.core.trace.CtfTmfTrace;
import org.eclipse.tracecompass.tmf.ui.views.callstack.AbstractCallStackAnalysis;

public class CtfNUOPCCallStackAnalysis extends AbstractCallStackAnalysis {

   
    @Override
    public boolean setTrace(ITmfTrace trace) throws TmfAnalysisException {
        if (!(trace instanceof CtfTmfTrace)) {
            return false;
        }
        return super.setTrace(trace);
    }

    @Override
    protected CtfTmfTrace getTrace() {
       return (CtfTmfTrace) super.getTrace();
    }

    @Override
    protected ITmfStateProvider createStateProvider() {
       return new CtfNUOPCCallStackStateProvider(getTrace());
    }
    
    
    

}

