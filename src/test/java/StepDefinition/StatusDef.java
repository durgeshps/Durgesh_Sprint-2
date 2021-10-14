package StepDefinition;

import Pages.AddEmpPage;
import Pages.DashBoardPage;
import Pages.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StatusDef {

	@Given("Already logged into Orange Hrm and inside Add Employee Section")
	public void already_logged_into_orange_hrm_and_inside_add_employee_section() {
	    // Write code here that turns the phrase above into concrete actions
	   loginpage.login();
	   DashBoardPage.pim();
	   AddEmpPage.AddEmp();
	}

	@When("I entered Full Name, Employee ID, Add Photograph, Click on Login Details")
	public void i_entered_full_name_employee_id_add_photograph_click_on_login_details() {
	    // Write code here that turns the phrase above into concrete actions
	   AddEmpPage.AddName();
	   AddEmpPage.AddEmpID();
	   AddEmpPage.CheckBox();
	}

	@When("Enter Username, Password, Confirm Password and select status as Enabled")
	public void enter_username_password_confirm_password_and_select_status_as_enabled() {
	    // Write code here that turns the phrase above into concrete actions
	    AddEmpPage.uname();
	    AddEmpPage.Pass();
	    AddEmpPage.CPass();
	    AddEmpPage.Status();
	}

	@When("Click on Save Button")
	public void click_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
		AddEmpPage.save();
	}

	@Then("New Employee should add")
	public void new_employee_should_add() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
