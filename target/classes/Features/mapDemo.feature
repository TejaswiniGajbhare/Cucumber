Feature: Map Demo

Scenario Outline: Loing Test 
	Given User is on Login Page 
	When Tittle of Page is Automation Practice 
	Then User Enter "<username>" and "<password>" 
	And User Click on Login Button 
	And User is on Next Page 
	
	Examples: 
		| username | password |
		|rahulwarkhedkar@gmail.com|Temp1234|
		|uname1|pwd1|
		|uname2|pwd2|
		|uname3|pwd3|
		|uname4|pwd4|