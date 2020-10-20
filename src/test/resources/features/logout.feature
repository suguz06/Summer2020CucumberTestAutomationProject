Feature: As a user, I should be able to log out

  Scenario: log out as a sales manager
    Given user on the home page
    When user logs out
    Then user should see login page
