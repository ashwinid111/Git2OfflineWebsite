package com.jbk.test;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.jbk.utility.TestUtil;

public class TestBase {
	
	   public static  WebDriver driver;
	   public static Properties prop;
	   
	   public TestBase() {
		   try 
		   {
			   prop = new Properties();
			   FileInputStream fp = new FileInputStream("C:\\Users\\Rahul Waghmare\\eclipse-workspace\\OfflineWebsites\\src\\main\\resources\\config.properties");
			   prop.load(fp);   
		   }
		   catch (FileNotFoundException e) {
			   e.printStackTrace();
		   }
		   catch (IOException e) {
			   e.printStackTrace();
		   }   
	   }
	   
	   
	   public void initialization() {
		   String browserName= prop.getProperty("browser");
			 if(browserName.equalsIgnoreCase("chrome")){
				 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				 driver=new ChromeDriver();
			 }else if(browserName.equalsIgnoreCase("firefox")){
				 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				 driver=new ChromeDriver();
			 }
			 driver.manage().window().maximize();
			 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_WAIT, TimeUnit.SECONDS);
			 driver.get(prop.getProperty("url"));
			 driver.findElement(By.xpath("//a[text()]")).click();
			 
	    }
	    
	   public void loginInitialization() {
		   String browserName= prop.getProperty("browser");
			 if(browserName.equalsIgnoreCase("chrome")){
				 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				 driver=new ChromeDriver();
			 }else if(browserName.equalsIgnoreCase("firefox")){
				 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				 driver=new ChromeDriver();
			 }
			 driver.manage().window().maximize();
			 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_WAIT, TimeUnit.SECONDS);
			 driver.get(prop.getProperty("url"));
			 
	    }
	    

}
