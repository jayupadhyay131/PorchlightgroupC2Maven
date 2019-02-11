package com.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.Listings_DealsPage;
import com.qa.pages.LoginPage;
import com.qa.util.ExcelFileImporter;

public class Listings_DealsPageTest extends TestBase{
	
	HomePage homePage;
	LoginPage loginPage;
	Listings_DealsPage listings_DealsPage;
	
	public Listings_DealsPageTest() {
		super();
	}
		
	@BeforeClass
	public void setUp() {
		startBrowser();
		loginPage = new LoginPage();
		homePage = new HomePage();
		listings_DealsPage = new Listings_DealsPage();
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
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
