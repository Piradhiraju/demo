package com.pie.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pie.flipkartDemo.core.WebPage;

public class FlipkartProductCartPage extends WebPage {

	public FlipkartProductCartPage(WebDriver driver) {
		super(driver);
	}
	
	private By prepareLocatorWithAttributeDiv(String text) {
		return By.xpath("//div[text()='" + text + "']");
	}
	
	private By prepareLocatorWithAttributeSpan(String text) {
		return By.xpath("//span[text()='" + text + "']");
	}
	
	public Boolean isProductCartPageDisplayed(String text) {
		super.waitForVisibility(prepareLocatorWithAttributeDiv(text));
		return super.isDisplayed(prepareLocatorWithAttributeDiv(text));
	}
	
	public void clickOnThePlaceOrder(String text) {
		super.waitForVisibility(prepareLocatorWithAttributeSpan(text));
		super.click(prepareLocatorWithAttributeSpan(text));
	}
	
	
}
