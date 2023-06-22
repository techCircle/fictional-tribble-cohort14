package SeleniumDay6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class arraysOfProductsTestCases {

	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void printOutListOfMenu() throws InterruptedException {

		selectInterTab("Sortable");

		Thread.sleep(3000);

		selectInterTab("Resizable");

	}

	public void selectInterTab(String tabName) {
		List<WebElement> interactionsTab = driver.findElements(By.xpath("//div[@id='sidebar']/aside[1]/ul/li"));
		for (WebElement eachTab : interactionsTab) {
			if (eachTab.getText().contains(tabName)) {
				eachTab.click();
				break;
			}
		} 
	}

}
