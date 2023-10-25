Feature: Array Features

Scenario: The user is logged in to DS Algo portal
Given: The user is on Signin page of DS Algo portal 
When  The user enter valid username and password to prepare for array 
  		| username | password |
      | AnushaG  | Arthi1994|
 And The user click on login button on the login screen 
 Then The user is on the home page screen after logged in and can access array panel 
 
 Scenario: The user is able to navigate to ARRAY Data Structure Page
 Given: The user is on the home page after logged in
 When The user clicks the Getting Started button in Array Panel
 Then The user be directed to ARRAY Data Structure Page
 
 Scenario: The user is able to navigate to Arrays in Python page
 Given: The user is on the Array page after logged in
 When The user clicks Arrays in Python button
 Then The user should be redirected to Arrays in Python page 
 
 Scenario: The user is able to navigate to a page having an tryEditor from Arrays in Python page
 Given: The user is on the Arrays in Python page after logged in
 When The user clicks Try Here button
 Then The user should be redirected to a page having an tryEditor with a Run button to test
 
 Scenario Outline: The user is able run code in tryEditor for Arrays in Python page
 Given: The user is in a page having an tryEditor with a Run button to test
 When The user enter a valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
 And The user clicks on run button
 Then The user should be presented with Run result

  Examples: 
      | Sheetname            | RowNumber |
      | ArraypythonCode |         0 |
 


Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Arrays in Python page
Given: The user is in a page having an tryEditor with a Run button to test
When The user enter a python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
And The user clicks on run button
Then The user should be presented with error message

 Examples: 
      | Sheetname  			| RowNumber |
      | ArraypythonCode |         1 |
      
Scenario: The user is able to navigate to Arrays Using List page
Given: The user is on the Array page after logged in
When The user clicks Arrays Using List link
Then The user should be redirected to Arrays Using List page


Scenario: The user is able to navigate to a page having an tryEditor from Arrays Using List page
Given: The user is on the Arrays Using List after logged in
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test

Scenario Outline: The user is able run code in tryEditor for Arrays Using List page
Given: The user is in a page having an tryEditor with a Run button to test
When The user enter valid python code in tryEditor from the sheet "<Sheetname>" and <RowNumber>
And The user clicks on run button
Then The user should be presented with Run result

 Examples: 
      | Sheetname  					| RowNumber |
      | ArrayListpythonCode |         0 |

Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Arrays Using List page
Given: The user is in a page having an tryEditor with a Run button to test
When The user enters a python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
And The user clicks on run button
Then The user should be presented with error message

 Examples: 
      | Sheetname           | RowNumber |
      | ArrayListpythonCode |         1 |

Scenario: The user is able to navigate to Basic Operations in Lists page
Given: The user is on the Array page after logged in
When The user clicks Basic Operations in Lists link
Then The user should be redirected to Basic Operations in Lists page
      
Scenario: The user is able to navigate to a page having an tryEditor from Basic Operations in Lists page
Given: The user is on the Basic Operations in Lists after logged in
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test

Scenario Outline: The user is able run code in tryEditor for Basic Operations in Lists page
Given: The user is in a page having an tryEditor with a Run button to test
When The user enter the valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And The user clicks on run button
Then The user should be presented with Run result
 Examples: 
      | Sheetname    | RowNumber |
      | BOpythonCode |         0 |

Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Basic Operations in Lists page
Given: The user is in a page having an tryEditor with a Run button to test
When The user enter the python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
And The user clicks on run button
Then The user should be presented with error message
 Examples: 
      | Sheetname  	 | RowNumber |
      | BOpythonCode |         1 |

Scenario: The user is able to navigate to Applications of Array page
Given: The user is on the Array page after logged in
When The user clicks Applications of Array link
Then The user should be redirected to Applications of Array page

Scenario: The user is able to navigate to a page having an tryEditor from Applications of Array page
Given: The user is on the Applications of Array after logged in
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test

Scenario Outline: The user is able run code in tryEditor for Applications of Array page
Given: The user is in a page having an tryEditor with a Run button to test
When The user enters valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And The user clicks on run button
Then The user should be presented with Run result
 Examples: 
      | Sheetname  				 | RowNumber |
      | AppArraypythonCode |         0 |

Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Applications of Array page
Given: The user is in a page having an tryEditor with a Run button to test
When The user enters python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
And The user clicks on run button
Then The user should be presented with error message
 Examples: 
      | Sheetname          | RowNumber |
      | AppArraypythonCode |         1 |

Scenario: The user is able to navigate to Practice page
Given: The user is on the Arrays in Python after logged in
When The user clicks Practice Questions link
Then The user should be redirected to Practice page

Scenario: The user is able to navigate to Question page from Search the array link
Given: The user is on the Practice page after logged in
When The user clicks the Search the array link
Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons

