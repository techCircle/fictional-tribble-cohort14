package testNG_Topics;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import Utilitiez.ConfigurationReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	
	public WebDriver driver;
	

	@Test
	public void FirefoxTest() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(ConfigurationReader.getProperty("orangeHRM"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void ChromeTest() {
		
		FirefoxTest();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(ConfigurationReader.getProperty("orangeHRM"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void safariTest() {
		if (!System.getProperty("os.name").toLowerCase().contains("mac")) {
			throw new WebDriverException("Your OS doesn't support Safari");
		}

		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
		
		driver.get(ConfigurationReader.getProperty("orangeHRM"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	
	

}
