Feature: As a user I want to test Login feature

  Scenario: To test login scenario with valid credentials
    Given Application is running and up
    When I enter valid credentials
    Then Flight finder page is displayed
