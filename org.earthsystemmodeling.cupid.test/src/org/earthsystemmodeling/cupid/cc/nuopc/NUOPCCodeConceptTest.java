package org.earthsystemmodeling.cupid.cc.nuopc;

import java.io.IOException;

import org.earthsystemmodeling.cupid.cc.CCIStatus;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.CodeConceptManager;
import org.earthsystemmodeling.cupid.cc.CodeSubconcept;
import org.earthsystemmodeling.cupid.cc.SingleCodeSubconcept;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCTest;
import org.earthsystemmodeling.cupid.test.TestHelpers;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class NUOPCCodeConceptTest {

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
	
	//@Test
	public void ReverseNUOPCDriver() throws IOException, CoreException {
		
		NUOPC NUOPC_DEF = NUOPC.getInstance();
		
		System.out.println(NUOPC_DEF.NUOPCComponent);
		System.out.println(NUOPC_DEF.NUOPCDriver);
		
		IProject p = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnProto", NUOPCTest.NUOPC_TAG + "_AtmOcnProto");
		IFile f = p.getFile("esm.F90");
		
		//CodeConceptInstance i = NUOPC_DEF.NUOPCDriverFromFile.fromFile(f);
		CodeConceptManager manager = CodeConceptManager.getInstance();
		CodeConceptInstance cci = manager.reverse(NUOPC_DEF.NUOPCDriver, f);
		System.out.println(cci);
		
	}
	
	@Test
	public void GenerateNUOPCDriver() throws CoreException {
		CodeConceptManager manager = CodeConceptManager.getInstance();
		NUOPC NUOPCDEF = NUOPC.getInstance();
				
		IProject p = TestHelpers.createEmptyFortranProject("GenerateNUOPCDriver");
		IFile f = TestHelpers.createBlankFile(p, "MyDriver.F90");
		IFortranAST ast = PhotranVPG.getInstance().acquireTransientAST(f);
		
		CodeConceptInstance driverToGenerate = NUOPCDEF.NUOPCDriver.newInstance(null);
		driverToGenerate.setStatus(CCIStatus.ADDED);
		driverToGenerate.put("ast", ast);
		driverToGenerate.put("name", "MyDriver");
		
		SingleCodeSubconcept setServicesCC = 
				(SingleCodeSubconcept) NUOPCDEF.NUOPCDriver.getSubconcept("SetServices");
		
		driverToGenerate.addChildWithDefaults(setServicesCC.getConcept());
		
		manager.forward(driverToGenerate, f);
		
		System.out.println("******************\n" + ast.getRoot().toString() + "********************");
		
	}
	
}
