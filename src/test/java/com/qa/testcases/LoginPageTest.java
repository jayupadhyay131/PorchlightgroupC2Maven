package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	
	// Initialize all the property file data by calling TestBase class constructor
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		startBrowser();
		loginPage = new LoginPage();
	}
	
	@Test()
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Connect 2 | PorchLight Real Estate Group");
	}
	
	@Test()
	public void loginTest() throws InterruptedException {
		loginPage.login();
		loginPage.logout();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}	
}
