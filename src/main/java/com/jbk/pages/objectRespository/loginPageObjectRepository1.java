package com.jbk.pages.objectRespository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPageObjectRepository1 {
	
	   @FindBy(className ="login-box-msg")
	   public WebElement heading;

	   @FindBy(xpath ="//h4")
	   public WebElement avail;
	   
	   @FindBy(className ="text-center")
	   public WebElement value;
	   
	   
	   

	   

}
