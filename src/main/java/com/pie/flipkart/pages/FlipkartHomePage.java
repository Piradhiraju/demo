package com.pie.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pie.flipkartDemo.core.WebPage;

public class FlipkartHomePage extends WebPage{

	public FlipkartHomePage(WebDriver driver) {
		super(driver);
	}
	
	private By prepareHeaderLocatorWithFlipkart(String text) {
		return By.xpath("//h1[text()='" + text + "']");
	}
	
}
