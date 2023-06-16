package Utilitiez;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class commonMethods extends PageInitializer {

	/*
	 * This method for sending String(text) to the element we have given
	 * 
	 * @param: WebElement element = it is accepting the webelement where we are
	 * sending the text String text = it is the parmaeter that we sending the String
	 * 
	 */
	public static void sendKey(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	public static void clickRadioOrCheckbox(List<WebElement> radioOrCheckbox, String value) {
		String actualValue;
		for (WebElement eachElement : radioOrCheckbox) {
			actualValue = eachElement.getAttribute("value").trim();
			if (eachElement.isEnabled() && actualValue.equals(value)) {
				eachElement.click();
				break;
			}
		}
	}

	public static void clickRadioOrCheckboxText(List<WebElement> radioOrCheckbox, String value) {
		String actualValue;
		for (WebElement eachElement : radioOrCheckbox) {
			actualValue = eachElement.getText();
			if (eachElement.isEnabled() && actualValue.equals(value)) {
				eachElement.click();
				break;
			}
		}
	}

	// selects dropDown value

	public static void selectDropDownByVisibleText(WebElement element, String textToSelect) {

		try {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			for (WebElement el : options) {
				if (el.getText().equals(textToSelect)) {
					select.selectByVisibleText(textToSelect);
					break;
				}
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	// selects dropDown index

	public static void selectDropDownIndex(WebElement element, int indexValue) {
		try {
			Select select = new Select(element);
			int size = select.getOptions().size();
			if (size > indexValue) {
				select.selectByIndex(indexValue);
			}

		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	// alert accept
	public static void acceptAlert() {
		try {
			Alert alert = Driver.getDriver().switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	// alert dismiss

	public static void dismissAlert() {
		try {
			Alert alert = Driver.getDriver().switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	// alert gettext

	public static String alertGetText() {

		String alertText = null;

		try {
			Alert alert = Driver.getDriver().switchTo().alert();
			alertText = alert.getText();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

		return alertText;
	}

//	java //     switch iframe by index
	public static void switchToIFrameByIndex(int iframeIndex) {
		try {
			Driver.getDriver().switchTo().frame(iframeIndex);

		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

//   switch iframe by element
	public static void switchToIFrameByElement(WebElement iframeElement) {
		try {
			Driver.getDriver().switchTo().frame(iframeElement);

		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

//   switchiframe by name
	public static void switchToIFrameByName(String iframeName) {
		try {
			Driver.getDriver().switchTo().frame(iframeName);

		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	//the user should have already opened or have clicked a link where a new tab/windows opened...
	public static void switchToChildWindow(String parentWindowHandle) {
        try {
            // Get all window handles
            Set<String> windowHandles = Driver.getDriver().getWindowHandles();

            // Switch to the child window
            for (String handle : windowHandles) {
                if (!handle.equals(parentWindowHandle)) {
                    Driver.getDriver().switchTo().window(handle);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception occurred while switching to child window: " + e.getMessage());
            e.printStackTrace();
        }
    }
	
	
	public static WebDriverWait getWaitObject() {	
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Constants.explicit_wait_time);
		return wait; 
	}
	
	public static WebElement waitForClickability(WebElement element) {
			return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	} 
	
	public static WebElement waitForVisiblity(WebElement element) {
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));

	}
	
	public static void click(WebElement element) {
		waitForVisiblity(element).click();
	}
	
	public static void sendKey(String keys, WebElement element) {
		waitForVisiblity(element).sendKeys(keys);
		
	}
	
	
	public static void hoverOverMouse(WebElement element) {
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element).build().perform();     
    }
    
    public static void dragAndDrop(WebElement element1,WebElement element2) {
        Actions action = new Actions(Driver.getDriver());
        action.dragAndDrop(element1, element2).build().perform();
    }

    public static void doubleClick(WebElement element) {
        Actions action = new Actions(Driver.getDriver());
        action.doubleClick(element).perform();
    }
	
	
    public static String fn_TakeSnapshot(WebDriver driver, String DestFilePath) throws IOException{
		//String TS=fn_GetTimeStamp();
		TakesScreenshot tss=(TakesScreenshot) driver;
		File srcfileObj= tss.getScreenshotAs(OutputType.FILE);
		//DestFilePath=DestFilePath+TS+".png";
		File DestFileObj=new File(DestFilePath);
		FileUtils.copyFile(srcfileObj, DestFileObj);
		return DestFilePath;
		}
	
	
    public static void takeScreenshot(WebDriver driver) throws IOException {
        // Create object of SimpleDateFormat class and decide the format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");

        // get the current date time with LocalDateTime
        LocalDateTime now = LocalDateTime.now();

        // Convert the date into the string with the specified format
        String dateString = now.format(formatter);
        
        // Casting WebDriver to TakeScreenshot
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        // Get the screenshot as an output file
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        // Define the destination path with the unique name
        String destFilePath = "target/screenshot_" + dateString + ".png";
        File destFile = new File(destFilePath);

        // Use FileUtils to copy the screenshot to the destination
        FileUtils.copyFile(srcFile, destFile);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	

}
