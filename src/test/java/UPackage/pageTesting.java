package UPackage;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilitiez.ConfigurationReader;
import Utilitiez.Driver;
import Utilitiez.commonMethods;
import pages.dashboardPage;
import pages.loginPage;

public class pageTesting extends commonMethods {
	
	// lvl_al snipz
		
	@BeforeMethod
	public void openBrowser() {
			Driver.getDriver();
	}
	
	@Test
	public void loginWithValidUsernameValidPassword() {	
		lp.usernameField.sendKeys(ConfigurationReader.getProperty("orangeHRM_username"));
		lp.passwordField.sendKeys(ConfigurationReader.getProperty("orangeHRM_password"));
		lp.loginButton.click();
		//verifying that you are logged in
		AssertJUnit.assertTrue(dp.dashboardText.isDisplayed());
	
	}
	
	@Test
	public void loginWithInValidUsernameInValidPassword() {	
		lp.usernameField.sendKeys(ConfigurationReader.getProperty("orangeHRM_invalidUsername"));
		lp.passwordField.sendKeys(ConfigurationReader.getProperty("orangeHRM_invalidPassword"));
		lp.loginButton.click();
		//verify the error code
	}

}
