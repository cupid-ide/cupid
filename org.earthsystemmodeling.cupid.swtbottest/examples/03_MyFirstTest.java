package org.eclipsecon.swtbot.example;

import org.eclipse.swtbot.eclipse.finder.SWTEclipseBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class MyFirstTest {

	private static SWTEclipseBot	bot;

	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTEclipseBot();
		bot.view("Welcome").close();
	}

	@Test
	public void canCreateANewJavaProject() throws Exception {
		bot.menu("File").menu("New").menu("Project...").click();

		bot.shell("New Project").activate();
		bot.tree().select("Java Project");
		bot.button("Next >").click();

		bot.textWithLabel("Project name:").setText("MyFirstProject");

		bot.button("Finish").click();

		// FIXME: assert that the project is actually created, for later
	}

	@Test
	public void canCreateANewJavaClass() throws Exception {
		bot.toolbarDropDownButtonWithTooltip("New Java Class").menuItem("Class").click();

		bot.shell("New Java Class").activate();
		bot.textWithLabel("Source folder:").setText("MyFirstProject/src");

		bot.textWithLabel("Package:").setText("org.eclipsecon.project");
		bot.textWithLabel("Name:").setText("HelloWorld");

		bot.button("Finish").click();

		// FIXME: assert that the class is actually created, for later
	}

	@AfterClass
	public static void sleep() {
		bot.sleep(2000);
	}

}
