package SeleniumDay5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import Utilitiez.ConfigurationReader;
import Utilitiez.Driver;
import Utilitiez.commonMethods;

public class alertTestCases extends commonMethods{
	//WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		Driver.getDriver();
		Driver.getDriver().navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");;
		
	}
	
	
	@Test
	public void handleAlertBoxes() {
		
	//first alert
		//driver.findElement(By.id("alertBox")).click();
		ap.alertBoxButton.click();
//		String fistAlertBox = driver.switchTo().alert().getText();
//		System.out.println(fistAlertBox);
		acceptAlert();
		
	//second alert	
		//driver.findElement(By.id("confirmBox")).click();
		ap.confirmBoxButton.click();
//		String secondAlertBox = driver.switchTo().alert().getText();
//		System.out.println(secondAlertBox);
	//	driver.switchTo().alert().accept();
		acceptAlert();
		
		
	//third alert
		String textTobeSent = ConfigurationReader.getProperty("myName");
		//driver.findElement(By.id("promptBox")).click();
		ap.promptBoxButton.click();
		String thirdAlertBox = alertGetText();
		System.out.println(thirdAlertBox);
		//driver.switchTo().alert().sendKeys(textTobeSent);
		Driver.getDriver().switchTo().alert().sendKeys(textTobeSent);
		acceptAlert();
		String wholeOutputText = ap.promptOutput.getText();
		AssertJUnit.assertTrue(wholeOutputText.contains(textTobeSent));
		
	}
	
	
}








































