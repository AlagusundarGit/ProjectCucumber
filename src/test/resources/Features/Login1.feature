#Author: alagusundar.sundarrajan@borngroup.com

Feature: Login1

  Background: 
    Given Launch the Puma application
    And Navigate to the Login page

  @smoke
  Scenario: Login the puma account1
    When Enter the valid credentials
    And Click on login button
    Then Verify the user land on profile page

  @sanity
  Scenario: Login the puma account2
    When Enter the valid credentials one dimentional list
      | alagusundar.sundarrajan@borngroup.com | Test$1234 |
    And Click on login button
    Then Verify the user land on profile page

  @sanity
  Scenario: Login the puma account3
    When Enter the valid credentials one dimentional map
      | 1 | alagusundar.sundarrajan@borngroup.com |
      | 2 | Test$1234                             |
    And Click on login button
    Then Verify the user land on profile page

  @sanity
  Scenario Outline: Login the puma account4
    When Enter the valid credentials "<Email>""<Password>"
    And Click on login button
    Then Verify the user land on profile page

    Examples: 
      | Email                                 | Password  |
      | alagusundar.sundarrajan@borngroup.com | Test$1234 |
