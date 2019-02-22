@regression
Feature: Being able to retrieve information countries

  Scenario: 1. System responds with information about the name and region of provided country
    Given I want information about the country "NL"
    When the information about the country is retrieved
    Then the system returned status code 200
    And the response includes the following:
      | officialName  | Netherlands |
      | region        | Europe      |

  Scenario: 2. System responds with an error when country does not exists
    Given I want information about the country "XX"
    When the information about the country is retrieved
    Then the system returned status code 404