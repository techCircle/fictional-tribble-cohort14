package SeleniumDay6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandlepractice {
	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void windowHandle() {
		// getting title of the page before clicking on a tab and switching over
		String mainTitleName = driver.getTitle();
		System.out.println(mainTitleName);

		String currentWindow = driver.getWindowHandle();
		System.out.println(currentWindow);
//
////		// getting all the open windows and storing them in a set of strings
//		Set<String> ids = driver.getWindowHandles();
////
//		// storing the set into an iterator so that we can itterate and assign each
//		// window to seperate string
//		Iterator<String> it = ids.iterator();
//		String parentID = it.next();
//		String childID = it.next();
	}
	
}
