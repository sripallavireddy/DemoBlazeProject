package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage 
{
	public WebDriver ldriver; 
	
	
	public ContactPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
    }
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement Home;
	
	@FindBy(xpath="//a[contains(text(),'Contact')]")
	WebElement lnkContact;
	
	@FindBy(xpath="//h5[@id='exampleModalLabel']")
	WebElement ContactText;
	
	@FindBy(id="recipient-email")
	WebElement txtEmail;
	
	@FindBy(id="recipient-name")
	WebElement txtName;
	
	@FindBy(id="message-text")
	WebElement txtMessage;
	
	
	@FindBy(xpath="//button[contains(text(),'Send message')]")
	WebElement btnSendMessage;
	
	
	
	public void enterHome()
	{
		Home.sendKeys(Keys.RETURN);
	}
	
	
	public void clickContact()
	{
		lnkContact.click();
	}
	
	
	public boolean ContactText()
	{
		boolean txt=ContactText.isDisplayed();
		return txt;
	}
	public void setEmail()
	{
		txtEmail.sendKeys("asdfgh@gmail.com");
	}
	
	public void setName()
	{
	     txtName.sendKeys("dtfuy");
	}
	public void setMessage()
	{
	     txtMessage.sendKeys("Hi");
	}
	
	
	public void clickSendmessage()
	{
		btnSendMessage.click();
	}	
	
	
	
	
}
