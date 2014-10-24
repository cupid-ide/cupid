package org.eclipsecon.swtbot.example;

import static junit.framework.Assert.fail;
import static org.eclipse.swtbot.swt.finder.SWTBotTestCase.pass;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class MyFirstTest {

	@Test
	public void thisOneFails() throws Exception {
		fail("this test fails");
	}

	@Test
	public void thisOnePasses() throws Exception {
		pass();
	}
}
