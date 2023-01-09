@nams129
Feature: NAMS-129: Manage Level 2 Risks
  @test1710 @reg @sp1
  Scenario Outline: NAMS-129: Manage Level 2 Risks
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Audits"
    And Click the button "Create Audit"
    And I fill the Audit form
    Then Click the button "Submit" and Wait
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Risks and Controls"
    And file the Risk level "2.5"
    Then Click the button "Save" and Wait
    And I file the Level two of risk
    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh2|
