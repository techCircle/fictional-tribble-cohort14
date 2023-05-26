package testNG_Topics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

	@Parameters("param1")
	@Test
	public void parameterTest(String name) {

		System.out.println(name);
			
		
		

	}

}
