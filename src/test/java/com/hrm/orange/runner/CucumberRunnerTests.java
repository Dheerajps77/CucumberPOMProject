package com.hrm.orange.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Resources/LoginPage.feature", 
				 glue = "com.hrm.orange.definitions", 
				 publish = true,
				 dryRun = false,
				 plugin = {"pretty", "html:target/CucumberReports/CucumberReport.html",
		                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class CucumberRunnerTests {

}
