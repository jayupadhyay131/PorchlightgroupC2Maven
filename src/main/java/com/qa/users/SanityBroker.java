package com.qa.users;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;

public class SanityBroker extends TestBase{
	
	Logger log = Logger.getLogger(HomePage.class);
	
	/**
	 * METHOD 1: From home page, navigate to OpenHouses > Schedule page 
	 **/
	public void verifyBrokerDashboard() throws InterruptedException {
		
		log.info("***** START TC: VERIFY BROKER DASHBOARD WIDGETS *****");
		
		WebElement notification = driver.findElement(parser.getObjectLocator("notification"));
		notification.isDisplayed();
		log.info("BROKER DASHBOARD: NOTIFICATION WIDGET IS PRESENT");
		
		WebElement mycalendar = driver.findElement(parser.getObjectLocator("mycalendar"));
		mycalendar.isDisplayed();
		log.info("BROKER DASHBOARD: MY CALENDER WIDGET IS PRESENT");
		
		WebElement productionytd = driver.findElement(parser.getObjectLocator("productionytd"));
		productionytd.isDisplayed();
		log.info("BROKER DASHBOARD: PRODUCITION YTD WIDGET IS PRESENT");
		
		WebElement commingsoon = driver.findElement(parser.getObjectLocator("commingsoon"));
		commingsoon.isDisplayed();
		WebElement csaddress = driver.findElement(parser.getObjectLocator("csaddress"));
		csaddress.isDisplayed();
		WebElement csdigest = driver.findElement(parser.getObjectLocator("csdigest"));
		csdigest.isDisplayed();
		WebElement csprice = driver.findElement(parser.getObjectLocator("csprice"));
		csprice.isDisplayed();
		log.info("BROKER DASHBOARD: COMMING SOOM WIDGET IS PRESENT WITH COLLUMNS ADDRESS, DIGEST, PRICE IS PRESENT");
		
		WebElement mylistings = driver.findElement(parser.getObjectLocator("mylistings"));
		mylistings.isDisplayed();
		log.info("BROKER DASHBOARD: MY LISTINGS WIDGET IS PRESENT");
		
		WebElement preistingservices = driver.findElement(parser.getObjectLocator("preistingservices"));
		preistingservices.isDisplayed();
		log.info("BROKER DASHBOARD: PRE-LISTING SERVICES WIDGET IS PRESENT");
		
		WebElement plsandmoveouttoggle = driver.findElement(parser.getObjectLocator("plsandmoveouttoggle"));
		plsandmoveouttoggle.click();
		log.info("BROKER DASHBOARD: PRE-LISTING SERVICES WIDGET > CLICKED ON PLS - MOVE OUT TOGGLE");
		
		log.info("***** END TC: VERIFY BROKER DASHBOARD WIDGETS *****");
	}
	
	public void verifyBrokerListings_SubmitLS1() throws InterruptedException {
		
		log.info("***** START TC: VERIFY BROKER LS1 SUBMISSION PAGE *****");
		
		WebElement listings = driver.findElement(parser.getObjectLocator("listings"));
		listings.click();
		log.info("LEFT NAVBAR: CLICKED ON SCHEDULE");
		
		WebElement submitalisting = driver.findElement(parser.getObjectLocator("submitalisting"));
		submitalisting.click();
		log.info("LEFT NAVBAR: CLICKED ON SUBMIT A LISTING");
		Thread.sleep(3000);
		
		WebElement closels1formbutton = driver.findElement(parser.getObjectLocator("closels1formbutton"));
		closels1formbutton.click();
		log.info("LS1 FORM: CLICKED ON CLOSE FORM BUTTON");
		Thread.sleep(3000);

		log.info("***** END TC: VERIFY BROKER LS1 SUBMISSION PAGE *****");
	}
	
