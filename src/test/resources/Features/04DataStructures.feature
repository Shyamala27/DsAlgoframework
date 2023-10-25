@tag
Feature: Data Structure Features
Background: The user is logged in to DS Algo portal

Scenario: The user is logged in to DS Algo portal
Given: The user is on Signin page of DS Algo portal
When  The user enter valid username and password
  		| username | password |
      | AnushaG  | Arthi1994|
 And The user click on login button
 Then The user is on the home page screen after logged in   
      

Scenario: The user is able to navigate to Data Structure introduction page
Given: The user is on the home page after logged in
When The user clicks the Getting Started button in Data Structure Page introduction Panel
Then The user is on Data Structures Introduction page



Scenario: The user is able to navigate to Time Complexity page
Given: The user is on the Data Structures Introduction after logged in
When The user clicks Time Complexity link
Then The user should be redirected to Time Complexity page


Scenario: The user is able to navigate to a page having an tryEditor from Time Complexity page
Given: The user is on the Time Complexity after logged in
When The user clicks Try Here button on Time Complexity page
Then The user should be redirected to try editor page



Scenario Outline: The user is able run code in tryEditor for Time Complexity page
Given: The user is in a page having an tryEditor with a Run button to test
When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And The user clicks on run button
Then The user should be presented with Run result

Examples: 
      | Sheetname | RowNumber |
      | DSValid   |         0 |
      

Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Time Complexity page
Given: The user is in a page having an tryEditor with a Run button to test
When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
And The user clicks on run button
Then  The user should be presented with error message
And The user logs out successfully


Examples: 
      | Sheetname | RowNumber |
      | DSInvalid |         0 |