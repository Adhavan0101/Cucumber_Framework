Feature: This is the login feature for guru99 website

  Scenario: This is the login scenario
    Given User is on the login page
    When The user enter valid "user123@gmail.com" and "user123"
    And Clicks the login button
    And The user should be seen to home page
    Then The webpage must be closed
