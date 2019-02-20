Feature: Being able to retrieve information about a slideshow

  Scenario: 1. Author and amount of slides are expected when information about sample slideshow are retrieved
    When I retrieve information about a sample slideshow
    Then the author "Yours Truly" is returned
    And the slideshow contains 2 slides