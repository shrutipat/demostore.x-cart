Feature: Sign In feature
  As a user I want to sign in on https://demostore.x-cart.com

  @NewSignUp
  Scenario: Sign In Window Should Open Successfully
    Given I am on home page
    When I click on sign in or sign up link
    Then Sign in window should open successfully

  @NewSignUp
  Scenario: New Account Window Should Open Successfully
    Given I am on sign in window
    When I click on create new account link
    Then New Account window should open successfully

  @NewSignUp
  Scenario: Account Should Be Created Successfully
    Given I am on new account window
    When I enter email address "archipatel@yahoo.com"
    And I enter password "Abcd123"
    And I enter confirm password "Abcd123"
    And I click on create button
    Then I should navigate to My Account Page successfully