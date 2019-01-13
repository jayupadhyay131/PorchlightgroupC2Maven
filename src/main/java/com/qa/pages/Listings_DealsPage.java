package com.qa.pages;

import org.apache.log4j.Logger;

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
		log.info("BROKER: SELECTED YES RADIO BUTTON");
		Thread.sleep(5000);
		
		log.info("***** START TC: SUBMIT A LS1 WITH BROKER USER > 1 AGREEMENT SECTION *****");
	}	
	
}
