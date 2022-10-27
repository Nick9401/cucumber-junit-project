Feature: Eating too many cucumbers may not be good for you
  user story: Eating too much of any thing may not be good for you

  @Smoke
  Scenario: Eating a few is not problem
    Given John is hungry
    When he eats some cucumbers
    Then  he will be full