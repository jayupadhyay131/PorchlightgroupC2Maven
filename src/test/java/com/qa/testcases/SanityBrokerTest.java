package com.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.users.SanityBroker;

public class SanityBrokerTest  extends TestBase{
	
		HomePage homePage;
		LoginPage loginPage;
		SanityBroker sanityBroker;
	
		// Initialize all the property file data by calling TestBase class constructor
		public SanityBrokerTest() {
			super();
		}
			
		@BeforeClass
		public void setUp() {
			startBrowser();
			loginPage = new LoginPage();
			homePage = new HomePage();
			sanityBroker = new SanityBroker();
		}
		
		@Test(priority=1)
		public void verifyLogin() throws InterruptedException {
			loginPage.login();
			Thread.sleep(5000);
		}
		
		@Test(priority=2)
		public void verifyLoginAsBroker1() throws InterruptedException {
			homePage.loginAsBroker1();
			Thread.sleep(5000);
		}
		
		@Test(priority=3)
		public void verifyBrokerDashboard() throws InterruptedException {
			sanityBroker.verifyBrokerDashboard();
			Thread.sleep(5000);
		}
		
		@Test(priority=4)
		public void verifyBrokerListings_SubmitLS1() throws InterruptedException {
			sanityBroker.verifyBrokerListings_SubmitLS1();
		}
		
		@Test(priority=5)
		public void verifyBrokerListings_SubmitBuyerUC() throws InterruptedException {
			sanityBroker.verifyBrokerListings_SubmitBuyerUC();
		}
		
		@Test(priority=6)
		public void verifyBrokerListings_CommingSoonPage() throws InterruptedException {
			sanityBroker.verifyBrokerListings_CommingSoonPage();
		}
		
		@AfterClass
		public void tearDown() {
			driver.quit();
		}
}
