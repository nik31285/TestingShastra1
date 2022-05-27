Feature: This is my first feature

Scenario: Test the title of home page
Given chrome browser is opened and URL is launched
When we get the title of home page
Then it must equal to expected
