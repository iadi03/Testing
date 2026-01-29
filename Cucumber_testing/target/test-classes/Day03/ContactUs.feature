Feature: Test Login functionality

  Scenario Outline: Check login is sucessfully with valid credentils
    Given browser is open
    And user is on login page
    When user enter <username> and <password>
    And click on login

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
 
