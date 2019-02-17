package com.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class HomePage extends TestBase{
	
	Logger log = Logger.getLogger(HomePage.class);
	
	/**
	 * METHOD 1: From home page, navigate to OpenHouses > Schedule page 
	 **/
	public void goToOpenHousesSchedulePage() throws InterruptedException {
		
		log.info("***** START TC: GO TO OPEN HOUSE > SCHEDULE PAGE *****");
		
		WebElement openHouses = driver.findElement(parser.getObjectLocator("openHouses"));
		openHouses.click();
		log.info("LEFT NAVBAR: CLICKED ON OPENHOUSES");
		Thread.sleep(1000);
		
		WebElement schedule = driver.findElement(parser.getObjectLocator("schedule"));
		schedule.click();
		log.info("LEFT NAVBAR: CLICKED ON SCHEDULE");
		Thread.sleep(1000);
		
		log.info("***** END TC: GO TO OPEN HOUSE > SCHEDULE PAGE *****");
	}

	public void goToNewListingSubmission1Page() throws InterruptedException {
		
		log.info("***** START TC: GO TO LISTINGS > SUBMIT LISTING *****");
		
		WebElement listings = driver.findElement(parser.getObjectLocator("listings"));
		listings.click();
		log.info("LEFT NAVBAR: CLICKED ON LISTINGS");
		Thread.sleep(1000);
		
		WebElement submitalisting = driver.findElement(parser.getObjectLocator("submitalisting"));
		submitalisting.click();
		log.info("LEFT NAVBAR: CLICKED ON LISTINGS > SUBMIT A LISTING");
		Thread.sleep(5000);

		log.info("***** END TC: GO TO LISTINGS > SUBMIT LISTING *****");	
	}
	
	public void verifyGotoListingsDealsPage() throws InterruptedException {
		
		log.info("***** START TC: GO TO LISTINGS > DEALS *****");
		
		WebElement tclistings = driver.findElement(parser.getObjectLocator("tclistings"));
		tclistings.click();
		log.info("LEFT NAVBAR: CLICKED ON LISTINGS");
		
		WebElement tcdeals = driver.findElement(parser.getObjectLocator("tcdeals"));
		tcdeals.click();
		log.info("LEFT NAVBAR: CLICKED LISTINGS > DEALS");
		Thread.sleep(5000);

		log.info("***** END TC: GO TO LISTINGS > DEALS *****");	
	}
	
	public void goToMyADRPage() throws InterruptedException {
		
		log.info("***** START TC: GO TO REPORTS > MY REPORT (ADR) *****");
		
		WebElement reports = driver.findElement(parser.getObjectLocator("reports"));
		reports.click();
		log.info("LEFT NAVBAR: CLICKED ON REPORTS");
		Thread.sleep(1000);
		
		WebElement myreports = driver.findElement(parser.getObjectLocator("myreports"));
		myreports.click();
		log.info("LEFT NAVBAR: CLICKED ON MY REPORTS (ADR)");
		Thread.sleep(5000);

		log.info("***** END TC: GO TO REPORTS > MY REPORT (ADR) *****");	
	}
	
	public void verifyLinks() throws InterruptedException {
		
		log.info("***** START TC: GO TO LINKS *****");
		
		WebElement links = driver.findElement(parser.getObjectLocator("links"));
		links.click();
		log.info("LEFT NAVBAR: CLICKED ON LINKS");
		
		WebElement connect = driver.findElement(parser.getObjectLocator("connect"));
		connect.isDisplayed();
		log.info("LINKS: CONNECT LINK IS PRESENT");
		
/*		WebElement workplace = driver.findElement(parser.getObjectLocator("workplace"));
		workplace.isDisplayed();
		log.info("LINKS: WORKPLACE LINK IS PRESENT");
*/			
		WebElement website = driver.findElement(parser.getObjectLocator("website"));
		website.isDisplayed();
		log.info("LINKS: PORCHLIGHT WEBSITE LINK IS PRESENT");
		
		WebElement porchlighthub = driver.findElement(parser.getObjectLocator("porchlighthub"));
		porchlighthub.isDisplayed();
		log.info("LINKS: PORCHLIGHT HUB LINK IS PRESENT");
		
		WebElement supportcontact = driver.findElement(parser.getObjectLocator("supportcontact"));
		supportcontact.isDisplayed();
		log.info("SUPPORT CONTACTS LINK IS PRESENT");
		
		log.info("***** END TC: GO TO LINKS *****");	
	}
	
	public void verifyCRMBetaLink() throws InterruptedException {
		WebElement crmbeta = driver.findElement(parser.getObjectLocator("crmbeta"));
		crmbeta.isDisplayed();
		log.info("CRM BETA LINK IS PRESENT");
	}
	
	public void loginAsBroker1() throws InterruptedException {
		driver.get(property.getProperty("loginasbroker1"));
		log.info("LOGGED IN AS BROKER 1 NOW");
		Thread.sleep(3000);
	}
	
	public void loginAsTC1() throws InterruptedException {
		driver.get(property.getProperty("loginastc1"));
		log.info("LOGGED IN AS TC 1 NOW");
		Thread.sleep(3000);
	}

}
