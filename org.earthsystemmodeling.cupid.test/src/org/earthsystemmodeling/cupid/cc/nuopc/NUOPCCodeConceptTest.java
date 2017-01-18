package org.earthsystemmodeling.cupid.cc.nuopc;

import java.io.IOException;

import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.CodeConceptManager;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCTest;
import org.earthsystemmodeling.cupid.test.TestHelpers;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class NUOPCCodeConceptTest {

	private static IProject PROJECT_NUOPC_PROTOTYPES;
	private static NullProgressMonitor NPM = new NullProgressMonitor();
	
	@BeforeClass
	public static void setUp() throws CoreException, IOException, InterruptedException {
		PROJECT_NUOPC_PROTOTYPES = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG, NUOPCTest.NUOPC_TAG);	
	}
	
	@AfterClass
	public static void tearDown() throws CoreException {
		PROJECT_NUOPC_PROTOTYPES.delete(true, true, NPM);
	}
	
	@Test
	public void ReverseNUOPCDriver() throws IOException, CoreException {
		
		NUOPC NUOPC_DEF = NUOPC.getInstance();
		
		System.out.println(NUOPC_DEF.NUOPCComponent);
		System.out.println(NUOPC_DEF.NUOPCDriver);
		
		IProject p = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnProto", NUOPCTest.NUOPC_TAG + "_AtmOcnProto");
		IFile f = p.getFile("esm.F90");
		
		//CodeConceptInstance i = NUOPC_DEF.NUOPCDriverFromFile.fromFile(f);
		CodeConceptManager manager = CodeConceptManager.getInstance();
		CodeConceptInstance cci = manager.reverse(NUOPC_DEF.NUOPCDriver, f);
		System.out.println(cci);
		
	}
	
}
