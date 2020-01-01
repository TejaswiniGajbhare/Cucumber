@FunctionalTest
Feature: Cucumber Tag Demo

@SmokeTest @RegressionTest
Scenario: Login with Correct username and password
Given This is a valid test

@RegressionTest
Scenario: Login with Incorrect username and password
Given This is a Invalid test

@SmokeTest
Scenario: Create a Contact
Given This is a contact test case

@SmokeTest @RegressionTest
Scenario: Create a deal
Given This is a valid deal

@SmokeTest
Scenario: Create a task
Given This is a valid task

@RegressionTest
Scenario: Create a case
Given This is a valid case

@SmokeTest
Scenario: verify left pannel link
Given Clicking on left pannel link

@RegressionTest
Scenario: Search a deal
Given This is a search deal test

@SmokeTest @EndToEnd
Scenario: Search a contact
Given This is a search contact test

@SmokeTest @RegressionTest
Scenario: Search a case
Given This is a search case test

@RegressionTest
Scenario: Search a call
Given This is a search call test

@SmokeTest @RegressionTest
Scenario: Search an email
Given This is a search email test

@EndToEnd
Scenario: Search a docs
Given This is a search docs test

@RegressionTest
Scenario: Search a form
Given This is a search form test

@EndToEnd
Scenario: Validate a Report
Given This is a Report test

@EndToEnd
Scenario: Search a task
Given This is a search task test 

@RegressionTest
Scenario: LogOut a case
Given This is a search task test 

