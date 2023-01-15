Feature: This is the login feature for the guru99 website

  Scenario: This is the login scenario
    Given You are on the login page
    When You enter the below data
      | user123@gmail.com | user123 |
    And Clicks the login button
    And You should be seen to home page
    Then You must be closed
