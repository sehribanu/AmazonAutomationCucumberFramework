@test
Feature: To be able to make a search on a specific category

  Background:
    Given the user navigates to the Main Page

  Scenario: Users should be able to search a specific category
    Given the users select "Books" category
    And the users enter "Selenium" in search box
    When the users hit Search button
    Then the users get results in "Book" category

  Scenario: Users should be able to search a specific category
    Given the users select "Books" category
    And the users enter "Selenium" in search box
    When the users hit Search button
    Then the users get results containing "selenium"
