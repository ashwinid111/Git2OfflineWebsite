package com.jbk.pages;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jbk.pages.objectRespository.AddUserObjectRespositery;

import jxl.Sheet;
import jxl.Workbook;

public class AddUser extends AddUserObjectRespositery{
	WebDriver driver;
	FileInputStream fileInputStream =null;
	Workbook workbook =null;
	Sheet sheet=null;

	public AddUser(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void openUserPage() {
		email.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginButton.click();
		users.click();
		addUser.click();
	}

	public String [][] readExcel() throws Exception{
		fileInputStream = new FileInputStream("DataExcelSheet.xls");
		workbook = Workbook.getWorkbook(fileInputStream);
		sheet =workbook.getSheet("adduser");
		String [][] dataArray = new String[sheet.getRows()-1][sheet.getColumns()];
		for (int i = 1; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				String data =sheet.getCell(j, i).getContents();
				dataArray[i-1][j]=data;
			}
		}	return dataArray;
	}

	public String[][] readDataProvider() {
		String [][] dataArray = new String[2][7];
		dataArray [0][0] = "Rohan";
		dataArray [0][1] = "8484859092";
		dataArray [0][2] = "rohanghate15@gmail.com";
		dataArray [0][3] = "Selenium";
		dataArray [0][4] = "Male";
		dataArray [0][5] = "Maharashtra";
		dataArray [0][6] = "Rohan@1G";
		dataArray [1][0] = "KunalGhate";
		dataArray [1][1] = "7085787300";
		dataArray [1][2] = "kunalghate03@gmail.com";
		dataArray [1][3] = "Java/J2EE";
		dataArray [1][4] = "Male";
		dataArray [1][5] = "Delhi";
		dataArray [1][6] = "kunal1234";
		return dataArray;
	}

	public String readData(String sheets, int row ,int coloum) throws Exception{
		fileInputStream = new FileInputStream("DataExcelSheet.xls");
		workbook = Workbook.getWorkbook(fileInputStream);
		sheet =workbook.getSheet(sheets);
		return sheet.getCell(row, coloum).getContents();
	}

	public boolean addUser(String userName, String  mobile, String email,String courses, String genders, String states, String password) {

		String expectedAlertMsg ="User Added Successfully. You can not see added user.";
		openUserPage();		
		username.clear();
		username.sendKeys(userName);
		userMobile.clear();
		userMobile.sendKeys(mobile);
		userEmail.clear();
		userEmail.sendKeys(email);
		course.clear();
		course.sendKeys(courses);    	
		if (genders.equals("Male")) {
			male.click();
		}else {
			female.click();
		}    	
		WebElement state = stateSelect;
		Select select = new Select(state);
		select.selectByVisibleText(states);
		userPassword.clear();
		userPassword.sendKeys(password);
		submitButton.click();		
		Alert alert = driver.switchTo().alert();
		String actulAlertMsg= alert.getText();
		alert.accept();	
		if (expectedAlertMsg.equals(actulAlertMsg)) {
			System.out.println("User Data Add Successfully");
			return true;
		}else {
			System.out.println("User Data Not Add Successfully");
			return false;
		}
	}

	public boolean addUser() throws Exception {

		String expectedAlertMsg ="User Added Successfully. You can not see added user.";
		String actulAlertMsg =null;
		readData("adduser", 0, 0);
		email.sendKeys(readData("login", 0, 1));
		password.sendKeys(readData("login", 1, 1));
		loginButton.click();
		users.click();
		addUser.click();
		for (int i = 1; i < sheet.getRows(); i++) {
			username.clear();
			username.sendKeys(readData("adduser", 0, i));
			userMobile.clear();
			userMobile.sendKeys(readData("adduser", 1, i));
			userEmail.clear();
			userEmail.sendKeys(readData("adduser", 2, i));
			course.clear();
			course.sendKeys(readData("adduser", 3, i));
			String genders = readData("adduser", 4, i);
			if (genders.equals("Male")) {
				male.click();
			}else {
				female.click();
			}   	
			WebElement state = stateSelect;
			Select select = new Select(state);
			select.selectByVisibleText(readData("adduser", 5, i));    	
			userPassword.clear();
			userPassword.sendKeys(readData("adduser", 6, i));
			submitButton.click();		
			Alert alert = driver.switchTo().alert();
			actulAlertMsg =alert.getText();
			alert.accept();	
		}
		if (expectedAlertMsg.equals(actulAlertMsg)) {
			System.out.println("User Data Add Successfully");
			return true;
		}else {
			System.out.println("User Data Not Add Successfully");
			return false;
		}
	}

	public boolean AddUserAlert() {
		String expectedAlertMessage="User Added Successfully. You can not see added user.";
		username.sendKeys("Rohan");
		userMobile.sendKeys("8484859092");	        
		userEmail.sendKeys("rohandghate@hotmail.com");	        
		course.sendKeys("Selenium");
		String genders = "Male";
		if (genders.equals("Male")) {
			driver.findElement(By.id("Male")).click();
		}else {
			driver.findElement(By.id("Female")).click();
		}	
		WebElement state = stateSelect;
		Select select = new Select(state);
		select.selectByVisibleText("Maharashtra");
		userPassword.sendKeys("Rohan1234");
		submitButton.click();		
		Alert alert = driver.switchTo().alert();
		String actualAlertMessage= alert.getText();	
		alert.accept();
		if (expectedAlertMessage.equals(actualAlertMessage)) {
			System.out.println(" Alert Message Successfully PopUp On The Window ");
			return true;
		}else {
			System.out.println("Alert Message Not Successfully PopUp On The Window");
			return false;
		}
	}

	public boolean userPage() {

		String expectedPageName="Users";   	 
		cancelButton.click();
		if (expectedPageName.equals(userHeader.getText())) {
			System.out.println("User Page Successfully Open After Cancel Operation");
			return true;
		}else {
			System.out.println("User Page Not Successfully Open After Cancel Operation");
			return false;
		}

	}

	public boolean addUserBoxTitle() {
		openUserPage();
		String expectedAddUserBoxTitle="Fill Below Details";
		String actualAddUserBoxTitle = driver.findElement(By.xpath("//h3[text()='Fill Below Details']")).getText();
		if (expectedAddUserBoxTitle.equals(actualAddUserBoxTitle)) {
			System.out.println(expectedAddUserBoxTitle+" Is A Box Title Of Add Users and It Is Avilable in Add User");
			return true;
		}else {
			System.out.println("There Is No Box Title Available In Add Users");
			return false;
		}
	}

	public boolean navigationsTitle() {
		ArrayList<String> expectedNavigationTitle = new ArrayList<String>();
		expectedNavigationTitle.add("Dashboard");
		expectedNavigationTitle.add("Users");
		expectedNavigationTitle.add("Operators");
		expectedNavigationTitle.add("Useful Links");
		expectedNavigationTitle.add("Downloads");
		expectedNavigationTitle.add("Logout");
		ArrayList<String> actualNavigationTitle = new ArrayList<String>();
		for (WebElement list : navigationList) {
			String elements = list.getText();
			actualNavigationTitle.add(elements);
		}
		for (int i=0;i<actualNavigationTitle.size();i++) {
			if (expectedNavigationTitle.get(i).equals(actualNavigationTitle.get(i))) {				
				System.out.println("Navigation Page Title Match Successfully");
				//return true;
			}else {
				System.out.println("Navigation Page Title Not Match Successfully");
				return false;
			}
		}return true;

	}
}
