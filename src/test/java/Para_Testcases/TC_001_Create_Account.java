package Para_Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Para_Pageobjects.Create_Account_page;
import Para_Pageobjects.Para_Homepage;

public class TC_001_Create_Account  extends Para_Baseclass
{
    @Test
	public void CreateAcTest()
	{
		Para_Homepage  hp=new Para_Homepage (driver);
	      hp.clickCreateAcclnk();
	      log.info("account creatation link clicking is successfull");
	      Create_Account_page cp = new Create_Account_page (driver);
	      cp.CreateAccountFunctionality(Username,Password);
	      log.info("account data is entered");
    	String Act_title =driver.getTitle();
    	String Exp_title = "ParaBank | Customer Created";
    	

    	
    	if(Act_title.equals(Exp_title))
    	{
    		Assert.assertTrue(true);
    		log.info("testcase passed");
    		log.info("account created ");
    	
    	}
    	else 
    	{	captureScreen("CreateAcTest");
    	    log.info("testcase failed");
    	}
    	
    	
    }
 
    
}
