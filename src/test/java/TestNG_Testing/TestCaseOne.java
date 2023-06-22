package TestNG_Testing;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilitiez.RetryAnalyzer;

public class TestCaseOne {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test1() {
		AssertJUnit.assertEquals(false, true);
	}

	@Test(groups="regressionTest")
	public void test2() {
		AssertJUnit.assertEquals(false, true);
	}

}
