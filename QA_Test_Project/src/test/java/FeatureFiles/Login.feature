Feature: Login

  Scenario Outline: Successful login with valid credentials
    Given User is on the login page
    When User enters "<username>" and "<password>"
    And User clicks on the login button
    Then User should be redirected to the inventory page

    Examples:
      | username        | password    |
      | standard_user   | secret_sauce|
      | locked_out_user | secret_sauce|
      | problem_user    | secret_sauce|
      | performance_glitch_user | secret_sauce |
