package com.qa.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class OpenHouses_ListingsPage extends TestBase{
	
	public void AC_Submit_Listing(String recoloradomls,
								  String iresmls,
								  String streetaddress,
								  String city, 
								  String zipcode, 
								  String subarea, 
								  String date, 
								  String price,
								  String clientEmail) throws InterruptedException {
		
		WebElement addListingButton = driver.findElement(parser.getObjectLocator("addListingButton"));
		addListingButton.click();
		System.out.println("AC: Clicked on Listing button");
		Thread.sleep(5000);
		
		WebElement recoloradomls1 = driver.findElement(parser.getObjectLocator("recoloradomls"));
		recoloradomls1.sendKeys(recoloradomls);
		System.out.println("AC: Entered recoloradomls");
		
		WebElement iresmls1 = driver.findElement(parser.getObjectLocator("iresmls"));
		iresmls1.sendKeys(iresmls);
		System.out.println("AC: Entered iresmls");
		
		WebElement streetaddress1 = driver.findElement(parser.getObjectLocator("streetaddress"));
		streetaddress1.sendKeys(streetaddress);
		System.out.println("AC: Entered streetaddress");
		
		WebElement city1 = driver.findElement(parser.getObjectLocator("city"));
		city1.sendKeys(city);
		System.out.println("AC: Entered city");
		
		WebElement zipcode1 = driver.findElement(parser.getObjectLocator("zipcode"));
		zipcode1.sendKeys(zipcode);
		System.out.println("AC: Entered zipcode");

		WebElement subarea1 = driver.findElement(parser.getObjectLocator("subarea"));
		subarea1.sendKeys(subarea);
		System.out.println("AC: Entered subarea");
		
		// Get Today's date in 01/06/2019 format
		DateFormat dateFormat = new SimpleDateFormat("MM/DD/YYYY");
		Date todaysDate = new Date();
		String todaysdate = dateFormat.format(todaysDate);
		//System.out.println(dateFormat.format(todaysDate)); //01/06/2019 12:08:43
		
		WebElement date1 = driver.findElement(parser.getObjectLocator("date"));
		date1.clear();
		date1.sendKeys(todaysdate);
		Thread.sleep(1000);
		date1.sendKeys(Keys.TAB);
		System.out.println("AC: Entered date");
		
		WebElement price1 = driver.findElement(parser.getObjectLocator("price"));
		price1.sendKeys(price);
		System.out.println("AC: Entered price");
		
		WebElement clientEmail1 = driver.findElement(parser.getObjectLocator("clientEmail"));
		clientEmail1.sendKeys(clientEmail);
		clientEmail1.sendKeys(Keys.ENTER);
		System.out.println("AC: Entered clientEmail");
		Thread.sleep(1000);
	
		
		WebElement createButton1 = driver.findElement(parser.getObjectLocator("createButton"));
		createButton1.click();
		System.out.println("AC: Clicked on CREATE button");
		Thread.sleep(5000);
		
		System.out.println("AC: Listing created successfully");
		
		WebElement listingSearchbox1 = driver.findElement(parser.getObjectLocator("listingSearchbox"));
		listingSearchbox1.sendKeys(streetaddress);
		System.out.println("AC: Went to Listing Searchbar and enter Listing Address");
		Thread.sleep(5000);
		
	}
}
