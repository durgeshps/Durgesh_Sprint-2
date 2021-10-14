package StepDefinition;

import Pages.AddEmpPage;
import Pages.DashBoardPage;
import Pages.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UNameDef {

	@Given("Logged in Orange Hrm and inside Add Employee Section")
	public void logged_in_orange_hrm_and_inside_add_employee_section() {
	    // Write code here that turns the phrase above into concrete actions
		loginpage.login();
		DashBoardPage.pim();
	    AddEmpPage.AddEmp();
	}

	@When("Enter the Username")
	public void enter_the_username() {
	    // Write code here that turns the phrase above into concrete actions
	    AddEmpPage.uname();
	}

	@When("Click Save Button")
	public void click_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	   AddEmpPage.save();
	}

	@Then("New Employee should be added here")
	public void new_employee_should_be_added_here() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
