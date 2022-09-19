package stepDefintion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemo {

	@Given("user is on the first page")
	public void user_is_on_the_first_page() {
		System.out.println("this is my frst page");
	}

	@When("user is on the second page")
	public void user_is_on_the_second_page() {
		
		System.out.println("this is my second page");
	}

	@Then("user is on the third page")
	public void user_is_on_the_third_page() {
		
		System.out.println("this is my third page");
	}

}
