package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.baseclass.BaseClass;
import com.pages.AboutUsPage;
import com.pages.LoginPage;
import com.util.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AboutUsStepDefn extends BaseClass{

	Logger LOG = LogManager.getLogger(LogoStepDefn.class.getName());
	public LoginPage lp;
	public Utility util;
	public AboutUsPage ap;
	
	// Scenario 3:Go to about us page and check if the video is available or not
		@Then("^logs in$")
		public void logs_in() throws Exception {
			lp = new LoginPage(driver);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			lp.clickSubmit();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			LOG.info("user logs in");

		}

		@Given("^the user enters the home page$")
		public void the_user_enters_the_home_page() throws Exception {

			ap = new AboutUsPage(driver);
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			ap.enterHome();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			LOG.info("User enters the home");
		}

		@Given("^clicks on About Us$")
		public void clicks_on_About_Us() throws Exception {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(3000);

			ap.clickAboutUs();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			LOG.info("Clicks on aboutus");
			util = new Utility(driver);
			util.takeSnapShot("./src/test/resources/ScreenShot/aboutus.png");
			LOG.info("Opens aboutus and ScreenShot taken");

		}

		@Then("^the user checks if directed to right page$")
		public void the_user_checks_if_directed_to_right_page() throws Exception {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(3000);
			if (ap.aboutUsText()) {
				Assert.assertTrue(true);
				System.out.println("We are in About us page....");

			} else {
				Assert.assertTrue(false);

			}
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			LOG.info("verifies if directed to the right page");

		}

		@Then("^checks whether the video is available or not$")
		public void checks_whether_the_video_is_available_or_not() throws Exception {
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

			if (ap.aboutUsVideo()) {
				Assert.assertTrue(true);
				System.out.println("The video is available....");

			} else {
				Assert.assertTrue(false);

			}
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			LOG.info("verified that vedio is present");

		}

		@Then("^close the About us page$")
		public void close_the_About_us_page() throws Exception {
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

			ap.closeAboutUs();
			LOG.info("Aboutus page is closed");
		}

}
