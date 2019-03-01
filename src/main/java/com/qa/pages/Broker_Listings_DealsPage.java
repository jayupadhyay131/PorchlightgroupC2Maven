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

public class Broker_Listings_DealsPage extends TestBase{

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
//		Thread.sleep(5000);
		
//		WebElement ls1addressgobackbutton5 = driver.findElement(parser.getObjectLocator("ls1addressgobackbutton5"));
//		ls1addressgobackbutton5.click();
//		log.info("BROKER: CLICKED ON GO BACK BUTTON FOR INCORRECT ADDRESS AUTO-SUGGEST POP-UP");
		
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
		Thread.sleep(5000);
		
		log.info("***** END TC: SUBMIT A LS1 WITH BROKER USER > 2 PROPERTY OVERVIEW *****");
	}
	
	public void Broker_Fill_LS1_3FieldServices() throws InterruptedException {
		
		log.info("***** START TC: SUBMIT A LS1 WITH BROKER USER > 3 FIELD SERVICES *****");
		
		WebElement ls1propertystatusoccupiedradio1 = driver.findElement(parser.getObjectLocator("ls1propertystatusoccupiedradio1"));
		ls1propertystatusoccupiedradio1.click();
		log.info("BROKER: SELECTED OCCUPIED FOR PROPERTY STATUS RADIO BUTON");
		
		WebElement ls1needstagingconsultyesradio2 = driver.findElement(parser.getObjectLocator("ls1needstagingconsultyesradio2"));
		ls1needstagingconsultyesradio2.click();
		log.info("BROKER: SELECTED YES TO NEED STAGING OR STAGING CONSULT RADIO BUTTON");
		
		WebElement ls1typeofservicerequesteddropdown3 = driver.findElement(parser.getObjectLocator("ls1typeofservicerequesteddropdown3"));
		ls1typeofservicerequesteddropdown3.click();
		log.info("BROKER: CLICKED ON TYPE OF SERVICE REQUESTED DROP-DOWN");
		Thread.sleep(1000);
		
		WebElement ls1typeofserviceoccupiedstagermeetswithclient3 = driver.findElement(parser.getObjectLocator("ls1typeofserviceoccupiedstagermeetswithclient3"));
		ls1typeofserviceoccupiedstagermeetswithclient3.click();
		log.info("BROKER: SELECTED AS OCCUPIED - STAGER MEETS WITH CLIENT");
		
		WebElement ls1anyspecialinstructionsforstagertextarea4 = driver.findElement(parser.getObjectLocator("ls1anyspecialinstructionsforstagertextarea4"));
		ls1anyspecialinstructionsforstagertextarea4.sendKeys("Any special instructions for the stager");
		log.info("BROKER: ENTERED TEXT FOR ANY SPECIAL INSTRUCTIONS FOR STAGER");
		
		WebElement ls1needmeasurementsyesradio5 = driver.findElement(parser.getObjectLocator("ls1needmeasurementsyesradio5"));
		ls1needmeasurementsyesradio5.click();
		log.info("BROKER: SELECTED YES TO NEED MEASUREMENTS RADIO BUTTON");
		
		WebElement ls1lasedmeasuredradio6 = driver.findElement(parser.getObjectLocator("ls1lasedmeasuredradio6"));
		ls1lasedmeasuredradio6.click();
		log.info("BROKER: SELECTED LASERED MEASURED RADIO BUTTON");

		WebElement ls1anyspecialinstructionsformeasurertextarea7 = driver.findElement(parser.getObjectLocator("ls1anyspecialinstructionsformeasurertextarea7"));
		ls1anyspecialinstructionsformeasurertextarea7.sendKeys("Any special instructions for the measurer");
		log.info("BROKER: ENTERD TEXT FOR ANY SPECIAL INSTRUCTIONS FOR MEASURER");

		WebElement ls1needmarketshinecleaning8 = driver.findElement(parser.getObjectLocator("ls1needmarketshinecleaning8"));
		ls1needmarketshinecleaning8.click();
		log.info("BROKER: CLICKED ON DROP-DOWN FOR NEED MARKET SHINE CLEANING");
		Thread.sleep(1000);
		
		WebElement ls1needmarketshinecleaningyes8 = driver.findElement(parser.getObjectLocator("ls1needmarketshinecleaningyes8"));
		ls1needmarketshinecleaningyes8.click();
		log.info("BROKER: SELECTED YES FROM DROP-DOWN FOR NEED MARKET SHINE CLEANING");
		
		WebElement ls1anyspecialinstructionsforcleanerstextarea9 = driver.findElement(parser.getObjectLocator("ls1anyspecialinstructionsforcleanerstextarea9"));
		ls1anyspecialinstructionsforcleanerstextarea9.sendKeys("Any special instructions for the cleaners");
		log.info("BROKER: ENTERED TEXT FOR ANY SPECIAL INSTRUCTIONS FOR CLEANER");

		EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
		eventFiringWebDriver.executeScript("document.querySelector('#FieldServicesSavePart1 > div.col-md-12.panel-body.form-body.bg-white').scrollTop=-1000");
		log.info("BROKER: SCROLLED UP FOR FORM TO TOP");
		Thread.sleep(1000);
		
		WebElement ls1needdeepcleandropdown10 = driver.findElement(parser.getObjectLocator("ls1needdeepcleandropdown10"));
		ls1needdeepcleandropdown10.click();
		log.info("BROKER: CLICKED ON DROP-DOWN FOR NEED A DEEP CLEAN");
		Thread.sleep(1000);
		
		WebElement ls1needdeepcleanyes1to4deepclean10 = driver.findElement(parser.getObjectLocator("ls1needdeepcleanyes1to4deepclean10"));
		ls1needdeepcleanyes1to4deepclean10.click();
		log.info("BROKER: SELECTED AS YES 1-4 DEEP CLEAN SELECTIONS");

		WebElement ls1deepcleanrequestcheckbox11 = driver.findElement(parser.getObjectLocator("ls1deepcleanrequestcheckbox11"));
		ls1deepcleanrequestcheckbox11.click();
		log.info("BROKER: SELECTED DEEP CLEAN REQUEST CHECKBOX - Kitchen - cabinet exteriors, backsplsh, stove");
		
		
		WebElement ls1deepcleanrequestsmodel11 = driver.findElement(parser.getObjectLocator("ls1deepcleanrequestsmodel11"));
		ls1deepcleanrequestsmodel11.sendKeys("Kitchen - cabinet exteriors, backsplsh, stove");
		log.info("BROKER: SELECTED DEEP CLEAN REQUEST CHECKBOX - Kitchen - cabinet exteriors, backsplsh, stove");

		WebElement ls1deepcleanrequestsokbutton11 = driver.findElement(parser.getObjectLocator("ls1deepcleanrequestsokbutton11"));
		ls1deepcleanrequestsokbutton11.click();
		log.info("BROKER: CLICKED ON OK BUTTON FOR CLEAN REQUEST MODEL");
		Thread.sleep(1000);
		
		WebElement ls1doyouwantyardsigncheckbox2yardsign12 = driver.findElement(parser.getObjectLocator("ls1doyouwantyardsigncheckbox2yardsign12"));
		ls1doyouwantyardsigncheckbox2yardsign12.click();
		log.info("BROKER: CLICKED ON YARD SIGN FOR DO YOU WANT YARD SIGN");
		Thread.sleep(1000);
		
		WebElement ls1flagplacedforsignreplacementyesradio13 = driver.findElement(parser.getObjectLocator("ls1flagplacedforsignreplacementyesradio13"));
		ls1flagplacedforsignreplacementyesradio13.click();
		log.info("BROKER: SELCTED YES TO RADIO BUTTON FOR HAVE YOU PLACED FLAG FOR SING REPLACEMENT");
		
		WebElement ls1fieldservicesnextbutton14 = driver.findElement(parser.getObjectLocator("ls1fieldservicesnextbutton14"));
		ls1fieldservicesnextbutton14.click();
		log.info("BROKER: CLICKED ON NEXT BUTTON FIELD SERVICES PAGE");
		Thread.sleep(5000);
		
		log.info("***** END TC: SUBMIT A LS1 WITH BROKER USER > 3 FIELD SERVICES *****");
	}
	
	public void Broker_Fill_LS1_4Photography() throws InterruptedException {
		
		log.info("***** START TC: SUBMIT A LS1 WITH BROKER USER > 4 PHOTOGRAPHY *****");
		
		WebElement ls1doyouneedphotosandvirtualtour1 = driver.findElement(parser.getObjectLocator("ls1doyouneedphotosandvirtualtour1"));
		ls1doyouneedphotosandvirtualtour1.click();
		log.info("BROKER: SELECTED YES FOR Do you need photos and a virtual tour");
		
		WebElement ls1willtheagentbepresentfortheshoot2 = driver.findElement(parser.getObjectLocator("ls1willtheagentbepresentfortheshoot2"));
		ls1willtheagentbepresentfortheshoot2.click();
		log.info("BROKER: SELECTED YES FOR Will the agent be present for the shoot");
		
		WebElement ls1willtheownerbepresentfortheshoot3 = driver.findElement(parser.getObjectLocator("ls1willtheownerbepresentfortheshoot3"));
		ls1willtheownerbepresentfortheshoot3.click();
		log.info("BROKER: SELECTED YES FOR Will the owner be present for the shoot");
		
		WebElement ls1anyspecialinstructionsforthephotographertextarea4 = driver.findElement(parser.getObjectLocator("ls1anyspecialinstructionsforthephotographertextarea4"));
		ls1anyspecialinstructionsforthephotographertextarea4.sendKeys("Any special instructions for the photographer");
		log.info("BROKER: ENTER ANY INSTRUCTIONS FOR PHOTOGRAPHER TEXT-AREA");
		
		WebElement ls1reshootanypartofpropertycheckbox5 = driver.findElement(parser.getObjectLocator("ls1reshootanypartofpropertycheckbox5"));
		ls1reshootanypartofpropertycheckbox5.click();
		log.info("BROKER: CLICKED ON CHECKBOX FOR RE-SHOOT ANY PART OF THE PROPERTY");
		Thread.sleep(1000);
	
		WebElement ls1reshootanypartofpropertycheckboxmodel5 = driver.findElement(parser.getObjectLocator("ls1reshootanypartofpropertycheckboxmodel5"));
		ls1reshootanypartofpropertycheckboxmodel5.sendKeys("Re-shoot any part of property - $75");
		log.info("BROKER: ENTERED TEXT FOR RE-SHOOT ANY PART OF THE PROPERTY");
		Thread.sleep(1000);
		
		WebElement ls1reshootanypartofpropertycheckboxmodelokbutton5 = driver.findElement(parser.getObjectLocator("ls1reshootanypartofpropertycheckboxmodelokbutton5"));
		ls1reshootanypartofpropertycheckboxmodelokbutton5.sendKeys("Re-shoot any part of property - $75");
		log.info("BROKER: CLICKED OK BUTTON FOR RE-SHOOT ANY PART OF THE PROPERTY MODEL");
		Thread.sleep(1000);
		
		WebElement ls1photographynextbutton6 = driver.findElement(parser.getObjectLocator("ls1photographynextbutton6"));
		ls1photographynextbutton6.click();
		log.info("BROKER: CLICKED ON NEXT BUTTON PHOTOGRAPHY PAGE");
		Thread.sleep(5000);
		
		log.info("***** END TC: SUBMIT A LS1 WITH BROKER USER > 4 PHOTOGRAPHY *****");
	}
	
	public void Broker_Fill_LS1_5Access() throws InterruptedException {
		
		log.info("***** START TC: SUBMIT A LS1 WITH BROKER USER > 5 ACCESS *****");
		
		WebElement ls1sellername1 = driver.findElement(parser.getObjectLocator("ls1sellername1"));
		ls1sellername1.sendKeys("Seller1");
		log.info("BROKER: ENTERED SELLER NAME AS Seller1");
		
		WebElement ls1sellernickname2 = driver.findElement(parser.getObjectLocator("ls1sellernickname2"));
		ls1sellernickname2.sendKeys("S1");
		log.info("BROKER: ENTERED SELLER NICK NAME AS S1");
		
		WebElement ls1sellerphone3 = driver.findElement(parser.getObjectLocator("ls1sellerphone3"));
		ls1sellerphone3.sendKeys("1111111111");
		log.info("BROKER: ENTERED SELLER PHONE AS 111-111-1111");
		
		WebElement ls1selleremail4 = driver.findElement(parser.getObjectLocator("ls1selleremail4"));
		ls1selleremail4.sendKeys("jay.upadhyay@porchlightgroup.com");
		log.info("BROKER: ENTERED SELLER EMAIL AS jay.upadhyay@porchlightgroup.com");
		
		WebElement ls1seller2name5 = driver.findElement(parser.getObjectLocator("ls1seller2name5"));
		ls1seller2name5.sendKeys("Seller2");
		log.info("BROKER: ENTERED SELLER 2 NAME AS Seller2");
		
		WebElement ls1seller2nickname6 = driver.findElement(parser.getObjectLocator("ls1seller2nickname6"));
		ls1seller2nickname6.sendKeys("S2");
		log.info("BROKER: ENTERED SELLER 2 NICK NAME AS S2");
		
		WebElement ls1seller2phone7 = driver.findElement(parser.getObjectLocator("ls1seller2phone7"));
		ls1seller2phone7.sendKeys("2222222222");
		log.info("BROKER: ENTERED SELLER 2 PHONE AS 222-222-2222");

		WebElement ls1seller2email8 = driver.findElement(parser.getObjectLocator("ls1seller2email8"));
		ls1seller2email8.sendKeys("jay.upadhyay@porchlightgroup.com");
		log.info("BROKER: ENTERED SELLER EMAIL AS jay.upadhyay@porchlightgroup.com");

		WebElement ls1secureorhoaradiobuttonyes9 = driver.findElement(parser.getObjectLocator("ls1secureorhoaradiobuttonyes9"));
		ls1secureorhoaradiobuttonyes9.click();
		log.info("BROKER: CLICKED ON YES RADIO BUTTON FOR Is property in a secure or HOA building?");
		Thread.sleep(2000);
		
		WebElement ls1lockboxtypedropdown16 = driver.findElement(parser.getObjectLocator("ls1lockboxtypedropdown16"));
		ls1lockboxtypedropdown16.click();
		log.info("BROKER: CLICKED ON DROP-DOWN MENU FOR LOCKBOX TYPE");
		Thread.sleep(1000);
		
		WebElement ls1lockboxtypedropdowncombo17 = driver.findElement(parser.getObjectLocator("ls1lockboxtypedropdowncombo17"));
		ls1lockboxtypedropdowncombo17.click();
		log.info("BROKER: SELECTED COMBO VALUE FROM DROP-DOWN MENU FOR LOCKBOX TYPE");
		
		WebElement ls1codeorserial18 = driver.findElement(parser.getObjectLocator("ls1codeorserial18"));
		ls1codeorserial18.sendKeys("Code or Serial");
		log.info("BROKER: ENTERED CODE OR SERIAL AS Code or Serial");
		
		WebElement ls1lockboxlocation19 = driver.findElement(parser.getObjectLocator("ls1lockboxlocation19"));
		ls1lockboxlocation19.sendKeys("Lockbox location");
		log.info("BROKER: ENTERED LOCKBOX LOCATION AS Lockbox location");
		
		WebElement ls1gatecode20 = driver.findElement(parser.getObjectLocator("ls1gatecode20"));
		ls1gatecode20.sendKeys("Gate code");
		log.info("BROKER: ENTERED GATE CODE AS Gate code");
		
		WebElement ls1garagecode21 = driver.findElement(parser.getObjectLocator("ls1garagecode21"));
		ls1garagecode21.sendKeys("Garage code");
		log.info("BROKER: ENTERED GARAGE CODE AS Garage code");
		
		WebElement ls1doesthispropertyhaveanalarmyesradiobutton22 = driver.findElement(parser.getObjectLocator("ls1doesthispropertyhaveanalarmyesradiobutton22"));
		ls1doesthispropertyhaveanalarmyesradiobutton22.click();
		log.info("BROKER: SELECTED YES RADIO BUTTON FOR Does this property have an alarm?");
		
		WebElement ls1alarmcode122 = driver.findElement(parser.getObjectLocator("ls1alarmcode122"));
		ls1alarmcode122.sendKeys("Alarm code");
		log.info("BROKER: ENTERED ALARM CODE 1 AS Alarm code");
		
		WebElement ls1alarmcode222 = driver.findElement(parser.getObjectLocator("ls1alarmcode222"));
		ls1alarmcode222.sendKeys("Alarm code");
		log.info("BROKER: ENTERED ALARM CODE 2 AS Alarm code");
		
		WebElement ls1alarmlocation22 = driver.findElement(parser.getObjectLocator("ls1alarmlocation22"));
		ls1alarmlocation22.sendKeys("Alarm location");
		log.info("BROKER: ENTERED ALARM CODE 2 AS Alarm location");
		
		WebElement ls1petsonpropertyyesradionbutton23 = driver.findElement(parser.getObjectLocator("ls1petsonpropertyyesradionbutton23"));
		ls1petsonpropertyyesradionbutton23.click();
		log.info("BROKER: SELECTED YES TO RADIO BUTTON FOR Pets on property");
		
		WebElement ls1specialinstructionsforpremarkettextarea24 = driver.findElement(parser.getObjectLocator("ls1specialinstructionsforpremarkettextarea24"));
		ls1specialinstructionsforpremarkettextarea24.sendKeys("Special instructions for pre-market services access to the home and/or building");
		log.info("BROKER: ENTERED SPECIAL INSTRUCTIONS FOR PRE-MARKET AS Special instructions for pre-market services access to the home and/or building");

		WebElement ls1fsappointmentsanyradiobutton25 = driver.findElement(parser.getObjectLocator("ls1fsappointmentsanyradiobutton25"));
		ls1fsappointmentsanyradiobutton25.click();
		log.info("BROKER: ENTERED FIELD SERVICES APPOINTMENTS AS Anytime");
		
		//scroll down
		EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
		eventFiringWebDriver.executeScript("document.querySelector('#AccessOrShowingSavePart1 > div.col-md-12.panel-body.form-body.bg-white').scrollTop=1000");
		log.info("BROKER: SCROLLED DOWN TO BOTTOM FORM IN ACCESS TAB");
		Thread.sleep(1000);
		
		WebElement ls1hoaname10 = driver.findElement(parser.getObjectLocator("ls1hoaname10"));
		ls1hoaname10.sendKeys("HOA Name");
		log.info("BROKER: ENTERED HOA NAME AS HOA Name");
		
		WebElement ls1hoacontact11 = driver.findElement(parser.getObjectLocator("ls1hoacontact11"));
		ls1hoacontact11.sendKeys("HOA Contact");
		log.info("BROKER: ENTERED HOA CONTACT AS HOA Contact");
		
		WebElement ls1hoacontactphone12 = driver.findElement(parser.getObjectLocator("ls1hoacontactphone12"));
		ls1hoacontactphone12.sendKeys("1111111111");
		log.info("BROKER: ENTERED CONTACT PHONE AS 111-111-1111");
		
		WebElement ls1hoa2contact13 = driver.findElement(parser.getObjectLocator("ls1hoa2contact13"));
		ls1hoa2contact13.sendKeys("HOA Contact 2");
		log.info("BROKER: ENTERED HOA CONTACT 2 AS HOA Contact 2");
		
		WebElement ls1hoa2contactphone14 = driver.findElement(parser.getObjectLocator("ls1hoa2contactphone14"));
		ls1hoa2contactphone14.sendKeys("2222222222");
		log.info("BROKER: ENTERED CONTACT 2 PHONE AS 222-222-2222");
		
		WebElement ls1hoa2othercontact15 = driver.findElement(parser.getObjectLocator("ls1hoa2othercontact15"));
		ls1hoa2othercontact15.sendKeys("HOA other name");
		log.info("BROKER: ENTERED HOA OTHER NAME AS HOA other name");
		
		WebElement ls1hoaelevatorrequiredyesradiobutton26 = driver.findElement(parser.getObjectLocator("ls1hoaelevatorrequiredyesradiobutton26"));
		ls1hoaelevatorrequiredyesradiobutton26.click();
		log.info("BROKER: SELECTED YES RADIO BUTTON FOR Is an elevator (freight) reservation required for Staging?");

		WebElement ls1buildinginstructionsoraccesstextarea27 = driver.findElement(parser.getObjectLocator("ls1buildinginstructionsoraccesstextarea27"));
		ls1buildinginstructionsoraccesstextarea27.sendKeys("Any special instructions for building or access");
		log.info("BROKER: ENTERED TEXT FOR ACCESS INSTRUCTIONS AS Any special instructions for building or access");
		Thread.sleep(1000);
		
		WebElement ls1accessnextbutton28 = driver.findElement(parser.getObjectLocator("ls1accessnextbutton28"));
		ls1accessnextbutton28.click();
		log.info("BROKER: CLICKED ON NEXT BUTTON ACCESS PAGE");
		Thread.sleep(5000);

		log.info("***** END TC: SUBMIT A LS1 WITH BROKER USER > 5 ACCESS *****");
	}

	public void Broker_Fill_LS1_6OpenHouses() throws InterruptedException {
		
		log.info("***** START TC: SUBMIT A LS1 WITH BROKER USER > 6 OPEN HOUSES *****");
		
		WebElement ls1listingavailableyesradiobutton1 = driver.findElement(parser.getObjectLocator("ls1listingavailableyesradiobutton1"));
		ls1listingavailableyesradiobutton1.click();
		log.info("BROKER: SELECTED YES TO Listing available for Open Houses?");
		
		WebElement ls1doesthisrequired2agenst2 = driver.findElement(parser.getObjectLocator("ls1doesthisrequired2agenst2"));
		ls1doesthisrequired2agenst2.click();
		log.info("BROKER: SELECTED NO TO Does this listing require 2 Agents?");
		
		WebElement ls1ohslots1thursady3 = driver.findElement(parser.getObjectLocator("ls1ohslots1thursady3"));
		ls1ohslots1thursady3.click();
		log.info("BROKER: CLICKED ON Thursday 12pm - 2pm");
		
		WebElement ls1ohslots1saturday4 = driver.findElement(parser.getObjectLocator("ls1ohslots1saturday4"));
		ls1ohslots1saturday4.click();
		log.info("BROKER: CLICKED ON Saturday 10am - 12pm");
		
		WebElement ls1ohslots2saturday5 = driver.findElement(parser.getObjectLocator("ls1ohslots2saturday5"));
		ls1ohslots2saturday5.click();
		log.info("BROKER: CLICKED ON Saturday 12pm - 2pm");
		
		WebElement ls1ohslots3saturday6 = driver.findElement(parser.getObjectLocator("ls1ohslots3saturday6"));
		ls1ohslots3saturday6.click();
		log.info("BROKER: CLICKED ON Saturday 2pm - 4pm");
		
		WebElement ls1ohslots1sunday8 = driver.findElement(parser.getObjectLocator("ls1ohslots1sunday8"));
		ls1ohslots1sunday8.click();
		log.info("BROKER: CLICKED ON Sunday 10am - 12pm");
		
		WebElement ls1ohslots2sunday9 = driver.findElement(parser.getObjectLocator("ls1ohslots2sunday9"));
		ls1ohslots2sunday9.click();
		log.info("BROKER: CLICKED ON Sunday 12pm - 2pm");
		
		WebElement ls1ohslots3sunday10 = driver.findElement(parser.getObjectLocator("ls1ohslots3sunday10"));
		ls1ohslots3sunday10.click();
		log.info("BROKER: CLICKED ON Sunday 2pm - 4pm");
		
		WebElement ls1openhousenextbutton11 = driver.findElement(parser.getObjectLocator("ls1openhousenextbutton11"));
		ls1openhousenextbutton11.click();
		log.info("BROKER: CLICKED ON NEXT BUTTON OPEN HOUSES PAGE");
		Thread.sleep(5000);

		log.info("***** END TC: SUBMIT A LS1 WITH BROKER USER > 6 OPEN HOUSES *****");
	}
	
	public void Broker_Fill_LS1_7SummaryTab() throws InterruptedException {
		
		log.info("***** START TC: SUBMIT A LS1 WITH BROKER USER > 6 OPEN HOUSES *****");
		
		WebElement ls1summarytabsubmitbutton1 = driver.findElement(parser.getObjectLocator("ls1summarytabsubmitbutton1"));
		ls1summarytabsubmitbutton1.click();
		log.info("BROKER: CLICKED ON SUBMIT BUTTON FROM SUMMARY TAB");
		Thread.sleep(3000);
		
		WebElement ls1summarytabyesbutton2 = driver.findElement(parser.getObjectLocator("ls1summarytabyesbutton2"));
		ls1summarytabyesbutton2.click();
		log.info("BROKER: CLICKED ON YES BUTTON FOR SENDING TO TC FOR REVIEW LS1 SUBMISSION");
		Thread.sleep(5000);
		
		log.info("***** END TC: SUBMIT A LS1 WITH BROKER USER > 6 OPEN HOUSES *****");
	}
		
}
