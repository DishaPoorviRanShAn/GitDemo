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

public class errorValidations extends baseClass{
		@Test
		public void submitOrder() throws IOException, InterruptedException
		{
		String name="dishagaur18@gmail.com";
		String password="Poorva@Idrees@chotepapa@vedant";
		landingPage.login(name, password);
		String str=landingPage.errormessageinvalidLogin();
		System.out.println(str);
			
	}
	}
