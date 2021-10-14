Feature: Full Name
Scenario: I want to add First Name, Middle Name, Last Name
Given Already logged in OrangeHrm and opened Add Employee Section
When I enter First Name, Middle Name, Last Name
And I click on Save Button
Then New Employee should be added
