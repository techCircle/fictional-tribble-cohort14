package TestNG_Testing;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilitiez.Driver;
import Utilitiez.ListenersTestNG;
import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(ListenersTestNG.class)
public class TestNG_TestCase {
	
	
	public void testCase1() {
		
	}
	
	
	@Test(groups="regressionTest")  ///failed test
	public void Test1openBrowser() {
		Driver.getDriver();
		String expectedTitle = "OrangeHDR";
		String actualTitle = Driver.getDriver().getTitle();
		
		AssertJUnit.assertEquals(expectedTitle, actualTitle);
	}
	
	@Test(groups="regressionTest") // sucess test
	public void Test2closeBrowser() {
		Driver.getDriver();
		Reporter.log("Driver closed After Testing");
	}
	
	
	@Test  //skip test
	public void skipTest() {
		throw new SkipException("Skipping the test method");
	}
	
	public void ignoreingThis() {
		System.out.println("this is IGNORE TEST");
	}
	
	
	
	
	
	
	
	
	
	

}
