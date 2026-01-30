Feature:login to HMR Application
Background:
Given user is on HRMLogin page "https://opensource.demo.orangehrmlive.com"

@ValidCredentials
Scenario:Login with valid Credentials
Background:
When user enters username as"Admin" and password as "amin123" 
Then user is on login page

@MissingUsername
Scenario:Loginwith blank username
 When user enter username as "" and password as "admin123"
 Then user should be able to see a message "Required" below user
