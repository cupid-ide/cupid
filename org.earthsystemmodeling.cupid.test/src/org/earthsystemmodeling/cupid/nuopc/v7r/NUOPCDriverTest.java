package org.earthsystemmodeling.cupid.nuopc.v7r;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.earthsystemmodeling.cupid.NUOPC.Driver;
import org.earthsystemmodeling.cupid.NUOPC.Field;
import org.earthsystemmodeling.cupid.NUOPC.Grid;
import org.earthsystemmodeling.cupid.NUOPC.Model;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCFactory;
import org.earthsystemmodeling.cupid.NUOPC.UniformGrid;
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
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.photran.internal.core.analysis.binding.Definition;
import org.eclipse.photran.internal.core.analysis.binding.ScopingNode;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTVarOrFnRefNode;
import org.eclipse.photran.internal.core.vpg.EdgeType;
import org.eclipse.photran.internal.core.vpg.PhotranTokenRef;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class NUOPCDriverTest {
	
	private static IProject PROJECT_NUOPC_PROTOTYPES;
	private static NullProgressMonitor NPM = new NullProgressMonitor();
	private static String ESMFMKFILE = TestHelpers.getMakefileFragmentLoc(NUOPCTest.NUOPC_TAG);
	private static NUOPCFactory factory = NUOPCFactory.eINSTANCE;
	
	@BeforeClass
	public static void setUp() throws CoreException, IOException, InterruptedException {
		PROJECT_NUOPC_PROTOTYPES = TestHelpers.createProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG, NUOPCTest.NUOPC_TAG);
	}
	
	@AfterClass
	public static void tearDown() throws CoreException {
		PROJECT_NUOPC_PROTOTYPES.delete(true, true, NPM);
	}

	@Test
	public void GenerateNUOPCDriverFromScratch() throws CoreException, IOException, InterruptedException {
		IProject p = TestHelpers.createEmptyProject(NUOPCTest.NUOPC_TAG + "_GenerateNUOPCDriverFromScratch");
		IFile f = TestHelpers.createBlankFile(p, "MyDriver1.F90");
				
		NUOPCDriver driver = new NUOPCDriver(f);
		driver.name = "MyDriver";
		driver = driver.forward();
		
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
		
		///compile check
		TestHelpers.copyFileIntoProject(p, "workspace/Makefile");
		assertTrue("Compile check", TestHelpers.compileProject(p, TestHelpers.getMakefileFragmentLoc(NUOPCTest.NUOPC_TAG), "*.o"));

	}
	
	@Test
	public void GenerateNUOPCDriverWithChildren() throws CoreException, IOException, InterruptedException {
		
		IProject p = TestHelpers.createEmptyFortranProject(NUOPCTest.NUOPC_TAG + "_GenerateNUOPCDriverWithChildren");
		IFile fDriver = TestHelpers.createBlankFile(p, "MyDriver.F90");
		IFile fModelA = TestHelpers.createBlankFile(p, "ModelA.F90");
		IFile fModelB = TestHelpers.createBlankFile(p, "ModelB.F90");
		
		Driver driver = factory.createDriver(); 
		Model modelA = factory.createModel();
		Model modelB = factory.createModel();
		
		driver.setName("MyDriver");
		modelA.setName("ModelA");
		modelB.setName("ModelB");
		
		Field f;
		UniformGrid grid;
		
		grid = factory.createUniformGrid();
		grid.setName("ModelAGrid");
		grid.getMinIndex().add(1);
		grid.getMinIndex().add(1);
		grid.getMaxIndex().add(100);
		grid.getMaxIndex().add(200);
		grid.getMinCornerCoord().add(10.0);
		grid.getMinCornerCoord().add(10.0);
		grid.getMaxCornerCoord().add(1000.0);
		grid.getMaxCornerCoord().add(2000.0);
		
		modelA.getGrids().add(grid);
		
		//Model A fields
		f = factory.createField();
		f.setStandardName("FieldImportA1");
		f.setGrid(grid);
		modelA.getImportFields().add(f);
		
		f = factory.createField();
		f.setStandardName("FieldImportA2");
		f.setGrid(grid);
		modelA.getImportFields().add(f);
		
		f = factory.createField();
		f.setStandardName("FieldExportA1");
		f.setGrid(grid);
		modelA.getExportFields().add(f);
						
		driver.getChildren().add(modelA);
		driver.getChildren().add(modelB);
		
		NUOPCModel modelACodeConcept = NUOPCModel.newModel(fModelA, modelA);
		NUOPCModel modelBCodeConcept = NUOPCModel.newModel(fModelB, modelB);
		NUOPCDriver driverCodeConcept = NUOPCDriver.newDriver(fDriver, driver);
		
		modelACodeConcept.forward(NPM);
		modelBCodeConcept.forward(NPM);
		driverCodeConcept.forward(NPM);
				
		System.out.println(modelACodeConcept.getAST().getRoot().toString() + "\n\n========================\n\n");
		System.out.println(modelBCodeConcept.getAST().getRoot().toString() + "\n\n========================\n\n");
		System.out.println(driverCodeConcept.getAST().getRoot().toString());
		
		TestHelpers.copyFileIntoProject(p, "workspace/Makefile");
		String makeTargets[] = {"ModelA.o", "ModelB.o", "MyDriver.o"};
		assertTrue("Compile check", TestHelpers.compileProject(p, ESMFMKFILE, makeTargets));

	}

	@Test
	public void NUOPCDriverAddRunSequence() throws IOException, CoreException, InterruptedException {
		
		IProject p = TestHelpers.createProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnProto", NUOPCTest.NUOPC_TAG + "_NUOPCDriverAddRunSequence");
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
		srs = (SetRunSequence) srs.forward();
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
		srsare.compLabel = "\"MyCompLabel\"";
		srsare.slot = "1";
		srsare = srsare.forward();
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
		assertEquals("\"MyCompLabel\"", re.compLabel);
		assertEquals("1", re.slot);
		
		///compile check
		assertTrue("Compile check", TestHelpers.compileProject(p, ESMFMKFILE, "esmApp"));
		
	}

	@Test
	public void NUOPCDriverAddRunSequence2() throws IOException, CoreException, InterruptedException {
		
		IProject p = TestHelpers.createProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnProto", NUOPCTest.NUOPC_TAG + "_NUOPCDriverAddRunSequence2");
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
		srsare.compLabel = "\"MyCompLabel\"";
		srsare.slot = "1";
		SetRunSequence_AddRunElement srsare2 = new SetRunSequence_AddRunElement(srs);
		srsare2.compLabel = "\"AnotherCompLabel\"";
		srsare2.slot = "1";
		srsare2.phaseLabel = "\"ThisIsThePhase\"";
			
		srs = (SetRunSequence) srs.forward();
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
		srs.generateChange().perform(NPM);
		
		//re-reverse
		driver = new NUOPCDriver(f).reverse();
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
		assertTrue("Compile check", TestHelpers.compileProject(p, ESMFMKFILE, "esmApp"));

		
	}

	@Test
	public void NUOPCDriverAddSetModelServices() throws CoreException, IOException, InterruptedException {
		
		IProject p = TestHelpers.createEmptyProject(NUOPCTest.NUOPC_TAG + "_NUOPCDriverAddSetModelServices");
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
		sms.subroutineName = "NewDriverSetModelServices";
		
		SetModelServices_AddComp smsac = new SetModelServices_AddComp(sms);
		smsac.compLabel = "\"FirstComp\"";
		smsac.compSetServices = "FirstCompSS";
		
		SetModelServices_AddComp smsac2 = new SetModelServices_AddComp(sms);
		smsac2.compLabel = "\"SecondComp\"";
		smsac2.compSetServices = "SecondCompSS";
		
		SetModelServices_AddComp smsac3 = new SetModelServices_AddComp(sms);
		smsac3.srcCompLabel = "\"FirstComp\"";
		smsac3.dstCompLabel = "\"SecondComp\"";
		smsac3.compSetServices = "cplSS";
				
		sms.forward();
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
		assertEquals("\"FirstComp\"", ac.compLabel);
		assertEquals("FirstCompSS", ac.compSetServices);
		
		ac = driver.initialization.initSpecs.setModelServices.addComps.get(1);
		assertEquals("\"SecondComp\"", ac.compLabel);
		assertEquals("SecondCompSS", ac.compSetServices);
		
		ac = driver.initialization.initSpecs.setModelServices.addComps.get(2);
		assertEquals("\"FirstComp\"", ac.srcCompLabel);
		assertEquals("\"SecondComp\"", ac.dstCompLabel);
		assertEquals("cplSS", ac.compSetServices);
		
		///compile check
		//compile fails b/c of SetServices routines
		//TestHelpers.copyFileIntoProject(p, "workspace/Makefile");
		//assertTrue("Compile check", TestHelpers.compileProject(p, TestHelpers.getMakefileFragmentLoc(NUOPCTest.NUOPC_TAG), "*.o"));
		
	}
	
	@Test
	public void NUOPCDriverAddModifyIPM() throws IOException, CoreException, InterruptedException {
		
		IProject p = TestHelpers.createProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnProto", NUOPCTest.NUOPC_TAG + "_NUOPCDriverAddModifyIPM");
		IFile f = p.getFile("esm.F90");
		
		NUOPCDriver driver = new NUOPCDriver(f).reverse();
		assertNotNull(driver);
		assertNotNull(driver.initialization);
		assertNotNull(driver.initialization.initSpecs);
		assertNull(driver.initialization.initSpecs.modifyInitializePhaseMap);
		
		ModifyInitializePhaseMap mipm = new ModifyInitializePhaseMap(driver.initialization.initSpecs);
		mipm.subroutineName = "ModifyInitializePhaseMap";
		mipm.forward();
		mipm.generateChange().perform(NPM);
		
		driver = new NUOPCDriver(f).reverse();
		assertNotNull(driver);
		assertNotNull(driver.initialization);
		assertNotNull(driver.initialization.initSpecs);
		assertNotNull(driver.initialization.initSpecs.modifyInitializePhaseMap);
		assertEquals("ModifyInitializePhaseMap", driver.initialization.initSpecs.modifyInitializePhaseMap.subroutineName);
		
		assertTrue("Compile check", TestHelpers.compileProject(p, ESMFMKFILE, "esmApp"));

	}
	
	@Test
	public void NUOPCDriverAddSetRunClock() throws IOException, CoreException, InterruptedException {
		
		IProject p = TestHelpers.createProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnProto", NUOPCTest.NUOPC_TAG + "_NUOPCDriverAddSetRunClock");
		IFile f = p.getFile("esm.F90");
		
		NUOPCDriver driver = new NUOPCDriver(f).reverse();
		assertNotNull(driver);
		assertNotNull(driver.run);
		assertNotNull(driver.run.runSpecs);
		assertNull(driver.run.runSpecs.setRunClock);
		
		SetRunClock src = new SetRunClock(driver.run.runSpecs);
		src.subroutineName = "SetRunClock";
		src.forward();
		src.generateChange().perform(NPM);
		
		driver = new NUOPCDriver(f).reverse();
		assertNotNull(driver);
		assertNotNull(driver.run);
		assertNotNull(driver.run.runSpecs);
		assertNotNull(driver.run.runSpecs.setRunClock);
		assertEquals("SetRunClock", driver.run.runSpecs.setRunClock.subroutineName);
		
		assertTrue("Compile check", TestHelpers.compileProject(p, ESMFMKFILE, "esmApp"));
		
	}

	@SuppressWarnings("restriction")
	@Test
	public void NUOPCDriverReverse() throws CoreException, IOException {

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
	
	
	@SuppressWarnings("restriction")
	@Test
	public void NUOPCDriverReverseHigh() throws CoreException, IOException {

		IProject p = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnProto", NUOPCTest.NUOPC_TAG + "_NUOPCDriverReverseHigh");
		IFile f = p.getFile("esm.F90");
		PhotranVPG.getInstance().ensureVPGIsUpToDate(NPM);
				
		NUOPCDriver driverCodeConcept = new NUOPCDriver(f).reverse();
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
		driverCodeConcept.forward(NPM);         //from driverCodeConcept to AST/code
				
		System.out.println(driverCodeConcept.getAST().getRoot().toString());
		
	}
		
	

	
}
