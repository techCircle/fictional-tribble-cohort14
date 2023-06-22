package SeleniumDay4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiceForCheckBoxRadioButtons {

	WebDriver driver;
	String expectedString = "Do you like the site?";

	@BeforeMethod
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void clickAndVerifyRadioButton() {

		String actualString = driver.findElement(By.xpath("//div[@class='mb-3']")).getText();
		AssertJUnit.assertEquals(expectedString, actualString);
		driver.findElement(By.xpath("//div[@class='mb-3']/following-sibling::div[1]")).click();
		String yesRadioButtonText = driver.findElement(By.xpath("//p[@class='mt-3']")).getText();
		AssertJUnit.assertTrue(yesRadioButtonText.contains("Yes"));
		AssertJUnit.assertFalse(driver.findElement(By.xpath("//div[@class='mb-3']/following-sibling::div[2]")).isSelected());
		// Assert.assertFalse(driver.findElement(By.xpath("//div[@class='mb-3']/following-sibling::div[3]")).isEnabled());

	}

	@Test
	public void clickAndVerifyCheckbox() {

		driver.navigate().to("https://demoqa.com/checkbox");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@class='rct-checkbox']")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
