Feature: Desktop Page test
  As user i want to navigate to different tab on home page

  @Sanity @Regression
  Scenario: User Should Navigate To Computer Page Successfully
    Given I am on homepage
    When I click on Computer Tab
    Then I should navigate to computer page successfully

  @Sanity @Smoke @Regression
  Scenario: User Should Navigate To Electronics Page Successfully
    Given I am on homepage
    When I click on Electronic page
    Then I should navigate to Electronic page successfully

  @Smoke @Regression
  Scenario: User Should Navigate To Apparel Page Successfull
    Given I am on homepage
    When I click on Apparel page
    Then I should navigate to Apparel page successfully

  @Smoke @Regression
  Scenario: User Should Navigate To Digital Downloads Page Successfull
    Given I am on homepage
    When I click on Digital Downloads Page
    Then I should navigate to Digital download page successfully

  @Regression
  Scenario: User Should Navigate To Books Page Successfully
    Given I am on homepage
    When I click on Books Page
    Then I should navigate to Books page successfully

  @Regression
  Scenario: User Should Navigate To Jewelry Page Successfully
    Given I am on homepage
    When I click on Jewelry page
    Then I should navigate to Jewelry page successfully

  @Regression
  Scenario: User Should Navigate To Gift Cards Page Successfull
    Given I am on homepage
    When I click on Gifts cards
    Then I should navigate to Gift Cards successfully
