package org.earthsystemmodeling.cupid.swtbottest;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertEquals;

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
		copyProjectToWorkspace("v7-AtmOcnProto");
	}

	
	/**
	 * Open and reverse engineer a DriverAtmOcn.
	 */
	@Test
	public void reverseEngineerAtmOcnDriver() {
		ensureNUOPCViewVisible();
		
		bot.tree().getTreeItem("v7-AtmOcnProto").select();
		bot.tree().getTreeItem("v7-AtmOcnProto").expand();
		bot.tree().getTreeItem("v7-AtmOcnProto").getNode("esm.F90").doubleClick();
		bot.editorByTitle("esm.F90");
		
		//wait for reverse engineer
		sleep(3*1000);
		
		//basic verification of reverse engineering
		SWTBotTree tree = NUOPCTree();
			
		assertEquals("ESM", tree.getTreeItem("NUOPC Application").getNode("NUOPC Atm-Ocn Driver").getNode("Driver Name").cell(1));
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
	 * Open and reverse engineer a NUOPC Model (atm).
	 */
	@Test
	public void reverseEngineerModelAtm() {
		ensureNUOPCViewVisible();
		
		bot.tree().getTreeItem("v7-AtmOcnProto").select();
		bot.tree().getTreeItem("v7-AtmOcnProto").expand();
		bot.tree().getTreeItem("v7-AtmOcnProto").getNode("atm.F90").doubleClick();
		bot.editorByTitle("atm.F90");
		
		//wait for reverse engineer
		sleep(3*1000);
		
		//basic verification of reverse engineering
		SWTBotTree tree = NUOPCTree();
		
		tree.getTreeItem("NUOPC Application").getNode("NUOPC Model").getNode("Initialization").expand();
					
		assertEquals("ATM", tree.getTreeItem("NUOPC Application").getNode("NUOPC Model").getNode("Model Name").cell(1));
		assertEquals("SetServices", tree.getTreeItem("NUOPC Application").getNode("NUOPC Model").getNode("Set Services").cell(1));
		assertEquals("InitializeP1", tree.getTreeItem("NUOPC Application").getNode("NUOPC Model").getNode("Initialization").getNode("phase 1").cell(1));
		assertEquals("InitializeP2", tree.getTreeItem("NUOPC Application").getNode("NUOPC Model").getNode("Initialization").getNode("phase 2").cell(1));


	}
	
	/**
	 * Open and reverse engineer a NUOPC Model (ocn).
	 */
	@Test
	public void reverseEngineerModelOcn() {
		ensureNUOPCViewVisible();
		
		bot.tree().getTreeItem("v7-AtmOcnProto").select();
		bot.tree().getTreeItem("v7-AtmOcnProto").expand();
		bot.tree().getTreeItem("v7-AtmOcnProto").getNode("ocn.F90").doubleClick();
		bot.editorByTitle("ocn.F90");
		
		//wait for reverse engineer
		sleep(3*1000);
		
		//basic verification of reverse engineering
		SWTBotTree tree = NUOPCTree();
		
		tree.getTreeItem("NUOPC Application").getNode("NUOPC Model").getNode("Initialization").expand();
			
		assertEquals("OCN", tree.getTreeItem("NUOPC Application").getNode("NUOPC Model").getNode("Model Name").cell(1));
		assertEquals("SetServices", tree.getTreeItem("NUOPC Application").getNode("NUOPC Model").getNode("Set Services").cell(1));
		assertEquals("InitializeP1", tree.getTreeItem("NUOPC Application").getNode("NUOPC Model").getNode("Initialization").getNode("phase 1").cell(1));
		assertEquals("InitializeP2", tree.getTreeItem("NUOPC Application").getNode("NUOPC Model").getNode("Initialization").getNode("phase 2").cell(1));

	}
	
	/**
	 * Verifies that the Cupid project properties page works.
	 */
	@Test
	public void showAndUpdatePropsPage() {
		bot.tree().getTreeItem("v7-AtmOcnProto").select();
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