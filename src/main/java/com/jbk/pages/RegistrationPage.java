package com.jbk.pages;

import java.io.FileInputStream;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.pages.objectRespository.RegistrationPageObjectRepository;

import jxl.Sheet;
import jxl.Workbook;

public class RegistrationPage extends RegistrationPageObjectRepository {
	
	
	   WebDriver driver;

	   public RegistrationPage(WebDriver driver) {
		   this.driver = driver;
		   PageFactory.initElements(driver, this);
	}
	   
	   public boolean verifyTitle() {
		   String actTitle = driver.getTitle();
		   System.out.println(actTitle);
		   String expTitle = "JavaByKiran | Registration Page";
		   if(actTitle.equals(expTitle))
		   {	   
			   System.out.println("Title is matched");
			   return true;			   
		   }
		   else
		   {
			   System.out.println("Title is not matched");
			   return false;		   
		   }
}
	   
	   
	   public boolean headerIdetification() {
		   String actHeaderName = header.getText();
		   String expHeaderName = "Register a new membership";
	       if(actHeaderName.equals(expHeaderName))
	       {
	    	   System.out.println("header name is matched");
	    	   return true;
	       }
	       else
	       {
	    	   System.out.println("header name is not matched");
	    	   return false;
	       }
	   }
	   
	   public boolean verifyLogoutMsg() {
		   String actMsg = logform.getText();
		   String expMsg = "I already have a membership";
		   if(actMsg.equals(expMsg))
	       {
	    	   System.out.println("header name is matched");
	    	   return true;
	       }
	       else
	       {
	    	   System.out.println("header name is not matched");
	    	   return false;
	       }
	   }
	   
	   public boolean checkNameErrorMsg() {
		      button.click();
			  String actErrorMsg = names.getText();
			  String expErrorMsg = "Please enter Name.";
			  if(actErrorMsg.equals(expErrorMsg))
		       {
		    	   System.out.println("Error msg is matched");
		    	   return true;
		       }
		       else
		       {
		    	   System.out.println("Error msg is not matched");
		    	   return false;
		       }
	   }
	   
	   public boolean InvalidEmailMsg() {
		   myemail.sendKeys("1234");
		   data.click();
		   String actErrorMsg = driver.findElement(By.id("email_error")).getText();
		   String expErrorMsg = "Please enter valid email.";
		   if(actErrorMsg.equals(expErrorMsg))
	       {
	    	   System.out.println("Error msg is matched");
	    	   return true;
	       }
	       else
	       {
	    	   System.out.println("Error msg is not matched");
	    	   return false;
	       }
	   }
	   
	   public boolean checkMoblieErrorMsg() {
		      data.click();
			  String actMobileMsg = setUp.getText();
			  String expMoblieMsg = "Please enter Mobile.";
			  if(actMobileMsg.equals(expMoblieMsg))
		       {
		    	   System.out.println("Error msg is matched");
		    	   return true;
		       }
		       else
		       {
		    	   System.out.println("Error msg is not matched");
		    	   return false;
		       }
	   }
	   
	   
	   public boolean checkPasswordErrorMsg() {
		      data.click();
			  String actPassError = reader.getText();
			  String expPassError = "Please enter Password.";
			  if(actPassError.equals(expPassError))
		       {
		    	   System.out.println("Error msg is matched");
		    	   return true;
		       }
		       else
		       {
		    	   System.out.println("Error msg is not matched");
		    	   return false;
		       }
	   }
	   
	   public boolean checkEmailErrorMsg() {
		      data.click();
			  String actEmailError = mymail.getText();
			  String expEmailError = "Please enter Email.";
			  if(actEmailError.equals(expEmailError))
		       {
		    	   System.out.println("Error msg is matched");
		    	   return true;
		       }
		       else
		       {
		    	   System.out.println("Error msg is not matched");
		    	   return false;
		       }
	   }
	   
	   public String readData(String sheet, int row,int col) throws Exception{   
		   FileInputStream fis = new FileInputStream("LoginData.xls");
		   Workbook wb = Workbook.getWorkbook(fis);
		   Sheet sh = wb.getSheet(sheet);
		   return sh.getCell(row, col).getContents();
		   			   
	   }
	
       public boolean registerUsingXls() throws Exception {   
	       myname.sendKeys(readData("ResisterData", 0, 0));
	       mymobile.sendKeys(readData("ResisterData", 1, 0));
	       myemail.sendKeys(readData("ResisterData", 2, 0));
	       mypass.sendKeys(readData("ResisterData", 3, 0));
	       data.click();
		   String actAlertText =  driver.switchTo().alert().getText();
		   System.out.println("Actual Alert msg = " +actAlertText);
		   driver.switchTo().alert().accept();
		   String expAlertText = "User registered successfully.";
		   if(actAlertText.equals(expAlertText))
	       {
	    	   System.out.println("Alert msg is matched");
	    	   return true;
	       }
	       else
	       {
	    	   System.out.println("Alert msg is not matched");
	    	   return false;
	       }
		  
}
}
