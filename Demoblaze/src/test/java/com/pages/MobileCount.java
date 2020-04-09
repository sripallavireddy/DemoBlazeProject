package com.pages;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileCount 
{
public WebDriver driver; 
	
	
	public MobileCount(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
    }
	
	@FindBy(xpath="//a[contains(text(),'Phones')]")
	WebElement Phones;
	
	
	public void clickMobiles()
	{
		Phones.sendKeys(Keys.RETURN);
	}

	public int countMobiles()
	{
		List<WebElement> mob=driver.findElements(By.xpath("//a[contains(text(),'Samsung')]"));
		
		int count=mob.size();
		return count;
	
	}
	
}
