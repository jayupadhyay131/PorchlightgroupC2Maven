package com.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.users.SanityBroker;

public class SanityBrokerTest extends TestBase{
	
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
		public void verifyCRMBetaLink() throws InterruptedException {
			homePage.verifyCRMBetaLink();
			Thread.sleep(5000);
		}
		
		@Test(priority=5)
		public void verifyBrokerListings_SubmitLS1() throws InterruptedException {
			sanityBroker.verifyBrokerListings_SubmitLS1();
		}
		
		@Test(priority=6)
		public void verifyBrokerListings_SubmitBuyerUC() throws InterruptedException {
			sanityBroker.verifyBrokerListings_SubmitBuyerUC();
		}
		
		@Test(priority=7)
		public void verifyBrokerListings_CommingSoonPage() throws InterruptedException {
			sanityBroker.verifyBrokerListings_CommingSoonPage();
		}
		
		@Test(priority=8)
		public void verifyBrokerListings_AllListingsPage() throws InterruptedException {
			sanityBroker.verifyBrokerListings_AllListingsPage();
		}
		
		@Test(priority=9)
		public void verifyBrokerListings_MyDealsPage() throws InterruptedException {
			sanityBroker.verifyBrokerListings_MyDealsPage();
		}
		
		@Test(priority=10)
		public void verifyBrokerListings_ArchivedListingsPage() throws InterruptedException {
			sanityBroker.verifyBrokerListings_ArchivedListingsPage();
		}
				
		@Test(priority=11)
		public void verifyGoToOpenHousesSchedulePage() throws InterruptedException {
			homePage.goToOpenHousesSchedulePage();
		}		
		
		@Test(priority=12)
		public void verifyPendingFeedbackPage() throws InterruptedException {
			sanityBroker.verifyPendingFeedbackPage();
		}
		
		@Test(priority=13)
		public void verifyMyFeedbackPage() throws InterruptedException {
			sanityBroker.verifyMyFeedbackPage();
		}
		
		@Test(priority=14)
		public void verifyGoToMyADRPage() throws InterruptedException {
			homePage.goToMyADRPage();
		}
		
		@Test(priority=15)
		public void verifyMyReportADRPage() throws InterruptedException {
			sanityBroker.verifyMyReportADRPage();
		}
		
		@Test(priority=16)
		public void verifyLinks() throws InterruptedException {
			homePage.verifyLinks();
		}
		
		@AfterClass
		public void tearDown() {
			driver.quit();
		}
}
