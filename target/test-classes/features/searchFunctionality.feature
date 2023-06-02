Feature: Search Functionality


@queryTest
Scenario Outline: Searching for Products
	Given the user is on the homepage
	When the user enters "<search_query>" in the search bar
	And clicks on the search button
	Then the user should see search results for "<search_query>"
	
	Examples:
	|search_query|
	|iPhone			 |
	|Samsung		 |
	|Laptop			 |
	|Headphones	 |
	|Call of Duty|
	|Bag of Chips|