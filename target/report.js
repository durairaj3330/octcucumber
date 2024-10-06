$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/adactin.feature");
formatter.feature({
  "name": "TO Validate login functionality in adactin appllication",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@feature1"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the chrome browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinDefinition.to_launch_the_chrome_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Validate invalida username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "To enter invalid username in email field",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinDefinition.to_enter_invalid_username_in_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter invalid password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinDefinition.to_enter_invalid_password_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter login button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinDefinition.to_enter_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to close the chrome brower",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinDefinition.to_close_the_chrome_brower()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "enter invalid username\"\u003cemailfield\u003e\" in email field",
  "keyword": "When "
});
formatter.step({
  "name": "enter valid password in password\"\u003cpasswordfield\u003e\" field",
  "keyword": "And "
});
formatter.step({
  "name": "enter login button",
  "keyword": "And "
});
formatter.step({
  "name": "close the chrome brower",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailfield",
        "passwordfield"
      ]
    },
    {
      "cells": [
        "vikki@123",
        "52524"
      ]
    },
    {
      "cells": [
        "dirairaj",
        "8754"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the chrome browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinDefinition.to_launch_the_chrome_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "enter invalid username\"vikki@123\" in email field",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "enter valid password in password\"52524\" field",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "enter login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "close the chrome brower",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the chrome browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinDefinition.to_launch_the_chrome_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "enter invalid username\"dirairaj\" in email field",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "enter valid password in password\"8754\" field",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "enter login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "close the chrome brower",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/Feature/amazon.feature");
formatter.feature({
  "name": "TO Validate signIn functionality in adactin appllication",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@feature2"
    }
  ]
});
formatter.scenario({
  "name": "To Validate invalid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature2"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To send the chrome browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonDefinitionClass.to_send_the_chrome_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To send invalid username in email field",
  "rows": [
    {
      "cells": [
        "vikki123",
        "durairaj3330@gmail.com",
        "durai1213"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AmazonDefinitionClass.to_send_invalid_username_in_email_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to click continue button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonDefinitionClass.to_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To send valid password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonDefinitionClass.to_send_valid_password_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter signin button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonDefinitionClass.to_enter_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to close the amazonweb brower",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonDefinitionClass.to_close_the_amazonweb_brower()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});