package testNG_Topics;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.*;
import org.testng.annotations.Test;


public class testNG_SampleTest {
	
	String message = "Hamad's Money";
	MessageUtil messageUtil = new MessageUtil(message);
	
	
	@Test(enabled=true)
	public void testPrintMessage() {
		message = "Abdul's Money";
		AssertJUnit.assertEquals(message, messageUtil.printMessage());	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
