package kdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodClass {
static WebDriver driver;
 public void OpenBrowser() {
	 driver=new ChromeDriver();
 }
 public void MaxBrowser() {
	 driver.manage().window().maximize();
 }
 public void impWait() {
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 }
 public void navigateApp(String baseUrl) {
	 driver.get(baseUrl);
 }
 public void clickButton(String locVal) {
	 driver.findElement(By.xpath(locVal));
 }
 public void enterUnameText(String locVal,String data) {
	 driver.findElement(By.id(locVal)).sendKeys(data);
 }
 public void enterPasText(String locVal,String data) {
	 driver.findElement(By.id(locVal)).sendKeys(data);
 }
public void clickBtn(String locVal) {
	driver.findElement(By.id(locVal)).click();
}
public String verifyErMsg(String loc,String locVal) {
	String msg=driver.findElement(By.xpath(locVal)).getText();
	return msg;
}
public void closeApp() {
	driver.close();
}
}
