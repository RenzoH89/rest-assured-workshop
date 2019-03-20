@regression
Feature: Being able to retrieve information countries

  #1. De huidige code werkt niet omdat de methode 'the system returns status code' op meerdere plekken geimplementeerd is
  #   Schrijf de code om zodat voor alle scenario's de methode om de statuscode te controleren uit de CommonSteps gebruikt wordt.

  Scenario: 1. System responds with information about the name and region of provided country
    Given I want information about the country "NL"
    When the information about the country is retrieved
    Then the system returns status code 200
    #2. Vervang de onderstaande regel met de methode "the response includes the following:" uit de CommonSteps
    And the official name "Netherlands" and region "Europe" is returned

  Scenario: 2. System responds with an error when country does not exists
    Given I want information about the country "XX"
    When the information about the country is retrieved
    Then the system returns status code 404