# We can parametrize steps and scenario also
Feature: Different ways to parameterize the scenario and steps

#Scenario: Parametrize int into steps
#Given I have 10 and 22
#When I add them
#Then result must be even

#Scenario: Parameterize word in step
#Given I have orange fruit
#Then Display its colour

#Scenario: Parameterize string in a step
#Given I have a "string which contains" space

#Scenario: Parameterizing multiple value in single step
#Given I have following rto code and city names:
#|MH|Maharashtra|
#|GJ|Gujarat|
#|MP|Madhyapradesh|
#|GA|Goa|
#|AP|Aandhrapradesh|
#|UP|Uttar Pradesh|

#Scenario: Parameterizing single value in table
#Given I have capital city names
#|Mumbai|
#|Delhi|
#|Bhopal|
#|Jaipur|
#|Haidrabad|
#|Kolkatta|

#Datadriven test
Scenario Outline:
Given I have "<rto_code>" and "<city_name>"
Examples:
|rto_code|city_name|
|MH|Maharashtra|
|GJ|Gujarat|
|MP|Madhyapradesh|
|GA|Goa|
|AP|Aandhrapradesh|
|UP|Uttar Pradesh|


