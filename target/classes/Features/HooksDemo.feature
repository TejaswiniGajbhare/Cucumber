Feature: Hooks Demo 

Scenario: Loing Test 
	Given User is on Home Page 
	When User see the Page 
	Then User is Happy
	
	@First
	Scenario: First Test 
	Given User is on One Page 
	When User see the Page one
	Then User is HappyOne 
	
	@Second
	Scenario: Second Test 
	Given User is on Two Page 
	When User see the Page Two
	Then User is HappyTwo
	
	@Third
	Scenario: Third Test 
	Given User is on Three Page 
	When User see the Page Three
	Then User is HappyThree 
