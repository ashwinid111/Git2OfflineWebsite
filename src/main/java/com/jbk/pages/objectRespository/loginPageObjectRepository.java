package com.jbk.pages.objectRespository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPageObjectRepository {
	@FindBy(id = "email")
	public WebElement uname;

	@FindBy(id = "password")
	public WebElement pass;

	@FindBy(xpath = "//button")
	public WebElement lgnBtn;
}
