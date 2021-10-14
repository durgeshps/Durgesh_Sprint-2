package StepDefinition;

import Pages.AddEmpPage;
import Pages.DashBoardPage;
import Pages.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeIdDef {

	@Given("I have already logged in OrangeHrm and opened Add Employee Section")
	public void i_have_already_logged_in_orange_hrm_and_opened_add_employee_section() {
	    // Write code here that turns the phrase above into concrete actions
	  loginpage.login();
	  DashBoardPage.pim();
	  AddEmpPage.AddEmp();
	}

	@When("I have entered Full Name and Employee ID")
	public void i_have_entered_full_name_and_employee_id() {
	    // Write code here that turns the phrase above into concrete actions
		AddEmpPage.AddName();
		AddEmpPage.AddEmpID();
	}

	@When("I clicked on Save Button")
	public void i_clicked_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    AddEmpPage.save();
	}

	@Then("New Employee should get added")
	public void new_employee_should_get_added() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
