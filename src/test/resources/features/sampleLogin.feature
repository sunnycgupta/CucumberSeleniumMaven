Feature: Describing the login functionality

  Scenario: User is accssing the application
  Given I am on the landing page of bank
  When I log in with username "Sunny" and password "1234"
  Then I should be logged in successfully
  And My username should be displayed "true"
  
   @sunny
  Scenario Outline: Login in to application multiple times
  Given I am on the landing page of bank
  When I log in with "<username>" and  "<password>"
  Then I should be logged in successfully
  And My username should be displayed "<flag>"
  Examples:
  |username|password|flag|
  |shivali|1989|true|
  |sunny|1988|true|
  
 
  Scenario: User registration Page using list of list
  Given User navigates to registration page
  When User enters the below details
  |sunny|33|sunny@gmail.com|90909|Gurgaon|IND|
  |shivali|32|shivali@gmail.com|90908|Gurgaon|IND|
  |tom|35|tom@gmail.com|90907|London|UK|
  Then user logs out of the application
  
  
  Scenario: User registration Page using list of map
  Given User navigates to registration page
  When User enters the below details as list of map
  |name|age|email|phone|state|country|
  |sunny|33|sunny@gmail.com|90909|Gurgaon|IND|
  |shivali|32|shivali@gmail.com|90908|Gurgaon|IND|
  |tom|35|tom@gmail.com|90907|London|UK|
  Then user logs out of the application
  
 
  Scenario: User registration Page using single list
  Given User navigates to registration page
  When User enters the below details using single list
  |jeff|
  |90902|
  |44|
  |jeff@gmail.com|
  |PARIS|
  |FR|
  Then user logs out of the application
  

  Scenario: User registration Page using map
  Given User navigates to registration page
  When User enters the below details as single map
  |name|sunny|
  |age|33|
  |email|sunny@gmail.com|
  |phone|90909|
  |state|Gurgaon|
  |country|IND|  
  Then user logs out of the application