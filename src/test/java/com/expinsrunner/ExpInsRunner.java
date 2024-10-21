package com.expinsrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources",
		glue = "com.expinsstepdef",
		dryRun = false,
		plugin = {"pretty","html:target/report/exploeinsurance.html","json:target/report/expleoinsurance.json"}
		
		
		)
public class ExpInsRunner {

}
