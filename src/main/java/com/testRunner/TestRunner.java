package com.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:/Eclipse_Workspace/CucumberTest/src/main/java/Features/HooksDemo.feature", glue = {
		"com.stepdefination" }, format = { "pretty", "html:test-outout", "json:json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml" }, dryRun = false, monochrome = true, strict = true
// tags = {"@EndToEnd", "~@SmokeTest", "~@RegressionTest" }
)

public class TestRunner {

}

// Or Condition= tags = {"@EndToEnd, @SmokeTest" }
// And Condition= tags = {"@EndToEnd", "@SmokeTest" }
// Ignoring Tag= tags = {"@EndToEnd", "~@SmokeTest", "~@RegressionTest" })
