@regression
Feature: Being able to retrieve information about a slideshow

  #1. De huidige code werkt niet omdat de methode 'the system returns status code' op meerdere plekken geimplementeerd is
  #   Schrijf de code om zodat voor alle scenario's de methode om de statuscode te controleren uit de CommonSteps gebruikt wordt.

  Scenario: 1. Author and slides are returned when information about a slideshow is retrieved
    When I retrieve information about a slideshow
    Then the system returns status code 200
    #2. Vervang de onderstaande regel met de methode "the response includes the following:" uit de CommonSteps
    Then the author of the slideshow is "Yours Truly"
    And the slideshow contains 2 slides