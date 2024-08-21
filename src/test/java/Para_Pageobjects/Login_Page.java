package Para_Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;


public class Login_Page extends para_Base
{
 public Login_Page(WebDriver driver)
 {
	 super(driver);
 }
 
 @FindBy(name="username")
  WebElement  txt_Username;
  
 @FindBy(name ="password")
  WebElement txt_password;
 
 @FindBy(xpath =("(//input[@class='button'])[1]"))
  WebElement btn_login;

public void SetUsername(String Username)
{
	txt_Username.sendKeys(Username);
}	
 public void setPassword(String Password)
 {
	 txt_password.sendKeys(Password);
	 
 }
 public void clickLoginBtn()
 {
	 btn_login.click();
	
 }

 
 
}
