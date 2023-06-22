package SeleniumDay6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionClassTestCases {

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
	public void hoverOverAButton() {

		WebElement acctListButton = driver.findElement(By.xpath("//*[@id='nav-tools']/a[2]"));

		Actions action = new Actions(driver);

		action.moveToElement(acctListButton).build().perform();

	}

}
