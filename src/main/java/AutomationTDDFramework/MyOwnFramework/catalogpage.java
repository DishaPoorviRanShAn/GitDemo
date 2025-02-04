package AutomationTDDFramework.MyOwnFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class catalogpage {

	WebDriver driver;

	public catalogpage(WebDriver driver)
	{
	this.driver=driver;	
	PageFactory.initElements(driver,this);
	
	}

	@FindBy(xpath="//div[@class='card']")
	List <WebElement> products;
	By product=By.cssSelector("b");
	@FindBy(xpath="//button[@routerlink='/dashboard/cart']")
	WebElement addToCart;
	
	
	
	
	public cartPage catalogPage() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement prod=products.stream().filter(s->s.findElement(product).getText().equals("IPHONE 13 PRO")).findFirst().orElse(null);
		prod.findElement(By.cssSelector("button.w-10")).click();
		Thread.sleep(2000);
		addToCart.click();
		return new cartPage(driver);

	}
}
