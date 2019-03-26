@regression
Feature: Retrieve information about blog posts and users

  Scenario: 1. Get all blog post from the site
    When I retrieve information about the blog posts
    Then at least one post with title "enim" is returned

  Scenario: 2. Get all user info from the site
    When I retrieve information about the users
    Then at least one user with username "Bret" is returned

    Scenario: 3. Retrieve the author's information based on the first blog post
    #1. Implementeer de onderstaande when regel in de BlogSteps klasse
    When I retrieve information about the author of the first blog post
    Then at least one user with username "Bret" is returned
    #2. Maak een nieuwe stepdef methode aan in de BlogSteps klasse.
    And the user lives in the city "Gwenborough"


