@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I login on the application
    When I enter google search keyword
    And I click on submit button
    Then I verify the in step

    Examples: 
      | status  |
      | success |
      | test secound|
