package com.qa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.users.SanityTC;

public class SanityTCTest extends TestBase{
	
	HomePage homePage;
	LoginPage loginPage;
	SanityTC sanityTC;

	// Initialize all the property file data by calling TestBase class constructor
	public SanityTCTest() {
		super();
	}
		
	@BeforeClass
	public void setUp() {
		startBrowser();
		loginPage = new LoginPage();
		homePage = new HomePage();
		sanityTC = new SanityTC();
	}
	
	@Test(priority=1)
	public void verifyLogin() throws InterruptedException {
		loginPage.login();
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void verifyLoginAsTC1() throws InterruptedException {
		homePage.loginAsTC1();
		Thread.sleep(5000);
	}
	
//	@Test(priority=3)
//	public void verifyTCDashboard() throws InterruptedException {
//		sanityTC.verifyTCDashboard();
//		Thread.sleep(5000);
//	}
//	
//	@Test(priority=4)
//	public void verifyCRMBetaLink() throws InterruptedException {
//		homePage.verifyCRMBetaLink();
//		Thread.sleep(5000);
//	}
	
	@Test(priority=5)
	public void verifyGotoListingsDealsPage() throws InterruptedException {
		homePage.verifyGotoListingsDealsPage();
		Thread.sleep(5000);
	}
	
	@Test(priority=6)
	public void verifyTCListingsDealsPage() throws InterruptedException {
		sanityTC.verifyTCListingsDealsPage();
		Thread.sleep(5000);
	}
	
	
}
