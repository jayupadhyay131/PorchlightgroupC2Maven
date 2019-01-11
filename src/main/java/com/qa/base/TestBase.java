package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.qa.util.RepositoryParser;
import com.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties property;
	public RepositoryParser parser;
	Logger log = Logger.getLogger(TestBase.class);
		 
	public TestBase() {
		try {
			// load data from
			property = new Properties();
			FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\config\\config1.properties");
			property.load(inputStream);
			log.info("GETTING WEBSITE URL, USERNAME, PASSWORD, AND BROWSER INFO FROM CONFIG1.PROPERTIES");
			
			// load data for Selenium Object Repositoty
			parser = new RepositoryParser(System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\config\\config2.properties");
			log.info("GETTING SELENIUM OBJECTS FROM CONFIG2.PROPERTIES");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void startBrowser() {
		
		String browserName = property.getProperty("browser");
		
		if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			log.info("LAUNCHING FIREFOX BROWSER");
			
		}
		else if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			log.info("LAUNCHING CHROME BROWSER");
		}
		else if(browserName.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			log.info("LAUNCHING IE BROWSER");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(property.getProperty("url"));
	}
}
