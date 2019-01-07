package com.qa.util;

public class RunOnServer {

	final static String DEVELOPMENT = "http://porchlightdev.getventive.com";
	final static String STAGING = "http://porchlightgroup.getventive.com";
	final static String PRODUCTION = "http://connect2.porchlightgroup.com";
	
	public static String DEV(){
		System.out.println("RUNNING ON DEV SERVER");
		return	DEVELOPMENT;
	}
	
	public String STAGE(){
		System.out.println("RUNNING ON STAGING SERVER");
		return	STAGING;
	}
	
	public String PROD(){	
		System.out.println("RUNNIN ON PRODUCTION SERVER");
		return	PRODUCTION;
	}
}