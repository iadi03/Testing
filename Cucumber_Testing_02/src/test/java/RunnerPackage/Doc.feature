#Author: your.email@your.domain.com
 
Feature: Sign up BooksWagon
	
	@tag2
  Scenario Outline: Validate signup result
    Given I am on the BooksWagon signup page
    When I sign up using name "<name>" and mobile "<mobile>" expecting "<result>"
    Then Signup should match expected result
 
    Examples:
      | name           | mobile      | result |
      | Priyanshu      | 9998887776  | pass   |
      | Yash Gangwar   | 8887776665  | pass   |