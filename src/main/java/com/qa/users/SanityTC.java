package com.qa.users;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;

public class SanityTC extends TestBase{
	
	Logger log = Logger.getLogger(HomePage.class);
	
	/**
	 * METHOD 1: From home page, navigate to OpenHouses > Schedule page 
	 **/
	public void verifyTCDashboard() throws InterruptedException {
		
		log.info("***** START TC: VERIFY TC DASHBOARD WIDGETS *****");
		
		WebElement notification = driver.findElement(parser.getObjectLocator("notification"));
		notification.isDisplayed();
		log.info("TC DASHBOARD: NOTIFICATION WIDGET IS PRESENT");
		
		WebElement mycalendar = driver.findElement(parser.getObjectLocator("mycalendar"));
		mycalendar.isDisplayed();
		log.info("TC DASHBOARD: MY CALENDER WIDGET IS PRESENT");
		
		WebElement uctrackertasks = driver.findElement(parser.getObjectLocator("uctrackertasks"));
		uctrackertasks.isDisplayed();
		log.info("TC DASHBOARD: U/C TRACKER TASKS WIDGET IS PRESENT");
		
		WebElement mytasks = driver.findElement(parser.getObjectLocator("mytasks"));
		mytasks.isDisplayed();
		log.info("TC DASHBOARD: MY TASKS WIDGET IS PRESENT");
		
		WebElement mytasksmyagentsvsotherstoggle = driver.findElement(parser.getObjectLocator("mytasksmyagentsvsotherstoggle"));
		mytasksmyagentsvsotherstoggle.click();
		log.info("TC DASHBOARD: CLICKED ON MY AGENTS VS OTHERS TOGGLE BUTTON");
		
		WebElement mytasksaddress = driver.findElement(parser.getObjectLocator("mytasksaddress"));
		mytasksaddress.isDisplayed();
		log.info("TC DASHBOARD: ADDRESS COLUMN IS PRESENT");
		
		WebElement mytaskslistingagent = driver.findElement(parser.getObjectLocator("mytaskslistingagent"));
		mytaskslistingagent.isDisplayed();
		log.info("TC DASHBOARD: LISTING AGENT COLUMN IS PRESENT");
		
		WebElement mytaskssubmitted = driver.findElement(parser.getObjectLocator("mytaskssubmitted"));
		mytaskssubmitted.isDisplayed();
		log.info("TC DASHBOARD: SUBMITTED COLUMN IS PRESENT");
		
		WebElement mytasksassingedtc = driver.findElement(parser.getObjectLocator("mytasksassingedtc"));
		mytasksassingedtc.isDisplayed();
		log.info("TC DASHBOARD: ASSIGNED TC COLUMN IS PRESENT");
		
		WebElement mytasksactionrequired = driver.findElement(parser.getObjectLocator("mytasksactionrequired"));
		mytasksactionrequired.isDisplayed();
		log.info("TC DASHBOARD: ACTION REQUIRED COLUMN IS PRESENT");
		
		WebElement prelistingservices = driver.findElement(parser.getObjectLocator("prelistingservices"));
		prelistingservices.isDisplayed();
		log.info("TC DASHBOARD: PRE-LISTING SERVICES WIDGET IS PRESENT");
		
		WebElement plsaddress = driver.findElement(parser.getObjectLocator("plsaddress"));
		plsaddress.isDisplayed();
		log.info("TC DASHBOARD: ADDRESS COLUMN IS PRESENT");
		
		WebElement plsmarketdate = driver.findElement(parser.getObjectLocator("plsmarketdate"));
		plsmarketdate.isDisplayed();
		log.info("TC DASHBOARD: MARKET DATE COLUMN IS PRESENT");
		
		WebElement plsreport = driver.findElement(parser.getObjectLocator("plsreport"));
		plsreport.isDisplayed();
		log.info("TC DASHBOARD: MARKET DATE COLUMN IS PRESENT");
		
		WebElement plsfloorplan = driver.findElement(parser.getObjectLocator("plsfloorplan"));
		plsfloorplan.isDisplayed();
		log.info("TC DASHBOARD: FLOORPLAN COLUMN IS PRESENT");
		
		WebElement plsstaging = driver.findElement(parser.getObjectLocator("plsstaging"));
		plsstaging.isDisplayed();
		log.info("TC DASHBOARD: STAGING COLUMN IS PRESENT");
		
		WebElement plscleaning = driver.findElement(parser.getObjectLocator("plscleaning"));
		plscleaning.isDisplayed();
		log.info("TC DASHBOARD: CLEANING COLUMN IS PRESENT");
		
		WebElement plsphotos = driver.findElement(parser.getObjectLocator("plsphotos"));
		plsphotos.isDisplayed();
		log.info("TC DASHBOARD: PHOTOS COLUMN IS PRESENT");
		
		WebElement plssignes = driver.findElement(parser.getObjectLocator("plssignes"));
		plssignes.isDisplayed();
		log.info("TC DASHBOARD: SIGNES COLUMN IS PRESENT");
		
		WebElement plsplsvsmoveouttoggle = driver.findElement(parser.getObjectLocator("plsplsvsmoveouttoggle"));
		plsplsvsmoveouttoggle.isDisplayed();
		log.info("TC DASHBOARD: CLICKED ON PLS VS MOVE-OUT TOGGLE BUTTON");
		
		WebElement myagents = driver.findElement(parser.getObjectLocator("myagents"));
		myagents.isDisplayed();
		log.info("TC DASHBOARD: MY AGENTS WIDGET IS PRESENT");
		
		WebElement myagenstspremarket = driver.findElement(parser.getObjectLocator("myagenstspremarket"));
		myagenstspremarket.isDisplayed();
		log.info("TC DASHBOARD: PRE-MARKET COLUMN IS PRESENT");
		
		WebElement myagenstsonmarket = driver.findElement(parser.getObjectLocator("myagenstsonmarket"));
		myagenstsonmarket.isDisplayed();
		log.info("TC DASHBOARD: ON-MARKET COLUMN IS PRESENT");
		
		WebElement myagenstscontract = driver.findElement(parser.getObjectLocator("myagenstscontract"));
		myagenstscontract.isDisplayed();
		log.info("TC DASHBOARD: CONTRACT COLUMN IS PRESENT");
		
		log.info("***** END TC: VERIFY TC DASHBOARD WIDGETS *****");
	}
	