	public void verifyBrokerListings_SubmitBuyerUC() throws InterruptedException {
		
		log.info("***** START TC: VERIFY BROKER > LISTINGS > BUYER UC SUBMISSION PAGE *****");
		
		WebElement buyerundercontract = driver.findElement(parser.getObjectLocator("buyerundercontract"));
		buyerundercontract.click();
		log.info("LEFT NAVBAR: CLICKED ON BUYER UNDER CONTRACT");
		Thread.sleep(3000);
		
		WebElement closebucformbutton = driver.findElement(parser.getObjectLocator("closebucformbutton"));
		closebucformbutton.click();
		log.info("LS1 FORM: CLICKED ON CLOSE FORM BUTTON");
		Thread.sleep(3000);

		log.info("***** END TC: VERIFY BROKER > LISTINGS > BUYER UC SUBMISSION PAGE *****");
	}
	
	public void verifyBrokerListings_CommingSoonPage() throws InterruptedException {
		
		log.info("***** START TC: VERIFY BROKER > LISTINGS > COMMING SOON PAGE *****");
		
		WebElement comingsoon = driver.findElement(parser.getObjectLocator("comingsoon"));
		comingsoon.click();
		log.info("LEFT NAVBAR: CLICKED ON COMMING SOON");
		Thread.sleep(3000);
		
		WebElement commingsoonsearchbar = driver.findElement(parser.getObjectLocator("commingsoonsearchbar"));
		commingsoonsearchbar.isDisplayed();
		log.info("COMMING SOON PAGE: SEARCHBAR IS PRESENT");		
		
		WebElement commingsooncitycolumn = driver.findElement(parser.getObjectLocator("commingsooncitycolumn"));
		commingsooncitycolumn.isDisplayed();
		log.info("COMMING SOON PAGE: CITY COLLUMN IS PRESENT");	
		
		WebElement commingsoonaddresscolumn = driver.findElement(parser.getObjectLocator("commingsoonaddresscolumn"));
		commingsoonaddresscolumn.isDisplayed();
		log.info("COMMING SOON PAGE: ADDRESS COLLUMN IS PRESENT");
		
		WebElement commingsoonneighborhoodwithsort = driver.findElement(parser.getObjectLocator("commingsoonneighborhoodwithsort"));
		commingsoonneighborhoodwithsort.isDisplayed();
		log.info("COMMING SOON PAGE: NEIGHBORHOOD COLLUMN WITH SORT IS PRESENT");
		
		WebElement commingsoondigestcolumn = driver.findElement(parser.getObjectLocator("commingsoondigestcolumn"));
		commingsoondigestcolumn.isDisplayed();
		log.info("COMMING SOON PAGE: DIGEST COLLUMN IS PRESENT");
		
		WebElement commingsoonlistingagentwithsort = driver.findElement(parser.getObjectLocator("commingsoonlistingagentwithsort"));
		commingsoonlistingagentwithsort.isDisplayed();
		log.info("COMMING SOON PAGE: LISTING AGENT COLLUMN WITH SORT IS PRESENT");
		
		WebElement commingsoonpricewithsort = driver.findElement(parser.getObjectLocator("commingsoonpricewithsort"));
		commingsoonpricewithsort.isDisplayed();
		log.info("COMMING SOON PAGE: PRICE COLLUMN WITH SORT IS PRESENT");
		
		WebElement commingsoonmarketdatewithsort = driver.findElement(parser.getObjectLocator("commingsoonmarketdatewithsort"));
		commingsoonmarketdatewithsort.isDisplayed();
		log.info("COMMING SOON PAGE: MARKET DATE COLLUMN WITH SORT IS PRESENT");
		
		log.info("***** END TC: VERIFY BROKER > LISTINGS > COMMING SOON PAGE *****");
	}
	
