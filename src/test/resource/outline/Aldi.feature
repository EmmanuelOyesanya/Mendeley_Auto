Feature: As a User,
  want to create a customer account

@aldi
  Scenario: Go to the base URL
    Given I navigate to the landing page
    When I click on the log in/register button
    And I click on create an account
    And I fill all the required text fields
    Then I should be able to see a welcome salutation of my name
