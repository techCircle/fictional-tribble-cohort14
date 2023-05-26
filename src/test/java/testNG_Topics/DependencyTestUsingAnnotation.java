package testNG_Topics;

import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {
	
	@Test(dependsOnMethods= "method2")
	public void dashboardCheck() {
		
		System.out.println("Dashboard is displayed "
				+ "and there are some assertions here");
	}
	
	@Test
	public void method2() {
		System.out.println("This is method2");
	}
	


	
	
	@Test
	public void login2() {
		System.out.println("This is login2");

	}
	
	@Test
	public void helloWorld() {
		System.out.println("This is helloWorld");

	}
	
	
	
	

}
