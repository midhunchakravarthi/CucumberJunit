package com.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="Features",
				glue= {"com.applicationpages"},
				tags = {"~@Vamshi"},
				monochrome = true	)


public class RunnerClass {
	

}
