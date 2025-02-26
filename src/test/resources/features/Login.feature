@LoginTest
Feature: User Login
  Scenario: Valid login with correct credentials
    Given User is on the login page
    When User enters valid credentials
    And Clicks on login button
    Then User should be logged in successfully

#  Scenario: Invalid login with incorrect password
#    Given the user navigates to the login page
#    When the user enters an invalid password
#    And clicks on the login button
#    Then the user should see an error message
#
#  Scenario: Login with empty credentials
#    Given the user navigates to the login page
#    When the user does not enter any credentials
#    And clicks on the login button
#    Then the user should see a validation error
