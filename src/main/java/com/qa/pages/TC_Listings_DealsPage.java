package com.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class TC_Listings_DealsPage extends TestBase{

	Logger log = Logger.getLogger(LoginPage.class);
	
	public void TC_TakeLs1Task_From_Dashboard() throws InterruptedException {
		
		log.info("***** START TC: APPROVE LS1 WITH TC USER > MY TASKS WIDGET *****");
		
		WebElement ls1mytaskswidgettaketaskbutton1 = driver.findElement(parser.getObjectLocator("ls1mytaskswidgettaketaskbutton1"));
		ls1mytaskswidgettaketaskbutton1.click();
		log.info("TC: DASHBOARD > MY TASKS WIDGET > CLICKED ON TAKE TASK BUTTON");
		Thread.sleep(1000);
		
		WebElement ls1mytaskswidgetokbuttonfortaketask2 = driver.findElement(parser.getObjectLocator("ls1mytaskswidgetokbuttonfortaketask2"));
		ls1mytaskswidgetokbuttonfortaketask2.click();
		log.info("TC: DASHBOARD > MY TASKS WIDGET > CLICKED ON OK BUTTON");
		Thread.sleep(5000);
		
		log.info("***** END TC: APPROVE LS1 WITH TC USER > MY TASKS WIDGET *****");
	}
	
	public void TC_Approve_LS1_1AgreementTab() throws InterruptedException {
		
		log.info("***** START TC: APPROVE LS1 WITH TC USER > 1 AGREEMENT TAB *****");
		
		WebElement ls1tcyes1 = driver.findElement(parser.getObjectLocator("ls1tcyes1"));
		ls1tcyes1.isDisplayed();
		log.info("TC: VERIFIED AGREEMENT YES IS PRESENT");
		
		WebElement ls1tapprovedcheckbox2 = driver.findElement(parser.getObjectLocator("ls1tapprovedcheckbox2"));
		ls1tapprovedcheckbox2.click();
		log.info("TC: CLICKED ON APPROVE TAB BUTTON");
		
		WebElement ls1tcagreementtabnextbutton3 = driver.findElement(parser.getObjectLocator("ls1tcagreementtabnextbutton3"));
		ls1tcagreementtabnextbutton3.click();
		log.info("TC: CLICKED ON AGREEMENT TAB NEXT BUTTON");
		Thread.sleep(5000);
		
		log.info("***** END TC: APPROVE LS1 WITH TC USER > 1 AGREEMENT TAB *****");
	}
	
	public void TC_Approve_LS1_2PropertyOverviewTab() throws InterruptedException {
		
		log.info("***** START TC: APPROVE LS1 WITH TC USER > 2 PROPERTY OVERVIEW TAB *****");
		
		WebElement ls1tclistingagent1 = driver.findElement(parser.getObjectLocator("ls1tclistingagent1"));
		ls1tclistingagent1.isDisplayed();
		log.info("TC: LISTING AGENT FIELD IS PRESENT");
		
		WebElement ls1tccolistingagent2 = driver.findElement(parser.getObjectLocator("ls1tccolistingagent2"));
		ls1tccolistingagent2.isDisplayed();
		log.info("TC: CO-LISTING AGENT FIELD IS PRESENT");
		
		WebElement ls1tcpropertyaddressstreet3 = driver.findElement(parser.getObjectLocator("ls1tcpropertyaddressstreet3"));
		ls1tcpropertyaddressstreet3.isDisplayed();
		log.info("TC: PROPERTY STREET FIELD IS PRESENT");
		
		WebElement ls1tcpropertyaddresscity4 = driver.findElement(parser.getObjectLocator("ls1tcpropertyaddresscity4"));
		ls1tcpropertyaddresscity4.isDisplayed();
		log.info("TC: PROPERTY CITY FIELD IS PRESENT");
		
		WebElement ls1tcpropertyaddresszip5 = driver.findElement(parser.getObjectLocator("ls1tcpropertyaddresszip5"));
		ls1tcpropertyaddresszip5.isDisplayed();
		log.info("TC: PROPERTY ZIP FIELD IS PRESENT");
		
		WebElement ls1tcneighborhood6 = driver.findElement(parser.getObjectLocator("ls1tcneighborhood6"));
		ls1tcneighborhood6.isDisplayed();
		log.info("TC: NEIGHBORHOOD FIELD IS PRESENT");
		
		WebElement ls1tctypeofhome7 = driver.findElement(parser.getObjectLocator("ls1tctypeofhome7"));
		ls1tctypeofhome7.isDisplayed();
		log.info("TC: TYPE OF HOME FIELD IS PRESENT");
		
		WebElement ls1tcstyle8 = driver.findElement(parser.getObjectLocator("ls1tcstyle8"));
		ls1tcstyle8.isDisplayed();
		log.info("TC: STYLE FIELD IS PRESENT");
		
		WebElement ls1tcbedrooms9 = driver.findElement(parser.getObjectLocator("ls1tcbedrooms9"));
		ls1tcbedrooms9.isDisplayed();
		log.info("TC: BEDROOMS FIELD IS PRESENT");
		
		WebElement ls1tcbathrooms10 = driver.findElement(parser.getObjectLocator("ls1tcbathrooms10"));
		ls1tcbathrooms10.isDisplayed();
		log.info("TC: BATHROOMS FIELD IS PRESENT");
		
		WebElement ls1tctotalfinished11 = driver.findElement(parser.getObjectLocator("ls1tctotalfinished11"));
		ls1tctotalfinished11.isDisplayed();
		log.info("TC: TOTAL FINISHED FIELD IS PRESENT");
		
		WebElement ls1tctotalfinishedaboveground12 = driver.findElement(parser.getObjectLocator("ls1tctotalfinishedaboveground12"));
		ls1tctotalfinishedaboveground12.isDisplayed();
		log.info("TC: TOTAL FINISHED ABOVE GROUND FIELD IS PRESENT");
		
		WebElement ls1tcbasementfinished13 = driver.findElement(parser.getObjectLocator("ls1tcbasementfinished13"));
		ls1tcbasementfinished13.isDisplayed();
		log.info("TC: BASEDMENT FINISHED FIELD IS PRESENT");
		
		WebElement ls1tclistpricefrom14 = driver.findElement(parser.getObjectLocator("ls1tclistpricefrom14"));
		ls1tclistpricefrom14.isDisplayed();
		log.info("TC: LIST PRICE FROM FIELD IS PRESENT");
		
		WebElement ls1tclistpriceto15 = driver.findElement(parser.getObjectLocator("ls1tclistpriceto15"));
		ls1tclistpriceto15.isDisplayed();
		log.info("TC: LIST PRICE to FIELD IS PRESENT");
		
		WebElement ls1tcdoesthishomebelongstoanhoayesradio16 = driver.findElement(parser.getObjectLocator("ls1tcdoesthishomebelongstoanhoayesradio16"));
		ls1tcdoesthishomebelongstoanhoayesradio16.isDisplayed();
		log.info("TC: DOES THIS HOME BELONGS TO AN HOA FIELD IS PRESENT");
		
		WebElement ls1tchoaduesprice17 = driver.findElement(parser.getObjectLocator("ls1tchoaduesprice17"));
		ls1tchoaduesprice17.isDisplayed();
		log.info("TC: HOA PRICE DUE FIELD IS PRESENT");
		
		WebElement ls1tchoaduemonthly18 = driver.findElement(parser.getObjectLocator("ls1tchoaduemonthly18"));
		ls1tchoaduemonthly18.isDisplayed();
		log.info("TC: HOA DUE MONTHLY RADIO FIELD IS PRESENT");
		
		WebElement ls1tcparkingspaces19 = driver.findElement(parser.getObjectLocator("ls1tcparkingspaces19"));
		ls1tcparkingspaces19.isDisplayed();
		log.info("TC: PARKING SPACES FIELD IS PRESENT");
		
		WebElement ls1tctypeofparking20 = driver.findElement(parser.getObjectLocator("ls1tctypeofparking20"));
		ls1tctypeofparking20.isDisplayed();
		log.info("TC: TYPE OF PARKING FIELD IS PRESENT");
		
		WebElement ls1tctypeofparkingdescription21 = driver.findElement(parser.getObjectLocator("ls1tctypeofparkingdescription21"));
		ls1tctypeofparkingdescription21.isDisplayed();
		log.info("TC: TYPE OF PARKING DESCRIPTION FIELD IS PRESENT");
		
		WebElement ls1tcactivemlsdate22 = driver.findElement(parser.getObjectLocator("ls1tcactivemlsdate22"));
		ls1tcactivemlsdate22.isDisplayed();
		log.info("TC: ACTIVE MLS DATE FIELD IS PRESENT");
		
		WebElement ls1tcservicestartdate23 = driver.findElement(parser.getObjectLocator("ls1tcservicestartdate23"));
		ls1tcservicestartdate23.isDisplayed();
		log.info("TC: SERVICE START DATE FIELD IS PRESENT");
		
		WebElement ls1tcsourceoflisting24 = driver.findElement(parser.getObjectLocator("ls1tcsourceoflisting24"));
		ls1tcsourceoflisting24.isDisplayed();
		log.info("TC: SOURCE OF LISTING FIELD IS PRESENT");
		
		WebElement ls1tcissellerinconnectdb25 = driver.findElement(parser.getObjectLocator("ls1tcissellerinconnectdb25"));
		ls1tcissellerinconnectdb25.isDisplayed();
		log.info("TC: IS SELLER IN CONNECT DATABASE FIELD IS PRESENT");
		
		WebElement ls1tceditbutton26 = driver.findElement(parser.getObjectLocator("ls1tceditbutton26"));
		ls1tceditbutton26.isDisplayed();
		log.info("TC: EDIT PROPERTY OVERVIEW BUTTON IS PRESENT");
		
		WebElement ls1tcbackbutton27 = driver.findElement(parser.getObjectLocator("ls1tcbackbutton27"));
		ls1tcbackbutton27.isDisplayed();
		log.info("TC: BACK PROPERTY OVERVIEW BUTTON IS PRESENT");
		
		WebElement ls1tcapprovecheckboxpropertyoverviewtab28 = driver.findElement(parser.getObjectLocator("ls1tcapprovecheckboxpropertyoverviewtab28"));
		ls1tcapprovecheckboxpropertyoverviewtab28.click();
		log.info("TC: CLICKED ON APPROVE PROPERTY OVERVIEW CHECKBOX");
		
		WebElement ls1tcpropertyoverviewnextbutton29 = driver.findElement(parser.getObjectLocator("ls1tcpropertyoverviewnextbutton29"));
		ls1tcpropertyoverviewnextbutton29.click();
		log.info("TC: CLICKED ON NEXT BUTTON FROM PROPERTY OVERVIEW TAB");

		log.info("***** END TC: APPROVE LS1 WITH TC USER > 2 PROPERTY OVERVIEW TAB *****");
	}
	
}