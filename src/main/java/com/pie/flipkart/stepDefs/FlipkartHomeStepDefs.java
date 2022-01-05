package com.pie.flipkart.stepDefs;

import com.pie.flipkartDemo.core.DriverFactory;

import io.cucumber.java.en.Given;

public class FlipkartHomeStepDefs {
	
private DriverFactory driverFactory;
	
	public FlipkartHomeStepDefs() {
		driverFactory = DriverFactory.getInstance();
	}
	
	@Given ("^I have to navigate to \"Flipkart\"$")
	public void navigateToTheHerokuApp() {
		driverFactory.getDriver().navigate().to("https://www.flipkart.com/");
	}
}
