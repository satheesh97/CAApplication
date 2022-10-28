@nams131
Feature: NAMS-131: Audit Dashboard

  @test1810 @reg
  Scenario Outline: NAMS-131: Audit Dashboard
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Audits"
    And Click the button "Create Audit"
    And I fill the Audit form With "confidential"
    Then Click the button "Submit" and Wait
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Validate the Confidential Audit

    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|