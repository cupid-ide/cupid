package org.earthsystemmodeling.cupid.nuopc.v7bs59;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCModel.IPD.AdvertiseField;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCModel.IPD.RealizeField;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCModel.SetRunClock;
import org.earthsystemmodeling.cupid.test.TestHelpers;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ltk.core.refactoring.Change;
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
				
		NUOPCModel model = new NUOPCModel(f).reverse();
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
		
		/////////////////
		
		f = PROJECT_NUOPC_PROTOTYPES.getFolder("AtmOcnRtmTwoTimescalesProto").getFile("ocn.F90");
		
		model = new NUOPCModel(f).reverse();
		assertNotNull(model);
		assertEquals("OCN", model.modelName);
		assertNotNull(model.setServices);
		assertEquals("SetServices", model.setServices.subroutineName);
		assertNotNull(model.importESMF);
		assertNotNull(model.importNUOPC);
		assertNotNull(model.importNUOPCGeneric);
		
		assertNotNull(model.initialization.initSpecs.setClock);
		assertEquals("SetClock", model.initialization.initSpecs.setClock.subroutineName);
		assertNotNull(model.initialization.initSpecs.setClock.registration);
		assertEquals("model", model.initialization.initSpecs.setClock.paramGridComp);
		assertEquals("rc", model.initialization.initSpecs.setClock.paramRC);
		
		assertNotNull(model.run.runSpecs.checkImport);
		assertEquals(1, model.run.runSpecs.checkImport.size());
		assertEquals("CheckImport", model.run.runSpecs.checkImport.get(0).subroutineName);
		assertNotNull(model.run.runSpecs.checkImport.get(0).registration);
		assertEquals("model", model.run.runSpecs.checkImport.get(0).paramGridComp);
		assertEquals("rc", model.run.runSpecs.checkImport.get(0).paramRC);
		
		assertNotNull(model.run.runSpecs.modelAdvance);
		assertEquals(1, model.run.runSpecs.modelAdvance.size());
		assertEquals("ModelAdvance", model.run.runSpecs.modelAdvance.get(0).subroutineName);
		assertNotNull(model.run.runSpecs.modelAdvance.get(0).registration);
		assertEquals("model", model.run.runSpecs.modelAdvance.get(0).paramGridComp);
		assertEquals("rc", model.run.runSpecs.modelAdvance.get(0).paramRC);
		
		assertNull(model.initialization.initSpecs.dataInitialize);
		assertEquals(0, model.run.runSpecs.setRunClock.size());
		
		//////////////////
		
		f = PROJECT_NUOPC_PROTOTYPES.getFolder("AtmOcnImplicitProto").getFile("atm.F90");

		model = new NUOPCModel(f).reverse();
		assertNotNull(model);
		assertEquals("ATM", model.modelName);
		assertNotNull(model.setServices);
		assertNotNull(model.importESMF);
		assertNotNull(model.importNUOPC);
		assertNotNull(model.importNUOPCGeneric);
		
		assertNotNull(model.run.runSpecs.setRunClock);
		assertEquals(2, model.run.runSpecs.setRunClock.size());
		
		SetRunClock src;
		src = model.run.runSpecs.setRunClock.get(0);
		assertEquals("SetRunClock_down", src.subroutineName);
		assertEquals("\"down\"", src.specPhaseLabel);
		assertNotNull(src.registration);
		assertEquals("model", src.paramGridComp);
		assertEquals("rc", src.paramRC);
		
		src = model.run.runSpecs.setRunClock.get(1);
		assertEquals("SetRunClock_up", src.subroutineName);
		assertEquals("\"up\"", src.specPhaseLabel);
		assertNotNull(src.registration);
		assertEquals("model", src.paramGridComp);
		assertEquals("rc", src.paramRC);
		
		//////////////////
				
		f = PROJECT_NUOPC_PROTOTYPES.getFolder("AtmOcnTransferGridProto").getFile("atm.F90");
		
		model = new NUOPCModel(f).reverse();
		assertNotNull(model);
		assertEquals("ATM", model.modelName);
		assertNotNull(model.setServices);
		assertNotNull(model.importESMF);
		assertNotNull(model.importNUOPC);
		assertNotNull(model.importNUOPCGeneric);
		
		assertNotNull(model.initialization.initSpecs.dataInitialize);
		assertEquals("DataInitialize", model.initialization.initSpecs.dataInitialize.subroutineName);
		assertNotNull(model.initialization.initSpecs.dataInitialize.registration);
		assertEquals("model", model.initialization.initSpecs.dataInitialize.paramGridComp);
		assertEquals("rc", model.initialization.initSpecs.dataInitialize.paramRC);
		
		assertNull(model.initialization.initSpecs.setClock);
		
	}
	
	@Test
	public void GenerateNUOPCModelFromScratch() throws CoreException {
		IProject p = TestHelpers.createEmptyProject("GenerateNUOPCModelFromScratch");
		IFile f = p.getFile("MyModel.F90");
		f.create(new ByteArrayInputStream(new byte[0]), true, new NullProgressMonitor());
		
		NUOPCModel model = new NUOPCModel(f);
		model.modelName = "MyModel";
		model = model.fward();
		
		Change chg = model.generateChange();
		chg.perform(NPM);
		
		//read in same driver just generated
		model = new NUOPCModel(f).reverse();
		
		assertNotNull(model);
		assertEquals("MyModel", model.modelName);
		assertNotNull(model.setServices);
		assertEquals("SetServices", model.setServices.subroutineName);
		assertNotNull(model.importESMF);
		assertNotNull(model.importNUOPC);
		assertNotNull(model.importNUOPCGeneric);

	}
	
	
}
