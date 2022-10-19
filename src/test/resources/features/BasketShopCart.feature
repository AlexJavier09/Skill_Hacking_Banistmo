@stories
Feature: Manipulate shop cart
  as user, I want add some items and delete one of them to proof the price is lowest than 400

  @scenario1
  Scenario: Shop cart adding
    Given the webpage is on practice automation testing
    When the user navigate to find the courses to proceed to the checkout
    And the user delete one item of the checkout
    Then the user will see the price lowest
    |strPrice|
    |   400  |