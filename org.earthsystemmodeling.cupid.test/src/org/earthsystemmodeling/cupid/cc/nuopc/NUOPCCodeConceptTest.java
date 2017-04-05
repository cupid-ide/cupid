package org.earthsystemmodeling.cupid.cc.nuopc;

import java.io.IOException;

import org.earthsystemmodeling.cupid.cc.CCIStatus;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.CodeConceptManager;
import org.earthsystemmodeling.cupid.cc.CodeSubconcept;
import org.earthsystemmodeling.cupid.cc.SingleCodeSubconcept;
import org.earthsystemmodeling.cupid.cc.fortran.DefIdentifier;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCTest;
import org.earthsystemmodeling.cupid.test.TestHelpers;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.reindenter.Reindenter;
import org.eclipse.photran.internal.core.reindenter.Reindenter.Strategy;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class NUOPCCodeConceptTest {

	private static IProject PROJECT_NUOPC_PROTOTYPES;
	private static NullProgressMonitor NPM = new NullProgressMonitor();
	
	private static CodeConceptManager manager = CodeConceptManager.getInstance();
	private static NUOPC NUOPCDEF = NUOPC.getInstance();
	
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
				
		System.out.println(NUOPCDEF.NUOPCComponent);
		System.out.println(NUOPCDEF.NUOPCDriver);
		
		IProject p = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnProto", NUOPCTest.NUOPC_TAG + "_AtmOcnProto");
		IFile f = p.getFile("esm.F90");
		
		CodeConceptInstance cci = manager.reverse(NUOPCDEF.NUOPCDriver, f);
		System.out.println(cci);
		
	}
	
	//@Test
	public void ReverseNUOPCModel() throws IOException, CoreException {
				
		//System.out.println(NUOPCDEF.NUOPCComponent);
		System.out.println(NUOPCDEF.NUOPCModel);
		
		IProject p = TestHelpers.createFortranProjectFromFolder("target/" + NUOPCTest.NUOPC_TAG + "/AtmOcnTransferGridProto", NUOPCTest.NUOPC_TAG + "_AtmOcnTransferGridProto");
		IFile f = p.getFile("atm.F90");
		
		CodeConceptInstance cci = manager.reverse(NUOPCDEF.NUOPCModel, f);
		System.out.println(cci);
		
	}
	
	@SuppressWarnings("restriction")
	//@Test
	public void GenerateNUOPCDriver() throws CoreException {
		
				
		IProject p = TestHelpers.createEmptyFortranProject("GenerateNUOPCDriver");
		IFile f = TestHelpers.createBlankFile(p, "MyDriver.F90");
		IFortranAST ast = PhotranVPG.getInstance().acquireTransientAST(f);
				
		CodeConceptInstance dummyParent = NUOPCDEF.NUOPCDriverRoot.newInstance(null, ast);
		CodeConceptInstance driverToGenerate = dummyParent.addChildWithDefaults(NUOPCDEF.NUOPCDriver, true);
		//TODO: fix these puts
		//driverToGenerate.put("name", DefIdentifier.literal("MyDriver"));
		
		CodeConceptInstance sms = driverToGenerate.getChild("SetModelServices");
		
		CodeConceptInstance ac1 = NUOPCDEF.SetModelServices$AddComponent.newInstance(sms);
		//ac1.put("srcCompLabel", "\"ATM\"");
		//ac1.put("dstCompLabel", "\"OCN\"");
		//ac1.put("slot", "1");
		
		CodeConceptInstance ac2 = NUOPCDEF.SetModelServices$AddComponent.newInstance(sms);
		//ac2.put("slot", "1");
		//ac2.put("linkSlot", "2");
		
		sms.addChild(ac1, CCIStatus.ADDED);
		sms.addChild(ac2, CCIStatus.ADDED);
				
		System.out.println("DRIVER TO GENERATE**********\n"+driverToGenerate.toString()+"\n*************");
		
		//driverToGenerate.addChildWithDefaults(NUOPCDEF.NUOPCDriver.getChildConcept("SetServices"));
		//driverToGenerate.addChildWithDefaults(NUOPCDEF.NUOPCDriver.getChildConcept("UsesESMF"));
				
		manager.forward(driverToGenerate);
		
		Reindenter.reindent(ast.getRoot(), ast, Strategy.REINDENT_EACH_LINE);
		
		System.out.println("******************\n" + ast.getRoot().toString() + "********************");
		
	}
	
	
	@SuppressWarnings("restriction")
	//@Test
	public void GenerateNUOPCModel() throws CoreException {
				
		IProject p = TestHelpers.createEmptyFortranProject("GenerateNUOPCModel");
		IFile f = TestHelpers.createBlankFile(p, "MyModel.F90");
		IFortranAST ast = PhotranVPG.getInstance().acquireTransientAST(f);
		
		CodeConceptInstance root = NUOPCDEF.NUOPCModelRoot.newInstance(null, ast);
		CodeConceptInstance modelToGenerate = root.addChildWithDefaults(NUOPCDEF.NUOPCModel, true);
		//TODO: fixme
		//modelToGenerate.put("name", DefIdentifier.literal("MyModel"));
						
		System.out.println("MODEL TO GENERATE**********\n"+modelToGenerate.toString()+"\n*************");
							
		manager.forward(modelToGenerate);
		
		Reindenter.reindent(ast.getRoot(), ast, Strategy.REINDENT_EACH_LINE);
		
		System.out.println("******************\n" + ast.getRoot().toString() + "********************");
		
	}
	
	
	
}
