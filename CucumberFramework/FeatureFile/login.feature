Feature: This is the login feature for guru99

  Scenario: This is login scenario
    Given User is on login page
    When The user enter valid username & Password
    And Clicks on the login button
    And The user should be navigated to home page
    Then The webpage should be closed
