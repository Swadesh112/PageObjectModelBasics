package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.aa1.base.Page;

public class CreateAccountPage extends Page{

	
	public void createAccount(String AccountName){
		
		driver.findElement(By.cssSelector("#Crm_Accounts_ACCOUNTNAME")).sendKeys(AccountName);
	}
}
