package org.earthsystemmodeling.cupid.nuopc.v7r;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.List;

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
		PROJECT_NUOPC_PROTOTYPES = TestHelpers.createProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG, NUOPCTest.NUOPC_TAG);
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
		manager.ensureDBIsUpToDate();
		
		List<NUOPCDriver> driverList = manager.listAllDrivers();
		for (NUOPCDriver d : driverList) {
			System.out.println("Driver: " + d.name);
		}
		assertEquals(2, driverList.size());
		assertNotNull(manager.findDriverForFile(p1.getFile("esm.F90")));
		assertNotNull(manager.findDriverForFile(p2.getFile("esm.F90")));
		
		List<NUOPCModel> modelList = manager.listAllModels();
		for (NUOPCModel m : modelList) {
			System.out.println("Model: " + m.name);
		}
		assertEquals(5, modelList.size());
		assertNotNull(manager.findModelForFile(p1.getFile("atm.F90")));
		assertNotNull(manager.findModelForFile(p1.getFile("ocn.F90")));
		assertNotNull(manager.findModelForFile(p2.getFile("atm.F90")));
		assertNotNull(manager.findModelForFile(p2.getFile("ocn.F90")));
		assertNotNull(manager.findModelForFile(p2.getFile("lnd.F90")));
		
		
		List<NUOPCMediator> mediatorList = manager.listAllMediators();
		for (NUOPCMediator m : mediatorList) {
			System.out.println("Mediator: " + m.name);
		}
		assertEquals(0, mediatorList.size());
				
		
		
		p1.delete(true, true, NPM);
		p2.delete(true, true, NPM);
		
	}
	
}
