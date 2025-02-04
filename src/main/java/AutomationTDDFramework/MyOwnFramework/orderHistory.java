package AutomationTDDFramework.MyOwnFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderHistory {
	
	WebDriver driver;
	public orderHistory(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);	
	}
	
	@FindBy(xpath="//button[@routerlink='/dashboard/myorders']")
	WebElement orderButton;
	
	
	public OrderComplete OrderHistoryPageNav() {
		// TODO Auto-generated method stub
		orderButton.click();
		return new OrderComplete(driver);
	}
	
	

}
