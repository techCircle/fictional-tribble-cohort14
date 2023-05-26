package testNG_Topics;

import org.testng.annotations.DataProvider;

public class dataProviderClass {

	@DataProvider(name = "dpMethod")
	public Object[][] dpMethod() {
		return new Object[][] { { "Shafkat", "Ali", 24 } };
	}

//	@DataProvider(name = "abcMethod")
//	public Object[][] abcMethod(){
//		return new Object[][] {{"Shafkat", 24},{"Milad" , 45},{"Abdulla", 61},{"Syed", 16}};
//	}
//	

}
