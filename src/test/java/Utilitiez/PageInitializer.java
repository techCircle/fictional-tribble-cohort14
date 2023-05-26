package Utilitiez;

import pages.alertPage;
import pages.dashboardPage;
import pages.loginPage;

public class PageInitializer extends Driver {
	
	public static loginPage lp;
	public static dashboardPage dp;
	public static alertPage ap;
	
	
	public static void initialize() {
		lp = new loginPage();
		dp = new dashboardPage();
		ap = new alertPage();
	}
	
	
	

}
