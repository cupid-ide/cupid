package org.earthsystemmodeling.cupid.trace;

import static org.junit.Assert.*;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystem;
import org.eclipse.tracecompass.statesystem.core.exceptions.AttributeNotFoundException;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateSystemDisposedException;
import org.eclipse.tracecompass.statesystem.core.interval.ITmfStateInterval;
import org.eclipse.tracecompass.tmf.core.exceptions.TmfAnalysisException;
import org.eclipse.tracecompass.tmf.core.exceptions.TmfTraceException;
import org.eclipse.tracecompass.tmf.core.statistics.TmfStatisticsEventTypesModule;
import org.eclipse.tracecompass.tmf.core.statistics.TmfStatisticsTotalsModule;
import org.eclipse.tracecompass.tmf.core.trace.ITmfContext;
import org.eclipse.tracecompass.tmf.ctf.core.event.CtfTmfEvent;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class NUOPCTraceTest {

	private static Bundle MY_BUNDLE = FrameworkUtil.getBundle(NUOPCTraceTest.class);
		
	@BeforeClass
	public static void setUp() throws CoreException, IOException, InterruptedException {
	}
	
	@AfterClass
	public static void tearDown() throws CoreException {
	}
	
	//this is just a sanity check right now
	@Test(timeout=30000)
	public void TestLoadTrace() throws IOException, CoreException, TmfTraceException, TmfAnalysisException, AttributeNotFoundException, StateSystemDisposedException {
			
		String tracePath;
        try {
        	tracePath = FileLocator.toFileURL(FileLocator.find(MY_BUNDLE, new Path("traces/trace1"), null)).getPath();	            
        } catch (IOException e) {
            throw new IllegalStateException();
        }
		
		NUOPCCtfTrace trace = new NUOPCCtfTrace();
		trace.initTrace(null, tracePath, CtfTmfEvent.class);
			
		ITmfContext context = trace.seekEvent(0);
        CtfTmfEvent result = trace.getNext(context);
        assertNotNull(result);
        context.dispose();
        
        NUOPCCtfStateSystemAnalysisModule analysis =  new NUOPCCtfStateSystemAnalysisModule();
        assertTrue(analysis.setTrace(trace));
        
        analysis.schedule();
        assertTrue(analysis.waitForCompletion());
        
        ITmfStateSystem stateSystem = analysis.getStateSystem();
        assertNotNull(stateSystem);
        
        long end = stateSystem.getCurrentEndTime();
        int quark = stateSystem.getQuarkAbsolute("component", "1-1", "name");
        
        ITmfStateInterval state = stateSystem.querySingleState(end, quark);
        assertEquals("OCN", state.getStateValue().unboxStr());
         
        analysis.dispose();
        trace.dispose();
		
	}
	
	
	
	
	
}
