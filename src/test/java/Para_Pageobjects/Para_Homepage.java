package Para_Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Para_Homepage extends para_Base
{

	public Para_Homepage(WebDriver driver)
	{
		super(driver);
		
	}

	@FindBy(xpath="(//a[text()='Register'])")
	WebElement lnkcreateAcc;
	
	
	
	public void clickCreateAcclnk()
	{
		lnkcreateAcc.click();
	}
	
	
	
	
}
