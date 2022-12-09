@nams75 @sp5 @reg
Feature: NAMS-75: Collate Audit Report Data

  @test7501
  Scenario Outline: NAMS-75: Collate Audit Report Data
    Given I Enter the "<Username>" and "<Password>"
    And  wait for "2" seconds
    And I  click the menu "Audits"
    And Click the button "Create Audit"
    And I fill the Audit form Without Key Date
    Then Click the button "Submit" and Wait
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Document & Stakeholder Comms"
    And I click "Generate Print View" on "Audit Report"
    Examples:
      |Username|Password|
      |AA_test1 |password@1|