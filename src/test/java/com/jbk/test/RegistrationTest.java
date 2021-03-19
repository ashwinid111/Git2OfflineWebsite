package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.RegistrationPage;

public class RegistrationTest extends TestBase{
	
	  // WebDriver driver;
	   RegistrationPage resister;
	   
		public RegistrationTest(){
			super();
		}
		

	   
	   @BeforeMethod
	   public void setUp() {
		    initialization();
		    resister = new RegistrationPage(driver);
	   }
	   
	   public void tearDown() {
		   driver.close();
	   }
	   
	   
	   @Test
	   public void showTitle() {
		   Assert.assertTrue(resister.verifyTitle());
	   }
	   
	   @Test
	   public void showHeaderNmae() {
		   Assert.assertTrue(resister.headerIdetification());
	   }
	   
	   @Test
	   public void showLogoutMsg() {
		   Assert.assertTrue(resister.verifyLogoutMsg());
	   }
	   
	   @Test
	   public void showErrorMsg() {
		   Assert.assertTrue(resister.checkNameErrorMsg());
	   }
	   
	   @Test
	   public void showEmailError() {
		   Assert.assertTrue(resister.InvalidEmailMsg());
	   }
	   
	   @Test
	   public void showMobileError() {
		   Assert.assertTrue(resister.checkMoblieErrorMsg());
	   }
	   
	   @Test
	   public void showPassError() {
		   Assert.assertTrue(resister.checkPasswordErrorMsg());
	   }
	   
	   @Test
	   public void showEmailMsg() {
		   Assert.assertTrue(resister.checkEmailErrorMsg());
	   }
	   
	   @Test
	   public void showResistrationJxl() throws Exception {
		   Assert.assertTrue(resister.registerUsingXls());
	   }
	   
	   

	   
}
