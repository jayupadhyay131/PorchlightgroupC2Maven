package com.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.util.ExcelFileImporter;

public class ExcelDataLoginTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openBroser(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	// Get data from Excel file and store data into 2D array
	@DataProvider
	public Object[][] getLoginData() {
		Object data[][] = ExcelFileImporter.getTestData("credentials");
		return data;
	}
	
	@Test(dataProvider = "getLoginData")
	public void loginTest(String username, String password){
		System.out.println("LOGIN TEST FOR USERNAME: " + username + " AND PASSWORD: " + password);
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}
	
}
