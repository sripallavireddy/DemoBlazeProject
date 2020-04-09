package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.baseclass.BaseClass;
import com.pages.ContactPage;
import com.util.Utility;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ContactUsStepDefn extends BaseClass {
	
	Logger LOG = LogManager.getLogger(LogoStepDefn.class.getName());
	public ContactPage cp;
	public Utility util;
	
	//Scenario 4:Go to contact page and checks and sends a message
		@Then("^clicks on Contact$")
		public void clicks_on_Contact() throws Exception {
			cp = new ContactPage(driver);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(3000);

			cp.clickContact();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			LOG.info("clicks on contact");

		}

		@And("^the user checks if directed to contact page$")
		public void the_user_checks_if_directed_to_contact_page() throws Exception {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(3000);
			if (cp.ContactText()) {
				Assert.assertTrue(true);
				System.out.println("We are in Contact page....");

			} else {
				Assert.assertTrue(false);

			}
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			LOG.info("checks if directed to right page");

		}

		@And("^user gives contact email as \"([^\"]*)\" and name \"([^\"]*)\" and message as \"([^\"]*)\"$")
		public void user_gives_contact_email_as_and_name_and_message_as(String arg1, String arg2, String arg3)
				throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(3000);
			cp.setEmail();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			cp.setName();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			cp.setMessage();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			LOG.info("Enters the email name and password");
			util = new Utility(driver);
			util.takeSnapShot("./src/test/resources/ScreenShot/contact.png");
			LOG.info("ScreenShot taken after giving the details");
		}

		@And("^sends the message$")
		public void sends_the_message() throws Exception {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			cp.clickSendmessage();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		}
}
