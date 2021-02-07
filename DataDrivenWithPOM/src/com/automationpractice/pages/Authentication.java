package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authentication {
	@FindBy(id="email_create")
	private WebElement emailReg;

	@FindBy(xpath="//button[contains(@id,'SubmitCreate')]")
	private WebElement create;

	

	public Authentication(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void register(String email) {
		emailReg.sendKeys(email);
		create.click();
	}
	
}

