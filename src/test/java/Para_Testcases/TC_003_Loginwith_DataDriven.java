package Para_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Para_Pageobjects.Login_Page;
import Para_Utilties.ExcelRead;

public class TC_003_Loginwith_DataDriven extends Para_Baseclass
{
   @Test(dataProvider="LoginData")
	public void LoginTest_DataDriven(String Username,String Password)
	{
		
		Login_Page lp= new Login_Page(driver);
		
		lp.SetUsername(Username);
		lp.setPassword(Password);
		lp.clickLoginBtn();
		
	}
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		String path="C:\\Users\\Lenovo\\eclipse-workspace\\Para_Bank\\Testdata\\LoginData.xlsx";
	    int rownum = ExcelRead.getRowCount(path, "Sheet1");
	    int cellcount=ExcelRead.getCellCount(path, "Sheet1",1);
	
	 String logindata[][]=new String [rownum][cellcount];
	 for(int i=1;i<=rownum;i++)
	  {
		 for(int j=0;j<cellcount;j++)
		 {
			 logindata[i-1][j]=ExcelRead.getCellData(path,"Sheet1",i,j);
		 } 
	 
	  }
	 return logindata;
	}
	
	
}
