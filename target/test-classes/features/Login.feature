Feature: Login Functionality

@Smoke
Scenario: verify the login functionality with correct credentials

Given  user launch the url

When   user enter correct "standard_user" and correct "secret_sauce" 

And    user enter on login button

Then   validate user navigate to home




@Smoke
Scenario Outline: verify the login functionality with correct credentials

Given  user launch the url

When   user enter correct "<username>" and correct "<password>" 

And    user enter on login button

Then   validate user navigate to home


Examples:
|username||password|
|standard_user||secret_sauce|






