Feature: Login feature for the guru99 website

  Scenario: Login scenario
    Given Login the page
    When Enter the below data
      | UserName          | Password |
      | user123@gmail.com | user123  |
    And Click login button
    Then Webpage should be closed
