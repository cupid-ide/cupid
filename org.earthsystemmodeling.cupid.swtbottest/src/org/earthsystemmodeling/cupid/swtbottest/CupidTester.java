package org.earthsystemmodeling.cupid.swtbottest;

import static org.eclipse.swtbot.swt.finder.SWTBotAssert.assertContains;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.ui.PartInitException;
import org.hamcrest.Matcher;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

@RunWith(SWTBotJunit4ClassRunner.class)
public class CupidTester {

	private static Bundle MY_BUNDLE = FrameworkUtil.getBundle(CupidTester.class);
	private static SWTWorkbenchBot	bot;

	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		bot.viewByTitle("Welcome").close();
		copyProjectToWorkspace("v7-AtmOcnLndProto");
	}

	
		
	@Test
	/**
	 * Opens the Cupid preferences page and changes the NUOPC language location.
	 */
	public void showAndUpdatePrefsPage() {
		//change
		bot.menu("Window").menu("Preferences").click();
		bot.tree().getTreeItem("Cupid Preferences").select();
		bot.textWithLabel("Language definition URI").setText("platform:/plugin/org.earthsystemmodeling.cupid/cupidmodel/nuopc.psyche");
		bot.button("OK").click();

		//verify
		bot.menu("Window").menu("Preferences").click();
		bot.tree().getTreeItem("Cupid Preferences").select();
		assertEquals("platform:/plugin/org.earthsystemmodeling.cupid/cupidmodel/nuopc.psyche", bot.textWithLabel("Language definition URI").getText());
		
		//change to v7
		bot.textWithLabel("Language definition URI").setText("platform:/plugin/org.earthsystemmodeling.cupid/cupidmodel/nuopc7.psyche");
		bot.button("OK").click();	
	}
	
	/**
	 * Verifies that the NUOPC view can be shown.
	 */
	@Test
	public void showNUOPCView() {
		
		sleep(3*1000);
		
		bot.menu("Window").menu("Show View").menu("Other...").click();
		bot.tree().getTreeItem("NUOPC").select();
		bot.tree().getTreeItem("NUOPC").expand();
		bot.tree().getTreeItem("NUOPC").getNode("NUOPC View").select();
		bot.button("OK").click();
		bot.viewByTitle("NUOPC View");
	}
	
	private void ensureNUOPCViewVisible() {
		try {
			bot.viewByTitle("NUOPC View");
		}
		catch (WidgetNotFoundException wnfe) {
			showNUOPCView();
		}
	}
	
	/**
	 * Open and reverse engineer a DriverAtmOcn.
	 */
	@Test
	public void reverseEngineerDriver() {
		ensureNUOPCViewVisible();
		
		sleep(3*1000);
		
		bot.tree().getTreeItem("v7-AtmOcnLndProto").select();
		bot.tree().getTreeItem("v7-AtmOcnLndProto").expand();
		bot.tree().getTreeItem("v7-AtmOcnLndProto").getNode("esm.F90").doubleClick();
		bot.editorByTitle("esm.F90");
		
		//wait for reverse engineer
		sleep(3*1000);
		
		//basic verification of reverse engineering
		SWTBotTree tree = NUOPCTree();
			
		assertEquals("ESM (esm.F90)", tree.getTreeItem("NUOPC Driver").cell(1));
	}
	
	/**
	 * Open and reverse engineer a NUOPC Model (atm).
	 */
	@Test
	public void reverseEngineerModelAtm() {
		ensureNUOPCViewVisible();
		
		sleep(3*1000);
		
		bot.tree().getTreeItem("v7-AtmOcnLndProto").select();
		bot.tree().getTreeItem("v7-AtmOcnLndProto").expand();
		bot.tree().getTreeItem("v7-AtmOcnLndProto").getNode("atm.F90").doubleClick();
		bot.editorByTitle("atm.F90");
		
		//wait for reverse engineer
		sleep(3*1000);
		
		//basic verification of reverse engineering
		SWTBotTree tree = NUOPCTree();
		
		tree.getTreeItem("NUOPC Model").getNode("Initialize").expand();
					
		assertEquals("ATM (atm.F90)", tree.getTreeItem("NUOPC Model").cell(1));
		assertEquals("SetServices", tree.getTreeItem("NUOPC Model").getNode("SetServices").cell(1));
		assertEquals("InitializeP1", tree.getTreeItem("NUOPC Model").getNode("Initialize").getNode("Initialize Phase 1").cell(1));
		assertEquals("InitializeP2", tree.getTreeItem("NUOPC Model").getNode("Initialize").getNode("Initialize Phase 2").cell(1));
		assertEquals("ModelAdvance", tree.getTreeItem("NUOPC Model").getNode("Run").getNode("ModelAdvance").cell(1));	

	}
	
	/**
	 * Open and reverse engineer a NUOPC Model (ocn).
	 */
	@Test
	public void reverseEngineerModelOcn() {
		ensureNUOPCViewVisible();
		
		sleep(3*1000);
		
		bot.tree().getTreeItem("v7-AtmOcnLndProto").select();
		bot.tree().getTreeItem("v7-AtmOcnLndProto").expand();
		bot.tree().getTreeItem("v7-AtmOcnLndProto").getNode("ocn.F90").doubleClick();
		bot.editorByTitle("ocn.F90");
		
		//wait for reverse engineer
		sleep(3*1000);
		
		//basic verification of reverse engineering
		SWTBotTree tree = NUOPCTree();
		
		tree.getTreeItem("NUOPC Model").getNode("Initialize").expand();
			
		assertEquals("OCN (ocn.F90)", tree.getTreeItem("NUOPC Model").cell(1));
		assertEquals("SetServices", tree.getTreeItem("NUOPC Model").getNode("SetServices").cell(1));
		assertEquals("InitializeP1", tree.getTreeItem("NUOPC Model").getNode("Initialize").getNode("Initialize Phase 1").cell(1));
		assertEquals("InitializeP2", tree.getTreeItem("NUOPC Model").getNode("Initialize").getNode("Initialize Phase 2").cell(1));
		assertEquals("ModelAdvance", tree.getTreeItem("NUOPC Model").getNode("Run").getNode("ModelAdvance").cell(1));	

	}
	
	/**
	 * Test code generation of finalize method in a NUOPC Component.
	 * @throws PartInitException 
	 */
	@Test
	public void forwardEngineerModelAtmFinalize() throws PartInitException {
		ensureNUOPCViewVisible();
		
		sleep(3*1000);
		
		bot.tree().getTreeItem("v7-AtmOcnLndProto").select();
		bot.tree().getTreeItem("v7-AtmOcnLndProto").expand();
		bot.tree().getTreeItem("v7-AtmOcnLndProto").getNode("atm.F90").doubleClick();
		bot.editorByTitle("atm.F90");
		
		assertFalse(bot.editorByTitle("atm.F90").toTextEditor().getText().contains("subroutine Finalize"));
				
		//wait for reverse engineer
		sleep(3*1000);
		
		//basic verification of reverse engineering
		SWTBotTree tree = NUOPCTree();
		tree.getTreeItem("NUOPC Model").getNode("Finalize").contextMenu("Generate Finalize Phase 1").click();
		
		String editorText = bot.editorByTitle("atm.F90").toTextEditor().getText();
		assertContains("subroutine Finalize", editorText);
		assertContains("userRoutine=Finalize", editorText);
	}
	
	@Test
	public void forwardEngineerModelAtmSetClock() throws PartInitException {
		ensureNUOPCViewVisible();
		
		sleep(3*1000);
		
		bot.tree().getTreeItem("v7-AtmOcnLndProto").select();
		bot.tree().getTreeItem("v7-AtmOcnLndProto").expand();
		bot.tree().getTreeItem("v7-AtmOcnLndProto").getNode("atm.F90").doubleClick();
		bot.editorByTitle("atm.F90");
		
		assertFalse(bot.editorByTitle("atm.F90").toTextEditor().getText().contains("subroutine SetClock"));
				
		//wait for reverse engineer
		sleep(3*1000);
		
		//basic verification of reverse engineering
		SWTBotTree tree = NUOPCTree();
		tree.getTreeItem("NUOPC Model").getNode("Initialize").contextMenu("Generate SetClock").click();
		
		String editorText = bot.editorByTitle("atm.F90").toTextEditor().getText();
		assertContains("subroutine SetClock", editorText);
		assertContains("label_SetClock", editorText);
		assertContains("specRoutine=SetClock", editorText);
	}
	
	@Test
	public void forwardEngineerModelLndAdvance() throws PartInitException {
		ensureNUOPCViewVisible();
		
		sleep(3*1000);
		
		bot.tree().getTreeItem("v7-AtmOcnLndProto").select();
		bot.tree().getTreeItem("v7-AtmOcnLndProto").expand();
		bot.tree().getTreeItem("v7-AtmOcnLndProto").getNode("lnd.F90").doubleClick();
		bot.editorByTitle("lnd.F90");
		
		assertFalse(bot.editorByTitle("lnd.F90").toTextEditor().getText().contains("subroutine ModelAdvance"));
				
		//wait for reverse engineer
		sleep(3*1000);
		
		//basic verification of reverse engineering
		SWTBotTree tree = NUOPCTree();
		tree.getTreeItem("NUOPC Model").getNode("Run").contextMenu("Generate ModelAdvance").click();
		
		String editorText = bot.editorByTitle("lnd.F90").toTextEditor().getText();
		assertContains("subroutine ModelAdvance", editorText);
		assertContains("label_Advance", editorText);
		assertContains("specRoutine=ModelAdvance", editorText);
	}
	
	/**
	 * Verifies that the Cupid project properties page works.
	 */
	@Test
	public void showPropsPage() {
		bot.tree().getTreeItem("v7-AtmOcnLndProto").select();
		bot.menu("Properties").click();
		bot.tree().getTreeItem("Cupid Property Page").select();
		bot.button("Select NUOPC resources").click();
		bot.button("Cancel").click();
		bot.button("OK").click();
	}
	

	/**
	 * Ensure that the NUOPC View is present before executing.
	 * @return the SWTBotTree for the tree in the NUOPC View outline
	 */
	private static SWTBotTree NUOPCTree() {
		SWTBotView nuopcView = bot.viewByTitle("NUOPC View");
		nuopcView.show();
		Composite nuopcViewComposite = (Composite) nuopcView.getWidget();
		Matcher<Tree> matcher = instanceOf(Tree.class);
		Tree swtTree = bot.widget(matcher, nuopcViewComposite);
		return new SWTBotTree(swtTree);
	}


	@AfterClass
	public static void sleep() {
		sleep(2*1000);
	}
	
	private static void sleep(long ms) {
		bot.sleep(ms);
	}
	
	private static IProject copyProjectToWorkspace(String projectName) throws IOException, CoreException  {			
		URL sourceFolder = FileLocator.toFileURL(FileLocator.find(MY_BUNDLE, new Path("test-projects/" + projectName), null));	
		File srcDir = new File(sourceFolder.getFile());
				
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject p = root.getProject(projectName);
		if (p.exists()) {
			p.delete(true, true, new NullProgressMonitor());
		}
		p.create(new NullProgressMonitor());
		File dstDir = p.getLocation().toFile();
		
		//System.out.println("Copy from: " + srcDir + " =====> " + dstDir);
		FileUtils.copyDirectory(srcDir, dstDir);
		p.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		p.open(new NullProgressMonitor());
		return p;
	}

}