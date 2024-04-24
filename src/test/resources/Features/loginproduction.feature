@Testing
Feature: Login feature
				In Order to perform successful login
				As a user
				I have to enter correct username and password
				
	Scenario Outline: Login to the facebook account as a user
			Given user navigates to facebook website
			When user validates the homepage title
			Then user enters "<username>" username
			And user enters "<password>" password
			And user validates captcha in application
			And user clicks on the sigin button
			
Examples:
		| username | password |
		| valid    | valid    |
		| invalid  | invalid  |
		| valid    | invalid  |
		| invalid  | valid    |