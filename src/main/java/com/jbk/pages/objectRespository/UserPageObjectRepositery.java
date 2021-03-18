package com.jbk.pages.objectRespository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPageObjectRepositery {
		
	@FindBy(xpath=("//th"))
	public List<WebElement> HeadingList;
	
	@FindBy(xpath=("//tr/td[1]"))
	public List<WebElement> srNoList;
	
	@FindBy(xpath=("//tr/td[2]"))
	public List<WebElement> userNames;
	
	@FindBy(xpath=("//tr/td[3]"))
	public List<WebElement> emailList;

	@FindBy(xpath=("//tr/td[4]"))
	public List<WebElement> MOBILEList;
	
	@FindBy(xpath=("//tr/td[5]"))
	public List<WebElement> courseList;
	
	@FindBy(xpath=("//tr/td[6]"))
	public List<WebElement> genderList;
	
	@FindBy(xpath=("//tr/td[7]"))
	public List<WebElement> stateList;
	
	@FindBy(xpath=("//span[text()='Delete']"))
	public List<WebElement> actionDelete;
	
	@FindBy(xpath="(//span[@data-placement='top'])[1]")
	public WebElement firstDeleteAlert;
	
	@FindBy(xpath="//span[@class='label label-danger ss']")
	public WebElement secondDeleteAlert;
	
	@FindBy(xpath="//a[@target='_blank']")
	public WebElement windowHandle;
}
