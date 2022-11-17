 @nams11
Feature: NAMS-11: Create Level 3 risk

  @18101 @reg @sp2
  Scenario Outline: NAMS-11: Create Level 3 risk
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
    And I file the Level three of risk
    And I  fill  the OT Form
    And I can see "Audit Program"
    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|

  @demo, @Test181022
  Scenario Outline: NAMS-11: Create Level 3 risk
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Risks and Controls" option
    And I click the Tabel Level
    And I  fill  the OT Form


    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|