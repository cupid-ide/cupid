package org.earthsystemmodeling.cupid.nuopc.v7bs59;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCModel.IPD.AdvertiseField;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCModel.IPD.RealizeField;
import org.earthsystemmodeling.cupid.test.TestHelpers;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class NUOPCModelTest {
	
	private static IProject PROJECT_NUOPC_PROTOTYPES;
	private static NullProgressMonitor NPM = new NullProgressMonitor();
	
	@BeforeClass
	public static void setUp() throws CoreException, IOException, InterruptedException {
		PROJECT_NUOPC_PROTOTYPES = TestHelpers.createProjectFromFolder("target/ESMF_7_0_0_beta_snapshot_59", "ESMF_7_0_0_beta_snapshot_59");
	}
	
	@AfterClass
	public static void tearDown() throws CoreException {
		PROJECT_NUOPC_PROTOTYPES.delete(true, true, null);
	}

	@Test
	public void NUOPCModelReverse() {
		
		IFile f;
		f = PROJECT_NUOPC_PROTOTYPES.getFolder("AtmOcnProto").getFile("atm.F90");
				
		NUOPCModel model = new NUOPCModel(f);
		model = model.reverse();
		assertNotNull(model);
		assertEquals("ATM", model.modelName);
		assertNotNull(model.setServices);
		assertEquals("SetServices", model.setServices.subroutineName);
		assertNotNull(model.importESMF);
		assertNotNull(model.importNUOPC);
		assertNotNull(model.importNUOPCGeneric);
		assertNotNull(model.initialization);
		assertNotNull(model.initialization.initPhases);
		assertNotNull(model.initialization.initPhases.ipdv00);
		assertNotNull(model.initialization.initPhases.ipdv00.ipdv00p1);
		assertNotNull(model.initialization.initPhases.ipdv00.ipdv00p1.advertiseFields);
		assertEquals(3, model.initialization.initPhases.ipdv00.ipdv00p1.advertiseFields.size());
		
		AdvertiseField af;
		af = model.initialization.initPhases.ipdv00.ipdv00p1.advertiseFields.get(0);
		assertEquals("\"sea_surface_temperature\"", af.standardName);
		assertEquals("importState", af.state);
		af = model.initialization.initPhases.ipdv00.ipdv00p1.advertiseFields.get(1);
		assertEquals("\"air_pressure_at_sea_level\"", af.standardName);
		assertEquals("exportState", af.state);
		af = model.initialization.initPhases.ipdv00.ipdv00p1.advertiseFields.get(2);
		assertEquals("\"surface_net_downward_shortwave_flux\"", af.standardName);
		assertEquals("exportState", af.state);
				
		assertNotNull(model.initialization.initPhases.ipdv00.ipdv00p2);
		assertNotNull(model.initialization.initPhases.ipdv00.ipdv00p2.realizeFields);
		assertEquals(3, model.initialization.initPhases.ipdv00.ipdv00p2.realizeFields.size());
		
		RealizeField rf;
		rf = model.initialization.initPhases.ipdv00.ipdv00p2.realizeFields.get(0);
		assertEquals("field", rf.field);
		assertEquals("importState", rf.state);
		rf = model.initialization.initPhases.ipdv00.ipdv00p2.realizeFields.get(1);
		assertEquals("field", rf.field);
		assertEquals("exportState", rf.state);
		rf = model.initialization.initPhases.ipdv00.ipdv00p2.realizeFields.get(2);
		assertEquals("field", rf.field);
		assertEquals("exportState", rf.state);
		
		
	}
	
	
}
