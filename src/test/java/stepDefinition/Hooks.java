package stepDefinition;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Utilitiez.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
	@BeforeMethod
	public void beforeMethod() {
		Driver.getDriver();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.tearDown();
	}
	
	
}
