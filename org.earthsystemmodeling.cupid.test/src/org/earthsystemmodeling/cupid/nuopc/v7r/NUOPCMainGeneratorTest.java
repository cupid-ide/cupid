package org.earthsystemmodeling.cupid.nuopc.v7r;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.earthsystemmodeling.cupid.NUOPC.Application;
import org.earthsystemmodeling.cupid.NUOPC.Driver;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCFactory;
import org.earthsystemmodeling.cupid.test.TestHelpers;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.Test;

public class NUOPCMainGeneratorTest {

	private static NUOPCFactory factory = NUOPCFactory.eINSTANCE;
	private static NullProgressMonitor NPM = new NullProgressMonitor();
	
	@Test
	public void GenerateMainProgram() throws CoreException, IOException, InterruptedException {
		
		IProject p = TestHelpers.createEmptyFortranProject(NUOPCTest.NUOPC_TAG + "_GenerateMainProgram");
		IFile fDriverEsm = TestHelpers.createBlankFile(p, "esm.F90");
		IFile fMain = TestHelpers.createBlankFile(p, "myapp.F90");
		
		Driver esm = factory.createDriver(); 
		Application app = factory.createApplication();
		app.setName("myapp");
		app.getChildren().add(esm);
		esm.setName("esm");
		
		//NUOPCDriver esmCodeConcept = NUOPCDriver.newDriver(fDriverEsm, esm);
		//esmCodeConcept.forward(NPM);
		
		MainGenerator.generateAndWrite(app, fMain);
		
		String contents = IOUtils.toString(fMain.getContents());
		assertTrue(contents.contains("ESMF_Initialize"));
		assertTrue(contents.contains("myapp"));
		assertTrue(contents.contains("ESMF_Finalize"));
		
		//System.out.println(contents);
		
		//String makeTargets[] = {"atm.o", "ocn.o", "esm.o"};
		//assertTrue("Compile check", TestHelpers.compileProject(p, NUOPCTest.ESMFMKFILE, ""));

	}
	
}
