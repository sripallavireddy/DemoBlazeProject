package com.baseclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
		public static WebDriver driver;
		public void launchApplication() throws IOException
		{
		
					System.setProperty("webdriver.chrome.driver","./src/test/resources/Drivers/chromedriver.exe");
					driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
		}
		public void quit()
		{
			driver.quit();
		}
}
