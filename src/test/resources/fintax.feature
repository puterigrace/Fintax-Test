Feature: Create fintax automation for factorial testing

Background: User enter the site
	Given User navigate to the site url

@Calculation
Scenario: User testing factorial calculation
	Given User is on site
	When User input the number
	And Click calculate button
	Then System display factorial result notification

@Hyperlink
Scenario: User testing hyperlink
	Given User is on site
	When User click hyperlink displayed
	Then User navigate to the url