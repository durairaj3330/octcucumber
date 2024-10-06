@feature1
Feature: TO Validate login functionality in adactin appllication

Background:
Given To launch the chrome browser and hit the url 
@smoke 
Scenario: To Validate invalida username and invalid password

When To enter invalid username in email field
And  To enter invalid password in password field
And  To enter login button
Then to close the chrome brower

@smoke @regression
Scenario Outline:

When  enter invalid username"<emailfield>" in email field
And   enter valid password in password"<passwordfield>" field
And   enter login button
Then  close the chrome brower

Examples:
|emailfield|passwordfield|
|vikki@123|52524|
|dirairaj|8754|