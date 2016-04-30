package org.earthsystemmodeling.cupid.nuopc.v7r;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.earthsystemmodeling.cupid.NUOPC.Application;
import org.earthsystemmodeling.cupid.NUOPC.Connector;
import org.earthsystemmodeling.cupid.NUOPC.Driver;
import org.earthsystemmodeling.cupid.NUOPC.ESMF_STAGGERLOC;
import org.earthsystemmodeling.cupid.NUOPC.Field;
import org.earthsystemmodeling.cupid.NUOPC.Mediator;
import org.earthsystemmodeling.cupid.NUOPC.Model;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCFactory;
import org.earthsystemmodeling.cupid.NUOPC.UniformGrid;
import org.earthsystemmodeling.cupid.nuopc.ReverseEngineerException;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCDriver.ModifyInitializePhaseMap;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCDriver.SetModelServices;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCDriver.SetModelServices_AddComp;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCDriver.SetRunClock;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCDriver.SetRunSequence;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCDriver.SetRunSequence_AddRunElement;
import org.earthsystemmodeling.cupid.test.TestHelpers;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.photran.internal.core.parser.ASTVarOrFnRefNode;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("restriction")
public class NUOPCDriverTest {
	
	private static IProject PROJECT_NUOPC_PROTOTYPES;
	private static NullProgressMonitor NPM = new NullProgressMonitor();
	private static NUOPCFactory factory = NUOPCFactory.eINSTANCE;
	private static final boolean PRINT_ASTS = true;
	private static NUOPCFrameworkManager manager = NUOPCFrameworkManager.getInstance();
	
