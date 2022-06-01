# We can parametrize steps and scenario also
Feature: Different ways to parameterize the scenario and steps

Scenario: Parametrize int into steps
Given I have 10 and 22
When I add them
Then result must be even

Scenario: Parameterize word in step
Given I have orange fruit
Then Display its colour

Scenario: Parameterize string in a step
Given I have a "string which contains" space

