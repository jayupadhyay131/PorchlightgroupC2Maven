package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
		
	@BeforeMethod
	public void setUp() {
		startBrowser();
		loginPage = new LoginPage();
		homePage = new HomePage();
		listings_DealsPage = new Listings_DealsPage();
	}
	
//	// Get data from Excel file and store data into 2D array
//	@DataProvider
//	public Object[][] getBrokerLS1Data() {
//		Object data[][] = ExcelFileImporter.getTestData("brokerls1data");
//		return data;
//	}
	
	//@Test(dataProvider = "getBrokerLS1Data")
	@Test
	public void brokerSubmitLS1( 
			
								) throws InterruptedException {
		loginPage.login();
		homePage.loginAsBroker1();		
		homePage.goToNewListingSubmission1Page();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
