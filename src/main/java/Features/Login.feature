Feature: Automation Practice Login Test 

#Normal (sendKey("value") is used to send the data)

#Scenario: Loing Test

#Given User is on Login Page
#When Tittle of Page is Automation Practice
#Then User Enter Username and Password
#And User Click on Login Button
#And User is on Next Page 


# Data Driven Without Example Keyword

#Scenario: Loing Test

#Given User is on Login Page
#When Tittle of Page is Automation Practice
#Then User Enter "rahulwarkhedkar@gmail.com" and "Temp1234"
#And User Click on Login Button
#And User is on Next Page 


# Data Driven With Example Keyword

Scenario Outline: Loing Test 
	Given User is on Login Page 
	When Tittle of Page is Automation Practice 
	Then User Enter "<username>" and "<password>" 
	And User Click on Login Button 
	And User is on Next Page 
	
	Examples: 
		| username|password|
		|rahulwarkhedkar@gmail.com|Temp1234|
		
		
