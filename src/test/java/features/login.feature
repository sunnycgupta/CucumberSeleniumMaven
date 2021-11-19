Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Sample login in to application
    Given I navigate to the application "firefox"
    When I login with username and password
      | username | sunny123|
      | password    | Pass12345$ |
    Then I click on login button
    Then I log out in the application
    
   Scenario: Sample login in to application
    Given I navigate to the application "chrome"
    When I login with username and password
      | username | sunny123|
     | password    | Pass12345$ |
    Then I click on login button
    Then I log out in the application
    

#Scenario Outline: sample login testing one for outline
 #   Given I navigate to the application
 #   When I login with <username> and <password> as
 #    Then I logged in successfully
 #   Then I log out in the application
    
  #  Examples:
  #  |username|password|
  #  |sunny123|sunny|
   #  |shibu123|shibu|