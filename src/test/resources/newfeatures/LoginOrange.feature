Feature: Test login for orange application using selenium

  Scenario: Test valid login into orange site
    Given I login into orange hr service
    When I enter my "Admin" and "admin123"
    Then I am able to click on login button
	@sunny
  Scenario Outline: Test valid login into orange site
    Given I login into orange hr service
    When I enter my "<uname>" and "<pword>"
    Then I am able to click on login button

    Examples: 
      | uname | pword    |
      | Admin | admin123 |
      | admin | abs245   |
      | user  | pwd      |
