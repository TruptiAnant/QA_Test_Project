Feature: Checkout process on SauceDemo

  Scenario: Complete checkout process
    Given I am on the  login page
    When I login with valid credentials
    And I add an item to the cart
    And I proceed to checkout
    And I enter the checkout information
    And I finish the checkout process
    Then I should see the order confirmation message
