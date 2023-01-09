@sp9 @nams376 @reg
Feature: NAMS-376: Remove Control (Basic Functionality)
  @test37601
  Scenario Outline: NAMS-376: Remove Control (Basic Functionality)
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
    Then I click menu Button "Operating Effectiveness Testing"
    Then Click the button "Manage OET" and Wait
    And I fill the OET form
    Then Click the button "Manage OET" and Wait
    And I fill the conclusion of DET or OET
    Then I click menu Button "Summary"
    Then Click the button "Update Control" and Wait
    Then I fill the Control in "Summary"
    Examples:
      |Username|Password|
      |AA_test1 |password@1|

  @test37602
  Scenario Outline: NAMS-376: Remove Control (Basic Functionality) DET Accept
    Given I Enter the "<Username>" and "<Password>"
    Given  wait for "2" seconds
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name under the "My Task"
    And I Select the Type "Review DET" And "Accept"
    Then I click submenu "My Audits"
    And I Search the Name under the "My Task"
    And I Select the Type "Review OT" And "Accept"
    Then I click submenu "My Audits"
    And I Search the Name under the "My Task"
    And I Select the Type "Review OET" And "Accept"

    Examples:
      |Username|Password|
      |satheesh.kaliappan|Satheesh2|
@test36703
  Scenario Outline:NAMS-12: Create/Edit Issue Deactivate DET/OET/OT
    Given I Enter the "<Username>" and "<Password>"
    And I  click the menu "Home"
    Then I click submenu "My Audits"
    And I Search the Name
    And I Move to "Audit Program"
    And I move to "Deactivate OET&DET" Page
    Then I click menu Button "Summary"
    Then Click the button "Remove Control" and Wait
    And I fill the deactivate form
    Then button click for "Remove"
   Then Click the button "Confirm" and Wait
    Examples:
      |Username|Password|
      |AA_test1 |password@1|


