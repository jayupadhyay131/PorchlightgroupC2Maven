package com.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.OpenHouses_ListingsPage;
import com.qa.util.ExcelFileImporter;

public class OpenHouses_ListingsPageTest extends TestBase{

	HomePage homePage;
	LoginPage loginPage;
	OpenHouses_ListingsPage openHouses_ListingsPage;
	
	// Initialize all the property file data by calling TestBase class constructor
	public OpenHouses_ListingsPageTest() {
		super();
	}
		
	@BeforeClass
	public void setUp() {
		startBrowser();
		loginPage = new LoginPage();
		homePage = new HomePage();
		openHouses_ListingsPage = new OpenHouses_ListingsPage();
	}
	
	// Get data from Excel file and store data into 2D array
	@DataProvider
	public Object[][] getACListingData() {
		Object data[][] = ExcelFileImporter.getTestData("aclistingdata");
		return data;
	}
	
	@Test(priority=1)
	public void verifyLogin() throws InterruptedException {
		loginPage.login();
	}
	
	@Test(priority=2)
	public void verifyGoToOpenHousesSchedulePage() throws InterruptedException {
		homePage.goToOpenHousesSchedulePage();
	}
		
	@Test(priority=3, dataProvider = "getACListingData")
	public void verifyACSubmitListing(String recoloradomls,
			 			  		String iresmls,
			 			  		String streetaddress,
			 			  		String city,
			 			  		String zipcode,
			 			  		String subarea,
			 			  		String date,
			 			  		String price,
			 			  		String clientEmail) throws InterruptedException {
		openHouses_ListingsPage.AC_Submit_Listing(recoloradomls,
												  iresmls,
												  streetaddress,
												  city,
												  zipcode,
												  subarea, 
												  date, 
												  price, 
												  clientEmail);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
