package org.earthsystemmodeling.cupid.nuopc.v7r;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URL;

import org.earthsystemmodeling.cupid.NUOPC.Application;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.handlers.GenerateNUOPCApplicationJob;
import org.earthsystemmodeling.cupid.test.TestHelpers;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

public class NUOPCAppsTest {

	private static NullProgressMonitor NPM = new NullProgressMonitor();
	
	@Test
	public void NUOPCApps() throws CoreException, OperationCanceledException, InterruptedException, IOException {
	
		String[] appsToTest = {
			"templates/SingleModelWithDriver/SingleModelWithDriver.nuopc",
			"templates/AtmOcnProto/AtmOcnProto.nuopc",
			"templates/AtmOcnMedProto/AtmOcnMedProto.nuopc"
		};
		
		for (String appFile : appsToTest) {
			URL fileURL = CupidActivator.getFileURL(appFile);
			URI fileURI = URI.createFileURI(fileURL.getFile());
		
			ResourceSet resSet = new ResourceSetImpl();
			Resource res = resSet.getResource(fileURI, true);
			Application app = (Application) res.getContents().get(0);	
			
			String fileFrag = fileURI.lastSegment().replaceAll(".nuopc", "");
			IProject p = TestHelpers.createEmptyFortranProject("NUOPCAppsTest_" + fileFrag);
			
			GenerateNUOPCApplicationJob job = new GenerateNUOPCApplicationJob("Generate", app, p, false);
			job.schedule();
			assertTrue("Wait on app generation", job.join(15*1000, NPM));
			
			assertTrue("Compile check: " + p.getLocation(), TestHelpers.compileProject(p, NUOPCTest.ESMFMKFILE, "all"));
			assertTrue("Execution check: " + p.getLocation(), TestHelpers.executeMPI(p, fileFrag, 4));
			assertTrue("Log check: " + p.getLocation(), TestHelpers.verifyNoLogErrors(p));
		}
		
	}
	
	
}
