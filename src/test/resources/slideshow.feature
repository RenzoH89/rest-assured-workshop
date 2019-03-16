@regression
Feature: Being able to retrieve information about a slideshow

  #Voorbeeld testcase
  Scenario: 1. Author and slides are returned when information about a slideshow is retrieved
    When I retrieve information about a slideshow
    Then the author of the slideshow is "Yours Truly"
    And the slideshow contains 2 slides