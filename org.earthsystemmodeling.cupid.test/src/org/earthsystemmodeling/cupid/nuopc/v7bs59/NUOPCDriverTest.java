package org.earthsystemmodeling.cupid.nuopc.v7bs59;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCDriver.ModifyInitializePhaseMap;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCDriver.SetModelServices;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCDriver.SetModelServices_AddComp;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCDriver.SetRunClock;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCDriver.SetRunSequence;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCDriver.SetRunSequence_AddRunElement;
import org.earthsystemmodeling.cupid.test.TestHelpers;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ltk.core.refactoring.Change;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class NUOPCDriverTest {
	
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
	public void GenerateNUOPCDriverFromScratch() throws CoreException {
		IProject p = TestHelpers.createEmptyProject("GenerateNUOPCDriverFromScratch");
		IFile f = p.getFile("MyDriver1.F90");
		f.create(new ByteArrayInputStream(new byte[0]), true, new NullProgressMonitor());
		
		NUOPCDriver driver = new NUOPCDriver(f);
		driver.name = "MyDriver";
		driver = driver.fward();
		
		Change chg = driver.generateChange();
		chg.perform(NPM);
		
		//read in same driver just generated
		driver = new NUOPCDriver(f).reverse();
		
		assertNotNull(driver);
		assertEquals("MyDriver", driver.name);
		assertNotNull(driver.setServices);
		assertEquals("SetServices", driver.setServices.subroutineName);
		assertNotNull(driver.importESMF);
		assertNotNull(driver.importNUOPC);
		assertNotNull(driver.importNUOPCGeneric);

	}

	@Test
	public void NUOPCDriverAddRunSequence() throws IOException, CoreException, InterruptedException {
		
		IProject p = TestHelpers.createProjectFromFolder("target/ESMF_7_0_0_beta_snapshot_59/AtmOcnProto", "NUOPCDriverAddRunSequence");
		IFile f = p.getFile("esm.F90");
		
		NUOPCDriver driver = new NUOPCDriver(f).reverse();
		assertNotNull(driver);
		assertEquals("ESM", driver.name);
		assertNotNull(driver.setServices);
		assertEquals("SetServices", driver.setServices.subroutineName);
		assertNull(driver.initialization.initSpecs.setRunSequence);
		
		//add SetRunSequence specialization
		final String sname = "NewSetRunSequence";
		SetRunSequence srs = new SetRunSequence(driver.initialization.initSpecs);
		srs.subroutineName = sname;
		srs = (SetRunSequence) srs.fward();
		srs.generateChange().perform(NPM);
				
		//re-reverse
		driver = new NUOPCDriver(f).reverse();
		assertNotNull(driver);
		assertEquals("ESM", driver.name);
		assertNotNull(driver.setServices);
		assertEquals("SetServices", driver.setServices.subroutineName);
		assertNotNull(driver.initialization.initSpecs.setRunSequence);
		assertEquals(sname, driver.initialization.initSpecs.setRunSequence.subroutineName);
		
		//add RunElement
		SetRunSequence_AddRunElement srsare = new SetRunSequence_AddRunElement(driver.initialization.initSpecs.setRunSequence);
		srsare.compLabel = "MyCompLabel";
		srsare.slot = "1";
		srsare = srsare.fward();
		srsare.generateChange().perform(NPM);
		
		//re-reverse
		driver = new NUOPCDriver(f).reverse();
		assertNotNull(driver);
		assertEquals("ESM", driver.name);
		assertNotNull(driver.setServices);
		assertEquals("SetServices", driver.setServices.subroutineName);
		assertNotNull(driver.initialization.initSpecs.setRunSequence);
		assertEquals(sname, driver.initialization.initSpecs.setRunSequence.subroutineName);
		assertNotNull(driver.initialization.initSpecs.setRunSequence.runElements);
		assertEquals(1, driver.initialization.initSpecs.setRunSequence.runElements.size());
		
		SetRunSequence_AddRunElement re = driver.initialization.initSpecs.setRunSequence.runElements.get(0);
		assertEquals("MyCompLabel", re.compLabel);
		assertEquals("1", re.slot);
		
	}

	@Test
	public void NUOPCDriverAddRunSequence2() throws IOException, CoreException, InterruptedException {
		
		IProject p = TestHelpers.createProjectFromFolder("target/ESMF_7_0_0_beta_snapshot_59/AtmOcnProto", "NUOPCDriverAddRunSequence2");
		IFile f = p.getFile("esm.F90");
		
		NUOPCDriver driver = new NUOPCDriver(f).reverse();
		assertNotNull(driver);
		assertEquals("ESM", driver.name);
		assertNotNull(driver.setServices);
		assertEquals("SetServices", driver.setServices.subroutineName);
		assertNull(driver.initialization.initSpecs.setRunSequence);
		
		//add SetRunSequence specialization and two run element
		final String sname = "NewSetRunSequence";
		SetRunSequence srs = new SetRunSequence(driver.initialization.initSpecs);
		srs.subroutineName = sname;
		
		SetRunSequence_AddRunElement srsare = new SetRunSequence_AddRunElement(srs);
		srsare.compLabel = "MyCompLabel";
		srsare.slot = "1";
		SetRunSequence_AddRunElement srsare2 = new SetRunSequence_AddRunElement(srs);
		srsare2.compLabel = "AnotherCompLabel";
		srsare2.slot = "1";
		srsare2.phaseLabel = "ThisIsThePhase";
			
		srs = (SetRunSequence) srs.fward();
		srs.generateChange().perform(NPM);
				
		//re-reverse
		driver = new NUOPCDriver(f).reverse();
		assertNotNull(driver);
		assertEquals("ESM", driver.name);
		assertNotNull(driver.setServices);
		assertEquals("SetServices", driver.setServices.subroutineName);
		assertNotNull(driver.initialization.initSpecs.setRunSequence);
		assertEquals(sname, driver.initialization.initSpecs.setRunSequence.subroutineName);
		assertNotNull(driver.initialization.initSpecs.setRunSequence.runElements);
		assertEquals(2, driver.initialization.initSpecs.setRunSequence.runElements.size());
		
		SetRunSequence_AddRunElement re;
		re = driver.initialization.initSpecs.setRunSequence.runElements.get(0);
		assertEquals("MyCompLabel", re.compLabel);
		assertEquals("1", re.slot);
		assertNull(re.phaseLabel);
		assertNotNull(re.getASTRef());
		re = driver.initialization.initSpecs.setRunSequence.runElements.get(1);
		assertEquals("AnotherCompLabel", re.compLabel);
		assertEquals("1", re.slot);
		assertEquals("ThisIsThePhase", re.phaseLabel);
		assertNotNull(re.getASTRef());
		
		srs = driver.initialization.initSpecs.setRunSequence;
		
		//add connector run sequence element
		SetRunSequence_AddRunElement connElem = 
				new SetRunSequence_AddRunElement(srs);
		connElem.srcCompLabel = "ConnSrc";
		connElem.dstCompLabel = "ConnDst";
		connElem.slot = "1";
		
		//add link slot run sequence element
		SetRunSequence_AddRunElement slotLinkElem = 
				new SetRunSequence_AddRunElement(srs);
		slotLinkElem.slot = "1";
		slotLinkElem.linkSlot = "2";
		
		connElem.fward();
		slotLinkElem.fward();
		srs.generateChange().perform(NPM);
		
		//re-reverse
		driver = new NUOPCDriver(f).reverse();
		assertEquals(4, driver.initialization.initSpecs.setRunSequence.runElements.size());
		
		re = driver.initialization.initSpecs.setRunSequence.runElements.get(2);
		assertEquals("ConnSrc", re.srcCompLabel);
		assertEquals("ConnDst", re.dstCompLabel);
		assertEquals("1", re.slot);
		assertNotNull(re.getASTRef());
		
		re = driver.initialization.initSpecs.setRunSequence.runElements.get(3);
		assertEquals("1", re.slot);
		assertEquals("2", re.linkSlot);
		assertNotNull(re.getASTRef());
		
	}

	@Test
	public void NUOPCDriverAddSetModelServices() throws CoreException {
		
		IProject p = TestHelpers.createEmptyProject("NUOPCDriverAddSetModelServices");
		IFile f = TestHelpers.createBlankFile(p, "NewDriver.F90"); 
		
		NUOPCDriver driver = new NUOPCDriver(f);
		driver.name = "NewDriver";
		driver = driver.fward();  //generates basic implementation
		
		assertNotNull(driver.setServices);
		assertNotNull(driver.importESMF);
		assertNotNull(driver.importNUOPC);
		assertNotNull(driver.importNUOPCGeneric);
		assertNotNull(driver.initialization);
		assertNotNull(driver.initialization.initPhases);
		assertNotNull(driver.initialization.initSpecs);
		
		SetModelServices sms = new SetModelServices(driver.initialization.initSpecs);
		sms.subroutineName = "NewDriverSetModelServices";
		
		SetModelServices_AddComp smsac = new SetModelServices_AddComp(sms);
		smsac.compLabel = "FirstComp";
		smsac.compSetServices = "FirstCompSS";
		
		SetModelServices_AddComp smsac2 = new SetModelServices_AddComp(sms);
		smsac2.compLabel = "SecondComp";
		smsac2.compSetServices = "SecondCompSS";
		
		SetModelServices_AddComp smsac3 = new SetModelServices_AddComp(sms);
		smsac3.srcCompLabel = "FirstComp";
		smsac3.dstCompLabel = "SecondComp";
		smsac3.compSetServices = "cplSS";
				
		sms.fward();
		sms.generateChange().perform(NPM);
		
		driver = new NUOPCDriver(f).reverse();
		
		assertNotNull(driver);
		assertEquals("NewDriver", driver.name);
		assertNotNull(driver.setServices);
		assertEquals("SetServices", driver.setServices.subroutineName);
		assertNotNull(driver.importESMF);
		assertNotNull(driver.importNUOPC);
		assertNotNull(driver.importNUOPCGeneric);
		assertNotNull(driver.initialization);
		assertNotNull(driver.initialization.initPhases);
		assertNotNull(driver.initialization.initSpecs);
		assertNotNull(driver.initialization.initSpecs.setModelServices);
		assertNotNull(driver.initialization.initSpecs.setModelServices.setClock);
		assertNotNull(driver.initialization.initSpecs.setModelServices.addComps);
		assertEquals(3, driver.initialization.initSpecs.setModelServices.addComps.size());
		
		SetModelServices_AddComp ac;
		ac = driver.initialization.initSpecs.setModelServices.addComps.get(0);
		assertEquals("FirstComp", ac.compLabel);
		assertEquals("FirstCompSS", ac.compSetServices);
		
		ac = driver.initialization.initSpecs.setModelServices.addComps.get(1);
		assertEquals("SecondComp", ac.compLabel);
		assertEquals("SecondCompSS", ac.compSetServices);
		
		ac = driver.initialization.initSpecs.setModelServices.addComps.get(2);
		assertEquals("FirstComp", ac.srcCompLabel);
		assertEquals("SecondComp", ac.dstCompLabel);
		assertEquals("cplSS", ac.compSetServices);
		
	}
	
	@Test
	public void NUOPCDriverAddModifyIPM() throws IOException, CoreException {
		
		IProject p = TestHelpers.createProjectFromFolder("target/ESMF_7_0_0_beta_snapshot_59/AtmOcnProto", "NUOPCDriverAddModifyIPM");
		IFile f = p.getFile("esm.F90");
		
		NUOPCDriver driver = new NUOPCDriver(f).reverse();
		assertNotNull(driver);
		assertNotNull(driver.initialization);
		assertNotNull(driver.initialization.initSpecs);
		assertNull(driver.initialization.initSpecs.modifyInitializePhaseMap);
		
		ModifyInitializePhaseMap mipm = new ModifyInitializePhaseMap(driver.initialization.initSpecs);
		mipm.subroutineName = "ModifyInitializePhaseMap";
		mipm.fward();
		mipm.generateChange().perform(NPM);
		
		driver = driver.reverse();
		assertNotNull(driver);
		assertNotNull(driver.initialization);
		assertNotNull(driver.initialization.initSpecs);
		assertNotNull(driver.initialization.initSpecs.modifyInitializePhaseMap);
		assertEquals("ModifyInitializePhaseMap", driver.initialization.initSpecs.modifyInitializePhaseMap.subroutineName);
		
	}
	
	@Test
	public void NUOPCDriverAddSetRunClock() throws IOException, CoreException {
		
		IProject p = TestHelpers.createProjectFromFolder("target/ESMF_7_0_0_beta_snapshot_59/AtmOcnProto", "NUOPCDriverAddSetRunClock");
		IFile f = p.getFile("esm.F90");
		
		NUOPCDriver driver = new NUOPCDriver(f).reverse();
		assertNotNull(driver);
		assertNotNull(driver.run);
		assertNotNull(driver.run.runSpecs);
		assertNull(driver.run.runSpecs.setRunClock);
		
		SetRunClock src = new SetRunClock(driver.run.runSpecs);
		src.subroutineName = "SetRunClock";
		src.fward();
		src.generateChange().perform(NPM);
		
		driver = driver.reverse();
		assertNotNull(driver);
		assertNotNull(driver.run);
		assertNotNull(driver.run.runSpecs);
		assertNotNull(driver.run.runSpecs.setRunClock);
		assertEquals("SetRunClock", driver.run.runSpecs.setRunClock.subroutineName);
		
	}

	@Test
	public void NUOPCDriverReverse() {
		
		IFile f;
		f = PROJECT_NUOPC_PROTOTYPES.getFolder("AtmOcnProto").getFile("esm.F90");
				
		NUOPCDriver driver = new NUOPCDriver(f);
		driver = driver.reverse();
		assertNotNull(driver);
		assertEquals("ESM", driver.name);
		assertNotNull(driver.setServices);
		assertEquals("SetServices", driver.setServices.subroutineName);
		assertNotNull(driver.importESMF);
		assertNotNull(driver.importNUOPC);
		assertNotNull(driver.importNUOPCGeneric);
		assertNotNull(driver.initialization.initSpecs.setModelServices);
		assertNotNull(driver.initialization.initSpecs.setModelServices.addComps);
		assertEquals(4, driver.initialization.initSpecs.setModelServices.addComps.size());
		
		f = PROJECT_NUOPC_PROTOTYPES.getFolder("AtmOcnMedPetListTimescalesProto").getFile("esm.F90");
		driver = new NUOPCDriver(f).reverse();
		assertNotNull(driver);
		assertEquals("ESM", driver.name);
		assertNotNull(driver.setServices);
		assertEquals("SetServices", driver.setServices.subroutineName);
		assertNotNull(driver.importESMF);
		assertNotNull(driver.importNUOPC);
		assertNotNull(driver.importNUOPCGeneric);
		assertNotNull(driver.initialization.initSpecs.setModelServices);
		assertNotNull(driver.initialization.initSpecs.setModelServices.addComps);
		assertEquals(7, driver.initialization.initSpecs.setModelServices.addComps.size());
		
		//call NUOPC_DriverAddComp(driver, "ATM", atmSS, petList=petList, comp=child, rc=rc)
		SetModelServices_AddComp smsac;
		smsac = driver.initialization.initSpecs.setModelServices.addComps.get(0);
		assertEquals("\"ATM\"", smsac.compLabel);
		assertEquals("atmSS", smsac.compSetServices);
		
		//call NUOPC_DriverAddComp(driver, srcCompLabel="ATM", dstCompLabel="MED", compSetServicesRoutine=cplSS, rc=rc)
		smsac = driver.initialization.initSpecs.setModelServices.addComps.get(3);
		assertEquals("\"ATM\"", smsac.srcCompLabel);
		assertEquals("\"MED\"", smsac.dstCompLabel);
		assertEquals("cplSS", smsac.compSetServices);
		
		assertNotNull(driver.initialization.initSpecs.setRunSequence);
		assertNotNull(driver.initialization.initSpecs.setRunSequence.newRunSequence);
		assertNotNull(driver.initialization.initSpecs.setRunSequence.runElements);
		assertEquals(9, driver.initialization.initSpecs.setRunSequence.runElements.size());
		
		//0 call NUOPC_DriverAddRunElement(driver, slot=1, srcCompLabel="OCN", dstCompLabel="MED", rc=rc)
		SetRunSequence_AddRunElement srsare;
		srsare = driver.initialization.initSpecs.setRunSequence.runElements.get(0);
		assertEquals("1", srsare.slot);
		assertEquals("\"OCN\"", srsare.srcCompLabel);
		assertEquals("\"MED\"", srsare.dstCompLabel);
				
		//1 call NUOPC_DriverAddRunElement(driver, slot=1, compLabel="MED", rc=rc)
		srsare = driver.initialization.initSpecs.setRunSequence.runElements.get(1);
		assertEquals("1", srsare.slot);
		assertEquals("\"MED\"", srsare.compLabel);
				
		//4 call NUOPC_DriverAddRunElement(driver, slot=1, linkSlot=2, rc=rc)
		srsare = driver.initialization.initSpecs.setRunSequence.runElements.get(4);
		assertEquals("1", srsare.slot);
		assertEquals("2", srsare.linkSlot);
		assertNull(srsare.srcCompLabel);
		assertNull(srsare.dstCompLabel);
		assertNull(srsare.compLabel);
	}
	
	
}