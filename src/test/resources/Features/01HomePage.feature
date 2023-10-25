@tag
Feature: Home Page Feature
@tag1
Scenario: User launch home page of an dsalgo project
Given The user opens DS Algo portal link
When The user clicks the Get Started button
Then The user should be redirected to homepage
@tag2
Scenario Outline: User is on Home page and click getstarted link on home page
without sign in
When The user clicks on Get Started link on homepage "<option>" without login
Then The user get warning message "<Message>"
Examples:
				| option 				 |Message|
				| Datastructures |You are not logged in|
				| Arrays 				 |You are not logged in|
				| Linkedlist 		 |You are not logged in|
				| Stack 				 |You are not logged in|
				| Queue 				 |You are not logged in|
				| Tree 					 |You are not logged in|
				| Graph 				 |You are not logged in|
@tag3

Scenario Outline: User is on Home page and click dropdown on home page without
sign in
When The user clicks on dropdown "<option>" without login
Then The user get warning message again "<Message>"
Examples:
				| option |Message|
				| Arrays 				 |You are not logged in|
				| Linkedlist 		 |You are not logged in|
				| Stack 				 |You are not logged in|
				| Queue 				 |You are not logged in|
				| Tree 					 |You are not logged in|
				| Graph 				 |You are not logged in|
@tag4
Scenario: User clicks on Sign In
When The user click the Sign In button
Then The user should be redirected to Sign in page
And The user clicks Register
Then The user should be redirected to Register form

