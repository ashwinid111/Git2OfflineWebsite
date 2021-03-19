package com.jbk.pages.objectRespository;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class RegistrationPageObjectRepository   {
	   
	   @FindBy(xpath="//p")
	   public WebElement header;
	   
	   @FindBy(xpath="//a[@class]")
	   public WebElement logform;
	   
	   @FindBy(xpath="//button")
	   public WebElement button;
	   
	   @FindBy(id="name_error")
	   public WebElement names;
	   
	   @FindBy(xpath="//button")
	   public WebElement data;
	   
	   @FindBy(id="mobile_error")
	   public WebElement setUp;
	   
	   @FindBy(id="password_error")
	   public WebElement reader;
	   
	   @FindBy(id="email_error")
	   public WebElement mymail;
	   
	   @FindBy(id="name")
	   public WebElement myname;
	   
	   @FindBy(id="mobile")
	   public WebElement mymobile;
	   
	   @FindBy(id="email")
	   public WebElement myemail;
	   
	   @FindBy(id="password")
	   public WebElement mypass;
	   
	   
	   
	   

	   
	   
	   
	   

}
