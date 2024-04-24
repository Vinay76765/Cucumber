@bvt
Feature: Login feature
  		In Order to perform successful login
  		As a user
  		I have to enter correct username and password

  Background: 
    Given user navigates to facebook website
    When user validates the homepage title

  Scenario: Login to the facebook account as a valid user
    Then user enters "valid" username
    And user enters "valid" password
    And user clicks on the sigin button

  Scenario: Login to the facebook account as a invalid user
    Then user enters "invalid" username
    And user enters "invalid" password
    And user clicks on the sigin button
