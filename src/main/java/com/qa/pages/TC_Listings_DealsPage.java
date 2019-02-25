package com.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class TC_Listings_DealsPage extends TestBase{

	Logger log = Logger.getLogger(LoginPage.class);
	
	public void TC_TakeLs1Task_From_Dashboard() throws InterruptedException {
		
		log.info("***** START TC: APPROVE LS1 WITH TC USER > 1 AGREEMENT SECTION *****");
		
		WebElement ls1mytaskswidgettaketaskbutton1 = driver.findElement(parser.getObjectLocator("ls1mytaskswidgettaketaskbutton1"));
		ls1mytaskswidgettaketaskbutton1.click();
		log.info("TC: DASHBOARD > MY TASKS WIDGET > CLICKED ON TAKE TASK BUTTON");
		Thread.sleep(1000);
		
		WebElement ls1mytaskswidgetokbuttonfortaketask2 = driver.findElement(parser.getObjectLocator("ls1mytaskswidgetokbuttonfortaketask2"));
		ls1mytaskswidgetokbuttonfortaketask2.click();
		log.info("TC: DASHBOARD > MY TASKS WIDGET > CLICKED ON OK BUTTON");
		Thread.sleep(5000);
		
		log.info("***** END TC: APPROVE LS1 WITH TC USER > 1 AGREEMENT SECTION *****");
	}
	
	public void TC_Approve_LS1_1AgreementTab() throws InterruptedException {
		
		log.info("***** START TC: APPROVE LS1 WITH TC USER > 1 AGREEMENT SECTION *****");
		
		WebElement ls1mytaskswidgettaketaskbutton1 = driver.findElement(parser.getObjectLocator("ls1mytaskswidgettaketaskbutton1"));
		ls1mytaskswidgettaketaskbutton1.click();
		log.info("TC: DASHBOARD > MY TASKS WIDGET > CLICKED ON TAKE TASK BUTTON");
		Thread.sleep(1000);
		
		WebElement ls1mytaskswidgetokbuttonfortaketask2 = driver.findElement(parser.getObjectLocator("ls1mytaskswidgetokbuttonfortaketask2"));
		ls1mytaskswidgetokbuttonfortaketask2.click();
		log.info("TC: DASHBOARD > MY TASKS WIDGET > CLICKED ON OK BUTTON");
		Thread.sleep(5000);
		
		log.info("***** END TC: APPROVE LS1 WITH TC USER > 1 AGREEMENT SECTION *****");
	}
	
	//TC_Approve_LS1_1AgreementTab()
	
}