Feature: User Registration

Scenario: User registration with different data
	Given User is on registration page
	When User enters following user details
		| naveen | automation | nav@gmail.com | 945783 | Bangalore |
		| tom | peter | tom@gmail.com | 36878 | Chennai |
		| Archana | automation | arc@gmail.com | 49848 | Swizerland |
	Then user registration should be successful
		
Scenario: User registration with different data with columns
	Given User is on registration page
	When User enters following user details with columns
		| firstname | lastname | email | phone | city |
		| naveen | automation | nav@gmail.com | 945783 | Bangalore |
		| tom | peter | tom@gmail.com | 36878 | Chennai |
		| Archana | automation | arc@gmail.com | 49848 | Swizerland |
	Then user registration should be successful
	