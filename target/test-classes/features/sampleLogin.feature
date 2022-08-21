Feature: Describing the login functionality
@sunny
  Scenario: User is accssing the application
  Given I am on the landing page of bank
  When I log in with username "Sunny" and password "1234"
  Then I should be logged in successfully
  And My username should be displayed "true"
  
  
  Scenario Outline: Login in to application multiple times
  Given I am on the landing page of bank
  When I log in with "<username>" and  "<password>"
  Then I should be logged in successfully
  And My username should be displayed "true"
  Examples:
  |username|password|
  |shivali|1989|
  |sunny|1988|