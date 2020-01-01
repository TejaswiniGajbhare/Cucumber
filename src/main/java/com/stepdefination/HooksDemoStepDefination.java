package com.stepdefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksDemoStepDefination {

	// Global Hooks
	@Before
	public void setup() {
		System.out.println("SetUp() called");
	}

	@After
	public void tearDown() {
		System.out.println("tearDowm() called");
	}

	// Local Hooks--> Only for @First Scenario

	@Before("@First")
	public void oneS() {
		System.out.println("oneS called");
	}

	@After("@First")
	public void oneT() {
		System.out.println("oneT called");
	}

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		System.out.println("On Home Page");
	}

	@When("^User see the Page$")
	public void user_see_the_Page() throws Throwable {
		System.out.println("See Page");
	}

	@Then("^User is Happy$")
	public void user_is_Happy() throws Throwable {
		System.out.println("Happy");
	}

	@Given("^User is on One Page$")
	public void user_is_on_One_Page() throws Throwable {
		System.out.println("First Given");
	}

	@When("^User see the Page one$")
	public void user_see_the_Page_one() throws Throwable {
		System.out.println("First When");
	}

	@Then("^User is HappyOne$")
	public void user_is_HappyOne() throws Throwable {
		System.out.println("First Then");
	}

	@Given("^User is on Two Page$")
	public void user_is_on_Two_Page() throws Throwable {

	}

	@When("^User see the Page Two$")
	public void user_see_the_Page_Two() throws Throwable {

	}

	@Then("^User is HappyTwo$")
	public void user_is_HappyTwo() throws Throwable {

	}

	@Given("^User is on Three Page$")
	public void user_is_on_Three_Page() throws Throwable {

	}

	@When("^User see the Page Three$")
	public void user_see_the_Page_Three() throws Throwable {

	}

	@Then("^User is HappyThree$")
	public void user_is_HappyThree() throws Throwable {

	}

}
