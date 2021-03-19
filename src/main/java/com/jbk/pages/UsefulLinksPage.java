package com.jbk.pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.jbk.pages.objectRespository.UsefulLinkPageObjectRepository;

//import com.jbk.objectRepository.UsefulLinkPageObjectRepository;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class UsefulLinksPage extends UsefulLinkPageObjectRepository {
	WebDriver driver;
	

	public UsefulLinksPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String excelUtility(String sheet, int col, int row) throws Exception{
		FileInputStream fis= new FileInputStream("UsefulLinkData.xls");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet sh=wb.getSheet(sheet);
		pageLog().info("No. of Columns: "+sh.getColumns());
		pageLog().info("No. of Rows: "+sh.getRows());
		Cell cell=sh.getCell(col, row);
		String data=cell.getContents();
		return data;
	}
	
	
	public boolean verifyHeading1() {// 1
		WebElement heading1 = heading;
		String actualPageheading1 = heading1.getText();
		pageLog().info("Actual heading..." + actualPageheading1);
		String expectedPageHeading1 = "Useful Links";

		if (actualPageheading1.equals(expectedPageHeading1)) {
			pageLog().info("Pageheading is matched");
			return true;
		} else {
			pageLog().info("Pageheading is not matched.");
			return false;
		}
	}

	public boolean verifyMsg() {// 2
		String actualSubTitle = msg.getText();
		pageLog().info("Actual Msg..." + actualSubTitle);
		String expectedSubTitle = "* Internet Required";
		pageLog().info("Expected Msg..." + expectedSubTitle);
		if (actualSubTitle.equals(expectedSubTitle)) {
			pageLog().info("sub-title is matched.");
			return true;
		} else {
			pageLog().info("sub-title is not matched");
			return false;
		}
	}

	public boolean tableVisibility() {// 3
		boolean a = tb.isDisplayed();
		return a;
	}

	public boolean verifyTableHeader() throws Exception {// 4 
		ArrayList<String> actheader = new ArrayList<String>();
		for (WebElement ele : list) {
			actheader.add(ele.getText());
		}
		pageLog().info("Actual Header: "+actheader);
		ArrayList<String> expHeader = new ArrayList<String>();
		for(int i=1; i<4; i++){
			expHeader.add(excelUtility("Sheet1", 0, i));
		}

		pageLog().info("Expected Header: "+expHeader);

		if (actheader.equals(expHeader)) {
			pageLog().info("Table header is matched");
			return true;
		} else {
			pageLog().info("Table header is not matched.");
			return false;
		}
	}

	public boolean countHeader() {// 5
		pageLog().info("No of header: " + list.size());
		if (list.size() == 3) {
			pageLog().info("size of header is matched");
			return true;
		} else {
			pageLog().info("size of header is not matched.");
			return false;
		}
	}

	public boolean countRows() {// 6
		pageLog().info("No of rows: " + row.size());
		if (row.size() == 7) {
			pageLog().info("row-size is matched");
			return true;
		} else {
			pageLog().info("row-size is not matched.");
			return false;
		}
	}

	public boolean countButton() {// 7
		pageLog().info("No of buttons: " + goButtons.size());
		if (goButtons.size() == 6) {
			pageLog().info("buttons-size is matched");
			return true;
		} else {
			pageLog().info("buttons-size is not matched.");
			return false;
		}
	}

	public boolean sortingOfContents() {// 8
		ArrayList<String> obtainedList = new ArrayList<String>();
		for (WebElement element : contentList) {
			obtainedList.add(element.getText());
		}
		pageLog().info("**Before sort function**" + obtainedList);
		ArrayList<String> sortedList = new ArrayList<String>();
		for (String s : obtainedList) {
			sortedList.add(s);
		}
		Collections.sort(sortedList);
		pageLog().info("after sorting in ascending order=" + sortedList);
		if(sortedList.equals(obtainedList)){
		return false;
		}
		else return true;
	}

	public boolean reverseOfContents() {// 9
		ArrayList<String> obtainedList = new ArrayList<String>();
		for (WebElement element : contentList) {
			obtainedList.add(element.getText());
		}
		pageLog().info("**Before sort function**" + obtainedList);
		ArrayList<String> sortedList = new ArrayList<String>();
		for (String s : obtainedList) {
			sortedList.add(s);
		}
		Collections.sort(sortedList);
		pageLog().info("after sorting in ascending order=" + sortedList);
		Collections.sort(sortedList, Collections.reverseOrder());
		pageLog().info("after sorting in descending order=" + sortedList);
		Assert.assertFalse(sortedList.equals(obtainedList));
		return true;
	}

	public boolean srNoOfCourses() {// 10
		for (int i = 0; i < contentList.size(); i++) {
			String srNumber = contentList.get(i).getText();

			if (srNumber.contains("Courses")) {
				String idNum = srList.get(i).getText();
				pageLog().info("sr number of courses is: " + idNum);
				return true;
			}
		}
		return false;
	}

	public boolean srNoOfQuestions() {// 11

		for (int i = 0; i < contentList.size(); i++) {
			String srNumber = contentList.get(i).getText();

			if (srNumber.contains("Questions")) {
				String srNo = srList.get(i).getText();
				pageLog().info("Sr no. of questions::" + srNo);
			}
		}
		return true;
	}

	public boolean validatesWithoutCourses() {// 12
		pageLog().info("Sr no. and Content available without courses");
		for (int i = 0; i < contentList.size(); i++) { 
			String srNumber = contentList.get(i).getText();

			if (!(srNumber.contains("Courses"))) {
				String srNo = srList.get(i).getText();
				String content = contentList.get(i).getText();
				pageLog().info(srNo + " " + content);

			}
		}
		return true;
	}
	
	public boolean windowHandler() {// 13
		String mainID = driver.getWindowHandle();
		pageLog().info("Main Window ID: " + mainID);
		pageLog().info(links.size());
		for (WebElement ele : links) {
			ele.click();
		}
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String childID = itr.next();
			if (!mainID.equals(childID)) {
				pageLog().info("Child Window ID:"+childID);
				driver.switchTo().window(childID);
				driver.getTitle();
				driver.close();
			}
			else
				pageLog().info("I am in MainWindow");
		}
		driver.switchTo().window(mainID);
		return true;
	}
	

}
