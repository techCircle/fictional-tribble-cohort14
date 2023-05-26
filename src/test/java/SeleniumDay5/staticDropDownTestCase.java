package SeleniumDay5;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Utilitiez.Driver;
import Utilitiez.commonMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class staticDropDownTestCase {

	WebDriver driver;

	@Before
	public void openBrowser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://the-internet.herokuapp.com/dropdown");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Driver.getDriver();
	}

	@Test
	public void staticDropDown() throws InterruptedException {
		
	// static dropwdown
//		Select s = new Select(driver.findElement(By.id("dropdown")));
//		
//		Thread.sleep(2000);	
//		s.selectByIndex(1);	
//		Thread.sleep(2000);
//		s.selectByValue("2");	
//		Thread.sleep(2000);
//		s.selectByVisibleText("Option 1");
		
		
		commonMethods.wait(2);
		commonMethods.selectDropDownIndex(Driver.getDriver().findElement(By.id("dropdown")), 1);
		commonMethods.wait(1);
		commonMethods.selectDropDownByVisibleText(Driver.getDriver().findElement(By.id("dropdown")),"Option 2");
		commonMethods.wait(1);
	}
	
	
	
	
}
