package org.earthsystemmodeling.cupid.nuopc.v7bs59;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCMediator.IPD.AdvertiseField;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCMediator.IPD.IPDv04p1;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCMediator.IPD.IPDv04p3;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCMediator.IPD.RealizeField;
import org.earthsystemmodeling.cupid.test.TestHelpers;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ltk.core.refactoring.Change;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class NUOPCMediatorTest {
	
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
	public void NUOPCMediatorReverse() {
		
		IFile f;
		f = PROJECT_NUOPC_PROTOTYPES.getFolder("AtmOcnMedProto").getFile("med.F90");
				
		NUOPCMediator mediator = new NUOPCMediator(f).reverse();
		assertNotNull(mediator);
		assertEquals("MED", mediator.name);
		assertNotNull(mediator.setServices);
		assertEquals("SetServices", mediator.setServices.subroutineName);
		assertNotNull(mediator.importESMF);
		assertNotNull(mediator.importNUOPC);
		assertNotNull(mediator.importNUOPCGeneric);
		assertNotNull(mediator.initialization);
		assertNotNull(mediator.initialization.initPhases);
		assertNotNull(mediator.initialization.initPhases.ipdv00);
		assertNotNull(mediator.initialization.initPhases.ipdv00.ipdv00p1);
		assertNotNull(mediator.initialization.initPhases.ipdv00.ipdv00p1.advertiseFields);
		assertEquals(6, mediator.initialization.initPhases.ipdv00.ipdv00p1.advertiseFields.size());
		
		AdvertiseField af;
		af = mediator.initialization.initPhases.ipdv00.ipdv00p1.advertiseFields.get(0);
		assertEquals("\"sea_surface_temperature\"", af.standardName);
		assertEquals("importState", af.state);
		af = mediator.initialization.initPhases.ipdv00.ipdv00p1.advertiseFields.get(1);
		assertEquals("\"air_pressure_at_sea_level\"", af.standardName);
		assertEquals("importState", af.state);
		af = mediator.initialization.initPhases.ipdv00.ipdv00p1.advertiseFields.get(2);
		assertEquals("\"surface_net_downward_shortwave_flux\"", af.standardName);
		assertEquals("importState", af.state);
		af = mediator.initialization.initPhases.ipdv00.ipdv00p1.advertiseFields.get(3);
		assertEquals("\"sea_surface_temperature\"", af.standardName);
		assertEquals("exportState", af.state);
		af = mediator.initialization.initPhases.ipdv00.ipdv00p1.advertiseFields.get(4);
		assertEquals("\"air_pressure_at_sea_level\"", af.standardName);
		assertEquals("exportState", af.state);
		af = mediator.initialization.initPhases.ipdv00.ipdv00p1.advertiseFields.get(5);
		assertEquals("\"surface_net_downward_shortwave_flux\"", af.standardName);
		assertEquals("exportState", af.state);
				
		assertNotNull(mediator.initialization.initPhases.ipdv00.ipdv00p2);
		assertNotNull(mediator.initialization.initPhases.ipdv00.ipdv00p2.realizeFields);
		assertEquals(6, mediator.initialization.initPhases.ipdv00.ipdv00p2.realizeFields.size());
		
		RealizeField rf;
		rf = mediator.initialization.initPhases.ipdv00.ipdv00p2.realizeFields.get(0);
		assertEquals("field", rf.field);
		assertEquals("importState", rf.state);
		rf = mediator.initialization.initPhases.ipdv00.ipdv00p2.realizeFields.get(1);
		assertEquals("field", rf.field);
		assertEquals("importState", rf.state);
		rf = mediator.initialization.initPhases.ipdv00.ipdv00p2.realizeFields.get(2);
		assertEquals("field", rf.field);
		assertEquals("importState", rf.state);
		rf = mediator.initialization.initPhases.ipdv00.ipdv00p2.realizeFields.get(3);
		assertEquals("field", rf.field);
		assertEquals("exportState", rf.state);
		rf = mediator.initialization.initPhases.ipdv00.ipdv00p2.realizeFields.get(4);
		assertEquals("field", rf.field);
		assertEquals("exportState", rf.state);
		rf = mediator.initialization.initPhases.ipdv00.ipdv00p2.realizeFields.get(5);
		assertEquals("field", rf.field);
		assertEquals("exportState", rf.state);
		
		assertNotNull(mediator.run.runSpecs.mediatorAdvance);
		assertEquals(1, mediator.run.runSpecs.mediatorAdvance.size());
		assertEquals("MediatorAdvance", mediator.run.runSpecs.mediatorAdvance.get(0).subroutineName);
		assertNotNull(mediator.run.runSpecs.mediatorAdvance.get(0).registration);
		assertEquals("mediator", mediator.run.runSpecs.mediatorAdvance.get(0).paramGridComp);
		assertEquals("rc", mediator.run.runSpecs.mediatorAdvance.get(0).paramRC);
		
		/////////////////
		
		f = PROJECT_NUOPC_PROTOTYPES.getFolder("AtmOcnMedPetListTimescalesSplitFastProto").getFile("med.F90");
		
		mediator = new NUOPCMediator(f).reverse();
		assertNotNull(mediator);
		assertEquals("MED", mediator.name);
		assertNotNull(mediator.setServices);
		assertEquals("SetServices", mediator.setServices.subroutineName);
		assertNotNull(mediator.importESMF);
		assertNotNull(mediator.importNUOPC);
		assertNotNull(mediator.importNUOPCGeneric);
		
		assertNotNull(mediator.run.runSpecs.checkImport);
		assertEquals(2, mediator.run.runSpecs.checkImport.size());
		assertEquals("CheckImport_fast_before", mediator.run.runSpecs.checkImport.get(0).subroutineName);
		assertNotNull(mediator.run.runSpecs.checkImport.get(0).registration);
		assertEquals("gcomp", mediator.run.runSpecs.checkImport.get(0).paramGridComp);
		assertEquals("rc", mediator.run.runSpecs.checkImport.get(0).paramRC);
		
		assertEquals("CheckImport_fast_after", mediator.run.runSpecs.checkImport.get(1).subroutineName);
		assertNotNull(mediator.run.runSpecs.checkImport.get(1).registration);
		assertEquals("gcomp", mediator.run.runSpecs.checkImport.get(1).paramGridComp);
		assertEquals("rc", mediator.run.runSpecs.checkImport.get(1).paramRC);
		
		assertNotNull(mediator.run.runSpecs.setRunClock);
		assertEquals(3, mediator.run.runSpecs.setRunClock.size());
		assertEquals("SetRunClock_slow", mediator.run.runSpecs.setRunClock.get(0).subroutineName);
		assertNotNull(mediator.run.runSpecs.setRunClock.get(0).registration);
		assertEquals("gcomp", mediator.run.runSpecs.setRunClock.get(0).paramGridComp);
		assertEquals("rc", mediator.run.runSpecs.setRunClock.get(0).paramRC);
		
		assertEquals("SetRunClock_fast_before", mediator.run.runSpecs.setRunClock.get(1).subroutineName);
		assertNotNull(mediator.run.runSpecs.setRunClock.get(1).registration);
		assertEquals("gcomp", mediator.run.runSpecs.setRunClock.get(1).paramGridComp);
		assertEquals("rc", mediator.run.runSpecs.setRunClock.get(1).paramRC);
		
		assertEquals("SetRunClock_fast_after", mediator.run.runSpecs.setRunClock.get(2).subroutineName);
		assertNotNull(mediator.run.runSpecs.setRunClock.get(2).registration);
		assertEquals("gcomp", mediator.run.runSpecs.setRunClock.get(2).paramGridComp);
		assertEquals("rc", mediator.run.runSpecs.setRunClock.get(2).paramRC);
		
		assertNotNull(mediator.run.runSpecs.timestampExport);
		assertEquals(2, mediator.run.runSpecs.timestampExport.size());
		assertEquals("TimestampExport_fast_before", mediator.run.runSpecs.timestampExport.get(0).subroutineName);
		assertNotNull(mediator.run.runSpecs.timestampExport.get(0).registration);
		assertEquals("gcomp", mediator.run.runSpecs.timestampExport.get(0).paramGridComp);
		assertEquals("rc", mediator.run.runSpecs.timestampExport.get(0).paramRC);
		
		assertEquals("TimestampExport_fast_after", mediator.run.runSpecs.timestampExport.get(1).subroutineName);
		assertNotNull(mediator.run.runSpecs.timestampExport.get(1).registration);
		assertEquals("gcomp", mediator.run.runSpecs.timestampExport.get(1).paramGridComp);
		assertEquals("rc", mediator.run.runSpecs.timestampExport.get(1).paramRC);
		
		assertNotNull(mediator.run.runSpecs.mediatorAdvance);
		assertEquals(3, mediator.run.runSpecs.mediatorAdvance.size());
		assertEquals("MediatorAdvance_slow", mediator.run.runSpecs.mediatorAdvance.get(0).subroutineName);
		assertNotNull(mediator.run.runSpecs.mediatorAdvance.get(0).registration);
		assertEquals("gcomp", mediator.run.runSpecs.mediatorAdvance.get(0).paramGridComp);
		assertEquals("rc", mediator.run.runSpecs.mediatorAdvance.get(0).paramRC);
		
		assertEquals("MediatorAdvance_fast_before", mediator.run.runSpecs.mediatorAdvance.get(1).subroutineName);
		assertNotNull(mediator.run.runSpecs.mediatorAdvance.get(1).registration);
		assertEquals("gcomp", mediator.run.runSpecs.mediatorAdvance.get(1).paramGridComp);
		assertEquals("rc", mediator.run.runSpecs.mediatorAdvance.get(1).paramRC);
		
		assertEquals("MediatorAdvance_fast_after", mediator.run.runSpecs.mediatorAdvance.get(2).subroutineName);
		assertNotNull(mediator.run.runSpecs.mediatorAdvance.get(2).registration);
		assertEquals("gcomp", mediator.run.runSpecs.mediatorAdvance.get(2).paramGridComp);
		assertEquals("rc", mediator.run.runSpecs.mediatorAdvance.get(2).paramRC);
		
		assertNull(mediator.initialization.initSpecs.dataInitialize);
				
	}
	
	@Test
	public void GenerateNUOPCMediatorFromScratch() throws CoreException, IOException, InterruptedException {
		IProject p = TestHelpers.createEmptyProject("GenerateNUOPCMediatorFromScratch");
		IFile f = TestHelpers.createBlankFile(p, "MyMediator.F90"); 
		
		NUOPCMediator mediator = new NUOPCMediator(f);
		mediator.name = "MyMediator";
		mediator = mediator.fward();
		
		Change chg = mediator.generateChange();
		chg.perform(NPM);
		
		//read in same driver just generated
		mediator = new NUOPCMediator(f).reverse();
		
		assertNotNull(mediator);
		assertEquals("MyMediator", mediator.name);
		assertNotNull(mediator.setServices);
		assertEquals("SetServices", mediator.setServices.subroutineName);
		assertNotNull(mediator.importESMF);
		assertNotNull(mediator.importNUOPC);
		assertNotNull(mediator.importNUOPCGeneric);
		
		
		IPDv04p1 ipdv04p1 = new IPDv04p1(mediator.initialization.initPhases.ipdv04);
		assertNotNull(mediator.initialization.initPhases.ipdv04.ipdv04p1);
		
		AdvertiseField af = new AdvertiseField(ipdv04p1);
		assertEquals(af, ipdv04p1.advertiseFields.get(0));
		af.standardName = "\"donkey\"";
		af.state = "importState";
		
		af = new AdvertiseField(ipdv04p1);
		assertEquals(af, ipdv04p1.advertiseFields.get(1));
		af.standardName = "\"sea_surface_temperature\"";
		af.state = "exportState";
		
		ipdv04p1.fward();
		chg = ipdv04p1.generateChange();
		chg.perform(NPM);
		
		mediator = new NUOPCMediator(f).reverse();
		assertNotNull(mediator);
		assertEquals(2, mediator.initialization.initPhases.ipdv04.ipdv04p1.advertiseFields.size());
		assertEquals("\"donkey\"", mediator.initialization.initPhases.ipdv04.ipdv04p1.advertiseFields.get(0).standardName);
		assertEquals("importState", mediator.initialization.initPhases.ipdv04.ipdv04p1.advertiseFields.get(0).state);
		assertEquals("\"sea_surface_temperature\"", mediator.initialization.initPhases.ipdv04.ipdv04p1.advertiseFields.get(1).standardName);
		assertEquals("exportState", mediator.initialization.initPhases.ipdv04.ipdv04p1.advertiseFields.get(1).state);

		IPDv04p3 ipdv04p3 = new IPDv04p3(mediator.initialization.initPhases.ipdv04);
		assertNotNull(mediator.initialization.initPhases.ipdv04.ipdv04p3);
		
		RealizeField rf = new RealizeField(ipdv04p3);
		assertEquals(rf, ipdv04p3.realizeFields.get(0));
		rf.field = "myfield1";
		rf.state = "importState";
		
		rf = new RealizeField(ipdv04p3);
		assertEquals(rf, ipdv04p3.realizeFields.get(1));
		rf.field = "myfield2";
		rf.state = "exportState";
		
		ipdv04p3.fward();
		chg = ipdv04p3.generateChange();
		chg.perform(NPM);
		
		mediator = new NUOPCMediator(f).reverse();
		assertNotNull(mediator);
		assertEquals(2, mediator.initialization.initPhases.ipdv04.ipdv04p3.realizeFields.size());
		assertEquals("myfield1", mediator.initialization.initPhases.ipdv04.ipdv04p3.realizeFields.get(0).field);
		assertEquals("importState", mediator.initialization.initPhases.ipdv04.ipdv04p3.realizeFields.get(0).state);
		assertEquals("myfield2", mediator.initialization.initPhases.ipdv04.ipdv04p3.realizeFields.get(1).field);
		assertEquals("exportState", mediator.initialization.initPhases.ipdv04.ipdv04p3.realizeFields.get(1).state);
		
		
		///compile check
		TestHelpers.copyFileIntoProject(p, "workspace/Makefile");
		assertTrue("Compile check", TestHelpers.compileProject(p, TestHelpers.getMakefileFragmentLoc(NUOPCTest.NUOPC_TAG), "*.o"));
	}
	
	
}
