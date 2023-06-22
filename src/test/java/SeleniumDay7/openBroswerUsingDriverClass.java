package SeleniumDay7;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;

import Utilitiez.Driver;

public class openBroswerUsingDriverClass {

	@BeforeMethod
	public void setUp() {

		Driver.getDriver();

	}

	@Test
	public void test1() {
			Driver.getDriver().findElement(By.xpath("")).sendKeys("");
	}

}
