package SeleniumDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class boniGarciaOpenBrowser {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/techcircle_2/Desktop/selenium/chromedriver_mac_arm64/chromedriver");	

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techcircleschool.com");
		
		

	}

}
