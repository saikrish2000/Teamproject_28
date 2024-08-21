package Para_Testcases;

import java.io.File;

import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Para_Utilties.Reading;

public class Para_Baseclass 
{
  public static WebDriver driver;
  
  public Logger log;
  
  Reading rd= new Reading();
  public String AppURL=rd.getApplicationurl();
  public String Username =rd.getUsername();
  public String Password =rd.getPassword();
  @BeforeClass
  public void setup()
   {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
    driver.get(AppURL);
	driver.manage().window().maximize();
   log=Logger.getLogger(this.getClass());
   PropertyConfigurator.configure("log4j.properties");
   
   }
  
  
  @AfterClass
    public void teardown()
   {
	driver.quit();
   }
 
  public String captureScreen(String name)  {

	//String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		TakesScreenshot ss=(TakesScreenshot) driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		String destination= "./Screenshots/"+name+".png";
		
		try {
			FileUtils.copyFile(source, new File(destination));
		}catch(Exception e) {
			e.getMessage();
		}
		return destination;

	}

  
}
