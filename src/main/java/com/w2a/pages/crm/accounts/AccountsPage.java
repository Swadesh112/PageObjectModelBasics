package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.aa1.base.Page;

public class AccountsPage extends Page {

	
	public CreateAccountPage goToCreateAccounts(){
				
		driver.findElement(By.xpath("//button[contains(@class,'newwhitebtn customPlusBtn')]")).click();
		
		return new CreateAccountPage();
		
	}
	
	public void goToImportAccounts(){
		
		
	}
}
