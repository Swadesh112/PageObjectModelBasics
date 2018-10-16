package com.aa1.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aa1.base.Page;
import com.aa1.pages.HomePage;
import com.aa1.pages.LoginPage;
import com.aa1.pages.ZohoAppPage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HomePage home = new HomePage();
		LoginPage login = home.goToLogin();
				
		ZohoAppPage zp = login.doLogin("swadesh112@gmail.com", "$wadeshCTS15");
		zp.goToCRM();
		
		AccountsPage account = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.goToCreateAccounts();
		cap.createAccount("Swadesh");

	}

}
