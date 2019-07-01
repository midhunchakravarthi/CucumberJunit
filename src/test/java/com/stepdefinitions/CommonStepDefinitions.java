package com.stepdefinitions;

import java.util.List;

import com.genericmethods.GenericMethods;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonStepDefinitions extends GenericMethods{
	
	@Before
	public void beforeHook()
	{
		System.out.println("****** Before Hook ******");
		
	}
	@After
	public void afterHook()
	{
		System.out.println("****** After Hook ******");
		
		// to publish the report
	}
	
		
	@Given("^Launch the \"(.*?)\" browser$")
	public void launchBrowser(String browser,DataTable table) {
		System.out.println("Launching Browser"+browser);
		
		List<List<String>> testdata=table.raw();	
		
		String url=testdata.get(0).get(0);
		launchBrowser(browser,url);
	
	}
	
	@Then("^Enter email id under \"(.*)\" section$")
	public void enterEmailID(String datatypes)
	{
		System.out.println("Enter Email ID");
	}
	
	
}
