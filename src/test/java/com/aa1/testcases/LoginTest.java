package com.aa1.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.aa1.pages.HomePage;
import com.aa1.pages.LoginPage;
import com.aa1.pages.ZohoAppPage;
import com.aa1.utilities.Utilities;

public class LoginTest extends BaseTest{
	
	//-------------Test CI Once More for Login Test Case-----------------------
	@Test(dataProviderClass = Utilities.class, dataProvider ="dp")
	public void loginTest(Hashtable<String, String> data){
		
		HomePage home = new HomePage();
		LoginPage login = home.goToLogin();
		login.doLogin(data.get("username"), data.get("password"));
	}

}
