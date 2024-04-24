@datatable
Feature: Login feature
				In Order to perform successful login
				As a user
				I have to enter correct username and password
			
		@test1	
	Scenario: Login to the facebook account as a user
			Given user navigates to facebook website
			When user validates the homepage title
			Then user enters "<username>" username
			And user enters "<password>" password
			And user validates captcha in application
			And user enters firstname and lastname
					| Firstname | Lastname |
					| Vinay     | Kumar    |
					| Virat     | Kohli    |
			And user clicks on the sigin button
			