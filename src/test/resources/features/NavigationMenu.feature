@navigate
Feature: Navigation Menu

  Scenario: Navigating Fleet -- Vehicles
    Given the user is on the login page
    And the user enters "driver" and "UserUser123"
    When the user navigates to Fleet, Vehicles
    Then the title should be Vehicles

