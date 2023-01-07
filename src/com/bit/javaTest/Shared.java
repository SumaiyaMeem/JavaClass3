package com.bit.javaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shared {
	
	//the purpose of this lesson is we want to make each task reusable.
	//to  that purpose we need to create a method for each action we do.
	
	ChromeDriver dr;
	
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mdalam/Downloads/chromedriver");
		dr=new ChromeDriver();
	}
	public void quitBrowser() throws InterruptedException {
		
		myWait(5000);
		dr.quit();
	}
	public void navigateToWebsite(String url) {
		
		dr.get(url);
	}
	public void getPageTitle(String expectedPageTitle) {
		//anytime selenium wants to grab any data, it will by default always give you in string format.
		//In java if you want to compare in between 2 different string, there are some built in methods we can use.
		String actualTitle = dr.getTitle();
		boolean result = actualTitle.equals(expectedPageTitle);
		System.out.println("Page title result: " + result);//when we add 2 string its called concatenation.
	}
	public void getPageUrl(String expectedPageUrl) {
		String actualUrl = dr.getCurrentUrl();
		boolean result = actualUrl.contains(expectedPageUrl);
		System.out.println("Page url verificationResult: " + result);
		
	}
	public void verifyElementDisplay(By locator) {
		
		boolean result = dr.findElement(locator).isDisplayed();
		System.out.println("Element display result: " + result);
		
	}
	public void verifyText(By locator) {
		String text = dr.findElement(locator).getText();
		System.out.println(text);
	}
	public void myWait(long millis) throws InterruptedException {
		
		Thread.sleep(millis);
	}
	public void clickOnElement(By locator) {
		
		dr.findElement(locator).click();
		
	}
	public void typeOnElement(WebElement element, String value) {
		
		element.sendKeys(value);
	}
	
	

}
