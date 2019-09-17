package com.applicationpages;

import com.commonutils.CommonUtlities;
import com.relevantcodes.extentreports.ExtentReports;
import com.reporting.ExtentReport;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class CommonAnnotations extends CommonUtlities{
	public ExtentReport report;
	@Given("Launch the (.*) browser")
	public void invokeBrowser(String browsertype) {
		System.out.println(browsertype);
		launchApplication(browsertype.toLowerCase());
	}
	
	
	@Before
	public void intializeSettings(Scenario scenarioname)
	{
		report=new ExtentReport();
		report.initReport(scenarioname.getName());
	}
	
	@After
	public void tearDown()
	{
		report.endTest();
		report.flushReport();
	}
	
	
}
