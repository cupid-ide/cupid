package org.earthsystemmodeling.cupid.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.EntryPointCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.InternalEntryPointCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCComponent;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCComponent.GenericImport;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCDriver;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCDriver.SetModelServices_AddComp;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCDriver.SetRunSequence_AddRunElement;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCMediator;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCModel;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.SetServicesCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.SpecializationMethodCodeConcept;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

@SuppressWarnings("restriction")
public class CupidTest {

	private static IProject PROJECT_NUOPC_PROTOTYPES;
		
	@BeforeClass
	public static void setUp() throws CoreException, IOException {
		PROJECT_NUOPC_PROTOTYPES = TestHelpers.createProjectFromFolder("target/ESMF_7_0_0_beta_snapshot_59", "ESMF_7_0_0_beta_snapshot_59");
	}
	
	@AfterClass
	public static void tearDown() throws CoreException {
		PROJECT_NUOPC_PROTOTYPES.delete(true, true, null);
	}

	//must have concrete class defined because of use of reflection
	//to create instances
	public static class SMCC extends SpecializationMethodCodeConcept<CodeConcept<?, ASTModuleNode>> {

		public SetServicesCodeConcept<?> ss;  //mocked
		public CodeConcept<?, ASTModuleNode> mod;   //mocked
		
		public SMCC(CodeConcept<?, ASTModuleNode> parent) {
			this(parent, "NUOPC_Model", "label_Advance");
		}
		
		public SMCC(CodeConcept<?, ASTModuleNode> parent, String labelComponent, String labelName) {
			super(parent, labelComponent, labelName);
		}
		
		@Override
		public GenericImport genericUse() {
			return null;
		}

		@Override
		public CodeConcept<?, ASTModuleNode> module() {
			return mod;
		}

		@Override
		public SetServicesCodeConcept<?> setServices() {
			return ss;
		}
	}
	
	
	@Test
	public void SpecializationMethodCodeConcept() {
		
		IFile f;
		IFortranAST ast;
				
		f = PROJECT_NUOPC_PROTOTYPES.getFolder("AtmOcnProto").getFile("atm.F90");
		ast = PhotranVPG.getInstance().acquireTransientAST(f);
		
		//mock parent
		CodeConcept<?, ASTModuleNode> parent = 
				new BasicCodeConcept(null, (ASTModuleNode) ast.getRoot().getProgramUnitList().get(0));
		
		ASTSubroutineSubprogramNode setServicesNode = null;
		for (ASTSubroutineSubprogramNode ssn : ast.getRoot().findAll(ASTSubroutineSubprogramNode.class)) {
			if (ssn.getName().equalsIgnoreCase("SetServices")) {
				setServicesNode = ssn;
				break;
			}
		}
		
		assertNotNull(setServicesNode);
		
		//mock set services
		SetServicesCodeConcept<?> setServices = new SetServicesCodeConcept(null);
		setServices.setASTRef(setServicesNode);
		
		SMCC spcc = new SMCC(parent, "NUOPC_Model", "label_Advance");
		spcc.mod = parent;
		spcc.ss = setServices;
	
		List ret = spcc.reverseMultiple();
		spcc = (SMCC) ret.get(0);
		
		assertEquals("Only one specialization phase", 1, ret.size());
		assertNotNull("Find ModelAdvance specialization", spcc);
		
		
		/////////////
		
		
		f = PROJECT_NUOPC_PROTOTYPES.getFolder("AtmOcnImplicitProto").getFile("atm.F90");
		ast = PhotranVPG.getInstance().acquireTransientAST(f);
		
		//mock parent
		parent = new BasicCodeConcept(null, (ASTModuleNode) ast.getRoot().getProgramUnitList().get(0));
		
		setServicesNode = null;
		for (ASTSubroutineSubprogramNode ssn : ast.getRoot().findAll(ASTSubroutineSubprogramNode.class)) {
			if (ssn.getName().equalsIgnoreCase("SetServices")) {
				setServicesNode = ssn;
				break;
			}
		}
		
		assertNotNull(setServicesNode);
		
		//mock set services
		setServices = new SetServicesCodeConcept(null);
		setServices.setASTRef(setServicesNode);
		
		spcc = new SMCC(parent, "NUOPC_Model", "label_SetRunClock");
		spcc.mod = parent;
		spcc.ss = setServices;
	
		ret = spcc.reverseMultiple();
		assertEquals("Two specialization phases", 2, ret.size());
		assertNotNull("Find SetRunClock specialization",  ret.get(0));
		assertNotNull("Find SetRunClock specialization",  ret.get(1));
		assertNotNull("Reverse single specialization w/ multiple phases", spcc.reverse());
		
	}
	
