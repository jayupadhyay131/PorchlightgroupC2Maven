package com.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.base.TestBase;

public class Listings_DealsPage extends TestBase{

	Logger log = Logger.getLogger(LoginPage.class);
	
	public void Broker_Fill_LS1_1AgreementTab() throws InterruptedException {
		
		log.info("***** START TC: SUBMIT A LS1 WITH BROKER USER > 1 AGREEMENT SECTION *****");
		
		WebElement yes = driver.findElement(parser.getObjectLocator("yes"));
		yes.click();
		log.info("BROKER: SELECTED YES RADIO BUTTON");
		Thread.sleep(1000);
		
		WebElement startbutton = driver.findElement(parser.getObjectLocator("startbutton"));
		startbutton.click();
		log.info("BROKER: SELECTED START BUTTON FOR NEXT PAGE");
		Thread.sleep(5000);
		
		log.info("***** END TC: SUBMIT A LS1 WITH BROKER USER > 1 AGREEMENT SECTION *****");
	}
	
	public void Broker_Fill_LS1_2PropertyOverview() throws InterruptedException {
		
		log.info("***** START TC: SUBMIT A LS1 WITH BROKER USER > 2 PROPERTY OVERVIEW *****");
		
		WebElement ls1colisting1agentdropdown = driver.findElement(parser.getObjectLocator("ls1colisting1agentdropdown"));
		ls1colisting1agentdropdown.click();
		log.info("BROKER: CLICKED ON CO-LISTING AGENT DROP-DOWN MENU");
		
		WebElement ls1colisting1agentsearchbar = driver.findElement(parser.getObjectLocator("ls1colisting1agentsearchbar"));
		ls1colisting1agentsearchbar.sendKeys("Jay Upadhyay");
		ls1colisting1agentsearchbar.sendKeys(Keys.ENTER);
		log.info("BROKER: ENTERED CO-LISTING AGENT AS JAY UPADHYAY AND PRESSED ENTER");
		
		WebElement ls1propertystreet2 = driver.findElement(parser.getObjectLocator("ls1propertystreet2"));
		ls1propertystreet2.sendKeys("AUTO BROKER LISTING 1");
		log.info("BROKER: ENTERED STREET ADDRESS");
		
		WebElement ls1city3 = driver.findElement(parser.getObjectLocator("ls1city3"));
		ls1city3.sendKeys("BOISE");
		log.info("BROKER: ENTERED CITY");
		
		WebElement ls1zip4 = driver.findElement(parser.getObjectLocator("ls1zip4"));
		ls1zip4.sendKeys("83702");
		log.info("BROKER: ENTERED ZIP CODE");
		
		WebElement ls1neighborhood6 = driver.findElement(parser.getObjectLocator("ls1neighborhood6"));
		ls1neighborhood6.sendKeys("ADA COUNTY");
		log.info("BROKER: ENTERED NEIGHBORHOOD");
		Thread.sleep(5000);
		
		WebElement ls1addressgobackbutton5 = driver.findElement(parser.getObjectLocator("ls1addressgobackbutton5"));
		ls1addressgobackbutton5.click();
		log.info("BROKER: CLICKED ON GO BACK BUTTON FOR INCORRECT ADDRESS AUTO-SUGGEST POP-UP");
		
		WebElement ls1typeofhomedropdown7 = driver.findElement(parser.getObjectLocator("ls1typeofhomedropdown7"));
		ls1typeofhomedropdown7.click();
		log.info("BROKER: CLICKED ON TYPE OF HOME DROP-DOWN MENU");
		Thread.sleep(1000);
		
		WebElement ls1typeofhomedropdownattached7 = driver.findElement(parser.getObjectLocator("ls1typeofhomedropdownattached7"));
		ls1typeofhomedropdownattached7.click();
		log.info("BROKER: CLICKED ON TYPE OF HOME = ATTACHED");
		Thread.sleep(1000);
		
		WebElement ls1styledropdown8 = driver.findElement(parser.getObjectLocator("ls1styledropdown8"));
		ls1styledropdown8.click();
		log.info("BROKER: CLICKED ON SOURCE DROP-DOWN MENU");
		Thread.sleep(1000);
	
		WebElement ls1stylefropdowncondominium8 = driver.findElement(parser.getObjectLocator("ls1stylefropdowncondominium8"));
		ls1stylefropdowncondominium8.click();
		log.info("BROKER: CLICKED ON SOURCE = CONDOMINIUM");
		Thread.sleep(1000);
		
		WebElement ls1bedroomone9 = driver.findElement(parser.getObjectLocator("ls1bedroomone9"));
		ls1bedroomone9.sendKeys("1");
		log.info("BROKER: ENTERED BEDROOMS AS 1");
		
		WebElement ls1bedroomonedropdown9 = driver.findElement(parser.getObjectLocator("ls1bedroomonedropdown9"));
		ls1bedroomonedropdown9.click();
		log.info("BROKER: SELETED BEDROOMS AS 1 FROM DROP-DOWN MENU");
		
		
		log.info("***** END TC: SUBMIT A LS1 WITH BROKER USER > 2 PROPERTY OVERVIEW *****");
	}
	
}
