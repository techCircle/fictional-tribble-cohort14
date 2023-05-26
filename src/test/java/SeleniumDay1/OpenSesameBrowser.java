package SeleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSesameBrowser {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","/Users/techcircle_2/Desktop/selenium/chromedriver_mac_arm64/chromedriver");	
		

		
	// instantiate a Chromedriver class	
	WebDriver driver = new ChromeDriver();	
	//WebDriver driver2 = new FirefoxDriver();
	//WebDriver driver3 = new SafariDriver();	
	
	
	//maximize the browser
	driver.manage().window().maximize();
	
	//launch website
	driver.get("https://www.techcircleschool.com");
	
	
	
	}

}
