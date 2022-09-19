Feature: Datatable Test

Scenario: Test login

Given the user launches the url
When the user enters username and password
#|dinesh|dinesh1|
#|dinesh|dinesh1|
#|dineshx|dinesh1x|
#|dineshy|dinesh1y|
|Name|Sathish|
|age|30|
And the user clicks the login button
Then the user verifies the title and url of the home page