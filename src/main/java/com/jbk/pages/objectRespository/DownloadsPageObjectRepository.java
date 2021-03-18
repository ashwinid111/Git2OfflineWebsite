package com.jbk.pages.objectRespository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadsPageObjectRepository {

	@FindBy(xpath = "//tr//img")
	public List<WebElement> images;
	
	@FindBy(xpath = "//span[text()='Downloads']")
	public WebElement downloads;
	
	@FindBy(xpath = "//th[text()]")
	public List<WebElement> header;
	
	@FindBy(xpath = "//td[3]")
	public List<WebElement> vendor;
	
	@FindBy(xpath = "//td[4]")
	public List<WebElement> version;
	
	@FindBy(xpath = "//td[5]")
	public List<WebElement> bit;
	
	@FindBy(xpath = "//td[6]")
	public List<WebElement> bits;
	
	@FindBy(xpath = "//td[8]/a")
	public List<WebElement> officialSource;
	
	@FindBy(xpath = "//td[8]/a")
	public List<WebElement> officialSite;
	
	@FindBy(xpath = "//a[@href='https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html']")
	public WebElement oracle;
	
	@FindBy(xpath = "//a[@href='http://selenium-release.storage.googleapis.com/index.html']")
	public WebElement seleniumStandalone;

	@FindBy(xpath = "//a[@href='https://www.selenium.dev/selenium/docs/api/java/overview-summary.html']")
	public WebElement seleniumSource;
	
	@FindBy(xpath = "//a[@href='https://chromeenterprise.google/browser/download/']")
	public WebElement googleChrome;
	
	@FindBy(xpath = "//a[@href='https://chromedriver.chromium.org/downloads']")
	public WebElement googleDriver;
}
