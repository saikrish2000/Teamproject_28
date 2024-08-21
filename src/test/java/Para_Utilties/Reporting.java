package Para_Utilties;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Para_Testcases.Para_Baseclass;

public class Reporting implements ITestListener
{
  
	public ExtentSparkReporter reporter;
	public ExtentReports reports;
	public ExtentTest test;
	
	public void onStart(ITestContext context)
	{
	    // String timestamp =new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		// String repName ="para-report-"+timestamp+".html";
	
	 reporter = new ExtentSparkReporter ("C:\\Users\\Lenovo\\eclipse-workspace\\Para_Bank\\Reports\\LatestReport.hxml");
	 reporter.config().setDocumentTitle("Automation Testing Report ");
	 reporter.config().setReportName("Login Functionality Extent Report");
	 reporter.config().setTheme(Theme.DARK);
	
	 
	 reports =new ExtentReports();
	 reports.attachReporter(reporter);
	 reports.setSystemInfo("user","saikrishna");
	 reports.setSystemInfo("Environment","QA");
	 reports.setSystemInfo("Hostname","Local Host");
	 reports.setSystemInfo("os","Windows 10");
	 reports.setSystemInfo("Browsers","chrome,edge,firefox");
	}
	
	
	public void onTestSuccess(ITestResult tr) 
	{ 
		test= reports.createTest(tr.getName());
		test.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN)); 
		System.out.println("test is passed");
		try 
		{
			String image=new Para_Baseclass().captureScreen(tr.getName());
			test.addScreenCaptureFromPath(image);
			
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
	public void onTestFailure(ITestResult tr) 
	{ 
		test= reports.createTest(tr.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));  
		System.out.println("test is failed");
		try {
			String image=new Para_Baseclass().captureScreen(tr.getName());
			test.addScreenCaptureFromPath(image);
			
		}catch(Exception e2) {
			e2.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult tr)
	{
		test= reports.createTest(tr.getName());
		test.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));   	
		
		
	}
	
	public void onFinish(ITestContext context) 
	{
		reports.flush(); 	
	}
	
}
