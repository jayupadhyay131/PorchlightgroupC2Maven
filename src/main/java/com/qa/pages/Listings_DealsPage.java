package com.qa.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

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
		//ls1bedroomone9.sendKeys(Keys.ENTER);
		log.info("BROKER: ENTERED BEDROOMS AS 1");
		Thread.sleep(1000);
		
		WebElement ls1bedroomonedropdown9 = driver.findElement(parser.getObjectLocator("ls1bedroomonedropdown9"));
		ls1bedroomonedropdown9.click();
		log.info("BROKER: SELETED BEDROOMS AS 1 FROM DROP-DOWN MENU");
		
		WebElement ls1bathroomone10 = driver.findElement(parser.getObjectLocator("ls1bathroomone10"));
		ls1bathroomone10.sendKeys("1");
		//ls1bathroomone10.sendKeys(Keys.ENTER);
		log.info("BROKER: ENTERED BATHROOMS AS 1");
		Thread.sleep(1000);
		
		WebElement ls1bathroomonedropdown10 = driver.findElement(parser.getObjectLocator("ls1bathroomonedropdown10"));
		ls1bathroomonedropdown10.click();
		log.info("BROKER: SELETED BATHROOMS AS 1 FROM DROP-DOWN MENU");
		
		WebElement ls1totalfinishedtextbox11 = driver.findElement(parser.getObjectLocator("ls1totalfinishedtextbox11"));
		ls1totalfinishedtextbox11.sendKeys("1000");
		log.info("BROKER: ENTERED TOTAL FINISHED = 1000");
		
		WebElement ls1totalfinishedabovegound12 = driver.findElement(parser.getObjectLocator("ls1totalfinishedabovegound12"));
		ls1totalfinishedabovegound12.sendKeys("2000");
		log.info("BROKER: ENTERED TOTAL FINISHED ABOVE GROUND = 2000");
		
		WebElement ls1basementfinisheddropdown13 = driver.findElement(parser.getObjectLocator("ls1basementfinisheddropdown13"));
		ls1basementfinisheddropdown13.click();
		log.info("BROKER: CLICKED ON BASEMENT FINISHED DROP-DOWN MENU");
		Thread.sleep(1000);
		
		WebElement ls1basementfinisheddropdownfullyfinished14 = driver.findElement(parser.getObjectLocator("ls1basementfinisheddropdownfullyfinished14"));
		ls1basementfinisheddropdownfullyfinished14.click();
		log.info("BROKER: SELECTED FULLY FINISHED FROM DROP-DOWN MENU");
		Thread.sleep(1000);
		
		WebElement ls1listpricefrom15 = driver.findElement(parser.getObjectLocator("ls1listpricefrom15"));
		ls1listpricefrom15.sendKeys("1000000");
		log.info("BROKER: ENTERED LIST PRICE FROM = 1,000,000");
		
		WebElement ls1listpriceto15 = driver.findElement(parser.getObjectLocator("ls1listpriceto15"));
		ls1listpriceto15.sendKeys("2000000");
		log.info("BROKER: ENTERED LIST PRICE TO = 2,000,000");
		Thread.sleep(1000);
		
		EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
		eventFiringWebDriver.executeScript("document.querySelector('#PropertySavePart1 > div.col-md-12.panel-body.bg-white.form-body').scrollTop=-1000");
		log.info("BROKER: SCROLLED UP FOR FORM TO TOP");
		Thread.sleep(1000);
		
		WebElement ls1doesthishomebelongstoanhoayesradio16 = driver.findElement(parser.getObjectLocator("ls1doesthishomebelongstoanhoayesradio16"));
		ls1doesthishomebelongstoanhoayesradio16.click();
		log.info("BROKER: SELECTED DOES THIS HOME BELONGS TO AN HOA? TO YES RADIO BUTTON");
		
		WebElement ls1hoadues16 = driver.findElement(parser.getObjectLocator("ls1hoadues16"));
		ls1hoadues16.sendKeys("100");
		log.info("BROKER: ENTERED HOA DUES AS 100");
		
		WebElement 	ls1hoaduesmonthradiobutton16 = driver.findElement(parser.getObjectLocator("ls1hoaduesmonthradiobutton16"));
		ls1hoaduesmonthradiobutton16.click();
		log.info("BROKER: CLICKED ON MONTH RADIO BUTTON FOR HOA DUES");
		
		WebElement ls1parkingspaces17 = driver.findElement(parser.getObjectLocator("ls1parkingspaces17"));
		ls1parkingspaces17.sendKeys("1");
		log.info("BROKER: ENTERED PARKING SPACES AS 1");
		
		WebElement ls1parkingspacesdropdown17 = driver.findElement(parser.getObjectLocator("ls1parkingspacesdropdown17"));
		ls1parkingspacesdropdown17.click();
		log.info("BROKER: SELETED PARKING SPACES AS 1 FROM DROP-DOWN MENU");
		Thread.sleep(1000);
		
		WebElement ls1typeofparkingdropdown18 = driver.findElement(parser.getObjectLocator("ls1typeofparkingdropdown18"));
		ls1typeofparkingdropdown18.click();
		log.info("BROKER: CLICKED ON TYPE OF PARKING DROP-DOWN MENU");
		Thread.sleep(1000);
		
		WebElement ls1typeofparkingcarportdetached19 = driver.findElement(parser.getObjectLocator("ls1typeofparkingcarportdetached19"));
		ls1typeofparkingcarportdetached19.click();
		log.info("BROKER: CLICKED ON TYPE OF PARKING DROP-DOWN MENU");
		
		WebElement ls1typeofparkingtextarea19 = driver.findElement(parser.getObjectLocator("ls1typeofparkingtextarea19"));
		ls1typeofparkingtextarea19.sendKeys("Type of Parking");
		log.info("BROKER: CLICKED ON TYPE OF PARKING DROP-DOWN MENU");
		
		// Get Today's date in 01/06/2019 format
		DateFormat dateFormat = new SimpleDateFormat("MM/DD/YYYY");
		Date todaysDate = new Date();
		String todaysdate = dateFormat.format(todaysDate);
		
		WebElement ls1servicestartdate21 = driver.findElement(parser.getObjectLocator("ls1servicestartdate21"));
		ls1servicestartdate21.clear();
		ls1servicestartdate21.sendKeys(todaysdate);
		Thread.sleep(1000);
		ls1servicestartdate21.sendKeys(Keys.TAB);
		log.info("BROKER: ENTERED SERVICE START DATE AS = " + todaysdate);		
		
		WebElement ls1sourceoflistingdropdown22 = driver.findElement(parser.getObjectLocator("ls1sourceoflistingdropdown22"));
		ls1sourceoflistingdropdown22.click();
		log.info("BROKER: CLICKED ON SOURCE OF LISTING DROP-DOWN MENU");
		
		WebElement ls1sourceoflistingreferalfromexisting23 = driver.findElement(parser.getObjectLocator("ls1sourceoflistingreferalfromexisting23"));
		ls1sourceoflistingreferalfromexisting23.click();
		log.info("BROKER: SELECTED SOURCE OF LISTING AS REFERAL FROM EXISTING");
		
		WebElement ls1issellerinconnectdatabaseyesradio25 = driver.findElement(parser.getObjectLocator("ls1issellerinconnectdatabaseyesradio25"));
		ls1issellerinconnectdatabaseyesradio25.click();
		log.info("BROKER: CLICKED ON YES RADIO BUTTON FOR IS SELLER IN CONNECT DATABASE");

		WebElement ls1propertyoverviewnextbutton26 = driver.findElement(parser.getObjectLocator("ls1propertyoverviewnextbutton26"));
		ls1propertyoverviewnextbutton26.click();
		log.info("BROKER: CLICKED ON NEXT BUTTON PROPERTY OVERVIEW PAGE");

		
		log.info("***** END TC: SUBMIT A LS1 WITH BROKER USER > 2 PROPERTY OVERVIEW *****");
	}
	
}
