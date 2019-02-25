package com.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.TC_Listings_DealsPage;

public class TC_Listings_DealsPageTest extends TestBase{
	
	HomePage homePage;
	LoginPage loginPage;
	TC_Listings_DealsPage tc_Listings_DealsPage;
	
	public TC_Listings_DealsPageTest() {
		super();
	}
		
	@BeforeClass
	public void setUp() {
		startBrowser();
		loginPage = new LoginPage();
		homePage = new HomePage();
		tc_Listings_DealsPage = new TC_Listings_DealsPage();
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
	
	@Test(priority=3)
	public void verifyTC_TakeLs1Task_From_Dashboard() throws InterruptedException {
		tc_Listings_DealsPage.TC_TakeLs1Task_From_Dashboard();
		Thread.sleep(5000);
	}

	@Test(priority=4)
	public void verifyTC_Approve_LS1_1AgreementTab() throws InterruptedException {
		tc_Listings_DealsPage.TC_Approve_LS1_1AgreementTab();
		Thread.sleep(5000);
	}

	@Test(priority=4)
	public void verifyTC_Approve_LS1_2PropertyOverviewTab() throws InterruptedException {
		tc_Listings_DealsPage.TC_Approve_LS1_2PropertyOverviewTab();
		Thread.sleep(5000);
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
	
}