	public void verifyBrokerListings_AllListingsPage() throws InterruptedException {
		
		log.info("***** START TC: VERIFY BROKER > LISTINGS > ALL LISTINGS PAGE *****");
		
		WebElement alllistings = driver.findElement(parser.getObjectLocator("alllistings"));
		alllistings.click();
		log.info("LEFT NAVBAR: CLICKED ON ALL LISTINGS");
		Thread.sleep(3000);
		
		WebElement alllistingssearchbar = driver.findElement(parser.getObjectLocator("alllistingssearchbar"));
		alllistingssearchbar.isDisplayed();
		log.info("ALL LISTINGS PAGE: SEARCHBAR IS PRESENT");
		
		WebElement alllistingscitycolumn = driver.findElement(parser.getObjectLocator("alllistingscitycolumn"));
		alllistingscitycolumn.isDisplayed();
		log.info("ALL LISTINGS PAGE: CITY COLLUMN IS PRESENT");
		
		WebElement alllistingsaddresscolumn = driver.findElement(parser.getObjectLocator("alllistingsaddresscolumn"));
		alllistingsaddresscolumn.isDisplayed();
		log.info("ALL LISTINGS PAGE: ADDRESS COLLUMN IS PRESENT");
		
		WebElement alllistingstcwithsortcolumn = driver.findElement(parser.getObjectLocator("alllistingstcwithsortcolumn"));
		alllistingstcwithsortcolumn.isDisplayed();
		log.info("ALL LISTINGS PAGE: TC COLLUMN WITH SORT IS PRESENT");
		
		WebElement alllistingslistingagentwithsortcolumn = driver.findElement(parser.getObjectLocator("alllistingslistingagentwithsortcolumn"));
		alllistingslistingagentwithsortcolumn.isDisplayed();
		log.info("ALL LISTINGS PAGE: LISTING AGENT COLLUMN WITH SORT IS PRESENT");
		
		WebElement alllistingsdigestcolumn = driver.findElement(parser.getObjectLocator("alllistingsdigestcolumn"));
		alllistingsdigestcolumn.isDisplayed();
		log.info("ALL LISTINGS PAGE: DIGEST COLLUMN IS PRESENT");

		WebElement alllistingsmarketdatewithsortcolumn = driver.findElement(parser.getObjectLocator("alllistingsmarketdatewithsortcolumn"));
		alllistingsmarketdatewithsortcolumn.isDisplayed();
		log.info("ALL LISTINGS PAGE: MARKET DATE COLLUMN WITH SORT IS PRESENT");
		
		WebElement alllistingsstatuswithsort = driver.findElement(parser.getObjectLocator("alllistingsstatuswithsort"));
		alllistingsstatuswithsort.isDisplayed();
		log.info("ALL LISTINGS PAGE: LISTING STATUS COLLUMN WITH SORT IS PRESENT");
		
		log.info("***** END TC: VERIFY BROKER > LISTINGS > ALL LISTINGS PAGE *****");
	}
	
	public void verifyBrokerListings_MyDealsPage() throws InterruptedException {
		
		log.info("***** START TC: VERIFY BROKER > LISTINGS > ARCHIVED LISTINGS PAGE *****");
		
		WebElement mydeals = driver.findElement(parser.getObjectLocator("mydeals"));
		mydeals.click();
		log.info("LEFT NAVBAR: CLICKED ON MY DEALS");
		Thread.sleep(3000);
		
		WebElement mydealssearchbar = driver.findElement(parser.getObjectLocator("mydealssearchbar"));
		mydealssearchbar.isDisplayed();
		log.info("MY DEALS PAGE: SEARCHBAR IS PRESENT");
		
		WebElement mydealsdealcolumn = driver.findElement(parser.getObjectLocator("mydealsdealcolumn"));
		mydealsdealcolumn.isDisplayed();
		log.info("MY DEALS PAGE: DEAL COLLUMN IS PRESENT");
		
		WebElement mydealsaddresscolumn = driver.findElement(parser.getObjectLocator("mydealsaddresscolumn"));
		mydealsaddresscolumn.isDisplayed();
		log.info("MY DEALS PAGE: ADDRESS COLLUMN IS PRESENT");
		
		WebElement mydealsneighborhoodwithsortcolumn = driver.findElement(parser.getObjectLocator("mydealsneighborhoodwithsortcolumn"));
		mydealsneighborhoodwithsortcolumn.isDisplayed();
		log.info("MY DEALS PAGE: NEIGHBORHOOD COLLUMN WITH SORT IS PRESENT");
		
		WebElement mydealspricewithsortcolumn = driver.findElement(parser.getObjectLocator("mydealspricewithsortcolumn"));
		mydealspricewithsortcolumn.isDisplayed();
		log.info("MY DEALS PAGE: PRICE COLLUMN WITH SORT IS PRESENT");
		
		WebElement mydealsdigestcolumn = driver.findElement(parser.getObjectLocator("mydealsdigestcolumn"));
		mydealsdigestcolumn.isDisplayed();
		log.info("MY DEALS PAGE: DIGEST COLLUMN IS PRESENT");
		
		WebElement mydealsmarketdatecolumn = driver.findElement(parser.getObjectLocator("mydealsmarketdatecolumn"));
		mydealsmarketdatecolumn.isDisplayed();
		log.info("MY DEALS PAGE: MARKET DATE COLLUMN WITH SORT IS PRESENT");
		
		WebElement mydealsstatuswithsort = driver.findElement(parser.getObjectLocator("mydealsstatuswithsort"));
		mydealsstatuswithsort.isDisplayed();
		log.info("MY DEALS PAGE: STATUS COLLUMN WITH SORT IS PRESENT");
		
		log.info("***** END TC: VERIFY BROKER > LISTINGS > MY DEALS PAGE *****");
	}
	
