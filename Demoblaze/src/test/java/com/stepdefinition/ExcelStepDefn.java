package com.stepdefinition;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.baseclass.BaseClass;
import com.excel.Excel;
import com.pages.ExcelPage;
import com.pages.LoginPage;
import cucumber.api.java.en.Then;

public class ExcelStepDefn extends BaseClass {

	Logger LOG = LogManager.getLogger(LogoStepDefn.class.getName());
	public LoginPage lp;
	public ExcelPage ep;
	public Excel excel;

	
	//tag6
	@Then("^user gives his username <uname> and password <pwd>$")
	public void user_gives_his_username_uname_and_password_pwd() throws IOException 
	{
		excel=new Excel();
		ep=new ExcelPage(driver);
		ep.login_username(excel.excel_username(1));
		ep.login_password(excel.excel_userpassword(1));
		ep.login_loginbtn();
		LOG.info("Login Done by excel read data");
	}

}
