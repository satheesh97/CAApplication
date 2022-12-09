@nams58 @reg @sp2
Feature: NAMS-58: Audit Exceptions Tab

  @test3110221
  Scenario Outline: NAMS-58: Audit Exceptions Tab
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Audits"
    And Click the button "Create Audit"
    And I fill the Audit form
    Then Click the button "Submit" and Wait
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Issues"
    And I validate the Issue page
    And I capture the "issues"

    Examples:
      |Username|Password|
      |AA_test1 |password@1|