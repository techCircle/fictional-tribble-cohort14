package Area51;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class homePageTestCases {

	WebDriver driver;

	@Before
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// 1) Open the browser
		// 2) Enter the URL “http://practice.automationtesting.in/”
		driver.get("https://practice.automationtesting.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		
		driver.findElement(By.id("menu-item-40")).click();
		
		driver.switchTo().frame(driver.findElement(By.id("aswift_7")));
		driver.switchTo().frame(driver.findElement(By.id("ad_iframe")));
		
		driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
		driver.switchTo().defaultContent();
	}
	
	@After
	public void tearDown() {
		//driver.close();
	}

	@Test
	public void homePageWithThreeSlidersOnly() {

		/*
		 * 5) Test whether the Home page has Three Sliders only 6) The Home page must
		 * contains only three sliders
		 */

		// 3) Click on Shop Menu
		driver.findElement(By.id("menu-item-40")).click();

		// 4) Now click on Home menu button
		driver.findElement(By.xpath("//a[text() ='Home']")).click();

		
		List<WebElement> sliders = driver.findElements(By.xpath("//div[@class='n2-ss-slider-3']/div"));
		
		
		int sliderSize = sliders.size();
		
		
		if(sliderSize==3) {
			System.out.println("Pass");
		}else {
			System.out.println("there aren't 3 sliders on the page");
		}
//		
//		for (WebElement eachSliders : sliders) {
//			
//			System.out.println(eachSliders.getText());
//			
//			
//		}
		
		
		
//		5) Test whether the Home page has Three Sliders only
//		6) The Home page must contains only three sliders
//	 

		// COMING BACK TO LAST STEPS after learning List Webelements

	}
	
	@Ignore
	@Test
	public void HomePageWithThreeArrivalsOnly() {
			// code here
	}

}
