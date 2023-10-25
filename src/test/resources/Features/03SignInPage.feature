@tag
Feature: SignIn Page Feature

@tag1
Scenario: Verifying Register link
When The user clicks on register link on signin page
Then The user redirected to Registration page from signin page

@tag2
Scenario: User on login page and login with invalid inputs
Given  The user is on signin page
When The user enter invalid username and password
      | username | password |
      | user     |   Ssd   |
     
 Then click login button to verify
 
 @tag3
 Scenario Outline: User on login page and login with invalid and valid inputs from Excel    
 Given The user is on signin page
 When The user enter sheet "<Sheetname>" and <RowNumber>
 Then click login button to verify login and verify Sign out
  Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |
      
 
 
 
 