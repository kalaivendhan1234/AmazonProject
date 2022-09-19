Feature: Login functionality

Background:

Given User is on the amazon login page
When  user enters the username and password
Then  user is on the home page

@smoketesting
Scenario: Validating home page

Given User is on the search  page
When User searches for the item
Then user add the item to the cart

@sanitytesting
Scenario: Validating cart page
Given User is on the cart  page
When User increases the quantity
Then  user proceeds to the checkout




