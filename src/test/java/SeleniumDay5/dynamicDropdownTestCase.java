package SeleniumDay5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicDropdownTestCase {
	
	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}
	
	@Test
	public void oneWayTrip() throws InterruptedException {
		driver.findElement(By.id("fromCity")).sendKeys("IAD");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='react-autowhatever-1']/div/ul/li[1]")).click();
		
		
		driver.findElement(By.id("toCity")).sendKeys("PNQ");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='react-autowhatever-1']/div[1]/ul/li[1]")).click();

	}
	
	
	
	
	
	
	

}
