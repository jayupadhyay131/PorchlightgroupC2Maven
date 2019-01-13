package com.qa.pages;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class Listings_DealsPage extends TestBase{

	Logger log = Logger.getLogger(LoginPage.class);
	
	public void Broker_Fill_LS1_1AgreementTab() throws InterruptedException {
		
		log.info("***** START TC: SUBMIT A LS1 WITH BROKER USER *****");
		
		WebElement addListingButton = driver.findElement(parser.getObjectLocator("addListingButton"));
		addListingButton.click();
		log.info("AC: CLICKED ON ADD LISTING BUTTON");
		Thread.sleep(5000);

	}	
	
}
