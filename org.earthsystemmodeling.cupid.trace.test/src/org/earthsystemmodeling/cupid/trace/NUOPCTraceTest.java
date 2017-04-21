package org.earthsystemmodeling.cupid.trace;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystem;
import org.eclipse.tracecompass.statesystem.core.exceptions.AttributeNotFoundException;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateSystemDisposedException;
import org.eclipse.tracecompass.statesystem.core.interval.ITmfStateInterval;
import org.eclipse.tracecompass.tmf.core.exceptions.TmfAnalysisException;
import org.eclipse.tracecompass.tmf.core.exceptions.TmfTraceException;
import org.eclipse.tracecompass.tmf.core.trace.ITmfContext;
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
	public Timeout globalTimeout = new Timeout(30, TimeUnit.SECONDS);
	
	@BeforeClass
	public static void setUp() throws CoreException, IOException, InterruptedException {
	}
	
	@AfterClass
	public static void tearDown() throws CoreException {
	}
	
	@Test
	public void TraceAndAnalyze() throws IOException, CoreException, InterruptedException, TmfTraceException, TmfAnalysisException, AttributeNotFoundException, StateSystemDisposedException {
		
		IProject p = TestHelpers.createFortranProjectFromFolder("target/ESMF_7_0_0/AtmOcnMedProto", "Trace_AtmOcnMedProto");
		String esmfmkfile = TestHelpers.getMakefileFragmentLoc("ESMF_7_0_0");
		
		assertTrue("Compile trace project", TestHelpers.compileProject(p, esmfmkfile, "esmApp"));
		Map<String,String> envMap = new HashMap<>();
		envMap.put("ESMF_RUNTIME_TRACE", "ON");
		assertTrue("Execute trace project", TestHelpers.executeMPI(p, "esmApp", 4, envMap));
		assertTrue("Execution has no log errors", TestHelpers.verifyNoLogErrors(p));
		
		//TODO: turn on below when we have a snapshot with binary trace on
		/*
		p.refreshLocal(IResource.DEPTH_INFINITE, NPM);
		
		IFolder traceFolder = p.getFolder("traceout");
		assertTrue("Trace output folder exists", traceFolder.exists());
		
		String tracePath = traceFolder.getLocation().toString();
		NUOPCCtfTrace trace = new NUOPCCtfTrace();
		trace.initTrace(null, tracePath, CtfTmfEvent.class);
		
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
        
        quark = stateSystem.getQuarkAbsolute("component", "1-0", "name");
        state = stateSystem.querySingleState(end, quark);
        assertEquals("ATM", state.getStateValue().unboxStr());
        
        quark = stateSystem.getQuarkAbsolute("component", "1-2", "name");
        state = stateSystem.querySingleState(end, quark);
        assertEquals("MED", state.getStateValue().unboxStr());
                  
        analysis.dispose();
		trace.dispose();
		*/
	}
	
	//this is just a sanity check right now
	@Test
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
