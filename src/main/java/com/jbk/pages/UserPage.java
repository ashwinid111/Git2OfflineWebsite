package com.jbk.pages;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.jbk.pages.objectRespository.UserPageObjectRepositery;

public class UserPage extends UserPageObjectRepositery{
	WebDriver driver;
  
	
	public UserPage(WebDriver driver){
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}


	public boolean cheakTitle()
	{
		String ExpecT ="JavaByKiran | User";
		String ActualT =driver.getTitle();
		if(ActualT.equals(ExpecT))
		{
			System.out.println("Title Is Matched");
			return true;
		}
		else
		{
			System.out.println(ActualT);
			System.out.println("Title Is Not Matched");
			return false;
		}
		//Assert.assertEquals(ActualT, ExpecT );
	}


	public boolean cheakNoList()
	{
		ArrayList<String> ExpetedData = new ArrayList<String>();
		ExpetedData.add("#");
		ExpetedData.add("Username");
		ExpetedData.add("Email");
		ExpetedData.add("Mobile");
		ExpetedData.add("Course");
		ExpetedData.add("Gender");
		ExpetedData.add("State");
		ExpetedData.add("Action");
		System.out.println(ExpetedData);

		//List<WebElement> HeadingList= driver.findElements(By.xpath("//th"));
		ArrayList<String> ActualData =new ArrayList<String>();
		for(WebElement element:HeadingList)
		{
			ActualData.add((element).getText());
		}
		if(ActualData.equals(ExpetedData))
		{
			System.out.println("HeadingList Is Matched");
			return true;
		}
		else 
		{
			System.out.println(ActualData);
			System.out.println("HeadingList Is Not Matched");
			return false;
		}
		//Assert.assertEquals(ActualData, ExpetedData);
	}


	public boolean srNo()
	{
		ArrayList<String> ExpectedList = new ArrayList<String>();
		ExpectedList.add("1");
		ExpectedList.add("2");
		ExpectedList.add("3");
		ExpectedList.add("4");
		System.out.println(ExpectedList);

		//List<WebElement> srNoList = driver.findElements(By.xpath("//tr/td[1]"));
		ArrayList<String> ActualList = new ArrayList<String>();

		for(WebElement element : srNoList)
		{
			ActualList.add((element).getText());
		}

		if(ActualList.equals(ExpectedList))
		{
			System.out.println("srNoList Is Matched");
			return true;
		}
		else
		{
			System.out.println(ActualList);
			System.out.println("srNoList Is Not Matched");
			return false;
		}
		//Assert.assertEquals(ActualList, ExpectedList);
	}


	public boolean userNameList()
	{
		ArrayList<String> ExpectedList = new ArrayList<String>();
		ExpectedList.add("Kiran");
		ExpectedList.add("Sagar");
		ExpectedList.add("Monica");
		ExpectedList.add("Kimaya");
		System.out.println(ExpectedList);

		//List<WebElement> userNames = driver.findElements(By.xpath("//tr/td[2]"));
		ArrayList<String> ActualList=new ArrayList<String>();
		for(WebElement element :userNames )
		{
			ActualList.add((element).getText());
		}
		if(ActualList.equals(ExpectedList))
		{
			System.out.println("UserName List Is Matched");
			return true;
		}
		else
		{
			System.out.println(ActualList);
			System.out.println("UserName List Is not Matched");
			return false;
		}
		//Assert.assertEquals(ActualList, ExpectedList);
	}


	public boolean emailList()
	{
		ArrayList<String> ExpectedList = new ArrayList<String>();
		ExpectedList.add("kiran@gmail.com");
		ExpectedList.add("sagar@gmail.com");
		ExpectedList.add("monica@gmail.com");
		ExpectedList.add("kimaya@gmail.com");
		System.out.println(ExpectedList);

		//	List<WebElement> emailList = driver.findElements(By.xpath("//tr/td[3]"));
		ArrayList<String> ActualList=new ArrayList<String>();
		for(WebElement element :emailList )
		{
			ActualList.add((element).getText());
		}
		if(ActualList.equals(ExpectedList))
		{
			System.out.println("EmailList List Is Matched");
			return true;
		}
		else
		{
			System.out.println(ActualList);
			System.out.println("EmailList List Is not Matched");
			return false;
		}
		//	Assert.assertEquals(ActualList, ExpectedList);
	}


