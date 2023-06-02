Feature: User Login
  
	
 Background: 
 	  Given the user is on the login page
 	
 
  @smokeTest	@regressionSuite
  Scenario: Successful login
   	When the user enters valid credentials
   	And clicks on the login button
   	Then the user should be logged in successfully
   	
   	
  
  Scenario: Failed Login
  	When the user enters invalid credentials
  	And clicks on the login button
  	Then the user should see an error message