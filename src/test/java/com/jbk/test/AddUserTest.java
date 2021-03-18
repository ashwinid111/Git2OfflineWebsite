package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jbk.pages.AddUser;
import com.jbk.utility.ExtentReport1;


public class AddUserTest extends ExtentReport1 {
	
	AddUser addUserPage;
	 WebDriver driver;
  
	@BeforeMethod
	public void openBrowser() {
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver();
			addUserPage =new AddUser(driver);
			driver.manage().window().maximize();
			driver.get("file:///C:/Offline%20Website/Offline%20Website/pages/examples/add_user.html");
			
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();	
	}
	
  @Test(priority = 1,dataProvider = "addUserData")
  public void validedAddUserByExcelAndDataProvider(String username, String  mobile, String email,String courses, String gender, String states, String password) {
	  test=extent.createTest("valided AddUser By ExcelAndDataProvide");
	  Assert.assertTrue(addUserPage.addUser(username, mobile, email, courses, gender, states, password));
}
  
  @Test(priority = 2,dataProvider = "addUserData2")
  public void validatingAddUserByDataProvider(String username, String  mobile, String email,String courses, String gender, String states, String password) {
	  test=extent.createTest("validating AddUser By DataProvider");
	  Assert.assertTrue(addUserPage.addUser(username, mobile, email, courses, gender, states, password));
	}
   
  @Test(priority = 3)
  public void validatingAddUserDataByExcel() throws Exception {
		test=extent.createTest("validating AddUser Data By Excel");
		Assert.assertTrue(addUserPage.addUser());
	}
   
   @Test(priority = 4)
   public void validatingUserPage() {
  	 addUserPage.openUserPage();
  	test=extent.createTest("validating UserPage");
		Assert.assertTrue(addUserPage.userPage());
	}
   
   @Test(priority = 6)
   public void validatingAddUsersBoxTitle() {
		test=extent.createTest("validating AddUsers BoxTitle");
		Assert.assertTrue(addUserPage.addUserBoxTitle());
	}
   
   @Test(priority = 7)
   public void validatigAlertMsg() {
  	 addUserPage.openUserPage();
 	test=extent.createTest("validating AlertMsg");
		Assert.assertTrue(addUserPage.AddUserAlert());
	}
   
   @Test(priority = 8)
   public void validatigNavigationTitle() {
  	 addUserPage.openUserPage();
  	test=extent.createTest("validatigNavigationTitle");
		Assert.assertTrue(addUserPage.navigationsTitle());
	}
   
  @DataProvider
	 public Object[][] addUserData() throws Exception {
  	addUserPage =new AddUser(driver);
		return addUserPage.readExcel();
	} 
  
  @DataProvider
	 public Object[][] addUserData2() throws Exception {
 	    //addUserPage =new AddUserPage(driver);
		return addUserPage.readDataProvider();
	} 

}
