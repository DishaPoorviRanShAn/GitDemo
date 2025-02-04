package AutomationTDDFramework.MyOwnFramework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class productSelectionStreams {
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
		WebElement prod=products.stream().filter(s->s.findElement(By.cssSelector("b")).getText().equals("IPHONE 13 PRO")).findFirst().orElse(null);
		prod.findElement(By.cssSelector("button.w-10")).click();


}
}
