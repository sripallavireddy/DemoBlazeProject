package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
public WebDriver ldriver;

	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
    }
	
	@FindBy(id="login2")
	WebElement lnkLogin;
	
	@FindBy(id="loginusername")
	WebElement txtUserName;
	
	@FindBy(id="loginpassword")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	WebElement btnLogin;
	
	@FindBy(id="logout2")
	WebElement lnkLogOut;
	
	
	public void clickLogin()
	{
		lnkLogin.sendKeys(Keys.RETURN);
	}
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
	     txtPassword.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	public void clickLogout()
	{
		lnkLogOut.click();
	}	
	
	
	
	
}

