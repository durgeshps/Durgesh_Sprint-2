Feature: Add Password
Scenario: I want to add the password for the new employee
Given I am already logged in Orange Hrm and inside Add Employee Section
When I enter Full Name, Employee ID, Add Photograph, Click on Login Details
And Enter Username, Password and Confirm Password
And I am Clicking on Save Button
Then New Employee should get add here.