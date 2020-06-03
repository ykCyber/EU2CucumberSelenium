@login
Feature: Users should be able to login

  @test
  Scenario: Login with different credentials
    Given the user is on the login page
    When the user enters ID "sales manager" and Password "UserUser123"
    Then  the user should be able to login

  @wip
  Scenario Outline: Login with diffrent cridentials "<userID>" and Password "<PassWord>"
    Given the user is on the login page
    When the user enters ID "<userID>" and Password "<PassWord>"
    Examples:
      | userID        | PassWord    |
      | driver        | UserUser123 |
      | sales manager | UserUser123 |
      | store manager | UserUser123 |
