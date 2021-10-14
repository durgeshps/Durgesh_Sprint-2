Feature: Add Username
Scenario: I want to add the username for the new employee
Given Logged in Orange Hrm and inside Add Employee Section
When I enter Full Name, Employee ID, Add Photograph, Click on Login Details
And Enter the Username
And Click Save Button
Then New Employee should be added here