Feature: Test login functionality

Scenario Outline:Check login is successful with the browser

Given browser is open
And user is on login page
When user enter <username> and <password>
And user clicks on login
Then user is navigated to home page
Examples:
| username|password|
| manisha|1234|
| sai|234475|
| naveen|45433|
