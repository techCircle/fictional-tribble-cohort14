package testNG_Topics;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ExpectedExceptionTest {
	
	
	String message = "TechCircle";
	MessageUtil messageUt = new MessageUtil(message);
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void testPrintMessage() {
		messageUt.printMessageExceptionMessage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
