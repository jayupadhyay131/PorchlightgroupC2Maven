package com.qa.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class OpenHouses_ListingsPage extends TestBase{
	
	Logger log = Logger.getLogger(LoginPage.class);
	
	public void AC_Submit_Listing(String recoloradomls,
								  String iresmls,
								  String streetaddress,
								  String city, 
								  String zipcode, 
								  String subarea, 
								  String date, 
								  String price,
								  String clientEmail) throws InterruptedException {
		
		log.info("***** START TC: SUBMIT A LISTING WITH AC USER *****");
		
		WebElement addListingButton = driver.findElement(parser.getObjectLocator("addListingButton"));
		addListingButton.click();
		log.info("AC: CLICKED ON ADD LISTING BUTTON");
		Thread.sleep(5000);
		
		WebElement recoloradomls1 = driver.findElement(parser.getObjectLocator("recoloradomls"));
		recoloradomls1.sendKeys(recoloradomls);
		log.info("AC: ENTERED RECOLORADO MLS = " + recoloradomls);
		
		WebElement iresmls1 = driver.findElement(parser.getObjectLocator("iresmls"));
		iresmls1.sendKeys(iresmls);
		log.info("AC: ENTERED IRES MLS = " + iresmls);
		
		WebElement streetaddress1 = driver.findElement(parser.getObjectLocator("streetaddress"));
		streetaddress1.sendKeys(streetaddress);
		log.info("AC: ENTERED STREET NUMBER = " + streetaddress);
		
		WebElement city1 = driver.findElement(parser.getObjectLocator("city"));
		city1.sendKeys(city);
		log.info("AC: ENTERED CITY" + city);
		
		WebElement zipcode1 = driver.findElement(parser.getObjectLocator("zipcode"));
		zipcode1.sendKeys(zipcode);
		log.info("AC: ENTERED ZIPCODE" + zipcode);

		WebElement subarea1 = driver.findElement(parser.getObjectLocator("subarea"));
		subarea1.sendKeys(subarea);
		log.info("AC: ENTERED SUB-AREA" + subarea);
		
		// Get Today's date in 01/06/2019 format
		DateFormat dateFormat = new SimpleDateFormat("MM/DD/YYYY");
		Date todaysDate = new Date();
		String todaysdate = dateFormat.format(todaysDate);
		
		WebElement date1 = driver.findElement(parser.getObjectLocator("date"));
		date1.clear();
		date1.sendKeys(todaysdate);
		Thread.sleep(1000);
		date1.sendKeys(Keys.TAB);
		log.info("AC: ENTERED TODAY'S DATE AS " + todaysdate);
		
		WebElement price1 = driver.findElement(parser.getObjectLocator("price"));
		price1.sendKeys(price);
		log.info("AC: ENTERED PRICE = " + price);
		
		WebElement clientEmail1 = driver.findElement(parser.getObjectLocator("clientEmail"));
		clientEmail1.sendKeys(clientEmail);
		clientEmail1.sendKeys(Keys.ENTER);
		log.info("AC: ENTERED CLIENT EMAIL ADDRESS = " + clientEmail);
		Thread.sleep(1000);
	
		WebElement createButton1 = driver.findElement(parser.getObjectLocator("createButton"));
		createButton1.click();
		log.info("AC CLICKED ON SUBMIT BUTTON");
		Thread.sleep(5000);
		
		log.info("AC SUCCESSFULLY CREATED A LISTING");
		
		WebElement listingSearchbox1 = driver.findElement(parser.getObjectLocator("listingSearchbox"));
		listingSearchbox1.sendKeys(streetaddress);
		log.info("AC: WENT TO LISTING SEACHBAR AND ENTERED LISTING ADDRESS = " + streetaddress);
		Thread.sleep(5000);
		
		log.info("***** END TC: SUBMIT A LISTING WITH AC USER *****");

		
	}
}
