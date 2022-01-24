Feature: Jira Login with Valid Credentials
  I want to Login Jira with Valid Credentials

@jira
  Scenario: Jira Successfull Login
    Given Open Internet Explorer Driver
    Then Enter Url
    And Enter Username
    Then Enter Password
    And Click on Login Button