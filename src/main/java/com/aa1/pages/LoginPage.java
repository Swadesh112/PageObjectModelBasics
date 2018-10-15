package com.aa1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aa1.base.Page;

public class LoginPage extends Page {
	
	
	public ZohoAppPage doLogin(String username, String password){
		
		type("email_CSS", username);
		type("password_CSS", password);
		click("signbtn_CSS");
		
		return new ZohoAppPage();
		
	}

	public void goToSalesandMarketing(){
		
		
	}
	
	public void goToFinance(){
		
		
		
	}
}
