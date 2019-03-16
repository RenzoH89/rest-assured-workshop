@regression
Feature: Being able to retrieve information about a slideshow (JSON format)

  #Voorbeeld testcase
  Scenario: 1. Basic information about the slideshow can be retrieved
    When I retrieve information about a slideshow
    Then the author of the slideshow is "Yours Truly"
    And the slideshow contains 2 slides

  Scenario: 2. The slideshow titles are returned
    When I retrieve information about a slideshow
    #1. Implementeer de code voor de onderstaande regel
    Then the title of the slideshow is "Sample Slide Show"
    #2. Schrijf een eigen stap of stappen in de SlideShowSteps class om de titels van de 2 slides te valideren
    #And ......

  Scenario: 3. Technical information about the slideshow response should be correct
    When I retrieve information about a slideshow
    #1. Implementeer de code voor de onderstaande regel
    Then the statuscode 200 is returned
    #2. Schrijf een eigen stap in de SlideShowSteps class om de response header te controleren op content-type application/json
    #And ......