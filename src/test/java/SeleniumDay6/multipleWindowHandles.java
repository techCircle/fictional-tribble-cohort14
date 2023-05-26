package SeleniumDay6;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipleWindowHandles {

	WebDriver driver;

	@Before
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void switchToAnotherTabTest() {
		// getting title of the page before clicking on a tab and switching over
		String mainTitleName = driver.getTitle();
		System.out.println(mainTitleName);

		// clicking on a button to open new tab
		driver.findElement(By.id("newWindowBtn")).click();

		// getting all the open windows and storing them in a set of strings
		Set<String> ids = driver.getWindowHandles();

		// storing the set into an iterator so that we can itterate and assign each
		// window to seperate string
		Iterator<String> it = ids.iterator();
		
		String parentID = it.next();
		String childID = it.next();
//
//		// switching to the child window/tab
//		driver.switchTo().window(childID);
//
//		// veriying if we have switched over, by getting the current title,
//		// which should be the child window title
//		String anotherTitleName = driver.getTitle();
//		System.out.println(anotherTitleName);
//
//		// since we are in the child window, the list should print out
//		List<WebElement> basicControlsList = driver.findElements(By.xpath("//*[@class='basicControls']/div/ul/li"));
//
//		for (WebElement eachItemInList : basicControlsList) {
//			String itemString = eachItemInList.getText();
//			System.out.println(itemString);
//		}

	}

}
