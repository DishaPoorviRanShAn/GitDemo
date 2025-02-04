package AutomationTDDFramework.MyOwnFramework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class logicforcart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Disha gaur\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		landingPage landingPage=new landingPage(driver);
		String prod1="IPHONE 13 PRO";
		String country=" India";
		
		driver.get("https://rahulshettyacademy.com/client/");
			driver.findElement(By.id("userEmail")).sendKeys("dishagaur18@gmail.com");
			driver.findElement(By.id("userPassword")).sendKeys("Poorva@0411");
			driver.findElement(By.id("login")).click();
			Thread.sleep(2000);
			List <WebElement> products=driver.findElements(By.xpath("//div[@class='card']"));
			WebElement prod=products.stream().filter(s->s.findElement(By.cssSelector("b")).getText().equals("IPHONE 13 PRO")).findFirst().orElse(null);
			prod.findElement(By.cssSelector("button.w-10")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
			
			WebElement cartitem=driver.findElement(By.xpath("//div[@class='cart']"));
			List <WebElement> totalitem=cartitem.findElements(By.xpath("//ul"));
			System.out.println(totalitem.size());
			String star=cartitem.findElement(By.cssSelector("h3")).getText();
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
				}
					//countrylist.get(i).findElement(By.xpath("(//span[@class='ng-star-inserted'])[1]")).click();
						
			}
//			WebElement p=countrylist.stream().filter(s->s.findElement(By.xpath("//span[@class='ng-star-inserted']")).getText().equals(country)).findFirst().orElse(null);
//			p.click();
//			
				



	}

	
}
