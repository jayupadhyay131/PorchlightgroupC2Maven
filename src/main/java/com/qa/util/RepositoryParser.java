package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class RepositoryParser {

		private FileInputStream stream;
		private String RepositoryFile;
		private Properties propertyfile = new Properties();
		
		public RepositoryParser(String fileName) throws IOException{
			
			this.RepositoryFile = fileName;
			stream = new FileInputStream(RepositoryFile);
			propertyfile.load(stream);
		}
		
		public By getObjectLocator(String locatorName){
			
			String locatorProperties = propertyfile.getProperty(locatorName);
			//System.out.println(locatorName.toString());
			String LocatorType = locatorProperties.substring(0,locatorProperties.indexOf("="));
			String LocatorValue = locatorProperties.substring(locatorProperties.indexOf("=")+1,locatorProperties.length());
			
			By locator = null;
			
			if(LocatorType.equalsIgnoreCase("id"))
			{
				locator = By.id(LocatorValue);
			}
			else if(LocatorType.equalsIgnoreCase("name"))
			{
				locator = By.name(LocatorValue);
			}
			else if(LocatorType.equalsIgnoreCase("xpath"))
			{
				locator = By.xpath(LocatorValue);
			}
			else if(LocatorType.equalsIgnoreCase("tagname"))
			{
				locator = By.tagName(LocatorValue);
			}
			else if(LocatorType.equalsIgnoreCase("linktext"))
			{
				locator = By.linkText(LocatorValue);
			}
			else if(LocatorType.equalsIgnoreCase("partiallinktext"))
			{
				locator = By.partialLinkText(LocatorValue);
			}
			else if(LocatorType.equalsIgnoreCase("cssselector"))
			{
				locator = By.cssSelector(LocatorValue);
			}
			else if(LocatorType.equalsIgnoreCase("classname"))
			{
				locator = By.className(LocatorValue);
			}
						
			return locator;
		}
		
		public String getObjectLocatorValue (String locatorName){
			
			String locatorProperties = propertyfile.getProperty(locatorName);
			String LocatorValue = locatorProperties.split(":")[1];
			
			return LocatorValue;
			
		}
}
