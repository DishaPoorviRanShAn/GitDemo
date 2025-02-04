package AutomationTDDFramework.MyOwnFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage {
	WebDriver driver;
	String prod1="IPHONE 13 PRO";

		public cartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;	
		PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//div[@class='cart']")
		WebElement cart;
		
		public orderHistory cartpage() throws InterruptedException
		{
		List <WebElement> totalitem=cart.findElements(By.xpath("//ul"));
		System.out.println(totalitem.size());
		String star=cart.findElement(By.cssSelector("h3")).getText();
		if(prod1.equals(star))
		{
			System.out.println("test is passed"+ star);
			driver.findElement(By.xpath("//li[@class='totalRow']/button")).click();
			
		}
		
		else
		{
			System.out.println("test is failed"+ star);
			
		}
		driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> countrylist=driver.findElements(By.xpath("//button[@class='ta-item list-group-item ng-star-inserted']"));
		System.out.println(countrylist.size());
		for(int i=0;i<countrylist.size();i++)
		{
			System.out.println(countrylist.get(i).getText());
			if(countrylist.get(i).getText().equalsIgnoreCase("India"))
			{
				countrylist.get(i).click();
				driver.findElement(By.xpath("//div/a[@class='btnn action__submit ng-star-inserted']")).click();
			}
				//countrylist.get(i).findElement(By.xpath("(//span[@class='ng-star-inserted'])[1]")).click();
					
		}
//		
return new orderHistory(driver);

		}}
