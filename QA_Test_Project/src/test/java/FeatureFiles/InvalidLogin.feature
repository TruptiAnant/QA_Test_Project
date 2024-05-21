Feature: Invalid Login Scenarios for SauceDemo

  Scenario Outline: Attempt to login with invalid credentials
    Given I am on the SauceDemo login page
    When I enter username "<username>" and password "<password>"
    And I click the login button
    Then I should see an error message "<error_message>"

    Examples:
      | username        | password   | error_message                         |
      | invalid_user    | secret_sauce | Username and password do not match   |
      | standard_user   | wrong_pass | Username and password do not match   |
      |                | secret_sauce | Username is required                 |
      | standard_user   |            | Password is required                 |
      |                |            | Username is required                 |
      | invalid_user    |            | Password is required                 |
