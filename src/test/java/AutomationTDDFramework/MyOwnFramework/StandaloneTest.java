package AutomationTDDFramework.MyOwnFramework;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import framework.testComponents.baseClass;

//import framework.testComponents.baseClass;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class StandaloneTest extends baseClass{
	
		@Test
		public void submitOrder() throws IOException, InterruptedException
		{
			
		String name="dishagaur18@gmail.com";
		String password="Poorva@0411";
		catalogpage cp=landingPage.login(name, password);
			cartPage cart=cp.catalogPage();
			cart.cartpage();
			}
		
		@Test(dependsOnMethods= {"submitOrder"})
		public void orderHistory() throws InterruptedException
		{
			String name="dishagaur18@gmail.com";
			String password="Poorva@0411";
			catalogpage cp=landingPage.login(name, password);
			cartPage cart=cp.catalogPage();
			orderHistory oh=cart.cartpage();
			oh.OrderHistoryPageNav();
		}
		
	}
