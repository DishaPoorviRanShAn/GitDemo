package framework.testComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import AutomationTDDFramework.MyOwnFramework.landingPage;

public class baseClass {
	
	public WebDriver driver;
	public landingPage landingPage;

	public WebDriver initiliseDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Disha gaur\\eclipse-workspace\\MyOwnFramework\\src\\main\\java\\framework\\resources\\GlobalProperties.properties");
		prop.load(fis);
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Disha gaur\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	return driver;
		
	}
	
	@BeforeMethod
	public landingPage launchingApplication() throws IOException
	{
		driver=initiliseDriver();
		 landingPage=new landingPage(driver);
		landingPage.gotopage();
		return new landingPage(driver);
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
	
	public String takeScreenshot(String testCaseName,WebDriver driver) throws IOException
		{
	TakesScreenshot ts= (TakesScreenshot)(driver);	
	File Source=ts.getScreenshotAs(OutputType.FILE);
	File file= new File(System.getProperty("user.dir")+"//reports//"+testCaseName+".png");
	FileUtils.copyFile(Source, file);
	return System.getProperty("user.dir")+"//reports//"+testCaseName+".png";
	
	}

	
	

}
