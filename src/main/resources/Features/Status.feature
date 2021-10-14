Feature: Add Status
Scenario: I want to add the status for the new employee
Given Already logged into Orange Hrm and inside Add Employee Section
When I entered Full Name, Employee ID, Add Photograph, Click on Login Details
And Enter Username, Password, Confirm Password and select status as Enabled
And Click on Save Button
Then New Employee should add 