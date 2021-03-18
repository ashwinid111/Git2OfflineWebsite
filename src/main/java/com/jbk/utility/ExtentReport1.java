package com.jbk.utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport1 {
	public WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	public ExtentTest test1;
	public ExtentTest node;
	
	@BeforeTest
	public void startReport() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/OperatorPageExtentReport.html");
        	// Create an object of Extent Reports
		extent = new ExtentReports();  
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "jbk");
		//extent.createTest("OperatorsPage").createNode("First").pass("details");		
        extent.setSystemInfo("Environment", "Production");
		extent.setSystemInfo("User Name", "JavaByKiran");
		htmlReporter.config().setDocumentTitle("Title of the Report Comes here "); 
                // Name of the report
		htmlReporter.config().setReportName("Name of the Report Comes here "); 
                // Dark Theme
		htmlReporter.config().setTheme(Theme.STANDARD);			
	}
		
		
	
	@AfterTest
	public void endReport() {
		extent.flush();
	}
	
}
