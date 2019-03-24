@regression
Feature: Being able to use information from the response in other calls

  Scenario: 1. Get all blog post from the site
    When I retrieve information about the blog posts
    Then at least one post with title "enim" is returned

  Scenario: 2. Get all user info from the site
    When I retrieve information about the users
    Then at least one user with username "Bret" is returned

#  TODO make these 3 scenario's yourself. Maybe you can find some tips in UsingResponseDataSteps.java Or maybe you have to think for yourself!
    Scenario: 3. Find the author's information for the first blog post
    When I retrieve information about the author of the first blog post
    Then at least one user with username "Bret" is returned
    Then at least "Gwenborough" is returned

#    Scenario: 4. Find the author's information for the 50th blog post
#    Type your Cucumber-steps here first and then run the test, cucumber will give you hints on how to implement this

#    Scenario: 5. Find the author's information for the last blog post
#    Type your Cucumber-steps here first and then run the test, cucumber will give you hints on how to implement this