	@Test
	public void SetServicesCodeConcept() {
		
		IFile f;
		IFortranAST ast;
				
		f = PROJECT_NUOPC_PROTOTYPES.getFolder("AtmOcnProto").getFile("atm.F90");
		ast = PhotranVPG.getInstance().acquireTransientAST(f);
		
		//mock
		NUOPCComponent parent = new NUOPCComponent(null) {
			@Override
			public String prefix() {
				return null;
			}
		};
		parent.setASTRef((ASTModuleNode) ast.getRoot().getProgramUnitList().get(0));
		
		SetServicesCodeConcept<?> setServices = new SetServicesCodeConcept(parent);
		setServices = setServices.reverse();
		assertNotNull("Find SetServices", setServices);
		assertEquals("SetServices", setServices.subroutineName);
		assertEquals("model", setServices.paramGridComp);
		assertEquals("rc", setServices.paramRC);
		
	}
	
	@Test
	public void EntryPointCodeConcept() {
		
		IFile f;
		IFortranAST ast;
				
		f = PROJECT_NUOPC_PROTOTYPES.getFolder("AtmOcnProto").getFile("atm.F90");
		ast = PhotranVPG.getInstance().acquireTransientAST(f);
		
		//mock
		final NUOPCComponent parent = new NUOPCComponent(null) {
			@Override
			public String prefix() {
				return null;
			}
		};
		parent.setASTRef((ASTModuleNode) ast.getRoot().getProgramUnitList().get(0));
		
		//mock
		final SetServicesCodeConcept<?> setServices = new SetServicesCodeConcept(parent);
		ASTSubroutineSubprogramNode setServicesNode = null;
		for (ASTSubroutineSubprogramNode ssn : ast.getRoot().findAll(ASTSubroutineSubprogramNode.class)) {
			if (ssn.getName().equalsIgnoreCase("SetServices")) {
				setServicesNode = ssn;
				break;
			}
		}
		assertNotNull(setServicesNode);
		setServices.setASTRef(setServicesNode);
		
		EntryPointCodeConcept<?> epcc = new EntryPointCodeConcept(parent) {

			@Override
			public CodeConcept module() {
				return parent;
			}

			@Override
			public SetServicesCodeConcept setServices() {
				return setServices;
			}
			
		};
		
		epcc.phaseLabel = "\"IPDv00p1\"";
		
		epcc = (EntryPointCodeConcept<?>) epcc.reverse();
		assertNotNull(epcc);
		assertEquals("InitializeP1", epcc.subroutineName);
		assertEquals("model", epcc.paramGridComp);
		assertEquals("importState", epcc.paramImport);
		assertEquals("exportState", epcc.paramExport);
		assertEquals("clock", epcc.paramClock);
		assertEquals("rc", epcc.paramRC);
		
		epcc.phaseLabel = "\"IPDv00p2\"";
		epcc = (EntryPointCodeConcept<?>) epcc.reverse();
		assertNotNull(epcc);
		
		///////////////////
		
		f = PROJECT_NUOPC_PROTOTYPES.getFolder("AtmOcnIceSimpleImplicitProto").getFile("atm.F90");
		ast = PhotranVPG.getInstance().acquireTransientAST(f);
		
		//mock
		final NUOPCComponent parent2 = new NUOPCComponent(null) {
			@Override
			public String prefix() {
				return null;
			}
		};
		parent2.setASTRef((ASTModuleNode) ast.getRoot().getProgramUnitList().get(0));
		
		//mock
		final SetServicesCodeConcept<?> setServices2 = new SetServicesCodeConcept(parent);
		setServicesNode = null;
		for (ASTSubroutineSubprogramNode ssn : ast.getRoot().findAll(ASTSubroutineSubprogramNode.class)) {
			if (ssn.getName().equalsIgnoreCase("SetServices")) {
				setServicesNode = ssn;
				break;
			}
		}
		assertNotNull(setServicesNode);
		setServices2.setASTRef(setServicesNode);
		
		epcc = new EntryPointCodeConcept(parent) {

			@Override
			public CodeConcept module() {
				return parent2;
			}

			@Override
			public SetServicesCodeConcept setServices() {
				return setServices2;
			}
			
		};
		
		epcc.phaseLabel = "\"IPDv00p1\"";
		
		epcc = (EntryPointCodeConcept<?>) epcc.reverse();
		assertNotNull(epcc);
		assertEquals("InitializeP1", epcc.subroutineName);
		assertEquals("model", epcc.paramGridComp);
		assertEquals("importState", epcc.paramImport);
		assertEquals("exportState", epcc.paramExport);
		assertEquals("clock", epcc.paramClock);
		assertEquals("rc", epcc.paramRC);
		
		epcc.phaseLabel = "\"IPDv02p1\"";
		
		epcc = (EntryPointCodeConcept<?>) epcc.reverse();
		assertNotNull(epcc);
		assertEquals("InitializeP1", epcc.subroutineName);
		assertEquals("model", epcc.paramGridComp);
		assertEquals("importState", epcc.paramImport);
		assertEquals("exportState", epcc.paramExport);
		assertEquals("clock", epcc.paramClock);
		assertEquals("rc", epcc.paramRC);
		
		epcc.phaseLabel = "\"IPDv00p2\"";
		epcc = (EntryPointCodeConcept<?>) epcc.reverse();
		assertNotNull(epcc);
		assertEquals("InitializeP2", epcc.subroutineName);
		assertEquals("model", epcc.paramGridComp);
		assertEquals("importState", epcc.paramImport);
		assertEquals("exportState", epcc.paramExport);
		assertEquals("clock", epcc.paramClock);
		assertEquals("rc", epcc.paramRC);
		
		epcc.phaseLabel = "\"IPDv02p2\"";
		epcc = (EntryPointCodeConcept<?>) epcc.reverse();
		assertNotNull(epcc);
		assertEquals("InitializeP2", epcc.subroutineName);
		assertEquals("model", epcc.paramGridComp);
		assertEquals("importState", epcc.paramImport);
		assertEquals("exportState", epcc.paramExport);
		assertEquals("clock", epcc.paramClock);
		assertEquals("rc", epcc.paramRC);
		
		epcc.phaseLabel = "\"DOES_NOT_EXIST\"";
		epcc = (EntryPointCodeConcept<?>) epcc.reverse();
		assertNull(epcc);
		
	}
	
	
	@Test
	public void InternalEntryPointCodeConcept() {
		
		IFile f;
		IFortranAST ast;
				
		f = PROJECT_NUOPC_PROTOTYPES.getFolder("AtmOcnCplListProto").getFile("esm.F90");
		ast = PhotranVPG.getInstance().acquireTransientAST(f);
		
		//mock
		final NUOPCComponent parent = new NUOPCComponent(null) {
			@Override
			public String prefix() {
				return null;
			}
		};
		parent.setASTRef((ASTModuleNode) ast.getRoot().getProgramUnitList().get(0));
		
		//mock
		final SetServicesCodeConcept<?> setServices = new SetServicesCodeConcept(parent);
		ASTSubroutineSubprogramNode setServicesNode = null;
		for (ASTSubroutineSubprogramNode ssn : ast.getRoot().findAll(ASTSubroutineSubprogramNode.class)) {
			if (ssn.getName().equalsIgnoreCase("SetServices")) {
				setServicesNode = ssn;
				break;
			}
		}
		assertNotNull(setServicesNode);
		setServices.setASTRef(setServicesNode);
		
		InternalEntryPointCodeConcept<?> iepcc = new InternalEntryPointCodeConcept(parent) {

			@Override
			public CodeConcept module() {
				return parent;
			}

			@Override
			public SetServicesCodeConcept setServices() {
				return setServices;
			}
			
		};
		
		iepcc.phaseLabel = "\"IPDv04p2\"";
		
		iepcc = (InternalEntryPointCodeConcept<?>) iepcc.reverse();
		assertNotNull(iepcc);
		assertEquals("ModifyCplLists", iepcc.subroutineName);
		assertEquals("driver", iepcc.paramGridComp);
		assertEquals("importState", iepcc.paramImport);
		assertEquals("exportState", iepcc.paramExport);
		assertEquals("clock", iepcc.paramClock);
		assertEquals("rc", iepcc.paramRC);
		
		iepcc.phaseLabel = "\"DOES_NOT_EXIST\"";
		iepcc = (InternalEntryPointCodeConcept<?>) iepcc.reverse();
		assertNull(iepcc);

		
		///////////////////
		
		
		f = PROJECT_NUOPC_PROTOTYPES.getFolder("DriverInDriverProto").getFile("driverChildComp.F90");
		ast = PhotranVPG.getInstance().acquireTransientAST(f);
		
		//mock
		final NUOPCComponent parent2 = new NUOPCComponent(null) {
			@Override
			public String prefix() {
				return null;
			}
		};
		parent2.setASTRef((ASTModuleNode) ast.getRoot().getProgramUnitList().get(0));
		
		//mock
		final SetServicesCodeConcept<?> setServices2 = new SetServicesCodeConcept(parent);
		ASTSubroutineSubprogramNode setServicesNode2 = null;
		for (ASTSubroutineSubprogramNode ssn : ast.getRoot().findAll(ASTSubroutineSubprogramNode.class)) {
			if (ssn.getName().equalsIgnoreCase("SetServices")) {
				setServicesNode2 = ssn;
				break;
			}
		}
		assertNotNull(setServicesNode2);
		setServices2.setASTRef(setServicesNode2);
		
		InternalEntryPointCodeConcept<?> iepcc2 = new InternalEntryPointCodeConcept(parent) {

			@Override
			public CodeConcept module() {
				return parent2;
			}

			@Override
			public SetServicesCodeConcept setServices() {
				return setServices2;
			}
			
		};
		
		iepcc2.phaseLabel = "\"IPDv00p1\"";		
		iepcc2 = (InternalEntryPointCodeConcept<?>) iepcc2.reverse();
		assertNotNull(iepcc2);
		assertEquals("InternalInitializeP1", iepcc2.subroutineName);
		assertEquals("driver", iepcc2.paramGridComp);
		assertEquals("importState", iepcc2.paramImport);
		assertEquals("exportState", iepcc2.paramExport);
		assertEquals("clock", iepcc2.paramClock);
		assertEquals("rc", iepcc2.paramRC);
		
		iepcc2.phaseLabel = "\"IPDv00p2\"";		
		iepcc2 = (InternalEntryPointCodeConcept<?>) iepcc2.reverse();
		assertNotNull(iepcc2);
		assertEquals("InternalInitializeP2", iepcc2.subroutineName);
		assertEquals("driver", iepcc2.paramGridComp);
		assertEquals("importState", iepcc2.paramImport);
		assertEquals("exportState", iepcc2.paramExport);
		assertEquals("clock", iepcc2.paramClock);
		assertEquals("rc", iepcc2.paramRC);
		
		iepcc2.phaseLabel = "\"IPDv00p4\"";		
		iepcc2 = (InternalEntryPointCodeConcept<?>) iepcc2.reverse();
		assertNotNull(iepcc2);
		assertEquals("InternalInitializeP4", iepcc2.subroutineName);
		assertEquals("driver", iepcc2.paramGridComp);
		assertEquals("importState", iepcc2.paramImport);
		assertEquals("exportState", iepcc2.paramExport);
		assertEquals("clock", iepcc2.paramClock);
		assertEquals("rc", iepcc2.paramRC);
		
	}
	
