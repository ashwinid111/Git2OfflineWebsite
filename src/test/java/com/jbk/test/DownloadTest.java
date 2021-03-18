package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import com.jbk.pages.DownloadPage;
import com.jbk.utility.ApplyListeners;

public class DownloadTest extends ApplyListeners {
	WebDriver driver = null;
	DownloadPage downloadsPage = null;

	@BeforeSuite
	public void openBrowser() {
		System.setProperty("WebDriver.Chrome.Driver", "D:/ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Offline%20Website/Offline%20Website/pages/examples/downloads.html");
		driver.manage().window().maximize();
		downloadsPage = new DownloadPage(driver);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

	@Test(priority=1)
	public void validatingImgDispaly() {
		Assert.assertTrue(downloadsPage.validedImageDisplay());
	}

	@Test(priority=2)
	public void validatingHeaderList() {
		Assert.assertTrue(downloadsPage.validedHeaderList());
	}
	
	@Test(priority=3)
	public void validatingVendorList() {
		Assert.assertTrue(downloadsPage.validedVendorList());
	}
	
	@Test(priority=4)
	public void validatingVersionList() {
		Assert.assertTrue(downloadsPage.validedVersionList());
	}
	
	
	
	@Test(priority=5)
	public void validatingSeleniumSoftware() {
		Assert.assertTrue(downloadsPage.validedSelenium());
	}
	@Test(priority=6)
	public void validatingGoogleSoftware() {
		//Assert.assertTrue(downloadsPage.validedGoogleChrome());
	}
	@Test(priority=7)
	public void validatingVendorSize() {
		Assert.assertTrue(downloadsPage.validedVendorSize());
	}
	@Test(priority=8)
	public void validatingOfficialSourceLinkSize() {
		Assert.assertTrue(downloadsPage.validedOfficialSourceSize());
	}
	
	
	@Test(priority=9)
	public void validatingOracleSite() {
		Assert.assertTrue(downloadsPage.validatingOracleSiteTitle());
	}
	
	
	
}
