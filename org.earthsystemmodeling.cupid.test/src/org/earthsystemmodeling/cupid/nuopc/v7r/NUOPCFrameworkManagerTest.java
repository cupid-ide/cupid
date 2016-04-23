package org.earthsystemmodeling.cupid.nuopc.v7r;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.NUOPCFrameworkDB;
import org.earthsystemmodeling.cupid.test.TestHelpers;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class NUOPCFrameworkManagerTest {

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
	public void NUOPCFrameworkManager() throws IOException, CoreException {
		
		IProject p1 = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnProto", NUOPCTest.NUOPC_TAG + "_FM_AtmOcnProto");
		IProject p2 = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnLndProto", NUOPCTest.NUOPC_TAG + "_FM_AtmOcnLndProto");
			
		NUOPCFrameworkManager manager = NUOPCFrameworkManager.getInstance();
		NUOPCFrameworkDB db = manager.db;
		
		assertTrue(db.isOutOfDate(p1.getFile("esm.F90")));
		assertTrue(db.isOutOfDate(p2.getFile("esm.F90")));
		assertTrue(db.isOutOfDate(p1.getFile("atm.F90")));
		assertTrue(db.isOutOfDate(p1.getFile("ocn.F90")));
		assertTrue(db.isOutOfDate(p2.getFile("atm.F90")));
		assertTrue(db.isOutOfDate(p2.getFile("ocn.F90")));
		assertTrue(db.isOutOfDate(p2.getFile("lnd.F90")));
		
		CodeConcept<?,?> concept;
		concept = manager.acquireConcept(p1.getFile("esm.F90"));
		assertFalse(db.isOutOfDate(p1.getFile("esm.F90")));
		assertTrue(concept instanceof NUOPCDriver);
		
		concept = manager.acquireConcept(p2.getFile("esm.F90"));
		assertFalse(db.isOutOfDate(p2.getFile("esm.F90")));
		assertTrue(concept instanceof NUOPCDriver);
		
		p2.getFile("esm.F90").touch(NPM);
		assertTrue(db.isOutOfDate(p2.getFile("esm.F90")));
		
		concept = manager.acquireConcept(p2.getFile("esm.F90"));
		assertFalse(db.isOutOfDate(p2.getFile("esm.F90")));
		assertTrue(concept instanceof NUOPCDriver);
			
		concept = manager.acquireConcept(p1.getFile("atm.F90"));
		assertFalse(db.isOutOfDate(p1.getFile("atm.F90")));
		assertTrue(concept instanceof NUOPCModel);
		
		concept = manager.acquireConcept(p1.getFile("ocn.F90"));
		assertFalse(db.isOutOfDate(p1.getFile("ocn.F90")));
		assertTrue(concept instanceof NUOPCModel);
		
		concept = manager.acquireConcept(p2.getFile("atm.F90"));
		assertFalse(db.isOutOfDate(p2.getFile("atm.F90")));
		assertTrue(concept instanceof NUOPCModel);
		
		concept = manager.acquireConcept(p2.getFile("ocn.F90"));
		assertFalse(db.isOutOfDate(p2.getFile("ocn.F90")));
		assertTrue(concept instanceof NUOPCModel);
		
		concept = manager.acquireConcept(p2.getFile("lnd.F90"));
		assertFalse(db.isOutOfDate(p2.getFile("lnd.F90")));
		assertTrue(concept instanceof NUOPCModel);
				
		p1.delete(true, true, NPM);
		p2.delete(true, true, NPM);
		
	}
	
}