Scenario Outline: The user is able to run code in tryEditor for Search the array link
Given: The user is on Question page of Search the array after logged in
When The user enter valid search array python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
And The user clicks on run button on the question page
Then The user should be presented with Run result
 Examples: 
      | Sheetname    | RowNumber |
      | QPpythonCode |         0 |

Scenario Outline: The user is able to submit code in tryEditor for Search the array link
Given: The user is on Question page of Search the array after logged in
When The user enters a valid search array python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
And The user clicks on Submit button
Then The user should be presented with successful submission message
Examples: 
      | Sheetname    | RowNumber |
      | QPpythonCode |         1 |

Scenario Outline:  The user is presented with error message for code with invalid syntax in tryEditor for Search the array link
Given: The user is on Question page of Search the array after logged in
When The user enter invalid search array python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
And The user clicks on run button on the question page
Then The user should be presented with error message in the question page

 Examples: 
      | Sheetname  | RowNumber |
      | QPpythonCode |         2 |

Scenario: The user is able to navigate to Question page from Max Consecutive Ones
Given: The user is on the Practice page after logged in
When The user clicks the Max Consecutive Ones link
Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons

Scenario Outline: The user is able to run code in tryEditor for Max Consecutive Ones
Given: The user is on Question page of Max Consecutive Ones after logged in
When The user enter valid Max Consecutive python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
And The user clicks on run button on the question page
Then The user should be presented with Run result
Examples: 
      | Sheetname     | RowNumber |
      | QPpythonCode |         3 |

Scenario Outline: The user is able to submit code in tryEditor for Max Consecutive Ones
Given: The user is on Question page of Max Consecutive Ones after logged in
When The user enters a valid Max Consecutive python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
And The user clicks on Submit button
Then The user should be presented with successful submission message
Examples: 
      | Sheetname  | RowNumber |
      | QPpythonCode |         4 |

Scenario Outline: The user is presented with error message for invalid code in tryEditor for Max Consecutive Ones
Given: The user is on Question page of Max Consecutive Ones after logged in
When The user enter python code with invalid Max Consecutive syntax in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
And The user clicks on run button on the question page
Then The user should be presented with error message in the question page
Examples: 
      | Sheetname  | RowNumber |
      | QPpythonCode |         5 |

Scenario: The user is able to navigate to Question page from Find Numbers with Even Number of Digits
Given: The user is on the Practice page after logged in
When The user clicks the Find Numbers with Even Number of Digits link
Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons

Scenario Outline: The user is able to run code in tryEditor for Find Numbers with Even Number of Digits
Given: The user is on Question page of Find Numbers with Even Number of Digits after logged in
When The user enter valid python Find Numbers with Even Number of Digits code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
And The user clicks on run button on the question page
Then The user should be presented with Run result
Examples: 
      | Sheetname  | RowNumber |
      | QPpythonCode |         6 |

Scenario Outline: The user is able to submit code in tryEditor for Find Numbers with Even Number of Digits
Given: The user is on Question page of Find Numbers with Even Number of Digits after logged in
When The user enters a valid Find Numbers with Even Number of Digits python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
And The user clicks on Submit button
Then The user should be presented with successful submission message

Examples: 
      | Sheetname  | RowNumber |
      | QPpythonCode |         7 |

Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Find Numbers with Even Number of Digits
Given: The user is on Question page of Find Numbers with Even Number of Digits after logged in
When The user enter python code with invalid Find Numbers with Even Number of Digits syntax in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
And The user clicks on run button on the question page
Then The user should be presented with error message in the question page
Examples: 
      | Sheetname  | RowNumber |
      | QPpythonCode |         8 |

Scenario: The user is able to navigate to Question page from Squares of a Sorted Array
Given: The user is on the Practice page after logged in
When The user clicks the Squares of a Sorted Array link
Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons

Scenario Outline: The user is able to run code in tryEditor for Squares of a Sorted Array
Given: The user is on Question page of Squares of a Sorted Array after logged in
When The user enter valid Squares of a Sorted Array python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
And The user clicks on run button on the question page
Then The user should be presented with Run result
 Examples: 
      | Sheetname  | RowNumber |
      | QPpythonCode |         9 |

Scenario Outline: The user is able to submit code in tryEditor for Squares of a Sorted Array
Given: The user is on Question page of Squares of a Sorted Array after logged in
When The user enters a valid Squares of a Sorted Array python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
And The user clicks on Submit button
Then The user should be presented with successful submission message
 Examples: 
      | Sheetname  | RowNumber |
      | QPpythonCode |         10 |

Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Squares of a Sorted Array
Given: The user is on Question page of Squares of a Sorted Array after logged in
When The user enter invalid Squares of a Sorted Array python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
And The user clicks on run button on the question page
Then The user should be presented with error message in the question page
And The user logs out successfully

 Examples: 
      | Sheetname  | RowNumber |
      | QPpythonCode |         11 |


      
      




      
      

 
 
 