	@BeforeClass
	public static void setUp() throws CoreException, IOException, InterruptedException {
		PROJECT_NUOPC_PROTOTYPES = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG, NUOPCTest.NUOPC_TAG);
	}
	
	@AfterClass
	public static void tearDown() throws CoreException {
		PROJECT_NUOPC_PROTOTYPES.delete(true, true, NPM);
	}

	@Test
	public void GenerateNUOPCDriverFromScratch() throws CoreException, IOException, InterruptedException, ReverseEngineerException {
		IProject p = TestHelpers.createEmptyFortranProject(NUOPCTest.NUOPC_TAG + "_GenerateNUOPCDriverFromScratch");
		IFile f = TestHelpers.createBlankFile(p, "MyDriver1.F90");
				
		NUOPCDriver driver = new NUOPCDriver(f);
		driver.name = "MyDriver";
		driver.forward();
		driver.applyChanges(NPM);
	
		//read in same driver just generated
		driver = manager.acquireConcept(f);
		
		assertNotNull(driver);
		assertEquals("MyDriver", driver.name);
		assertNotNull(driver.setServices);
		assertEquals("SetServices", driver.setServices.subroutineName);
		assertNotNull(driver.importESMF);
		assertNotNull(driver.importNUOPC);
		assertNotNull(driver.importNUOPCGeneric);
		
		///compile check
		TestHelpers.copyFileIntoProject(p, "workspace/Makefile");
		assertTrue("Compile check", TestHelpers.compileProject(p, TestHelpers.getMakefileFragmentLoc(NUOPCTest.NUOPC_TAG), "*.o"));

	}
	
	@Test
	public void GenerateNUOPCDriverFromModel() throws CoreException, IOException, InterruptedException {
		
		IProject p = TestHelpers.createEmptyFortranProject(NUOPCTest.NUOPC_TAG + "_GenerateNUOPCDriverFromModel");
		IFile fDriverEsm = TestHelpers.createBlankFile(p, "esm.F90");
		IFile fModelAtm = TestHelpers.createBlankFile(p, "atm.F90");
		IFile fModelOcn = TestHelpers.createBlankFile(p, "ocn.F90");
		IFile fMed = TestHelpers.createBlankFile(p, "med.F90");
		IFile fMain = TestHelpers.createBlankFile(p, "esmApp.F90");
		IFile fMakefile = TestHelpers.createBlankFile(p, "Makefile");
		
		Driver esm = factory.createDriver(); 
		Model atm = factory.createModel();
		Model ocn = factory.createModel();
		Mediator med = factory.createMediator();
		Connector atm2ocn = factory.createConnector();
		Connector ocn2atm = factory.createConnector();
		Application app = factory.createApplication();
		
		app.setName("esmApp");
		app.getChildren().add(esm);
				
		esm.setName("esm");
		atm.setName("atm");
		ocn.setName("ocn");
		med.setName("med");
		atm2ocn.setName("NUOPC_Connector");  //generic connector
		ocn2atm.setName("NUOPC_Connector");
		
		Field f;
		UniformGrid atmgrid;
		
		atmgrid = factory.createUniformGrid();
		atmgrid.setName("atmgrid");
		atmgrid.getMinIndex().add(1);
		atmgrid.getMinIndex().add(1);
		atmgrid.getMaxIndex().add(100);
		atmgrid.getMaxIndex().add(200);
		atmgrid.getMinCornerCoord().add(10.0);
		atmgrid.getMinCornerCoord().add(10.0);
		atmgrid.getMaxCornerCoord().add(1000.0);
		atmgrid.getMaxCornerCoord().add(2000.0);
		atmgrid.getStaggerLocToFillCoords().add(ESMF_STAGGERLOC.ESMF_STAGGERLOC_CENTER);
		atm.getGrids().add(atmgrid);
		
		UniformGrid ocngrid = EcoreUtil.copy(atmgrid);
		ocngrid.setName("ocngrid");
		ocn.getGrids().add(ocngrid);
		
		
		//ATM fields
		f = factory.createField();
		f.setName("sst");
		f.setStandardName("sea_surface_temperature");
		f.setGrid(atmgrid);
		atm.getImportFields().add(f);
		
		f = factory.createField();
		f.setName("pmsl");
		f.setStandardName("air_pressure_at_sea_level");
		f.setGrid(atmgrid);
		atm.getExportFields().add(f);
		
		f = factory.createField();
		f.setName("rsns");
		f.setStandardName("surface_net_downward_shortwave_flux");
		f.setGrid(atmgrid);
		atm.getExportFields().add(f);
						
		
		//OCN fields
		f = factory.createField();
		f.setName("sst");
		f.setStandardName("sea_surface_temperature");
		f.setGrid(ocngrid);
		ocn.getExportFields().add(f);
		
		f = factory.createField();
		f.setName("pmsl");
		f.setStandardName("air_pressure_at_sea_level");
		f.setGrid(ocngrid);
		ocn.getImportFields().add(f);
		
		f = factory.createField();
		f.setName("rsns");
		f.setStandardName("surface_net_downward_shortwave_flux");
		f.setGrid(ocngrid);
		ocn.getImportFields().add(f);
		
		//set up connectors
		atm2ocn.setSource(atm);
		atm2ocn.setDestination(ocn);
		
		ocn2atm.setSource(ocn);
		ocn2atm.setDestination(atm);
		
		esm.getChildren().add(atm);
		esm.getChildren().add(ocn);
		esm.getChildren().add(med);
		esm.getChildren().add(atm2ocn);
		esm.getChildren().add(ocn2atm);
		
		NUOPCModel atmCodeConcept = NUOPCModel.newModel(fModelAtm, atm);
		NUOPCModel ocnCodeConcept = NUOPCModel.newModel(fModelOcn, ocn);
		NUOPCMediator medCodeConcept = NUOPCMediator.newMediator(fMed, med);
		NUOPCDriver esmCodeConcept = NUOPCDriver.newDriver(fDriverEsm, esm);
		
		atmCodeConcept.forward();
		atmCodeConcept.applyChanges(NPM);
		
		ocnCodeConcept.forward();
		ocnCodeConcept.applyChanges(NPM);
		
		medCodeConcept.forward();
		medCodeConcept.applyChanges(NPM);
		
		esmCodeConcept.forward();
		esmCodeConcept.applyChanges(NPM);
		
		if (PRINT_ASTS) {
			TestHelpers.printAST(atmCodeConcept);
			TestHelpers.printAST(ocnCodeConcept);
			TestHelpers.printAST(medCodeConcept);
			TestHelpers.printAST(esmCodeConcept);
		}
		
		MakefileGenerator.generateAndWrite(app, fMakefile);
		MainGenerator.generateAndWrite(app, fMain);
		
		assertTrue("Compile check", TestHelpers.compileProject(p, NUOPCTest.ESMFMKFILE, ""));
		assertTrue("Execution check", TestHelpers.executeMPI(p, "./esmApp", 4));
		assertTrue("Log Error check", TestHelpers.verifyNoLogErrors(p));
		
	}

	@Test
	public void NUOPCDriverAddRunSequence() throws IOException, CoreException, InterruptedException, ReverseEngineerException {
		
		IProject p = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnProto", NUOPCTest.NUOPC_TAG + "_NUOPCDriverAddRunSequence");
		IFile f = p.getFile("esm.F90");
		
		NUOPCDriver driver = manager.acquireConcept(f);
		assertNotNull(driver);
		assertEquals("ESM", driver.name);
		assertNotNull(driver.setServices);
		assertEquals("SetServices", driver.setServices.subroutineName);
		assertNull(driver.initialization.initSpecs.setRunSequence);
		
		//add SetRunSequence specialization
		final String sname = "NewSetRunSequence";
		SetRunSequence srs = new SetRunSequence(driver.initialization.initSpecs);
		srs.subroutineName = sname;
		srs = (SetRunSequence) srs.forward();
		driver.applyChanges(NPM);
				
		//re-reverse
		driver = manager.acquireConcept(f);
		assertNotNull(driver);
		assertEquals("ESM", driver.name);
		assertNotNull(driver.setServices);
		assertEquals("SetServices", driver.setServices.subroutineName);
		assertNotNull(driver.initialization.initSpecs.setRunSequence);
		assertEquals(sname, driver.initialization.initSpecs.setRunSequence.subroutineName);
		
		//add RunElement
		SetRunSequence_AddRunElement srsare = new SetRunSequence_AddRunElement(driver.initialization.initSpecs.setRunSequence);
		srsare.compLabel = "\"MyCompLabel\"";
		srsare.slot = "1";
		srsare.forward();
		driver.applyChanges(NPM);
		
		
		//re-reverse
		driver = manager.acquireConcept(f);
		assertNotNull(driver);
		assertEquals("ESM", driver.name);
		assertNotNull(driver.setServices);
		assertEquals("SetServices", driver.setServices.subroutineName);
		assertNotNull(driver.initialization.initSpecs.setRunSequence);
		assertEquals(sname, driver.initialization.initSpecs.setRunSequence.subroutineName);
		assertNotNull(driver.initialization.initSpecs.setRunSequence.runElements);
		assertEquals(1, driver.initialization.initSpecs.setRunSequence.runElements.size());
		
		SetRunSequence_AddRunElement re = driver.initialization.initSpecs.setRunSequence.runElements.get(0);
		assertEquals("\"MyCompLabel\"", re.compLabel);
		assertEquals("1", re.slot);
		
		///compile check
		assertTrue("Compile check", TestHelpers.compileProject(p, NUOPCTest.ESMFMKFILE, "esmApp"));
		
	}

	@Test
	public void NUOPCDriverAddRunSequence2() throws IOException, CoreException, InterruptedException, ReverseEngineerException {
		
		IProject p = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnProto", NUOPCTest.NUOPC_TAG + "_NUOPCDriverAddRunSequence2");
		IFile f = p.getFile("esm.F90");
		
		NUOPCDriver driver = manager.acquireConcept(f);
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
		srsare.compLabel = "\"MyCompLabel\"";
		srsare.slot = "1";
		SetRunSequence_AddRunElement srsare2 = new SetRunSequence_AddRunElement(srs);
		srsare2.compLabel = "\"AnotherCompLabel\"";
		srsare2.slot = "1";
		srsare2.phaseLabel = "\"ThisIsThePhase\"";
			
		srs = (SetRunSequence) srs.forward();
		driver.applyChanges(NPM);
				
		//re-reverse
		driver = manager.acquireConcept(f);
		
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
		assertEquals("\"MyCompLabel\"", re.compLabel);
		assertEquals("1", re.slot);
		assertNull(re.phaseLabel);
		assertNotNull(re.getASTRef());
		re = driver.initialization.initSpecs.setRunSequence.runElements.get(1);
		assertEquals("\"AnotherCompLabel\"", re.compLabel);
		assertEquals("1", re.slot);
		assertEquals("\"ThisIsThePhase\"", re.phaseLabel);
		assertNotNull(re.getASTRef());
		
		srs = driver.initialization.initSpecs.setRunSequence;
		
		//add connector run sequence element
		SetRunSequence_AddRunElement connElem = 
				new SetRunSequence_AddRunElement(srs);
		connElem.srcCompLabel = "\"ConnSrc\"";
		connElem.dstCompLabel = "\"ConnDst\"";
		connElem.slot = "1";
		
		//add link slot run sequence element
		SetRunSequence_AddRunElement slotLinkElem = 
				new SetRunSequence_AddRunElement(srs);
		slotLinkElem.slot = "1";
		slotLinkElem.linkSlot = "2";
		
		connElem.forward();
		slotLinkElem.forward();
		driver.applyChanges(NPM);
		
		
		//re-reverse
		driver = manager.acquireConcept(f);
		assertEquals(4, driver.initialization.initSpecs.setRunSequence.runElements.size());
		
		re = driver.initialization.initSpecs.setRunSequence.runElements.get(2);
		assertEquals("\"ConnSrc\"", re.srcCompLabel);
		assertEquals("\"ConnDst\"", re.dstCompLabel);
		assertEquals("1", re.slot);
		assertNotNull(re.getASTRef());
		
		re = driver.initialization.initSpecs.setRunSequence.runElements.get(3);
		assertEquals("1", re.slot);
		assertEquals("2", re.linkSlot);
		assertNotNull(re.getASTRef());
		
		///compile check
		assertTrue("Compile check", TestHelpers.compileProject(p, NUOPCTest.ESMFMKFILE, "esmApp"));

		
	}

	@Test
	public void NUOPCDriverAddSetModelServices() throws CoreException, IOException, InterruptedException, ReverseEngineerException {
		
		IProject p = TestHelpers.createEmptyFortranProject(NUOPCTest.NUOPC_TAG + "_NUOPCDriverAddSetModelServices");
		IFile f = TestHelpers.createBlankFile(p, "NewDriver.F90"); 
		
		NUOPCDriver driver = new NUOPCDriver(f);
		driver.name = "NewDriver";
		driver = driver.forward();  //generates basic implementation
		
		assertNotNull(driver.setServices);
		assertNotNull(driver.importESMF);
		assertNotNull(driver.importNUOPC);
		assertNotNull(driver.importNUOPCGeneric);
		assertNotNull(driver.initialization);
		assertNotNull(driver.initialization.initPhases);
		assertNotNull(driver.initialization.initSpecs);
		
		SetModelServices sms = new SetModelServices(driver.initialization.initSpecs);
		assertNotNull(driver.initialization.initSpecs.setModelServices);
		sms.subroutineName = "NewDriverSetModelServices";
		
		SetModelServices_AddComp smsac = new SetModelServices_AddComp(sms);
		smsac.compLabel = "\"FirstComp\"";
		smsac.compSetServices = "FirstCompSS";
		
		SetModelServices_AddComp smsac2 = new SetModelServices_AddComp(sms);
		smsac2.compLabel = "\"SecondComp\"";
		smsac2.compSetServices = "SecondCompSS";
		
		SetModelServices_AddComp smsac3 = new SetModelServices_AddComp(sms, "\"FirstComp\"", "\"SecondComp\"", "NUOPC_Connector");
		//smsac3.srcCompLabel = "\"FirstComp\"";
		//smsac3.dstCompLabel = "\"SecondComp\"";
		//smsac3.compSetServices = "cplSS";
				
		sms.forward();
		driver.applyChanges(NPM);
		
		driver = manager.acquireConcept(f);
		
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
		assertEquals("\"FirstComp\"", ac.compLabel);
		assertEquals("FirstCompSS", ac.compSetServices);
		
		ac = driver.initialization.initSpecs.setModelServices.addComps.get(1);
		assertEquals("\"SecondComp\"", ac.compLabel);
		assertEquals("SecondCompSS", ac.compSetServices);
		
		ac = driver.initialization.initSpecs.setModelServices.addComps.get(2);
		assertEquals("\"FirstComp\"", ac.srcCompLabel);
		assertEquals("\"SecondComp\"", ac.dstCompLabel);
		assertEquals("NUOPC_Connector_SetServices", ac.compSetServices);
		
		///compile check
		//compile fails b/c of SetServices routines
		//TestHelpers.copyFileIntoProject(p, "workspace/Makefile");
		//assertTrue("Compile check", TestHelpers.compileProject(p, TestHelpers.getMakefileFragmentLoc(NUOPCTest.NUOPC_TAG), "*.o"));
		
	}
	
	@Test
	public void NUOPCDriverAddModifyIPM() throws IOException, CoreException, InterruptedException, ReverseEngineerException {
		
		IProject p = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnProto", NUOPCTest.NUOPC_TAG + "_NUOPCDriverAddModifyIPM");
		IFile f = p.getFile("esm.F90");
		
		NUOPCDriver driver = manager.acquireConcept(f);
		assertNotNull(driver);
		assertNotNull(driver.initialization);
		assertNotNull(driver.initialization.initSpecs);
		assertNull(driver.initialization.initSpecs.modifyInitializePhaseMap);
		
		ModifyInitializePhaseMap mipm = new ModifyInitializePhaseMap(driver.initialization.initSpecs);
		mipm.subroutineName = "ModifyInitializePhaseMap";
		mipm.forward();
		driver.applyChanges(NPM);
		
		driver = manager.acquireConcept(f);
		assertNotNull(driver);
		assertNotNull(driver.initialization);
		assertNotNull(driver.initialization.initSpecs);
		assertNotNull(driver.initialization.initSpecs.modifyInitializePhaseMap);
		assertEquals("ModifyInitializePhaseMap", driver.initialization.initSpecs.modifyInitializePhaseMap.subroutineName);
		
		assertTrue("Compile check", TestHelpers.compileProject(p, NUOPCTest.ESMFMKFILE, "esmApp"));

	}
	
	@Test
	public void NUOPCDriverAddSetRunClock() throws IOException, CoreException, InterruptedException, ReverseEngineerException {
		
		IProject p = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnProto", NUOPCTest.NUOPC_TAG + "_NUOPCDriverAddSetRunClock");
		IFile f = p.getFile("esm.F90");
		
		NUOPCDriver driver = new NUOPCDriver(f).reverse();
		assertNotNull(driver);
		assertNotNull(driver.run);
		assertNotNull(driver.run.runSpecs);
		assertNull(driver.run.runSpecs.setRunClock);
		
		SetRunClock src = new SetRunClock(driver.run.runSpecs);
		src.subroutineName = "SetRunClock";
		src.forward();
		driver.applyChanges(NPM);
		
		driver = manager.acquireConcept(f);
		assertNotNull(driver);
		assertNotNull(driver.run);
		assertNotNull(driver.run.runSpecs);
		assertNotNull(driver.run.runSpecs.setRunClock);
		assertEquals("SetRunClock", driver.run.runSpecs.setRunClock.subroutineName);
		
		assertTrue("Compile check", TestHelpers.compileProject(p, NUOPCTest.ESMFMKFILE, "esmApp"));
		
	}

	@Test
	public void NUOPCDriverReverse() throws CoreException, IOException, ReverseEngineerException {

		//bring in to introduce ambiguity
		IProject p2 = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnLndProto", NUOPCTest.NUOPC_TAG + "_AtmOcnLndProto");
		
		IProject p = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnProto", NUOPCTest.NUOPC_TAG + "_AtmOcnProto");
		IFile f = p.getFile("esm.F90");
		PhotranVPG.getInstance().ensureVPGIsUpToDate(NPM);
				
		NUOPCDriver driver = new NUOPCDriver(f).reverse();
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
		
		List<SetModelServices_AddComp> addComps = driver.initialization.initSpecs.setModelServices.addComps;
		assertTrue(addComps.get(0).getCompSetServicesExpr() instanceof ASTVarOrFnRefNode);
		assertTrue(addComps.get(1).getCompSetServicesExpr() instanceof ASTVarOrFnRefNode);
		assertTrue(addComps.get(2).getCompSetServicesExpr() instanceof ASTVarOrFnRefNode);
		assertTrue(addComps.get(3).getCompSetServicesExpr() instanceof ASTVarOrFnRefNode);
		
		/*
		ASTVarOrFnRefNode ssRef = (ASTVarOrFnRefNode) addComps.get(0).getCompSetServicesExpr();
		Token ssRefName = ssRef.getName().getName();
		System.out.println("ssRef token ref = " + ssRefName.getTokenRef());
		
		ScopingNode moduleScope = null;
		
		for (PhotranTokenRef ref : ssRefName.getTokenRef().followOutgoing(EdgeType.BINDING_EDGE_TYPE)) {
			System.out.println(ref.findToken() + " " + ref);
			//follow again
			//for (PhotranTokenRef ref2 : ref.followOutgoing(EdgeType.BINDING_EDGE_TYPE)) {
			//	System.out.println("===> " + ref2.findToken());
			//}
			for (PhotranTokenRef ref2 : ref.followOutgoing(EdgeType.RENAMED_BINDING_EDGE_TYPE)) {
				System.out.println("===> " + ref2.findToken() + " " + ref2);
				Token renamed = ref2.findToken();
				List<Definition> defs = renamed.resolveBinding();
				for (Definition d : defs) {
					System.out.println("===>: " + d);
				}
				for (PhotranTokenRef ref3 : ref2.followOutgoing(EdgeType.DEFINED_IN_SCOPE_EDGE_TYPE)) {
					moduleScope = ScopingNode.getLocalScope(ref3.findToken());
					//ref3.findToken().
					System.out.println("=======> " + ref3.findToken() + "(" + ref3.getFilename() + ")");
					System.out.println("=======> scope = " + moduleScope.getName());
				}
				
			}
			for (PhotranTokenRef ref2 : ref.followOutgoing(EdgeType.DEFINED_IN_SCOPE_EDGE_TYPE)) {
				System.out.println("====> " + ref2.findToken());
			}
			
		}
		
		List<IFile> scopeFiles = PhotranVPG.getInstance().findFilesThatExportModule(moduleScope.getName());
		for (IFile sf : scopeFiles) {
			System.out.println("scope file: " + sf);
		}
		
		List<Definition> defs = ssRefName.resolveBinding();
		List<PhotranTokenRef> bindings = ssRefName.manuallyResolveBinding();
		for (Definition d : defs) {
			System.out.println(d);
			System.out.println("def token ref = " + d.getTokenRef());
			ScopingNode scope = ssRefName.findScopeDeclaringOrImporting(d);
			System.out.println(scope);
		}
		*/
		
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
	
	
	@Test
	public void NUOPCDriverReverseHigh() throws CoreException, IOException, ReverseEngineerException {

		IProject p = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnProto", NUOPCTest.NUOPC_TAG + "_NUOPCDriverReverseHigh");
		IFile f = p.getFile("esm.F90");
		PhotranVPG.getInstance().ensureVPGIsUpToDate(NPM);
				
		NUOPCDriver driverCodeConcept = manager.acquireConcept(f);
		assertNotNull(driverCodeConcept);
		
		Driver driver = NUOPCDriver.reverseDriver(driverCodeConcept);
		assertNotNull(driver);
		assertEquals("ESM", driver.getName());
		
		NUOPCFactory factory = NUOPCFactory.eINSTANCE;
		Model modelA = factory.createModel();
		Model modelB = factory.createModel();
		modelA.setName("ATM");
		modelB.setName("modelB");
		
		driver.getChildren().add(modelA);
		driver.getChildren().add(modelB);
		
		driverCodeConcept.forward(driver);   //from driver to driverCodeConcept
		driverCodeConcept.forward();         //from driverCodeConcept to AST/code
		driverCodeConcept.applyChanges(NPM);
				
		System.out.println(driverCodeConcept.getAST().getRoot().toString());
		
	}
		
	

	
}
