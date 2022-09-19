Feature: Validating the amazon login page

Scenario: Validating with the valid credentials
Given User is on the login page
When  User enters the username and password
| username      |
| abc@gmail.com |   
And   User clicks the login button
Then  User is on the home page