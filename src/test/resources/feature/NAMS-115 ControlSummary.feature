@nams115
Feature: NAMS-115 Control Summary
  @test5 @reg
  Scenario Outline: NAMS-115 Control Summary
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Audits"
    And Click the button "Create Audit"
    And I fill the Audit form
    Then Click the button "Submit" and Wait
    Given  wait for "4" seconds
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I take Evidence of the "Audit Program" tap
    And I validate the "Audit Program"
    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|