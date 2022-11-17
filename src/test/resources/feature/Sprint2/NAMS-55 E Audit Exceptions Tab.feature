@nams55 @reg @sp2
Feature: NAMS-55: Audit Exceptions Tab
  @test3110221
  Scenario Outline:NAMS-55: Audit Exceptions Tab
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Audits"
    And Click the button "Create Audit"
    And I fill the Audit form
    Then Click the button "Submit" and Wait
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Exceptions"
    And I validate the Exceptions page
    And I capture the "Exceptions"

    Examples:
      |Username|Password|
      |AA_test1 |password@1|