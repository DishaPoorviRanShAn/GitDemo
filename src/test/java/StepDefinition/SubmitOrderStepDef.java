package StepDefinition;

import java.io.IOException;

import AutomationTDDFramework.MyOwnFramework.cartPage;
import AutomationTDDFramework.MyOwnFramework.catalogpage;
import AutomationTDDFramework.MyOwnFramework.landingPage;
import AutomationTDDFramework.MyOwnFramework.orderHistory;
import framework.testComponents.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubmitOrderStepDef extends baseClass {
	landingPage landingPage;
	catalogpage cp;
	cartPage cart;
	orderHistory oh;
	
	
	@Given("I launch the application")
	public void I_launch_the_appplication() throws IOException
	{
		driver=initiliseDriver();
		landingPage=new landingPage(driver);
		landingPage.gotopage();
	}
	
	@When("^I login with (.+) and (.+)$")
	public void I_login_application(String email, String password) throws InterruptedException
	{
		cp=landingPage.login(email, password);
	}
	
	@When("I add product to cart and submit")
	public void I_add_product_to_cart_and_Submit() throws InterruptedException
	{
		cartPage cart=cp.catalogPage();
		oh=cart.cartpage();
		
	}
	
	@Then("I am able to submit Order")
	public void I_am_able_to_submit_Order() throws InterruptedException
	{
		
		oh.OrderHistoryPageNav();
	}

}
