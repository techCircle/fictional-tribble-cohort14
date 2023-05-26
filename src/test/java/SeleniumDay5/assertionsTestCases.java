package SeleniumDay5;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertionsTestCases {
	WebDriver driver;

	@Before
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void assertTestCase1() {

		String actualTitleOfThePage = driver.getTitle();
		String actualCurrentURL = driver.getCurrentUrl();

		String expectedTitle = "H Y R Tutorials - H Y R Tutorials";
		String expectedURL = "https://www.hyrtutorials.com/";

		// assertion stops the execution at failure
		Assert.assertEquals(expectedTitle, actualTitleOfThePage);

		System.out.println("hello world");
		///////////////////////////////////////////
		
		Boolean isTitleMatch = actualCurrentURL.equals(expectedURL);
		
		
		Assert.assertEquals("expected", "actual");
		
		Assert.assertTrue(isTitleMatch); 
		
		Assert.assertFalse(true);
	
	}

}
