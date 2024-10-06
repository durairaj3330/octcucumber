@feature2
Feature: TO Validate signIn functionality in adactin appllication
@smoke @sanity
Scenario: To Validate invalid username and valid password


Given To send the chrome browser and hit the url 
When To send invalid username in email field
|vikki123|durairaj3330@gmail.com|durai1213|

And to click continue button
And  To send valid password in password field
And  To enter signin button
Then to close the amazonweb brower