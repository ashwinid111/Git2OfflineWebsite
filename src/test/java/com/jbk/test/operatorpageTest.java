package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jbk.pages.OperatorPage;

public class operatorpageTest {
	WebDriver driver;
	OperatorPage op;
	
	@BeforeTest
	public void OperatorTest() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akshay/Downloads/software/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/operators.html");
		driver.manage().window().maximize();
		op = new OperatorPage(driver);
	}
	
	@Test(priority = 1)
	public void validTitleTest() {
		Assert.assertTrue(op.checkTitle());
	}
	@Test(priority = 2)
	public void validHeaderTest() {
		Assert.assertTrue(op.checkOperatorHeader());
	}
	@Test(priority = 3)
	public void validIdsTest() {
		Assert.assertTrue(op.CheckOperatorsIds());
	}
	@Test(priority = 4)
	public void validPersons() {
		Assert.assertTrue(op.checkTotalPersons());
	}
	@Test(priority=5)
    public void validworks() {
    	Assert.assertTrue(op.getTotalworksfor());
	}
	@Test(priority = 6)
	public void validConnections() {
		Assert.assertTrue(op.checkPrefarableWayToConnection());
	}
	@Test(priority=7)
	public void validContacts() {
		Assert.assertTrue(op.checkContacts());
	}
	@Test(priority=8)
    public void validTiming() {
		Assert.assertTrue(op.checkTimings());
	}
	@Test(priority=9)
	public void validNOTE1() {
		op.getNOTE1();
	}
	@Test(priority=10)
	public void validNOTE2() {
		op.getNOTE2();
	}
	@Test(priority=11)
	public void validElement1() {
		op.OperatorElement1();
	}
	@Test(priority=12)
	public void validElement2() {
		op.UserElement2();
	}
	@Test(priority=13)
	public void validElement3() {
		op.DashboardElement3();
	}
	@Test(priority=14)
	public void validElement4() {
		op.UsefullinksElement4();
	}
	@Test(priority=15)
	public void validExcel() throws Exception {
		op.Read();
	}

}