	public void verifyBrokerListings_ArchivedListingsPage() throws InterruptedException {
		
		log.info("***** START TC: VERIFY BROKER > LISTINGS > ARCHIVED LISTINGS PAGE *****");
		
		WebElement archivedlistings = driver.findElement(parser.getObjectLocator("archivedlistings"));
		archivedlistings.click();
		log.info("LEFT NAVBAR: CLICKED ON ARCHIVED LISTINGS");
		Thread.sleep(3000);
		
		WebElement archivedlistingsdealscolumn = driver.findElement(parser.getObjectLocator("archivedlistingsdealscolumn"));
		archivedlistingsdealscolumn.isDisplayed();
		log.info("ARCHIVED LISTINGS PAGE: DEALS COLLUMN IS PRESENT");
		
		WebElement archivedlistingsaddresscolumn = driver.findElement(parser.getObjectLocator("archivedlistingsaddresscolumn"));
		archivedlistingsaddresscolumn.isDisplayed();
		log.info("ARCHIVED LISTINGS PAGE: ADDRESS COLLUMN IS PRESENT");
		
		WebElement archivedlistingtcwithsortcolumn = driver.findElement(parser.getObjectLocator("archivedlistingtcwithsortcolumn"));
		archivedlistingtcwithsortcolumn.isDisplayed();
		log.info("ARCHIVED LISTINGS PAGE: TC COLLUMN WITH SORT IS PRESENT");
		
		WebElement archivedlistinglistingagentwithsortcolumn = driver.findElement(parser.getObjectLocator("archivedlistinglistingagentwithsortcolumn"));
		archivedlistinglistingagentwithsortcolumn.isDisplayed();
		log.info("ARCHIVED LISTINGS PAGE: LISTING AGENT COLLUMN WITH SORT IS PRESENT");

		WebElement archivedlistingpricewithsortcolumn = driver.findElement(parser.getObjectLocator("archivedlistingpricewithsortcolumn"));
		archivedlistingpricewithsortcolumn.isDisplayed();
		log.info("ARCHIVED LISTINGS PAGE: PRICE COLLUMN WITH SORT IS PRESENT");
		
		WebElement archivedlistingdigestcolumn = driver.findElement(parser.getObjectLocator("archivedlistingdigestcolumn"));
		archivedlistingdigestcolumn.isDisplayed();
		log.info("ARCHIVED LISTINGS PAGE: DIGEST COLLUMN IS PRESENT");
		
		WebElement archivedlistingmarketdatewithsortcolumn = driver.findElement(parser.getObjectLocator("archivedlistingmarketdatewithsortcolumn"));
		archivedlistingmarketdatewithsortcolumn.isDisplayed();
		log.info("ARCHIVED LISTINGS PAGE: MARKET DATE COLLUMN WITH SORT IS PRESENT");
		
		WebElement archivedlistingstatuswithsortcolumn = driver.findElement(parser.getObjectLocator("archivedlistingstatuswithsortcolumn"));
		archivedlistingstatuswithsortcolumn.isDisplayed();
		log.info("ARCHIVED LISTINGS PAGE: STATUS COLLUMN WITH SORT IS PRESENT");
		
		log.info("***** END TC: VERIFY BROKER > LISTINGS > ARCHIVED LISTINGS PAGE *****");
	}
	
