@nams128
Feature:NAMS-128: Manage Level 1 Risks
@test1710 @reg
  Scenario Outline: NAMS-128: Manage Level 1 Risks
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
    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|