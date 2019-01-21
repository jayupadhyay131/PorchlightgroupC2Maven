package com.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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
	
	@BeforeClass
	public void setUp() {
		startBrowser();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void verifyLoginPageTitle() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Connect 2 | PorchLight Real Estate Group");
	}
	
	@Test(priority=2)
	public void verifyLogin() throws InterruptedException {
		loginPage.login();
	}
	
	@Test(priority=3)
	public void verifyLogout() throws InterruptedException {
		loginPage.logout();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}	
}
