package stepDefintion;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTab {

	WebDriver driver;

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();

	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password(DataTable table) {

		Map<Object, Object> asMap = table.asMap(getClass(), getClass());

		Object object = asMap.get("username");

		System.out.println(object);

	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("User is on the home page")
	public void user_is_on_the_home_page() {

		System.out.println(driver.getTitle());
	}

}
