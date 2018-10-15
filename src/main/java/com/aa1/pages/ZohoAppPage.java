package com.aa1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aa1.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {

	
	public void goToSurvey(){
		
		driver.findElement(By.xpath("")).click();
		
	}
	
	public CRMHomePage goToCRM(){
		
		driver.findElement(By.cssSelector(".zicon-apps-crm.zicon-apps-96")).click();
		
		return new CRMHomePage();
		
	}
	
	public void goToSalesIQ(){
		
		driver.findElement(By.cssSelector(".zicon-apps-salesiq.zicon-apps-96")).click();
		
	}
}
