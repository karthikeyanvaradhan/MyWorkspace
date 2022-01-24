#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@sauce
Feature: Saucedemo Test
  SauseDemo Page Login and Navigation Test

  @sauce
  Scenario: WebPage Login
    Given I want to Login to Navigate to "https://www.saucedemo.com/"
    And I am Clicking on Menu Button
    Then I Click on About Link and Navigate to About Page
    And I Select the Item with Maximum Price
    Then I Navigate to Cart Page
    And Redirect to Information Page