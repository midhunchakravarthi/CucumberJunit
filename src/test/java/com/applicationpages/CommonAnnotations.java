package com.applicationpages;

import com.commonutils.CommonUtlities;

import cucumber.api.java.en.Given;

public class CommonAnnotations extends CommonUtlities{
	
	@Given("Launch the chrome browser")
	public void invokeBrowser() {
		launchApplication("chrome");
	}
	
	
}
