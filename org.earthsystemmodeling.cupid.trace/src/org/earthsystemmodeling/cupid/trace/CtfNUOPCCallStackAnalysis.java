package org.earthsystemmodeling.cupid.trace;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.tracecompass.tmf.core.analysis.IAnalysisModule;
import org.eclipse.tracecompass.tmf.core.analysis.IAnalysisOutput;
import org.eclipse.tracecompass.tmf.core.callstack.CallStackAnalysis;
import org.eclipse.tracecompass.tmf.core.exceptions.TmfAnalysisException;
import org.eclipse.tracecompass.tmf.core.statesystem.ITmfStateProvider;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ctf.core.trace.CtfTmfTrace;
import org.eclipse.tracecompass.tmf.ui.analysis.TmfAnalysisViewOutput;

public class CtfNUOPCCallStackAnalysis extends CallStackAnalysis {

   
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
    
    @Override
    protected Iterable<IAnalysisModule> getDependentAnalyses() {   	
    	List<IAnalysisModule> deps = new LinkedList<>();
    	super.getDependentAnalyses().forEach(m->{deps.add(m);});
    	
    	IAnalysisModule toAdd = 
    			TmfTraceUtils.getAnalysisModuleOfClass(getTrace(), CtfNUOPCStateSystemAnalysisModule.class, CtfNUOPCStateSystemAnalysisModule.ID);
	
    	deps.add(toAdd);
    	return deps;
    }
    
    @Override
    public Iterable<IAnalysisOutput> getOutputs() {
    	List toRet = new LinkedList<>();
    	//toRet.addAll(super.getOutputs());
    	toRet.add(new TmfAnalysisViewOutput(NUOPCCallStackView.ID));
    	return toRet;
    }
    
    
    

}

