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
		
		WebElement schedule = driver.findElement(parser.getObjectLocator("schedule"));
		schedule.click();
		log.info("LEFT NAVBAR: CLICKED ON SCHEDULE");
		Thread.sleep(1000);
		
		log.info("***** END TC: GO TO OPEN HOUSE > SCHEDULE PAGE *****");
	}

}
