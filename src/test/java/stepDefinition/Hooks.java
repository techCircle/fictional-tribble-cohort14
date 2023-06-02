package stepDefinition;

import Utilitiez.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
	@Before
	public void beforeMethod() {
		Driver.getDriver();
		
	}
	
	@After
	public void tearDown() {
		Driver.tearDown();
	}
	
	
}
