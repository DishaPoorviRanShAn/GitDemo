package AutomationTDDFramework.MyOwnFramework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class testclass {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Disha gaur\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/client/");
		//NewUserReg(driver);
		loginPage(driver);
		checkbox(driver);
		
		
		
	}

	public static void loginPage(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("userEmail")).sendKeys("dishagaur18@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Poorva@0411");
		driver.findElement(By.id("login")).click();
		
	}
	
	public static void NewUserReg(WebDriver driver)
	{
		driver.findElement(By.className("login-wrapper-footer-text")).click();
		driver.findElement(By.id("firstName")).sendKeys("Disha");
		driver.findElement(By.id("lastName")).sendKeys("Gaur");
		driver.findElement(By.id("userEmail")).sendKeys("dishagaur18@gmail.com");
		driver.findElement(By.cssSelector("input#userMobile")).sendKeys("1236547896");
		Select select=new Select(driver.findElement(By.className("custom-select")));
		select.selectByIndex(1);
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		driver.findElement(By.id("userPassword")).sendKeys("Poorva@0411");
		driver.findElement(By.id("confirmPassword")).sendKeys("Poorva@0411");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		
		
	}
	
	public static void checkbox(WebDriver driver)
	{
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			WebElement listval=list.get(i);
			String value=listval.findElement(By.xpath("//following-sibling::label")).getText();
			System.out.println(value);
			if(value.equalsIgnoreCase("laptops"))
			{
				list.get(i).click();
				break;
			}
		}
	}

}
