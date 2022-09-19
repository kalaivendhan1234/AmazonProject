package stepDefintion;

import java.util.List;
import java.util.Map;

import javax.swing.table.TableCellEditor;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableImp {

	@Given("the user launches the url")
	public void the_user_launches_the_url() {
	}

	@When("the user enters username and password")
	public void the_user_enters_username_and_password(DataTable table) {

		Map<String, String> asMap = table.asMap(String.class, String.class);
		
		System.out.println(asMap);

//		List<Map<String, String>> asMaps = table.asMaps();
//		
//		System.out.println(asMaps);

//		System.out.println(((table.asLists()).get(0)).get(0));

//		List<List<String>> cells = table.cells();
//		
//		System.out.println(cells);

//		List<String> row = table.row(2);
//		
//		System.out.println(row.get(0));

		/*
		 * List<String> cred = table.row(0);
		 * 
		 * String username = cred.get(0); String password = cred.get(1);
		 */

		/*
		 * List<String> asList = table.asList();
		 * 
		 * System.out.println(asList.get(0)); System.out.println(asList.get(1));
		 */

//		List<List<String>> asLists = table.asLists();
//
//		List<String> list = asLists.get(2);
//
//		String string = list.get(0);
//		String string2 = list.get(1);
//		System.out.println(string);
//		System.out.println(string2);

	}

	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
	}

	@Then("the user verifies the title and url of the home page")
	public void the_user_verifies_the_title_and_url_of_the_home_page() {
	}

}
