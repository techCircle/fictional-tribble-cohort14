package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitiez.Driver;

public class alertPage {
	
	
	public alertPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(id="alertBox")
	public WebElement alertBoxButton;
	
	
	@FindBy(id="confirmBox")
	public WebElement confirmBoxButton;
	
	
	@FindBy(id="promptBox")
	public WebElement promptBoxButton;
	
	
	@FindBy(id="output")
	public WebElement promptOutput;
	

}
