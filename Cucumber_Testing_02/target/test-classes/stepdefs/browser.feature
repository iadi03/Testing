Feature: Cross browser check
 
  Scenario: Open Google on all 3 browsers
    When I open google on chrome edge and firefox
    Then I should get the browser status