package SeleniumDay3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class siblingXpath {

	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void HomePageWithThreeSlidersOnly() {
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
