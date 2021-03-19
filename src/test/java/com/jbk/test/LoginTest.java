package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPage;

public class LoginTest extends TestBase{
	
	  // WebDriver driver;
	   LoginPage login;
	
	   public LoginTest(){
			super();
		}
		
	@BeforeMethod
	   public void setUp() {
		loginInitialization();		  
		login = new LoginPage(driver);
	   }
	
	   public void tearDown() {
		   driver.close();
	   }
	   
	   @Test
	   public void validTitleVerify() {
		   Assert.assertTrue(login.titleIdetify());
	   }
	   
	   @Test
	   public void validHeaderVerify() {
		   Assert.assertTrue(login.checkSubHerder());
	   }
	   
	   @Test
	   public void validCoursesVerify() {
		   Assert.assertTrue(login.verifyCourses());
	   }
	   
	   @Test
	   public void validResistration() {
		   Assert.assertTrue(login.checkResisTration());
	   }
	   
	   
	   
	
	    

}
