package com.automationpractice.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automationpractice.pages.Authentication;
import com.automationpractice.pages.CreateNewAccount;
import com.automationpractice.pages.Home;

import utils.GenericMethod;

public class NewAccountTest extends Base {
	@Test
	public void login() throws IOException {
	Home hm=new Home(driver);
	Authentication auth=new Authentication(driver);
	//Login into the Account
	//Login lg=new Login(driver);
	//LogOut lgt=new LogOut(driver);
	CreateNewAccount newAccount=new CreateNewAccount(driver);
	
	String[][] data = GenericMethod.getData("D:\\TestAuto.xlsx", "Sheet2");
	for(int i=1;i<data.length;i++) {
		hm.SingnLocate();
		auth.register(data[i][0]);
		newAccount.StartNewReg(data[i][1], data[i][2], data[i][3], data[i][4], data[i][5], data[i][6], data[i][7], data[i][8], data[i][9], data[i][10]);
		//lg.loginApp(data[i][0],data[i][1]);
		//Logout from the Account
		
		//lgt.SignOut();	
	}
			
	}
}
