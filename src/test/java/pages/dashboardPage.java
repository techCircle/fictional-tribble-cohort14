package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitiez.Driver;

public class dashboardPage {
	
	public dashboardPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//h6[text() ='Dashboard']")
	public WebElement dashboardText;
	
	
	
	
	

}
