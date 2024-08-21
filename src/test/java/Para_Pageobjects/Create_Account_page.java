package Para_Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Create_Account_page extends para_Base
{

	public Create_Account_page(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id="customer.firstName")
	WebElement txt_FirstName;
	
	@FindBy(id="customer.lastName")
	WebElement txt_LastName;
	
	@FindBy(id="customer.address.street")
	WebElement txt_Address;
	
	@FindBy(id="customer.address.city")
	WebElement txt_City;
	
	@FindBy(id="customer.address.state")
	WebElement txt_State;
	
	@FindBy(id="customer.address.zipCode")
	WebElement txt_ZipCode;
	
	@FindBy(id="customer.phoneNumber")
	WebElement txt_PhoneNumber;
	
	@FindBy(id="customer.ssn")
	WebElement txt_ssn;
	
	@FindBy(id="customer.username")
	WebElement txt_Username;
	
	@FindBy(id="customer.password")
	WebElement txt_Password;
	
	@FindBy(id="repeatedPassword")
	WebElement txt_CPassword;
	
	@FindBy(xpath="(//input[@class='button'])[2]")
	WebElement btn_register;
	
	
	
	public void CreateAccountFunctionality(String Username,String Password)
	{
		txt_FirstName.sendKeys("Sai");
		txt_LastName.sendKeys("krishna");
		txt_Address.sendKeys("Saradha colony 6 th line");
		txt_City.sendKeys("Guntur");
		txt_State.sendKeys("Andhra pradesh");
		txt_ZipCode.sendKeys("522002");
		txt_PhoneNumber.sendKeys("8919030530");
		txt_ssn.sendKeys("4897898");
		txt_Username.sendKeys(Username);
		txt_Password.sendKeys(Password);
		txt_CPassword.sendKeys(Password);
		btn_register.click();
	}	
	 
	 
}
