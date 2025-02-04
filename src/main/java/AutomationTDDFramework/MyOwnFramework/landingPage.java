package AutomationTDDFramework.MyOwnFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage  {
	WebDriver driver;

	public landingPage(WebDriver driver)
	{
	this.driver=driver;	
	PageFactory.initElements(driver,this);
	
	}
	//pagefactory concept
	
	@FindBy(id="userEmail")
	WebElement userid;
	
	@FindBy(id="userPassword")
	WebElement password1;
	
	@FindBy(id="login")
	WebElement submit;
	
	@FindBy(css="[class*='toast-message']")
	WebElement error;
	
	public void gotopage()
	{
		 driver.get("https://rahulshettyacademy.com/client/");
	}
	
	public catalogpage login(String name, String password) throws InterruptedException
	{
		userid.sendKeys(name);
		password1.sendKeys(password);
		submit.click();
		return new catalogpage(driver);
	}
	
		

	public String errormessageinvalidLogin() {
		// TODO Auto-generated method stub
		return error.getText();
	}
	}
	

	


