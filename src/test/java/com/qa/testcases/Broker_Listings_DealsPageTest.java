package com.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Broker_Listings_DealsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.ExcelFileImporter;

public class Broker_Listings_DealsPageTest extends TestBase{
	
	HomePage homePage;
	LoginPage loginPage;
	Broker_Listings_DealsPage listings_DealsPage;
	
	public Broker_Listings_DealsPageTest() {
		super();
	}
		
	@BeforeClass
	public void setUp() {
		startBrowser();
		loginPage = new LoginPage();
		homePage = new HomePage();
		listings_DealsPage = new Broker_Listings_DealsPage();
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
	public void verifyGoToNewListingSubmission1Page() throws InterruptedException {
		homePage.goToNewListingSubmission1Page();
	}

	// Get data from Excel file and store data into 2D array
//	@DataProvider
//	public Object[][] getBrokerLS1Data() {
//		Object data[][] = ExcelFileImporter.getTestData("brokerls1data");
//		return data;
//	}

	//@Test(priority=4, dataProvider = "getBrokerLS1Data")
	@Test(priority=4)
	public void verifyBroker_Fill_LS1_1AgreementTab(
			) throws InterruptedException {	
		listings_DealsPage.Broker_Fill_LS1_1AgreementTab();
	}
	
	@Test(priority=5)
	public void verifyBroker_Fill_LS1_2PropertyOverview() throws InterruptedException {	
		listings_DealsPage.Broker_Fill_LS1_2PropertyOverview();
	}
	
	@Test(priority=6)
	public void verifyBroker_Fill_LS1_3FieldServices() throws InterruptedException {	
		listings_DealsPage.Broker_Fill_LS1_3FieldServices();
	}
	
	@Test(priority=7)
	public void verifyBroker_Fill_LS1_4Photography() throws InterruptedException {	
		listings_DealsPage.Broker_Fill_LS1_4Photography();
	}
	
	@Test(priority=8)
	public void verifyBroker_Fill_LS1_5Access() throws InterruptedException {	
		listings_DealsPage.Broker_Fill_LS1_5Access();
	}
	
	@Test(priority=9)
	public void verifyBroker_Fill_LS1_6OpenHouses() throws InterruptedException {	
		listings_DealsPage.Broker_Fill_LS1_6OpenHouses();
	}

	@Test(priority=10)
	public void verifyBroker_Fill_LS1_7SummaryTab() throws InterruptedException {	
		listings_DealsPage.Broker_Fill_LS1_7SummaryTab();
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
}
