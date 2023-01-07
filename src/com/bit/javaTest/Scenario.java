package com.bit.javaTest;

import org.openqa.selenium.By;

public class Scenario {
	
	Shared s = new Shared();
	SharedData sd = new SharedData();
	
	/*Scenario 1 : Target Sign Up
	 * 1. Navigate to target.com
	 * 2.Print title
	 * 3.Print Url
	 * 4.Click on sign in link
	 * 5.Click on create account link
	 * 6.Verify target logo is displayed and print the result
	 * 7.Verify text and print the result.
	 * 8.Enter email
	 * 9.Enter First Name
	 * 10.Enter last name
	 * 11.Enter Password
	 * 12.Click on create account button.*/
	
	public void targetSignUp() throws InterruptedException {
		
		s.openBrowser();
		s.navigateToWebsite(sd.Url);
		s.getPageTitle(sd.homePageTitle);
		s.getPageUrl(sd.Url);
		s.clickOnElement(By.xpath("//span[text()='Sign in']"));
		s.clickOnElement(By.xpath("//span[text()='Create Account']"));
		s.myWait(5000);
		s.verifyElementDisplay(By.xpath("//div[@id='__next'] /div[2]/div/div/div/div[1]/span/div"));
		s.verifyText(By.xpath("//span[text()='Create your Target account']"));
		s.typeOnElement(s.dr.findElement(By.id("username")), "soirulkf@gmail.com");
		s.typeOnElement(s.dr.findElement(By.id("firstname")), "sdjds");
		s.typeOnElement(s.dr.findElement(By.id("lastname")), "kdjksj");
		s.clickOnElement(By.id("password"));
		s.clickOnElement(By.id("createAccount"));
		s.quitBrowser();
		}

}
