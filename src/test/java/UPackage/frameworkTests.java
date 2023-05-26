package UPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilitiez.commonMethods;

public class frameworkTests {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		
		//opened browser
		
		//navigated to URL
		
//		//Clear the input box
//		driver.findElement(By.id("inputBox")).clear();
//		//sendKey
//		driver.findElement(By.id("inputBox")).sendKeys("username");

		commonMethods.sendKey(driver.findElement(By.id("inputBox")), "username");
		
		commonMethods.wait(3);
		
		String radioXpath= "//div[@style='margin-left:20px;']/input";
		
		commonMethods.clickRadioOrCheckbox(driver.findElements(By.xpath(radioXpath)), "Option 2");
		
		//    

	}

}
