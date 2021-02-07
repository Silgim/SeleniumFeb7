package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount {
	@FindBy(xpath="//label[contains(@for,'id_gender2')]")
	private WebElement gender;

	@FindBy(id="customer_firstname")
	private WebElement fName;

	@FindBy(id="customer_lastname")
	private WebElement lName;

	@FindBy(id="passwd")
	private WebElement pwd;

	@FindBy(id="days")
	private WebElement day;

	@FindBy(id="months")
	private WebElement months;

	@FindBy(id="years")
	private WebElement year;

	@FindBy(id="firstname")
	private WebElement firName;

	@FindBy(id="lastname")
	private WebElement lstName;

	@FindBy(id="address1")
	private WebElement adr1;

	@FindBy(id="city")
	private WebElement cit;

	@FindBy(id="id_state")
	private WebElement state;

	@FindBy(id="postcode")
	private WebElement zipCode;

	@FindBy(id="id_country")
	private WebElement country;

	@FindBy(id="phone_mobile")
	private WebElement mobile;

	@FindBy(xpath="//button[contains(@id,'submitAccount')]")
	private WebElement subBtn;


	public CreateNewAccount(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void StartNewReg(String firstName,String lastName,String paWord,String fsName,String lsName,String address,String city,String poCode,String con,String mobNo) {
		gender.click();
		fName.sendKeys(firstName);
		lName.sendKeys(lastName);
		pwd.sendKeys(paWord);
		Select days=new Select(day);
		days.selectByIndex(3);
		Select month=new Select(months);
		month.selectByIndex(2);
		Select years=new Select(year);
		years.selectByValue("2000");
		firName.sendKeys(fsName);
		lstName.sendKeys(lsName);
		adr1.sendKeys("addr");
		cit.sendKeys(city);
		Select sta=new Select(state);
		sta.selectByIndex(3);
		zipCode.sendKeys(poCode);
		country.sendKeys(con);
		mobile.sendKeys(mobNo);
		subBtn.click();
	}
	
}
