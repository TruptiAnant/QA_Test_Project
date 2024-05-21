Feature: Add item to shopping cart

  Scenario: Add a single item to the cart
    Given I am logged in to the Sauce Demo site
    When I add the first item to the cart
    Then the cart should have 1 item
