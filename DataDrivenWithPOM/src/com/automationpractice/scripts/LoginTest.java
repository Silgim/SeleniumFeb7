package com.automationpractice.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.automationpractice.pages.*;

import utils.GenericMethod;

public class LoginTest extends Base {
	@Test
	public void login() throws IOException {
	Home hm=new Home(driver);
	//Authentication auth=new Authentication(driver);
	//Login into the Account
	Login lg=new Login(driver);
	LogOut lgt=new LogOut(driver);
	
	
	String[][] data = GenericMethod.getData("D:\\TestAuto.xlsx", "Sheet1");
	for(int i=1;i<data.length;i++) {
		hm.SingnLocate();
		
		lg.loginApp(data[i][0],data[i][1]);
		String actualMsg=lgt.LoginMsg(data[i][2]);
		String expectedMsg="MY ACCOUNT";
		Assert.assertEquals(actualMsg, expectedMsg);
		//Logout from the Account
		
		lgt.SignOut();	
	}
			
	}
}
