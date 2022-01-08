package com.pie.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pie.flipkartDemo.core.WebPage;

public class FlipkartProductPage extends WebPage {
	
	public FlipkartProductPage(WebDriver driver) {
		super(driver);
	}
	
	private By prepareLocatorWithAttributeH1(String text) {
		return By.xpath("//h1[text()='" + text + "']");
	}
	
	private By prepareLocatorWithAttributeDiv(String text) {
		return By.xpath("//div[text()='" + text + "']");
	} 

	private By prepareLocatorWithAttributeA(String text) {
		return By.xpath("//a[text()='" + text + "']");
	}
	
	public Boolean isProductPageDisplayed(String text) {
		super.waitForVisibility(prepareLocatorWithAttributeH1(text));
		return super.isDisplayed(prepareLocatorWithAttributeH1(text));
	}
	
	public void clickOnTheElement(String text) {
		super.waitForVisibility(prepareLocatorWithAttributeDiv(text));
		super.click(prepareLocatorWithAttributeDiv(text));
	}
	
	public void clickOnTheProduct(String text) {
		super.waitForVisibility(prepareLocatorWithAttributeA(text));
		super.click(prepareLocatorWithAttributeA(text));
	}
	
}
