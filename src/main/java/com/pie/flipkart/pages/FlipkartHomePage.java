package com.pie.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pie.flipkartDemo.core.WebPage;

public class FlipkartHomePage extends WebPage{

	public FlipkartHomePage(WebDriver driver) {
		super(driver);
	}
	
	private By prepareHeaderLocator(String text) {
		return By.xpath("//a[@href='" + text + "']");
	}
	
	private By prepareLocatorWithTextInAttributeA(String text) {
		return By.xpath("//a[text()='" + text + "']");
	}
	
	public Boolean isHeaderDisplayed(String text) {
		super.waitForVisibility(prepareHeaderLocator(text));
		return super.isDisplayed(prepareHeaderLocator(text));
	}	
	
	public void clickOnTheLink(String text) {
		super.waitForClickability(prepareLocatorWithTextInAttributeA(text));
		super.click(prepareLocatorWithTextInAttributeA(text));
	} 
	
}
