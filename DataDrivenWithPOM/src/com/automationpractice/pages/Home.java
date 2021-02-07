package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

		@FindBy(linkText="Sign in")
		private WebElement SignIn;
	
public Home(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void SingnLocate() {
	SignIn.click();
}
}