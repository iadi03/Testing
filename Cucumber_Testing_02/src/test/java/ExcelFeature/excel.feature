#Author: your.email@your.domain.com
Feature: Sign up BooksWagon
 
  @signup
  Scenario: Validate signup with Excel row 1 (first data row)
    Given I am on the BooksWagon signup page
    When I sign up using excel row 1 expecting "pass"
    And I click captcha and wait
    And I click continue
    Then Signup should match expected result