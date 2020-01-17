@regression
Feature: Users can be created and retrieved

  Scenario: 1 A user can be created for which an id and creation date is returned
    #3. Implementeer de onderstaande Given stap
    Given a user with name and job is about to be created
    #4. Implementeer de onderstaande Given stap
    When the user is created in the system
    #5. Implementeer de onderstaande 2 Then stappen
    Then an id and creation date for this user is returned
    And the response contains the name and job of the created user