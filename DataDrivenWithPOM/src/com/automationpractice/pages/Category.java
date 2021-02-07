package com.automationpractice.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Category {
@FindBy(linkText="T-SHIRTS")
private WebElement lin;

@FindBy(xpath="//a[contains(@class,'button lnk_view btn btn-default')]")
private WebElement rev;

@FindBy(xpath="//div[contains(@class,'product-container')]")
private WebElement hove;

@FindBy(linkText="More")
private WebElement mo;

public Category(WebDriver driver) {
PageFactory.initElements(driver,this);	
}
//@SuppressWarnings("null")
public void writeReview() {
	lin.click();
	
	WebDriver driver = null;
	Actions hover=new Actions(driver);
	hover.moveToElement( rev).moveToElement( hove).click().build().perform();
	mo.click();
	//hover.moveToElement(hove);
	//action.moveToElement(driver.findElement(xpath)).moveToElement(driver.findElement(xpath1)).click().build().perform();


}
}
