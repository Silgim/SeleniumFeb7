package com.automationpractice.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class General {
	WebDriver driver;
	@BeforeTest
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	@Test
	public void testingEcommerceApp() {
		/*
		//mouse hover automationpractice.com/index.php
		WebElement Women=driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(1) > a"));
		Actions hover=new Actions(driver);
		hover.moveToElement(Women).perform();
		driver.findElement(By.linkText("Summer Dresses")).click();
		//DropDown box
		WebElement dropDownBox=driver.findElement(By.id("selectProductSort"));
		Select dd=new Select(dropDownBox);
		dd.selectByIndex(3);
		driver.findElement(By.id("layered_id_attribute_group_2")).click();
		 */
		/*
		WebElement Dress=driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a"));
		Actions hover=new Actions(driver);
		hover.moveToElement(Dress).perform();
		driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(2) > ul > li:nth-child(3) > a")).click();
		Actions hover1=new Actions(driver);
		WebElement dress1=driver.findElement(By.id("//div[contains(@class,'product-container')][1]"));
		hover1.moveToElement(dress1).perform();
		driver.findElement(By.id("category")).click();
		 */

		//DropDown box
		//WebElement dropDownBox=driver.findElement(By.id("selectProductSort"));
		//Select dd=new Select(dropDownBox);
		//dd.selectByIndex(3);
		//driver.findElement(By.id("layered_id_attribute_group_2")).click();



		/*
		//Register==================http://automationpractice.com/index.php
		//driver.findElement(By.id("authentication")).click();
		driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
		driver.findElement(By.id("email_create")).sendKeys("malu4@hotmail.com");
		//input[contains(@name,'SubmitCreate')]
		driver.findElement(By.id("SubmitCreate")).click();
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("malu");
		driver.findElement(By.id("customer_lastname")).sendKeys("rex");
		driver.findElement(By.id("passwd")).sendKeys("password");
		WebElement dropDownBox=driver.findElement(By.id("days"));
		Select dd=new Select(dropDownBox);
		dd.selectByIndex(3);
		WebElement dropDownBox2=driver.findElement(By.id("months"));
		Select dd2=new Select(dropDownBox2);
		dd2.selectByIndex(2);
		WebElement dropDownBox3=driver.findElement(By.id("years"));
		Select dd3=new Select(dropDownBox3);
		dd3.selectByValue("2000");
		driver.findElement(By.id("firstname")).sendKeys("Malu");
		driver.findElement(By.id("lastname")).sendKeys("Rex");
		driver.findElement(By.id("address1")).sendKeys("890 Odum Rd");
		driver.findElement(By.id("city")).sendKeys("Gardendale");
		driver.findElement(By.id("id_state")).sendKeys("albama");
		driver.findElement(By.id("postcode")).sendKeys("35071");
		//WebElement dropDownBox4=driver.findElement(By.id("id_country"));
		//Select dd4=new Select(dropDownBox4);
		//dd4.selectByValue("United States");
		driver.findElement(By.id("id_country")).sendKeys("United States");
		driver.findElement(By.id("phone_mobile")).sendKeys("205-631-8110");
		driver.findElement(By.id("submitAccount")).click();
		String actualText=driver.findElement(By.xpath("//p[contains(@class,'info-account')]")).getText();
		String expectedText="Welcome to your account. Here you can manage all of your personal information and orders.";
		Assert.assertEquals(actualText, expectedText);
		 */

		/*
		//valid login+++++++++++++===================

		driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
		driver.findElement(By.id("email")).sendKeys("malu3@hotmail.com");
		driver.findElement(By.id("passwd")).sendKeys("password");
		driver.findElement(By.id("SubmitLogin")).click();
		String actualText=driver.findElement(By.xpath("//p[contains(@class,'info-account')]")).getText();
		String expectedText="Welcome to your account. Here you can manage all of your personal information and orders.";
		Assert.assertEquals(actualText, expectedText);
		 */

		/*
		//Invalid Login
		driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
		driver.findElement(By.id("email")).sendKeys("malu3@hotmail.com");
		driver.findElement(By.id("passwd")).sendKeys("pass");
		driver.findElement(By.id("SubmitLogin")).click();
		String actualErrMsg=driver.findElement(By.xpath("//div[contains(@class,'alert alert-danger')][1]/p")).getText();
		String expectedErrMsg="There is 1 error";
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
		 */

		/*
		//Make sure there is a SignOut button is available
		driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
		driver.findElement(By.id("email")).sendKeys("malu3@hotmail.com");
		driver.findElement(By.id("passwd")).sendKeys("password");
		driver.findElement(By.id("SubmitLogin")).click();
		Boolean dis=driver.findElement(By.xpath("//a[contains(@class,'logout')]")).isDisplayed();
		Assert.assertTrue(dis, "Sign Out button displayed");
		 */

		/*
		//Make sure is able to SignOut after the SignIn
		driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
		driver.findElement(By.id("email")).sendKeys("malu3@hotmail.com");
		driver.findElement(By.id("passwd")).sendKeys("password");
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.xpath("//a[contains(@class,'logout')]")).click();
		String actualText=driver.findElement(By.xpath("//h1[contains(@class,'page-heading')]")).getText();
		String expectedText="AUTHENTICATION";
		Assert.assertEquals(actualText, expectedText);
		 */

		/*
		//Review-Click on add review for the product
		driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
		driver.findElement(By.id("email")).sendKeys("malu2@hotmail.com");
		driver.findElement(By.id("passwd")).sendKeys("password");
		driver.findElement(By.id("SubmitLogin")).click();
		//driver.findElement(By.xpath("//a[contains(@title,'T-shirts')]")).click();
		driver.findElement(By.linkText("T-SHIRTS")).click();
		Actions hover=new Actions(driver);
		WebElement dress=driver.findElement(By.xpath("//div[contains(@class,'product-container')]"));
		//WebElement dress=driver.findElement(By.xpath("//li[contains(@class,'ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line')]"));
		hover.moveToElement(dress).perform();
		driver.findElement(By.linkText("More")).click();
		driver.findElement(By.linkText("Write a review")).click();
		driver.findElement(By.id("comment_title")).sendKeys("Good");
		driver.findElement(By.id("content")).sendKeys("It is very comfortable");
		driver.findElement(By.id("submitNewMessage")).click();
		String actualMsg=driver.findElement(By.xpath("//div[contains(@class,'fancybox-inner')]/p[1]")).getText();
		String expectedMsg="Your comment has been added and will be available once approved by a moderator";
		Assert.assertEquals(actualMsg, expectedMsg);
		 */

		/*
		//Click on a Facebook Page to share the product information
		driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
		driver.findElement(By.id("email")).sendKeys("malu2@hotmail.com");
		driver.findElement(By.id("passwd")).sendKeys("password");
		driver.findElement(By.id("SubmitLogin")).click();
		//driver.findElement(By.xpath("//a[contains(@title,'T-shirts')]")).click();
		driver.findElement(By.linkText("T-SHIRTS")).click();
		Actions hover=new Actions(driver);
		WebElement dress=driver.findElement(By.xpath("//div[contains(@class,'product-container')]"));
		//WebElement dress=driver.findElement(By.xpath("//li[contains(@class,'ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line')]"));
		hover.moveToElement(dress).perform();
		driver.findElement(By.linkText("More")).click();
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-default btn-facebook')]")).click();
		 */
		
		//purchase 3 product from different category and Ensure that the order is placed by verifying the message displayed
		driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
		driver.findElement(By.id("email")).sendKeys("malu2@hotmail.com");
		driver.findElement(By.id("passwd")).sendKeys("password");
		driver.findElement(By.id("SubmitLogin")).click();
		//driver.findElement(By.xpath("//a[contains(@title,'T-shirts')]")).click();
		driver.findElement(By.linkText("T-SHIRTS")).click();
		Actions hover3=new Actions(driver);
		WebElement dress3=driver.findElement(By.xpath("//div[contains(@class,'product-container')]"));
		//WebElement dress=driver.findElement(By.xpath("//li[contains(@class,'ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line')]"));
		hover3.moveToElement(dress3).perform();
		driver.findElement(By.linkText("Add to cart")).click();
		////span[contains(@title,'Continue shopping')]
		driver.findElement(By.xpath("//span[contains(@title,'Continue shopping')]")).click();
		driver.findElement(By.linkText("DRESSES")).click();
		Actions hover=new Actions(driver);
		WebElement dress=driver.findElement(By.xpath("//div[contains(@class,'product-container')]"));
		hover.moveToElement(dress).perform();
		driver.findElement(By.linkText("Add to cart")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Proceed to checkout')][1]")).click();
		//driver.findElement(By.xpath("//button[contains(@name,'processAddress')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'button btn btn-default standard-checkout button-medium')]")).click();
		driver.findElement(By.xpath("//button[contains(@name,'processAddress')]")).click();
		driver.findElement(By.id("uniform-cgv")).click();
		driver.findElement(By.xpath("//button[contains(@name,'processCarrier')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'bankwire')]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'button btn btn-default button-medium')]")).click();
		String actualMsg=driver.findElement(By.xpath("//h1[contains(@class,'page-heading')]")).getText();
		String expectedMsg="ORDER CONFIRMATION";
		Assert.assertEquals(actualMsg, expectedMsg);
		//String actualMsg=driver.findElement(By.xpath("//i[contains(@class,'icon-ok')]")).getText();
		//driver.findElement(By.xpath("//span[contains(@title,'Continue shopping')]")).click();

		//WebElement dress=driver.findElement(By.xpath("//li[contains(@class,'ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line')]"));
/*

		driver.findElement(By.linkText("Add to cart")).click();
		driver.findElement(By.xpath("//span[contains(@title,'Continue shopping')]")).click();
		Actions hover1=new Actions(driver);
		WebElement dress1=driver.findElement(By.xpath("//a[contains(@title,'Dresses')][1]"));
		//WebElement dress=driver.findElement(By.xpath("//li[contains(@class,'ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line')]"));
		hover1.moveToElement(dress1).perform();
		driver.findElement(By.xpath("//a[contains(@title,'Summer Dresses')][1]")).click();
		driver.findElement(By.xpath("//a[contains(@data-id-product,'6')][1]")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Proceed to checkout')]")).click();
		//String actualPrice=driver.findElement(By.xpath("//span[contains(@id,'total_price')]")).getText();
		driver.findElement(By.xpath("//a[contains(@title,'Proceed to checkout')][1]")).click();
		 */
		
		/* Amazon hover======================
		WebElement signIn=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	Actions hover=new Actions(driver);
	hover.moveToElement(signIn).perform();
	driver.findElement(By.linkText("Create a List")).click();
	}
		 */

//TAKING THE PRODUCT FROM DRESSESS
		 
	/*
		 driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
		driver.findElement(By.id("email")).sendKeys("malu2@hotmail.com");
		driver.findElement(By.id("passwd")).sendKeys("password");
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.linkText("DRESSES")).click();
		Actions hover=new Actions(driver);
		WebElement dress=driver.findElement(By.xpath("//div[contains(@class,'product-container')]"));
		hover.moveToElement(dress).perform();
		driver.findElement(By.linkText("Add to cart")).click();
		
		*/
	}
	@AfterTest
	public void closeApplication() {
		driver.close();
	}


}
