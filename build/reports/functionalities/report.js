$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("NewUser.feature");
formatter.feature({
  "line": 1,
  "name": "New user creation for mendeley.com",
  "description": "As a user I want to create a new account for mendeley.com",
  "id": "new-user-creation-for-mendeley.com",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Verify that new account cannot be created with an invalid email address",
  "description": "",
  "id": "new-user-creation-for-mendeley.com;verify-that-new-account-cannot-be-created-with-an-invalid-email-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Scenario5"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on mendeley homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I select create account",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should see the first create account page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter invalid email address in the email address field",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click continue",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see an error message",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUserPagesteps.i_am_on_mendeley_homepage()"
});
formatter.result({
  "duration": 5060147894,
  "status": "passed"
});
formatter.match({
  "location": "NewUserPagesteps.i_select_create_account()"
});
formatter.result({
  "duration": 359681428,
  "status": "passed"
});
formatter.match({
  "location": "NewUserPagesteps.i_should_see_the_first_create_account_page()"
});
formatter.result({
  "duration": 67851,
  "status": "passed"
});
formatter.match({
  "location": "NewUserPagesteps.i_enter_invalid_email_address_in_the_email_address_field()"
});
formatter.result({
  "duration": 2511799054,
  "status": "passed"
});
formatter.match({
  "location": "NewUserPagesteps.i_click_continue()"
});
formatter.result({
  "duration": 1170707259,
  "status": "passed"
});
formatter.match({
  "location": "NewUserPagesteps.i_should_see_an_error_message()"
});
formatter.result({
  "duration": 69930500,
  "status": "passed"
});
});