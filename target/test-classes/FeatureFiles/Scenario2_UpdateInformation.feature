Feature: Update Personal Information

@UpdateInformation
Scenario: Launch and login into application
Given Launch the application
When I click on sign in button
And I enter username and password and login to application

@UpdateInformation
Scenario: User should be able to update first name in My Account
When I click on my personal information button
And I enter first name EkanshNameChanged
And I enter current password
And I click on save button
Then Verify personal info save success message is displayed