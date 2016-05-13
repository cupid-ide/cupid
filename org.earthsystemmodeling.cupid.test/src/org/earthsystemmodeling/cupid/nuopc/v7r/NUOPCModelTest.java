package org.earthsystemmodeling.cupid.nuopc.v7r;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.earthsystemmodeling.cupid.NUOPC.ESMF_STAGGERLOC;
import org.earthsystemmodeling.cupid.NUOPC.Field;
import org.earthsystemmodeling.cupid.NUOPC.Model;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCFactory;
import org.earthsystemmodeling.cupid.NUOPC.UniformGrid;
import org.earthsystemmodeling.cupid.nuopc.ReverseEngineerException;
import org.earthsystemmodeling.cupid.nuopc.v7r.GridCodeConcept.CreateUniformGrid;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCBaseModel.AdvertiseField;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCBaseModel.RealizeField;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCModel.IPD.IPDv04p0;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCModel.IPD.IPDv04p1;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCModel.IPD.IPDv04p3;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCModel.ModelAdvance;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCModel.SetRunClock;
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
	private static NUOPCFactory factory = NUOPCFactory.eINSTANCE;	
	private static final boolean PRINT_ASTS = true;
	private static NUOPCFrameworkManager manager = NUOPCFrameworkManager.getInstance();
		
	@BeforeClass
	public static void setUp() throws CoreException, IOException, InterruptedException {
		PROJECT_NUOPC_PROTOTYPES = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG, NUOPCTest.NUOPC_TAG);
	}
	
	@AfterClass
	public static void tearDown() throws CoreException {
		PROJECT_NUOPC_PROTOTYPES.delete(true, true, null);
	}

	@Test
	public void NUOPCModelReverse() throws ReverseEngineerException, CoreException {
		
		IFile f;
		f = PROJECT_NUOPC_PROTOTYPES.getFolder("AtmOcnProto").getFile("atm.F90");
				
		NUOPCModel model = manager.acquireConcept(f, true);
		assertNotNull(model);
		assertEquals("ATM", model.name);
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
		assertEquals("\"pmsl\"", af.name);
		assertEquals("exportState", af.state);
		af = model.initialization.initPhases.ipdv00.ipdv00p1.advertiseFields.get(2);
		assertEquals("\"surface_net_downward_shortwave_flux\"", af.standardName);
		assertEquals("\"rsns\"", af.name);
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
				
		model = manager.acquireConcept(f, true);
		assertNotNull(model);
		assertEquals("OCN", model.name);
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

		model = manager.acquireConcept(f, true);
		assertNotNull(model);
		assertEquals("ATM", model.name);
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
		
		model = manager.acquireConcept(f, true);
		assertNotNull(model);
		assertEquals("ATM", model.name);
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
		
		assertNotNull(model.initialization.initPhases.ipdv03.ipdv03p0);
		assertEquals("InitializeP0", model.initialization.initPhases.ipdv03.ipdv03p0.subroutineName);
		
	}
	
	@Test
	public void GenerateNUOPCModelFromScratch() throws CoreException, IOException, InterruptedException, ReverseEngineerException {
		IProject p = TestHelpers.createEmptyFortranProject(NUOPCTest.NUOPC_TAG + "_GenerateNUOPCModelFromScratch");
		IFile f = TestHelpers.createBlankFile(p, "MyModel.F90"); 
				
		NUOPCModel model = new NUOPCModel(f);
		model.name = "MyModel";
		model.forward();
		
		assertNotNull(model.setServices);
		assertEquals("SetServices", model.setServices.subroutineName);
		assertNotNull(model.importESMF);
		assertNotNull(model.importNUOPC);
		assertNotNull(model.importNUOPCGeneric);
		assertNotNull(model.initialization);
		assertNotNull(model.initialization.initPhases);
		assertNotNull(model.initialization.initSpecs);
		assertNotNull(model.initialization.initPhases.ipdv00);
		assertNotNull(model.initialization.initPhases.ipdv01);
		assertNotNull(model.initialization.initPhases.ipdv02);
		assertNotNull(model.initialization.initPhases.ipdv03);
		assertNotNull(model.initialization.initPhases.ipdv04);
		
		model.applyChanges(NPM);
		
		//read in same driver just generated
		model = manager.acquireConcept(f, true);
		
		assertNotNull(model);
		assertEquals("MyModel", model.name);
		assertNotNull(model.setServices);
		assertEquals("SetServices", model.setServices.subroutineName);
		assertNotNull(model.importESMF);
		assertNotNull(model.importNUOPC);
		assertNotNull(model.importNUOPCGeneric);
		assertNotNull(model.initialization);
		assertNotNull(model.initialization.initPhases);
		assertNotNull(model.initialization.initSpecs);
		assertNotNull(model.initialization.initPhases.ipdv00);
		assertNotNull(model.initialization.initPhases.ipdv01);
		assertNotNull(model.initialization.initPhases.ipdv02);
		assertNotNull(model.initialization.initPhases.ipdv03);
		assertNotNull(model.initialization.initPhases.ipdv04);
		
		IPDv04p0 ipdv04p0 = new IPDv04p0(model.initialization.initPhases.ipdv04);
		assertNotNull(model.initialization.initPhases.ipdv04.ipdv04p0);
		ipdv04p0.subroutineName = "FilterInitPhases";	
		
		IPDv04p1 ipdv04p1 = new IPDv04p1(model.initialization.initPhases.ipdv04);
		assertNotNull(model.initialization.initPhases.ipdv04.ipdv04p1);
		
		AdvertiseField af = new AdvertiseField(ipdv04p1);
		assertEquals(af, ipdv04p1.advertiseFields.get(0));
		af.standardName = "\"donkey\"";
		af.state = "importState";
		
		af = new AdvertiseField(ipdv04p1);
		assertEquals(af, ipdv04p1.advertiseFields.get(1));
		af.standardName = "\"sea_surface_temperature\"";
		af.state = "exportState";
		
		ipdv04p0.forward();
		ipdv04p1.forward();
		model.applyChanges(NPM);
		
		model = manager.acquireConcept(f, true);
		assertNotNull(model);
		assertNotNull(model.initialization.initPhases.ipdv04.ipdv04p0);
		assertEquals("FilterInitPhases", model.initialization.initPhases.ipdv04.ipdv04p0.subroutineName);
		assertEquals("0", model.initialization.initPhases.ipdv04.ipdv04p0.phaseNumber);		
		
		assertEquals(2, model.initialization.initPhases.ipdv04.ipdv04p1.advertiseFields.size());
		assertEquals("\"donkey\"", model.initialization.initPhases.ipdv04.ipdv04p1.advertiseFields.get(0).standardName);
		assertEquals("importState", model.initialization.initPhases.ipdv04.ipdv04p1.advertiseFields.get(0).state);
		assertEquals("\"sea_surface_temperature\"", model.initialization.initPhases.ipdv04.ipdv04p1.advertiseFields.get(1).standardName);
		assertEquals("exportState", model.initialization.initPhases.ipdv04.ipdv04p1.advertiseFields.get(1).state);

		
		CreateUniformGrid cuf = new CreateUniformGrid(model.initialization);
		assertEquals(cuf, model.initialization.createUniformGrid.get(0));
		cuf.setName("\"grid\"");
		cuf.setMinIndex(new int[] {1, 1});
		cuf.setMaxIndex(new int[] {10, 10});
		cuf.setMinCornerCoord(new double[] {0.0, 0.0});
		cuf.setMaxCornerCoord(new double[] {100.0, 100.0});
		
		
		IPDv04p3 ipdv04p3 = new IPDv04p3(model.initialization.initPhases.ipdv04);
		assertNotNull(model.initialization.initPhases.ipdv04.ipdv04p3);
		ipdv04p3.getGrids().add("grid");
		
		RealizeField rf = new RealizeField(ipdv04p3);
		assertEquals(rf, ipdv04p3.realizeFields.get(0));
		rf.field = "myfield1";
		rf.state = "importState";
		rf.fieldName = "\"myfield1\"";
		rf.grid = "grid";
		
		rf = new RealizeField(ipdv04p3);
		assertEquals(rf, ipdv04p3.realizeFields.get(1));
		rf.field = "myfield2";
		rf.state = "exportState";
		rf.fieldName = "\"myfield2\"";
		rf.grid = "grid";
		
		model.initialization.createUniformGrid.get(0).forward();
		ipdv04p3.forward();
		model.applyChanges(NPM);	
		
		model = manager.acquireConcept(f, true);
		assertNotNull(model);
		assertEquals(2, model.initialization.initPhases.ipdv04.ipdv04p3.realizeFields.size());
		assertEquals("myfield1", model.initialization.initPhases.ipdv04.ipdv04p3.realizeFields.get(0).field);
		assertEquals("importState", model.initialization.initPhases.ipdv04.ipdv04p3.realizeFields.get(0).state);
		assertEquals("myfield2", model.initialization.initPhases.ipdv04.ipdv04p3.realizeFields.get(1).field);
		assertEquals("exportState", model.initialization.initPhases.ipdv04.ipdv04p3.realizeFields.get(1).state);

		ModelAdvance adv = new ModelAdvance(model.run.runSpecs);
		assertEquals(1, model.run.runSpecs.modelAdvance.size());
		adv.specPhaseLabel = "\"FirstPhaseLabel\"";
		adv.forward();
		model.applyChanges(NPM);
		
		if (PRINT_ASTS) {
			TestHelpers.printAST(model);
		}
		
		///compile check
		TestHelpers.copyFileIntoProject(p, "workspace/Makefile");
		assertTrue("Compile check", TestHelpers.compileProject(p, TestHelpers.getMakefileFragmentLoc(NUOPCTest.NUOPC_TAG), "*.o"));
	}
	
	@Test
	public void GenerateNUOPCModelFromModel() throws CoreException, IOException, InterruptedException {
		
		IProject p = TestHelpers.createEmptyFortranProject(NUOPCTest.NUOPC_TAG + "_GenerateNUOPCModelFromModel");
		IFile fModel = TestHelpers.createBlankFile(p, "Model.F90");
				
		Model model = factory.createModel();
		model.setName("Model");
		
		Field f;
		UniformGrid grid;
		
		grid = factory.createUniformGrid();
		grid.setName("ModelGrid");
		grid.getMinIndex().add(1);
		grid.getMinIndex().add(1);
		grid.getMaxIndex().add(360);
		grid.getMaxIndex().add(180);
		grid.getMinCornerCoord().add(0.0);
		grid.getMinCornerCoord().add(0.0);
		grid.getMaxCornerCoord().add(360.0);
		grid.getMaxCornerCoord().add(180.0);
		grid.getStaggerLocToFillCoords().add(ESMF_STAGGERLOC.ESMF_STAGGERLOC_CENTER);
		grid.getStaggerLocToFillCoords().add(ESMF_STAGGERLOC.ESMF_STAGGERLOC_CORNER);
		
		model.getGrids().add(grid);
		
		f = factory.createField();
		f.setName("FieldImport1");
		f.setStandardName("FieldImport1");
		f.setGrid(grid);
		model.getImportFields().add(f);
		
		f = factory.createField();
		f.setName("FieldImport2");
		f.setStandardName("FieldImport2");
		f.setGrid(grid);
		model.getImportFields().add(f);
		
		f = factory.createField();
		f.setName("FieldExport1");
		f.setStandardName("FieldExport1");
		f.setGrid(grid);
		model.getExportFields().add(f);
						
		NUOPCModel modelCodeConcept = NUOPCModel.newModel(fModel, model);
				
		modelCodeConcept.forward();
		modelCodeConcept.applyChanges(NPM);
		
		if (PRINT_ASTS) {
			TestHelpers.printAST(modelCodeConcept);
		}
			
		TestHelpers.copyFileIntoProject(p, "workspace/Makefile");
		String makeTargets[] = {"Model.o"};
		assertTrue("Compile check", TestHelpers.compileProject(p, NUOPCTest.ESMFMKFILE, makeTargets));

	}
	
	
}
