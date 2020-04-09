package com.stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import com.baseclass.BaseClass;
import com.pages.LoginPage;
import com.util.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LogoStepDefn extends BaseClass {

	Logger LOG = LogManager.getLogger(LogoStepDefn.class.getName());
	public LoginPage lp;
	public Utility util;
	
	
	// Scenario 1:To check the the presence of logo and verify page title

	@Given("^user launches the chrome browser$")
	public void user_launches_the_chrome_browser() throws IOException {
		launchApplication();
		lp = new LoginPage(driver);
		LOG.info("chrome opened");

	}

	@And("^user enters the url and opens the site$")
	public void user_enters_the_url_and_opens_the_site() throws Exception {
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		LOG.info("Required url opens");

	}

	@Then("^user verifies the logo whether present or not$")
	public void user_verifies_the_logo_whether_present_or_not() throws Exception {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);

		boolean result = driver.findElement(By.id("nava")).isDisplayed();
		Assert.assertEquals(true, result);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		LOG.info("Logo is verified");

	}

	@And("^verify the title of the page$")
	public void verify_the_title_of_the_page() {
		if (driver.getTitle().equalsIgnoreCase("STORE")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		LOG.info("Title is verified");
		util = new Utility(driver);
		util.takeSnapShot("./src/test/resources/ScreenShot/logotitle.png");
		LOG.info("page screenShot taken");

	}



}

