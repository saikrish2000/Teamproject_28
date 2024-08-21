package Para_Utilties;

import java.io.FileInputStream;
import java.util.Properties;

public class Reading 
{
	public Properties pro;
   public Reading () 
   {
	   try 
	   {
	   FileInputStream fis= new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Para_Bank\\Configuration\\config.properties");
       pro=new Properties();
       pro.load(fis);
	   }
	   catch(Exception e) 
	   {
        
	   e.printStackTrace();
       }
   }
	   public String getApplicationurl()
	   {
		   String URL=pro.getProperty("baseURL");
	        return URL;
	   }
	   public String getUsername() 
	   {
		   String Username=pro.getProperty("Username");
	       return Username;   
	   }
	   public String getPassword()
	   {
		   String Password =pro.getProperty("Password");
	       return Password;   
	   }
   }

