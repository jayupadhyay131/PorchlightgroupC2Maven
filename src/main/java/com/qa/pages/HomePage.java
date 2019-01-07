package com.qa.pages;

import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class HomePage extends TestBase{
	
	/**
	 * METHOD 1: From home page, navigate to OpenHouses > Schedule page 
	 **/
	public void goToOpenHousesSchedulePage() throws InterruptedException {
		
		WebElement openHouses = driver.findElement(parser.getObjectLocator("openHouses"));
		openHouses.click();
		
		WebElement schedule = driver.findElement(parser.getObjectLocator("schedule"));
		schedule.click();
		Thread.sleep(1000);
		
		//System.out.println("------clicked successfully------");
	}

}
