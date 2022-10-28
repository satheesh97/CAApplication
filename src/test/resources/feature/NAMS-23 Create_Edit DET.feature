@nams23
Feature: NAMS-23: Create/Edit DET

  @Test20101 @reg
  Scenario Outline: NAMS-23: Create/Edit DET
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
    And I Create and Edit the DET or OET Form
    Then I click menu Button "Design Effectiveness Testing"
    Then Click the button "Manage DET" and Wait
    And I  fill the DET Form
    Then Click the button "Manage DET" and Wait
    And I fill the conclusion of DET or OET

    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|

  @demo, @Test201022
  Scenario Outline: NAMS-23: Create/Edit DET
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the "Testtoday202210210231" with
    And I Move to "Risks and Controls" option
    And I click the Tabel Level
    And I Create and Edit the DET or OET Form
    Then I click menu Button "Design Effectiveness Testing"
    Then Click the button "Manage DET" and Wait
    And I  fill the DET Form
    Then Click the button "Manage DET" and Wait
    And I fill the conclusion of DET or OET


    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh1|