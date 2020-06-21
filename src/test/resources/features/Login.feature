Feature: Users should be able to login

#  @test
#  Scenario: Login with different credentials
#    Given the user is on the login page
#    When the user enters ID "sales manager" and Password "UserUser123"
#    Then  the user should be able to login

  @wip
  Scenario Outline: ID "<userID>" and Password "<PassWord>"
    Given the user is on the login page

    When the user enters ID "<userID> " and Password "<PassWord>"
    Examples:
      | userID        | PassWord    |
      | driver        |   ' '          |
      |   ' '           | \ |
      | store manager | UserUser123 |
#
#  Scenario Outline: Login as a <userType>
#    Given the user is on the login page
#    When the user enter the "<userType>" information
#    Then the user should be able to login as "<userType>"
#    Examples:
#      | userType      |
#      | driver        |
#      | sales Manager |
#      | store Manager |