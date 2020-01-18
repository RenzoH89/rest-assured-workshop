 @regression
Feature: Being able to retrieve information about a slideshow (JSON format)

  #Voorbeeld testcase
  Scenario: 1. The author and 2 slides are returned
    When I retrieve information about a slideshow
    Then the author of the slideshow is "Yours Truly"
    And the slideshow contains 2 slides