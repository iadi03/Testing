Feature: Test Login function

 Scenario Outline: Check login is sucessfully with valid credentil
    Given browser is ready to open
    And user is on login page
    When user enter <name> and <password>
    And click on login

    Examples:
      | name          | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
