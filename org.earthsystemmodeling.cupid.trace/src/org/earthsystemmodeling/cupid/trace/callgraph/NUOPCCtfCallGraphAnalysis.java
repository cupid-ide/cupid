package org.earthsystemmodeling.cupid.trace.callgraph;


import org.eclipse.tracecompass.internal.analysis.timing.core.callgraph.CallGraphAnalysis;
import org.eclipse.tracecompass.tmf.core.analysis.IAnalysisOutput;
import org.eclipse.tracecompass.tmf.ui.analysis.TmfAnalysisViewOutput;

import com.google.common.collect.ImmutableList;

public class NUOPCCtfCallGraphAnalysis extends CallGraphAnalysis {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.CallGraphAnalysis";
	
	@Override
    public Iterable<IAnalysisOutput> getOutputs() {
    	return ImmutableList.of(new TmfAnalysisViewOutput(NUOPCFlameGraphTreeView.ID));    	
    }
}
