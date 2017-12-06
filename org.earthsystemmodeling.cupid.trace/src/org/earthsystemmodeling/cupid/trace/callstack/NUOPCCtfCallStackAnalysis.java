package org.earthsystemmodeling.cupid.trace.callstack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.trace.callgraph.AbstractCalledFunction;
import org.earthsystemmodeling.cupid.trace.callgraph.AggregatedCalledFunction;
import org.earthsystemmodeling.cupid.trace.callgraph.CalledFunctionFactory;
import org.earthsystemmodeling.cupid.trace.callgraph.NUOPCAggGraphTreeView;
import org.earthsystemmodeling.cupid.trace.callgraph.NUOPCPerPETGraphTreeView;
import org.earthsystemmodeling.cupid.trace.callgraph.ThreadNode;
import org.earthsystemmodeling.cupid.trace.state.NUOPCCtfStateSystemAnalysisModule;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.tmf.core.analysis.IAnalysisModule;
import org.eclipse.tracecompass.tmf.core.analysis.IAnalysisOutput;
import org.eclipse.tracecompass.tmf.core.callstack.CallStackAnalysis;
import org.eclipse.tracecompass.tmf.core.exceptions.TmfAnalysisException;
import org.eclipse.tracecompass.tmf.core.statesystem.ITmfStateProvider;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceManager;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ctf.core.trace.CtfTmfTrace;
import org.eclipse.tracecompass.tmf.ui.analysis.TmfAnalysisViewOutput;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class NUOPCCtfCallStackAnalysis extends CallStackAnalysis {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCCtfCallStackAnalysis";
	
	private List<ThreadNode> fThreadNodes = new ArrayList<ThreadNode>();
	
    @Override
    public boolean setTrace(ITmfTrace trace) throws TmfAnalysisException {
        if (!(trace instanceof CtfTmfTrace)) {
            return false;
        }
        return super.setTrace(trace);
    }

    @Override
	public CtfTmfTrace getTrace() {
       return (CtfTmfTrace) super.getTrace();
    }

    @Override
    protected ITmfStateProvider createStateProvider() {    	
    	return NUOPCCtfCallStackStateProvider.newInstance(getTrace(), this);
    }
        
    @Override
    protected Iterable<IAnalysisModule> getDependentAnalyses() {   	
    	IAnalysisModule toAdd = 
    			TmfTraceUtils.getAnalysisModuleOfClass(getTrace(), NUOPCCtfStateSystemAnalysisModule.class, NUOPCCtfStateSystemAnalysisModule.ID);
    	if (toAdd == null) {
    		CupidActivator.log("NUOPCCtfCallStackAnalysis: Cannot find NUOPC analysis module.");
    	}
    	return Lists.newArrayList(toAdd);
    }

    @Override
    protected boolean executeAnalysis(@Nullable IProgressMonitor monitor) {
    	fThreadNodes.clear();
    	boolean success = super.executeAnalysis(monitor);   	
    	if (success) {
    		if (getBackendType() == StateSystemBackendType.FULL) {
    			
    			/* analysis produced a new set of statistics, so cache to file */
    			if (fThreadNodes.size() > 0) {
    				FileOutputStream fos = null;
					try {
						fos = new FileOutputStream(getPerPetStatsFile());
					} catch (FileNotFoundException e) {
						CupidActivator.log("Error writing per pet statistics to file", e);					
						return false;
					}
    	            try {
						ObjectOutputStream out = new ObjectOutputStream(fos);
						out.writeInt(fThreadNodes.size());
						for (ThreadNode node : fThreadNodes) {
							out.writeObject(node);
						}
						out.close();
						fos.close();
					} catch (IOException e) {
						CupidActivator.log("Error writing per pet statistics to file", e);
						return false;
					}   	            
    			}
    			/* if stats file exists, read it in */
    			else if (getPerPetStatsFile().exists()) {
    				FileInputStream fis = null;
					try {
						fis = new FileInputStream(getPerPetStatsFile());
					} catch (FileNotFoundException e) {
						CupidActivator.log("Error reading per pet statistics from file", e);
						return false;
					}
    				ObjectInputStream in = null;
					try {
						in = new ObjectInputStream(fis);
					} catch (IOException e) {
						CupidActivator.log("Error reading per pet statistics from file", e);
						try {
							fis.close();
						} catch (IOException e1) {
							//ignore
						}
						return false;
					}

    				try {
						int size = in.readInt();
						for (int i = 0; i < size; i++) {
	    					ThreadNode node = (ThreadNode) in.readObject();
	    					fThreadNodes.add(node);
	    				}
						in.close();
						fis.close();
					} catch (IOException | ClassNotFoundException e) {
						CupidActivator.log("Error reading per pet statistics from file", e);
						fThreadNodes.clear();
						return false;
					}
    			}
    		}
    	}
    	return success;
    }
    
    private @Nullable File getPerPetStatsFile() {
        ITmfTrace trace = getTrace();
        if (trace == null) {
            return null;
        }
        String directory = TmfTraceManager.getSupplementaryFileDir(trace);
        File file = new File(directory + "perpet.stats");
        return file;
    }  
        
    public List<ThreadNode> getAggregateThreadNodes() {
        return ImmutableList.copyOf(fThreadNodes);
    }
    
    protected synchronized void addThreadNode(ThreadNode node) {
    	fThreadNodes.add(node);
    }
    
    public List<ThreadNode> getGlobalAggregateThreadNode() {
    	AbstractCalledFunction initSegment = CalledFunctionFactory.create(0, 0, 0, "root", -1, null);
        ThreadNode init = new ThreadNode(initSegment, 0, -1);
        for (ThreadNode node : fThreadNodes) {
        	for (AggregatedCalledFunction aggFunc : node.getChildren()) {
        		init.addChild(aggFunc.clone(), node.getId(), true);
        	}
        }
        return ImmutableList.of(init);
    }
    
    
    @Override
    public Iterable<IAnalysisOutput> getOutputs() {
    	return ImmutableList.of(new TmfAnalysisViewOutput(NUOPCCallStackView.ID), 
    							new TmfAnalysisViewOutput(NUOPCPerPETGraphTreeView.ID),
    							new TmfAnalysisViewOutput(NUOPCAggGraphTreeView.ID));    	
    }
    
    
    

}

