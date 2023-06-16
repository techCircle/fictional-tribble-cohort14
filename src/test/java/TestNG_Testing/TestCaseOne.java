package TestNG_Testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilitiez.RetryAnalyzer;

public class TestCaseOne {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test1() {
		Assert.assertEquals(false, true);
	}

	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}

}
