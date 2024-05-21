Feature: Logout functionality

  Scenario: User logs out successfully
    Given the user is logged in
    When the user logs out
    Then the user should be redirected to the login page
