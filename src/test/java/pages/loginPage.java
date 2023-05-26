package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitiez.Driver;

public class loginPage {
	
	
	public loginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(name="username")
	public WebElement usernameField;
	
	@FindBy(name="password")
	public WebElement passwordField;
	
	@FindBy(xpath="//button[text()=' Login ']")
	public WebElement loginButton;
	
	
}
