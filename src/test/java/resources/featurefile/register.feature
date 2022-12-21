Feature: Register

  @Sanity @Regression
  Scenario: User should Navigate To Register Page Successfully
    Given I am on homepage
    When I click on register link
    Then I should navigate Register page successfully

  @Smoke @Regression
  Scenario: User Should Register Account Successfully
    Given I am on homepage
    When I click on register link
    And I click on gender tab
    And I enter first name "London"
    And I enter last name "King"
    And i enter dat of birth "1"
    And i enter month of birth "January"
    And i enter year of birth "2000"
    And i enter email id "london"
    And i enter company name "Prime"
    And i enter password "london1"
    And i re enter password "london1"
    And i click on set register button
    Then Your registration completed", "Your registration completed


