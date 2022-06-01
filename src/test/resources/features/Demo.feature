#Auther Name: Nishikant Patil
Feature: Demo of Cucumber FrameWork

#It execute before each scenario
Background: Login to vpn
Given set UserName
And set Password

Scenario: To understand Hooks in cucumber
Given to launch browser
And to launch URL
Then we have to find out Home Page Title
  
  
Scenario: Second Demo scenario
Given To test 2 scenario