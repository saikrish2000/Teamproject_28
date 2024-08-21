package Para_Testcases;


import org.testng.Assert;
import org.testng.annotations.Test;


import Para_Pageobjects.Login_Page;


public class TC_002_Para_Login extends Para_Baseclass
{
	@Test
public void LoginTest()
{
		Login_Page lp= new Login_Page(driver);
		lp.SetUsername(Username);
		log.info("username is entered");
		lp.setPassword(Password);
		log.info("password is entered");
		lp.clickLoginBtn();
		log.info("button is clicked");
		

	 	String Act_title =driver.getTitle();
	 	String Exp_title = "ParaBank | Accounts Overview";
	
	 	
	 	if(Act_title.equals(Exp_title))
	 	{
	 		Assert.assertTrue(true);
	 		captureScreen("LoginTest");	
	 		log.info("Account login done");  	
	 	
	 	}
	 	else 
	 	{
	 		captureScreen("LoginTest");	
	 		log.info("Account login not done");
	 	}
	
    }
}

