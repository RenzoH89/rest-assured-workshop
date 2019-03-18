@regression
Feature: Being able to retrieve information about a slideshow (JSON format)

  #Voorbeeld testcase
  Scenario: 1. The retrieved slideshow should contain 2 slides
    When I retrieve information about a slideshow
    And the slideshow contains 2 slides

  Scenario: 2. Information about the author of slideshow can be retrieved
    When I retrieve information about a slideshow
    #1. Fix de onderstaande regel
    Then the author of the slideshow is "James"

  Scenario: 3. The slideshow titles of each slide are returned
    When I retrieve information about a slideshow
    #2. Implementeer de code voor de onderstaande regel
    Then the title of the slideshow is "Sample Slide Show"
    #3. Schrijf een eigen stap of stappen in de SlideShowSteps class om de titels van de 2 slides te valideren
    #And ......

  Scenario: 4. Technical information about the slideshow response should be correct
    When I retrieve information about a slideshow
    #4. Implementeer de code voor de onderstaande regel
    Then the statuscode 200 is returned
    #5. Schrijf een eigen stap in de SlideShowSteps class om de response header te controleren op content-type application/json
    #And ......

    #6. Optioneel: Reduceer de bovenstaande 4 scenario's tot 1 scenario.