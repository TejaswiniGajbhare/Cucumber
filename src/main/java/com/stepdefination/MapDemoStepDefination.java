//
// package com.stepdefination;
//
// import java.util.Map;
// import java.util.concurrent.TimeUnit;
//
// import org.junit.Assert;
// import org.openqa.selenium.By;
// import org.openqa.selenium.JavascriptExecutor;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
//
// import cucumber.api.DataTable;
// import cucumber.api.java.en.Given;
// import cucumber.api.java.en.Then;
// import cucumber.api.java.en.When;
//
// public class MapDemoStepDefination {
//
// WebDriver driver;
//
// @Given("^User is on Login Page$")
// public void user_is_on_Login_Page() throws Throwable {
// System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
// driver = new ChromeDriver();
//
// driver.get("http://automationpractice.com/index.php");
// driver.manage().window().maximize();
// driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
// }
//
// @When("^Tittle of Page is Automation Practice$")
// public void tittle_of_Page_is_Automation_Practice() throws Throwable {
// String tittle = driver.getTitle();
// System.out.println("Tittle of Page=" + tittle);
// Assert.assertEquals("My Store", tittle);
// }
//
// // Data driven testing using Map (Data Table using maps)
//
// @Then("^User Enter username and password$")
// public void user_Enter_UserName_and_Password(DataTable mapobj) throws
// Throwable {
//
// driver.findElement(By.xpath("//a[@class='login']")).click();
// Thread.sleep(4000);
// // Scroll the page
// JavascriptExecutor jse = (JavascriptExecutor) driver;
// jse.executeScript("window.scrollBy(0,400)");
// Thread.sleep(4000);
//
// for (Map<String, String> data : mapobj.asMaps(String.class, String.class)) {
// driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data.get("username"));
// Thread.sleep(2000);
// driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(data.get("password"));
// Thread.sleep(4000);
// }
//
// }
//
// @Then("^User Click on Login Button$")
// public void user_Click_on_Login_Button() throws Throwable {
// driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
// }
//
// @Then("^User is on Next Page$")
// public void user_is_on_Next_Page() throws Throwable {
// System.out.println("User is on the Next Page");
// String tittle = driver.getTitle();
// System.out.println("Tittle of Page=" + tittle);
// Assert.assertEquals("My Store", tittle);
//
// driver.close();
// }
//
// }
