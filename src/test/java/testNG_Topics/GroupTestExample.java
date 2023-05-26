package testNG_Topics;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTestExample {
	
	String message = ".com";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test(groups = {"ios7", "ios8", "ios6", "regression", "smoketest"})
	public void testPrintMessge() {	
		message = ".com";
		AssertJUnit.assertEquals(message, messageUtil.printMessage() );
	}
	
	@Test(groups = "ios10")
	public void testSalutationMessage() {
		message = "techcircleschool" + message;
		AssertJUnit.assertEquals(message, messageUtil.salutionMessage());
	}
	
	@Test(groups = {"android", "blackberry", "htc"})
	public void testingExitMessage() {
		message = "www." + "techcircletutorial" + ".com";
		AssertJUnit.assertEquals(message, messageUtil.exitMessage());

	}
	

}
