package com.aa1.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.aa1.base.Page;
import com.aa1.pages.ZohoAppPage;
import com.aa1.utilities.Utilities;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;

public class CreateAccountTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void createAccountTest(Hashtable<String, String> data) {

		ZohoAppPage zp = new ZohoAppPage();
		zp.goToCRM();
		AccountsPage account = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.goToCreateAccounts();
		cap.createAccount(data.get("accountname"));

	}

}
