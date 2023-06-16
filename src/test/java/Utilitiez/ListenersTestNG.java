package Utilitiez;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("New Test Started " + result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess Method " + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			
		commonMethods.takeScreenshot(Driver.getDriver());	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped Method " + result.getName());

	}


	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart method started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish method started");

	}

	
}
