#Rafael Villa
#11/08/2023

  Feature: Login
    I as a user need to log in

  Background: User is logged in
    Given user is in the login page
    When user enters credentials
    Then user enters correctly

  @FindBook
  Scenario Outline: Find book
    Given user is in Book Store
    When user search "<book>"
    And user add book to the collection
    And user delete book
    Then user validate that the book is not found

    Examples:
      |book|
      |Git Pocket Guide|
