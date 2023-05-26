package SeleniumDay7;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import Utilitiez.Driver;

public class openBroswerUsingDriverClass {

	@Before
	public void setUp() {

		Driver.getDriver();

	}

	@Test
	public void test1() {
			Driver.getDriver().findElement(By.xpath("")).sendKeys("");
	}

}
