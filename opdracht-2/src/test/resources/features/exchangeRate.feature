@regression
Feature: Verify exchange rate based

  Scenario: 1. Verify exchange rate for a specific date
    #1. Implementeer de code van de onderstaande Given stap (instructies in de methode)
    Given I want to compare the rate of "EUR" against "USD" at "2015-01-02"
    When the information about the exchange rate is retrieved for this date
    #2. Creeer en implementeer de volledige onderstaande stap in exchangeSteps
    Then the rate of "EUR" is 0.8303578842