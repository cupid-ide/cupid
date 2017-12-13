package org.earthsystemmodeling.cupid.trace.callgraph;

import java.util.List;
import java.util.stream.Collectors;

import org.earthsystemmodeling.cupid.trace.statistics.AbstractCalledFunction;
import org.earthsystemmodeling.cupid.trace.statistics.AggregatedCalledFunction;
import org.earthsystemmodeling.cupid.trace.statistics.CalledFunctionFactory;
import org.earthsystemmodeling.cupid.trace.statistics.ThreadNode;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.tracecompass.common.core.StreamUtils;
import org.eclipse.tracecompass.statesystem.core.statevalue.TmfStateValue;
import org.eclipse.tracecompass.tmf.core.analysis.IAnalysisModule;
import org.eclipse.tracecompass.tmf.core.analysis.IAnalysisOutput;
import org.eclipse.tracecompass.tmf.core.analysis.TmfAbstractAnalysisModule;
import org.eclipse.tracecompass.tmf.core.callstack.CallStackAnalysis;
import org.eclipse.tracecompass.tmf.core.exceptions.TmfAnalysisException;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceManager;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ui.analysis.TmfAnalysisViewOutput;

import com.google.common.collect.ImmutableList;

public class NUOPCAggGraphAnalysis extends TmfAbstractAnalysisModule {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCAggGraphAnalysis";
	
	@Override
    protected Iterable<IAnalysisModule> getDependentAnalyses() {
        return TmfTraceManager.getTraceSet(getTrace()).stream()
                .flatMap(trace -> StreamUtils.getStream(TmfTraceUtils.getAnalysisModulesOfClass(trace, NUOPCCtfCallGraphAnalysis.class)))
                .distinct().collect(Collectors.toList());
    }

	private AggregatedCalledFunction fRoot;
	
	@Override
	protected boolean executeAnalysis(IProgressMonitor monitor) throws TmfAnalysisException {
		ITmfTrace trace = getTrace();
        if (monitor == null || trace == null) {
            return false;
        }
        Iterable<IAnalysisModule> dependentAnalyses = getDependentAnalyses();
        for (IAnalysisModule module : dependentAnalyses) {
            if (!(module instanceof CallStackAnalysis)) {
                return false;
            }
            module.schedule();
        }
        dependentAnalyses.forEach((t) -> t.waitForCompletion(monitor));
    
        AbstractCalledFunction initSegment = CalledFunctionFactory.create(0, 0, 0, TmfStateValue.nullValue(), 0, null);
        fRoot = new AggregatedCalledFunction(initSegment, null);
        
        for (IAnalysisModule module : dependentAnalyses) {
        	NUOPCCtfCallGraphAnalysis callgraphModule = (NUOPCCtfCallGraphAnalysis) module;
        	List<ThreadNode> threadNodes = callgraphModule.getThreadNodes();
        }
        
        monitor.worked(1);
        monitor.done();
        return true;
	}
	
	private void processThreadNode(ThreadNode node) {
		for (AggregatedCalledFunction child : node.getChildren()) {
			//fRoot.addChild(child., aggregatedChild);
		}
	}
	
	@Override
	protected void canceling() {
	
	}

	@Override
    public Iterable<IAnalysisOutput> getOutputs() {
    	return ImmutableList.of(new TmfAnalysisViewOutput(NUOPCGlobalStatisticsTreeView.ID));    	
    }
	
	
}
