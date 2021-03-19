package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.UsefulLinksPage;

//import com.jbk.page.UsefulLinksPage;

public class UsefulLinksTest extends LogTestBase {
	
	WebDriver driver;
	UsefulLinksPage up;
	//Logger log= Logger.getLogger(UsefulLinksTest.class);
	@BeforeMethod
	public void openBrowser(){
	testLog().info("initialising browser");	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
		driver = new ChromeDriver();// browser open
		testLog().info("1");		
		//driver.manage().window().maximize();	
		driver.get("file:///C:/Users/Jadhav%20yogesh/Desktop/selenium/Offline%20Website/Offline%20Website/pages/examples/links.html");
	up=new UsefulLinksPage(driver);
	}
	@AfterMethod
	public void closeBrowser(){
		driver.close();
		testLog().info("2");		
	}
	@Test (priority=1)
	public void validateHeading1(){
		testLog().info("3");	;	
		Assert.assertTrue(up.verifyHeading1());
	}
	@Test (priority=2)
	public void validateMsg(){
		Assert.assertTrue(up.verifyMsg());
	}
	
	@Test (priority=3)
	public void validateTableVisibility(){
		Assert.assertTrue(up.tableVisibility());
		
	}
	@Test (priority=4)
	public void validateTableHeader() throws Exception{
		Assert.assertTrue(up.verifyTableHeader());
	}
	
	@Test (priority=5)
	public void validateHeaderCount(){
		Assert.assertTrue(up.countHeader());
	}
	@Test (priority=6)
	public void validateRowsCount(){
		Assert.assertTrue(up.countRows());
	}
	@Test (priority=7)
	public void verifyCountButton(){
		Assert.assertTrue(up.countButton());
	}
	@Test (priority=8)
	public void verifySortingOfContents(){
		Assert.assertTrue(up.sortingOfContents());
	}
	@Test (priority=9)
	public void verifyReverseOfContents(){
		Assert.assertTrue(up.reverseOfContents());
	}
	
	@Test (priority=10)
	public void verifySrNoOfCourses(){
		Assert.assertTrue(up.srNoOfCourses());
	}
	@Test (priority=11)
	public void verifyQuestionsSrNo(){
		Assert.assertTrue(up.srNoOfQuestions());
	}
	@Test (priority=12)
	public void verifyWithoutCourses(){
		Assert.assertTrue(up.validatesWithoutCourses());
	}
	@Test (priority=13)
	public void clickOnAllLinks(){
		Assert.assertTrue(up.windowHandler());
	}
	
}
