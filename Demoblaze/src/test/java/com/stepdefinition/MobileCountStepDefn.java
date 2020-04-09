package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.BaseClass;
import com.pages.LoginPage;
import com.pages.MobileCount;
import com.util.Utility;

import cucumber.api.java.en.And;

public class MobileCountStepDefn extends BaseClass {

	Logger LOG = LogManager.getLogger(LogoStepDefn.class.getName());
	public LoginPage lp;
	public MobileCount mp;
	public Utility util;

	//Scenario 5:Count the number of samsung mobiles in Mobile page
		@And("^clicks on the Phones link$")
		public void clicks_on_the_Phones_link() throws Exception {
			mp = new MobileCount(driver);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(3000);

			mp.clickMobiles();
			LOG.info("User clicks on the MObile link");

		}

		@And("^Return the count of mobiles$")
		public void return_the_count_of_mobiles() {
			System.out.println("no of samsung mobiles:" + mp.countMobiles());
		}
		
		
}
