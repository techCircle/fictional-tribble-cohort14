package SeleniumDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentsGetGrilled {

	public static void main(String[] args) {

		
	System.setProperty("webdriver.chrome.driver", "/Users/techcircle_2/Desktop/selenium/chromedriver_mac_arm64/chromedriver");	

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.techcircleschool.com");
	
	
	
	}
}
