package ExtentReport;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	@BeforeTest
	public static ExtentReports ExtentReportObject()
	{
	ExtentSparkReporter reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\index.html");
	reporter.config().setReportName("AutomationFramework");
	reporter.config().setDocumentTitle("Automation Sucks");
	ExtentReports report=new ExtentReports();
	report.attachReporter(reporter);
	return report;
	}
	
		
	

}
