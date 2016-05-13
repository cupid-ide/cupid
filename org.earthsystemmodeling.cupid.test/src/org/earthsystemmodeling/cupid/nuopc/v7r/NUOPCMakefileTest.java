package org.earthsystemmodeling.cupid.nuopc.v7r;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.earthsystemmodeling.cupid.NUOPC.Application;
import org.earthsystemmodeling.cupid.NUOPC.Driver;
import org.earthsystemmodeling.cupid.NUOPC.Model;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCFactory;
import org.earthsystemmodeling.cupid.test.TestHelpers;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.Test;

public class NUOPCMakefileTest {

	private static NUOPCFactory factory = NUOPCFactory.eINSTANCE;
	private static NullProgressMonitor NPM = new NullProgressMonitor();
	
	@Test
	public void GenerateMakefile() throws CoreException, IOException, InterruptedException {
		
		IProject p = TestHelpers.createEmptyFortranProject(NUOPCTest.NUOPC_TAG + "_GenerateMakefile");
		IFile fDriverEsm = TestHelpers.createBlankFile(p, "esm.F90");
		IFile fModelAtm = TestHelpers.createBlankFile(p, "atm.F90");
		IFile fModelOcn = TestHelpers.createBlankFile(p, "ocn.F90");
		IFile fMain = TestHelpers.createBlankFile(p, "esmApp.F90");
		IFile fMakefile = TestHelpers.createBlankFile(p, "Makefile");
		
		Driver esm = factory.createDriver(); 
		Model atm = factory.createModel();
		Model ocn = factory.createModel();
		Application app = factory.createApplication();
		app.setName("esmApp");
		
		atm.getAdvance().add(factory.createAdvance());
		ocn.getAdvance().add(factory.createAdvance());
		
		app.getChildren().add(esm);
		app.getChildren().add(atm);
		app.getChildren().add(ocn);
				
		esm.setName("esm");
		atm.setName("atm");
		ocn.setName("ocn");
		
		esm.getChildren().add(atm);
		esm.getChildren().add(ocn);
		
		assertEquals(1, app.getChildren().size());
		assertEquals(2, esm.getChildren().size());
		
		NUOPCModel atmCodeConcept = NUOPCModel.newModel(fModelAtm, atm);
		NUOPCModel ocnCodeConcept = NUOPCModel.newModel(fModelOcn, ocn);
		NUOPCDriver esmCodeConcept = NUOPCDriver.newDriver(fDriverEsm, esm);
		
		atmCodeConcept.forward();
		atmCodeConcept.applyChanges(NPM);
		
		ocnCodeConcept.forward();
		ocnCodeConcept.applyChanges(NPM);
		
		esmCodeConcept.forward();
		esmCodeConcept.applyChanges(NPM);
		
		
		MakefileGenerator.generateAndWrite(app, fMakefile);
		String contents = IOUtils.toString(fMakefile.getContents());
		assertTrue(contents.contains("esm.o"));
		assertTrue(contents.contains("atm.o"));
		assertTrue(contents.contains("ocn.o"));
		
		//System.out.println(contents);
		
		MainGenerator.generateAndWrite(app, fMain);
		contents = IOUtils.toString(fMain.getContents());
		assertTrue(contents.contains("ESMF_Initialize"));
		assertTrue(contents.contains("esmApp"));
		assertTrue(contents.contains("ESMF_Finalize"));
		
		assertTrue("Compile check", TestHelpers.compileProject(p, NUOPCTest.ESMFMKFILE, ""));
		assertTrue("Execution check", TestHelpers.executeMPI(p, "./esmApp", 4));
		assertTrue("Log Error check", TestHelpers.verifyNoLogErrors(p));

	}
	
}
