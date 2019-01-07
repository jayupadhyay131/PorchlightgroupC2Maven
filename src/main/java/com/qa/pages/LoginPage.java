package com.qa.pages;

import org.openqa.selenium.WebElement;
import com.qa.base.TestBase;

/**
 * Need to define all the functions/methods related to login page actions in this class
 */

public class LoginPage extends TestBase{
	
	/**
	 * METHOD 1: Verify webpage title 
	 **/
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	/**
	 * METHOD 2: Login application 
	 **/
	public void login() throws InterruptedException {
		
		//String username = property.getProperty("username");
		//String password = property.getProperty("password");
		
		WebElement googleLoginButton = driver.findElement(parser.getObjectLocator("googleLoginButton"));
		googleLoginButton.click();
		
		WebElement username = driver.findElement(parser.getObjectLocator("username"));
		username.sendKeys(property.getProperty("username"));
	
		WebElement nextButton1 = driver.findElement(parser.getObjectLocator("nextButton1"));
		nextButton1.click();
		
		WebElement password = driver.findElement(parser.getObjectLocator("password"));
		password.sendKeys(property.getProperty("password"));
		
		WebElement nextButton2 = driver.findElement(parser.getObjectLocator("nextButton2"));
		nextButton2.click();
		Thread.sleep(5000);
		
		WebElement allowButton = driver.findElement(parser.getObjectLocator("allowButton"));
		allowButton.click();
		Thread.sleep(5000);
		
		//System.out.println("---Successfully Logged in---");
	}
	
	/**
	 * METHOD 3: Logout application 
	 **/
	public void logout() throws InterruptedException {
		
		WebElement logoutButton = driver.findElement(parser.getObjectLocator("logoutButton"));
		logoutButton.click();
		Thread.sleep(20000);
		
		//System.out.println("---Successfully Logged out---");
		
	}

}