package com.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class TC_Listings_DealsPage extends TestBase{

	Logger log = Logger.getLogger(LoginPage.class);
	
	public void TC_TakeLs1Task_From_Dashboard() throws InterruptedException {
		
		log.info("***** START TC: APPROVE LS1 WITH TC USER > MY TASKS WIDGET *****");
		
		WebElement ls1mytaskswidgettaketaskbutton1 = driver.findElement(parser.getObjectLocator("ls1mytaskswidgettaketaskbutton1"));
		ls1mytaskswidgettaketaskbutton1.click();
		log.info("TC: DASHBOARD > MY TASKS WIDGET > CLICKED ON TAKE TASK BUTTON");
		Thread.sleep(1000);
		
		WebElement ls1mytaskswidgetokbuttonfortaketask2 = driver.findElement(parser.getObjectLocator("ls1mytaskswidgetokbuttonfortaketask2"));
		ls1mytaskswidgetokbuttonfortaketask2.click();
		log.info("TC: DASHBOARD > MY TASKS WIDGET > CLICKED ON OK BUTTON");
		Thread.sleep(5000);
		
		log.info("***** END TC: APPROVE LS1 WITH TC USER > MY TASKS WIDGET *****");
	}
	
	public void TC_Approve_LS1_1AgreementTab() throws InterruptedException {
		
		log.info("***** START TC: APPROVE LS1 WITH TC USER > 1 AGREEMENT TAB *****");
		
		WebElement ls1tcyes1 = driver.findElement(parser.getObjectLocator("ls1tcyes1"));
		ls1tcyes1.isDisplayed();
		log.info("TC: VERIFIED AGREEMENT YES IS PRESENT");
		
		WebElement ls1tapprovedcheckbox2 = driver.findElement(parser.getObjectLocator("ls1tapprovedcheckbox2"));
		ls1tapprovedcheckbox2.click();
		log.info("TC: CLICKED ON APPROVE TAB BUTTON");
		
		WebElement ls1tcagreementtabnextbutton3 = driver.findElement(parser.getObjectLocator("ls1tcagreementtabnextbutton3"));
		ls1tcagreementtabnextbutton3.click();
		log.info("TC: CLICKED ON AGREEMENT TAB NEXT BUTTON");
		Thread.sleep(5000);
		
		log.info("***** END TC: APPROVE LS1 WITH TC USER > 1 AGREEMENT TAB *****");
	}
	
	public void TC_Approve_LS1_2PropertyOverviewTab() throws InterruptedException {
		
		log.info("***** START TC: APPROVE LS1 WITH TC USER > 2 PROPERTY OVERVIEW TAB *****");
		
		WebElement ls1tclistingagent1 = driver.findElement(parser.getObjectLocator("ls1tclistingagent1"));
		ls1tclistingagent1.isDisplayed();
		log.info("TC: LISTING AGENT FIELD IS PRESENT");
		
		WebElement ls1tccolistingagent2 = driver.findElement(parser.getObjectLocator("ls1tccolistingagent2"));
		ls1tccolistingagent2.isDisplayed();
		log.info("TC: CO-LISTING AGENT FIELD IS PRESENT");
		
		WebElement ls1tcpropertyaddressstreet3 = driver.findElement(parser.getObjectLocator("ls1tcpropertyaddressstreet3"));
		ls1tcpropertyaddressstreet3.isDisplayed();
		log.info("TC: PROPERTY STREET FIELD IS PRESENT");
		
		WebElement ls1tcpropertyaddresscity4 = driver.findElement(parser.getObjectLocator("ls1tcpropertyaddresscity4"));
		ls1tcpropertyaddresscity4.isDisplayed();
		log.info("TC: PROPERTY CITY FIELD IS PRESENT");
		
		WebElement ls1tcpropertyaddresszip5 = driver.findElement(parser.getObjectLocator("ls1tcpropertyaddresszip5"));
		ls1tcpropertyaddresszip5.isDisplayed();
		log.info("TC: PROPERTY ZIP FIELD IS PRESENT");
		
		WebElement ls1tcneighborhood6 = driver.findElement(parser.getObjectLocator("ls1tcneighborhood6"));
		ls1tcneighborhood6.isDisplayed();
		log.info("TC: NEIGHBORHOOD FIELD IS PRESENT");
		
		WebElement ls1tctypeofhome7 = driver.findElement(parser.getObjectLocator("ls1tctypeofhome7"));
		ls1tctypeofhome7.isDisplayed();
		log.info("TC: TYPE OF HOME FIELD IS PRESENT");
		
		WebElement ls1tcstyle8 = driver.findElement(parser.getObjectLocator("ls1tcstyle8"));
		ls1tcstyle8.isDisplayed();
		log.info("TC: STYLE FIELD IS PRESENT");
		
		WebElement ls1tcbedrooms9 = driver.findElement(parser.getObjectLocator("ls1tcbedrooms9"));
		ls1tcbedrooms9.isDisplayed();
		log.info("TC: BEDROOMS FIELD IS PRESENT");
		
		WebElement ls1tcbathrooms10 = driver.findElement(parser.getObjectLocator("ls1tcbathrooms10"));
		ls1tcbathrooms10.isDisplayed();
		log.info("TC: BATHROOMS FIELD IS PRESENT");
		
		WebElement ls1tctotalfinished11 = driver.findElement(parser.getObjectLocator("ls1tctotalfinished11"));
		ls1tctotalfinished11.isDisplayed();
		log.info("TC: TOTAL FINISHED FIELD IS PRESENT");
		
		WebElement ls1tctotalfinishedaboveground12 = driver.findElement(parser.getObjectLocator("ls1tctotalfinishedaboveground12"));
		ls1tctotalfinishedaboveground12.isDisplayed();
		log.info("TC: TOTAL FINISHED ABOVE GROUND FIELD IS PRESENT");
		
		WebElement ls1tcbasementfinished13 = driver.findElement(parser.getObjectLocator("ls1tcbasementfinished13"));
		ls1tcbasementfinished13.isDisplayed();
		log.info("TC: BASEDMENT FINISHED FIELD IS PRESENT");
		
		WebElement ls1tclistpricefrom14 = driver.findElement(parser.getObjectLocator("ls1tclistpricefrom14"));
		ls1tclistpricefrom14.isDisplayed();
		log.info("TC: LIST PRICE FROM FIELD IS PRESENT");
		
		WebElement ls1tclistpriceto15 = driver.findElement(parser.getObjectLocator("ls1tclistpriceto15"));
		ls1tclistpriceto15.isDisplayed();
		log.info("TC: LIST PRICE to FIELD IS PRESENT");
		
		WebElement ls1tcdoesthishomebelongstoanhoayesradio16 = driver.findElement(parser.getObjectLocator("ls1tcdoesthishomebelongstoanhoayesradio16"));
		ls1tcdoesthishomebelongstoanhoayesradio16.isDisplayed();
		log.info("TC: DOES THIS HOME BELONGS TO AN HOA FIELD IS PRESENT");
		
		WebElement ls1tchoaduesprice17 = driver.findElement(parser.getObjectLocator("ls1tchoaduesprice17"));
		ls1tchoaduesprice17.isDisplayed();
		log.info("TC: HOA PRICE DUE FIELD IS PRESENT");
		
		WebElement ls1tchoaduemonthly18 = driver.findElement(parser.getObjectLocator("ls1tchoaduemonthly18"));
		ls1tchoaduemonthly18.isDisplayed();
		log.info("TC: HOA DUE MONTHLY RADIO FIELD IS PRESENT");
		
		WebElement ls1tcparkingspaces19 = driver.findElement(parser.getObjectLocator("ls1tcparkingspaces19"));
		ls1tcparkingspaces19.isDisplayed();
		log.info("TC: PARKING SPACES FIELD IS PRESENT");
		
		WebElement ls1tctypeofparking20 = driver.findElement(parser.getObjectLocator("ls1tctypeofparking20"));
		ls1tctypeofparking20.isDisplayed();
		log.info("TC: TYPE OF PARKING FIELD IS PRESENT");
		
		WebElement ls1tctypeofparkingdescription21 = driver.findElement(parser.getObjectLocator("ls1tctypeofparkingdescription21"));
		ls1tctypeofparkingdescription21.isDisplayed();
		log.info("TC: TYPE OF PARKING DESCRIPTION FIELD IS PRESENT");
		
		WebElement ls1tcactivemlsdate22 = driver.findElement(parser.getObjectLocator("ls1tcactivemlsdate22"));
		ls1tcactivemlsdate22.isDisplayed();
		log.info("TC: ACTIVE MLS DATE FIELD IS PRESENT");
		
		WebElement ls1tcservicestartdate23 = driver.findElement(parser.getObjectLocator("ls1tcservicestartdate23"));
		ls1tcservicestartdate23.isDisplayed();
		log.info("TC: SERVICE START DATE FIELD IS PRESENT");
		
		WebElement ls1tcsourceoflisting24 = driver.findElement(parser.getObjectLocator("ls1tcsourceoflisting24"));
		ls1tcsourceoflisting24.isDisplayed();
		log.info("TC: SOURCE OF LISTING FIELD IS PRESENT");
		
		WebElement ls1tcissellerinconnectdb25 = driver.findElement(parser.getObjectLocator("ls1tcissellerinconnectdb25"));
		ls1tcissellerinconnectdb25.isDisplayed();
		log.info("TC: IS SELLER IN CONNECT DATABASE FIELD IS PRESENT");
		
		WebElement ls1tceditbutton26 = driver.findElement(parser.getObjectLocator("ls1tceditbutton26"));
		ls1tceditbutton26.isDisplayed();
		log.info("TC: EDIT PROPERTY OVERVIEW BUTTON IS PRESENT");
		
		WebElement ls1tcbackbutton27 = driver.findElement(parser.getObjectLocator("ls1tcbackbutton27"));
		ls1tcbackbutton27.isDisplayed();
		log.info("TC: BACK PROPERTY OVERVIEW BUTTON IS PRESENT");
		
		WebElement ls1tcapprovecheckboxpropertyoverviewtab28 = driver.findElement(parser.getObjectLocator("ls1tcapprovecheckboxpropertyoverviewtab28"));
		ls1tcapprovecheckboxpropertyoverviewtab28.click();
		log.info("TC: CLICKED ON APPROVE PROPERTY OVERVIEW CHECKBOX");
		
		WebElement ls1tcpropertyoverviewnextbutton29 = driver.findElement(parser.getObjectLocator("ls1tcpropertyoverviewnextbutton29"));
		ls1tcpropertyoverviewnextbutton29.click();
		log.info("TC: CLICKED ON NEXT BUTTON FROM PROPERTY OVERVIEW TAB");
		Thread.sleep(5000);
		
		log.info("***** END TC: APPROVE LS1 WITH TC USER > 2 PROPERTY OVERVIEW TAB *****");
	}
	
	public void TC_Approve_LS1_3FieldServicesTab() throws InterruptedException {
		
		log.info("***** START TC: APPROVE LS1 WITH TC USER > 3 FIELD SERVICES TAB *****");
		
		WebElement ls1tcpropertystatusoccupied1 = driver.findElement(parser.getObjectLocator("ls1tcpropertystatusoccupied1"));
		ls1tcpropertystatusoccupied1.isDisplayed();
		log.info("TC: PROPERTY STATUS WITH OCCUPIED RADIO BUTTON IS PRESENT");
		
		WebElement ls1tcneedstagingconsultuntyes2 = driver.findElement(parser.getObjectLocator("ls1tcneedstagingconsultuntyes2"));
		ls1tcneedstagingconsultuntyes2.isDisplayed();
		log.info("TC: NEED STAGING OR STAGING CONSULT? YES BUTTON IS PRESENT");
		
		WebElement ls1tctypeofserviceoccupiedstagermeetswithclient3 = driver.findElement(parser.getObjectLocator("ls1tctypeofserviceoccupiedstagermeetswithclient3"));
		ls1tctypeofserviceoccupiedstagermeetswithclient3.isDisplayed();
		log.info("TC: TYPE OF SERVICES REQUESTED AS OCCUPIED - STAGER MEETS WITH CLIENT");
		
		WebElement ls1tcspecialinstructionstostager4 = driver.findElement(parser.getObjectLocator("ls1tcspecialinstructionstostager4"));
		ls1tcspecialinstructionstostager4.isDisplayed();
		log.info("TC: ANY SPECIAL INSTRUCTONS FOR STAGER TEXTAREA IS PRESENT");

		WebElement ls1tcneedmeasurementsyes5 = driver.findElement(parser.getObjectLocator("ls1tcneedmeasurementsyes5"));
		ls1tcneedmeasurementsyes5.isDisplayed();
		log.info("TC: NEED A MARKET SHINE CLEANING AS YES RADIO BUTTON");
		
		WebElement ls1tcspecialinstructionstomeasurer6 = driver.findElement(parser.getObjectLocator("ls1tcspecialinstructionstomeasurer6"));
		ls1tcspecialinstructionstomeasurer6.isDisplayed();
		log.info("TC: ANY SPECIAL INSTRUCTONS FOR CLEANERS TEXTAREA IS PRESENT");
		
		WebElement ls1tcneedmarketshineyes7 = driver.findElement(parser.getObjectLocator("ls1tcneedmarketshineyes7"));
		ls1tcneedmarketshineyes7.isDisplayed();
		log.info("TC: NEED MARKET SHINE CLEANING YES RADIO BUTTON IS PRESENT");
		
		WebElement ls1tcspecialinstructionstocleaners8 = driver.findElement(parser.getObjectLocator("ls1tcspecialinstructionstocleaners8"));
		ls1tcspecialinstructionstocleaners8.isDisplayed();
		log.info("TC: ANY SPECIAL INSTRUCTONS FOR CLEANERS TEXTAREA IS PRESENT");
		
		WebElement ls1tcneedadeepcleanyes1to4selections9 = driver.findElement(parser.getObjectLocator("ls1tcneedadeepcleanyes1to4selections9"));
		ls1tcneedadeepcleanyes1to4selections9.isDisplayed();
		log.info("TC: NEED A DEEP CLEAN SELECTED AS YES. 1-4 DEEP CLEAN SELECTIONS");
		
		WebElement ls1tcdeepselectionsrequestskitchen10 = driver.findElement(parser.getObjectLocator("ls1tcdeepselectionsrequestskitchen10"));
		ls1tcdeepselectionsrequestskitchen10.isDisplayed();
		log.info("TC: SELECT ANY DEEP CLEAN REQUESTS FOR THIS LISTING AS Kitchen - cabinet exteriors, backsplsh, stove");
		
		WebElement ls1tcdoyouwantsignsyesyardsign11 = driver.findElement(parser.getObjectLocator("ls1tcdoyouwantsignsyesyardsign11"));
		ls1tcdoyouwantsignsyesyardsign11.isDisplayed();
		log.info("TC: DO YOU WANT SIGN SELECTED AS YARD SIGN");
		
		WebElement ls1tchaveyouplacedflagsignreplacementyes12 = driver.findElement(parser.getObjectLocator("ls1tchaveyouplacedflagsignreplacementyes12"));
		ls1tchaveyouplacedflagsignreplacementyes12.isDisplayed();
		log.info("TC: HAVE YOU PALCED FLAG FOR SIGN PLACEMENT? YES RADIO IS PRESENT");
		
		WebElement ls1tcfieldservicestabeditbutton13 = driver.findElement(parser.getObjectLocator("ls1tcfieldservicestabeditbutton13"));
		ls1tcfieldservicestabeditbutton13.isDisplayed();
		log.info("TC: FORM EDIT BUTTON IS PRESENT FOR FIELD SERVICES SECTION");
		
		WebElement ls1tcfieldservicestabbackbutton14 = driver.findElement(parser.getObjectLocator("ls1tcfieldservicestabbackbutton14"));
		ls1tcfieldservicestabbackbutton14.isDisplayed();
		log.info("TC: FORM BACK BUTTON IS PRESENT FOR FIELD SERVICES SECTION");
		
		WebElement ls1tcapprovebutton15 = driver.findElement(parser.getObjectLocator("ls1tcapprovebutton15"));
		ls1tcapprovebutton15.click();
		log.info("TC: CLICKED ON APPROVE CHECKBOX FOR FIELD SERVICES SECTION");
		Thread.sleep(1000);
		
		WebElement ls1tcfieldservicsesnextbutton16 = driver.findElement(parser.getObjectLocator("ls1tcfieldservicsesnextbutton16"));
		ls1tcfieldservicsesnextbutton16.click();
		log.info("TC: CLICKED ON NEXT BUTTON");
		Thread.sleep(5000);
		
		log.info("***** END TC: APPROVE LS1 WITH TC USER > 3 FIELD SERVICES TAB *****");
	}
	
	public void TC_Approve_LS1_4PhotographyTab() throws InterruptedException {
		
		log.info("***** START TC: APPROVE LS1 WITH TC USER > 4 PHOTOGRAPHT TAB *****");
		
		WebElement ls1tcdoyouneedphotosandavirtualtouryesradio1 = driver.findElement(parser.getObjectLocator("ls1tcdoyouneedphotosandavirtualtouryesradio1"));
		ls1tcdoyouneedphotosandavirtualtouryesradio1.isDisplayed();
		log.info("TC: DO YOU NEED PHOTOS AND A VIRTUAL TOUR YES RADIO BUTTON IS PRESENT");
		
		WebElement ls1tcwilltheagentbepresentfortheshootyesradio2 = driver.findElement(parser.getObjectLocator("ls1tcwilltheagentbepresentfortheshootyesradio2"));
		ls1tcwilltheagentbepresentfortheshootyesradio2.isDisplayed();
		log.info("TC: WILL THE AGENT BE PRESENT FOR THE SHOOT YES RADIO BUTTON IS PRESENT");
		
		WebElement ls1tcwilltheownerbepresentfortheshootyesradio3 = driver.findElement(parser.getObjectLocator("ls1tcwilltheownerbepresentfortheshootyesradio3"));
		ls1tcwilltheownerbepresentfortheshootyesradio3.isDisplayed();
		log.info("TC: WILL THE OWNER BE PRESENT FOR THE SHOOT YES RADIO BUTTON IS PRESENT");
		
		WebElement ls1tcanyspecialinstructionsforthephotographertextarea4 = driver.findElement(parser.getObjectLocator("ls1tcanyspecialinstructionsforthephotographertextarea4"));
		ls1tcanyspecialinstructionsforthephotographertextarea4.isDisplayed();
		log.info("TC: ANY SPECIAL INSTRUCTIONS FOR THE PHOTOGRAPHER TEXTAREA IS PRESENT");
		
		WebElement ls1tcadditionalserviceshootanypartofpropertycheckbox5 = driver.findElement(parser.getObjectLocator("ls1tcadditionalserviceshootanypartofpropertycheckbox5"));
		ls1tcadditionalserviceshootanypartofpropertycheckbox5.isDisplayed();
		log.info("TC: ADDITIONAL SERVICE: RESHOOT ANY PART OF THE PROPERTY IS PRESENT");
		
		WebElement ls1tc75dollarsservicesfee6 = driver.findElement(parser.getObjectLocator("ls1tc75dollarsservicesfee6"));
		ls1tc75dollarsservicesfee6.isDisplayed();
		log.info("TC: $75 SERVICE FEE FOR ADDITIONAL SERVICE IS PRESENT");
		
		WebElement ls1tcphotographyeditbutton7 = driver.findElement(parser.getObjectLocator("ls1tcphotographyeditbutton7"));
		ls1tcphotographyeditbutton7.isDisplayed();
		log.info("TC: PHOTOGRAPHY EDIT BUTTON IS PRESENT");
		
		WebElement ls1tcphotographybackbutton8 = driver.findElement(parser.getObjectLocator("ls1tcphotographybackbutton8"));
		ls1tcphotographybackbutton8.isDisplayed();
		log.info("TC: PHOTOGRAPHY BACK BUTTON IS PRESENT");
		
		WebElement ls1tcphotographyapprovecheckbox9 = driver.findElement(parser.getObjectLocator("ls1tcphotographyapprovecheckbox9"));
		ls1tcphotographyapprovecheckbox9.click();
		log.info("TC: PHOTOGRAPHY TAB CLICKED ON APPROVE CHECKBOX");
		Thread.sleep(1000);
		
		WebElement ls1tcphotographynextbutton10 = driver.findElement(parser.getObjectLocator("ls1tcphotographynextbutton10"));
		ls1tcphotographynextbutton10.click();
		log.info("TC: PHOTOGRAPHY TAB CLICKED ON NEXT BUTTON");
		Thread.sleep(5000);		
		
		log.info("***** END TC: APPROVE LS1 WITH TC USER > 4 PHOTOGRAPHT TAB *****");
	}
	
	public void TC_Approve_LS1_5AccessTab() throws InterruptedException {
		
		log.info("***** START TC: APPROVE LS1 WITH TC USER > 5 ACCESS TAB *****");
		
		WebElement ls1tcsellername1 = driver.findElement(parser.getObjectLocator("ls1tcsellername1"));
		ls1tcsellername1.isDisplayed();
		log.info("TC: SELLER NAME FIELD IS PRESENT");
		
		WebElement ls1tcsellernickname2 = driver.findElement(parser.getObjectLocator("ls1tcsellernickname2"));
		ls1tcsellernickname2.isDisplayed();
		log.info("TC: SELLER NICKNAME FIELD IS PRESENT");
		
		WebElement ls1tcsellerphone3 = driver.findElement(parser.getObjectLocator("ls1tcsellerphone3"));
		ls1tcsellerphone3.isDisplayed();
		log.info("TC: SELLER PHONE FIELD IS PRESENT");
		
		WebElement ls1tcselleremail4 = driver.findElement(parser.getObjectLocator("ls1tcselleremail4"));
		ls1tcselleremail4.isDisplayed();
		log.info("TC: SELLER PHONE FIELD IS PRESENT");
		
		WebElement ls1tcseller2name5 = driver.findElement(parser.getObjectLocator("ls1tcseller2name5"));
		ls1tcseller2name5.isDisplayed();
		log.info("TC: SELLER 2 NAME FIELD IS PRESENT");
		
		WebElement ls1tcseller2nickname6 = driver.findElement(parser.getObjectLocator("ls1tcseller2nickname6"));
		ls1tcseller2nickname6.isDisplayed();
		log.info("TC: SELLER 2 NICKNAME FIELD IS PRESENT");
		
		WebElement ls1tcseller2phone7 = driver.findElement(parser.getObjectLocator("ls1tcseller2phone7"));
		ls1tcseller2phone7.isDisplayed();
		log.info("TC: SELLER 2 PHONE FIELD IS PRESENT");
		
		WebElement ls1tcseller2email8 = driver.findElement(parser.getObjectLocator("ls1tcseller2email8"));
		ls1tcseller2email8.isDisplayed();
		log.info("TC: SELLER 2 EMAIL FIELD IS PRESENT");
		
		WebElement ls1tcissecurehoabuilding9 = driver.findElement(parser.getObjectLocator("ls1tcissecurehoabuilding9"));
		ls1tcissecurehoabuilding9.isDisplayed();
		log.info("TC: SELLER 2 EMAIL FIELD IS PRESENT");
		
		WebElement ls1tclockboxtypecombo10 = driver.findElement(parser.getObjectLocator("ls1tclockboxtypecombo10"));
		ls1tclockboxtypecombo10.isDisplayed();
		log.info("TC: SELLER 2 EMAIL FIELD IS PRESENT");
		
		WebElement ls1tccodeorserial11 = driver.findElement(parser.getObjectLocator("ls1tccodeorserial11"));
		ls1tccodeorserial11.isDisplayed();
		log.info("TC: CODE OR SERIAL FIELD IS PRESENT");
		
		WebElement ls1tclockboxlocation12 = driver.findElement(parser.getObjectLocator("ls1tclockboxlocation12"));
		ls1tclockboxlocation12.isDisplayed();
		log.info("TC: LOCKBOX LOCATION FIELD IS PRESENT");
		
		WebElement ls1tcgatecode13 = driver.findElement(parser.getObjectLocator("ls1tcgatecode13"));
		ls1tcgatecode13.isDisplayed();
		log.info("TC: GATE CODE FIELD IS PRESENT");
		
		WebElement ls1tcgaragecode14 = driver.findElement(parser.getObjectLocator("ls1tcgaragecode14"));
		ls1tcgaragecode14.isDisplayed();
		log.info("TC: GARAGE CODE FIELD IS PRESENT");
		
		WebElement ls1tcdoesthispropertyhaveanalarm15 = driver.findElement(parser.getObjectLocator("ls1tcdoesthispropertyhaveanalarm15"));
		ls1tcdoesthispropertyhaveanalarm15.isDisplayed();
		log.info("TC: DOES THIS PROPERTY HAVE AN ALARM? FILED IS PRESENT");
		
		WebElement ls1tcalarmcode116 = driver.findElement(parser.getObjectLocator("ls1tcalarmcode116"));
		ls1tcalarmcode116.isDisplayed();
		log.info("TC: ALARM CODE 1 FILED IS PRESENT");
		
		WebElement ls1tcalarmcode217 = driver.findElement(parser.getObjectLocator("ls1tcalarmcode217"));
		ls1tcalarmcode217.isDisplayed();
		log.info("TC: ALARM CODE 2 FILED IS PRESENT");
		
		WebElement ls1tcalarmlocation18 = driver.findElement(parser.getObjectLocator("ls1tcalarmlocation18"));
		ls1tcalarmlocation18.isDisplayed();
		log.info("TC: ALARM LOCATION FILED IS PRESENT");
		
		WebElement ls1tcpetsonpropery19 = driver.findElement(parser.getObjectLocator("ls1tcpetsonpropery19"));
		ls1tcpetsonpropery19.isDisplayed();
		log.info("TC: PETS ON PROPERTY FILED IS PRESENT");
		
		WebElement ls1tcspecialinstructionsforpremarkeservices20 = driver.findElement(parser.getObjectLocator("ls1tcspecialinstructionsforpremarkeservices20"));
		ls1tcspecialinstructionsforpremarkeservices20.isDisplayed();
		log.info("TC: SPECIAL INSTRUCTIONS FOR PRE-MARKET SERVICES TEXTAREA FILED IS PRESENT");
		
		WebElement ls1tchoaname21 = driver.findElement(parser.getObjectLocator("ls1tchoaname21"));
		ls1tchoaname21.isDisplayed();
		log.info("TC: HOA NAME FILED IS PRESENT");
		
		WebElement ls1tchoacontact22 = driver.findElement(parser.getObjectLocator("ls1tchoacontact22"));
		ls1tchoacontact22.isDisplayed();
		log.info("TC: HOA NAME FILED IS PRESENT");
		
		WebElement ls1tccontactphone23 = driver.findElement(parser.getObjectLocator("ls1tccontactphone23"));
		ls1tccontactphone23.isDisplayed();
		log.info("TC: CONTACT PHONE FILED IS PRESENT");
		
		WebElement ls1tchoacontact24 = driver.findElement(parser.getObjectLocator("ls1tchoacontact24"));
		ls1tchoacontact24.isDisplayed();
		log.info("TC: HOA CONTACT 2 FILED IS PRESENT");
		
		WebElement ls1tcontact2phone25 = driver.findElement(parser.getObjectLocator("ls1tcontact2phone25"));
		ls1tcontact2phone25.isDisplayed();
		log.info("TC: HOA CONTACT 2 FILED IS PRESENT");
		
		WebElement ls1tchoaothername26 = driver.findElement(parser.getObjectLocator("ls1tchoaothername26"));
		ls1tchoaothername26.isDisplayed();
		log.info("TC: HOA OTHER NAME 2 FILED IS PRESENT");
		
		WebElement ls1tcisreservationrequiredforstaging27 = driver.findElement(parser.getObjectLocator("ls1tcisreservationrequiredforstaging27"));
		ls1tcisreservationrequiredforstaging27.isDisplayed();
		log.info("TC: IS RESERVATION REQUERED FOR STAGING FOR ELEVATOR? FILED IS PRESENT");
		
		WebElement ls1tcanyspecialinstructionsforbuildingoraccess28 = driver.findElement(parser.getObjectLocator("ls1tcanyspecialinstructionsforbuildingoraccess28"));
		ls1tcanyspecialinstructionsforbuildingoraccess28.isDisplayed();
		log.info("TC: ANY SPECIAL INSTRUCTIONS FOR BUIULDING OR ACCESS TEXTAREA FILED IS PRESENT");
		
		WebElement ls1tcaccesstabeditbutton29 = driver.findElement(parser.getObjectLocator("ls1tcaccesstabeditbutton29"));
		ls1tcaccesstabeditbutton29.isDisplayed();
		log.info("TC: ACCESS TAB EDIT BUTTON IS PRESENT");
		
		WebElement ls1tcaccesstabbackbutton30 = driver.findElement(parser.getObjectLocator("ls1tcaccesstabbackbutton30"));
		ls1tcaccesstabbackbutton30.isDisplayed();
		log.info("TC: ACCESS TAB BACK BUTTON IS PRESENT");
		
		WebElement ls1tcapprovecheckbox31 = driver.findElement(parser.getObjectLocator("ls1tcapprovecheckbox31"));
		ls1tcapprovecheckbox31.click();
		log.info("TC: ACCESS TAB CLICKED ON APPROVE CHECKBOX");
		Thread.sleep(1000);	
		
		WebElement ls1tcaccesstabnextbutton32 = driver.findElement(parser.getObjectLocator("ls1tcaccesstabnextbutton32"));
		ls1tcaccesstabnextbutton32.click();
		log.info("TC: ACCESS TAB CLICKED ON NEXT BUTTON");
		Thread.sleep(5000);		
		
		log.info("***** END TC: APPROVE LS1 WITH TC USER > 5 ACCESS TAB *****");
	}
	
	public void TC_Reject_LS1_6OpenhousesTab() throws InterruptedException {
		
		log.info("***** START TC: REJECT LS1 WITH TC USER > 6 OPEN HOUSES TAB *****");
		
		WebElement ls1tclistingavailableforohyesradio1 = driver.findElement(parser.getObjectLocator("ls1tclistingavailableforohyesradio1"));
		ls1tclistingavailableforohyesradio1.isDisplayed();
		log.info("TC: IS LISTING AVAILABLE FOR OEPN HOUSES YES RADIO BUTTON IS PRESENT");
		
		WebElement ls1tcdoesthislistingrequire2agents2 = driver.findElement(parser.getObjectLocator("ls1tcdoesthislistingrequire2agents2"));
		ls1tcdoesthislistingrequire2agents2.isDisplayed();
		log.info("TC: ACCESS TAB CLICKED ON NEXT BUTTON");
		
		WebElement ls1tcthursday1stslot3 = driver.findElement(parser.getObjectLocator("ls1tcthursday1stslot3"));
		ls1tcthursday1stslot3.isDisplayed();
		log.info("TC: Thursday 12pm - 2pm SLOT IS PRESENT");
		
		WebElement ls1tcsaturday1stslot4 = driver.findElement(parser.getObjectLocator("ls1tcsaturday1stslot4"));
		ls1tcsaturday1stslot4.isDisplayed();
		log.info("TC: Saturday 10am - 12pm SLOT IS PRESENT");
		
		WebElement ls1tcsaturday2ndslot5 = driver.findElement(parser.getObjectLocator("ls1tcsaturday2ndslot5"));
		ls1tcsaturday2ndslot5.isDisplayed();
		log.info("TC: Saturday 12pm - 2pm SLOT IS PRESENT");
		
		WebElement ls1tcsaturday3rdslot6 = driver.findElement(parser.getObjectLocator("ls1tcsaturday3rdslot6"));
		ls1tcsaturday3rdslot6.isDisplayed();
		log.info("TC: Saturday 2pm - 4pm SLOT IS PRESENT");
		
		WebElement ls1tcsunday1stslot7 = driver.findElement(parser.getObjectLocator("ls1tcsunday1stslot7"));
		ls1tcsunday1stslot7.isDisplayed();
		log.info("TC: Sunday 10am - 12pm SLOT IS PRESENT");
		
		WebElement ls1tcsunday2ndslot8 = driver.findElement(parser.getObjectLocator("ls1tcsunday2ndslot8"));
		ls1tcsunday2ndslot8.isDisplayed();
		log.info("TC: Sunday 12pm - 2pm SLOT IS PRESENT");
		
		WebElement ls1tcsunday3rdslot9 = driver.findElement(parser.getObjectLocator("ls1tcsunday3rdslot9"));
		ls1tcsunday3rdslot9.isDisplayed();
		log.info("TC: Sunday 2pm - 4pm SLOT IS PRESENT");
		
		WebElement ls1tcopenhouseseditbutton10 = driver.findElement(parser.getObjectLocator("ls1tcopenhouseseditbutton10"));
		ls1tcopenhouseseditbutton10.isDisplayed();
		log.info("TC: OPEN HOUSES TAB EDIT BUTTON IS PRESENT");
		
		WebElement ls1tcopenhousesbackbutton11 = driver.findElement(parser.getObjectLocator("ls1tcopenhousesbackbutton11"));
		ls1tcopenhousesbackbutton11.isDisplayed();
		log.info("TC: OPEN HOUSES TAB BACK BUTTON IS PRESENT");
		
//		WebElement ls1tcopenhousesapprovecheckbox12 = driver.findElement(parser.getObjectLocator("ls1tcopenhousesapprovecheckbox12"));
//		ls1tcopenhousesapprovecheckbox12.click();
//		log.info("TC: OPEN HOUSES TAB CLICKED ON APPROVE CHEKBOX");
//		Thread.sleep(1000);
		
		WebElement ls1tcopenhousesnextbutton13 = driver.findElement(parser.getObjectLocator("ls1tcopenhousesnextbutton13"));
		ls1tcopenhousesnextbutton13.click();
		log.info("TC: OPEN HOUSES TAB CLICKED ON NEXT TAB BUTTON");
		Thread.sleep(5000);		
		
		log.info("***** END TC: REJECT LS1 WITH TC USER > 6 OPEN HOUSES TAB *****");
	}
	
	public void TC_Reject_LS1_7SummaryTab() throws InterruptedException {
		
		log.info("***** START TC: REJECT LS1 WITH TC USER > 7 SUMMARY TAB *****");
		
		WebElement ls1tcsummarytabrejectbutton1 = driver.findElement(parser.getObjectLocator("ls1tcsummarytabrejectbutton1"));
		ls1tcsummarytabrejectbutton1.click();
		log.info("TC: SUMMARY TAB CLICKED ON REJECT BUTTON");
		Thread.sleep(1000);
		
		WebElement ls1tcsummarytabrejectconfirmationnobutton3 = driver.findElement(parser.getObjectLocator("ls1tcsummarytabrejectconfirmationnobutton3"));
		ls1tcsummarytabrejectconfirmationnobutton3.click();
		log.info("TC: SUMMARY TAB CLICKED ON NO BUTTON FOR REJECT CONFIRMATION WINDOW");
		Thread.sleep(1000);
		
		WebElement ls1tcsummarytabbackbutton2 = driver.findElement(parser.getObjectLocator("ls1tcsummarytabbackbutton2"));
		ls1tcsummarytabbackbutton2.click();
		log.info("TC: SUMMARY TAB CLICKED ON BACK BUTTON");
		Thread.sleep(5000);		
		
		log.info("***** END TC: REJECT LS1 WITH TC USER > 7 SUMMARY TAB *****");
	}
	
	public void TC_Approve_LS1_6OpenhousesTab() throws InterruptedException {
		
		log.info("***** START TC: APPROVE LS1 WITH TC USER > 6 OPEN HOUSES TAB *****");
		
		WebElement ls1tcopenhousesapprovecheckbox12 = driver.findElement(parser.getObjectLocator("ls1tcopenhousesapprovecheckbox12"));
		ls1tcopenhousesapprovecheckbox12.click();
		log.info("TC: OPEN HOUSES TAB CLICKED ON APPROVE CHEKBOX");
		Thread.sleep(1000);
		
		WebElement ls1tcopenhousesnextbutton13 = driver.findElement(parser.getObjectLocator("ls1tcopenhousesnextbutton13"));
		ls1tcopenhousesnextbutton13.click();
		log.info("TC: OPEN HOUSES TAB CLICKED ON NEXT TAB BUTTON");
		Thread.sleep(5000);		
		
		log.info("***** END TC: APPROVE LS1 WITH TC USER > 6 OPEN HOUSES TAB *****");
	}
	
	public void TC_Approve_LS1_7SummaryTab() throws InterruptedException {
		
		log.info("***** START TC: APPROVE LS1 WITH TC USER > 7 SUMMARY TAB *****");
		
		WebElement ls1tctotalcostofserviceis125dollars3 = driver.findElement(parser.getObjectLocator("ls1tctotalcostofserviceis125dollars3"));
		ls1tctotalcostofserviceis125dollars3.isDisplayed();
		log.info("TC: SUMMARY TAB Total Cost of Services = $125.00 TEXT IS PRESENT");
		
		WebElement ls1tcsummaryapprovebutton4 = driver.findElement(parser.getObjectLocator("ls1tcsummaryapprovebutton4"));
		ls1tcsummaryapprovebutton4.click();
		log.info("TC: SUMMARY TAB CLICKED ON APPROVE BUTTON");
		Thread.sleep(1000);
		
		WebElement ls1tcsummaryconfirmationnobutton5 = driver.findElement(parser.getObjectLocator("ls1tcsummaryconfirmationnobutton5"));
		ls1tcsummaryconfirmationnobutton5.click();
		log.info("TC: SUMMARY TAB CLICKED ON NO BUTTON FOR CONFIRMATION FOR APPROVAL");
		Thread.sleep(1000);
		
		ls1tcsummaryapprovebutton4.click();
		log.info("TC: SUMMARY TAB CLICKED ON APPROVE BUTTON");
		Thread.sleep(5000);		

		log.info("***** END TC: APPROVE LS1 WITH TC USER > 7 SUMMARY TAB *****");
	}
	
}