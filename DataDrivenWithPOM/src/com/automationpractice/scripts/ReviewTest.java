package com.automationpractice.scripts;

import java.io.IOException;


import org.testng.annotations.Test;

import com.automationpractice.pages.Home;
import com.automationpractice.pages.*;
import com.automationpractice.pages.Login;

import utils.GenericMethod;

public class ReviewTest extends Base {
	@Test
	public void login() throws IOException {
	Home hm=new Home(driver);
	
	//Login into the Account
	Login lg=new Login(driver);
	//LogOut lgt=new LogOut(driver);
	Category ct=new Category(driver);
	
	String[][] data = GenericMethod.getData("D:\\TestAuto.xlsx", "Sheet1");
	for(int i=1;i<data.length;i++) {
		hm.SingnLocate();
		
		lg.loginApp(data[i][0],data[i][1]);
		ct.writeReview();
		//Logout from the Account
		
		//lgt.SignOut();	
	}
	}
}
