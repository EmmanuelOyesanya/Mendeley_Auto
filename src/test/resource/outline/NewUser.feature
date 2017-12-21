Feature: New user creation for mendeley.com
As a user I want to create a new account for mendeley.com



@Scenario5
Scenario: Verify that new account cannot be created with an invalid email address

Given I am on mendeley homepage
When I select create account
And I should see the first create account page
When I enter invalid email address in the email address field
And I click continue
Then I should see an error message
# Tags: indicating user has entered an invalid email address
    
