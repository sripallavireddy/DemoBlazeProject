package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExcelPage 
{
	@FindBy(id="loginusername")
	WebElement UserName;
	
	@FindBy(id="loginpassword")
	WebElement Password;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	WebElement btn;
	
	public ExcelPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void login_username(String uname)
	{
		UserName.sendKeys(uname);	
		
	}
	public void login_password(String pass)
	{
		Password.sendKeys(pass);	
		
	}
	
	public void login_loginbtn() 
	{
		btn.click();
	}
}

