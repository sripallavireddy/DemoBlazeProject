package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.BaseClass;
import com.pages.LoginPage;
import com.util.Utility;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefn extends BaseClass{
	Logger LOG = LogManager.getLogger(LogoStepDefn.class.getName());
	public LoginPage lp;
	public Utility util;
	//Scenario 2:To verify login process

		@Given("^clicks on the log in link$")
		public void clicks_on_the_log_in_link() throws Exception {
			lp = new LoginPage(driver);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			lp.clickLogin();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		}

		@Then("^user gives his username \"([^\"]*)\" and password \"([^\"]*)\"$")
		public void user_gives_his_username_and_password(String uname, String pwd) throws Exception {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(3000);
			lp.setUserName(uname);
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			lp.setPassword(pwd);
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			LOG.info("username and password are given");

		}

		@Then("^clicks on the login button$")
		public void clicks_on_the_login_button_and_logout_if_already_loggedIn() throws Exception {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			lp.clickSubmit();
			Thread.sleep(3000);
			util = new Utility(driver);
			util.takeSnapShot("./src/test/resources/ScreenShot/login.png");
			LOG.info("Login page opened and ScreenShot taken");

			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			lp.clickLogout();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		}

		@And("^user closes the browser$")
		public void user_closes_the_browser() {
			quit();

		}

}
