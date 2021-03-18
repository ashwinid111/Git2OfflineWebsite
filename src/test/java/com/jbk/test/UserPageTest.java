package com.jbk.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.jbk.pages.UserPage;
import com.jbk.utility.ExtentReport1;


public class UserPageTest extends ExtentReport1{
	WebDriver driver;
	 UserPage user;

	@BeforeTest
	public void openBrowser()
	{
     	System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();
		user=new UserPage(driver);
		driver.manage().window().maximize();
		driver.get("file:///C:/Offline%20Website/Offline%20Website/pages/examples/users.html");
	}

	@Test(priority =1)
	public void validateCheakTitle()
	{
		 test=extent.createTest("validateCheakTitle");
		Assert.assertTrue(user.cheakTitle());
	}

	@Test(priority =2)
	public void validateCheakNoList()
	{
		test=extent.createTest("validateCheakNoList");
		Assert.assertTrue(user.cheakNoList());
	}

	@Test(priority =3)
	public void validateSrNo()
	{
		test=extent.createTest("validateSrNo");
		Assert.assertTrue(user.srNo());
	}

	@Test(priority =4)
	public void validateUserNameList()
	{
		test=extent.createTest("validateUserNameList");
		Assert.assertTrue(user.userNameList());
	}

	@Test(priority =5)
	public void validateEmailList()
	{
		test=extent.createTest("validateEmailList");
		Assert.assertTrue(user.emailList());
	}

	@Test(priority =6)
	public void validateMobileNList()
	{
		test=extent.createTest("validateMobileNList");
		Assert.assertTrue(user.mobileNList());
	}


	@Test(priority =7)
	public void validateCourseList()
	{
		test=extent.createTest("validateCourseList");
		Assert.assertTrue(user.courseList());
	}



	@Test(priority =8)
	public void validateGenderList()
	{
		test=extent.createTest("validateGenderList");
		Assert.assertTrue(user.genderList());
	}



	@Test(priority =9)
	public void validateStateList()
	{
		test=extent.createTest("validateStateList");
		Assert.assertTrue(user.stateList());
	}



	@Test(priority =10)
	public void validateActionDeleteList()
	{
		test=extent.createTest("validateActionDeleteList");
		Assert.assertTrue(user.actionDeleteList());
	}



	@Test(priority =11)
	public void validateFirstDeleteAlert() throws Exception
	{
		user.firstDeleteAlert();
	}



	@Test(priority =12)
	public void validateSecondDeleteAlert() throws Exception
	{
		user.secondDeleteAlert();
	}


	@Test(priority =13)
	public void validateWindowHandle() throws Exception
	{
		user.windowHandle();
	}

}
