Feature: Contacts Page
  @test
  Scenario: Default page number
    Given the user is on the login page
    When the user enters ID "driver" and Password "UserUser123"
    When the user navigates "Customers"  "Contacts"
    Then default page number should be 1