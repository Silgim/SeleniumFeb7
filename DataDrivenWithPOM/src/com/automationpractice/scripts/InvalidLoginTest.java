package com.automationpractice.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.automationpractice.pages.*;

import utils.GenericMethod;

public class InvalidLoginTest extends Base {
	@Test
	public void login() throws IOException {
	Home hm=new Home(driver);
	
	//Login into the Account
	Login lg=new Login(driver);
	
	
	
	String[][] data = GenericMethod.getData("D:\\TestAuto.xlsx", "Sheet3");
	for(int i=1;i<data.length;i++) {
		hm.SingnLocate();
		
		lg.loginApp(data[i][0],data[i][1]);
		String actualMsg=lg.invalidLogin(data[i][2]);
		String expectedMsg="There is 1 error";
		Assert.assertEquals(actualMsg, expectedMsg);
		
		
	}
	}
}
