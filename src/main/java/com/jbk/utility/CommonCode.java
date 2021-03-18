package com.jbk.utility;

import java.io.FileInputStream;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import jxl.Sheet;
import jxl.Workbook;

public class CommonCode {

	static FileInputStream fileInputStream;
	static Workbook workbook;
	static Sheet sheet;


	public static void click(WebElement element) {
		element.click();
	}

	public static String windowHandle(WebElement toClick, WebDriver driver)
	{
		click(toClick);
		Set<String> childWindowIds=driver.getWindowHandles();
		String actualSiteTitile=null;
		for(String childWindowId : childWindowIds)
		{
			driver.switchTo().window(childWindowId);
			actualSiteTitile = driver.getCurrentUrl();
		}return actualSiteTitile;
	}

	public static void selectGender(List<WebElement> genders,String gender)
	{
		for(WebElement element : genders)
		{
			if(element.getAttribute("value")==gender)
			{
				element.click();
			}
		}
	}
	
	static public Sheet readWorkBook(String jxlfilepath,String sheetName) throws Exception
	{
		
		fileInputStream=new FileInputStream(jxlfilepath);
		workbook=Workbook.getWorkbook(fileInputStream);
		return sheet=workbook.getSheet(sheetName);
	}
}

