package com.pie.flipkart.stepDefs;

import org.testng.Assert;

import com.pie.flipkart.pages.FlipkartHomePage;
import com.pie.flipkart.pages.FlipkartProductCartPage;
import com.pie.flipkart.pages.FlipkartProductItemPage;
import com.pie.flipkart.pages.FlipkartProductPage;
import com.pie.flipkartDemo.core.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FlipkartHomeStepDefs {
	
private DriverFactory driverFactory;
	
	public FlipkartHomeStepDefs() {
		driverFactory = DriverFactory.getInstance();
	}
	
	@Given ("^I have to navigate to \"(.*)\"$")
	public void navigateToTheHerokuApp(String web) {
		driverFactory.getDriver().navigate().to("https://www.flipkart.com/");
	}
	
	@Then ("^I have to see the \"(.*)\" heading on the page$")
	public void isFlipkartHeaderDisplayed(String text) {
		FlipkartHomePage fHP = new FlipkartHomePage(driverFactory.getDriver());
		Assert.assertTrue(fHP.isHeaderDisplayed(text));
	} 
	
	@Then ("^I have to click on the \"(.*)\" link$")
	public void clickOnTheLink(String text) {
		FlipkartHomePage fHP = new FlipkartHomePage(driverFactory.getDriver());
		fHP.clickOnTheLink(text);
	}
	
	@Then ("^I have to see the \"(.*)\" heading on the page$")
	public void isProductPageDisplayed(String text) {
		FlipkartProductPage fPP = new FlipkartProductPage(driverFactory.getDriver());
		Assert.assertTrue(fPP.isProductPageDisplayed(text));
	}
	
	@Then ("^I have to click on the \"(.*)\" link$")
	public void clickOnPriceLowToHigh(String text) {
		FlipkartProductPage fPP = new FlipkartProductPage(driverFactory.getDriver());
		fPP.clickOnTheElement(text);
	}
	
	@Then ("^I have to click on the \"(.*)\" product link$")
	public void clickOnProduct(String text) {
		FlipkartProductPage fPP = new FlipkartProductPage(driverFactory.getDriver());
		fPP.clickOnTheProduct(text);
	}
	
	@Then ("^I have to see the \"(.*)\" heading on the page$")
	public void isProductItemPageDisplayed(String text) {
		FlipkartProductItemPage fPIP = new FlipkartProductItemPage(driverFactory.getDriver());
		Assert.assertTrue(fPIP.isItemPageDisplayed(text));
	}
	
	@Then ("^I have to click on the \"(.*)\" link$")
	public void clickOnTheAddToCart(String text) {
		FlipkartProductItemPage fPIP = new FlipkartProductItemPage(driverFactory.getDriver());
		fPIP.clickOnAddToCart(text);
	}
	
	@Then ("^I have to see the \"(.*)\" product cart page$")
	public void isProductCartPageDisplayed(String text) {
		FlipkartProductCartPage fPCP = new FlipkartProductCartPage(driverFactory.getDriver());
		Assert.assertTrue(fPCP.isProductCartPageDisplayed(text));
	}
	
	@Then ("^I have to click on the \"(.*)\" link$")
	public void clickOnThePlaceOrderButton(String text) {
		FlipkartProductCartPage fPCP = new FlipkartProductCartPage(driverFactory.getDriver());
		fPCP.clickOnThePlaceOrder(text);
	}
	
	@Then ("^I have to \"(.*)\" the browsers$")
	public void quitAllBrowsersOpened(String web) {
		driverFactory.getDriver().quit();
	}

}
