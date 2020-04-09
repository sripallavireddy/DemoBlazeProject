package com.testrunner;

import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/testcase.feature" ,
		//tags="@tag6",
		glue="com.stepdefinition",
		dryRun=false,
		monochrome=true,
		plugin = {"pretty", "html:target/cucumber-html-report",
	             "json:target/cucumber-json-report",
	             "junit:target/cucumber-junit-report",
	             "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent-report/Extentreport.html"}    
		
		)

public class TestRunner 
{
	public static void extentreport()
	{
		Reporter.loadXMLConfig("./src/test/resources/Log4j");
		Reporter.setSystemInfo("user",System.getProperty("user.name"));
		Reporter.setSystemInfo("os","Windows");
		Reporter.setTestRunnerOutput("sample test runner output message");
	}

}
