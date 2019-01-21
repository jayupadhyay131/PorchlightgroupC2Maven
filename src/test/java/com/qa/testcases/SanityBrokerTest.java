package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
			
		@BeforeMethod
		public void setUp() {
			startBrowser();
			loginPage = new LoginPage();
			homePage = new HomePage();
			sanityBroker = new SanityBroker();
		}
		
		@Test
		public void sanityTestBrokerAllPages() throws InterruptedException {
			
			loginPage.login();
			Thread.sleep(5000);
			homePage.loginAsBroker1();
			Thread.sleep(5000);
			sanityBroker.varifyBrokerDashboard();
			Thread.sleep(5000);
			sanityBroker.varifyBrokerListings_SubmitLS1();	
			sanityBroker.varifyBrokerListings_SubmitBuyerUC();
			sanityBroker.varifyBrokerListings_CommingSoonPage();
	//		loginPage.logout();
		}
		
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
}
