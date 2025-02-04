package AutomationTDDFramework.MyOwnFramework;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class productselection {
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Disha gaur\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://rahulshettyacademy.com/client/");
		driver.findElement(By.id("userEmail")).sendKeys("dishagaur18@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Poorva@0411");
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(2000);
		


		List <WebElement> products=driver.findElements(By.xpath("//div[@class='card']"));
		System.out.println(products.size());
		for(int i=0;i<products.size();i++)
		{
			WebElement acc=products.get(i);
			
			System.out.println(acc.findElement(By.cssSelector("b")).getText());
		}
		
	}
}
