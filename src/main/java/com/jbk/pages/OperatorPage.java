package com.jbk.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;

import com.jbk.pages.objectRespository.operatoPageObjectsRepository;
import com.jbk.utility.ExcelSheetUtilityClass;

public class OperatorPage extends operatoPageObjectsRepository {
	WebDriver driver;

	public OperatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public boolean checkTitle() {
		String actualMsg = driver.getTitle();
		String expectedMsg = "JavaByKiran | Operators";
		if (actualMsg.equals(expectedMsg)) {
			System.out.println("Page title matched::" + actualMsg);
			return true;
		} else {
			System.out.println("Page title not matched::");
			return false;
		}
	}

	public boolean checkOperatorHeader() {
		ArrayList<String> expectedheader = new ArrayList<String>();
		expectedheader.add("ID");
		expectedheader.add("Person");
		expectedheader.add("For");
		expectedheader.add("Prefered Way to Connect");
		expectedheader.add("Contact");
		expectedheader.add("Timings");
		ArrayList<String> actualheader = new ArrayList<String>();
		for (WebElement element : header) {
			String text = element.getText();
			actualheader.add(text);
		}
		if (actualheader.equals(expectedheader)) {
			System.out.println("Page Header Matched::" + expectedheader);
			return true;
		} else {
			return false;
		}
	}

	public boolean CheckOperatorsIds() {
		ArrayList<String> expectedIds = new ArrayList<String>();
		expectedIds.add("01");
		expectedIds.add("02");
		expectedIds.add("03");
		expectedIds.add("04");
		expectedIds.add("05");
		ArrayList<String> actualIds = new ArrayList<String>();
		for (WebElement element : ids) {
			actualIds.add(element.getText());
		}
		if (actualIds.equals(expectedIds)) {
			System.out.println("Page ids Matched::" + expectedIds);
			return true;
		} else {
			return false;
		}
	}

	public boolean checkTotalPersons() {
		ArrayList<String> expectedPersons = new ArrayList<String>();
		expectedPersons.add("Kiran");
		expectedPersons.add("Neelam");
		expectedPersons.add("Seema");
		expectedPersons.add("Varsha");
		expectedPersons.add("Darshit");
		ArrayList<String> actualPersons = new ArrayList<String>();
		for (WebElement element : Persons) {
			actualPersons.add(element.getText());
		}
		if (actualPersons.equals(expectedPersons)) {
			System.out.println("Page Persons Matched::" + expectedPersons);
			return true;
		} else {
			return false;
		}
	}

	public boolean getTotalworksfor() {
		ArrayList<String> expectedworks = new ArrayList<String>();
		expectedworks.add("Urgent Technical Help");
		expectedworks.add("Technical Discussion (Errors, Software, Technical Materials)");
		expectedworks.add("Administration (Fees, ID Card, Certificates, WhatsApp Group, Enquiry)");
		expectedworks.add("Enquiry(Course Details, Fees, Enquiry)");
		expectedworks.add("Technical Help");
		ArrayList<String> actualworks = new ArrayList<String>();
		for (WebElement element : works) {
			actualworks.add(element.getText());
		}
		if (actualworks.equals(expectedworks)) {
			System.out.println("Page works Matched::" + expectedworks);
			return true;
		} else {
			return false;
		}
	}

	public boolean checkPrefarableWayToConnection() {
		ArrayList<String> expectedconnection = new ArrayList<String>();
		expectedconnection.add("Whats App Only");
		expectedconnection.add("Whats App Phone Call SMS eMail");
		expectedconnection.add("Whats App Phone Call SMS eMail");
		expectedconnection.add("Whats App Phone Call SMS eMail");
		expectedconnection.add("Whats App Only");
		ArrayList<String> actualconnection = new ArrayList<String>();
		for (WebElement element : connection) {
			actualconnection.add(element.getText());
		}
		if (actualconnection.equals(expectedconnection)) {
			System.out.println("Page connection Matched::" + expectedconnection);
			return true;
		} else {
			return false;
		}
	}

	public boolean checkContacts() {
		ArrayList<String> expectedcontacts = new ArrayList<String>();
		expectedcontacts.add("9552343698");
		expectedcontacts.add("7066885937");
		expectedcontacts.add("8888558802");
		expectedcontacts.add("8888809416");
		expectedcontacts.add("8866888662");
		ArrayList<String> actualcontacts = new ArrayList<String>();
		for (WebElement element : contacts) {
			actualcontacts.add(element.getText());
		}
		if (actualcontacts.equals(expectedcontacts)) {
			System.out.println("Page connection Matched::" + expectedcontacts);
			return true;
		} else {
			return false;
		}
	}

	public boolean checkTimings() {
		ArrayList<String> expectedTiming = new ArrayList<String>();
		expectedTiming.add("07:00 AM to 10:00 PM Monday-Sunday");
		expectedTiming.add("09:00 AM to 06:00 PM Monday-Saturday");
		expectedTiming.add("09:00 AM to 06:00 PM Monday-Saturday");
		expectedTiming.add("09:00 AM to 06:00 PM Monday to Friday and Sunday");
		expectedTiming.add("08:30 AM to 02:00 PM Saturday-Sunday");
		ArrayList<String> actualTiming = new ArrayList<String>();
		for (WebElement element : Timing) {
			actualTiming.add(element.getText());
		}
		if (actualTiming.equals(expectedTiming)) {
			System.out.println("Page connection Matched::" + expectedTiming);
			return true;
		} else {
			return false;
		}
	}

	public void getNOTE1() {
		ArrayList<String> expectedText = new ArrayList<String>();
		expectedText.add("Design for Selenium Automation Test");
		String actualText = element1.getText();
		System.out.println(actualText);
		System.out.println(expectedText);
	}

	public void getNOTE2() {
		ArrayList<String> expectedText = new ArrayList<String>();
		expectedText.add("Copyright © 2005-2019");
		String actualtext = element2.getText();
		System.out.println(actualtext);
		System.out.println(expectedText);
	}

	public void OperatorElement1() {
		String text = operatorElement.getText();
		System.out.println(text);
	}

	public void UserElement2() {
		String text = userElement.getText();
		System.out.println(text);
	}
	public void DashboardElement3() {
		String text = operatorElement.getText();
		System.out.println(text);
	}
	public void UsefullinksElement4() {
		String text = operatorElement.getText();
		System.out.println(text);
	}
	public void Read() {
		ExcelSheetUtilityClass value=new ExcelSheetUtilityClass("PageExcel.xlsx");
		value.addColumn("Sheet1", "akshay");
	}
	@AfterSuite
	public void BrowserClose() {
		driver.close();
	}
}
