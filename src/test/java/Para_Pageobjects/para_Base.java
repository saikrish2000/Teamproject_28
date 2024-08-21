package Para_Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class para_Base
{
public static WebDriver driver;
      public para_Base(WebDriver driver)
      {
    	  this.driver=driver;
    	  PageFactory.initElements(driver,this);
      }
}
