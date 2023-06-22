package SeleniumDay4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxesAndRadioButtons {

	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void checkboxes() {

		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id = 'checkboxes']/input[1]"));

		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id = 'checkboxes']/input[2]"));

		Boolean wasItSelected1 = checkbox1.isSelected();
		Boolean wasItSelected2 = checkbox2.isSelected();

		if (wasItSelected1) {
			System.out.println("it is selected");
		} else {
			checkbox1.click();
		}

		if (wasItSelected2) {
			checkbox2.click();
		} else {

			System.out.println("Very GOOD");
		}

	}
	
	
	
	
	
	
	
	
	

}
