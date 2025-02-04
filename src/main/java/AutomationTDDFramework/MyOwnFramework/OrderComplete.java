package AutomationTDDFramework.MyOwnFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderComplete {
	
	WebDriver driver;

	public OrderComplete(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//tr/td[1]/following-sibling::td")
	List <WebElement> list;
	
	public void productList()
		{
		List<WebElement> prods1=list.stream().filter(s->s.getText().equals("IPHONE 13 PRO")).toList();	
       System.out.println(prods1.get(1).getText());
		}
}
