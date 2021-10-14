package StepDefinition;

import Pages.AddEmpPage;
import Pages.DashBoardPage;
import Pages.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDetDef {

	@Given("Already logging in Orange Hrm and inside Add Employee Section")
	public void already_logging_in_orange_hrm_and_inside_add_employee_section() {
	    // Write code here that turns the phrase above into concrete actions
	   loginpage.login();
	   DashBoardPage.pim();
	   AddEmpPage.AddEmp();
	}

	@When("I enter Full Name, Employee ID, Add Photograph, Click on Login Details")
	public void i_enter_full_name_employee_id_add_photograph_click_on_login_details() {
	    // Write code here that turns the phrase above into concrete actions
	   AddEmpPage.AddName();
	   AddEmpPage.AddEmpID();
	   AddEmpPage.CheckBox();
	}

	@When("Clicking on Save Button")
	public void clicking_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    AddEmpPage.save();
	}

	@Then("New Employee should be adding here")
	public void new_employee_should_be_adding_here() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
