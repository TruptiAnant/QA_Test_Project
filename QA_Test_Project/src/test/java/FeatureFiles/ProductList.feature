Feature: Product List

  Scenario: Verify product list on SauceDemo
    Given the user is on the SauceDemo login page
    When the user logs in with valid credentials
    Then the user should see the product list
