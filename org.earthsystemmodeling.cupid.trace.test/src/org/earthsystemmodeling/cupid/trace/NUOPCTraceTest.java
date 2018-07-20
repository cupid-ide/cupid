package org.earthsystemmodeling.cupid.trace;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.earthsystemmodeling.cupid.trace.callstack.NUOPCCtfCallStackAnalysis;
import org.earthsystemmodeling.cupid.trace.state.NUOPCCtfStateSystemAnalysisModule;
import org.earthsystemmodeling.cupid.trace.statistics.GlobalNode;
import org.earthsystemmodeling.cupid.trace.statistics.ThreadNode;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystem;
import org.eclipse.tracecompass.statesystem.core.exceptions.AttributeNotFoundException;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateSystemDisposedException;
import org.eclipse.tracecompass.statesystem.core.interval.ITmfStateInterval;
import org.eclipse.tracecompass.tmf.core.exceptions.TmfAnalysisException;
import org.eclipse.tracecompass.tmf.core.exceptions.TmfTraceException;
import org.eclipse.tracecompass.tmf.core.signal.TmfTraceOpenedSignal;
import org.eclipse.tracecompass.tmf.core.trace.ITmfContext;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceManager;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceUtils;
import org.eclipse.tracecompass.tmf.ctf.core.event.CtfTmfEvent;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class NUOPCTraceTest {

	private static Bundle MY_BUNDLE = FrameworkUtil.getBundle(NUOPCTraceTest.class);
	private static NullProgressMonitor NPM = new NullProgressMonitor();

	@Rule
	public Timeout globalTimeout = new Timeout(120, TimeUnit.SECONDS);
	
	@BeforeClass
	public static void setUp() throws CoreException, IOException, InterruptedException {
	}
	
	@AfterClass
	public static void tearDown() throws CoreException {
	}
	
	@Test
	public void TraceAndAnalyzeComponentNames() throws IOException, CoreException, InterruptedException, TmfTraceException, TmfAnalysisException, AttributeNotFoundException, StateSystemDisposedException {
		
		IProject p = TestHelpers.createFortranProjectFromFolder("target/ESMF_7_1_0r/AtmOcnMedProto", "Trace_AtmOcnMedProto");
		String esmfmkfile = TestHelpers.getMakefileFragmentLoc("ESMF_7_1_0r");
		
		if (TestHelpers.isWindows()) return;
		
		assertTrue("Compile trace project", TestHelpers.compileProject(p, esmfmkfile, "esmApp"));
		Map<String,String> envMap = new HashMap<>();
		envMap.put("ESMF_RUNTIME_TRACE", "ON");
		assertTrue("Execute trace project", TestHelpers.executeMPI(p, "esmApp", 4, envMap));
		assertTrue("Execution has no log errors", TestHelpers.verifyNoLogErrors(p));
			
		p.refreshLocal(IResource.DEPTH_INFINITE, NPM);
		
		IFolder traceFolder = p.getFolder("traceout");
		assertTrue("Trace output folder exists", traceFolder.exists());
		
		String tracePath = traceFolder.getLocation().toString();
		NUOPCCtfTrace trace = new NUOPCCtfTrace();
		trace.initTrace(null, tracePath, CtfTmfEvent.class);
		
		trace.traceOpened(new TmfTraceOpenedSignal(this, trace, null));
		
		NUOPCCtfStateSystemAnalysisModule analysis = 
				TmfTraceUtils.getAnalysisModuleOfClass(trace, NUOPCCtfStateSystemAnalysisModule.class, NUOPCCtfStateSystemAnalysisModule.ID);
					
        IStatus status = analysis.schedule();
        assertTrue(status.isOK());
        assertTrue(analysis.waitForCompletion());
        
        ITmfStateSystem stateSystem = analysis.getStateSystem();
        assertNotNull(stateSystem);
        
        
        long end = stateSystem.getCurrentEndTime();
        
        /*
        int quark = stateSystem.getQuarkAbsolute("component", "1-1", "name");
        ITmfStateInterval state = stateSystem.querySingleState(end, quark);
        assertEquals("OCN", state.getStateValue().unboxStr());
        
        quark = stateSystem.getQuarkAbsolute("component", "1-0", "name");
        state = stateSystem.querySingleState(end, quark);
        assertEquals("ATM", state.getStateValue().unboxStr());
        
        quark = stateSystem.getQuarkAbsolute("component", "1-2", "name");
        state = stateSystem.querySingleState(end, quark);
        assertEquals("MED", state.getStateValue().unboxStr());
        */
        
        analysis.dispose();
		trace.dispose();
		
	}
	
		
	@Test
	public void TraceAndAnalyzeComponentTiming() throws IOException, CoreException, InterruptedException, TmfTraceException, TmfAnalysisException, AttributeNotFoundException, StateSystemDisposedException {
		
		IProject p = TestHelpers.createFortranProjectFromFolder("target/ESMF_7_1_0r/AtmOcnLndProto", "Trace_TimingTest");
		String esmfmkfile = TestHelpers.getMakefileFragmentLoc("ESMF_7_1_0r");
		
		if (TestHelpers.isWindows()) return;
		
		assertTrue("Compile trace project", TestHelpers.compileProject(p, esmfmkfile, "esmApp"));
		Map<String,String> envMap = new HashMap<>();
		envMap.put("ESMF_RUNTIME_TRACE", "ON");
		assertTrue("Execute trace project", TestHelpers.executeMPI(p, "esmApp", 4, envMap));
		assertTrue("Execution has no log errors", TestHelpers.verifyNoLogErrors(p));
			
		p.refreshLocal(IResource.DEPTH_INFINITE, NPM);
		
		IFolder traceFolder = p.getFolder("traceout");
		assertTrue("Trace output folder exists", traceFolder.exists());
		
		String tracePath = traceFolder.getLocation().toString();
		NUOPCCtfTrace trace = new NUOPCCtfTrace();
		trace.initTrace(null, tracePath, CtfTmfEvent.class);
		trace.traceOpened(new TmfTraceOpenedSignal(this, trace, null));		
		
		NUOPCCtfCallStackAnalysis analysis = 
				TmfTraceUtils.getAnalysisModuleOfClass(trace, NUOPCCtfCallStackAnalysis.class, NUOPCCtfCallStackAnalysis.ID);
						
		IStatus status = analysis.schedule();
		assertTrue(status.isOK());
        assertTrue(analysis.waitForCompletion());
        
		List<ThreadNode> threadNodes = analysis.getAggregateThreadNodes();
        assertTrue("Four thread nodes", threadNodes.size() == 4);
        
        //all four threads identical
        for (ThreadNode node : threadNodes) {
        	assertTrue(node.getChildren().size() == 3);
        	assertTrue(node.getChildren().stream().anyMatch(func -> func.getSymbol().toString().contains("Init #1")));
        	assertTrue(node.getChildren().stream().anyMatch(func -> func.getSymbol().toString().contains("RunPhase1")));
        	assertTrue(node.getChildren().stream().anyMatch(func -> func.getSymbol().toString().contains("FinalizePhase1")));
        }
       
        analysis.dispose();
		trace.dispose();
		
	}
	
	@Test
	public void TestLoadTrace1() throws IOException, CoreException, TmfTraceException, TmfAnalysisException, AttributeNotFoundException, StateSystemDisposedException {
			
		NUOPCCtfTrace trace = loadTrace("traces/trace1");
                
		NUOPCCtfStateSystemAnalysisModule analysis = 
				TmfTraceUtils.getAnalysisModuleOfClass(trace, 
						NUOPCCtfStateSystemAnalysisModule.class, 
						NUOPCCtfStateSystemAnalysisModule.ID);
        
        analysis.schedule();
        assertTrue(analysis.waitForCompletion());
        
        ITmfStateSystem stateSystem = analysis.getStateSystem();
        assertNotNull(stateSystem);
        
		NUOPCCtfCallStackAnalysis analysis2 = 
				TmfTraceUtils.getAnalysisModuleOfClass(trace, 
						NUOPCCtfCallStackAnalysis.class, 
						NUOPCCtfCallStackAnalysis.ID);

		analysis2.schedule();
        assertTrue(analysis2.waitForCompletion());
        GlobalNode globalNode = analysis2.getGlobalStatistics();
        assertEquals(3, globalNode.getChildren().size());
               
        analysis.dispose();
        analysis2.dispose();
        trace.dispose();
		
	}
	
	@Test
	public void TestLoadTrace2() throws IOException, CoreException, TmfTraceException, TmfAnalysisException, AttributeNotFoundException, StateSystemDisposedException {
			
		NUOPCCtfTrace trace = loadTrace("traces/trace2");
                
		NUOPCCtfStateSystemAnalysisModule analysis = 
				TmfTraceUtils.getAnalysisModuleOfClass(trace, 
						NUOPCCtfStateSystemAnalysisModule.class, 
						NUOPCCtfStateSystemAnalysisModule.ID);
        
        analysis.schedule();
        assertTrue(analysis.waitForCompletion());
        
        ITmfStateSystem stateSystem = analysis.getStateSystem();
        assertNotNull(stateSystem);
        
		NUOPCCtfCallStackAnalysis analysis2 = 
				TmfTraceUtils.getAnalysisModuleOfClass(trace, 
						NUOPCCtfCallStackAnalysis.class, 
						NUOPCCtfCallStackAnalysis.ID);

		analysis2.schedule();
        assertTrue(analysis2.waitForCompletion());
        GlobalNode globalNode = analysis2.getGlobalStatistics();
        assertEquals(3, globalNode.getChildren().size());
               
        analysis.dispose();
        analysis2.dispose();
        trace.dispose();
		
	}
	
	private NUOPCCtfTrace loadTrace(String tracePath) throws IOException, TmfTraceException {
		
        tracePath = FileLocator.toFileURL(FileLocator.find(MY_BUNDLE, new Path(tracePath), null)).getPath();	            
        
		NUOPCCtfTrace trace = new NUOPCCtfTrace();
		trace.initTrace(null, tracePath, CtfTmfEvent.class);
			
		ITmfContext context = trace.seekEvent(0);
        CtfTmfEvent result = trace.getNext(context);
        assertNotNull(result);
        context.dispose();
        
        trace.traceOpened(new TmfTraceOpenedSignal(this, trace, null));
        return trace;
	}
	
	
	@SuppressWarnings("unused")
	private static void deleteSuppFiles(ITmfTrace trace) {
        /* Remove supplementary files */
        File suppDir = new File(TmfTraceManager.getSupplementaryFileDir(trace));
        for (File file : suppDir.listFiles()) {
            file.delete();
        }
    }
	
	
	
	
}
