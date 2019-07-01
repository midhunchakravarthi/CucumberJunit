package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features= {"Features"},
		glue= {"com.stepdefinitions"},
		tags= {"@FireFox"},
		monochrome=true,
		plugin= {"html:ReportsByDeafult"}
		
		
		
		
		
		
		
		)






public class FireFoxRunner {
	
	


}
