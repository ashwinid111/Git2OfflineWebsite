package com.jbk.pages.objectRespository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserObjectRespositery {
	@FindBy(id ="email")
    public WebElement email;
    
    @FindBy(id ="password")
    public WebElement password;
    
    @FindBy(xpath ="//button")
    public WebElement loginButton;
    
    @FindBy(xpath ="//span[text()='Users']")
    public WebElement users;
    
    @FindBy(xpath ="//button[text()='Add User']")
    public WebElement addUser;
    
    @FindBy(id ="username")
    public WebElement username;
    
    @FindBy(id ="mobile")
    public WebElement userMobile;
    
    @FindBy(id ="email")
    public WebElement userEmail;
    
    @FindBy(id ="course")
    public WebElement course;
    
    @FindBy(id ="Male")
    public WebElement male;
    
    @FindBy(id ="Female")
    public WebElement female;
    
    @FindBy(tagName ="select")
    public WebElement stateSelect;
    
    @FindBy(id ="password")
    public WebElement userPassword;
    
    @FindBy(tagName ="button")
    public WebElement submitButton;
    
    @FindBy(xpath ="//span[text()='Cancel']")
    public WebElement cancelButton;
    
    @FindBy(tagName ="h1")
    public WebElement userHeader;
    
    @FindBy(xpath ="//h3[text()='Fill Below Details']")
    public WebElement addUserBoxTitle;
    
    @FindBy(xpath ="//li/a/span")
    public List<WebElement> navigationList;

}
