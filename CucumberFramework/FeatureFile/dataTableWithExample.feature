Feature: Login feature Guru99 website

  Scenario Outline: Login the scenario
    Given Login the webpage
    When Enter the data "<UserName>" and "<Password>"
    And Clickd login button
    Then Page should be closed

    Examples: 
      | UserName          | Password |
      | user123@gmail.com | user123  |
      | user456@gmail.com | user456  |
