package StepDefinition;

import ReadData.ReadData;
import Pages.DashBoardPage;
import Pages.loginpage;
import Pages.AddEmpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NameDef {
	@Given("Already logged in OrangeHrm and opened Add Employee Section")
	public void already_logged_in_orange_hrm_and_opened_add_employee_section() {
	    // Write code here that turns the phrase above into concrete actions
		 loginpage.login23(ReadData.config("link"));
//		loginpage.login();
	     DashBoardPage.pim();
	     AddEmpPage.AddEmp();
	}

	@When("I enter First Name, Middle Name, Last Name")
	public void i_enter_first_name_middle_name_last_name() {
	    // Write code here that turns the phrase above into concrete actions
		AddEmpPage.AddName();
	    //AddEmpPage.AddEmpPhoto();
	    AddEmpPage.CheckBox();
	}

	@When("I click on Save Button")
	public void i_click_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
		AddEmpPage.save();
	    
	}

	@Then("New Employee should be added")
	public void new_employee_should_be_added() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
