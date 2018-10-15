package com.aa1.testcases;

import org.testng.annotations.AfterSuite;

import com.aa1.base.Page;

public class BaseTest {

	@AfterSuite
	public void tearDown(){
		
		Page.quit();
	}
}
