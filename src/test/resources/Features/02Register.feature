@tag
Feature: Register Page Feature

@tag1
Scenario: User launch home page of an dsalgo project
Given The user opens DS Algo portal link
When The user clicks the Get Started button
Then The user should be redirected to homepage

@tag2
Scenario: User clicks Register button with all fields empty
When The user clicks Register button with "Username","Password" and "Confirm Password" empty
Then It should display an error Please fill out this field. below Username textbox

@tag3
Scenario: User clicks Register button after entering username with other fields empty
When The user clicks Register button after entering username with other fields empty
      | username     |
      |Agne1				 |
Then It should display an error Please fill out this field below Password textbox

@tag4
Scenario: The user clicks Register button after entering username and password with Password Confirmation field empty
When  The user clicks Register button after entering username and password with Password Confirmation field empty
      | username       | password     |
      | Agne1          | Sdet114A     |
Then It should display an error Please fill out this field. below Password Confirmation textbox      
      
@tag5
Scenario: The user enters a username with characters other than Letters, digits and symbols
When  The user enters a username with characters other than Letters, digits and symbols
      | username | password     | password confirmation |
      | &**&**&  | testpassword | testpassword          |
Then It should display an error message Please enter a valid username

@tag6
Scenario: The user enters a valid existing username with password and password confirmation
When The user enters a valid existing username with password and password confirmation
      | username     | password  | password confirmation |
      | AnushaG | RT56YUabc | RT56YUabc  |
Then It should display an error message Username already exists

@tag7
Scenario: The user clicks Register button after entering valid username and different passwords in password and password confirmation fields
When The user clicks Register button after entering valid username and different passwords in password and password confirmation fields
      | username       | password     | password confirmation |
      | Numpy@sdet84_1 | testpassword | testpassword1   | 
Then It should display an error message password mismatch The two password fields didnt match

@tag8
Scenario: The user enters a valid username and password with characters less than eight
When The user enters a valid username and password with characters less than eight
       | username       | password | password confirmation |
       | Numpy@sdet84_1 | a1b2c3d  | a1b2c3d               |
Then It should display an error message Password should contain at least eight characters

@tag9
Scenario: The user enters a valid username and password with only numbers
When The user enters a valid username and password with only numbers
       | username       | password | password confirmation |
       | Numpy@sdet84_1 | 12345678 |              12345678 |
Then It should display an error message Password cant be entirely numeric

@tag10
Scenario: The user enters a valid username and password similar to username
When The user enters a valid username and password similar to username
      | username     | password   | password confirmation |
      | Numpy@sdet84_1 | testsdet84 | testsdet84          |
Then It should display an error message password cant be too similar to your other personal information

@tag11
Scenario: The user enters a valid username and commonly used password password
When The user enters a valid username and commonly used password password
      | username       | password | password confirmation |
      | Numpy@sdet84_1 | Welcome1 | Welcome1          |
Then It should display an error message Password cant be commonly used password

@tag12
Scenario: The user enters a valid username and password and password confirmation
When The user enters a valid username and password and password confirmation
      | username       | password    | password confirmation |
      | AnushaGanesan11 | Arthi@20116 | Arthi@20116       |
Then The user should be redirected to Homepage with the message New Account Created You are logged in as username

@tag13
Scenario: The user is able to signin with registered credential
When The user enters a valid username and password
      | username       | password    | password confirmation |
      | AnushaGanesan6 | Arthi@20111 | Arthi@20111       |

Then click login button to verify
  
     