	@Test
	public void NUOPCDriverCodeConcept() {
		
		IFile f;
		f = PROJECT_NUOPC_PROTOTYPES.getFolder("AtmOcnProto").getFile("esm.F90");
				
		NUOPCDriver driver = new NUOPCDriver(f, null);
		driver = driver.reverse();
		assertNotNull(driver);
		assertEquals("ESM", driver.driverName);
		assertNotNull(driver.setServices);
		assertEquals("SetServices", driver.setServices.subroutineName);
		assertNotNull(driver.importESMF);
		assertNotNull(driver.importNUOPC);
		assertNotNull(driver.importNUOPCGeneric);
		assertNotNull(driver.initialization.initSpecs.setModelServices);
		assertNotNull(driver.initialization.initSpecs.setModelServices.addComps);
		assertEquals(4, driver.initialization.initSpecs.setModelServices.addComps.size());
		
		f = PROJECT_NUOPC_PROTOTYPES.getFolder("AtmOcnMedPetListTimescalesProto").getFile("esm.F90");
		driver = new NUOPCDriver(f, null).reverse();
		assertNotNull(driver);
		assertEquals("ESM", driver.driverName);
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
	@Ignore
	public void GenerateNUOPCDriver() throws CoreException {
		IProject p = TestHelpers.createEmptyProject("TestGenerateNUOPCDriver");
		p.open(null);
		
		IFile f1 = p.getFile("MyDriver1.F90");
		NUOPCDriver driver = new NUOPCDriver(f1, null);
		driver.forward();
				
		System.out.println("GENERATED DRIVER:\n\n" + driver.getAST().getRoot().toString());
		
		//p.delete(true, true, null);
	}
	
	
	@Test
	@Ignore
	public void NUOPCProtos_bs59() throws SQLException, CoreException {
		
		String dbloc = "~/.cupid/codedb_test";
		String connString = "jdbc:h2:" + dbloc + ";LOG=0;CACHE_SIZE=65536;LOCK_MODE=0;UNDO_LOG=0";
		final CodeDBIndex codeDB = CodeDBIndex.getInstance();
		codeDB.openConnection(connString);
		codeDB.rebuildDatabase();
		codeDB.truncateDatabase();
		
		//skip validation for these files
		final List<String> skipVal = new ArrayList<String>();
		skipVal.add("/ESMF_7_0_0_beta_snapshot_59/AtmOcnSelectExternalProto/esm.F90"); //use of ESMF_MethodAdd
		skipVal.add("/ESMF_7_0_0_beta_snapshot_59/AtmOcnSelectProto/esm.F90"); //use if ESMF_MethodAdd
		skipVal.add("/ESMF_7_0_0_beta_snapshot_59/AtmOcnIceSimpleImplicitProto/ice.F90"); //use of wrong ipdv02p2 (should be p3)
		skipVal.add("/ESMF_7_0_0_beta_snapshot_59/AtmOcnIceSimpleImplicitProto/ocn.F90"); //use of wrong ipdv02p2 (should be p3)
		skipVal.add("/ESMF_7_0_0_beta_snapshot_59/AtmOcnSimpleImplicitProto/ocn.F90"); //same as above
		skipVal.add("/ESMF_7_0_0_beta_snapshot_59/AtmOcnSelectExternalProto/OcnModelB/OcnSub/ocnSub.F90"); // calls set service directory, not compderive
		skipVal.add("/ESMF_7_0_0_beta_snapshot_59/AtmOcnSelectExternalProto/OcnModelC/OcnSub/ocnSub.F90"); // same as above
		
		class MyResourceVisitor implements IResourceVisitor {
			
			public int driverCount = 0;
			public int mediatorCount = 0;
			public int modelCount = 0;
			
			public boolean fails = false;
			
			@Override
			public boolean visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					
					IFile file = (IFile) resource;
					//if (skip.contains(file.getFullPath().toString())) {
					//	System.out.println("Skipping " + file.getFullPath());
					//	return true;
					//}
					
					PhotranVPG.getInstance().releaseAST(file);
					if (PhotranVPG.getInstance().shouldProcessFile(file)) {
						
						IFortranAST ast = PhotranVPG.getInstance().acquireTransientAST(file);
						assertNotNull(ast);
						codeDB.truncateDatabase();
						codeDB.indexAST(ast);
						
						InputStream is = file.getContents();
						try {
							LineIterator li = IOUtils.lineIterator(is, "UTF-8");
							while (li.hasNext()) {
								String line = li.nextLine();
								if (line.contains("use NUOPC_Driver")) {
									NUOPCDriver driver = (NUOPCDriver) new NUOPCDriver(file, codeDB).reverse();
									assertNotNull(driver);
									assertNotNull("No SetServices: " + file.getFullPath(), driver.setServices);
									assertNotNull(driver.importESMF);
									assertNotNull(driver.importNUOPC);
									assertNotNull(driver.importNUOPCGeneric);
									assertNotNull(driver.initialization.initPhases);
									
									if (!skipVal.contains(file.getFullPath().toString())) {
										ArrayList<String> errors = new ArrayList<String>();
										if (!driver.validate(errors)) {
											fail("Validation failed (" + file.getFullPath() + "): " + join(errors));
										}
									}
									driverCount++;
									return true;
								}
								else if (line.contains("use NUOPC_Model")){
									NUOPCModel model = (NUOPCModel) new NUOPCModel(codeDB).reverse();
									assertNotNull(model);
									assertNotNull(model.setServices);
									assertNotNull(model.importESMF);
									assertNotNull(model.importNUOPC);
									assertNotNull(model.importNUOPCGeneric);
									assertNotNull(model.initialization.initPhases);
									
									if (!skipVal.contains(file.getFullPath().toString())) {
										ArrayList<String> errors = new ArrayList<String>();
										if (!model.validate(errors)) {
											fail("Validation failed (" + file.getFullPath() + "): " + join(errors));
										}
									}
									modelCount++;
									return true;
								}
								else if (line.contains("use NUOPC_Mediator")) {
									NUOPCMediator mediator = (NUOPCMediator) new NUOPCMediator(codeDB).reverse();
									assertNotNull(mediator);
									assertNotNull(mediator.setServices);
									assertNotNull(mediator.importESMF);
									assertNotNull(mediator.importNUOPC);
									assertNotNull(mediator.importNUOPCGeneric);
									assertNotNull(mediator.initialization.initPhases);
									
									if (!skipVal.contains(file.getFullPath().toString())) {
										ArrayList<String> errors = new ArrayList<String>();
										if (!mediator.validate(errors)) {
											fail("Validation failed (" + file.getFullPath() + "): " + join(errors));
										}
									}
									mediatorCount++;
									return true;
								}
							}
								
							
						} catch (IOException e) {
							fails = true;
							return false;
						}
					
						
					}
							
					
				}
				return true;
			}
		};
		
