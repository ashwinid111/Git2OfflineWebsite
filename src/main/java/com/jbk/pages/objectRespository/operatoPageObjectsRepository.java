package com.jbk.pages.objectRespository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class operatoPageObjectsRepository {
	@FindBy(tagName = "th")
	public List<WebElement> header;

	@FindBy(xpath = "//table[@class=\"table table-hover\"]//tr/td[1]")
	public List<WebElement> ids;

	@FindBy(xpath = "//table[@class=\"table table-hover\"]//tr/td[2]")
	public List<WebElement> Persons;

	@FindBy(xpath = "//table[@class=\"table table-hover\"]//tr/td[3]")
	public List<WebElement> works;

	@FindBy(xpath = "//table[@class=\"table table-hover\"]//tr/td[4]")
	public List<WebElement> connection;

	@FindBy(xpath = "//table[@class=\"table table-hover\"]//tr/td[5]")
	public List<WebElement> contacts;

	@FindBy(xpath = "//table[@class=\"table table-hover\"]//tr/td[6]")
	public List<WebElement> Timing;

	@FindBy(xpath = "//b[text()=\"Design for Selenium Automation Test\"]")
	public WebElement element1;

	@FindBy(xpath = "//strong[text()=\"Copyright © 2005-2019 \"]")
	public WebElement element2;

	@FindBy(xpath = "//span[text()=\"Operators\"]")
	public WebElement operatorElement;

	@FindBy(xpath = "//span[text()=\"Users\"]")
	public WebElement userElement;

	@FindBy(xpath = "//span[text()=\"Dashboard\"]")
	public WebElement dashboardElement;

	@FindBy(xpath = "//span[text()=\"Useful Links\"]")
	public WebElement usefulLinksElement;
}
