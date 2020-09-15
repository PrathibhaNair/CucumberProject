package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.Base;
import com.base.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = {
		"com.stepdefinition" }, dryRun = false, monochrome = true, plugin = { "html:src\\test\\resources\\Reporting",
				"json:src\\test\\resources\\Reporting\\CucumberJsonReport.json",
				"junit:src\\\\test\\\\resources\\\\Reporting\\\\CucumberXmlReport.xml" } )
public class TestRunnerClass extends Base {

	@AfterClass
	public static void afterClass() {
		//driverQuit();
		
		JVMReport.generateJVMReport("C:\\Users\\Prathibha\\eclipse-workspace\\CucumberPjt4\\src\\test\\resources\\Reporting\\CucumberJsonReport.json");
	}

}
