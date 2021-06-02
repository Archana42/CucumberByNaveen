@All
Feature: Uber Booking Feature

@Smoke
Scenario: Booking Cab Sedan
Given User wants to select a car type "sedan" from uber app
When User selects car "sedan" and pick up point "Bangalore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Smoke @Regression
Scenario: Booking Cab SUV
Given User wants to select a car type "suv" from uber app
When User selects car "sedan" and pick up point "Bangalore" and drop location "Hyderabad"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Prod
Scenario: Booking Cab Mini
Given User wants to select a car type "mini" from uber app
When User selects car "sedan" and pick up point "Hyderabad" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD