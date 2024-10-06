package org.runner;

import org.junit.AfterClass;

import org.junit.runner.RunWith;
import org.jvm.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue = "org.stepdefinition",plugin = {"html:target","json:jsonf//jsonfile.json"})

public class RunnerClass {
	
	@AfterClass
	public static void JvmReport() {
		
		JvmReport.jvmReporting("C:\\Users\\durairaj\\eclipse-workspace\\CucumberProject\\jsonf\\jsonfile.json");

	}

}
