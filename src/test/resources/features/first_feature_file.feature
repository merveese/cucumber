@google_search
Feature: Search Functionality
  Background: User is on the google home page
    Given user in on the google page
  Scenario: TC01_Iphone Search
    And user search for iPhone
    Then verify the result has iPhone
    Then  close the application

  Scenario: TC02_tea pot Search
    And user search for tea pot
    Then verify the result has tea pot
    Then  close the application
  Scenario: TC03_flower Search
    And user search for flower
    Then verify the result has flower
    Then  close the application