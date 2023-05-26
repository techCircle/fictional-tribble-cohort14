package testNG_Topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utilitiez.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowser {

	public WebDriver driver;

	@Parameters("browser") 
	@BeforeClass
	public void beforeTest(String browser) { 

		if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.get("https://www.techcircle.dev");
	}
	
	@Parameters("browser")
	@Test
	public void login(String browser) {
		
//		System.out.println("browser is: " + browser);		
	}

}