	public void verifySchedulePage() throws InterruptedException {
		
		log.info("***** START TC: VERIFY BROKER > OPEN HOUSES > SCHEDULE PAGE *****");
		
		WebElement schedulesearchbar = driver.findElement(parser.getObjectLocator("schedulesearchbar"));
		schedulesearchbar.isDisplayed();
		log.info("SCHEDULE PAGE: SEARCH BAR IS PRESENT");
		
		WebElement schedulecitycolumm = driver.findElement(parser.getObjectLocator("schedulecitycolumm"));
		schedulecitycolumm.isDisplayed();
		log.info("SCHEDULE PAGE: SEARCH BAR IS PRESENT");
		
		WebElement scheduleaddresswithsortcolumn = driver.findElement(parser.getObjectLocator("scheduleaddresswithsortcolumn"));
		scheduleaddresswithsortcolumn.isDisplayed();
		log.info("SCHEDULE PAGE: ADDRESS COLUMN WITH SORT IS PRESENT");
		
		WebElement scheduleneighborhoodcolumn = driver.findElement(parser.getObjectLocator("scheduleneighborhoodcolumn"));
		scheduleneighborhoodcolumn.isDisplayed();
		log.info("SCHEDULE PAGE: NEIGHBORHOOD COLUMN IS PRESENT");
		
		WebElement scheduledigestcolumn = driver.findElement(parser.getObjectLocator("scheduledigestcolumn"));
		scheduledigestcolumn.isDisplayed();
		log.info("SCHEDULE PAGE: DIGEST COLUMN IS PRESENT");
		
		WebElement schedulemarketdatewithsortcolumn = driver.findElement(parser.getObjectLocator("schedulemarketdatewithsortcolumn"));
		schedulemarketdatewithsortcolumn.isDisplayed();
		log.info("SCHEDULE PAGE: MARKET DATE COLUMN WITH SORT IS PRESENT");
		
		WebElement schedulepricewithsortcolumn = driver.findElement(parser.getObjectLocator("schedulepricewithsortcolumn"));
		schedulepricewithsortcolumn.isDisplayed();
		log.info("SCHEDULE PAGE: MARKET DATE COLUMN WITH SORT IS PRESENT");
		
		WebElement schedulevacancycolumn = driver.findElement(parser.getObjectLocator("schedulevacancycolumn"));
		schedulevacancycolumn.isDisplayed();
		log.info("SCHEDULE PAGE: MARKET DATE COLUMN WITH SORT IS PRESENT");
		
		WebElement scheduletimeslotscolumn = driver.findElement(parser.getObjectLocator("scheduletimeslotscolumn"));
		scheduletimeslotscolumn.isDisplayed();
		log.info("SCHEDULE PAGE: TIME SLOTS COLUMN WITH SORT IS PRESENT");
		
		log.info("***** END TC: VERIFY BROKER > OPEN HOUSES > SCHEDULE PAGE *****");
	}