	public boolean mobileNList()
	{
		ArrayList<String> ExpectedList = new ArrayList<String>();
		ExpectedList.add("9898989898");
		ExpectedList.add("999999999");
		ExpectedList.add("1111111111");
		ExpectedList.add("999999999");
		System.out.println(ExpectedList);

		//List<WebElement> MOBILEList = driver.findElements(By.xpath("//tr/td[4]"));
		ArrayList<String> ActualList=new ArrayList<String>();
		for(WebElement element :MOBILEList )
		{
			ActualList.add((element).getText());
		}
		if(ActualList.equals(ExpectedList))
		{
			System.out.println("Mobile Number's List Is Matched");
			return true;
		}
		else
		{
			System.out.println(ActualList);
			System.out.println("Mobile Number's List Is not Matched");
			return false;
		}
		//Assert.assertEquals(ActualList, ExpectedList);
	}


	public boolean courseList()
	{
		ArrayList<String> ExpectedList = new ArrayList<String>();
		ExpectedList.add("Java/J2EE");
		ExpectedList.add("Selenium");
		ExpectedList.add("Python");
		ExpectedList.add("PHP");
		System.out.println(ExpectedList);

		//List<WebElement> courseList = driver.findElements(By.xpath("//tr/td[5]"));
		ArrayList<String> ActualList=new ArrayList<String>();
		for(WebElement element :courseList )
		{
			ActualList.add((element).getText());
		}
		if(ActualList.equals(ExpectedList))
		{
			System.out.println("Course List Is Matched");
			return true;
		}
		else
		{
			System.out.println(ActualList);
			System.out.println("Course List Is not Matched");
			return false;
		}
		//Assert.assertEquals(ActualList, ExpectedList);
	}


	public boolean genderList()
	{
		ArrayList<String> ExpectedList = new ArrayList<String>();
		ExpectedList.add("Male");
		ExpectedList.add("Male");
		ExpectedList.add("Female");
		ExpectedList.add("Female");
		System.out.println(ExpectedList);

		//List<WebElement> genderList = driver.findElements(By.xpath("//tr/td[6]"));
		ArrayList<String> ActualList=new ArrayList<String>();
		for(WebElement element :genderList )
		{
			ActualList.add((element).getText());
		}
		if(ActualList.equals(ExpectedList))
		{
			System.out.println("gender List Is Matched");
			return true;
		}
		else
		{
			System.out.println(ActualList);
			System.out.println("gender List Is not Matched");
			return false;
		}
		//Assert.assertEquals(ActualList, ExpectedList);
	}


	public boolean stateList()
	{
		ArrayList<String> ExpectedList = new ArrayList<String>();
		ExpectedList.add("Maharashtra");
		ExpectedList.add("Punjab");
		ExpectedList.add("Maharashtra");
		ExpectedList.add("Punjab");
		System.out.println(ExpectedList);

		//List<WebElement> stateList = driver.findElements(By.xpath("//tr/td[7]"));
		ArrayList<String> ActualList=new ArrayList<String>();
		for(WebElement element :stateList )
		{
			ActualList.add((element).getText());
		}
		if(ActualList.equals(ExpectedList))
		{
			System.out.println("State List Is Matched");
			return true;
		}
		else
		{
			System.out.println(ActualList);
			System.out.println("State List Is not Matched");
			return false;
		}
		//Assert.assertEquals(ActualList, ExpectedList);
	}


	public boolean actionDeleteList()
	{
		ArrayList<String> ExpectedList = new ArrayList<String>();
		ExpectedList.add("Delete");
		ExpectedList.add("Delete");
		ExpectedList.add("Delete");
		ExpectedList.add("Delete");
		System.out.println(ExpectedList);

		//List<WebElement> actionDelete = driver.findElements(By.xpath("//span[text()='Delete']"));
		ArrayList<String> ActualList=new ArrayList<String>();
		for(WebElement element :actionDelete )
		{
			ActualList.add((element).getText());
		}
		if(ActualList.equals(ExpectedList))
		{
			System.out.println("Delete List Is Matched");
			return true;
		}
		else
		{
			System.out.println(ActualList);
			System.out.println("Delete List Is not Matched");
			return false;
		}
		//Assert.assertEquals(ActualList, ExpectedList);
	}


	public void firstDeleteAlert()
	{
		firstDeleteAlert.click();
		Alert al= driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
	}


	public void secondDeleteAlert()
	{
		secondDeleteAlert.click();
		Alert al= driver.switchTo().alert();
		System.out.println(al.getText()); 
		al.accept();
		al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
	}


	public void windowHandle()
	{
		String mainwindow=driver.getWindowHandle();
		windowHandle.click();

		java.util.Set<String> currentWindowHandle = driver.getWindowHandles();
		for(String id : currentWindowHandle )
		{
			driver.switchTo().window(id);
		}
		System.out.println(driver.getCurrentUrl());
	}
}
