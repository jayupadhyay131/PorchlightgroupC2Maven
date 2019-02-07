package com.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

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
		
		WebElement ls1colistingagentdropdown = driver.findElement(parser.getObjectLocator("ls1colistingagentdropdown"));
		ls1colistingagentdropdown.click();
		log.info("BROKER: SELECTED YES RADIO BUTTON");
		
		WebElement ls1colistingagentsearchbar = driver.findElement(parser.getObjectLocator("yes"));
		ls1colistingagentsearchbar.sendKeys("Jay Upadhyay");
		ls1colistingagentsearchbar.sendKeys(Keys.ENTER);
		log.info("BROKER: SELECTED YES RADIO BUTTON");
		
		log.info("***** END TC: SUBMIT A LS1 WITH BROKER USER > 2 PROPERTY OVERVIEW *****");
	}
	
}