	public void verifyPendingFeedbackPage() throws InterruptedException {
		
		log.info("***** START TC: VERIFY BROKER > OPEN HOUSES > PENDING FEEDBACK PAGE *****");
		
		WebElement pendingfeedback = driver.findElement(parser.getObjectLocator("pendingfeedback"));
		pendingfeedback.click();
		log.info("LEFT NAVBAR: CLICKED ON PENDING FEEDBACK");
		Thread.sleep(3000);
		
//		WebElement pendingfeedbacksignedcolumn = driver.findElement(parser.getObjectLocator("pendingfeedbacksignedcolumn"));
//		pendingfeedbacksignedcolumn.isDisplayed();
//		log.info("PENDING FEEDBACK PAGE: SIGNED COLUMN IS PRESENT");
//		
//		WebElement pendingfeedbackaddresscolumn = driver.findElement(parser.getObjectLocator("pendingfeedbackaddresscolumn"));
//		pendingfeedbackaddresscolumn.isDisplayed();
//		log.info("PENDING FEEDBACK PAGE: ADDRESS COLUMN IS PRESENT");
//		
//		WebElement pendingfeedbacklistingagentcolumn = driver.findElement(parser.getObjectLocator("pendingfeedbacklistingagentcolumn"));
//		pendingfeedbacklistingagentcolumn.isDisplayed();
//		log.info("PENDING FEEDBACK PAGE: LISTING AGENT COLUMN IS PRESENT");
//		
//		WebElement pendingfeedbackneighborhoodcolumn = driver.findElement(parser.getObjectLocator("pendingfeedbackneighborhoodcolumn"));
//		pendingfeedbackneighborhoodcolumn.isDisplayed();
//		log.info("PENDING FEEDBACK PAGE: NEIGHBORHOOD COLUMN IS PRESENT");
//		
//		WebElement pendingfeedbackshowingcolumn = driver.findElement(parser.getObjectLocator("pendingfeedbackshowingcolumn"));
//		pendingfeedbackshowingcolumn.isDisplayed();
//		log.info("PENDING FEEDBACK PAGE: SHOWING COLUMN IS PRESENT");
//		
//		WebElement pendingfeedbacksubmitfeedbackcolumn = driver.findElement(parser.getObjectLocator("pendingfeedbacksubmitfeedbackcolumn"));
//		pendingfeedbacksubmitfeedbackcolumn.isDisplayed();
//		log.info("PENDING FEEDBACK PAGE: SUBMIT FEEDBACK COLUMN IS PRESENT");
		
		log.info("***** END TC: VERIFY BROKER > OPEN HOUSES > PENDING FEEDBACK PAGE *****");
	}
	
	public void verifyMyFeedbackPage() throws InterruptedException {
		
		log.info("***** START TC: VERIFY BROKER > OPEN HOUSES > MY FEEDBACK PAGE *****");
		
		WebElement myfeedback = driver.findElement(parser.getObjectLocator("myfeedback"));
		myfeedback.click();
		log.info("LEFT NAVBAR: CLICKED ON MY FEEDBACK");
		Thread.sleep(3000);
		
//		WebElement myfeedbacklistingaddresscolumn = driver.findElement(parser.getObjectLocator("myfeedbacklistingaddresscolumn"));
//		myfeedbacklistingaddresscolumn.isDisplayed();
//		log.info("MY FEEDBACK PAGE: LISTING ADDRESS COLUMN IS PRESENT");
//		
//		WebElement myfeedbacklistedcolumn = driver.findElement(parser.getObjectLocator("myfeedbacklistedcolumn"));
//		myfeedbacklistedcolumn.isDisplayed();
//		log.info("MY FEEDBACK PAGE: LISTED DATE COLUMN IS PRESENT");
//		
//		WebElement myfeedbackclientemailaddresscolumn = driver.findElement(parser.getObjectLocator("myfeedbackclientemailaddresscolumn"));
//		myfeedbackclientemailaddresscolumn.isDisplayed();
//		log.info("MY FEEDBACK PAGE: CLIENT EMAIL ADDRESS COLUMN IS PRESENT");
//		
//		WebElement myfeedbackfeedbackreceivedcolumn = driver.findElement(parser.getObjectLocator("myfeedbackfeedbackreceivedcolumn"));
//		myfeedbackfeedbackreceivedcolumn.isDisplayed();
//		log.info("MY FEEDBACK PAGE: FEEDBACK RECEIVED COLUMN IS PRESENT");
//		
//		WebElement myfeedbacksharedcolumn = driver.findElement(parser.getObjectLocator("myfeedbacksharedcolumn"));
//		myfeedbacksharedcolumn.isDisplayed();
//		log.info("MY FEEDBACK PAGE: SHARED COLUMN IS PRESENT");
//		
//		WebElement myfeedbacksharecolumn = driver.findElement(parser.getObjectLocator("myfeedbacksharecolumn"));
//		myfeedbacksharecolumn.isDisplayed();
//		log.info("MY FEEDBACK PAGE: SHARE COLUMN IS PRESENT");

		log.info("***** END TC: VERIFY BROKER > OPEN HOUSES > MY FEEDBACK PAGE *****");
	}
	