		MyResourceVisitor visitor = new MyResourceVisitor();
		PROJECT_NUOPC_PROTOTYPES.accept(visitor);
		
		assertFalse(visitor.fails);
		System.out.println("Driver count = " + visitor.driverCount);
		System.out.println("Model count = " + visitor.modelCount);
		System.out.println("Mediator count = " + visitor.mediatorCount);

		//assertTrue("Driver count is more than 10", visitor.driverCount > 10);
		
		
	}
	
	private String join(List<String> strings) {
		StringBuilder sb = new StringBuilder();
		for (String s : strings) {
			sb.append(s + "\n");
		}
		return sb.toString();
	}
	
	
	
	
	/*
	private IProject refreshProject(String name) throws CoreException {
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
		if (!p.exists()) {
			p.create(new NullProgressMonitor());
		}
		p.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		p.open(new NullProgressMonitor());
		return p;
	}
	*/
	
	/*
	private Language registerLanguage(String langFile) throws IOException {
		
		URL langFileURL = FileLocator.toFileURL(FileLocator.find(MY_BUNDLE, new Path(langFile), null));		
		URI langFileURI = URI.createFileURI(langFileURL.getFile());
		
		ResourceSet rs = new ResourceSetImpl();
		
		Resource langResource = rs.getResource(langFileURI, true);
		Language lang = (Language) langResource.getContents().get(0);
		
		URI ecoreFileURI = langFileURI.trimFileExtension().appendFileExtension("ecore");
		Resource ecoreResource = rs.getResource(ecoreFileURI, true);
		EPackage ecorePackage = (EPackage) ecoreResource.getContents().get(0);
		
		EPackage.Registry.INSTANCE.put(lang.getUri(), ecorePackage);
		
		return lang;
		
	}
	*/
}
