@regression
Feature: Verify authentication method

  Scenario: 1. User can log in when credentials are correct
    #1. Implementeer de code voor de Given stap in de AuthenticationSteps class
    Given my credentials are "user" and "passwd"
    When I try to log in
    #2. Implementeer de code voor de Then stap in de AuthenticationSteps class
    Then the system grants me access

  Scenario: 2. User cannot log in when credentials are incorrect
    #3. Implementeer dit scenario