	public void verifyMyReportADRPage() throws InterruptedException {
		
		log.info("***** START TC: VERIFY BROKER > REPORTS > MY REPORT (ADR) PAGE *****");
		
		WebElement myreportsproductionytdwidget = driver.findElement(parser.getObjectLocator("myreportsproductionytdwidget"));
		myreportsproductionytdwidget.isDisplayed();
		log.info("MY REPORTS (ADR) PAGE: PRODUCTION YTD WIDGET IS PRESENT");
		
		WebElement myreportstiertilewidget = driver.findElement(parser.getObjectLocator("myreportstiertilewidget"));
		myreportstiertilewidget.isDisplayed();
		log.info("MY REPORTS (ADR) PAGE: TIER TILE WIDGET IS PRESENT");
		
		WebElement myreportsearningsytdwidget = driver.findElement(parser.getObjectLocator("myreportsearningsytdwidget"));
		myreportsearningsytdwidget.isDisplayed();
		log.info("MY REPORTS (ADR) PAGE: EARNINGS YTD WIDGET IS PRESENT");
		
		WebElement myreportsalesvitalwidget = driver.findElement(parser.getObjectLocator("myreportsalesvitalwidget"));
		myreportsalesvitalwidget.isDisplayed();
		log.info("MY REPORTS (ADR) PAGE: SALES VITALS WIDGET IS PRESENT");
		
		WebElement myreportsltmytdtogglebutton = driver.findElement(parser.getObjectLocator("myreportsalesvitalwidget"));
		myreportsltmytdtogglebutton.click();
		log.info("MY REPORTS (ADR) PAGE: CLICKED ON SALES VITALS WIDGET > LTM - YTD TOGGLE BUTTON");
		
		WebElement myreports2yearproductionwidget = driver.findElement(parser.getObjectLocator("myreports2yearproductionwidget"));
		myreports2yearproductionwidget.isDisplayed();
		log.info("MY REPORTS (ADR) PAGE: 2 YEAR PRODUCTION WIDGET IS PRESENT");
		
		WebElement myreportssellerbuyerproductionwidget = driver.findElement(parser.getObjectLocator("myreportssellerbuyerproductionwidget"));
		myreportssellerbuyerproductionwidget.isDisplayed();
		log.info("MY REPORTS (ADR) PAGE: 2 YEAR PRODUCTION WIDGET IS PRESENT");
		
		WebElement myreportsproductiontrakckerltmwidget = driver.findElement(parser.getObjectLocator("myreportsproductiontrakckerltmwidget"));
		myreportsproductiontrakckerltmwidget.isDisplayed();
		log.info("MY REPORTS (ADR) PAGE: PRODUCTION TRACKER LTM WIDGET IS PRESENT");
		
		WebElement myreportsproductionvsgoalwidget = driver.findElement(parser.getObjectLocator("myreportsproductionvsgoalwidget"));
		myreportsproductionvsgoalwidget.isDisplayed();
		log.info("MY REPORTS (ADR) PAGE: PRODUCTIONS VS GOAL WIDGET IS PRESENT");

		log.info("***** END TC: VERIFY BROKER > REPORTS > MY REPORT (ADR) PAGE *****");
	}
	
}
