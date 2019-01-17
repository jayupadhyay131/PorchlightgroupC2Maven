package com.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import com.qa.base.TestBase;

/**
 * Need to define all the functions/methods related to login page actions in this class
 */

public class LoginPage extends TestBase{
	
	Logger log = Logger.getLogger(LoginPage.class);
	
	/**
	 * METHOD 1: Verify webpage title 
	 **/
	public String validateLoginPageTitle() {
		log.info("GOT PAGE TITLE");
		return driver.getTitle();
	}
	
	/**
	 * METHOD 2: Login application 
	 **/
	public void login() throws InterruptedException {
		
		//String username = property.getProperty("username");
		//String password = property.getProperty("password");
		
		log.info("***** START TC: LOGIN INTO APPLIATION *****");
		
		WebElement googleLoginButton = driver.findElement(parser.getObjectLocator("googleLoginButton"));
		googleLoginButton.click();
		log.info("CLICKED ON GOOGLE BUTTON");
		
		WebElement username = driver.findElement(parser.getObjectLocator("username"));
		username.sendKeys(property.getProperty("username"));
		log.info("ENTERED USERNAME");
		
		WebElement nextButton1 = driver.findElement(parser.getObjectLocator("nextButton1"));
		nextButton1.click();
		log.info("CLICKED ON NEXT BUTTON");
		
		WebElement password = driver.findElement(parser.getObjectLocator("password"));
		password.sendKeys(property.getProperty("password"));
		log.info("ENTERED ON PASSWORD");
		
		WebElement nextButton2 = driver.findElement(parser.getObjectLocator("nextButton2"));
		nextButton2.click();
		log.info("CLICKED ON NEXT BUTTON");
		Thread.sleep(5000);
		
		WebElement allowButton = driver.findElement(parser.getObjectLocator("allowButton"));
		allowButton.click();
		log.info("CLICKED ON ALLOW BUTTON");
		Thread.sleep(5000);
		
		log.info("***** END TC: LOGIN INTO APPLIATION *****");
	}
	
	/**
	 * METHOD 3: Logout application 
	 **/
	public void logout() throws InterruptedException {
		
		log.info("***** START TC: LOGOUT FROM APPLIATION *****");
		
		WebElement logoutButton = driver.findElement(parser.getObjectLocator("logoutButton"));
		logoutButton.click();
		log.info("CLICKED ON LOGOUT BUTTON");
		Thread.sleep(20000);
		
		log.info("***** END TC: LOGOUT FROM APPLIATION *****");		
	}

}