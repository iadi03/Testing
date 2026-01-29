#Author: your.email@your.domain.com
Feature: Browser compatibility for Google search


  @crossbrowser
  Scenario Outline: Open Google and search, verify title
    Given I launch the browser
    And I am on the Google search page
    When I search for "facebook"
