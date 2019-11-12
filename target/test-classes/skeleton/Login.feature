Feature: Login Test

Scenario: Login with valid test data

Given user launches chromeBrowser And navigate to application
When user enter username as "mercury" in username field
When user enter password as "mercury" in password1 field
And click Signin
Then validates Login success

