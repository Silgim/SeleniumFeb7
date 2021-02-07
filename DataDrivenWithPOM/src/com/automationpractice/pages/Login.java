package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(xpath="//button[contains(@id,'SubmitLogin')]")
	private WebElement login;
	
	@FindBy(xpath="//div[contains(@class,'alert alert-danger')]/p")
	private WebElement err;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void loginApp(String uName,String passWord) {
		email.sendKeys(uName);
		password.sendKeys(passWord);
		login.click();
	}
public String invalidLogin(String msg) {
	String message=err.getText();
	return message;
}
}
