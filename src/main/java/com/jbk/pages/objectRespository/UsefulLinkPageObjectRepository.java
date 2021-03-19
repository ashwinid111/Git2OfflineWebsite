package com.jbk.pages.objectRespository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class UsefulLinkPageObjectRepository extends com.jbk.pages.PageBase {
	@FindBy(tagName="h1")
	public WebElement heading;
	
	@FindBy(xpath="//h3[text()='* Internet Required']")
	public WebElement msg;
	
	@FindBy(tagName="table")
	public WebElement tb;
	
	@FindBy(xpath="//th")
	public List<WebElement> list;

	@FindBy(xpath="//tr")
	public List<WebElement> row;
	
	@FindBy(xpath="//span[text()='Go !']")
	public List<WebElement> goButtons;
	
	@FindBy(xpath="//td[2]")
	public List<WebElement> contentList;
	
	@FindBy(xpath="//td[1]")
	public List<WebElement> srList;
	
	@FindBy(xpath="//span[text()='Go !']")
	public List<WebElement> links;
}
