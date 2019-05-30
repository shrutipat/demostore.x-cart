Feature: Sign In feature
  As a user I want to shop on https://demostore.x-cart.com

  @Shopping
  Scenario: User Should Navigate to Sale Page Successfully
    Given I am on home page
    When I mouse over on Hot Deals in top menu
    And I click on sale Link
    Then I should navigate to sale page successfully

  @Shopping
  Scenario: User Should be able to go to item page successfully
    Given I am on sale page
    When I click on Star Trek Command Cycle Jersey
    Then I should navigate to Star Trek Command Cycle Jersey Successfully