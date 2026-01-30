Feature: Screenshot capture
 
  Scenario: Open a website and take screenshot
    Given I open the browser
    When I go to "https://www.saucedemo.com/"
    Then I take screenshot as "saucedemo_home"