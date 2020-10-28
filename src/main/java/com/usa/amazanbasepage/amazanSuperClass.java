package com.usa.amazanbasepage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazanSuperClass {
	public static Logger logger;
	public static Properties prop;
	public static WebDriver driver;
	
	public amazanSuperClass() {
		logger= logger.getLogger("QA akher");
		PropertyConfigurator.configure("log4j.properties");
		
		
	}
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		

		
	}
	public static void teardown() {
		driver.quit();
	}
	

}
