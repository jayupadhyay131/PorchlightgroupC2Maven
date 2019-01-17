package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.OpenHouses_ListingsPage;
import com.qa.util.ExcelFileImporter;

public class SanityBrokerTest  extends TestBase{
	// Initialize all the property file data by calling TestBase class constructor
		public SanityBrokerTest() {
			super();
		}
			
		@BeforeMethod
		public void setUp() {
			startBrowser();
//			loginPage = new LoginPage();
//			homePage = new HomePage();
//			openHouses_ListingsPage = new OpenHouses_ListingsPage();
		}
		
		// Get data from Excel file and store data into 2D array
		@DataProvider
		public Object[][] getACListingData() {
			Object data[][] = ExcelFileImporter.getTestData("aclistingdata");
			return data;
		}
			
//		@Test(dataProvider = "getACListingData")
//		public void acSubmitListing(String recoloradomls,
//				 			  		String iresmls,
//				 			  		String streetaddress,
//				 			  		String city,
//				 			  		String zipcode,
//				 			  		String subarea,
//				 			  		String date,
//				 			  		String price,
//				 			  		String clientEmail) throws InterruptedException {
//			loginPage.login();
//			homePage.goToOpenHousesSchedulePage();
//			openHouses_ListingsPage.AC_Submit_Listing(recoloradomls,
//													  iresmls,
//													  streetaddress,
//													  city,
//													  zipcode,
//													  subarea, 
//													  date, 
//													  price, 
//													  clientEmail);
//		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
}
