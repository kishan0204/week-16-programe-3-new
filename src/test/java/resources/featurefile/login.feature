Feature: Login Test
  As user I want to login into nop commerce website

  @Sanity @Regression
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully

  @Smoke @Sanity @Regression
  Scenario: User should login successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "london1@gmail.com"
    And I enter password "london1"
    And I click on login button
    Then I should login successfully

  @Regression
  Scenario Outline: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    Then I should see the error message "<errorMessage>"
    Examples:
      | email               | password    | errorMessage                                                                                |
      | london007@gmail.com | london007   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |



