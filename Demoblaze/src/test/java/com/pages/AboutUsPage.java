package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPage 
{
	
		public WebDriver ldriver; 
		
			
			public AboutUsPage(WebDriver rdriver)
			{
				ldriver=rdriver;
				PageFactory.initElements(rdriver, this);
		    }
			
			@FindBy(xpath="//a[contains(text(),'Home')]")
			WebElement Home;
			
			@FindBy(xpath="//a[contains(text(),'About us')]")
			WebElement lnkAboutUs;
			
			@FindBy(xpath="//h5[@id='videoModalLabel']")
			WebElement AboutUsText;
			
			@FindBy(id="example-video_html5_api")
			WebElement AboutUsVideo;
			
			@FindBy(xpath="//div[@id='videoModal']//button[@class='btn btn-secondary'][contains(text(),'Close')]")
			WebElement Close;
			
			public void enterHome()
			{
				Home.sendKeys(Keys.RETURN);
			}
			
			
			public void clickAboutUs()
			{
				lnkAboutUs.sendKeys(Keys.RETURN);
			}
			
			
			public boolean aboutUsText()
			{
				boolean txt=AboutUsText.isDisplayed();
				return txt;
			}
			public boolean aboutUsVideo()
			{
				boolean video=AboutUsVideo.isDisplayed();
				return video;
			}
			
			public void closeAboutUs()
			{
				Close.sendKeys(Keys.RETURN);
			}
			
			
			
		}


