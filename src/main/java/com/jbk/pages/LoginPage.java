package com.jbk.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.jbk.pages.objectRespository.loginPageObjectRepository1;


public class LoginPage extends loginPageObjectRepository1{
	   
	   WebDriver driver;
	   
	   public LoginPage(WebDriver driver) {
	   		this.driver = driver;
	   	    PageFactory.initElements(driver, this);
	   	}
	   
	   public boolean  titleIdetify(){
		   String acttitleName = driver.getTitle();
		   System.out.println("Actual title = " +acttitleName);
		   String exptitleName = "JavaByKiran | Useful Links";
		   if(acttitleName.equals(exptitleName))
		   {
			   System.out.println("Titile is matched");
			   return true;
		   }
		   else
		   {
			   System.out.println("Titile is not matched");
			   return false;
		   }		   
}
	   
	   public boolean checkSubHerder() {
		   String actText = heading.getText();
		   String expText = "Sign in to start your session";
		   if(actText.equals(expText))
		   {
			   System.out.println("Titile is matched");
			   return true;
		   }
		   else
		   {
			   System.out.println("Titile is not matched");
			   return false;
		   }		   
}
	   
	   
	   public boolean verifyCourses() {
		   String actcoursesText = avail.getText();
		   String expcoursesText = "JAVA | SELENIUM | PYTHON";
		   if(actcoursesText.equals(expcoursesText))
		   {
			   System.out.println("Titile is matched");
			   return true;
		   }
		   else
		   {
			   System.out.println("Titile is not matched");
			   return false;
		   }		
		   
}
	   
	   public boolean checkResisTration() {
		   String actcoursesText = value.getText();
		   String expcoursesText = "Register a new membership";
		   if(actcoursesText.equals(expcoursesText))
		   {
			   System.out.println("Titile is matched");
			   return true;
		   }
		   else
		   {
			   System.out.println("Titile is not matched");
			   return false;
		   }		
		   
		   
}
}
