package com.pie.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pie.flipkartDemo.core.WebPage;

public class FlipkartProductItemPage extends WebPage {

	public FlipkartProductItemPage(WebDriver driver) {
		super(driver);
	}
	
	private By prepareLocatorWithAttributeDiv(String text) {
		return By.xpath("//div[text()='" + text + "']");
	}
	
	private By prepareLocatorWithAttributeButton(String text) {
		return By.xpath("//button[text()='" + text + "']");	
	}
	
	public Boolean isItemPageDisplayed(String text) {
		super.waitForVisibility(prepareLocatorWithAttributeDiv(text));
		return super.isDisplayed(prepareLocatorWithAttributeDiv(text));
	}
	
	public void clickOnAddToCart(String text) {
		super.waitForClickability(prepareLocatorWithAttributeButton(text));
		super.click(prepareLocatorWithAttributeButton(text));
	}
	
}
