package Listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import ExtentReport.ExtentReport;
import framework.testComponents.baseClass;

public class Listener extends baseClass implements ITestListener {
	ExtentTest test;
	ExtentReports report=ExtentReport.ExtentReportObject();
	
	@Override
	public  void onTestStart(ITestResult result) {
		test=report.createTest(result.getMethod().getMethodName());
		
	  }

	  
	@Override
	  public  void onTestSuccess(ITestResult result) {
	    test.pass(result.getMethod().getMethodName());
	    
	  }

	 
	@Override
	  public  void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		String path=null;
		try {
			driver=(WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 path=takeScreenshot(result.getMethod().getMethodName(),driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		test.addScreenCaptureFromBase64String(path, result.getMethod().getMethodName());
		
	    
	  }
	
	@Override
	public void onFinish(ITestContext context) {
	   report.flush();
	  }


	
	
	
	

}
