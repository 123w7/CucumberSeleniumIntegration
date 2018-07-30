Feature: login feature
Scenario: Valid user

Given The URL of the application
When User enters mercury as username
And User enters mercury as password
And User clicks on submit
Then User is valid