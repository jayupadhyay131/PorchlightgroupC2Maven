package com.qa.users;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;

public class SanityBroker extends TestBase{
	
	Logger log = Logger.getLogger(HomePage.class);
	
	/**
	 * METHOD 1: From home page, navigate to OpenHouses > Schedule page 
	 **/
	public void verifyBrokerDashboard() throws InterruptedException {
		
		log.info("***** START TC: VERIFY BROKER DASHBOARD WIDGETS *****");
		
		WebElement notification = driver.findElement(parser.getObjectLocator("notification"));
		notification.isDisplayed();
		log.info("BROKER DASHBOARD: NOTIFICATION WIDGET IS PRESENT");
		
		WebElement mycalendar = driver.findElement(parser.getObjectLocator("mycalendar"));
		mycalendar.isDisplayed();
		log.info("BROKER DASHBOARD: MY CALENDER WIDGET IS PRESENT");
		
		WebElement productionytd = driver.findElement(parser.getObjectLocator("productionytd"));
		productionytd.isDisplayed();
		log.info("BROKER DASHBOARD: PRODUCITION YTD WIDGET IS PRESENT");
		
		WebElement commingsoon = driver.findElement(parser.getObjectLocator("commingsoon"));
		commingsoon.isDisplayed();
		WebElement csaddress = driver.findElement(parser.getObjectLocator("csaddress"));
		csaddress.isDisplayed();
		WebElement csdigest = driver.findElement(parser.getObjectLocator("csdigest"));
		csdigest.isDisplayed();
		WebElement csprice = driver.findElement(parser.getObjectLocator("csprice"));
		csprice.isDisplayed();
		log.info("BROKER DASHBOARD: COMMING SOOM WIDGET IS PRESENT WITH COLLUMNS ADDRESS, DIGEST, PRICE IS PRESENT");
		
		WebElement mylistings = driver.findElement(parser.getObjectLocator("mylistings"));
		mylistings.isDisplayed();
		log.info("BROKER DASHBOARD: MY LISTINGS WIDGET IS PRESENT");
		
		WebElement preistingservices = driver.findElement(parser.getObjectLocator("preistingservices"));
		preistingservices.isDisplayed();
		log.info("BROKER DASHBOARD: PRE-LISTING SERVICES WIDGET IS PRESENT");
		
		WebElement plsandmoveouttoggle = driver.findElement(parser.getObjectLocator("plsandmoveouttoggle"));
		plsandmoveouttoggle.click();
		log.info("BROKER DASHBOARD: PRE-LISTING SERVICES WIDGET > CLICKED ON PLS - MOVE OUT TOGGLE");
		
		log.info("***** END TC: VERIFY BROKER DASHBOARD WIDGETS *****");
	}
	
	public void verifyBrokerListings_SubmitLS1() throws InterruptedException {
		
		log.info("***** START TC: VERIFY BROKER LS1 SUBMISSION PAGE *****");
		
		WebElement listigs = driver.findElement(parser.getObjectLocator("listigs"));
		listigs.click();
		log.info("LEFT NAVBAR: CLICKED ON SCHEDULE");
		
		WebElement submitalisting = driver.findElement(parser.getObjectLocator("submitalisting"));
		submitalisting.click();
		log.info("LEFT NAVBAR: CLICKED ON SUBMIT A LISTING");
		Thread.sleep(3000);
		
		WebElement closels1formbutton = driver.findElement(parser.getObjectLocator("closels1formbutton"));
		closels1formbutton.click();
		log.info("LS1 FORM: CLICKED ON CLOSE FORM BUTTON");
		Thread.sleep(3000);

		log.info("***** END TC: VERIFY BROKER LS1 SUBMISSION PAGE *****");
	}
	
	public void verifyBrokerListings_SubmitBuyerUC() throws InterruptedException {
		
		log.info("***** START TC: VERIFY BROKER > LISTINGS > BUYER UC SUBMISSION PAGE *****");
		
		WebElement buyerundercontract = driver.findElement(parser.getObjectLocator("buyerundercontract"));
		buyerundercontract.click();
		log.info("LEFT NAVBAR: CLICKED ON BUYER UNDER CONTRACT");
		Thread.sleep(3000);
		
		WebElement closebucformbutton = driver.findElement(parser.getObjectLocator("closebucformbutton"));
		closebucformbutton.click();
		log.info("LS1 FORM: CLICKED ON CLOSE FORM BUTTON");
		Thread.sleep(3000);

		log.info("***** END TC: VERIFY BROKER > LISTINGS > BUYER UC SUBMISSION PAGE *****");
	}
	
	public void verifyBrokerListings_CommingSoonPage() throws InterruptedException {
		
		log.info("***** START TC: VERIFY BROKER > LISTINGS > COMMING SOON PAGE *****");
		
		WebElement comingsoon = driver.findElement(parser.getObjectLocator("comingsoon"));
		comingsoon.click();
		log.info("LEFT NAVBAR: CLICKED ON COMMING SOON");
		Thread.sleep(3000);
		
		WebElement commingsoonsearchbar = driver.findElement(parser.getObjectLocator("commingsoonsearchbar"));
		commingsoonsearchbar.isDisplayed();
		log.info("COMMING SOON PAGE: SEARCHBAR IS PRESENT");		
		
		WebElement commingsooncitycolumn = driver.findElement(parser.getObjectLocator("commingsooncitycolumn"));
		commingsooncitycolumn.isDisplayed();
		log.info("COMMING SOON PAGE: CITY COLLUMN IS PRESENT");	
		
		WebElement commingsoonaddresscolumn = driver.findElement(parser.getObjectLocator("commingsoonaddresscolumn"));
		commingsoonaddresscolumn.isDisplayed();
		log.info("COMMING SOON PAGE: ADDRESS COLLUMN IS PRESENT");
		
		WebElement commingsoonneighborhoodwithsort = driver.findElement(parser.getObjectLocator("commingsoonneighborhoodwithsort"));
		commingsoonneighborhoodwithsort.isDisplayed();
		log.info("COMMING SOON PAGE: NEIGHBORHOOD COLLUMN WITH SORT IS PRESENT");
		
		WebElement commingsoondigestcolumn = driver.findElement(parser.getObjectLocator("commingsoondigestcolumn"));
		commingsoondigestcolumn.isDisplayed();
		log.info("COMMING SOON PAGE: DIGEST COLLUMN IS PRESENT");
		
		WebElement commingsoonlistingagentwithsort = driver.findElement(parser.getObjectLocator("commingsoonlistingagentwithsort"));
		commingsoonlistingagentwithsort.isDisplayed();
		log.info("COMMING SOON PAGE: LISTING AGENT COLLUMN WITH SORT IS PRESENT");
		
		WebElement commingsoonpricewithsort = driver.findElement(parser.getObjectLocator("commingsoonpricewithsort"));
		commingsoonpricewithsort.isDisplayed();
		log.info("COMMING SOON PAGE: PRICE COLLUMN WITH SORT IS PRESENT");
		
		WebElement commingsoonmarketdatewithsort = driver.findElement(parser.getObjectLocator("commingsoonmarketdatewithsort"));
		commingsoonmarketdatewithsort.isDisplayed();
		log.info("COMMING SOON PAGE: MARKET DATE COLLUMN WITH SORT IS PRESENT");
		
		log.info("***** END TC: VERIFY BROKER > LISTINGS > COMMING SOON PAGE *****");
	}
	
}
