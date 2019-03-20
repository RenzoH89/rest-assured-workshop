@regression
Feature: Being able to retrieve information about a slideshow

  #Voorbeeld testcase object mapper (Response)
  Scenario: 1. System returns a set of 3 users on each returned page
    Given I want to retrieve the oldest set of users from the system
    When the list of users is retrieved
    Then the system returns 3 users from a total of 12
    And the returned page number is equal to 1

  Scenario: 2. The system returns user details for each user
    Given I want to retrieve the oldest set of users from the system
    When the list of users is retrieved
    #1. Maak een then stap om de users uit de reponse in te lezen op basis de User klasse
    #   Valideer de elementen id, last_name en avatar.
    #   Tip: Zie de 'then' stappen uit Scenario 1 voor het omzetten van de response naar een object
    #2. Met de huidige User.class is het nog niet mogelijk om het element first-name
    #   uit te lezen. Pas daarvoor de User.class aan en valideer vervolgens
    #   de response ook op first_name

  Scenario: 3. A user can log in with an email and password
    #3. Implementeer de code voor de onderstaande Given stap door een Login object te creeren op basis van de Login klasse
    Given my credentials are "info@email.nl" and "123456"
    When I try to login
    Then the system grants me access