package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
@FindBy(xpath="//a[contains(@class,'logout')]")
private WebElement signOut;

@FindBy(xpath="//h1[contains(@class,'page-heading')]")
private WebElement LogMsg;

public LogOut(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void SignOut() {
	signOut.click();
}
public String LoginMsg(String msg) {
	String LogText=LogMsg.getText();
	return LogText;
}
}