	public void verifyTCListingsDealsPage() throws InterruptedException {
		
		log.info("***** START TC: VERIFY TC LISTINGS > DEALS PAGE *****");
		
		WebElement tcdealslistingssearchbar = driver.findElement(parser.getObjectLocator("tcdealslistingssearchbar"));
		tcdealslistingssearchbar.isDisplayed();
		log.info("TC LISTINGS > DEALS: LISTING SEARCHBAR IS PRESENT");
		
		WebElement tcdealslistingsstatusdropdownall = driver.findElement(parser.getObjectLocator("tcdealslistingsstatusdropdownall"));
		tcdealslistingsstatusdropdownall.isDisplayed();
		log.info("TC LISTINGS > DEALS: LISTING STATUS DROP-DOWN All IS PRESENT");
		tcdealslistingsstatusdropdownall.click();
		log.info("TC LISTINGS > DEALS: CLICKED ON LISTING STATUS DROP-DOWN");
		
		WebElement tcdealslistingsstatusdropdownsearchbar = driver.findElement(parser.getObjectLocator("tcdealslistingsstatusdropdownsearchbar"));
		tcdealslistingsstatusdropdownsearchbar.sendKeys("Listings");
		tcdealslistingsstatusdropdownsearchbar.sendKeys(Keys.ENTER);
		log.info("TC LISTINGS > DEALS: ENTERED Listings AS TEXT AND PRESSED ENTER");
		Thread.sleep(5000);
		
//		WebElement tcdealslistingsstatusdropdownlistings = driver.findElement(parser.getObjectLocator("tcdealslistingsstatusdropdownlistings"));
//		tcdealslistingsstatusdropdownlistings.click();
//		tcdealslistingsstatusdropdownsearchbar.sendKeys("Active");
//		tcdealslistingsstatusdropdownsearchbar.sendKeys(Keys.ENTER);
//		log.info("TC LISTINGS > DEALS: ENTERED Active AS TEXT AND PRESSED ENTER");
//		
//		WebElement tcdealslistingsstatusdropdownactive = driver.findElement(parser.getObjectLocator("tcdealslistingsstatusdropdownactive"));
//		tcdealslistingsstatusdropdownactive.click();
//		tcdealslistingsstatusdropdownsearchbar.sendKeys("Under Contract");
//		tcdealslistingsstatusdropdownsearchbar.sendKeys(Keys.ENTER);
//		log.info("TC LISTINGS > DEALS: ENTERED Under Contract AS TEXT AND PRESSED ENTER");

		WebElement tcdealscolumn = driver.findElement(parser.getObjectLocator("tcdealscolumn"));
		tcdealscolumn.isDisplayed();
		log.info("TC LISTINGS > DEALS: DEALS COLUMN IS PRESENT");
		
		WebElement tcaddresscolumn = driver.findElement(parser.getObjectLocator("tcaddresscolumn"));
		tcaddresscolumn.isDisplayed();
		log.info("TC LISTINGS > DEALS: ADDRESS COLUMN IS PRESENT");
		
		WebElement tclistingagentwithsortcolumn = driver.findElement(parser.getObjectLocator("tclistingagentwithsortcolumn"));
		tclistingagentwithsortcolumn.isDisplayed();
		log.info("TC LISTINGS > DEALS: AGENTS WITH SORT COLUMN IS PRESENT");
		
		WebElement tcpricewithsortcolumn = driver.findElement(parser.getObjectLocator("tcpricewithsortcolumn"));
		tcpricewithsortcolumn.isDisplayed();
		log.info("TC LISTINGS > DEALS: PRICE WITH SORT COLUMN IS PRESENT");
		
		WebElement tcdigestcolumn = driver.findElement(parser.getObjectLocator("tcdigestcolumn"));
		tcdigestcolumn.isDisplayed();
		log.info("TC LISTINGS > DEALS: DIGEST COLUMN IS PRESENT");
		
		WebElement tcmarketdatewithsortcolumn = driver.findElement(parser.getObjectLocator("tcmarketdatewithsortcolumn"));
		tcmarketdatewithsortcolumn.isDisplayed();
		log.info("TC LISTINGS > DEALS: MARKET DATE WITH SORT COLUMN IS PRESENT");
		
		WebElement tcstatuswithsortcolumn = driver.findElement(parser.getObjectLocator("tcstatuswithsortcolumn"));
		tcstatuswithsortcolumn.isDisplayed();
		log.info("TC LISTINGS > DEALS: STATUS WITH SORT COLUMN IS PRESENT");
		
		WebElement tcmydealsvsalldealstoggle = driver.findElement(parser.getObjectLocator("tcmydealsvsalldealstoggle"));
		tcmydealsvsalldealstoggle.click();
		log.info("TC LISTINGS > DEALS: CLICKED ON MY DEALS VS ALL DEALS TOGGLE BUTTON");
		Thread.sleep(5000);
		
		WebElement tctransactioncoordinatorcolumn = driver.findElement(parser.getObjectLocator("tctransactioncoordinatorcolumn"));
		tctransactioncoordinatorcolumn.isDisplayed();
		log.info("TC LISTINGS > DEALS: TC COLUMN IS PRESENT");
		
		
		log.info("***** END TC: VERIFY TC LISTINGS > DEALS PAGE *****");
	}
	
}
