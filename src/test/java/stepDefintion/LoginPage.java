package stepDefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	@Given("User is on the amazon login page")
	public void user_is_on_the_amazon_login_page() {
		System.out.println("user is on login page");
	}

	@Given("User is on the search  page")
	public void user_is_on_the_search_page() {
		System.out.println("user is on search page");
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
		System.out.println("user enters username and password");
	}

	@Then("user is on the home page")
	public void user_is_on_the_home_page() {
		System.out.println("user is on the home page");
	}

	@When("User searches for the item")
	public void user_searches_for_the_item() {
		System.out.println("user searches the phone");
	}

	@Then("user add the item to the cart")
	public void user_add_the_item_to_the_cart() {
		System.out.println("user adds the item to the cart");
	}

	@Given("User is on the cart  page")
	public void user_is_on_the_cart_page() {
		System.out.println("user is cart page");
	}

	@When("User increases the quantity")
	public void user_increases_the_quantity() {
		System.out.println("user increases the qunatity");
	}

	@Then("user proceeds to the checkout")
	public void user_proceeds_to_the_checkout() {
		System.out.println("user proceeds to the checkout");
	}
	
	

	@Then("user does the payment")
	public void user_payment() {
		System.out.println("user proceeds to the checkout");
	}

	@Then("user uses the gpay")
	public void user_gpay() {
		System.out.println("user proceeds to the checkout");
	}

}
